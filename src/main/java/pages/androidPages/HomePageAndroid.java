package pages.androidPages;

import actions.commonAppActions.CommonAppActions;
import io.appium.java_client.AppiumBy;
import utils.DriverManager;

public class HomePageAndroid {
	
	
	private final String SAUCE_LABS_BACKPACK= "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]";
	
	
	public HomePageAndroid scrollDownHomePage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeDown(DriverManager.getDriver());

		return this;
	}
	
	public ProductPageAndroid addProductToCart()
	{
		DriverManager.getDriver().findElement(AppiumBy.xpath(SAUCE_LABS_BACKPACK)).click();;
		return new ProductPageAndroid();
	}
	

}
