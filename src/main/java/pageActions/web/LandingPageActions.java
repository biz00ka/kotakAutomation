package pageActions.web;

import pages.webPages.LandingPage;
import utils.DriverManager;

public class LandingPageActions {
	
	public static void clickOnLandingPageLoginButton() throws InterruptedException
	{
		LandingPage landingPage= new LandingPage();
	    
	    landingPage.verifylandingPage()
	    	.clickLoginButton();
	}
	
	public static void moveToLoginPageFromLandingPage(String windowHandle)
	{
		for(String handle :DriverManager.getWebDriver().getWindowHandles())
	    {
	    	if(!handle.equals(windowHandle))
	    		DriverManager.getWebDriver().switchTo().window(handle);
	    }
	}

}
