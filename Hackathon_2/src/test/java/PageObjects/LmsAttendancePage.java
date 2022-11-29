package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LmsAttendancePage {
	WebDriver driver;
	public   LmsAttendancePage(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath = " ")
	WebElement AttendancePage;
	
	public void clickonAttendancePage() {
		AttendancePage.click();
	}
	@FindBy(xpath = " ")
	WebElement  Disabledbutton;
	
	public void clickonDisabled() {
		Disabledbutton.click();
	}
	@FindBy(xpath = " ")
	WebElement Present;
	
	public void clickonPresent() {
		Disabledbutton.click();
	}
	@FindBy(xpath = " ")
	WebElement  FooterPage;
	
	public void clickonFooterPage() {
		 FooterPage.click();
	}
	@FindBy(xpath = " ")
	WebElement   PaginatorPage;
	
	public void clickonPaginatorPage() {
		PaginatorPage.click();
	}
	@FindBy(xpath = " ")
  WebElement paginatorbutton;
	
	public void clickonpaginatorbutton() {
		paginatorbutton.click();
	}
	
	@FindBy(xpath = " ")
	  WebElement EditButton;

	public void clickonEditButton() {
		EditButton.click();
	}
	@FindBy(xpath = " ")
	WebElement ProgramName;
	
	public void enterProgramName() {
		ProgramName.sendKeys("Sdet69");
	}
	
	@FindBy(xpath = " ")
	WebElement Save;
	
	public void clickonSave() {
		Save.click();
	}
	
	@FindBy(xpath = " ")
	WebElement  AttendanceDetails;
	
	public void clickonAttendanceDetails() {
		AttendanceDetails.click();
	}
	@FindBy(xpath = " ")
	WebElement  UserName;
	
	public void enterUserName() {
		 UserName.sendKeys("ABC");
	}
	
	@FindBy(xpath = " ")
	  WebElement EditPresent;
	
	public void clickonEditPresent() {
		EditPresent.click();
	}
	
	@FindBy(xpath = " ")	
	  WebElement DropDown;
	
	public void clickonDropDown() {
		DropDown.click();
	}
	
	@FindBy(xpath = " ")	
	  WebElement AllDetails;
		
	public void clickonAllDetails() {
		AllDetails.click();
	}
	
	@FindBy(xpath = " ")	
	  WebElement EditAbsent;
	
	public void clickonEditAbsent() {
		EditAbsent.click();
	}
	
	@FindBy(xpath = " ")	
	  WebElement Cancelbutton;
	
	public void clickonCancelbutton() {
		 Cancelbutton.click();
	}
	@FindBy(xpath = " ")	
	  WebElement Deletebutton;
	
	public void clickonDeletebutton() {
		Deletebutton.click();
	}
	
	@FindBy(xpath = " ")	
	  WebElement Yesbutton;
	
	public void clickonYesbutton() {
		Yesbutton.click();
	}
	@FindBy(xpath = " ")	
	  WebElement Nobutton;
	
	public void clickonNobutton() {
		Nobutton.click();
	}
	
	@FindBy(xpath = " ")	
	  WebElement CheckBox;
	
	public void clickonCheckBox() {
		CheckBox.click();
	}
	
	@FindBy(xpath = " ")	
	  WebElement  Presentbutton;
	
	public void clickonPresentbutton() {
		Presentbutton.click();
	}
	@FindBy(xpath = " ")	
	  WebElement  Absentbutton;
	
	public void clickonAbsentbutton() {
		Absentbutton.click();
	}
	
	
}