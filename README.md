# Mobile Application Automation on Hishabee Retail App with Selenium TestNG and Appium

## What is Automation?

Automation is the process of using software tools and scripts to perform tasks that would typically be done manually by a human. In the context of software testing, automation involves using tools to execute test cases and compare the actual results with the expected results automatically.

## Why We Use Selenium TestNG for Automation?

Selenium is a popular open-source testing tool widely used for automating web browsers. It allows developers and testers to automate web-based applications' testing across multiple browsers and platforms. Selenium provides a set of APIs to interact with web elements and manipulate their properties and behaviors, making it an ideal tool for automating UI tests.

TestNG is a testing framework for Java that is designed to be more flexible and powerful than JUnit. It supports a wide range of testing functionalities, including unit, integration, and end-to-end testing, as well as parallel execution, data-driven testing, and reporting. TestNG is often used with Selenium to create robust and scalable test automation frameworks.

## Technology Used:
- Selenium WebDriver
- TestNG Framework (7.10.2)
- Java (17)
- Gradle (8.4)
- IntelliJ IDEA
- Allure
- Appium (2.10.3)

## How to Run This Project

- Clone this project
- Open Android Studio and Open the APK file:
- Set required configuration
- Hit this command in cmd for checking the connectivity with emulator : ``adb devices``
- Open Appium Server with following command: ```appium -p 4723```
- Open Appium Inspector
- Set desired capability in json format:
``` 
{
  "appium:platformName": "Android",
  "appium:platformVersion": "10",
  "appium:deviceName": "Xiaomi M2006C3MI",
  "appium:appPackage": "com.hishabee.business",
  "appium:appActivity": "com.hishabee.business.SplashScreen.SplashScreen",
  "appium:app": "C:\\SQA\\APK\\dokan-release.apk",
  "appium:automationName": "UIAutomator2"
}
```
- Open Intellij Idea
- Hit the following command into the terminal:
```gradle clean test```

## Project scenario:

- The user will log in using a valid phone number and PIN

- Then store will be selected to open all features

## Prerequisites:

- Install Android Studio latest version
- Install Appium Inspector
- Install jdk 8 or any LTS version
- Configure ANDROID_HOME, JAVA_HOME and GRADLE_HOME

## Generate and serve the Allure report:
- Generate the report:
  ```
  allure generate allure-results --clean -o allure-report
  ```
- Serve the report:
  ```
  allure serve allure-results
  ```
