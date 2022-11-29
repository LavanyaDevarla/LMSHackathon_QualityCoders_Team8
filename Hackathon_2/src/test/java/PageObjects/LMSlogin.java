package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class LMSlogin extends Base{
	

	  
	
			public LMSlogin(WebDriver driver){
			PageFactory.initElements(driver,this);
			}
	  
	  //---------------------------LOGINBUTTON---------------------------
	  @FindBy (xpath="")
	  WebElement loginbutton;
	
	  
	  //--------------------------LOGIN ----------------------------
	  @FindBy (xpath="")
	  WebElement username;
	 
	  @FindBy (xpath="")
	  WebElement password;
	  @FindBy (xpath="")
	  WebElement loginsuccess;
	  @FindBy (xpath="")
	  WebElement loginerror;
	  @FindBy (xpath="")
	  WebElement code;
	  
	  @FindBy (xpath="")
	  WebElement emailaddress;
	  
	  @FindBy (xpath="")
	  WebElement vcode;
	  
	  @FindBy (xpath="")
	  WebElement continue1;
	  @FindBy (xpath="")
	  WebElement resend;
	  @FindBy (xpath="")
	  WebElement newpass;
	  @FindBy (xpath="")
	  WebElement retypepass;
	  @FindBy (xpath="")
	  WebElement submit;
	  
	  @FindBy (xpath="")
	  WebElement cancel;
	  //-------------------------------------------------------------------------------------------
	  public void cancel()
	  {
	       cancel.click();
	    
	  }   
	  public void submit()
	  {
	      submit.click();
	    
	  }   
	  public void newpassword(String pass)  
	  {
		  newpass.sendKeys(pass);
		    return ;
	  }
	  public void retypepass(String retype)  
	  {
		   retypepass.sendKeys(retype);
		    return ;
	  }
	  
	  public void resend()
	  {
	       resend.click();
	    
	  }   
	  public void continuelog()
	  {
	       continue1.click();
	    
	  }   
	  public void verificode(String name)  
	  {
		   vcode.sendKeys(name);
		    return ;
	  }
	  public void code(String code1)  
	  {
		  code.sendKeys(code1);
		    return ;
	  }
	  public void username(String name)  
	  {
		  username.sendKeys(name);
		    return ;
	  }
	  public void password(String password1)  
	  {
		  password.sendKeys(password1);
		    return ;
	  }
	  public void loginbutton()
	  {
	       loginbutton.click();
	    
	  }   
	  public void loginsuccess()
	  {
	       loginsuccess.getText();
	      
	  }   
	  public void loginerror()
	  {
	      loginerror.getText();
	      
	  }   
	  public void  email(String mail)  
	  {
		 emailaddress.sendKeys(mail);
		   return ;
	  }
}
