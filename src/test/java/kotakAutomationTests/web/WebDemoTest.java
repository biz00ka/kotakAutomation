package kotakAutomationTests.web;

import java.net.MalformedURLException;
import org.testng.annotations.Test;
import pageActions.web.LandingPageActions;
import pageActions.web.LoginPageActions;
import utils.DriverManager;
import validations.webPage.WebPageValidations;


public class WebDemoTest extends WebBaseTest{
	
	
	
	@Test
	  void landingPageLoginButtonTest() throws MalformedURLException, InterruptedException {
		
	   LandingPageActions.clickOnLandingPageLoginButton();
	  
	  }
	
	@Test
	  void webLoginPageTest() throws MalformedURLException, InterruptedException {
		
		String baseWindowHandle=DriverManager.getWebDriver().getWindowHandle();
		
		LandingPageActions.clickOnLandingPageLoginButton();
		
	    LandingPageActions.moveToLoginPageFromLandingPage(baseWindowHandle);
	    
	    String loginpageTitle= LoginPageActions.getLoginPageTitle();
	    
	    WebPageValidations.validateTitle(loginpageTitle,"Kotak Net Banking");
	  
	  }
}
