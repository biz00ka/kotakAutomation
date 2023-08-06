package pages.androidPages;

import org.openqa.selenium.WebElement;
import actions.commonAppActions.CommonAppActions;
import io.appium.java_client.AppiumBy;
import utils.DriverManager;


public class LoginPageAndroid {
	

	private final AppiumBy LOGINBUTTON= (AppiumBy) AppiumBy.accessibilityId("test-LOGIN");
	private final String STANDARD_USER= "//android.view.ViewGroup[@content-desc=\"test-standard_user\"]/android.widget.TextView";
	private final AppiumBy USER_ID_TEXTBOX= (AppiumBy) AppiumBy.accessibilityId("test-Username");
	private final AppiumBy PASSWORD_TEXTBOX= (AppiumBy) AppiumBy.accessibilityId("test-Password");
	private final AppiumBy EMPTY_USER_LABEL= (AppiumBy) AppiumBy.accessibilityId("test-Error message");
	
	
	public LoginPageAndroid scrollDownLoginPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeDown(DriverManager.getDriver());

		return this;
	}
	
	public LoginPageAndroid scrollUpLoginPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeUp(DriverManager.getDriver());

		return this;
	}
	
	public HomePageAndroid clickLoginButton()
	{
		DriverManager.getDriver().findElement(LOGINBUTTON).click();
		return new HomePageAndroid();
	}
	
	public LoginPageAndroid enterUserName(String userName)
	{
			WebElement ele=DriverManager.getDriver().findElement(USER_ID_TEXTBOX);
			ele.sendKeys(userName);

		return this;
	}
	
	public LoginPageAndroid enterPassword(String password)
	{

			WebElement ele=DriverManager.getDriver().findElement(PASSWORD_TEXTBOX);
			ele.sendKeys(password);
		
		return this;
	}
	
	public LoginPageAndroid enterStandardUserCredsFromUI() 
	{
		DriverManager.getDriver().findElement(AppiumBy.xpath(STANDARD_USER)).click();;
		
		return this;
	}
	
	public boolean emptyUserLabelPresence()
	{
		return DriverManager.getDriver().findElement(EMPTY_USER_LABEL).isDisplayed();
		
	}
	
}
