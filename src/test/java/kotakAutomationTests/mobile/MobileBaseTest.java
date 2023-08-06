package kotakAutomationTests.mobile;

import java.net.MalformedURLException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import io.appium.java_client.AppiumDriver;
import utils.DriverManager;

public class MobileBaseTest {
	
	protected static AppiumDriver appiumDriver; 
	private String browser_Name;
	
	
	@Parameters({"browserName","deviceName","platformVersion","portNumber"})
	@BeforeMethod
	public void setup(String browserName, String deviceName,String platformVersion, String portNumber) throws MalformedURLException
	{
			browser_Name= browserName;
			appiumDriver=DriverManager.setup(browserName,portNumber,platformVersion,deviceName);
			DriverManager.setDriver(appiumDriver);
		
	}
	
	@AfterMethod
	public void cleanUp()
	{
		DriverManager.flushDriver(browser_Name);
	}
}
