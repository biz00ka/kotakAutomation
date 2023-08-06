package pageActions.mobile;

import pages.iosPages.LoginPageiOS;

public class IosPageActions {
	
	
	public static void swipeDownOnLoginPageiOS() throws InterruptedException {
		

			LoginPageiOS LoginPageiOS= new LoginPageiOS();
			LoginPageiOS.scrollDownLoginPage();
	
	}
	
	public static void standardUserE2EFlow() throws InterruptedException {
		

			LoginPageiOS LoginPageiOS= new LoginPageiOS();
			LoginPageiOS.enterStandardUserCredsFromUI()
				.scrollDownLoginPage()
				.clickLoginButton()
				.addProductToCart()
				.scrollDownProductPage()
				.clickAddToCart()
				.scrollUpProductPage()
				.clickCartIcon();
			// further code to be implemented for checkout.
	}
	
	public static void loginToApplication(String userId, String Password) {
		

			LoginPageiOS LoginPageiOS= new LoginPageiOS();
			LoginPageiOS.enterUserName(userId)
				.enterPassword(Password)
				.clickLoginButton();

	}
	
	public static boolean emptyUserCredsTest()
	{
		LoginPageiOS LoginPageiOS= new LoginPageiOS();
		LoginPageiOS.clickLoginButton();
		return LoginPageiOS.emptyUserLabelPresence();
		
	}
	
	public static boolean invalidUserCredsTest(String userId, String Password)
	{
		LoginPageiOS LoginPageiOS= new LoginPageiOS();
		LoginPageiOS.enterUserName(userId)
			.enterPassword(Password)
			.clickLoginButton();
		return LoginPageiOS.emptyUserLabelPresence();
		
	}

}
