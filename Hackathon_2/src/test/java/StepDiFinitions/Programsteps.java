package StepDiFinitions;

import static org.testng.Assert.assertEquals;



import org.junit.Assert;

import BaseClass.Base;
import PageObjects.Program;
import Utilities.helper;
//import LMSProject.Utility.Loggerload;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Programsteps extends Base{
	helper hp; 
	
	Program p;
	//-----------------HEADER VALIDATION----------------------------
	
	@Given("Admin\\/User\\/Staff Logged on to LMS Website on program")
	public void admin_user_staff_logged_on_to_lms_website_on_program() {
		p=new Program(helper.getDriver()); 
		// Helper.openPage("url");
	}

	@When("Admin\\/User\\/Staff  is on Manage Program page on program")
	public void admin_user_staff_is_on_manage_program_page_on_program() {
		//Assert.assertEquals("Manage Program", p.HeaderName());

	}

	@Then("Admin\\/User\\/Staff see header text as {string} on program")
	public void admin_user_staff_see_header_text_as_on_program(String string) {
		String title = p.HeaderName();
	    if (title == "ManageProgram")
	    {
	      assertEquals("ManageUser", title);
	  //    Loggerload.info("User is in Manage Program Page");
	    }
	  else {
		//  Loggerload.info("User is not in Manage Program Page");
	  }  
	}

	
	//-------------------FOOTER VALIDATION-----------------------------


@Then("Admin\\/User\\/Staff see  Footer text as {string} on program")
public void admin_user_staff_see_footer_text_as_on_program(String footerText) {
   
	String s= p.FooterName();
    System.out.println(s);
  }

//--------------------PAGINATOR VALIDATION----------------------------


@Given("Admin\\/User\\/Staff now is on Manage Program page paginator on program")
public void admin_user_staff_now_is_on_manage_program_page_paginator_on_program() 
	{
	
	p.programpaginator();
	
	String expectedPage= p.programpaginator();

    String actualURL= "ManageProgram";

    Assert.assertEquals(expectedPage, actualURL);
	
	
		
}
@When("Admin\\/User\\/Staff is on the Manage Program page on program")
public void admin_user_staff_is_on_the_manage_program_page_on_program() {
	
	//Assert.assertEquals("Manage Program", p.HeaderName());

}

@When("Admin\\/User\\/Staff Clicks on Enabled paginator-next button on program")
public void admin_user_staff_clicks_on_enabled_paginator_next_button_on_program() {
   
	p.NextButton();
}

@Then("Admin\\/User\\/Staff see Paginator text as {string} on program")
public void admin_user_staff_see_paginator_text_as_on_program(String string) {
   String s= p.getfirstnav();
   System.out.println(s);
}

@When("Admin\\/User\\/Staff Clicks on Enabled paginator -prev button on program")
public void admin_user_staff_clicks_on_enabled_paginator_prev_button_on_program() {

	p.PrevoiusButton();
}

@Then("Admin\\/User\\/Staff see Paginator text as\"Showing {int} to {int} of {int} entries\" on program")
public void admin_user_staff_see_paginator_text_as_showing_to_of_entries_on_program(Integer int1, Integer int2, Integer int3) {
	String s1 =p.getPrevious();
	//Loggerload.info(s1);
	
}

@When("Admin\\/User\\/Staff Clicks on Enabled paginator-last button on program")
public void admin_user_staff_clicks_on_enabled_paginator_last_button_on_program() {

	p.LastNav();
	
}

@Then("Admin\\/User\\/Staff see Page number navigated to {string} on program")
public void admin_user_staff_see_page_number_navigated_to_on_program(String string) {
 
	String s3 =p.getLastNav();
	//Loggerload.info(s3);
	
}

@When("Admin\\/User\\/Staff Clicks on Enabled paginator -first button on program")
public void admin_user_staff_clicks_on_enabled_paginator_first_button_on_program() {

	p.FirstNav();
}


