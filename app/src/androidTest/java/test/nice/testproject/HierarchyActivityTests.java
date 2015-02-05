package test.nice.testproject;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import test.nice.testproject.activities.HierarchyActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.LayoutAssertions.noEllipsizedText;
import static android.support.test.espresso.assertion.LayoutAssertions.noMultilineButtons;
import static android.support.test.espresso.assertion.LayoutAssertions.noOverlaps;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.assertion.ViewAssertions.selectedDescendantsMatch;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.hasSibling;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withChild;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

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
     * Test the descendants of a selected view.
     */
    @SmallTest
    public void testSelectedDescendants() {
        selectedDescendantsMatch(isAssignableFrom(TextView.class), withText(getInstrumentation().getTargetContext().getResources().getString(R.string.hierarchy_text))).check(createATestView(), null);
    }

    /**
     * Test that there are no ellipsized texts.
     */
    @SmallTest
    public void testNoEllipsizedText() {
       onView(withId(R.id.hierarchy_parent)).check(noEllipsizedText());
    }

    /**
     * Test that there are no multiline buttons.
     */
    @SmallTest
    public void testNoMultilineButtons() {
        onView(withId(R.id.hierarchy_parent)).check(noMultilineButtons());
    }

    /**
     * Test the descendants of a selected view.
     */
    @SmallTest
    public void testNoOverlap() {
        onView(withId(R.id.hierarchy_parent)).check(noOverlaps());
    }

    /**
     * Test selecting a parent from two similar views.
     */
    @SmallTest
    public void testWithParent() {
        String contentDescription = getInstrumentation().getTargetContext().getResources().getString(R.string.hierarchy_text);
        onView(allOf(withContentDescription(contentDescription), withParent(allOf(withId(R.id.hierarchy_parent_two))))).check(matches(isDisplayed()));
    }

    /**
     * Test selecting a parent with child views that match
     */
    @SmallTest
    public void testWithChild() {
        onView(allOf(withId(R.id.hierarchy_parent_two), withChild(withId(R.id.hierarchy_text_three)))).check(matches(isDisplayed()));
    }
    /**
     * Test selecting a parent with a descendant that matches
     */
    @SmallTest
    public void testHasDescendant() {
        onView(allOf(withId(R.id.hierarchy_parent_two), hasDescendant(withId(R.id.hierarchy_text_three)))).check(matches(isDisplayed()));
    }
    /**
     * Test selecting a view that is the descendant of another view.
     */
    @SmallTest
    public void testIsDescendantOfA() {
        onView(allOf(withId(R.id.hierarchy_text_three), isDescendantOfA(withId(R.id.hierarchy_parent_two)))).check(matches(isDisplayed()));
    }

    /**
     * Test selecting a view with a matching sibling.
     */
    @SmallTest
    public void testHasSibling() {
        onView(allOf(withId(R.id.hierarchy_text_three), hasSibling(withId(R.id.hierarchy_text_four)))).check(matches(isDisplayed()));
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