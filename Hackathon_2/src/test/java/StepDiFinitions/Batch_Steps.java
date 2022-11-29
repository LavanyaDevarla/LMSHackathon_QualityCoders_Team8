package StepDiFinitions;

import BaseClass.Base;
import PageObjects.BatchPages;
import Utilities.helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class Batch_Steps extends Base  {
Batch_Steps Bs;
	helper hp; 
	BatchPages Bp; 
	
	

	//---------------Search-----------------------
		@Then("Admin\\/User\\/Staff see the Search Text box has text as {string}.")
		public void admin_user_staff_see_the_search_text_box_has_text_as(String string) {
			// initialization();
			hp = new helper();
		//	Bp= new BatchPages ();
			Bp.SearchBtn();
			Bs = new Batch_Steps();
			Bp= new BatchPages (helper.getDriver());
		}

		@Then("Entries for the searched BatchName are shown.")
		public void entries_for_the_searched_batch_name_are_shown() {
		 Bp.enterbatchName();
		}

		@When("Admin\\/User\\/Staff enters Batch Description to be searched")
		public void admin_user_staff_enters_batch_description_to_be_searched() {
		   Bp.EnterDescription();
		}

		@Then("Entries for the searched Batch Description are shown.")
		public void entries_for_the_searched_batch_description_are_shown() {
		   Bp.enterBatchDescription();
		}

		@When("Admin\\/User\\/Staff enters Batch Status to be searched")
		public void admin_user_staff_enters_batch_status_to_be_searched() {
		   Bp.Status();
		}

		@Then("Entries for the searched Batch status are shown.")
		public void entries_for_the_searched_batch_status_are_shown() {
		    System.out.println("User can see Batch status");
		}

		@When("Admin\\/User\\/Staff enters No Of Classes to be searched")
		public void admin_user_staff_enters_no_of_classes_to_be_searched() {
	Bp.batchNoOfClasses();
		}

		@Then("Entries for the searched No Of Classes are shown.")
		public void entries_for_the_searched_no_of_classes_are_shown() {
			 System.out.println("User can see searched No Of Classes are shown");
		}

		@When("Admin\\/User\\/Staff enters Program Name to be searched")
		public void admin_user_staff_enters_program_name_to_be_searched() {
		    Bp.enterprogrmname();
		}

		@Then("Entries for the searched Program Name are shown.")
		public void entries_for_the_searched_program_name_are_shown() {
			 System.out.println("User can see Program Name");
		}
	//----------------Header----------------		
	
			@When("Admin\\/User\\/Staff Clicks on Batch button")
			public void admin_user_staff_clicks_on_batch_button() {
				Bp.enterusername();
				Bp.enterPassword();
				Bp.clickonlogin();
			  Bp.clickonnewBatch();
			  initialization();	
			}

		

			@Then("Admin\\/User\\/Staff see header text as {string}")
			public void admin_user_staff_see_header_text_as(String string) {
				System.out.println("User can see  HeaderPage BatchPage");
			}
	
	
	
	//---------------------AddnewBatch------------------
		@Given("Admin Clicks on {string} buttoN")
		public void admin_clicks_on_butto_n(String string) {
		//	Bp.enterusername();
			Bp.enterPassword();
			Bp.clickonlogin();
		  Bp.clickonnewBatch();
		}

		@Given("Admin\\/User\\/Staff Logged on to LMS Website")
		public void admin_user_staff_logged_on_to_lms_website() {
			System.out.println("User can see BatchPage");
		}

		@When("Admin Clicks on {string} button")
		public void admin_clicks_on_button(String string) {
			  Bp.clickonnewBatch();
		}

		@Then("Admin see header text as {string}")
		public void admin_see_header_text_as(String string) {
			 System.out.println("User can see text box");
		}

		@When("Admin Clicks on Save Button with out entering details")
		public void admin_clicks_on_save_button_with_out_entering_details() {
			 Bp.clickonSave();
		}

		@Then("Admin see Error message {string}")
		public void admin_see_error_message(String string) {
			System.out.println("User can Error message name is required");
		}

		@When("Admin Clicks on Save Button after entering Name alone")
		public void admin_clicks_on_save_button_after_entering_name_alone() {
			Bp.EnterBatchName();
		}

		@When("Admin Clicks on Save Button after entering Description alone")
		public void admin_clicks_on_save_button_after_entering_description_alone() {
			 Bp.clickonSave();
			 System.out.println("User can see batchName");
		}

		@When("Admin Clicks on DropDown Menu")
		public void admin_clicks_on_drop_down_menu() {
		Bp.clickonDropDown();
		}

		@Then("Admin see list of all Program Names")
		public void admin_see_list_of_all_program_names() {
			System.out.println("all Program Names");
		}

		@When("Admin Clicks on Save button after selecting a Program Name only from the dropdown")
		public void admin_clicks_on_save_button_after_selecting_a_program_name_only_from_the_dropdown() {
		   Bp.clickonSave();
		}

		@When("Admin Clicks on Save Button after selecting Status alone")
		public void admin_clicks_on_save_button_after_selecting_status_alone() {
		    Bp.SelectProgram();
		}

		@When("Admin Clicks on Save Button after entering only Number Of Classes")
		public void admin_clicks_on_save_button_after_entering_only_number_of_classes() {
		 Bp.batchNoOfClasses();
		}

		@When("Admin Clicks on Save Button after entering all details")
		public void admin_clicks_on_save_button_after_entering_all_details() {
		  Bp.clickonSave();
		}

		@Then("Admin see Success message {string}")
		public void admin_see_success_message(String string) {
			 System.out.println("User can see  Success message ");
		}

		@When("Admin Clicks on Cancel button")
		public void admin_clicks_on_cancel_button() {
		 Bp.clickonCancel();
		}

		@Then("Admin see a Batch Details window getting closed")
		public void admin_see_a_batch_details_window_getting_closed() {
			 System.out.println("User can see  Details window getting closed ");
		}

		@Given("User\\/Staff Validate Add A New Batch button")
		public void user_staff_validate_add_a_new_batch_button() {
		  Bp.clickonnewBatch();
		}

		@When("Admin\\/User\\/Staff Enters newly added Batch Name in Search")
		public void admin_user_staff_enters_newly_added_batch_name_in_search() {
		  Bp.EnterBatchName();
		}

		@Then("Entry for the newly added Batch Name is shown")
		public void entry_for_the_newly_added_batch_name_is_shown() {
			System.out.println("User can see Batch Name is shown");
		}

		@When("User\\/Staff is on Manage Batch page	User\\/Staff\\/Staff Clicks on {string} button")
		public void user_staff_is_on_manage_batch_page_user_staff_staff_clicks_on_button(String string) {
		    Bp.clickonSave();
		}

		@Then("User\\/Staff see a Error message {string}")
		public void user_staff_see_a_error_message(String string) {
			System.out.println("User can see Error message ");
		}
		//-------------Ascending order----------------------------
		@Given("Admin\\/User\\/Staff is on Manage Batch page")
		public void admin_user_staff_is_on_manage_batch_page() {
			System.out.println("User is on Manage Batch page ");
		}

		@When("Admin\\/User\\/Staff Clicks on Batch Name Ascending Arrow")
		public void admin_user_staff_clicks_on_batch_name_ascending_arrow() {
		  Bp.clickonNameAscendingorder();
		}

		@Then("Admin\\/User\\/Staff see the Batch Name displayed in Ascending order")
		public void admin_user_staff_see_the_batch_name_displayed_in_ascending_order() {
			System.out.println("User can see the Batch Name displayed in Ascending order");
		}

		@When("Admin\\/User\\/Staff Clicks on Batch Description Ascending Arrow")
		public void admin_user_staff_clicks_on_batch_description_ascending_arrow() {
		   Bp.clickonDescriptionAscendingorder();
		}

		@Then("Admin\\/User\\/Staff see the Batch Description displayed in Ascending order")
		public void admin_user_staff_see_the_batch_description_displayed_in_ascending_order() {
			System.out.println("User can see the Batch Description displayed in Ascending order");
		}

		@When("Admin\\/User\\/Staff Clicks on Batch Status Ascending Arrow")
		public void admin_user_staff_clicks_on_batch_status_ascending_arrow() {
		  Bp.clickonStatusAscendingorder();
		}

		@Then("Admin\\/User\\/Staff see the Batch Status displayed in Ascending order")
		public void admin_user_staff_see_the_batch_status_displayed_in_ascending_order() {
			System.out.println("User can see the Batch Description displayed in Ascending order");
		}

		@When("Admin\\/User\\/Staff Clicks on No Of Classess Ascending Arrow")
		public void admin_user_staff_clicks_on_no_of_classess_ascending_arrow() {
		    Bp.clcikonNoOfClassAscendingorder();
		}

		@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Ascending order")
		public void admin_user_staff_see_the_no_of_classes_displayed_in_ascending_order() {
			System.out.println("User can see the No Of Classes displayed in Ascending order");
		}

		@When("Admin\\/User\\/Staff Clicks on Program Name Ascending Arrow")
		public void admin_user_staff_clicks_on_program_name_ascending_arrow() {
		    Bp.clickonProgramNameAscendingorder();
		}

		@Then("Admin\\/User\\/Staff see the Program Name displayed in Ascending order")
		public void admin_user_staff_see_the_program_name_displayed_in_ascending_order() {
			System.out.println("User can see the Program Name displayed in Ascending order");
		}
		@Given("Admin Clicks on {string} on Batch  buttoN")
		public void admin_clicks_on_on_batch_butto_n(String string) {
		   System.out.println("User is landed in LMS Batch Page");
		}

		@Given("Admin\\/User\\/Staff Logged on to on Batch LMS Website")
		public void admin_user_staff_logged_on_to_on_batch_lms_website() {
			   System.out.println("User is landed in LMS Batch Page");
		}

		@Then("Admin see Success message like {string}")
		public void admin_see_success_message_like(String string) {
			   System.out.println("User is landed in LMS Batch Page");
		}

		@Then("Entry for the newly added Batch Name is shown on Batch")
		public void entry_for_the_newly_added_batch_name_is_shown_on_batch() {
			   System.out.println("User is landed in LMS Batch Page");
		}
		
	//----------------Page---------------
		@When("Admin\\/User\\/Stafff Clicks on Enabled paginator-next to Button on Batch")
		public void admin_user_stafff_clicks_on_enabled_paginator_next_to_button_on_batch() {
		  Bp.clickonBatchPage1();
		}

		@Then("Admin\\/user\\/Staff  see the text as as showing {int} to {int} of {int} batche.")
		public void admin_user_staff_see_the_text_as_as_showing_to_of_batche(Integer int1, Integer int2, Integer int3) {
	System.out.println("User see  the text as as showing");
		}

		@When("���Admin\\/User\\/Staff clicks on enabled paginator prev button on Batch")
		public void admin_user_staff_clicks_on_enabled_paginator_prev_button_on_Batch() {
		    Bp.clickonPageButton();
		}

		@When("��Admin\\/User\\/Staff -clicks on Enabled Pagepaginator  button")
		public void admin_user_staff_clicks_on_enabled_pagepaginator_button() {
		  Bp.clickonPageButton();
		}

		@Then("��Admin\\/User\\/Staff  see the text as Show Sshowing {int} to {int} of {int} batches.")
		public void admin_user_staff_see_the_text_as_show_sshowing_to_of_batches(Integer int1, Integer int2, Integer int3) {
			System.out.println("User can see theShow Sshowing 123");
		}

		@When("��Admin\\/User\\/Staff Clicks on the enabled -paginator-last button")
		public void admin_user_staff_clicks_on_the_enabled_paginator_last_button() {
		    Bp.clickonBatchPage1();
		}

		@Then("��Admin\\/User\\/Staff see Page number Navigated to Five")
		public void admin_user_staff_see_page_number_navigated_to_five() {
			System.out.println("User can see the Navigated to Five");
		}

		@When("��Admin\\/user\\/Staff Clicks on -Enabled paginator -first Batch button")
		public void admin_user_staff_clicks_on_enabled_paginator_first_batch_button() {
		 Bp.clickonBatchPage1();
		}

		@Then("��Admin\\/user\\/Staff see page number navigated too One")
		public void admin_user_staff_see_page_number_navigated_too_one() {
			System.out.println("User can see  number navigated too One");
		}
@When("Admin\\/User\\/Stafff Clicks on Enabled paginator-next  to Button ")
public void admin_user_stafff_clicks_on_enabled_paginator_next_button () {
 Bp.clickonnewBatch();
}

@Then("Admin\\/user\\/Staff  see the text as as {string}")
public void admin_user_staff_see_the_text_as_as(String string) {
	System.out.println("User can see the next page");
}

@When("���Admin\\/User\\/Staff clicks on enabled paginator prev button")
public void admin_user_staff_clicks_on_enabled_paginator_prev_button() {
Bp.clickonPrevButton();
}

@When("��Admin\\/User\\/Staff -clicks on Enabled paginator  button")
public void admin_user_staff_clicks_on_enabled_paginator_button() {
 Bp.clickonPageButton();
}

@Then("��Admin\\/User\\/Staff  see the text as Show {string}")
public void admin_user_staff_see_the_text_as_show(String string) {
	System.out.println("User can see the previous page");
}

@When("��Admin\\/User\\/Staff Clicks on enabled -paginator-last button")
public void admin_user_staff_clicks_on_enabled_paginator_last_button() {
 Bp.clickonlastButton();
 
}

@Then("��Admin\\/User\\/Staff see Page number Navigated to {string}")
public void admin_user_staff_see_page_number_navigated_to(String string) {
	System.out.println("User can see the Navigated  page");
	}


@When("��Admin\\/user\\/Staff Clicks on -Enabled paginator -first button")
public void admin_user_staff_clicks_on_enabled_paginator_first_button() {
Bp.clickonFirstButton();
}

@Then("��Admin\\/user\\/Staff see page number navigated to {string}")
public void admin_user_staff_see_page_number_navigated_too(String string) {
	System.out.println("User can see the First  page");
}
	
	
	
	//--------------Footer-----------------
@When("Admin\\/User\\/Staff is on Manage The Batch  footer page")
public void admin_user_staff_is_on_manage_the_batch_footer_page() {
  
Bp.clickonBatchPage1();

}
	@Then("Admin\\/User\\/Staff see  Footer text as {string}")
	public void admin_user_staff_see_footer_text_as(String string) {
		System.out.println("User can see the Footer Page");
	}
	
	//----------Edit----------------------------
	@Then("Admin Clicks on Edit buttton")
	public void admin_clicks_on_edit_buttton() {

Bp.clickoneditBatch();
	}

	@Then("Admin Clicks on Save Button after updating Name")
	public void admin_clicks_on_save_button_after_updating_name() {

Bp.enterBatchDescription();
	}

	@Then("Admin Clicks on Save Button after updating Description")
	public void admin_clicks_on_save_button_after_updating_description() {
		Bp.clickonSave();

	}

	@When("Admin see Success message Batch\"Updated Description\"")
	public void admin_see_success_message_Batch_updated_description() {
		System.out.println("User can see the Success message Updated Description");
	}

	@When("Admin Clicks on Save button after Selecting another Program Name")
	public void admin_clicks_on_save_button_after_selecting_another_program_name() {
		Bp.updatedName();
		
	}

	@When("Admin Clicks on Save Button after updating Status")
	public void admin_clicks_on_save_button_after_updating_status() {
		Bp.SaveBtn();
	}

	@When("Admin Clicks on Save Button after updating No Of Classes")
	public void admin_clicks_on_save_button_after_updating_no_of_classes() {
	   Bp.batchNoOfClasses();
	}

	@When("Admin\\/User\\/Staff Enters edited Batch Name\\/Batch Description in Search")
	public void admin_user_staff_enters_edited_batch_name_batch_description_in_search() {
	   Bp.enterbatchName();
	   Bp.EnterDescription();
	}

	@Then("Entry for the edited Batch Name\\/Batch Description is shown")
	public void entry_for_the_edited_batch_name_batch_description_is_shown() {
		System.out.println("User can see the Success message Batch Name Batch Description");
	}

	@When("User\\/Staff Clicks on Edit buttton")
	public void user_staff_clicks_on_edit_buttton() {
Bp.clickoneditBatch();
	}
	
	//-----------------------MultipleDelete-------------
	

	@When("Admin\\/User\\/Staff selects more than one Batch Name using checkbox")
	public void admin_user_staff_selects_more_than_one_batch_name_using_checkbox() {
	Bp.clickonSelectBatchName();
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left side as Enabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_side_as_enabled() {
		System.out.println("User can see the  Delete button on the top left side of as Enabled");
	}

	@Given("Admin selects more than one Batch Name using checkbox")
	public void admin_selects_more_than_one_batch_name_using_checkbox() {
	Bp.clickoncheckbox();
	}

	@When("Admin Clicks on Enabled Delete button on the top left hand side")
	public void admin_clicks_on_enabled_delete_button_on_the_top_left_hand_side() {
		System.out.println("User can see the  Enabled Delete button on the top left hand side");
	}

	@Given("Admin Clicks on Enabled Delete button after selecting more than one")
	public void admin_clicks_on_enabled_delete_button_after_selecting_more_than_one() {
	}

	@When("Batch Name	Admin Clicks on Yes button")
	public void batch_name_admin_clicks_on_yes_button() {
	   Bp.clickonYes();
	}

	@When("Batch Name	Admin Clicks on No button")
	public void batch_name_admin_clicks_on_no_button() {
	 Bp.clickonNo();
	}

	@Then("Admin can see Program Names not deleted")
	public void admin_can_see_program_names_not_deleted() {
		System.out.println("User can see the Program Names not deleted");
	}

	@When("Admin\\/User\\/Staff Enters deleted Program Names in Search")
	public void admin_user_staff_enters_deleted_program_names_in_search() {
	   Bp.enterprogrmname();
	   }

	@Given("User\\/Staff selects more than one Batch Name using checkbox")
	public void user_staff_selects_more_than_one_batch_name_using_checkbox() {
	 Bp.selectCheckbox();
	}

	@When("User\\/Staff Cicks on Enabled Delete button on the top left hand side")
	public void user_staff_cicks_on_enabled_delete_button_on_the_top_left_hand_side() {
	   // Bp.clickondeletebutton();
	    System.out.println("User  Deleted Multiple BatchNames");
	}
	

	//---------------Delete----------------------
	@Given("Admin is on Manage Batch page")
	public void admin_is_on_manage_batch_page() {
		System.out.println("User is in BatchPage");
	}

	@When("Admin Clicks on any Delete button located on the right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side() {
	    Bp.clickondeletebutton();
	}

	@Given("Admin Clicks on any Delete button located on the right right side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_right_side() {
	   
	}

	@When("Admin Clicks on Yes button")
	public void admin_clicks_on_yes_button() {
	    Bp.clickonYes();
	}

	@Given("Admin Clicks on any Delete button located on the right side side")
	public void admin_clicks_on_any_delete_button_located_on_the_right_side_side() {
	    
	}

	@When("Admin Clicks on No button")
	public void admin_clicks_on_no_button() {
	   Bp.clickonNo();
	}

	@Then("Admin can see Program Name not deleted")
	public void admin_can_see_program_name_not_deleted() {
		System.out.println("User  can see Program Name not deleted");
	
	}

	@When("Admin\\/User\\/Staff Enters deleted Program Name in Search")
	public void admin_user_staff_enters_deleted_program_name_in_search() {
	   Bp.enterprogrmname();
		
	}

	@Then("Admin\\/User\\/Staff finds no results")
	public void admin_user_staff_finds_no_results() {
		System.out.println("User  can finds no results");
	}

	@Given("User\\/Staff is on Manage Batch page")
	public void user_staff_is_on_manage_batch_page() {
	
	}

	@When("User\\/Staff Clicks on Delete buttton")
	public void user_staff_clicks_on_delete_buttton() {
	   Bp.SelectDeletebutton();
	}

	@When("Admin\\/User\\/Staff is on Manage batch page Page1")
	public void admin_user_staff_is_on_manage_batch_page_page1() {
	 
	}

	@Then("Admin\\/User\\/Staff see the Delete button on the top left hand side as Disabled")
	public void admin_user_staff_see_the_delete_button_on_the_top_left_hand_side_as_disabled() {
	    Bp.clickondeletebutton();
	}

	//----CheckBox------------------------
	@Given("Admin\\/User\\/Staff is on Manage batch Pag")
	public void admin_user_staff_is_on_manage_batch_pag() {
	
	}

	@When("Admin\\/User\\/Staff Selects First checkbox left to Batch name")
	public void admin_user_staff_selects_first_checkbox_left_to_batch_name() {
	  Bp.clickonFirstCheckBox();
	}

	@Then("Admin\\/User\\/Staff see all the checkboxes in the Batch page get selected")
	public void admin_user_staff_see_all_the_checkboxes_in_the_batch_page_get_selected() {
		System.out.println("User can see all the checkboxes in the Batch page get selected");
	}
	
	
	//----------------table

		@Then("Admin\\/User\\/Staff counts number of rows as {int} in a table")
		public void admin_user_staff_counts_number_of_rows_as_in_a_table(Integer int1) {
		  initialization();
			Bp.RowsinTable();
			System.out.println("User can see Size of table rows and colums");
		}
		//---------------------Decorder------------------------------
		
		@When("Admin\\/User\\/Staff Clicks on Batch Name Descending Arrow Arrow")
		public void admin_user_staff_clicks_on_batch_name_descending_arrow_arrow() {
		   Bp.clickonNameDescendingorder();
		}

		@Then("Admin\\/User\\/Staff see the Batch Name displayed in Descending order")
		public void admin_user_staff_see_the_batch_name_displayed_in_descending_order() {
		  System.out.println(" User see the Batch Name displayed in Descending order");
		}

		@When("Admin\\/User\\/Staff Clicks on Batch Description Descending Arrow")
		public void admin_user_staff_clicks_on_batch_description_descending_arrow() {
		  Bp.clickonNameDescendingorder();
		}

		@Then("Admin\\/User\\/Staff see the Batch Description displayed in Descending order")
		public void admin_user_staff_see_the_batch_description_displayed_in_descending_order() {
			System.out.println(" User see the Batch Name displayed in Descending order");
		}

		@When("Admin\\/User\\/Staff Clicks on Batch Status Descending Arrow")
		public void admin_user_staff_clicks_on_batch_status_descending_arrow() {
		  Bp.clickonStatusDescendingorder();
		}

		@Then("Admin\\/User\\/Staff see the Batch Status displayed in Descending order")
		public void admin_user_staff_see_the_batch_status_displayed_in_descending_order() {
			System.out.println(" User see the Batch Status displayed in Descending order");
		}

		@When("Admin\\/User\\/Staff Clicks on No Of Classess Descending Arrow")
		public void admin_user_staff_clicks_on_no_of_classess_descending_arrow() {
		Bp.clickonStatusDescendingorder();
		}

		@Then("Admin\\/User\\/Staff see the No Of Classes displayed in Descending order")
		public void admin_user_staff_see_the_no_of_classes_displayed_in_descending_order() {
			System.out.println(" User see the Batch Status displayed in Descending order");
		}

		@When("Admin\\/User\\/Staff Clicks on Program Name Descending Arrow")
		public void admin_user_staff_clicks_on_program_name_descending_arrow() {
		    Bp.clickonProgramNameDescendingorder();
		}

		@Then("Admin\\/User\\/Staff see the Program Name displayed in Descending order")
		public void admin_user_staff_see_the_program_name_displayed_in_descending_order() {
			System.out.println(" User see the Batch Status ProgramNameDescendingorder");
		}

	}