@Then("Admin\\/User\\/Staff  see the text as {string} on program")
public void admin_user_staff_see_the_text_as_on_program(String string) 
{

	String s1 =p.getNext();
	//Loggerload.info(s1);
	
}




//---------------------------------SEARCH FUNCTIONALITY---------------------------------


@Given("Admin\\/User\\/Staff is on Manage Program Page search on program")
public void admin_user_staff_is_on_manage_program_page_search_on_program() {

	//Loggerload.info("Admin\\\\/User\\\\/Staff is on Manage Program Page search");
}

@Given("Admin\\/User\\/Staff Loggedon to LMS Website on program")
public void admin_user_staff_loggedon_to_lms_website_on_program() 
{
	//Loggerload.info("Admin\\\\/User\\\\/Staff is on  Loggedon to LMS Website");
}

@When("Admin\\/User\\/Staff is on Manage Program Page for search on program")
public void admin_user_staff_is_on_manage_program_page_for_search_on_program() {

	Assert.assertEquals("Manage Program", p.HeaderName());

	//Loggerload.info("Admin\\\\/User\\\\/Staff is on Manage Program Page for search");
}

@Then("Admin\\/User\\/Staff see the Search Text box has text as {string} on program")
public void admin_user_staff_see_the_search_text_box_has_text_as_on_program(String string) {
            
	//Loggerload.info("see the Search Text box has text as search");
	
}

@When("Admin\\/User\\/Staff enters Program Name to be searched on program")
public void admin_user_staff_enters_program_name_to_be_searched_on_program() {
 
	p.Search("program name");

	//Loggerload.info("enters Program Name to be searched");
}

@Then("Entries for the searched Program Name are shown on program .")
public void entries_for_the_searched_program_name_are_shown_on_program() {

	//Loggerload.info("Entries for the searched Program Name are shown on program.");
}

@When("Admin\\/User\\/Staff enters Program Description to be searched on program")
public void admin_user_staff_enters_program_description_to_be_searched_on_program() {
	p.Search("program description");

	//Loggerload.info("enters Program  Description  to be searched");
}



@Then("Entries for the searched Program Description are shown on program .")
public void entries_for_the_searched_program_description_are_shown_on_program() {
	//Loggerload.info("Entries for the searched Program Description are shown.");
}

@When("Admin\\/User\\/Staff enters Program Status to be searched on program")
public void admin_user_staff_enters_program_status_to_be_searched_on_program() {
	p.Search("program status");

	//Loggerload.info("enters Program  Description  to be searched");

}

@Then("Entries for the searched Program Status are shown on program .")
public void entries_for_the_searched_program_status_are_shown_on_program() {
	//Loggerload.info("Entries for the searched Program Status are shown.");

}



//--------------------------------------------ASCENDING ORDER FUNCTIONALITY -------------------------



@Given("Admin\\/User\\/Staff is on Manage Program page for ascendingfun on program")
public void admin_user_staff_is_on_manage_program_page_for_ascendingfun_on_program() {
 
	//Loggerload.info("Admin\\\\/User\\\\/Staff is on Manage Program page for ascendingfun");
}

@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow on program")
public void admin_user_staff_clicks_on_program_name_ascending_arrow_on_program() {

	p.Ascprogramname();
}

@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order on program")
public void admin_user_staff_see_the_program_name_displayed_in_ascending_order_on_program() {

	  //Loggerload.info("The Program Name displayed in Ascending order");
}

@When("Admin\\/User\\/Staff Clicks on Program Description Ascending Arrow on program")
public void admin_user_staff_clicks_on_program_description_ascending_arrow_on_program() {

	p.Ascprogramdescription();
}

@Then("Admin\\/User\\/Staff see the Program Description displayed in Ascending order on program")
public void admin_user_staff_see_the_program_description_displayed_in_ascending_order_on_program() {

	//Loggerload.info("Admin\\\\/User\\\\/Staff see the Program Description displayed in Ascending order");
}

