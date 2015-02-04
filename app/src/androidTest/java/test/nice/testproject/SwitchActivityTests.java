package test.nice.testproject;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import test.nice.testproject.activities.SwitchActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.not;

public class SwitchActivityTests extends ActivityInstrumentationTestCase2<SwitchActivity> {
    private static String TAG = SwitchActivityTests.class.getSimpleName();

    public SwitchActivityTests() {
        super(SwitchActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        super.setUp();
        getActivity();
    }

    /**
     * Click a switch using its ID.
     * Espresso onView, withId, check, matches, isChecked, perform
     */
    @SmallTest
    public void testSwitchWithId() {
        onView(withId(R.id.exampleSwitch)).check(matches(not(isChecked())));
        onView(withId(R.id.exampleSwitch)).perform(click());
        onView(withId(R.id.exampleSwitch)).check(matches(isChecked()));

    }

    /**
     * Click a switch using its label value.
     * Espresso onView, withText, check, matches, isChecked, perform, not
     */
    @SmallTest
    public void testSwitchWithText() {
        onView(withText(R.string.example_switch_label)).check(matches(not(isChecked())));
        onView(withText(R.string.example_switch_label)).perform(click());
        onView(withText(R.string.example_switch_label)).check(matches(isChecked()));
    }

    /**
     * But why do that when you can chain it?
     * A three line test can now be written in a single line.
     * Espresso onView, withText, check, matches, not, isChecked, perform, click
     */
    @SmallTest
    public void testSwitchWithChainingExample() {
        // Start with a ViewInteraction
        onView(withText(R.string.example_switch_label))
        // Chain the methods you want to call.
                .check(matches(not(isChecked())))
                .perform(click())
                .check(matches(isChecked()));
    }


}