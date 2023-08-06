package driverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import constants.Constants;

public final class ChromeManager {
	
	private ChromeManager() {}
	
	public static WebDriver getDriver(String browser)
	{
		System.setProperty("webdriver.chrome.driver", Constants.CHROME_EXE_PATH);
		ChromeOptions options = new ChromeOptions();
		options.setBinary(Constants.CHROME_BINARY_PATH);	
		return new ChromeDriver();
	}

}