@When("Admin\\/User\\/Staff Clicks on Program Status Ascending Arrow on program")
public void admin_user_staff_clicks_on_program_status_ascending_arrow_on_program() {
  p.AscprogramStatus();
}

@Then("Admin\\/User\\/Staff see the Program Status displayed in Ascending order on program")
public void admin_user_staff_see_the_program_status_displayed_in_ascending_order_on_program() {
	//Loggerload.info("Admin\\\\/User\\\\/Staff see the Program Status displayed in Ascending order");
}

//---------------------------------------------------DESCINDING ORDER FUNCTIONALITY------------------------------------

@Given("Admin\\/User\\/Staff is on Manage Program page for decendingorder on program")
public void admin_user_staff_is_on_manage_program_page_for_decendingorder_on_program() {

//	Loggerload.info("Admin\\\\/User\\\\/Staff is on Manage Program page for decendingorder");
	
}

@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow on program")
public void admin_user_staff_clicks_on_program_name_descending_arrow_on_program() {

	p.Dscprogramname();
}

@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order on program")
public void admin_user_staff_see_the_program_name_displayed_in_descending_order_on_program() {
	//Loggerload.info("the Program Name displayed in Descending order");
}

@When("Admin\\/User\\/Staff Clicks on Program Description Descending  Arrow on program")
public void admin_user_staff_clicks_on_program_description_descending_arrow_on_program() {

	p.dscprodescription();
}

@Then("Admin\\/User\\/Staff see the Program Description displayed in Descending  orderr on program")
public void admin_user_staff_see_the_program_description_displayed_in_descending_orderr_on_program() {
	
	//Loggerload.info("admin\\\\/User\\\\/Staff see the Program Description displayed in Descending  order");
	
}

@When("Admin\\/User\\/Staff Clicks on Program Status Descending Arrow on program")
public void admin_user_staff_clicks_on_program_status_descending_arrow_on_program() {
  
	p. Dscprograstatus();
}

@Then("Admin\\/User\\/Staff see the Program Status displayed in Descending order on program")
public void admin_user_staff_see_the_program_status_displayed_in_descending_order_on_program() {

	//Loggerload.info("admin\\\\/User\\\\/Staff see the Program Description displayed in Descending  order");
	
}




//-------------------------------------NO OF ROWS IN TABLE--------------------------------------------------------

@When("Admin\\/User\\/Staff is on Manage Program page for noofrows on program")
public void admin_user_staff_is_on_manage_program_page_for_noofrows_on_program() {
	//Loggerload.info("Admin\\\\/User\\\\/Staff is on Manage Program page for noofrows");
	
}

@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table on program")
public void admin_user_staff_counts_number_of_rows_as_in_a_table_on_program(Integer int1) {
  
	 p.getrows();
}



//--------------------------------------------CHECKBOX FUNCTIONALITY------------------------------

@Given("Admin\\/User\\/Staff is on Manage Program page to check checkbox on program")
public void admin_user_staff_is_on_manage_program_page_to_check_checkbox_on_program() {

	//Loggerload.info("Admin\\\\/User\\\\/Staff is on Manage Program page to check checkbox");
	
	
}

@When("Admin\\/User\\/Staff Selects First checkbox left to Program Name on program")
public void admin_user_staff_selects_first_checkbox_left_to_program_name_on_program() {
p.mainCheckBox();
}

@Then("Admin\\/User\\/Staff see all the checkboxes in the Program page get selected on program")
public void admin_user_staff_see_all_the_checkboxes_in_the_program_page_get_selected_on_program() {

	 // Loggerload.info(" All the checkboxes in the Program page get selected");
	
}



//-------------------------------DELETE FUNCTIONALITY--------------------------------------------



@Given("Admin is on Manage Program page delete1 on program")
public void admin_is_on_manage_program_page_delete1_on_program() {

	//Loggerload.info("Admin on manage program");
	
}

