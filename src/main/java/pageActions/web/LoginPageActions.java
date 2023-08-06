package pageActions.web;

import pages.webPages.WebLoginPage;

public class LoginPageActions {
	
	public static String getLoginPageTitle() throws InterruptedException
	{
		return new WebLoginPage().getTitle();
	}

}
