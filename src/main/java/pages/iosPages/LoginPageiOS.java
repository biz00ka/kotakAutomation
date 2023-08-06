package pages.iosPages;

import org.openqa.selenium.WebElement;
import actions.commonAppActions.CommonAppActions;
import io.appium.java_client.AppiumBy;
import utils.DriverManager;


public class LoginPageiOS {
	

	private final AppiumBy LOGINBUTTON= (AppiumBy) AppiumBy.accessibilityId("test-LOGIN");
	private final AppiumBy STANDARD_USER= (AppiumBy) AppiumBy.accessibilityId("test-standard_user");
	private final AppiumBy USER_ID_TEXTBOX= (AppiumBy) AppiumBy.accessibilityId("test-Username");
	private final AppiumBy PASSWORD_TEXTBOX= (AppiumBy) AppiumBy.accessibilityId("test-Password");
	private final AppiumBy EMPTY_USER_LABEL= (AppiumBy) AppiumBy.accessibilityId("test-Error message");
	
	
	public LoginPageiOS scrollDownLoginPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeDown(DriverManager.getDriver());

		return this;
	}
	
	public LoginPageiOS scrollUpLoginPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeUp(DriverManager.getDriver());

		return this;
	}
	
	public HomePageiOS clickLoginButton()
	{
		DriverManager.getDriver().findElement(LOGINBUTTON).click();
		return new HomePageiOS();
	}
	
	public LoginPageiOS enterUserName(String userName)
	{
			WebElement ele=DriverManager.getDriver().findElement(USER_ID_TEXTBOX);
			ele.sendKeys(userName);

		return this;
	}
	
	public LoginPageiOS enterPassword(String password)
	{

			WebElement ele=DriverManager.getDriver().findElement(PASSWORD_TEXTBOX);
			ele.sendKeys(password);
		
		return this;
	}
	
	public LoginPageiOS enterStandardUserCredsFromUI() 
	{
		DriverManager.getDriver().findElement(STANDARD_USER).click();
		
		return this;
	}
	
	public boolean emptyUserLabelPresence()
	{
		return DriverManager.getDriver().findElement(EMPTY_USER_LABEL).isDisplayed();
		
	}
	
}
