package PageObjects;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Base;


public class RegistarationPage extends Base{
	
	  
		WebDriver driver;
		public   RegistarationPage(WebDriver driver){
		PageFactory.initElements(driver,this);
		}

	@FindBy(xpath="")
	@CacheLookup
	WebElement txtFirstName;
	
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtLastName;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtAddress;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtStreetNmae;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtCity;
	
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement dropState;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtzip;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement dobBirthDate;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtphonenumber;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement btnSignup;
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement pageHeader;
	
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement viewLogin;
	
	
	public void FirstName() {
		
		txtFirstName.sendKeys();
		
		
	}
	
	public String gettextofFirstname() {
		
		 return txtFirstName.getText();
	}
	
	
	public void invalidFirstname() {
		txtFirstName.sendKeys("178787******");
	}
	
	
	public void LastName() {
		
		txtLastName.sendKeys();
		
	}
	
	public void invalidLastName() {
		txtLastName.sendKeys("178787******");
	}
	
	
	public String gettextofLastname() {
		
		 return txtLastName.getText();
	}
	
	public void Address() {
		txtAddress.sendKeys();
	}
	
	public void invalidAddress() {
		txtAddress.sendKeys("      ");
	}
	
	public String gettextofaddress() {
		
		 return txtAddress.getText();
	}
	
	public void StreetName() {
		txtStreetNmae.sendKeys();
	}
	public void invalidStreetname() {
		txtStreetNmae.sendKeys("Texas");
	}
	
	
	public String gettextofstreetname() {
		
		 return txtStreetNmae.getText();
	}
	
	public void City() {
		txtCity.sendKeys();
	}
	
	public void invalidCity() {
		txtCity.sendKeys("warriors");
	}
	
	
	public String gettextofcity() {
		
		 return txtCity.getText();  
	}
	
	
	public void State() {
		Select sel= new Select(dropState);
		
		sel.getOptions();
		
	}
	
	
	public void invalidState() {
		Select sel= new Select(dropState);
		
		sel.getOptions();
		
	}
	
	
	
	public String gettextofstate() {
		
		 return dropState.getText();
	}
	
	
	public void zip() {
		txtzip.sendKeys();
	}
	
	public void invalidzip() {
		txtzip.sendKeys("@####$$");
	}
	
	public String gettextofzip() {
		
		 return txtzip.getText();
	}
	
	public void Birthdate() {
		Select sel= new Select(dobBirthDate);
		sel.getOptions();
	}
	
	
	public String gettextofBirthdate() {
		
		 return dobBirthDate.getText();
	}
	public void Password() {
		txtpassword.sendKeys();
	}
	public String gettextofpassword() {
		
		 return txtpassword.getText();
	}
	
	public void invalidPassword() {
		txtpassword.sendKeys("56656767");
	}
	
	
	
	public void UserName() {
		txtUserName.sendKeys();
	}
	
	public String gettextofusername() {
		
		 return txtUserName.getText();
	}
	
	
	public void email() {
		txtEmail.sendKeys();
	}
	
	public String gettextofemail() {
		
		 return txtEmail.getText();
	}
	
	
	
	
	public void PhoneNumber() {
		txtphonenumber.sendKeys();
	}
	
	public void invalidPhoneNumber() {
		txtphonenumber.sendKeys("aaaaaaaaaaa");
	}
	
	public String gettextofphoneNumber() {
		
		 return txtphonenumber.getText();
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void clickSignup() {
		btnSignup.click();
	}
	
	
	public String getPageHeader() {
		return pageHeader.getText();
		
	}
	
	public String getLogin() {
		return viewLogin.getText() ;
		
	}
	
	public void clearallfields() {
		txtFirstName.clear();
		txtLastName.clear();
		txtAddress.clear();
		txtStreetNmae.clear();
		txtCity.clear();
		txtzip.clear();
		dobBirthDate.clear();
		txtUserName.clear();
		txtphonenumber.clear();
		txtEmail.clear();
		txtpassword.clear();
		
	}
	
	public void clearBirthDate() {
		dobBirthDate.clear();
	}
	
	
	public void invalidUserName() {
		txtUserName.sendKeys("#####yyyy");
	}
	
	
	
}
