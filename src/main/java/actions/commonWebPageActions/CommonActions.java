package actions.commonWebPageActions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.DriverManager;
import utils.LocalConfigFactory;

public final class CommonActions {
	
	public static void waitForElementClickable(int timeInSeconds, By by)
	{

			try {
				WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(timeInSeconds) );
				wait.until(ExpectedConditions.elementToBeClickable(by));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}


	public static void waitForElementPresent(int timeInSeconds, By by)
	{
		try {
			WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(timeInSeconds) );
			//wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.presenceOfElementLocated(by));

		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
		}
	}

	public static void waitForAllElementPresent(int timeInSeconds, By by)
	{
		try {
			WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(timeInSeconds) );
			wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));

		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
		}
	}

	public static void click(By by) throws InterruptedException 
	{
		waitForElementClickable(LocalConfigFactory.getConfigValue().timeout(),by);
		DriverManager.getWebDriver().findElement(by).click();
		Thread.sleep(800);
	}
	
	public static void browserBackButton() throws InterruptedException 
	{
		Thread.sleep(2000);
		DriverManager.getWebDriver().navigate().back();
		Thread.sleep(800);
	}

	public static void clickByJavaScript(WebElement ele) throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)DriverManager.getWebDriver();
		executor.executeScript("arguments[0].click();", ele);
		Thread.sleep(800);
	}


	public static void dragNadDropByCoordinates(WebElement ele)
	{
		Actions action = new Actions(DriverManager.getWebDriver());
		action.clickAndHold(ele).moveByOffset(20, 10).build().perform();
	}

	public static void inputValuesSlowly(WebElement ele, String value) throws InterruptedException
	{
		String val = value; 
		ele.clear();

		for (int i = 0; i < val.length(); i++){
			char c = val.charAt(i);
			String s = new StringBuilder().append(c).toString();
			ele.sendKeys(s);Thread.sleep(250);
		}  
	}


	public static void inputValues(WebElement ele, String value) throws Exception
	{
		ele.clear();
		ele.sendKeys(value);
		Thread.sleep(800);
	}


	public static boolean ifAlertPresent(WebDriver driver)
	{
		try 
		{ 
			driver.switchTo().alert(); 
			return true; 
		}  
		catch (Exception Ex) 
		{ 
			return false; 
		}  
	}

	public static void accetAlert(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}

	public static void dismissAlert(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	public static String getAlertText(WebDriver driver) throws InterruptedException
	{
		Alert alert=driver.switchTo().alert();
		return alert.getText();
	}

	public static void scrollUpJavaScript()
	{
		JavascriptExecutor executor = (JavascriptExecutor)DriverManager.getWebDriver();

		executor.executeScript("window.scrollBy(150,-750);", "");

	}

	public static int randomSelection(List<WebElement> list)
	{
		Random rand= new Random();
		return rand.nextInt(list.size());
	}

	public static void moveToElement(WebElement el, WebDriver driver)
	{
		waitForElementPresent(LocalConfigFactory.getConfigValue().timeout(),el);
		Actions act= new Actions(driver);
		act.moveToElement(el).build().perform();
	}


	public static void waitForElementPresent(int timeInSeconds,WebElement ele)
	{
		try {
			WebDriverWait wait = new WebDriverWait(DriverManager.getWebDriver(), Duration.ofSeconds(timeInSeconds) );
			//wait.until(ExpectedConditions.visibilityOf(ele));
			wait.until(ExpectedConditions.elementToBeSelected(ele));

		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
		}
	}

}
