package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {
	
	public static WebDriver driver;
	
	public WaitHelper(WebDriver rdriver)
	{
		this.driver=rdriver;
	}
	
	public static void waitHelpermethod(WebElement element,long timeUnitInSeconds)
	{
		WebDriverWait wait=new WebDriverWait(driver,timeUnitInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}


}