@When("Admin Clicks on any Delete button located on the right side on program")
public void admin_clicks_on_any_delete_button_located_on_the_right_side_on_program() {

	p.deletelink();

}

@Then("Admin see header text as {string} on program")
public void admin_see_header_text_as_on_program(String string) {

	p.deletetext();
}

@When("Admin Clicks on Yes  button on program")
public void admin_clicks_on_yes_button_on_program() {

	p.yesdelete();
}

@Then("Admin see Success message {string} on program")
public void admin_see_success_message_on_program(String string) {

	p.yesdeletesuccessmsg();
}

@When("Admin Clicks on No button on program")
public void admin_clicks_on_no_button_on_program() {
 
	p.nodeletesuccessmsg();
}

@Then("Admin can see Program Name not deleted on program")
public void admin_can_see_program_name_not_deleted_on_program() {

	p.nodeletemsg();
}

@Given("Admin\\/User\\/Staff  is on Manage Program page for delete3 on program")
public void admin_user_staff_is_on_manage_program_page_for_delete3_on_program() {
	
//	Loggerload.info("Admin on manage program");

	
}

@When("Admin\\/User\\/Staff Enters deleted  Program Name in Search on program")
public void admin_user_staff_enters_deleted_program_name_in_search_on_program() {

	p.SearchDelete("");
	
}

@Then("Admin\\/User\\/Staff finds no results on program")
public void admin_user_staff_finds_no_results_on_program() {

	//Loggerload.info("no result");
}

@Given("User\\/Staff is on Manage Program page for delete4 on program")
public void user_staff_is_on_manage_program_page_for_delete4_on_program() {

//	Loggerload.info("Admin on manage program");
	
	
}

@When("User\\/Staff Clicks on Delete buttton on program")
public void user_staff_clicks_on_delete_buttton_on_program() {

	p.btnDelete();
}

@Then("User\\/Staff see a Error message {string} on program")
public void user_staff_see_a_error_message_on_program(String string) {
  
	  p.SearchDelete(string);
}



//---------------------------------EDIT FUNCTIONALITY---------------------------------------------


@Given("Admin is on Manage Program page on program")
public void admin_is_on_manage_program_page_on_program() {

//	Loggerload.info("Admin is on Manage Program page");
}

@When("Admin Clicks on Edit buttton on program")
public void admin_clicks_on_edit_buttton_on_program() {
  
	p.Edit();
	
}

@Given("Admin Clicks on {string} button on program")
public void admin_clicks_on_button_on_program(String string) {
//	Loggerload.info("Admin Clicks on {string} button");

}

@When("Admin Clicks on Save Button after updating Name on program")
public void admin_clicks_on_save_button_after_updating_name_on_program() {

	p.Savebutton();
	//Loggerload.info("Admin Clicks on Save Button ");

}

@When("Admin  Clicks on Save Button after updating  Description on program")
public void admin_clicks_on_save_button_after_updating_description_on_program() {

	p.Savebutton();
	//Loggerload.info("Admin  Clicks on Save Button after updating  Description");
}

@Then("Admin see Success message\"Updated Description\" on program")
public void admin_see_success_message_updated_description_on_program() {
  
	p.getSuccessBox();
  
}

@When("Admin  Clicks on Save Button after Changing  status on program")
public void admin_clicks_on_save_button_after_changing_status_on_program() {

	p.Savebutton();
	//Loggerload.info("Admin  Clicks on Save Button after Changing  status");

}


@When("Admin Clicks on Cancel button on program")
public void admin_clicks_on_cancel_button_on_program() {
	
	p.Cancelbutton();
}

@Then("Admin see a Program Details window getting closed on program")
public void admin_see_a_program_details_window_getting_closed_on_program() {

//	Loggerload.info("Admin see a Program Details window getting closed");
	
	
}

