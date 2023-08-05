package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sun.tools.internal.xjc.Driver;

public class AddCustomerPage {
	
WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	By Customer_menu=By.xpath("//a[@href='#']//span[contains(text(),'Customers')]");
	By Customer_link=By.xpath("//span[@class='menu-item-title'][contains(text(),'Customers')]");
	
	By newlink=By.xpath("//a[@class='btn bg-blue']");
	
	By emailid=By.xpath("//input[@id='Email']");
	By password=By.xpath("//input[@id='Password']");
	By first_name=By.xpath("//input[@id='FirstName']");
	By last_name=By.xpath("//input[@id='LastName']");
	
	By malegender =By.xpath("//input[@id='Gender_Male']");
	By femalegender =By.xpath("//input[@id='Gender_Female']");
	
	By dob=By.xpath("//input[@id='DateOfBirth']");
	
	By companyname =By.xpath("//input[@id='Company']");
	
	//By taxexempt =By.xpath("//input[@id='IsTaxExempt']");

	
	By textcustomerroles = By.xpath("//div[@class='k-multiselect-wrap k-floatwrap']");
	
	By listadministrator=By.xpath("//li[contains(text(),'Administrators')]");
	By listForumModerators =By.xpath("//li[contains(text(),'Forum Moderators')]");
	By listRegistered =By.xpath("//li[contains(text(),'Registered')]");
	By Guests =By.xpath("//li[contains(text(),'Guests')]");
	By listVendors =By.xpath("//li[contains(text(),'Vendors')]");
	
	
	By managevendor =By.xpath("//select[@name='VendorId']");
	
	By admincontext =By.xpath("//textarea[@id='AdminComment']");
	
	By savebtn =By.xpath("//button[@name='save']");
	
	
	//action methods
	
	public String getPageTitle()
	{
	return ldriver.getTitle();
	}
	
	public void clickoncustomersmenu()
	{
		ldriver.findElement(Customer_menu).click();
	}
	
	public void clickoncustomeritem()
	{
		ldriver.findElement(Customer_link).click();
	}
	public void addnewbutton()
	{
		ldriver.findElement(newlink).click();
	}
	
	public void setemail(String email)
	{
		ldriver.findElement(emailid).sendKeys(email);
	}
	
	public void setpassword(String pasword)
	{
		ldriver.findElement(password).sendKeys(pasword);
	}
	
	public void setfirstname(String fstname)
	{
		ldriver.findElement(first_name).sendKeys(fstname);
	}
	
	public void setlastname(String lstname)
	{
		ldriver.findElement(last_name).sendKeys(lstname);
	}
	
	public void setgender(String gender)
	{
		if(gender.equals("Male"))
		{
			ldriver.findElement(malegender).click();
		}
		else if(gender.equals("Female"))
		{
			ldriver.findElement(femalegender).click();
		}
		else
		{
			ldriver.findElement(malegender).click();

		}
	}
	
	public void setdob(String dateofbirth)
	{
		ldriver.findElement(dob).sendKeys(dateofbirth);
	}
	
	public void setcompany(String name)
	{
		ldriver.findElement(companyname).sendKeys(name);
	}
	
	public void setcustomerroles(String role)
	{
		if(!role.equals("Vendors"))
		{
			ldriver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[1]"));
		}
		ldriver.findElement(textcustomerroles).click();
		WebElement listitem;
		if(role.equals("Administrators"))
		{
			listitem=ldriver.findElement(listadministrator);
		}
		else if(role.equals("Forum Moderators"))
		{
			listitem=ldriver.findElement(listForumModerators);
		}
		else if(role.equals("Registered"))
		{
			listitem=ldriver.findElement(listRegistered);
		}
		else if(role.equals("Vendors"))
		{
			listitem=ldriver.findElement(listVendors);
		}
		else
		{
			listitem=ldriver.findElement(Guests);
		}

	        // listitem.click();
	         
	         JavascriptExecutor js=(JavascriptExecutor)ldriver;
	         js.executeScript("arguments[0].click();", listitem);
	  }
	
	public void setmanagevendor(String value)
	{
		Select s=new Select(ldriver.findElement(managevendor));
		s.selectByVisibleText(value);
	}
	
	public void setadmincontent(String content)
	{
		ldriver.findElement(admincontext).sendKeys(content);
	}
	
	public void clicksavebtn()
	{
		ldriver.findElement(savebtn).click();
	}

}
