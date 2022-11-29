package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BaseClass.Base;

public class user extends Base {
	//creating constructor
	public user(WebDriver webDriver)
	{
		
		PageFactory.initElements(webDriver,this);
	}
	
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement afterloginpage;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement progpage;
	//Header Validation
	
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicktabuser;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement seemanageuserpage;
	//pagination
	
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement onmanageuserpage;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement seepaginationcontrol;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement lessor5rows;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement paginationdisabled;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement morethan5rows;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement paginationenabled;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksnextpageofpagin;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement nextpagedisplayed;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement lastpagedisplayed;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicknextlinkpagilast;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement nextpagepagidisabled;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement adusstatabledispalyed;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksprevlinkofpagin;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement prevpageshoulbdisplayed;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement firstpageusertabldispl;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement prevpageshoulbdisabled;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement prevpageshoulbdispalyed;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement clickspprivious;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement seefirstpageoftab;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksnnext;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement seelastpageoftab;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement landonmanageusrpage;
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement shldseeshowng1to4;
	
	//footervalidation
	@FindBy(xpath = " ")
	@CacheLookup
	public WebElement tabfoottot4;
	//Add New User Functionality
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seeadduser;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksaddnewuser;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seeuserdetailsdialogbox;
    //Tableheader
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seeemptyheader;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksorticon;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement tablerowsorted;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement checksemptycheckbox;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement checkboxallrowchecked;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement uncheckscheckbox;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement unchecked;
    //delete icon
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement deleteicontopleft;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement norochecked;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement deleteicontopleftdisabled;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement checksrowusertable;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement deleteicontopleftenabled;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksdeleteicontopleft;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement confirmdialogboxdisplayed;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement confirmno;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement dialogboxclosed;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement confirmyes;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement selrowdel;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement confirmdialbox;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clickclosedialogbox;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement dialogclosed;
    //Edit/Delete icon in each row
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seeeditdeleteicon;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksdelete;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement confirmboxdispl;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksedit;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement dialogbclosed;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement userdetailsdialogdisp;
    //search
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement searchboxdisp;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seesearchicon;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement typenamtosearch;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement rowwitnamdisp;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement randomtext;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement norowdisp;
    //ID
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksID;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement dialogboxwituserinfo;
    //"User Details" Window
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement addnew;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seeuserdetailswin;
    //cancel button
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seecancelbutton;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clickscancelbutton;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seecancelwinclosed;
    //cancel x icon
    //submit
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement submit;
    //labeltext
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seetextfnamest;
    //inputfield
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seeinputfnamest;
    //dropdown
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement onUserdetailswin;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksdropdownstateicon;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksdropdownmenustate;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksdropdowniconuserrole;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksdropdownmenuuserrole;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement dropdownstatemenu;
    //Submit button functionality
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksemptysubmit;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement errmsg;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement submitenterallfield;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement usercreatedsuccess;
    //namefield
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement enterdsomenamesubmit;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement enterdsomephonesubmit;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement namereqmsg;
    //emailid
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement wrongmailsubmit;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement invalidmailmsg;
    //address2 button
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seetext;
    //phonenumber
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement morethan10;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement invalidinput;
    //postalcode
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement morethan5;
//state
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksstatedpdown;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement alphabetorder;
    //ugprogram
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clicksugdpdown;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seeugplist;
    //validating address line
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement clickaddsuite;
    @FindBy(xpath = " ")
	@CacheLookup
	public WebElement seenewlabel;
    //pagevalidation
    public void onanypage()
    {
    	progpage.click();
    }
    public void clicksusertab()
    {
    	clicktabuser.click();
    }
    public void seemanagepage()
    {
    	seemanageuserpage.isDisplayed();
    }
  //header  
    public void managedisplayed()
    {
    	onmanageuserpage.isDisplayed();
    }
    //pagination
    public void pagcon()
    {
    	seepaginationcontrol.isDisplayed();
    }
    public void onmanaguserpage()
    {
    	onmanageuserpage.click();
    }
    public void row5orless()
    {
    	lessor5rows.click();
    }
    public void pagdisabled()
    {
    	paginationdisabled.click();
    }
    public void morethan5()
    {
    	morethan5.click();
    }
    public void pagenabled()
    {
    	paginationenabled.click();
    }
    public void nextlinkpag()
    {
    	clicksnextpageofpagin.click();
    }
    public void nextlinkpagdis()
    {
    	nextpagedisplayed.click();
    }
    
