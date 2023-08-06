# kotakAutomation
An automation framework for website, Android app and iOS App.

## Pre-req:
* node
* Appium 2.0
* Java 11
* Android Studio
* Xcode
* Maven
* Appium Inspector
* **Chrome Binary**

## To run

Either run testNG.xml or can run `mvn clean test`

## Changes to Be made

1. Change device name and platform version in testNG.xml file to run real device/emulator for android and iOS.
2. Make changes for apk/ipk inside app folder.
3. For Chrome, since chrome version 115 onwards there need to be added chrome binary path in binary folder of test/resources.
4. Since git does not allow to add file size larger than 100 MB, I have not added it there.
5. The file can be downloaded from https://googlechromelabs.github.io/chrome-for-testing/#stable  and should be extracted and added to test/resources/binary path as <chrome-mac-x64>.
6. The path for chrome binary is set in constants.Constants class as CHROME_BINARY_PATH. Please Make changes if needed.

https://chromedriver.chromium.org/downloads  >> click on Stable.

Adding some screenshots for reference.

![](/Users/siddharth/kotakAutomation/src/test/resources/image_files/chrome binary link.png)

![](/Users/siddharth/kotakAutomation/src/test/resources/image_files/chromedriver latest release note.png)