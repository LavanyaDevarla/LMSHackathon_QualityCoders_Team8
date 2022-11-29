package PageObjects;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import BaseClass.Base;
import Utilities.helper;


public class ManageAssignmentPage extends Base {
	
	WebDriver driver;
	public   ManageAssignmentPage(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(xpath = "")
	public WebElement AssignmentHeader;
	
	@FindBy(xpath = "")
	public WebElement ManageAssignmentHeader;
	
	@FindBy(xpath = "")
	public WebElement ShowingEntries;
	
	@FindBy(xpath = "")
	public WebElement AssignementFooterMsg;
	
	@FindBy(xpath = "")
	public WebElement SearchBox;
	
	@FindBy(xpath = "")
	public WebElement CheckBox;
	
	@FindBy(xpath = "")
	public WebElement CommonCheckBox;
	
	@FindBy(xpath = "")
	public WebElement SqlAssignment;

	@FindBy(xpath = "")
	public WebElement SqlPractice;

	@FindBy(xpath = "")
	public WebElement SqlDate;
	
	@FindBy(xpath = "")
	public WebElement AssignmentPaginatorMsg ;
	
	
	@FindBy(xpath = "")
	public WebElement EditIcon;
	
	@FindBy(xpath = "")
	public WebElement DeleteIcon;
	
	
	@FindBy(xpath = "")
	public WebElement DeleteConfirmWindow;
	
	@FindBy(xpath = "")
	public WebElement AssignmentDetails;

	@FindBy(xpath = "")
	public WebElement AssignmentName;
	
	
	@FindBy(xpath = "")
	public WebElement Header_AssignmentName;
	
	
	@FindBy(xpath = "")
	public WebElement Header_AssignmentDescription;
	
	@FindBy(xpath = "")
	public WebElement NewAssignmentName;

	@FindBy(xpath = "")
	public WebElement AssignmentDescription;

	@FindBy(xpath = "")
	public WebElement NewAssignmentDescription;

	@FindBy(xpath = "")
	public WebElement AssignmentGrade;

	@FindBy(xpath = "")
	public WebElement NewAssignmentGrade;
	
	@FindBy(xpath = "")
	public WebElement AssignmentDueDate;

	@FindBy(xpath = "")
	public WebElement NewAssignmentDueDate;

	@FindBy(xpath = "")
	public WebElement AssignmentDueDatechanged;

	@FindBy(xpath = "")
	public WebElement SaveButton;

	
	@FindBy(xpath = "")
	public WebElement NewAssignmentSaveButton;

	@FindBy(xpath = "")
	public WebElement CancelButton;

	@FindBy(xpath = "")
	public WebElement NewCancelButton;

	@FindBy(xpath = "")
	public WebElement YesButton;

	@FindBy(xpath = "")
	public WebElement NoButton;

	@FindBy(xpath = "")
	public WebElement CommonDeleteButton;

	@FindBy(xpath = "")
	public WebElement NewAssignmentButton;

	@FindBy(xpath = "")
	public WebElement NewAssignmentDetailsWindow;

	
	@FindBy(xpath = "")
	public WebElement NameIsRequiredMSg;

	@FindBy(xpath = "")
	public WebElement SuccessMSg;
	
	@FindBy(xpath = "")
	public WebElement UnSuccessMSg;

	@FindBy(xpath = "")
	public WebElement DeleteSuccessMSg;

	@FindBy(xpath = "")
	public WebElement NewAssignmentSuccessMSg;
	
	
	@FindBy(xpath = "")
	public WebElement PaginatorNextButton;
	
	@FindBy(xpath = "")
	public WebElement Page2;
	
	@FindBy(xpath = "")
	public WebElement Page1;
	
	
	@FindBy(xpath = "")
	public WebElement LastPage;
	
	@FindBy(xpath = "")
	public WebElement FirstPage;
	
	@FindBy(xpath = "")
	public WebElement ManageButton;
	
	@FindBy(xpath = "")
	public WebElement SwitchaccountButton;
	
	@FindBy(xpath = "")
	public WebElement SubmitButton;
	
	@FindBy(xpath = "")
	public WebElement ClearButton;
	
	@FindBy(xpath = "")
	public WebElement FirstandLastName;
	
	@FindBy(xpath = "")
	public WebElement whatisfavoriteAnimal;
	
	@FindBy(xpath = "")
	public WebElement favoritecolor;
	
	@FindBy(xpath = "")
	public WebElement AssignmentsGoogleform; 	
	
	public void clickClearButton() {
		ClearButton.click();
	}
	
	public void clickSubmitButton() {
		SubmitButton.click();
	}
	
	public void clickSwitchaccountButton() {
		SwitchaccountButton.click();
	}
	 
	public void favoritecolor() {
		favoritecolor.sendKeys();
	}
	
	public void whatisfavoriteAnimal() {
		whatisfavoriteAnimal.sendKeys();
	}
	
	public void FirstandLastName() {
		FirstandLastName.sendKeys();
	}
	
	public void AssignmentsGoogleform() {
		AssignmentsGoogleform.isDisplayed();
	}
	
	public void clearGoogleformDetails() {
		FirstandLastName.clear();
		whatisfavoriteAnimal.clear();
		favoritecolor.clear();
	}
	
	
	public void checkTitle() {
		String title = helper.getTitle();
		Assert.assertEquals(title, "LMS");
	}

	public void clickAssignementHeader() {
		AssignmentHeader.click();
	}

	public void checkShowingEntries() {
		Assert.assertTrue(ShowingEntries.isDisplayed());
	}

	public void checkManageAssignmentHeader() {
		Assert.assertTrue(ManageAssignmentHeader.isDisplayed());
	}

	public void checkAssignementFooterMsg() {
		Assert.assertTrue(AssignementFooterMsg.isDisplayed());
	}

	public void checkPaginatorMsg() {
		Assert.assertTrue(AssignmentPaginatorMsg.isDisplayed());
	}
	
	public void clickPaginatorNextButton() {
		PaginatorNextButton.click();
	}
	
	public void checkIsPageNo2() {
		Assert.assertTrue(Page2.isDisplayed());
	}
	
	public void checkIsPreviuos() {
		Assert.assertTrue(Page1.isDisplayed());
	}
	
	public void clickFirstPage() {
		LastPage.click();
	}
	
	public void clickManageButton() {
		ManageButton.click();
	}
	
	
	
	public void clickAssignmentname() {
		AssignmentName.click();
	}
	
	
	public void VerifyDeletebutton() {
		Assert.assertTrue(DeleteIcon.isDisplayed());
	}
	
	
	
	public void checkFirstPageDisplayed() {
		LastPage.isDisplayed();
	}
	
	
	public void clickLastPage() {
		FirstPage.click();
	}
	
	public void checkLastPageDisplayed() {
		FirstPage.isDisplayed();
	}
	
	
	
	
	
	
	public void clickSearchBox() {
		SearchBox.click();
	}
	
	public void checkSearchBox() {
		Assert.assertTrue(SearchBox.isDisplayed());
	}

	public void EnterSearchBox() {
		SearchBox.sendKeys("sqlAssignment");
	}

	public void checkSqlAssignment() {
		Assert.assertTrue(SqlAssignment.isDisplayed());
	}

	public void EnterCheckBox() {
		CheckBox.click();
	}

	public void EnterCommonCheckBox() {
		CommonCheckBox.click();
	}

	public void ClickEditIcon() {
		EditIcon.click();
	}
	
	
	public void ClickDeleteIcon() {
		DeleteIcon.click();
	}
	
	public void ClickCommonDeleteButton() {
		CommonDeleteButton.click();
	}
	
	public void checkAssignmentDetails() {
		 Assert.assertTrue(AssignmentDetails.isDisplayed());
	}
	
	public void EnterAssignmentName() {
		AssignmentName.clear();
		AssignmentName.sendKeys("sql");
		SaveButton.click();
	}
	
	
	
	
	
	public void EnterAssignmentDescription() {
		AssignmentDescription.clear();
		AssignmentDescription.sendKeys("sql language");
		SaveButton.click();
	}
	
	
	public void EnterAssignmentGrade() {
		AssignmentGrade.clear();
		AssignmentGrade.sendKeys("2");
		SaveButton.click();
	}
	
	
	public void EnterAssignmentDueDate() {
		AssignmentDueDate.clear();
		AssignmentDueDate.sendKeys("05/06/2022");
		SaveButton.click();

	}
	
	public void checkAssignmentDueDate() {
		Assert.assertTrue(AssignmentDueDatechanged.isDisplayed());

	}
	
	public void ClickCancelButton() {
		CancelButton.click();
	}

	public void ClickNewCancelButton() {
		NewCancelButton.click();
	}

	public void ClickYesButton() {
		YesButton.click();
	}

	public void ClickNoButton() {
		NoButton.click();
	}

	public void ClickSaveButton() {
		SaveButton.click();

	}
	
	
	public void ClickNewAssignmentSaveButton() {
		NewAssignmentSaveButton.click();
	}

	public void VerifyDeleteConfirmWindow() {
		Assert.assertTrue(DeleteConfirmWindow.isDisplayed());
	}

	
	public void ClickNewAssignmentButton() {
		NewAssignmentButton.click();
	}
	
	
	public void VerifyNewAssignmentDetailsWindow() {
		Assert.assertTrue(NewAssignmentDetailsWindow.isDisplayed());
	}

	public void VerifyNameIsRequiredMSg() {
		Assert.assertTrue(NameIsRequiredMSg.isDisplayed());
	}

	public void EnterNewAssignmentName() {
		NewAssignmentName.clear();
		NewAssignmentName.sendKeys("sql");
	}

	public void CheckNewAssignmentName() {
		Assert.assertTrue(NewAssignmentName.isDisplayed());
	}

	
	
	public void EnterNewAssignmentDescription() {
		NewAssignmentDescription.clear();
		NewAssignmentDescription.sendKeys("sql language");
	}

	public void CheckNewAssignmentDescription() {
		Assert.assertTrue(NewAssignmentDescription.isDisplayed());
	}

	public void EnterNewAssignmentGrade() {
		NewAssignmentGrade.clear();
		NewAssignmentGrade.sendKeys("2");
	}
	
	public void CheckNewAssignmentGrade() {
		Assert.assertTrue(NewAssignmentGrade.isDisplayed());
	}
	
	
	public void ViewSuccessMsg() {

		Assert.assertTrue(SuccessMSg.isDisplayed());
	}
	
	public void ViewUnsuccessMsg() {

		Assert.assertTrue(UnSuccessMSg.isDisplayed());
	}

	public void ViewDeleteSuccessMsg() {

		Assert.assertTrue(DeleteSuccessMSg.isDisplayed());
	}

	public void ViewNewAssignmentSuccessMsg() {

		Assert.assertTrue(NewAssignmentSuccessMSg.isDisplayed());
	}

	public void EnterNewAssignmentDueDate() {
		NewAssignmentDueDate.clear();
		NewAssignmentDueDate.sendKeys("05/06/2022");
	}

	public void CheckNewAssignmentDueDate() {
		 Assert.assertTrue(AssignmentDueDatechanged.isDisplayed());
	}
		 
		 
		 
	public void clickAssignmentAscendingOrder() {
		FluentWait<WebDriver> wait = null;
		//WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(10));
		Header_AssignmentName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
		Header_AssignmentName.click();
	}
	
	
@SuppressWarnings("null")
public void clickAssignmentDescriptionAscendingOrder() {
		FluentWait<WebDriver> wait = null;
		Header_AssignmentDescription = wait.until(ExpectedConditions.elementToBeClickable(AssignmentDescription));
		Header_AssignmentDescription.click();
}
	
public void clickAssignmentDuedateAscendingOrder() {
	FluentWait<WebDriver> wait = null;
	WebElement Header_AssignmentDuedate = wait.until(ExpectedConditions.elementToBeClickable(AssignmentDueDate));
	Header_AssignmentDuedate.click();
}

public void clickAssignmentGradeAscendingOrder() {
	FluentWait<WebDriver> wait = null;
	WebElement Header_AssignmentGrade = wait.until(ExpectedConditions.elementToBeClickable(AssignmentGrade));
	Header_AssignmentGrade.click();
}
	
	
	
public void clickAssignmentNameDescendingOrder() {

	FluentWait<WebDriver> wait = null;
	//WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(10));
	Header_AssignmentName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));
	Header_AssignmentName.click();
}


@SuppressWarnings("null")
public void clickAssignmentDescriptionDescendingOrder() {
	
	FluentWait<WebDriver> wait = null;
	//WebDriverWait wait = new WebDriverWait(Helper.getDriver(), Duration.ofSeconds(10));
	Header_AssignmentDescription = wait.until(ExpectedConditions.elementToBeClickable(AssignmentDescription));
	Header_AssignmentDescription.click();
}

public void clickAssignmentDuedateDescendingOrder() {


FluentWait<WebDriver> wait = null;
WebElement Header_AssignmentDuedate = wait.until(ExpectedConditions.elementToBeClickable(AssignmentDueDate));
Header_AssignmentDuedate.click();
}

public void clickAssignmentGradeDescendingOrder() {


FluentWait<WebDriver> wait = null;

WebElement Header_AssignmentGrade = wait.until(ExpectedConditions.elementToBeClickable(AssignmentGrade));
Header_AssignmentGrade.click();
}

public void clickSavewithoutData() {
	
	NewAssignmentName.clear();
	NewAssignmentDescription.clear();
	NewAssignmentGrade.clear();
	NewAssignmentDueDate.clear();
}
	
	
	
	

}
