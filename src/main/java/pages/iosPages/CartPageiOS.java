package pages.iosPages;

import actions.commonAppActions.CommonAppActions;
import io.appium.java_client.AppiumBy;
import utils.DriverManager;

public class CartPageiOS {
	
	private final AppiumBy CHECKOUT_BUTTON= (AppiumBy) AppiumBy.accessibilityId("test-CHECKOUT");
	
	public CartPageiOS scrollDownCartPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeDown(DriverManager.getDriver());

		return this;
	}
	
	public CartPageiOS clickCheckoutButton()
	{
		DriverManager.getDriver().findElement(CHECKOUT_BUTTON).click();
		return this;
	}
	
	
	

}
