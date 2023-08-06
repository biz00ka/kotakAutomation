package pages.iosPages;

import actions.commonAppActions.CommonAppActions;
import io.appium.java_client.AppiumBy;
import utils.DriverManager;

public class HomePageiOS {
	

	private final String SAUCE_LABS_BACKPACK= "(//XCUIElementTypeStaticText[@name=\"test-Item title\"])[1]";
	
	
	public HomePageiOS scrollDownHomePage() throws InterruptedException 
	{	

			CommonAppActions.insertSmallTimeout();
			CommonAppActions.swipeDown(DriverManager.getDriver());

		return this;
	}
	
	public ProductPageiOS addProductToCart()
	{
		DriverManager.getDriver().findElement(AppiumBy.xpath(SAUCE_LABS_BACKPACK)).click();;
		return new ProductPageiOS();
	}
	

}
