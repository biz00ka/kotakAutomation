package pages.webPages;


import utils.DriverManager;

public class WebLoginPage {
	
	
	
	
	public String getTitle() throws InterruptedException
	{
		return DriverManager.getWebDriver().getTitle();
		
	}
	

}
