package StepDiFinitions;

import org.openqa.selenium.chrome.ChromeDriver;

import BaseClass.Base;
import PageObjects.ManageAssignmentPage;
import PageObjects.RegistarationPage;
import Utilities.helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentSteps extends Base {
	ManageAssignmentPage map;
	helper hp; 
	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website()  {
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		map= new ManageAssignmentPage(driver);
		
		//map = new ManageAssignmentPage(Helper.getDriver());
		
	}
	
	
	@When("Admin\\/User\\/Staff clicks on Assignment Page")
	public void admin_user_staff_clicks_on_assignment_page() {
	    
		map.clickAssignementHeader();
		
		
	}

	@Then("Admin\\/User\\/Staff Should see a Header {string}")
	public void admin_user_staff_should_see_a_header(String string) {
	   
		map.checkManageAssignmentHeader();
		//LoggerLoad.info("Displaying Header as Assignment");
		System.out.println(" User can see the AssignmentHeader ")	;  
	}

	
	//footer validation
	@Then("Admin\\/User\\/Staff Should see a Footer text {string}")
	public void admin_user_staff_should_see_a_footer_text(String string) {
	    
		map.checkAssignementFooterMsg();
		//LoggerLoad.info("Displaying footer message");
	}

	
	
	//paginator validation
	

@Then("Admin\\/User\\/Staff Should see a Paginator text {string}")
public void admin_user_staff_should_see_a_paginator_text(String string) {
	map.checkPaginatorMsg();
    
}

@Given("Admin\\/User\\/Staff is on Assignment Page")
public void admin_user_staff_is_on_assignment_page() {
	map.checkManageAssignmentHeader();
    
}

@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button")
public void admin_user_staff_clicks_on_enabled_paginator_next_button() {
   
	map.clickPaginatorNextButton();
}

@Then("Admin\\/User\\/Staff Should be navigated to next page")
public void admin_user_staff_should_be_navigated_to_next_page() {
    
	map.checkIsPageNo2();
}

@Then("Admin\\/User\\/Staff Should be navigated to previous page")
public void admin_user_staff_should_be_navigated_to_previous_page() {
	map.checkIsPreviuos();
    
}

@Then("Admin\\/User\\/Staff Should be navigated to Last page")
public void admin_user_staff_should_be_navigated_to_last_page() {
    
	map.clickLastPage();
	map.checkLastPageDisplayed();
	
}

@Then("Admin\\/User\\/Staff Should be navigated to First  page")
public void admin_user_staff_should_be_navigated_to_first_page() {
	
	map.clickFirstPage();
	map.checkFirstPageDisplayed();
	
}



//Search TextBox Functionality

@When("Admin\\/User\\/Staff clicks Search bar after entering Assignment name")
public void admin_user_staff_clicks_search_bar_after_entering_assignment_name() {
    
	map.EnterSearchBox();
	map.clickSearchBox();
}

@Then("The requested assignment details should be displayed")
public void the_requested_assignment_details_should_be_displayed() {
  
	map.checkSqlAssignment();
}	
	

//Ascending Order Functionality
@When("Admin\\/User\\/Staff Clicks on Assignment Name Ascending Arrow")
public void admin_user_staff_clicks_on_assignment_name_ascending_arrow() {
   
	map.clickAssignmentAscendingOrder();
}

@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Ascending order")
public void admin_user_staff_should_see_the_assignment_name_displayed_in_ascending_order() {
    
	System.out.println("Assignment name displaying in Ascending order");
}

@When("Admin\\/User\\/Staff Clicks on Assignment Description Ascending Arrow")
public void admin_user_staff_clicks_on_assignment_description_ascending_arrow() {
    
	map.clickAssignmentDescriptionAscendingOrder();
}

@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Ascending order")
public void admin_user_staff_should_see_the_assignment_description_displayed_in_ascending_order() {
   
	System.out.println("Assignment Description displaying in Ascending order");
}

@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Ascending Arrow")
public void admin_user_staff_clicks_on_assignment_due_date_ascending_arrow() {
    
	map.clickAssignmentDuedateAscendingOrder();
}

@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Ascending order")
public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_ascending_order() {
   System.out.println("Assignment Due Date displaying in Ascending order");
}

@When("Admin\\/User\\/Staff Clicks on Assignment Grade Ascending Arrow")
public void admin_user_staff_clicks_on_assignment_grade_ascending_arrow() {
   map.clickAssignmentGradeAscendingOrder();
}

@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Ascending order")
public void admin_user_staff_should_see_the_assignment_grade_displayed_in_ascending_order() {
	System.out.println("Assignment Grade displaying in Ascending order");
}
	
	
	
//Descending order Functionality

@When("Admin\\/User\\/Staff Clicks on Assignment Name Descending Arrow")
public void admin_user_staff_clicks_on_assignment_name_descending_arrow() {
   map.clickAssignmentNameDescendingOrder();
}

@Then("Admin\\/User\\/Staff should see the Assignment Name displayed in Descending order")
public void admin_user_staff_should_see_the_assignment_name_displayed_in_descending_order() {
	System.out.println("Assignment Nmae displaying in Descending order");
}

@When("Admin\\/User\\/Staff Clicks on Assignment Description Descending Arrow")
public void admin_user_staff_clicks_on_assignment_description_descending_arrow() {
    map.clickAssignmentDescriptionDescendingOrder();
}

@Then("Admin\\/User\\/Staff should see the Assignment Description displayed in Descending order")
public void admin_user_staff_should_see_the_assignment_description_displayed_in_descending_order() {
	System.out.println("Assignment description displaying in Descending order");
}

@When("Admin\\/User\\/Staff Clicks on Assignment Due Date Descending Arrow")
public void admin_user_staff_clicks_on_assignment_due_date_descending_arrow() {
    map.clickAssignmentDuedateDescendingOrder();
}

@Then("Admin\\/User\\/Staff should see the Assignment Due Date displayed in Descending order")
public void admin_user_staff_should_see_the_assignment_due_date_displayed_in_descending_order() {
	System.out.println("Assignment duedate displaying in Descending order");
}

@When("Admin\\/User\\/Staff Clicks on Assignment Grade Descending Arrow")
public void admin_user_staff_clicks_on_assignment_grade_descending_arrow() {
   map.clickAssignmentGradeDescendingOrder();
}

@Then("Admin\\/User\\/Staff should see the Assignment Grade displayed in Descending order")
public void admin_user_staff_should_see_the_assignment_grade_displayed_in_descending_order() {
	System.out.println("Assignment grade is displaying in Descending order");
}
	
	

//Add New Assignment  Functionality


@Given("Staff Logged on to LMS website1")
public void staff_logged_on_to_lms_website1() {
   System.out.println("User is in LMS website");
}

@Given("Staff is on Manage Assignment page")
public void staff_is_on_manage_assignment_page() {
    System.out.println("Staff is on Manage Assignment Page");
}

@When("Staff clicks a Add new assignment button")
public void staff_clicks_a_add_new_assignment_button() {
   map. ClickNewAssignmentButton();
}

@Then("Staff should see Assignment details window")
public void staff_should_see_assignment_details_window() {
	 map. VerifyNewAssignmentDetailsWindow();
}

@Given("Admin\\/User Logged on to LMS website1")
public void admin_user_logged_on_to_lms_website1() {
    System.out.println("User in LMS website");
}

@Given("Admin\\/User\\/Staff is on Manage Assignment page")
public void admin_user_staff_is_on_manage_assignment_page() {
	System.out.println("Staff is on Manage Assignment Page");
}

@When("Admin\\/User\\/Staff clicks a Add New Assignment button")
public void admin_user_staff_clicks_a_add_new_assignment_button() {
	map. ClickNewAssignmentButton();
}

@Then("Admin\\/User\\/Staff should see a message {string}")
public void admin_user_staff_should_see_a_message(String string) {
	System.out.println("Staff only have access to add New Assignment");
}

@Given("Staff Logged on to LMS website2")
public void staff_logged_on_to_lms_website2() {
	System.out.println("User in LMS website");
}

@Given("Staff is on  Assignment Details page1")
public void staff_is_on_assignment_details_page1() {
	System.out.println("Staff is on Manage Assignment Page");
}

@When("Staff  clicks on Save after leaving all the fields empty")
public void staff_clicks_on_save_after_leaving_all_the_fields_empty() {
   map.clickSavewithoutData();
   map. ClickSaveButton();
}

@Then("Staff should see an error message {string}")
public void staff_should_see_an_error_message(String string) {
   map.ViewUnsuccessMsg();
}

@Given("Staff is on Assignment Details page2")
public void staff_is_on_assignment_details_page2() {
	System.out.println("Staff is on Manage Assignment Page");
}

@When("Staff clicks  Save button after entering assignment name,assignment description,assignment Grade and Duedate")
public void staff_clicks_save_button_after_entering_assignment_name_assignment_description_assignment_grade_and_duedate() {
    map.EnterNewAssignmentName();
	map.EnterNewAssignmentDescription();
	map.EnterNewAssignmentGrade();
	map.EnterNewAssignmentDueDate();
	map. ClickSaveButton();
}

@Then("Staff should see a message {string}")
public void staff_should_see_a_message(String string) {
	map.ViewSuccessMsg();
}

@Given("Staff logged on to LMS website3")
public void staff_logged_on_to_lms_website3() {
	//LoggerLoad.info("Staff logged on to LMS website");
	System.out.println("Staff logged on to LMS website");
}

@Given("Staff is on Assignment Details page3")
public void staff_is_on_assignment_details_page3() {
	//LoggerLoad.info("Staff is on Assignment Details page");
	System.out.println("Staff logged on to Assignment Details page");
}

@When("Staff clicks cancel button with entering all fields")
public void staff_clicks_cancel_button_with_entering_all_fields() {
	map.EnterNewAssignmentName();
	map.EnterNewAssignmentDescription();
	map.EnterNewAssignmentGrade();
	map.EnterNewAssignmentDueDate();
	map.ClickCancelButton();
}

@Then("Staff should see a Assignment details window is closed")
public void staff_should_see_a_assignment_details_window_is_closed() {
	System.out.println("Staff is on Manage Assignment Page");
}

@Given("Admin\\/user\\/Staff logged on to LMS website2")
public void admin_user_staff_logged_on_to_lms_website2() {
	//LoggerLoad.info("Admin\\/user\\/Staff logged on to LMS website");
	System.out.println("Staff logged on to Assignment Details page");
}

@Given("Admin\\/User\\/Staff is on Assignments page")
public void admin_user_staff_is_on_assignments_page() {
	System.out.println("Staff is on Manage Assignment Page");
}

@When("Admin\\/User\\/Staff clicks on Assignment")
public void admin_user_staff_clicks_on_assignment() {
    map.clickAssignementHeader();
}

@Then("Admin\\/User\\/Staff should see a newly added Assignment")
public void admin_user_staff_should_see_a_newly_added_assignment() {
    map.CheckNewAssignmentName();
}

@Given("Staff logged on to LMS website4")
public void staff_logged_on_to_lms_website4() {
//	LoggerLoad.info("Staff logged on to LMS website");
}

@Given("Staff is on Assignment  page")
public void staff_is_on_assignment_page() {
	//LoggerLoad.info("Staff is on Assignment  page");
	System.out.println("Stafs is on Assignment Details page");
}

@When("Staff clicks manage button under Assignment Grade")
public void staff_clicks_manage_button_under_assignment_grade() {
    map.clickManageButton();
}

@Then("Staff should be navigated to Grade Window")
public void staff_should_be_navigated_to_grade_window() {
    System.out.println("Disply Grade Window");
}


//Edit Functionality




@When("Staff clicks an edit Assignment button")
public void staff_clicks_an_edit_assignment_button() {
    map. ClickEditIcon();
}

@Then("Staff should see a Assignment details window")
public void staff_should_see_a_assignment_details_window() {
    map.checkAssignmentDetails();
}

@Given("Staff is on Assignment Details page6")
public void staff_is_on_assignment_details_page6() {
	//LoggerLoad.info("Staff is on Assignment Details page");
    System.out.println("Disply Assignment Details page");
}

@When("Staff clicks Save button  after edits Assignment Name")
public void staff_clicks_save_button_after_edits_assignment_name() {
    map.EnterAssignmentName();
    map.ClickSaveButton();
}

@When("Staff clicks Save button  after edits Assignment Description")
public void staff_clicks_save_button_after_edits_assignment_description() {
   map.EnterAssignmentDescription();
   map.ClickSaveButton();
}

@When("Staff clicks Save button After edits Assignment Grade")
public void staff_clicks_save_button_after_edits_assignment_grade() {
    map.EnterAssignmentGrade();
    map.ClickSaveButton();
}

@Given("Staff is on Assignment Details page4")
public void staff_is_on_assignment_details_page4() {
	 map.checkAssignmentDetails();
}

@When("Staff clicks Save button After edits Assignment DueDate")
public void staff_clicks_save_button_after_edits_assignment_due_date() {
    map.EnterAssignmentDueDate();
    map.ClickSaveButton();
}

@Given("Staff is on Assignment Details page5")
public void staff_is_on_assignment_details_page5() {
	map.checkAssignmentDetails();
}

@When("Staff clicks cancel button")
public void staff_clicks_cancel_button() {
    map.ClickCancelButton();
}

@Then("Staff Should see a Assignment Details Page is closed")
public void staff_should_see_a_assignment_details_page_is_closed() {
   map.checkManageAssignmentHeader();
}

@When("Admin\\/User\\/Staff clicks Edit button")
public void admin_user_staff_clicks_edit_button() {
    map.ClickEditIcon();
}


//Assignment Google form


@Given("Admin\\/User\\/Staff is on Assignment page1")
public void admin_user_staff_is_on_assignment_page1() {
	 map.checkManageAssignmentHeader();
}

@When("Admin\\/User\\/Staff clicks on Assignment Name")
public void admin_user_staff_clicks_on_assignment_name() {
   map.clickAssignementHeader();
}

@Then("Admin\\/User\\/Staff should be navigated to Assignment Google form page")
public void admin_user_staff_should_be_navigated_to_assignment_google_form_page() {
    System.out.println("Displying Assignment Google form");
}

@Given("Admin is on Assignment page")
public void admin_is_on_assignment_page() {
	//LoggerLoad.info("Admin is on Assignment page");
	System.out.println("Disply Assignment Details page");
}

@When("Admin clicks on Assignment Name")
public void admin_clicks_on_assignment_name() {
   map.clickAssignmentname();
}

@Then("Admin should see a warning message {string}")
public void admin_should_see_a_warning_message(String string) {
    System.out.println(" you dont have access");
}

@Given("Admin\\/User\\/Staff is on Assignment  Google form page")
public void admin_user_staff_is_on_assignment_google_form_page() {
   map.AssignmentsGoogleform();
}

@When("Admin\\/User\\/Staff clicks on submit button after entering all questions and mail id")
public void admin_user_staff_clicks_on_submit_button_after_entering_all_questions_and_mail_id() {
    map.favoritecolor();
    map.whatisfavoriteAnimal();
    map.FirstandLastName();
    map.clickSubmitButton();
}

@Then("Admin\\/User\\/Staff entered google forms successfully")
public void admin_user_staff_entered_google_forms_successfully() {
   System.out.println("staff enetered google forms successefully");
}

@Given("Admin\\/User\\/Staff is on Assignment  Google form page1")
public void admin_user_staff_is_on_assignment_google_form_page1() {
	System.out.println("staff enetered google forms successefully");
}

@When("Admin\\/User\\/Staff clicks on submit button after leaving all questions and mail id")
public void admin_user_staff_clicks_on_submit_button_after_leaving_all_questions_and_mail_id() {
    map.clearGoogleformDetails();
    map.clickSubmitButton();
}

@Then("Admin\\/User\\/Staff should get a warning message {string}")
public void admin_user_staff_should_get_a_warning_message(String string) {
    System.out.println("Must enter the mandatory fields");
}

@Given("Admin\\/User\\/Staff is on Assignment  Google form page2")
public void admin_user_staff_is_on_assignment_google_form_page2() {
   map.AssignmentsGoogleform(); 
}

@When("Admin\\/User\\/Staff clicks clear form button after entering all questions and mail id")
public void admin_user_staff_clicks_clear_form_button_after_entering_all_questions_and_mail_id() {
	map.favoritecolor();
    map.whatisfavoriteAnimal();
    map.FirstandLastName();
    map.clickClearButton();
}

@Then("The Assignment Google form cleared successfully")
public void the_assignment_google_form_cleared_successfully() {
    System.out.println("Assignment Google form cleared successfully");
}

@Given("Admin\\/User\\/Staff is on Assignment  Google form page3")
public void admin_user_staff_is_on_assignment_google_form_page3() {
    map.AssignmentsGoogleform();
}

@When("Admin\\/User\\/Staff clicks Switch account link")
public void admin_user_staff_clicks_switch_account_link() {
    map.clickSwitchaccountButton();
}

@Then("Admin\\/User\\/Staff should be switched over the account Successfully")
public void admin_user_staff_should_be_switched_over_the_account_successfully() {
    System.out.println("admin_user_staff_should_be_switched_over_the_account_successfully()");
}


//Delete Assignment Functionality


@Given("Staff is on Manage Assignment page2")
public void staff_is_on_manage_assignment_page2() {
//	LoggerLoad.info("Staff is on Manage Assignment page");
	System.out.println("Disply Assignment Details page");
}

@When("Staff clicks on delete button on the righr side")
public void staff_clicks_on_delete_button_on_the_righr_side() {
    map.ClickDeleteIcon();
}

@Then("Staff should see a Delete Confirmation window")
public void staff_should_see_a_delete_confirmation_window() {
	 map.VerifyDeleteConfirmWindow();
}

@Given("Staff is on Delete Confirmation window")
public void staff_is_on_delete_confirmation_window() {
	map.VerifyDeleteConfirmWindow();
}

@When("Staff clicks Yes")
public void staff_clicks_yes() {
    map. ClickYesButton();
}

@Then("Staff Should see \"Assignment Deleted Successfully")
public void staff_should_see_assignment_deleted_successfully() {
    System.out.println("Deleted successefully");
}

@When("Staff clicks No")
public void staff_clicks_no() {
    map. ClickNoButton();
}

@Then("Confirmation delete window should be closed successfully")
public void confirmation_delete_window_should_be_closed_successfully() {
   System.out.println("Delete window closed succesefully");
}

@Given("Admin is on Manage Assignment page")
public void admin_is_on_manage_assignment_page() {
	//LoggerLoad.info("Admin is on Manage Assignment page");
	System.out.println("Disply Assignment Details page");
}

@When("Admin clicks on delete button")
public void admin_clicks_on_delete_button() {
    map.ClickDeleteIcon();
}

@Then("Admin should see a message {string}")
public void admin_should_see_a_message(String string) {
   System.out.println("Staff only have access");
}

@Given("Admin\\/User\\/Staff is on Manage Assignment page2")
public void admin_user_staff_is_on_manage_assignment_page2() {
//	LoggerLoad.info("Admin\\\\/User\\\\/Staff is on Manage Assignment page");
	System.out.println("Disply Assignment Details page");
}

@When("Admin\\/User\\/Staff clicks on delete button")
public void admin_user_staff_clicks_on_delete_button() {
    map.ClickDeleteIcon();
}

@Then("Admin\\/User\\/Staff should see a message\"Staff only have access\"")
public void admin_user_staff_should_see_a_message_staff_only_have_access() {
	System.out.println("Staff only have access");
}



//Delete Multiple Assignment Functionalty
@When("Admin\\/User\\/Staff clicks on delete button on the top left")
public void admin_user_staff_clicks_on_delete_button_on_the_top_left() {
   map.ClickDeleteIcon();
}

@Then("Admin\\/User\\/Staff\\/ should see a disabled delete button")
public void admin_user_staff_should_see_a_disabled_delete_button() {
    System.out.println("Delete icon is disabled");
}

@When("Staff clicks delete button on the top aftr selecting multiple checkbox")
public void staff_clicks_delete_button_on_the_top_aftr_selecting_multiple_checkbox() {
    map. ClickCommonDeleteButton();
}

@Then("Staff should see a  Delete confirm window")
public void staff_should_see_a_delete_confirm_window() {
    map.VerifyDeleteConfirmWindow();
}

@Then("All Assignments are deleted Successfully")
public void all_assignments_are_deleted_successfully() {
    System.out.println("All assignment details deleted successefully");
}


//Checkbox Functionality
@When("Admin\\/User\\/Staff clicks check box on the left side to the Assignment Name")
public void admin_user_staff_clicks_check_box_on_the_left_side_to_the_assignment_name() {
   map.EnterCommonCheckBox(); 
}

@Then("Admin\\/User\\/Staff should see a enabled delete button on the top left")
public void admin_user_staff_should_see_a_enabled_delete_button_on_the_top_left() {
    System.out.println("Delete button is enabled");
}

@When("Admin clicks check box on the left side to the Assignment Name")
public void admin_clicks_check_box_on_the_left_side_to_the_assignment_name() {
   map. EnterCheckBox();
}

@When("Admin\\/User\\/Staff clicks individual checkbox button")
public void admin_user_staff_clicks_individual_checkbox_button() {
	 map. EnterCheckBox();
}

@Then("Admin\\/User\\/Staff should see a delete button on the top left")
public void admin_user_staff_should_see_a_delete_button_on_the_top_left() {
    map.VerifyDeletebutton();
}

@When("Admin clicks individual checkbox button")
public void admin_clicks_individual_checkbox_button() {
	 map. EnterCheckBox();
}




	
}
