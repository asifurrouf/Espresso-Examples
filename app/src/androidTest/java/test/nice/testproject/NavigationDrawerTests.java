package test.nice.testproject;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import org.junit.Before;

import test.nice.testproject.activities.NavigationDrawerActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class NavigationDrawerTests extends ActivityInstrumentationTestCase2<NavigationDrawerActivity> {
    private static String TAG = NavigationDrawerTests.class.getSimpleName();

    public NavigationDrawerTests() {
        super(NavigationDrawerActivity.class);
    }

    @Override
    @Before
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    /**
     * Test that clicking on a Navigation Drawer Item will open the correct fragment.
     * Espresso: openDrawer, onView, withText, perform, click, matches, check, isDisplayed
     */
    @SmallTest
    public void testNavigationDrawerItemClick() {
        openDrawer(R.id.my_drawer_layout);
        onView(withText("Menu One")).perform(click());
        onView(allOf(withId(R.id.exampleFragmentText), withText("Menu One"))).check(matches(isDisplayed()));
    }

    /**
     * Test opening the Navigation Drawer and pressing the back button.
     * Espresso: openDrawer, pressBack
     */
    @SmallTest
    public void testNavigationDrawerBackButton() {
        openDrawer(R.id.my_drawer_layout);
        pressBack();
    }
}