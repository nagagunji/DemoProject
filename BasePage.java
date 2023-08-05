package StepDefinitions;

import java.util.Properties;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;



import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;


public class BasePage {
	
	public static WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage ad;
	public SearchCustomerPage s;
	public static Logger logger;
	public static Properties configpro;
	
	
	
	public static String randomemailid()
	{
		String emailid=RandomStringUtils.randomAlphabetic(5);
		return emailid;
	}
	
	
}
