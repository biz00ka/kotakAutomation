package utils;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.ServerSocket;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import constants.Constants;
import driverManager.AndroidManager;
import driverManager.ChromeManager;
import driverManager.IosManager;
import enums.BrowserType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DriverManager {

	private static ThreadLocal<AppiumDriver> threadLocal= new ThreadLocal();
	private static ThreadLocal<WebDriver> threadLocalWeb= new ThreadLocal();

	private static AppiumDriver driver;
	private static WebDriver webDriver;

	public static WebDriver getWebDriver()
	{
		return threadLocalWeb.get();
	}

	public static void setWebDriver(WebDriver driver)
	{

		threadLocalWeb.set(driver);
	}

	public static AppiumDriver getDriver()
	{
		return threadLocal.get();
	}

	public static void setDriver(AppiumDriver driver)
	{

		threadLocal.set(driver);
	}

	public static AppiumDriver setup(String browser, String portNumber, String deviceName) throws MalformedURLException
	{
		if(browser.equalsIgnoreCase(BrowserType.Android.name())) {
			// Below two lines of code to be commented if Appium service is unable to launch Appium server.
			if(!AppiumServerUtils.ifServerIsRunnning(Integer.parseInt(portNumber)))
				AppiumServerUtils.startAppiumService(portNumber);
			// Above two lines of code to be commented if Appium service is unable to launch Appium server.
			
			driver =AndroidManager.getDriver(browser, portNumber, deviceName);
		}
		else if(browser.equalsIgnoreCase(BrowserType.iOS.name()))
		{
			// Below two lines of code to be commented if Appium service is unable to launch Appium server.
			if(!AppiumServerUtils.ifServerIsRunnning(Integer.parseInt(portNumber)))
				AppiumServerUtils.startAppiumService(portNumber);
			// Above two lines of code to be commented if Appium service is unable to launch Appium server.
						
			driver= IosManager.getDriver(browser, portNumber, deviceName);
		}

		return driver;
	}

	public static WebDriver setup(String browser) throws MalformedURLException
	{
		if(browser.equalsIgnoreCase(BrowserType.Chrome.name()))
			webDriver= ChromeManager.getDriver(browser);
		else if(browser.equalsIgnoreCase(BrowserType.FireFox.name()))
		{
			// to be added.
		}
		return webDriver;
	}

	public static void flushDriver(String browser)
	{
		if(browser.equalsIgnoreCase(BrowserType.Chrome.name()))
			getWebDriver().quit();
		else
			getDriver().quit();
	}

	


}
