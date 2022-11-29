package PageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;

public class Program extends Base  {


	public Program(WebDriver driver){
		PageFactory.initElements(driver,this);
		}
  //---------------------------HEADER----------------------------
  @FindBy (xpath="")
  WebElement Header;
  //--------------------------FOOTER----------------------------
  @FindBy (xpath="")
  WebElement Footer;
 
  //------------------------PAGINATOR----------------------------
  @FindBy(xpath="")
  WebElement proPaginator;
  
  @FindBy (xpath="")
  WebElement btnFirstNav;
  @FindBy (xpath="")
  WebElement getFirstNav;
  @FindBy (xpath="")
  WebElement btnNext;
  @FindBy (xpath="")
  WebElement getNext;
  @FindBy (xpath="")
  WebElement btnPrevoius;
  @FindBy (xpath="")
  WebElement getPrevoius;
  @FindBy (xpath="")
  WebElement btnLastNav;
  @FindBy (xpath="")
  WebElement getLastNav;
 
  //------------------------SEARCH---------------------------
  
  @FindBy (xpath="")
  WebElement txtSearch;
  
    
  @FindBy(xpath="")
  WebElement ascProName;
  @FindBy(xpath="")
  WebElement decProName;
  @FindBy(xpath="")
  WebElement ascProdes;
  @FindBy(xpath="")
  WebElement dscProdes;
  @FindBy(xpath="")
  WebElement ascProStatus;
  @FindBy(xpath="")
  WebElement dscProStatus;
  
  //--------------------ADDNEWPROGRAM------------------------------
  
  @FindBy(xpath="")
  WebElement btnNewProgram;
  @FindBy(xpath="")
  WebElement txtProDetailName;
  @FindBy(xpath="")
  WebElement txtProDescription;
  @FindBy(xpath="")
  WebElement rdoSActive;
  @FindBy(xpath="")
  WebElement rdoSIntactive;
  @FindBy(xpath="")
  WebElement btnSave;
  @FindBy(xpath="")
  WebElement btnCancel;
  @FindBy(xpath="")
  WebElement btnClose;
  
//----------------------DELETEE MULTIPLE RECORDS-------------------------
  
  @FindBy (xpath="")
  WebElement deleteMulRecords;
  @FindBy (xpath="")
  WebElement deleteMultRecordsYes;
  @FindBy (xpath="")
  WebElement deleteMultRecordsNo;

  //------------------------CHECKBOX----------------------------
  @FindBy (xpath="")
  WebElement  MultiplecheckBox;
  @FindBy (xpath="")
  WebElement rowonecheckBox;
  
  
  
  //-----------------------EDIT-------------------------------------
 
  @FindBy (xpath="")
  WebElement btnEdit;
 //-------------------------DELETE-----------------------------------
  @FindBy (xpath="")
    WebElement btnDelete;
 
//---------------------------------NOOF ROWS------------------------  
  @FindBy(xpath=(""))
	List<WebElement> rows;
//----------------------------------SUGGESTIONS------------------------
  @FindBy(xpath=(""))
	WebElement Suggestionmsg;
  //----------------------------------DELETE------------------------
  @FindBy(xpath = "")
  WebElement  deletelink;
  
  @FindBy (xpath="")
  WebElement deletetext;
  
  @FindBy (xpath="")
  WebElement yesdelete;
  
  @FindBy (xpath="")
  WebElement yesdeletesuccessmsg;
  
  @FindBy (xpath="")
  WebElement nodeletesuccessmsg;
  
  @FindBy (xpath="")
  WebElement notdeletemsg;
   
  
  
  @FindBy (xpath="")
  WebElement SearchDelete;
  @FindBy (xpath="")
  WebElement btnDeleteMulRecords;

  @FindBy (xpath="")
  WebElement Successmsg;
  @FindBy (xpath="")
  WebElement txtProgramName;
 
  @FindBy(xpath="")
  WebElement errormsgpopup;
  
 //-----------------------------------------------------------------------------------------------
  public String geterrormsg() 
  {
	    String geterror = errormsgpopup.getText();
	    return geterror;
   }
  
