package StepDefinitions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.SearchCustomerPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginTestStep001 extends BasePage {
	
@Before	
public void configurationmethod() throws IOException
{
	logger=Logger.getLogger("nop commerce"); ///added loger
	PropertyConfigurator.configure("Log4j.properties"); //added logger
	//adding config.properties file
	configpro=new Properties();
	FileInputStream fs=new FileInputStream("Config.properties");
	configpro.load(fs);
	
}
	
	
@Given("user launch chrome browser")
public void user_launch_chrome_browser() {
	
System.setProperty("webdriver.chrome.driver", configpro.getProperty("chromepath"));
driver=new ChromeDriver();
lp=new LoginPage(driver);
logger.info("launching the browser");
    
}

@When("user opens url {string}")
public void user_opens_url(String url) {

	driver.get(url);
	logger.info("url is opened");
}

@When("user enters  email as {string} and password as {string}")
public void user_enters_email_as_and_password_as(String emailid, String password) {
	lp.setUsername(emailid);
	lp.setPassword(password);
	logger.info("credientials ar given");
   
}

@When("Click on login")
public void click_on_login() {
    lp.loginbutton();
}

@Then("Page Title should be {string}")
public void page_Title_should_be(String title) throws InterruptedException {
	
	if (driver.getPageSource().contains("Login was unsuccessful"))
	{
		driver.close();
		Assert.assertTrue(false);
		logger.info("new page is opened");
	}
	else
	{
		Assert.assertEquals(title, driver.getTitle());
	}
	Thread.sleep(2000);
}

@When("user click on logout link")
public void user_click_on_logout_link() {
	lp.LogoutButton();
   
}

@Then("the title of page is {string}")
public void the_title_of_page_is(String title) {
	
	if (driver.getPageSource().contains("Login was unsuccessful"))
	{
		driver.close();
		Assert.assertTrue(false);
	}
	else
	{
		Assert.assertEquals(title, driver.getTitle());
	}
}
	
	@Then("User can view Dashboard")
	public void user_can_view_Dashboard() {
		
		ad=new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration",ad.getPageTitle());
	   
	}
	
	// creating the new customer

	@When("User clicks on Customers Menu")
	public void user_clicks_on_Customers_Menu() {
	    ad.clickoncustomersmenu();
	}

	@When("User clicks on Customers Menu item")
	public void user_clicks_on_Customers_Menu_item() {
		ad.clickoncustomeritem();
	 }

	@When("user clicks on AddNew button")
	public void user_clicks_on_AddNew_button() {
		ad.addnewbutton();
	 }

	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", ad.getPageTitle());
		
	 }

	@When("Customer enter customer info")
	public void customer_enter_customer_info() {
		String email=randomemailid()+"@gamil.com";
		ad.setemail(email);
		ad.setpassword("June29@2016");
		ad.setfirstname("naga");
		ad.setlastname("jyoshna");
		ad.setgender("Female");
		ad.setdob("4/5/2016");
		ad.setcompany("tcs");
		ad.setcustomerroles("Administrators");
		ad.setmanagevendor("Vendor 1");
		ad.setadmincontent("this is message....");
	   	}

	@When("User clicks  on save btton")
	public void user_clicks_on_save_btton() {
	   ad.clicksavebtn();
	}

	@Then("user can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {
	    Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
	    		.contains("The new customer has been added successfully"));
	}


@Then("Close the Browser")
public void close_the_Browser() {
	driver.close();
	
}

////search with customer email 

@When("Enter the customer email")
public void enter_the_customer_email() {
	s=new SearchCustomerPage(driver);
    s.searchemail("james_pan@nopCommerce.com");
}

@When("user clicks on search button")
public void user_clicks_on_search_button() {
  s.searchbtn.click();  
}

@Then("User shoud found email in search table")
public void user_shoud_found_email_in_search_table() {
             
	boolean status=s.SearchcustomerbyEmail("james_pan@nopCommerce.com");
	logger.info("email is entered");
	Assert.assertEquals(true, status);
	logger.info("email is serached");
	
    }

//user search by firstname and lastname

@When("Enter the firstname")
public void enter_the_firstname() {
	s=new SearchCustomerPage(driver);
	s.setfirstname("Victoria");

}

@When("Enter the lastName")
public void enter_the_lastName() {
	s.setlastname("Terces");

}

@Then("user should found fistname and lastname in search table")
public void user_should_found_fistname_and_lastname_in_search_table() {
	boolean status=s.searchCustomerByName("Victoria Terces");
	Assert.assertEquals(true, status);

}
}