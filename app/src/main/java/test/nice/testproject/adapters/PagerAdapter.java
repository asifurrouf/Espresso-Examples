package test.nice.testproject.adapters;

import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v13.app.FragmentStatePagerAdapter;

import test.nice.testproject.fragments.PagerFragment;

/**
 * Created by jordan_terry on 05/02/2015.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    public String[] mStrings;


    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public PagerAdapter(FragmentManager fm, String[] strings) {
        super(fm);
        mStrings = strings;
    }

    @Override
    public Fragment getItem(int position) {
        return new PagerFragment().newInstance(mStrings[position]);
    }

    @Override
    public int getCount() {
        return mStrings.length;
    }
}
