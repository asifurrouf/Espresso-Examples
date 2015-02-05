package test.nice.testproject;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import test.nice.testproject.activities.ViewPagerActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.swipeLeft;
import static android.support.test.espresso.action.ViewActions.swipeRight;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class ViewPagerFragmentTests extends ActivityInstrumentationTestCase2<ViewPagerActivity> {
    private static String TAG = ViewPagerFragmentTests.class.getSimpleName();

    public ViewPagerFragmentTests() {
        super(ViewPagerActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();

    }

    /**
     * Swipe between the first and second pages in the ViewPager.
     */
    @SmallTest
    public void testSwipeBetweenFirstAndSecondPage() {
        onView(withText("Test One")).check(matches(isDisplayed()));
        onView(withId(R.id.pager)).perform(swipeLeft());
        onView(withText("Test Two")).check(matches(isDisplayed()));
    }

    /**
     * Swipe between the first and second pages and back to the first in the ViewPager.
     */
    @SmallTest
    public void testSwipeBetweenFirstSecondAndBackToFirstPage() {
        onView(allOf(withId(R.id.example_text), withText("Test One"))).check(matches(isDisplayed()));
        onView(withId(R.id.pager)).perform(swipeLeft());
        onView(withText("Test Two")).check(matches(isDisplayed()));
        onView(withId(R.id.pager)).perform(swipeRight());
        onView(withText("Test One")).check(matches(isDisplayed()));
    }

    /**
     * Swipe to the end of a Fragment
     */
    @SmallTest
    public void testSwipeToTheEnd() {
        onView(withText("Test One")).check(matches(isDisplayed()));
        onView(withId(R.id.pager)).perform(swipeLeft()).perform(swipeLeft()).perform(swipeLeft());
        onView(withText("Test Four")).check(matches(isDisplayed()));
    }

    /**
     * Swipe to the end of a Fragment and attempt to swipe further
     */
    @SmallTest
    public void testSwipeBeyondTheEnd() {
        onView(withText("Test One")).check(matches(isDisplayed()));
        onView(withId(R.id.pager)).perform(swipeLeft()).perform(swipeLeft()).perform(swipeLeft()).perform(swipeLeft());
        onView(withText("Test Four")).check(matches(isDisplayed()));
    }
}