    public void nextlinkpagdisabled()
    {
    	nextpagepagidisabled.click();
    }
    public void clicksprevlinkpag()
    {
    	clicksprevlinkofpagin.click();
    }
    public void clicksprevlinkdisplayed()
    {
    	prevpageshoulbdisplayed.click();
    }
    public void firstpagetb()
    {
    	firstpageusertabldispl.click();
    }
    public void prevlinkdisabled()
    {
    	prevpageshoulbdisabled.click();
    }
    public void clickspprevious()
    {
    	firstpageusertabldispl.click();
    }
    public void clicksnnext()
    {
    	lastpagedisplayed.click();
    }
    public void landonmanageusrpage()
    {
    	landonmanageusrpage.click();
    }
    public void oneto4()
    {
    	shldseeshowng1to4.click();
    }
    //footer
    public void totalfooter()
    {
    	tabfoottot4.click();
    }
	//addnewuser
    public void seeadduser()
    {
    	seeadduser.isDisplayed();
    }
    public void clicksadduser()
    {
    	clicksaddnewuser.click();
    }
    public void adduserdiaologue()
    {
    	seeuserdetailsdialogbox.click();
    }
    //tableheader
    public void seeemptyheader()
    {
    	seeemptyheader.isDisplayed();
    }
    public void clicksorticon()
    {
    	clicksorticon.click();
    }
    public void rowssorted()
    {
    	tablerowsorted.isDisplayed();
    }
    public void checksemptycheckbox()
    {
    	checksemptycheckbox.click();
    }
    public void allcheckboxchecked()
    {
    	checkboxallrowchecked.isDisplayed();
    }
    public void uncheck()
    {
    	uncheckscheckbox.click();
    }
    public void allunchecked()
    {
    	unchecked.isDisplayed();
    }
    //delete
    public void seedelete()
    {
    	deleteicontopleft.isDisplayed();
    }
    public void norowchecked()
    {
    	norochecked.isDisplayed();
    }
    public void deletedisabled()
    {
    	deleteicontopleftdisabled.isDisplayed();
    }
    public void checksarow()
    {
    	checksrowusertable.isDisplayed();
    }
    public void delenabled()
    {
    	deleteicontopleftenabled.isDisplayed();
    }
    public void clickdelete()
    {
    	clicksdeleteicontopleft.click();
    }
    public void dialogbox()
    {
    	confirmdialogboxdisplayed.click();
    }
    public void nodialogbox()
    {
    	confirmno.click();
    }
    public void dialogboxclosed()
    {
    	dialogboxclosed.click();
    }
    public void dialogboxyes()
    {
    	confirmyes.click();
    }
    public void succesdelmsg()
    {
    	selrowdel.isDisplayed();
    }
    public void close()
    {
    	clickclosedialogbox.click();
    }
    public void closeconfirm()
    {
    	dialogclosed.click();
    }
    //edit/delete
    public void seeeditdelete()
    {
    	seeeditdeleteicon.isDisplayed();
    }
    public void clicksdelete()
    {
    	clicksdelete.click();
    }
    public void rusure()
    {
    	confirmboxdispl.isDisplayed();
    }
    public void clicksedit()
    {
    	clicksedit.click();
    }
    public void userdetailsdisplayed()
    {
    	userdetailsdialogdisp.isDisplayed();
    }
    //search
    public void serchdisplyed()
    {
    	searchboxdisp.isDisplayed();
    }
    public void serchicon()
    {
    	seesearchicon.isDisplayed();
    }
    public void typenamesearch(String batch)
    {
    	typenamtosearch.sendKeys("batch");
    }
    public void rowdis()
    {
    	rowwitnamdisp.isDisplayed();
    }
    public void randomtext()
    {
    	randomtext.click();
    }
    public void norowdisp()
    {
    	norowdisp.click();
    }
    //id
    public void clicksid()
    {
    	clicksID.click();
    }
    public void dispid()
    {
    	dialogboxwituserinfo.click();
    }
    //userdetails
    public void clicksadduse()
    {
    	addnew.click();
    }
    public void seeuserdetail()
    {
    	seeuserdetailswin.isDisplayed();
    }
    public void seecancel()
    {
    	seecancelbutton.isDisplayed();
    }
    public void clickscancel()
    {
    	clickscancelbutton.click();
    }
    public void winclosd()
    {
    	seecancelwinclosed.isDisplayed();
    }
    //submit
    public void submit()
    {
    	submit.isDisplayed();
    }
    //labeltext
    public void placehodernametext()
    {
    	seetextfnamest.isDisplayed();
    }
    //input
    public void inputfield()
    {
    	seeinputfnamest.isDisplayed();
    }
    //dropdown
    public void onUserdetailswin()
    {
    	onUserdetailswin.isDisplayed();
    }
    public void seedropdwmenu()
    {
    	dropdownstatemenu.isDisplayed();
    }
    
	public  void clicksdropdownstateicon() {
//		Select dropdown=new Select(us);
//        dropdown.selectByVisibleText("US");
      }
    
    //
    public void clicksusericon()
    {
    	clicksdropdownmenustate.click();
    }
    public void selectuserrole()
    {
    	
    }
    public void subfun()
    {
    	clicksemptysubmit.click();
    }
    public void error()
    {
    	errmsg.isDisplayed();
    }
    public void allsub(String all)
    {
    	submitenterallfield.sendKeys(all);
    }
    public void success()
    {
    	usercreatedsuccess.isDisplayed();
    }
    //
    public void entersom(String address,String phone)
    {
    	enterdsomenamesubmit.sendKeys("eee");
    	enterdsomephonesubmit.sendKeys("12233444");
    }
    public void namereq()
    {
    	namereqmsg.isDisplayed();
    }
    //email
    public void wrongemail(String mail)
    {
    	namereqmsg.sendKeys("rad@lmgh.com");
    }
    public void msg()
    {
    	invalidmailmsg.click();
    }
    //
    public void seetext()
    {
    	seetext.isDisplayed();
    }
    //
    public void morethan10(String no)
    {
    	morethan10.sendKeys("1234554322");
    }
    public void invalid()
    {
    	invalidinput.isDisplayed();
    }
    //
    public void morethan5(String postal)
    {
    	morethan5.sendKeys("1234567");
    }
    //
    public void clicksstatedp()
    {
    	
    }
    public void alphabet()
    {
    	alphabetorder.isDisplayed();
    }
    //
    public void ugdp()
    {
    	
    }
    public void listugdp()
    {
    	seeugplist.isDisplayed();
    }
    //
    public void add()
    {
    	clickaddsuite.click();
    }
    public void addifield()
    {
    	seenewlabel.isDisplayed();
    }
    
    
}
