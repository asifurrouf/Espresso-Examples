package test.nice.testproject;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openContextualActionModeOverflowMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.not;

public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private static String TAG = MainActivityTest.class.getSimpleName();

    public MainActivityTest() {
        super(MainActivity.class);
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
     * Click a button and change the text of a TextView.
     * Espresso onView, allOf, withText, perform, click, matches, isDisplayed
     */
    @SmallTest
    public void testSwapText() {
        onView(withId(R.id.exampleButton)).perform(click());
        onView(allOf(withId(R.id.exampleText), withText(R.string.example_text_after))).check(matches(isDisplayed()));
    }

    /**
     * Click on a contextual menu item from the Overflow menu.
     * Espresso openContextualMenuItemClick, onView, withText, perform, click
     */
    @SmallTest
    public void testActionMenuItemClick() {
        openContextualActionModeOverflowMenu();
        onView(withText(R.string.action_settings)).perform(click());
    }

    /**
     * Type text and confirm that text has been typed by searching for the text
     * Espresso onView, withId, allOf, check, matches, isDisplayed, perform, typeText
     */
    @SmallTest
    public void testTypeText() {
        String exampleText = "Here is a long piece of text to type out.";
        onView(withId(R.id.exampleEditText)).perform(typeText(exampleText));
        // Example confirming this text has been succesfully typed with just the text.
        onView(withText(exampleText)).check(matches(isDisplayed()));
    }

    /**
     * Type text and confirm that text has been typed by searching for the text and the ID of the textbox.
     * Espresso onView, withId, allOf, withText, check, matches, isDisplayed, perform, typeText
     */
    @SmallTest
    public void testTypeTextWithTextAndId() {
        String exampleText = "Here is a long piece of text to type out.";
        onView(withId(R.id.exampleEditText)).perform(typeText(exampleText));
        // Example confirming this text has been succesfully typed with just the text.
        onView(allOf(withText(exampleText), withId(R.id.exampleEditText))).check(matches(isDisplayed()));
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
     * Espresso onView, withText, check, matches, isChecked, perform
     */
    @SmallTest
    public void testSwitchWithText() {
        onView(withText(R.string.example_switch_label)).check(matches(not(isChecked())));
        onView(withText(R.string.example_switch_label)).perform(click());
        onView(withText(R.string.example_switch_label)).check(matches(isChecked()));
    }

    /**
     * But why do that when you can chain it?
     */
    @SmallTest
    public void testSwitchWithTextVariableExample() {
        // Start with a ViewInteraction
        onView(withText(R.string.example_switch_label))
        // Chain the methods you want to call.
                .check(matches(not(isChecked())))
                .perform(click())
                .check(matches(isChecked()));
    }

}