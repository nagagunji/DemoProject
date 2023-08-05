package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="Email")
	@CacheLookup
	public WebElement emailid;
	
	@FindBy(id="Password")
	@CacheLookup
	public WebElement pswd;

	
	@FindBy(xpath="//input[@type='submit']")
	@CacheLookup
	public WebElement clickbutton;

	
	@FindBy(xpath="/html/body/div[3]/div[1]/div/div/ul/li[3]/a")
	@CacheLookup
	public WebElement logoutlink;

	public void setUsername(String email)
	{
		emailid.sendKeys(email);
	}
	
	public void setPassword(String password)
	{
		pswd.sendKeys(password);
	}
	
   public void loginbutton()
  {
	clickbutton.click();
  }
   
   public void LogoutButton()
   {
	   logoutlink.click();
   }
	
	

}
