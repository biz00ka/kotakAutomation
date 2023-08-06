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

If, Appium service is unable to launch Appium server, 
Refer utils/DriverManger.class to comment the lines and manually start the appium with command 
`appium -p <portNumber>`.

## Changes to Be made

1. Change device name and platform version in testNG.xml file to run real device/emulator for android and iOS.
2. Make changes for apk/ipk inside app folder.
3. For Chrome, since chrome version 115 onwards there need to be added chrome binary path in binary folder of test/resources.
4. Since git does not allow to add file size larger than 100 MB, I have not added it there.
5. The file can be downloaded from https://googlechromelabs.github.io/chrome-for-testing/#stable  and should be extracted and added to test/resources/binary path as <chrome-mac-x64>.
6. The path for chrome binary is set in constants.Constants class as CHROME_BINARY_PATH. Please Make changes if needed.

https://chromedriver.chromium.org/downloads  >> click on Stable.

Adding some screenshots for reference.


<img width="1437" alt="chrome binary link" src="https://github.com/biz00ka/kotakAutomation/assets/35526173/7f900d21-31fd-49a6-9d3b-30265d5bb728">


<img width="1425" alt="chromedriver latest release note" src="https://github.com/biz00ka/kotakAutomation/assets/35526173/40347100-6d32-4004-b497-8ce19b6df42a">
