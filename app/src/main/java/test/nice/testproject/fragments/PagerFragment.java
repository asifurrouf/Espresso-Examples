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
public class PagerFragment extends Fragment {
    public static final String TAG = PagerFragment.class.getSimpleName();

    public static final String PAGER_TEXT = "PAGER_TEXT";

    private String mMessageText;

    public static PagerFragment newInstance(String messageText) {
        PagerFragment fragment = new PagerFragment();
        Bundle bundle = new Bundle();
        bundle.putString(PAGER_TEXT, messageText);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);
        if(savedInstanceState != null) {
            mMessageText = savedInstanceState.getString(PAGER_TEXT);
        } else {
            mMessageText = getArguments().getString(PAGER_TEXT);
        }
        TextView exampleText = (TextView) rootView.findViewById(R.id.example_text);
        exampleText.setText(mMessageText);
        return rootView;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putString(PAGER_TEXT, mMessageText);
        super.onSaveInstanceState(outState);
    }
}
