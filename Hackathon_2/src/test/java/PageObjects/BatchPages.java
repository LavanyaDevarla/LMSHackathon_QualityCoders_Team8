package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class BatchPages extends Base {
	WebDriver driver;
	public  BatchPages(WebDriver driver){
	PageFactory.initElements(driver,this);
	}
	
	//-------------------AddBatchPage----------------------------------------
	
	
		@FindBy(xpath = " ")
		WebElement AddNewBatch;
		
		@FindBy(xpath = "")
		WebElement  Save;
		
		@FindBy(xpath = "")
		WebElement  Cancel;
		
		@FindBy(xpath = "")
	  WebElement BatchName;
		
		@FindBy(xpath = "")
		  WebElement Description;

		@FindBy(xpath = "")
		WebElement ProgramName;
		
		@FindBy(xpath = "")
		WebElement SelectProgramName;
		
		@FindBy(xpath = "")
		WebElement Active;
		
		@FindBy(xpath = " ")
		  WebElement batchNoOfClasses;
		@FindBy(xpath = " ")
		  WebElement DropDown;
		@FindBy(xpath = "")
		  WebElement AllDetails;
			
		public void clickonnewBatch() {
			AddNewBatch.click();
		}
		
		public void clickonSave1() {
	Save.click();
		}
		public void EnterAllDetails() {
			AllDetails.click();}
		
		public void clickonCancel() {
			Cancel.click();
				}
		
		public void clickonnewBatch1() {
			AddNewBatch.click();
		}
		
		public void EnterBatchName() {
			BatchName.sendKeys("SDET666");
			
		}
		public void EnterDescription() {
			Description.sendKeys("Testing");
		}
		public void SelectProgram() {
			ProgramName.click();
		}
		public void SelectProgramName() {
			SelectProgramName.click();
		}
		public void clickonActive() {
			Active.click();
		}
		public void batchNoOfClasses() {
			batchNoOfClasses.sendKeys("66");
			
		}
		public void clickonDropDown() {
			DropDown.click();
				}
		
		public void clickonSave() {
			Save.click();
				}
		//---------------Heading Page Validation---------------
		
		@FindBy(xpath="")
		WebElement Username;
		
		@FindBy(xpath="")
		WebElement Password;
		
		@FindBy(xpath="")
		WebElement Login ; 
		
		@FindBy(xpath="")
		WebElement BatchLink;
		
		@FindBy(xpath="")
		WebElement BatchPage;
		
		@FindBy(xpath = "")
		WebElement ManageBatch;
		
		public void enterusername() {
			Username.sendKeys("LMS");	}
		
		public void enterPassword() {
		Password.sendKeys("LMS");	}
		
		public void clickonlogin() {
			Login.click();	}
		
		public void clickonBatchLink() {
			BatchLink.click();	}
		
		public void seeBatchPage() {
			BatchPage.click();	}
		
		
		//------------------------------AsendingOrder Validation--------------------------------
		@FindBy(xpath="")
		WebElement BatchPage1;
		
		@FindBy(xpath = "")
		WebElement NameAscendingorder;
		
		@FindBy(xpath = "")
		WebElement DescriptionAscendingorder;
		
		@FindBy(xpath = "")
		WebElement StatusAscendingorder;
		
		@FindBy(xpath = "")
		WebElement  NoOfClassAscendingorder;	
		
		@FindBy(xpath = "")
		WebElement ProgramNameAscendingorder;	
		
		public void clickonBatchPage1() {
			BatchPage1.click();	}
		
		public void clickonNameAscendingorder() {
			NameAscendingorder.click();	}
		
		public void clickonDescriptionAscendingorder() {
			DescriptionAscendingorder.click();	}
		
		public void clickonStatusAscendingorder() {
			 StatusAscendingorder.click();	}	

	public void clcikonNoOfClassAscendingorder() {
		NoOfClassAscendingorder.click();	}

	public void clickonProgramNameAscendingorder() {
		ProgramNameAscendingorder.click();	}

	//------------------MultepleDeleteBatch-----------------
	

	
	@FindBy(xpath="")
	WebElement Checkbox;
	
	@FindBy(xpath = " ")
	WebElement deletebutton;
	
	@FindBy(xpath=" ")
	WebElement Yes;
	
	@FindBy(xpath=" ")
	WebElement Search;
	
	@FindBy(xpath = " ")
	WebElement No;
	
	public void selectCheckbox() {
		Checkbox.click();
	}
	
public void clickondeletebutton() {
	deletebutton.click();
	}
	
public void clickonYes() {
	Yes.click();
}
public void selectCheckbox1() {
	Checkbox.click();
}
public void clickondeletebutton2() {
	deletebutton.click();
	}
public void clickonNo() {
	No.click();

}
public void enterbatchName() {
	Search.sendKeys("SDET");
	Search.clear();
}
	
//----------------DecendingOrder---------------------------
@FindBy(xpath=" ")
WebElement BatchPage3;

@FindBy(xpath = " ")
WebElement NameDescendingorder;

@FindBy(xpath = " ")
WebElement DescriptionDescendingorder;

@FindBy(xpath = " ")
WebElement StatusDescendingorder;

@FindBy(xpath = " ")
WebElement  NoOfClassDescendingorder;


@FindBy(xpath = " ")
WebElement ProgramNameDescendingorder;

public void clickonNameDescendingorder() {
	NameDescendingorder.click();	}

public void clickonDescriptionDescendingorder() {
	DescriptionDescendingorder.click();	}

public void clickonStatusDescendingorder() {
	 StatusDescendingorder.click();	}


public void clcikonNoOfClassDescendingorder() {
NoOfClassDescendingorder.click();	}


public void clickonProgramNameDescendingorder() {
ProgramNameDescendingorder.click();	}
	
	//------------------Edit-----------------------

	@FindBy(xpath=" ")
	WebElement EditBatch;	
	
	@FindBy(xpath=" ")
	WebElement BatchDetails;
	
	@FindBy(xpath=" ")
	WebElement BatchName1;
	
	//@FindBy(id="batchName")
	//WebElement Name;
	
	@FindBy(id=" ")
	WebElement Description1;
	
	@FindBy(xpath=" ")
	WebElement Program;
	
	@FindBy(xpath=" ")
	WebElement Dropdown;
	
	@FindBy(xpath=" ")
	WebElement updatedName;
	
	@FindBy(xpath=" ")
	WebElement Status ;
	
	@FindBy(xpath=" ")
	WebElement Active1;
	
	@FindBy(id=" ")
	WebElement Classes;
	
	@FindBy(xpath=" ")
	WebElement CancelBtn;
	
	@FindBy(xpath=" ")
	WebElement SaveBtn;
	
	
	@FindBy(xpath=" ")
	WebElement Search1;
	
	
	public void clickonEditBatch()
	{
		 EditBatch.click();
	}
	public void clickonBatchName()
	{
		BatchName.sendKeys("SDET69");
	}
	public void clickonBatchDetails()
	{
		BatchDetails.isDisplayed();
	}
	
	public void clickonDescription()
	{
		Description.sendKeys("Test");
	}
	public void Program()
	{
		Program.click();
	}
	public void dropdown()
	{
		Dropdown.click();
	}
	public void updatedName()
	{
		updatedName.isDisplayed();
	}
	public void Status()
	{
		Status.isDisplayed();
	}
	public void Active()
	{
		Active.click();
	}
	public void NoClasses()
	{
	    int myInt = 10;
		Classes.sendKeys(String.valueOf(myInt));
	}
	public void CancelBtn()
	{
		CancelBtn.click();
	}
	public void SaveBtn()
	{
		SaveBtn.click();
	}
	public void SearchBtn()
	{
		Search.sendKeys("SDET69");
	}
	
	
//----------------------------------	Search----------------------------	
	
	@FindBy(xpath=" ")
	WebElement BatchDescription;
	
	@FindBy(xpath=" ")
	WebElement  NoOfClasses;
	
	@FindBy(xpath=" ")
	WebElement ProgrmName;	
	
	public void enterBatchDescription()
	{
		BatchDescription.sendKeys("Java");
	}
	public void enternoofclasses()
	{
		NoOfClasses.click();
	}
	public void enterprogrmname()
	{
		ProgrmName.sendKeys("SDET");
	}
//--------------------Edit--------------------------------------------
	


		@FindBy(xpath=" ")
		WebElement Editbatch1;		
		
		@FindBy(xpath=" ")
		WebElement EditBatchDetails;
		
		@FindBy(xpath=" ")
		WebElement EditBatchName;
		
				
		@FindBy(id=            "  " )
		WebElement EditDescription;
		
		@FindBy(xpath=" ")
		WebElement EditProgram;
		
		@FindBy(xpath=" ")
		WebElement dropdown;
		
		@FindBy(xpath=" ")
		WebElement EditupdatedName;
		
		@FindBy(xpath=" ")
		WebElement EditStatus ;
		
		@FindBy(xpath=" ")
		WebElement EditActive;
		
		@FindBy(id=" ")
		WebElement EditClasses;
		
		@FindBy(xpath=" ")
		WebElement EDitCancelBtn;
		
		@FindBy(xpath=" ")
		WebElement EditSaveBtn;
		
		
		@FindBy(xpath=" ")
		WebElement EditSearch;
		
		
		
	
			public void clickoneditBatch()
		{
			 EditBatch.click();
		}
		public void clickonEditBatchName()
		{
			EditBatchName.sendKeys("SDET69");
		}
		public void clickoneditBatchDetails()
		{
			EditBatchDetails.isDisplayed();
		}
		
		public void clickoneditDescription()
		{
			EditDescription.sendKeys("Test");
		}
		public void editProgram()
		{
			EditProgram.click();
		}
		public void editdropdown()
		{
			dropdown.click();
		}
		public void editupdatedName()
		{
			updatedName.isDisplayed();
		}
		public void editStatus()
		{
			Status.isDisplayed();
		}
		public void editActive()
		{
			Active.click();
		}
		public void editNoClasses()
		{
		    int myInt = 10;
			Classes.sendKeys(String.valueOf(myInt));
		}
		public void editCancelBtn()
		{
			CancelBtn.click();
		}
		public void editSaveBtn()
		{
			SaveBtn.click();
		}
		public void editSearchBtn()
		{
			Search.sendKeys("SDET69");
	
}
		//----------------------MultipleDelete----------------
		
		
		@FindBy(xpath=" ")
		WebElement SelectBatchName;

		@FindBy(xpath = " ")
		WebElement Deletebutton;

		@FindBy(xpath = " ")
		WebElement checkbox;
		
		@FindBy(xpath = " ")
		WebElement Yesbutton;
		
		@FindBy(xpath = " ")
		WebElement Nobutton;
		public void clickonSelectBatchName()
		{
			SelectBatchName.click();
		}
		public void clickoncheckbox()
		{
			checkbox.click();
		}
		
		public void SelectDeletebutton()
		{
			Deletebutton.click();
		}
		
		public void clickonYesbutton()
		{
			Yesbutton.click();
		}
		
		//--------------Table------------
		

		@FindBy(xpath = " ")
		WebElement TableRows;

public int RowsinTable()
{
	TableRows.getSize();
	return 0;
}

		
			public void clickonNobutton()
			{
				Nobutton.click();
			}
		//------------Checkbox-------------
		
				@FindBy(xpath = " ")
				WebElement FirstCheckBox;
		
				public void clickonFirstCheckBox()
				{
					FirstCheckBox.click();
				}
				
				//-------------Page---------------------------
				
				
				@FindBy(xpath = " ")
				WebElement nextbutton;
				
				@FindBy(xpath = " ")
				WebElement PrevButton;
				
				@FindBy(xpath = " ")
				WebElement PageButton;
				
				@FindBy(xpath = " ")
				WebElement lastButton;
				@FindBy(xpath = " ")
				WebElement FirstButton;
				
				public void clickonnextbutton()
				{
					nextbutton.click();
				}
				public void clickonPrevButton()
				{
					PrevButton.click();
				}
				public void clickonPageButton()
				{
					PageButton.click();
				}
				public void clickonlastButton()
				{
					lastButton.click();
				}
				public void clickonFirstButton()
				{
					FirstButton.click();
				}
}