  public void txtProgramName(String stext)  
  {
	   txtProgramName.sendKeys(stext);
	    return ;
  }
  
  public String getSuccessBox() 
  {
	    String SuccessMSg = Successmsg.getText();
	    return SuccessMSg;
   }
  public void verifyDeleteButton() 
  {
	    btnDeleteMulRecords.isDisplayed();
  }
  
   
  public void SearchDelete(String searchText) 
  {
	    SearchDelete.sendKeys(searchText);
	    return;
	  }
  public void nodeletemsg()
  {
	  notdeletemsg.getText();
  }
   
  public void nodeletesuccessmsg()
  {
	  nodeletesuccessmsg.getText();
  }
   
  public void yesdeletesuccessmsg()
  {
	  yesdeletesuccessmsg.getText();
  }
  public void yesdelete()
  {
	  yesdelete.click();
  }
  public void deletetext()
  {
  deletetext.getText();
  }
  
  public void deletelink()
  {
	  deletelink.click();
    
  }   
  public void mainCheckBox()
  {
	  MultiplecheckBox.click();
    
  }   
  
  public String getSuggestionBox()  
  {
		String SuggestionMSg = Suggestionmsg.getText();
		return SuggestionMSg;
  }
  
  public int getrows() {
  		int rowSize = rows.size();
  		return rowSize;
  	}

  
  public void Closebutton()
  {
	  btnClose.click();
    
  }
  public void Savebutton()
  {
	  btnSave.click();
    
  }
  public void Cancelbutton()
  {
	  btnCancel.click();
    
  }
  
  public void deleteMultipleRecordsYes()
  {
	  deleteMultRecordsYes.click();
    
  }
  public void deleteMultipleRecordsNo()
  {
	  deleteMultRecordsNo.click();
    
  }
  
  public void Edit()
  {
	  btnEdit.click();
    
  }
  public void btnDelete()
  {
	  btnDelete.click();
    
  } 
  
  
  public void radiosactive()
  {
	  rdoSActive.click();
    
  }

  public void radiosinactive()
  {
	  rdoSIntactive.click();
    
  }
  public void Newprograme()
  {
	  btnNewProgram.click();
    
  }
  public void txtprogramname(String entername)
  {
	  txtProDetailName.sendKeys(entername + Keys.TAB);
    
  }

  public void txtprogramdescription(String enterdes)
  {
	  txtProDescription.sendKeys(enterdes + Keys.TAB);
    
  }
  
  public void Ascprogramname()
  {
	  ascProName.click();
    
  }
  public void Dscprogramname()
  {
	  decProName.click();
    
  }
  public void Ascprogramdescription()
  {
	  ascProdes.click();
    
  }
  public void AscprogramStatus()
  {
	  ascProStatus.click();
    
  }
  public void dscprodescription()
  {
	  dscProdes.click();
  }
  public void Dscprograstatus()
  {
	  dscProStatus.click();
    
  }
  
    public String HeaderName()
  {
    return Header.getText();
    
  }
  
  public String FooterName()
  {
    return Footer.getText();
  }
  public String programpaginator()
  {
	 proPaginator.click();
	return proPaginator.getText();
  }
  
  public void FirstNav()
  {
    btnFirstNav.click();
  }
  
  public void NextButton()
  {
    btnNext.click();
  }
  
  public void PrevoiusButton()
  {
    btnPrevoius.click();
  }
  
  public void LastNav()
  {
    btnLastNav.click();
    
    
  }
  
  public String getfirstnav()  
  {
		String getfirst = getFirstNav.getText();
		
		return getfirst;
		
  }
  public String getNext()  
  {
		String getNext1 = getNext.getText();
		
		return getNext1;
		
  }
  public String getPrevious()  
  {
		String getNext2 = getPrevoius.getText();
		
		return getNext2;
		
  }
  public String getLastNav()  
  {
		String getNext3 = getLastNav.getText();
		
		return getNext3;
		
  }
  
  public void DeleteMultipleRecords()
  {
    deleteMulRecords.click();
  }
  
  public void Search(String SearchElement)
  {
    txtSearch.sendKeys(SearchElement +Keys.ENTER);
  }
}