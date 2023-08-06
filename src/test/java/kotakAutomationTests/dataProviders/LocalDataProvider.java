package kotakAutomationTests.dataProviders;

import org.testng.annotations.DataProvider;

public class LocalDataProvider {
	
	@DataProvider(name = "userType")
  	public Object[][] dataProvFunc(){
        	return new Object[][]{	
              	{"locked_out_user","secret_sauce"}
        	};
  	}

}
