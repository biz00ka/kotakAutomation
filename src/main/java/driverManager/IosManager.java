package driverManager;

import java.net.MalformedURLException;
import java.net.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import utils.LocalConfigFactory;

public final class IosManager {
	
	private IosManager() {}
	
	public static AppiumDriver getDriver(String browser, String portNumber,String platformVersion, String deviceName) throws MalformedURLException
	{
		XCUITestOptions options = new XCUITestOptions();
		options.setDeviceName(deviceName);
		options.setCapability("platformVersion", platformVersion);
		options.setCapability("wdaStartupRetryInterval", "20000");
		options.setApp(System.getProperty("user.dir") + LocalConfigFactory.getConfigValue().iOSAppPath());
		return new IOSDriver(new URL(LocalConfigFactory.getConfigValue().localhost()+":"+portNumber), options);
	}

}
