package test.nice.testproject;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import test.nice.testproject.activities.PositionActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.PositionAssertions.isAbove;
import static android.support.test.espresso.assertion.PositionAssertions.isBelow;
import static android.support.test.espresso.assertion.PositionAssertions.isBottomAlignedWith;
import static android.support.test.espresso.assertion.PositionAssertions.isLeftAlignedWith;
import static android.support.test.espresso.assertion.PositionAssertions.isLeftOf;
import static android.support.test.espresso.assertion.PositionAssertions.isRightAlignedWith;
import static android.support.test.espresso.assertion.PositionAssertions.isRightOf;
import static android.support.test.espresso.assertion.PositionAssertions.isTopAlignedWith;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

public class PositionActivityTests extends ActivityInstrumentationTestCase2<PositionActivity> {
    private static String TAG = PositionActivityTests.class.getSimpleName();

    private PositionActivity mActivity;

    public PositionActivityTests() {
        super(PositionActivity.class);
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
     * Is this to the left of another view.
     */
    @SmallTest
    public void testRgihtOf() {
        onView(withId(R.id.right_text)).check(isRightOf(withId(R.id.left_text)));
    }

    /**
     * Is this to the left of another view.
     */
    @SmallTest
    public void testLeftOf() {
        onView(withId(R.id.left_text)).check(isLeftOf(withId(R.id.right_text)));
    }

    /**
     * Is to the below another view.
     */
    @SmallTest
    public void testBelow() {
        onView(withId(R.id.bottom_text)).check(isBelow(withId(R.id.right_text)));
    }

    /**
     * Is to the above another view.
     */
    @SmallTest
    public void testAbove() {
        onView(withId(R.id.top_text)).check(isAbove(withId(R.id.right_text)));
    }

    /**
     * Is this to the top inside another view.
     */
    @SmallTest
    public void testAlignedTopOfView() {
        onView(withId(R.id.top_text)).check(isTopAlignedWith(withId(R.id.parent_container)));
    }

    /**
     * Is this to the left inside another view.
     * This test will fail if the view being matches against has a passing or a margin.
     */
    @SmallTest
    public void testAlignedLeftOfView() {
        onView(withId(R.id.top_text)).check(isLeftAlignedWith(withId(R.id.parent_container)));
    }

    /**
     * Is this to the right inside another view.
     * This test will fail if the view being matches against has a passing or a margin.
     */
    @SmallTest
    public void testAlignedRightOfView() {
        onView(withId(R.id.bottom_text)).check(isRightAlignedWith(withId(R.id.parent_container)));
    }


    /**
     * Is this to the bottom inside another view.
     */
    @SmallTest
    public void testAlignedBottomOfView() {
        onView(withId(R.id.bottom_text)).check(isBottomAlignedWith(withId(R.id.parent_container)));
    }


}