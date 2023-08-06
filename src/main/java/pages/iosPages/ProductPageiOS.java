package pages.iosPages;

import actions.commonAppActions.CommonAppActions;
import io.appium.java_client.AppiumBy;
import utils.DriverManager;

public class ProductPageiOS {
	
	
	private final AppiumBy ADD_TO_CART= (AppiumBy) AppiumBy.accessibilityId("test-ADD TO CART");
	private final String CART_ICON= "//XCUIElementTypeOther[@name=\"test-Cart\"]/XCUIElementTypeOther";
	
	
	public ProductPageiOS scrollDownProductPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeDown(DriverManager.getDriver());

		return this;
	}
	
	public ProductPageiOS scrollUpProductPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeUp(DriverManager.getDriver());

		return this;
	}
	
	public ProductPageiOS clickAddToCart()
	{
		DriverManager.getDriver().findElement(ADD_TO_CART).click();
		return this;
	}
	
	public CartPageiOS clickCartIcon()
	{
		DriverManager.getDriver().findElement(AppiumBy.xpath(CART_ICON)).click();;
		return new CartPageiOS();
	}
	
	

}
