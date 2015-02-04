# Espresso-Examples
A reference project for all of those things you forgot how to do in [Espresso](https://code.google.com/p/android-test-kit/wiki/Espresso)!

## About
This repository contains an example Android application and a number of helpful Espresso UI tests to act as a helpful reference.

## Usage

To use test execute the tests you will can execute using the gradle command: `./gradlew app:createDebugCoverageReport` or by building the tests with a test configuration in Android Studio.


## Libraries Used

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


## Usages

Below is an example of theEspresso methods that have been used so far in the example application.

### Matchers

The *onView(Matcher<View>)* method can accept Matchers to identify a View.

* withText(String)
    * [**MainActivityTests**:testSwapText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testActionMenuItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeTextWithTextAndId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithChainingExample()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**NavigationDrawerTests**:testNavigationDrawerItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)

* withId(int)
    * [**MainActivityTests**:withId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)

* isDisplayed()
    * [**MainActivityTests**:testTypeText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeTextWithTextAndId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**NavigationDrawerTests**:testNavigationDrawerItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)

#### Hamcrest Matchers

* allOf(Matcher<T> ...)
    * [**MainActivityTests**:testSwapText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeTextWithTextAndId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**NavigationDrawerTests**:testNavigationDrawerItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)


* not(Object)
    * [**SwitchActivityTests**:testSwitchWithId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithChainingExample()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)


### Actions
Actions are performed using the *perform(ViewAction)* method.

* click()
    * [**MainActivityTests**:testSwapText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testActionMenuItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**NavigationDrawerTests**:testNavigationDrawerItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)
    * [**SwitchActivityTests**:testSwitchWithId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithChainingExample()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)

* pressBack()
    * [**NavigationDrawerTests**:testNavigationDrawerBackButton()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)

* typeText(String)
    * [**MainActivityTests**:testTypeText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeTextWithTextAndId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

### Assertions
Assertions are performed using the *check(ViewAssertion)* method.

* matches(Matcher<T>)
    * [**NavigationDrawerTests**:testNavigationDrawerItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)
    * [**SwitchActivityTests**:testSwitchWithId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithChainingExample()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**MainActivityTests**:testSwapText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeTextWithTextAndId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)

## JaCoCo Coverage

I have included the [JaCoCo](http://www.eclemma.org/jacoco/) Coverage plugin to help with identifying any parts of the code that have been missed during testing. The Code Coverage can be found in the following directory structure within the module you are testing `build/outputs/reports/coverage/debug/index.html`

## Widgets

Below is a short list of the Widgets and Views that are tested in this Repository.
### Tested
* TextView

* Button

* EditText

* Overflow Menu

* App Drawer

### To be tested
* Spinner

* Progress Bar

* ViewPager

* PagerIndicator

* Date and Time Widgets

### To be demonstrated

* Idling Resources


## Contact me
[+JordanTerry](https://plus.google.com/+JordanTerry/posts)

[@Jordan_Terry](https://twitter.com/Jordan_Terry)
