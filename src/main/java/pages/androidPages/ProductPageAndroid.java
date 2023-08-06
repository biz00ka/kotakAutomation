package pages.androidPages;

import actions.commonAppActions.CommonAppActions;
import io.appium.java_client.AppiumBy;
import utils.DriverManager;

public class ProductPageAndroid {
	
	
	private final AppiumBy ADD_TO_CART= (AppiumBy) AppiumBy.accessibilityId("test-ADD TO CART");
	private final String CART_ICON= "//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView";
	
	
	public ProductPageAndroid scrollDownProductPage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeDown(DriverManager.getDriver());

		return this;
	}
	
	public ProductPageAndroid clickAddToCart()
	{
		DriverManager.getDriver().findElement(ADD_TO_CART).click();
		return this;
	}
	
	public CartPageAndroid clickCartIcon()
	{
		DriverManager.getDriver().findElement(AppiumBy.xpath(CART_ICON)).click();;
		return new CartPageAndroid();
	}
	
	

}
