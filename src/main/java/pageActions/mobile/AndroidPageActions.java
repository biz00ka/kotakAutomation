package pageActions.mobile;


import pages.androidPages.LoginPageAndroid;
import pages.iosPages.LoginPageiOS;

public class AndroidPageActions {
	
	
	public static void swipeDownOnLoginPage() throws InterruptedException {
		

			LoginPageAndroid loginPage= new LoginPageAndroid();
			loginPage.scrollDownLoginPage();
	
	}
	
	public static void standardUserE2EFlow() throws InterruptedException {
		

			LoginPageAndroid loginPage= new LoginPageAndroid();
			loginPage.enterStandardUserCredsFromUI()
				.scrollUpLoginPage()
				.clickLoginButton()
				.addProductToCart()
				.scrollDownProductPage()
				.clickAddToCart()
				.clickCartIcon();
			// further code to be implemented for checkout.
	}
	
	public static void loginToApplication(String userId, String Password) {
		

			LoginPageAndroid loginPage= new LoginPageAndroid();
			loginPage.enterUserName(userId)
				.enterPassword(Password)
				.clickLoginButton();

	}
	
	public static boolean emptyUserCredsTest()
	{
		LoginPageAndroid loginPage= new LoginPageAndroid();
		loginPage.clickLoginButton();
		return loginPage.emptyUserLabelPresence();
		
	}
	
	public static boolean invalidUserCredsTest(String userId, String Password)
	{
		LoginPageAndroid loginPage= new LoginPageAndroid();
		loginPage.enterUserName(userId)
			.enterPassword(Password)
			.clickLoginButton();
		return loginPage.emptyUserLabelPresence();
		
	}

}
