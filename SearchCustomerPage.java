package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.BasePage;
import Utilities.WaitHelper;



public class SearchCustomerPage extends BasePage {
	
	public WebDriver ldriver;
	WaitHelper w;
	
	
	public SearchCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		w=new WaitHelper(ldriver);
	}
	
	@FindBy(xpath="//input[@id='SearchEmail']")
	@CacheLookup
	public WebElement semail;
	
	
	@FindBy(xpath="//input[@id='SearchFirstName']")
	@CacheLookup
	public WebElement sfirstname;

	@FindBy(xpath="//input[@id='SearchLastName']")
	@CacheLookup
	public WebElement slastname;
	
	
	@FindBy(xpath="//input[@id='SearchMonthOfBirth']")
	@CacheLookup
	public WebElement month;
	
	@FindBy(xpath="//input[@id='SearchDayOfBirth']")
	@CacheLookup
	public WebElement day;
	
	@FindBy(xpath="//input[@id='SearchCompany']")
	@CacheLookup
	public WebElement company;
	
	@FindBy(xpath="//input[@id='SearchIpAddress']")
	@CacheLookup
	public WebElement ipddress;
	
	@FindBy(xpath="//div[@class='k-multiselect-wrap k-floatwrap']")
	@CacheLookup
	public WebElement cuxtomerroles;
	
	@FindBy(xpath="//li[contains(text(),'Administrators')]")
	@CacheLookup
	public WebElement listadministrator;
	
	@FindBy(xpath="//li[contains(text(),'Forum Moderators')]")
	@CacheLookup
	public WebElement listForumModerators;
	
	@FindBy(xpath="//li[contains(text(),'Registered')]")
	@CacheLookup
	public WebElement listRegistered;
	
	@FindBy(xpath="//li[contains(text(),'Guests')]")
	@CacheLookup
	public WebElement listGuests;
	
	@FindBy(xpath="//li[contains(text(),'Vendors')]")
	@CacheLookup
	public WebElement listVendors;
	
	@FindBy(xpath="//button[@id='search-customers']")
	@CacheLookup
	public WebElement searchbtn;
	
	@FindBy(xpath="//table[@role='grid']")
	@CacheLookup
	public WebElement tablesearchresults;
	
	@FindBy(xpath="//table[@id='customers-grid']")
	@CacheLookup
	public WebElement table;
	
	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr")
	@CacheLookup
	public List<WebElement> tablerows;
	
	@FindBy(xpath="//table[@id='customers-grid']//tbody/tr/td")
	@CacheLookup
	public List<WebElement> tablecoloumns;



	
	//action methods
	 
	public void searchemail(String email)
	{
		
		semail.clear();
		semail.sendKeys(email);
	   WaitHelper.waitHelpermethod(semail, 30);
	}
	
	public void Searchbuton()
	{
		searchbtn.click();
	}
	
	public int getnoOfrows()
	{
		return (tablerows.size());
	}
	
	public int getnoOfColoums()
	{
		return (tablecoloumns.size());
	}
	
	public boolean SearchcustomerbyEmail(String email)
	{
		boolean flag=false;
		for(int i=1;i<=getnoOfrows();i++)
		{
	      String seEmail= table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[2]")).getText();
	      System.out.println(seEmail);
	      if(seEmail.equals(email))
	      {
	    	  flag=true;
	      }
	    }
		return flag;
	}
	
	// search customer by using first name and last name
	
	public void setfirstname(String fname)
	{
		sfirstname.sendKeys(fname);
	}
	
	public void setlastname(String lname)
	{
		slastname.sendKeys(lname);
	}
	
	public boolean searchCustomerByName(String name)
	{
		boolean flag=false;
		for(int i=1;i<=getnoOfrows();i++)
		{
			String completename=table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td[3]")).getText();
			String names[]=completename.split(" ");
			if (names[0].equals("Victoria")&& names[1].equals("Terces"))
			{
				flag=true;
			}
			
			
		}
		return flag;
	}


	
	

	
	
	
	
	
	
	
	

}
