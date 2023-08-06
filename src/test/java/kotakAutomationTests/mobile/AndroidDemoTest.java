package kotakAutomationTests.mobile;


import org.testng.annotations.Test;
import kotakAutomationTests.dataProviders.LocalDataProvider;
import pageActions.mobile.AndroidPageActions;
import pageActions.mobile.IosPageActions;
import validations.appPage.AppPageValidations;

public class AndroidDemoTest extends MobileBaseTest{
 
  
  @Test
  void emptyUserCredsTest() throws InterruptedException {
	 
	  boolean flag=AndroidPageActions.emptyUserCredsTest();
	  AppPageValidations.validateInvalidUser(flag);
	  
  }
  
  @Test(dataProvider ="userType",dataProviderClass=LocalDataProvider.class)
  void invalidUserLoginTest(String userName, String Password){
     
	  boolean flag=AndroidPageActions.invalidUserCredsTest(userName, Password);
	  AppPageValidations.validateInvalidUser(flag);
  }
  
  @Test
  void loginWithStandardUserE2E() throws InterruptedException {
	 
	  AndroidPageActions.swipeDownOnLoginPage();
	  AndroidPageActions.standardUserE2EFlow();
  }
  
}