@Given("Admin  Clicks on {string} button record edit on program")
public void admin_clicks_on_button_record_edit_on_program(String string) {

	p.Edit();
//	Loggerload.info("Admin  Clicks on {string} button record edit");
}

@Given("User\\/Staff is on Manage Program page for edit on program")
public void user_staff_is_on_manage_program_page_for_edit_on_program() {

	//Loggerload.info("User\\\\/Staff is on Manage Program page for edit");
	
	
}

@When("User\\/Staff Clicks on Edit buttton on program")
public void user_staff_clicks_on_edit_buttton_on_program() {
	
	p.Edit();
//	Loggerload.info("User\\/Staff Clicks on Edit buttton");
}


@Given("Admin\\/User\\/Staff is on Manage Program page edit3 on program")
public void admin_user_staff_is_on_manage_program_page_edit3_on_program() {

//	Loggerload.info("Admin\\\\/User\\\\/Staff is on Manage Program page edit3");
}

@When("Admin\\/User\\/Staff Enters edited Program Name in Search on program")
public void admin_user_staff_enters_edited_program_name_in_search_on_program() {

	p.Search("program name");
	//Loggerload.info("Enters edited Program Name in Search");
}

@Then("Entry for the edited  Program Name is shown on program")
public void entry_for_the_edited_program_name_is_shown_on_program() {
	
	//Loggerload.info("Entry for the edited  Program Name is show");
}

@Then("User\\/Staff see a Error message  {string} aspopup on program")
public void user_staff_see_a_error_message_aspopup_on_program(String string) {

	p.geterrormsg();
//	Loggerload.info("User\\\\/Staff see a Error message for edit");
}


//------------------------------------------DELETE MULTIPLE RECORDS--------------------------------

@Given("Admin\\/User\\/Staff is on Manage Program page on deletemultirecord on program")
public void admin_user_staff_is_on_manage_program_page_on_deletemultirecord_on_program() {

//	Loggerload.info("Admin on manage program");
	
}

@When("Admin\\/User\\/Staff select Manage Program page on program")
public void admin_user_staff_select_manage_program_page_on_program() {
	
	//Loggerload.info("Admin on manage program");
}

@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled on program")
public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled_on_program() {
 
	p.verifyDeleteButton();

}

@When("Admin\\/User\\/Staff selects more than one Program Name using checkbox on program")
public void admin_user_staff_selects_more_than_one_program_name_using_checkbox_on_program() {

	p.mainCheckBox();
}

@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Enabled on program")
public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_enabled_on_program() {
 
	p.verifyDeleteButton();

}

@Given("Admin selects more than one Program Name using checkbox on program")
public void admin_selects_more_than_one_program_name_using_checkbox_on_program() {
	
	p.mainCheckBox();
}

@When("Admin Clicks on Enabled Delete button on the top left hand side on program")
public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side_on_program() {
   p.btnDelete();
}

@Given("Admin Clicks on Enabled Delete button after selecting  more than one Program Name on program")
public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name_on_program() {

	//Loggerload.info("enable button aftre selecting msg");
	
}
@Then("Admin see Success message as {string} on program")
public void admin_see_success_message_as_on_program(String string) {

	p.getSuccessBox();
	
}

@Given("Admin\\/User\\/Staff have access and Admin Clicks on Enabled Delete button after selecting  more than one Program Name  on program")
public void admin_user_staff_have_access_and_admin_clicks_on_enabled_delete_button_after_selecting_more_than_one_program_name_on_program() {
 
	//Loggerload.info("Admin/User/Staff have access and Admin Clicks on Enabled Delete button after selecting  more than one Program Name");
}

@Then("Admin can see Program Names not deleted on program")
public void admin_can_see_program_names_not_deleted_on_program() {

	//Loggerload.info("Admin can see Program Names not deleted");
}

