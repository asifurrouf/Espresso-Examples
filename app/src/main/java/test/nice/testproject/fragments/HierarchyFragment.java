package test.nice.testproject.fragments;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.nice.testproject.R;

/**
 * Created by jordan_terry on 03/02/2015.
 */
public class HierarchyFragment extends Fragment {

    public static HierarchyFragment newInstance() {
        HierarchyFragment fragment = new HierarchyFragment();
        Bundle bundle = new Bundle();
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_hierarchy, container, false);
    }
}
