package kotakAutomationTests.mobile;

import org.testng.annotations.Test;

import kotakAutomationTests.dataProviders.LocalDataProvider;
import pageActions.mobile.IosPageActions;
import validations.appPage.AppPageValidations;

public class IosDemoTest extends MobileBaseTest{
 
  
	@Test
	  void emptyUserCredsTest() throws InterruptedException {
		 
		  boolean flag=IosPageActions.emptyUserCredsTest();
		  AppPageValidations.validateInvalidUser(flag);
		  
	  }
	  
	  @Test(dataProvider ="userType",dataProviderClass=LocalDataProvider.class)
	  void invalidUserLoginTest(String userName, String Password){
	     
		  boolean flag=IosPageActions.invalidUserCredsTest(userName, Password);
		  AppPageValidations.validateInvalidUser(flag);
	  }
	  
	  @Test
	  void loginWithStandardUserE2E() throws InterruptedException {
		 
		  IosPageActions.swipeDownOnLoginPageiOS();
		  IosPageActions.standardUserE2EFlow();
	  }
}
