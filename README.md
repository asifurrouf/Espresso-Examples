# Espresso-Examples
A reference project for all of those things you forgot how to do in Espresso!

## About
This isn't an App to use, it features a number of components that are automatically tested by the Espresso Library. The code is more helpful as a reference.


## Libraries Used
* Espresso 2.0 Core

* Espresso 2.0 Contrib

* Android Testing Library

## References

Below are a list of methods used in the examples in this repo.

### Matchers

The *onView(Matchers)* method can accept Matchers to identify a View.

* withText

* withId

* isDisplayed

* isEnabled

#### Hamcrest Matchers

* allOf(Matcher*(s)*)

* is

* not


### Actions
Actions are performed using the *perform(ViewAction)* method.

* click()

* pressBack()

* typeText(String)

### Assertions
Assertions are performed using the *check(ViewAssertion)* method.

* matches(Matcher)


## Contact me
[+JordanTerry](https://plus.google.com/+JordanTerry/posts)

[@Jordan_Terry](https://twitter.com/Jordan_Terry)
