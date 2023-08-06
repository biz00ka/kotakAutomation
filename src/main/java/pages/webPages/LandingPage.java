package pages.webPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import actions.commonWebPageActions.CommonActions;
import utils.DriverManager;
import utils.LocalConfigFactory;

public class LandingPage {
	
	private static final By LOGINBUTTON= By.className("des-login-txt");
	
	private static final By KOTAKLOGO=By.xpath("//img[@title='Kotak Mahindra Bank']");
	
	
	public WebLoginPage clickLoginButton() throws InterruptedException
	{
		CommonActions.click(LOGINBUTTON);
		return new WebLoginPage();
	}
	
	public LandingPage verifylandingPage()
	{
		CommonActions.waitForElementPresent(LocalConfigFactory.getConfigValue().timeout(), KOTAKLOGO);;
		return this;
		
	}
	
	


}
