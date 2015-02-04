# Espresso-Examples
A reference project for all of those things you forgot how to do in Espresso!

## About
This isn't an App to use, it features a number of components that are automatically tested by the Espresso Library. The code is more helpful as a reference.


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


## References

Below are a list of methods used in the examples in this repo.

### Matchers

The *onView(Matchers)* method can accept Matchers to identify a View.

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

* allOf(Matcher*(s)*)
    * [**MainActivityTests**:testSwapText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeTextWithTextAndId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**NavigationDrawerTests**:testNavigationDrawerItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)


* not(Matcher)
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

* matches(Matcher)
    * [**NavigationDrawerTests**:testNavigationDrawerItemClick()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/NavigationDrawerTests.java)
    * [**SwitchActivityTests**:testSwitchWithId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**SwitchActivityTests**:testSwitchWithChainingExample()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/SwitchActivityTests.java)
    * [**MainActivityTests**:testSwapText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeText()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)
    * [**MainActivityTests**:testTypeTextWithTextAndId()](https://github.com/jordanterry/Espresso-Examples/blob/master/app/src/androidTest/java/test/nice/testproject/MainActivityTests.java)


## Contact me
[+JordanTerry](https://plus.google.com/+JordanTerry/posts)

[@Jordan_Terry](https://twitter.com/Jordan_Terry)
