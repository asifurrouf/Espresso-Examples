package test.nice.testproject.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import test.nice.testproject.R;

/**
 * Created by jordan_terry on 03/02/2015.
 */
public class NavigationFragment extends Fragment {
    public static String TAG = NavigationFragment.class.getSimpleName();

    public static String ITEM_POSITION = "ITEM_POSITION";
    public static String ITEM_TEXT = "ITEM_TEXT";

    private String mItemText;
    private int mItemPosition;

    private View mRootView;

    public static NavigationFragment newInstance(int position, String textItem) {
        NavigationFragment fragment = new NavigationFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ITEM_POSITION, position);
        bundle.putString(ITEM_TEXT, textItem);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_navigation, container, false);
        if(savedInstanceState != null) {
            mItemText = savedInstanceState.getString(ITEM_TEXT);
            mItemPosition = savedInstanceState.getInt(ITEM_POSITION);
        } else {
            mItemText = getArguments().getString(ITEM_TEXT);
            mItemPosition = getArguments().getInt(ITEM_POSITION);
        }


        setUpFragment();
        return mRootView;
    }

    public void setUpFragment() {
        TextView exampleTextView = (TextView) mRootView.findViewById(R.id.exampleFragmentText);
        exampleTextView.setText(mItemText);
    }
}
