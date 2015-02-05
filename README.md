# Espresso-Examples
A reference project for all of those things you forgot how to do in [Espresso](https://code.google.com/p/android-test-kit/wiki/Espresso)!

## About
This repository contains an example Android application and a number of helpful Espresso UI tests to act as a helpful reference. The Espresso [Package Reference](https://android-test-kit.googlecode.com/git/docs/javadocs/espresso/espresso-core-2.0-javadoc/reference/android/support/test/espresso/package-summary.html) can be found here.

## How to use

To use test execute the tests you will can execute using the gradle command: `./gradlew app:createDebugCoverageReport` or by building the tests with a test configuration in Android Studio.


## Libraries used

* Android Testing Library

    ```gradle
        dependencies {
            androidTestCompile 'com.android.support.test:testing-support-lib:0.1'
        }
    ```

* Espresso 2.0 Core

    ```gradle
        dependencies {
            androidTestCompile 'com.android.support.test.espresso:espresso-core:2.0'
        }
    ```

* Espresso 2.0 Contrib

    ```gradle
        dependencies {
            androidTestCompile 'com.android.support.test.espresso:espresso-contrib:2.0'
        }
    ```

* Jacocco Code Coverage

    ```gradle
        debug {
            testCoverageEnabled true
        }
    ```


## Espresso library usage and where to find them

Below is an example of theEspresso methods that have been used so far in the example application.

### Matchers

The `onView(Matcher<View>)` method can accept Matchers to identify a View.

* `withText(String)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [SwitchActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [NavigationDrawerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)
    * [ViewPagerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/ViewPagerTests.java)

* `withId(int)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [SwitchActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [ViewPagerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/ViewPagerTests.java)

* `isDisplayed()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [NavigationDrawerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)
    * [ViewPagerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/ViewPagerTests.java)

* `isEnabled()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `isTouchable()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `isChecked()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `isNotChecked()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `isAssignableFrom(Matcher)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `withHint(int|String)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `withParent(Matcher<T>)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)

* `isDescendentOfA(Matcher<T>)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)

* `withChild(Matcher<T>)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)

* `hasSibling(Matcher<T>)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)

* `hasDescendant(Matcher<T>)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)

#### Hamcrest Matchers

* `allOf(Matcher<T> ...)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [NavigationDrawerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)

* `not(Object)`
    * [SwitchActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)

* `endsWith(String)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `startsWith(String)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)


### Actions
Actions are performed using the `perform(ViewAction)` method.

* `click()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [NavigationDrawerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)
    * [SwitchActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)

* `pressBack()`
    * [NavigationDrawerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)

* `typeText(String)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `clearText()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `replaceText(String)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `swipeLeft()`
    * [ViewPagerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/ViewPagerTests.java)

* `swipeRight()`
    * [ViewPagerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/ViewPagerTests.java)

* `swipeUp()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `swipeDown()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `closeSoftKeyboard()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `hasContentDescription()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `withContentDescription(String)`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `scrollTo()`
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

### Assertions
Assertions are performed using the `check(ViewAssertion)` method.

* `matches(Matcher<T>)`
    * [NavigationDrawerTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)
    * [SwitchActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [MainActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

* `isLeftOf(Matcher)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `isRightOf(Matcher)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `isAbove(Matcher)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `isBelow(Matcher)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `isLeftAlignedWith(Matcher)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `isRightAlignedWith(Matcher)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `isTopAlignedWith(Matcher)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `isRightAlignedWith(Matcher)`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `doesNotExist()`
    * [PositionActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/PositionActivityTests.java)

* `selectedDescendantsMatch(Matcher)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)

* `noEllipsizedText(Matcher)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)

* `selectedDescendantsMatch(Matcher)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)

* `noOverlaps(Matcher)`
    * [HierarchyActivityTests](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/HierarchyActivityTests.java)


## Widgets

Below is a short list of the Widgets and Views that are tested in this Repository.
### Tested
* TextView

* Button

* EditText

* Overflow Menu

* App Drawer

* ViewPager

### To be tested
* Spinner

* ProgressBar

* ~~ViewPager~~

* PagerTabStrip

* Date and Time Widgets

### To be demonstrated

* Idling Resources

## JaCoCo Coverage

The [JaCoCo](http://www.eclemma.org/jacoco/) Coverage plugin has been included to demonstrate coverage reporting. The Code Coverage can be found in the following directory structure within the module you are testing `build/outputs/reports/coverage/debug/index.html`



## Contact me
[+JordanTerry](https://plus.google.com/+JordanTerry/posts)

[@Jordan_Terry](https://twitter.com/Jordan_Terry)
