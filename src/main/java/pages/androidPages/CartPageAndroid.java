package pages.androidPages;

import actions.commonAppActions.CommonAppActions;
import io.appium.java_client.AppiumBy;
import utils.DriverManager;

public class CartPageAndroid {
	
	private final AppiumBy CHECKOUT_BUTTON= (AppiumBy) AppiumBy.accessibilityId("test-CHECKOUT");
	
	public CartPageAndroid scrollDownCartPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeDown(DriverManager.getDriver());

		return this;
	}
	
	public CartPageAndroid clickCheckoutButton()
	{
		DriverManager.getDriver().findElement(CHECKOUT_BUTTON).click();
		return this;
	}
	
	
	

}
