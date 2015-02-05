package test.nice.testproject.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.nice.testproject.R;
import test.nice.testproject.adapters.PagerAdapter;

/**
 * Created by jordan_terry on 03/02/2015.
 */
public class ViewPagerFragment extends Fragment {
    public static String TAG = ViewPagerFragment.class.getSimpleName();

    private View mRootView;
    private ViewPager mViewPager;
    private PagerAdapter mPagerAdapter;
    private String[] mTestData;


    public static ViewPagerFragment newInstance() {
        ViewPagerFragment fragment = new ViewPagerFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_view_pager, container, false);
        setUpFragment();
        return mRootView;
    }

    public void setUpFragment() {
        mTestData =  new String[]{"Test One", "Test Two", "Test Three", "Test Four"};
        mPagerAdapter = new PagerAdapter(getFragmentManager(), mTestData);
        mViewPager = (ViewPager) mRootView.findViewById(R.id.pager);
        mViewPager.setAdapter(mPagerAdapter);

    }
}
