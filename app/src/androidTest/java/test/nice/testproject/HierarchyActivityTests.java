package test.nice.testproject;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import test.nice.testproject.activities.HierarchyActivity;

import static android.support.test.espresso.assertion.ViewAssertions.selectedDescendantsMatch;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class HierarchyActivityTests extends ActivityInstrumentationTestCase2<HierarchyActivity> {
    private static String TAG = HierarchyActivityTests.class.getSimpleName();

    private HierarchyActivity mActivity;

    public HierarchyActivityTests() {
        super(HierarchyActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        mActivity = getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();

    }


    /**
     * Allow you to test the descendants of a selected view.
     */
    @SmallTest
    public void testSelectedDescendants() {
        selectedDescendantsMatch(isAssignableFrom(TextView.class), withText(getInstrumentation().getTargetContext().getResources().getString(R.string.hierarchy_text))).check(createATestView(), null);
    }

    // https://code.google.com/p/android-test-kit/source/browse/espresso/libtests/src/main/java/com/google/android/apps/common/testing/ui/espresso/assertion/ViewAssertionsTest.java?r=9f9565f2c40130574b80bc67845120a72a66a517
    public View createATestView() {
        ViewGroup parent = new RelativeLayout(getInstrumentation().getTargetContext());
        TextView tv = new TextView(getInstrumentation().getTargetContext());
        tv.setText(getInstrumentation().getTargetContext().getResources().getString(R.string.hierarchy_text));
        parent.addView(tv);
        return parent;
    }



}