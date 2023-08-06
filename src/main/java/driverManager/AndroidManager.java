package driverManager;

import java.net.MalformedURLException;
import java.net.URL;

import enums.BrowserType;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import utils.LocalConfigFactory;

public final class AndroidManager {
	
	
	private AndroidManager() {}
	
	public static AppiumDriver getDriver(String browser, String portNumber, String deviceName) throws MalformedURLException
	{
		UiAutomator2Options options = new UiAutomator2Options();
		options.setPlatformName(BrowserType.Android.name()); //optional
		options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);//optional
		options.setDeviceName(deviceName);
		options.setCapability(UiAutomator2Options.APP_PACKAGE_OPTION, LocalConfigFactory.getConfigValue().appPackage());
		options.setCapability(UiAutomator2Options.APP_ACTIVITY_OPTION, LocalConfigFactory.getConfigValue().appActivity());
		options.setApp(System.getProperty("user.dir") + LocalConfigFactory.getConfigValue().androidAppPath());
		options.setCapability("autoGrantPermissions", "true");
		System.out.println("testtt >>"+LocalConfigFactory.getConfigValue().localhost()+":"+portNumber);
		return new AndroidDriver(new URL(LocalConfigFactory.getConfigValue().localhost()+":"+portNumber), options);
	}

}