@When("Admin\\/User\\/Staff Enters deleted  Program Names in Search on program")
public void admin_user_staff_enters_deleted_program_names_in_search_on_program() {

	//Loggerload.info("Admin\\\\/User\\\\/Staff Enters deleted  Program Names in Search");
	p.SearchDelete("");
	
}

@Given("User\\/Staff selects more than one Program Name using checkbox on program")
public void user_staff_selects_more_than_one_program_name_using_checkbox_on_program() {

p.mainCheckBox();
}

@When("User\\/Staff Clicks on Enabled Delete button on the top left hand side on program")
public void user_staff_clicks_on_enabled_delete_button_on_the_top_left_hand_side_on_program() 
{
 p.btnDelete();
}



//-----------------------------------------------ADD NEW PROGRAM FUNCTIONALITY-------------------------

@Given("Admin is on Manage Program page to Addnewrecord on program")
public void admin_is_on_manage_program_page_to_addnewrecord_on_program()

{
//	Loggerload.info("Admin is on Manage Program page to Addnewrecord");
	
 }

@When("Admin Clicks on  the\" + A New Program\" button on program")
public void admin_clicks_on_the_a_new_program_button_on_program() {
	
	p.Newprograme();
  }

@When("Admin Clicks on Save Button with out entering  details on program")
public void admin_clicks_on_save_button_with_out_entering_details_on_program() {
 
p.Savebutton();
}

@Then("Admin see Error message {string} on program")
public void admin_see_error_message_on_program(String string) {
	
	//Loggerload.info("error message");
  }

@Then("Suggestion - {string} message can be added  - Negative Scenario on program")
public void suggestion_message_can_be_added_negative_scenario_on_program(String string) 
{
	 
		p.getSuggestionBox();
		//Loggerload.info("Suggestion");
	}  

@When("Admin Clicks on Save Button after entering all details on program")
public void admin_clicks_on_save_button_after_entering_all_details_on_program() {
	p.Savebutton();
	 //  Loggerload.info("Admin Clicks on Save Button after entering all details");
	
}

@When("Admin Clicks on Save Button after entering Name alone on program")
public void admin_clicks_on_save_button_after_entering_name_alone_on_program() {
 
	p.Savebutton();
	 //  Loggerload.info("Admin Clicks on Save Button after entering Name alone");
	   
	
}

@When("Admin Clicks on Save Button after entering Description alone on program")
public void admin_clicks_on_save_button_after_entering_description_alone_on_program() {
	 p.Savebutton();
	   //logger.info("Admin Clicks on Save Button after entering Description alone");
	
}

@When("Admin Clicks on Save Button after selecting Status alone on program")
public void admin_clicks_on_save_button_after_selecting_status_alone_on_program() {
 
	p.Savebutton();
	  // Loggerload.info("Admin Clicks on Save Button after selecting Status alone");
}

@Given("Admin\\/User\\/Staff is on Manage Program page foraddrec on program")
public void admin_user_staff_is_on_manage_program_page_foraddrec_on_program() {
  
//	Loggerload.info("User\\\\/Staff is on Manage Program page");

	
}

@When("Admin\\/User\\/Staff Enters newly added  Program Name in Search on program")
public void admin_user_staff_enters_newly_added_program_name_in_search_on_program() {
  
	 p.txtProgramName("");
	//   Loggerload.info("Enters newly added  Program Name in Search");
}

@Then("Entry for the newly added Program Name is shown on program")
public void entry_for_the_newly_added_program_name_is_shown_on_program() {
	   
	//Loggerload.info("Entry for the newly added Program Name is shown");
}

@Given("User\\/Staff is on Manage Program page on program")
public void user_staff_is_on_manage_program_page_on_program() {

	//Loggerload.info("User\\\\/Staff is on Manage Program page");
  }

@When("User\\/Staff Clicks on {string} button on program")
public void user_staff_clicks_on_button_on_program(String string) {
	p.Newprograme();
   // Loggerload.info("User / Staff Clicks on A New Program button");
	
  }



}
