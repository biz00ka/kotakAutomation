package kotakAutomationTests.web;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import enums.BrowserType;
import utils.DriverManager;
import utils.LocalConfigFactory;

public class WebBaseTest {
	
	
	protected static WebDriver webDriver;
	private String browser_Name;
	
	@Parameters({"browserName"})
	@BeforeMethod
	public void setup(String browserName) throws MalformedURLException
	{
			browser_Name= browserName;
			webDriver=DriverManager.setup(browserName);
			DriverManager.setWebDriver(webDriver);		
			DriverManager.getWebDriver().get(LocalConfigFactory.getConfigValue().url());
	}
	
	@AfterMethod
	public void cleanUp()
	{
		DriverManager.flushDriver(browser_Name);
	}
}
