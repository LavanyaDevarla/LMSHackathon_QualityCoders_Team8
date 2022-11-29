package StepDiFinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import BaseClass.Base;
import PageObjects.user;
import Utilities.helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class userstep extends Base{
	
	user use;
	private static final Logger LOGGER=LogManager.getLogger(userstep.class);
	@Given("Admin\\/User\\/Staff is on any page after Login")
	public void admin_user_staff_is_on_any_page_after_login() {
	    use=new user(helper.getDriver());
	    LOGGER.info("useris in login page");
	}

	@When("Admin\\/User\\/Staff clicks the Tab User")
	public void admin_user_staff_clicks_the_tab_user() {
		use.clicksusertab();
		LOGGER.info("useris in user tab");
	}

	@Then("Admin\\/User\\/Staff should see the Manage user page")
	public void admin_user_staff_should_see_the_manage_user_page() {
		use.seemanagepage();
		LOGGER.info("useris can see managepage");
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
		use.clicksusertab();
	}

	@Then("Admin\\/User\\/Staff should see the page heading as Manage User")
	public void admin_user_staff_should_see_the_page_heading_as_manage_user() {
	    use.seemanagepage();
	    
	}
	@Given("Admin\\/User\\/Staff is on any page after Loginp.")
	public void admin_user_staff_is_on_any_page_after_loginp() {
	    use=new user(helper.getDriver());
	    use.onanypage();
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tabu")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tabu() {
	    
	use.clicksusertab();
	}

	@Then("Admin\\/User\\/Staff should see the pagination controls below data table")
	public void admin_user_staff_should_see_the_pagination_controls_below_data_table() {
	    use.pagcon();
	    use.clicksusertab();
	}

	@Given("Admin\\/User\\/Staff is on Manage user pagE")
	public void admin_user_staff_is_on_manage_user_pag_e() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Manage user table has less than or equal to five rows")
	public void manage_user_table_has_less_than_or_equal_to_five_rows() {
	    use.row5orless();
	}

	@Then("Pagination control should be disabled")
	public void pagination_control_should_be_disabled() {
	    use.pagdisabled();
	}

	@Given("Admin\\/User,Staff is on Manage user paGe")
	public void admin_user_staff_is_on_manage_user_pa_ge() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Manage user table has more than five rows")
	public void manage_user_table_has_more_than_five_rows() {
	    use.morethan5();
	}

	@Then("Pagination control should be enabled")
	public void pagination_control_should_be_enabled() {
	    use.pagenabled();
	}

	@Given("Admin\\/User\\/Staff table is displayed in manage user pAge")
	public void admin_user_staff_table_is_displayed_in_manage_user_p_age() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Admin\\/User\\/Staff clicks next link of pagination")
	public void admin_user_staff_clicks_next_link_of_pagination() {
	    use.nextlinkpag();
	}

	@Then("Next page should be displayed")
	public void next_page_should_be_displayed() {
	    use.nextlinkpagdis();
	}

	@Given("last page of Admin\\/User\\/Staff records are displayed")
	public void last_page_of_admin_user_staff_records_are_displayed() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Admin\\/User\\/Staff click next link of pagination")
	public void admin_user_staff_click_next_link_of_pagination() {
	    use.nextlinkpag();
	}

	@Then("Next link of pagination should be disabled")
	public void next_link_of_pagination_should_be_disabled() {
	    use.nextlinkpagdis();
	}

	@Given("Admin\\/User\\/Staff taBle is displayed in manage user pAge")
	public void admin_user_staff_ta_ble_is_displayed_in_manage_user_p_age() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Admin\\/User\\/Staff clicks previous link of paginatioN")
	public void admin_user_staff_clicks_previous_link_of_paginatio_n() {
	    use.clicksprevlinkpag();
	}

	@Then("previous page should be displayed")
	public void previous_page_should_be_displayed() {
	    use.clicksprevlinkdisplayed();
	}

	@Given("First page of user table is displayed")
	public void first_page_of_user_table_is_displayed() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Admin,User,Staff clicks previous link of Pagination")
	public void admin_user_staff_clicks_previous_link_of_pagination() {
	    use.clicksprevlinkpag();
	}

	@Then("Previous link of pagination should be disabled")
	public void previous_link_of_pagination_should_be_disabled() {
	    use.prevlinkdisabled();
	}
	@Given("Admin\\/User\\/Staff table  displayed in manage USER page")
	public void admin_user_staff_table_displayed_in_manage_user_page() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}
	    
	@When("Admin\\/User\\/Staff clicks << icon in pagInation")
	public void admin_user_staff_clicks_icon_in_pag_ination() {
	    use.clickspprevious();
	}

	@Then("Admin\\/User\\/Staff clicks should see the First page of the table")
	public void admin_user_staff_clicks_should_see_the_first_page_of_the_table() {
	    use.firstpagetb();
	}

	@Given("Admin\\/user\\/Staff table is displayed iN manage user page.")
	public void admin_user_staff_table_is_displayed_i_n_manage_user_page() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Admin\\/User\\/Staff cLicks >> icon in pagination")
	public void admin_user_staff_c_licks_icon_in_pagination() {
	    use.clicksnnext();
	}

	@Then("Admin\\/User\\/Staff clicks should see the last page of the table")
	public void admin_user_staff_clicks_should_see_the_last_page_of_the_table() {
	    
	}

	@Given("Admin\\/User\\/Staff table is displayd in manage user page")
	public void admin_user_staff_table_is_displayd_in_manage_user_page() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Admin\\/User\\/Staff lands on Manage User page")
	public void admin_user_staff_lands_on_manage_user_page() {
	    use.landonmanageusrpage();
	}

	@Then("Admin\\/User\\/Staff should see the text Showing {int} to {int} of {int} entries beow the user table.")
	public void admin_user_staff_should_see_the_text_showing_to_of_entries_beow_the_user_table(Integer int1, Integer int2, Integer int3) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page")
	public void admin_user_staff_table_is_displayed_in_manage_user_page() {
		use=new user(helper.getDriver());
		use.seemanagepage();
	}

	@When("Admin,User,Staff lands on Manage UseR page")
	public void admin_user_staff_lands_on_manage_use_r_page() {
		use.landonmanageusrpage();
	}

	@Then("Admin\\/User\\/Staffshould see the table footer as In total there are four users.")
	public void admin_user_staffshould_see_the_table_footer_as_in_total_there_are_four_users() {
	    use.totalfooter();
	}
	@Given("Adminr User r Staff is on any page after Login")
	public void adminr_user_r_staff_is_on_any_page_after_login() {
		use=new user(helper.getDriver());
		use.onanypage();
	}

	@When("Adminr Userr Staff is on the Manage user page after clicking User Tab")
	public void adminr_userr_staff_is_on_the_manage_user_page_after_clicking_user_tab() {
	    use.clicksusertab();
	}

	@Then("Admin\\/User\\/Staff should see the button with text plus  icon and Add New User")
	public void admin_user_staff_should_see_the_button_with_text_plus_icon_and_add_new_user() {
	    use.seeadduser();
	}
	@Given("Admin\\/User\\/Staff is on Manage user page")
	public void admin_user_staff_is_on_manage_user_page() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks Add New User")
	public void admin_user_staff_clicks_add_new_user() {
	    use.clicksadduser();
	}

	@Then("Admin\\/User\\/Staff should see the User details dialog box")
	public void admin_user_staff_should_see_the_user_details_dialog_box() {
	    use.adduserdiaologue();
	}
	@Given("Adminr User r Staff is on any page after LogiN")
	public void adminr_user_r_staff_is_on_any_page_after_logi_n() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}

	@When("Adminr Userr Staff is on the Manage user page after clicking User")
	public void adminr_userr_staff_is_on_the_manage_user_page_after_clicking_user() {
	    use.clicksusertab();
	}

	@Then("Adminr Userr Staff should see the table header as Empty checkbox-icon  ID with sort icon, Name with Sort icon")
	public void adminr_userr_staff_should_see_the_table_header_as_empty_checkbox_icon_id_with_sort_icon_name_with_sort_icon() {
	    use.seeemptyheader();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page-sort icon")
	public void admin_user_staff_table_is_displayed_in_manage_user_page_sort_icon() {
	    use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff clicks sort icon in table header")
	public void admin_user_staff_clicks_sort_icon_in_table_header() {
	    use.clicksorticon();
	}

	@Then("Table rows should be sorted")
	public void table_rows_should_be_sorted() {
	    use.rowssorted();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page-checkbox")
	public void admin_user_staff_table_is_displayed_in_manage_user_page_checkbox() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff checks empty checkbox in header")
	public void admin_user_staff_checks_empty_checkbox_in_header() {
	    use.checksemptycheckbox();
	    }

	@Then("Check box in all the rows of user table should be checked")
	public void check_box_in_all_the_rows_of_user_table_should_be_checked() {
	    use.allcheckboxchecked();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page-unchecks")
	public void admin_user_staff_table_is_displayed_in_manage_user_page_unchecks() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff unchecks checkbox in header")
	public void admin_user_staff_unchecks_checkbox_in_header() {
	    use.uncheck();
	}

	@Then("Check box in all the rows of user table should be unchecked")
	public void check_box_in_all_the_rows_of_user_table_should_be_unchecked() {
	    use.allunchecked();
	}
	@Given("Admin\\/User\\/Staff is on any page after Login-Deleteicon")
	public void admin_user_staff_is_on_any_page_after_login_deleteicon() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	
	}
	@When("Admin\\/User\\/Staffis on the Manage user page after clicking User Tab")
	public void admin_user_staffis_on_the_manage_user_page_after_clicking_user_tab() {
	    use.clicksusertab();
	}

	@Then("Admin\\/User\\/Staff should see the delete icon at the top left corner of the user table")
	public void admin_user_staff_should_see_the_delete_icon_at_the_top_left_corner_of_the_user_table() {
	    use.seedelete();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page-deleteicon")
	public void admin_user_staff_table_is_displayed_in_manage_user_page_deleteicon() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("No rows is checked")
	public void no_rows_is_checked() {
	    use.norowchecked();
	}

	@Then("Delete icon at the top left corner of the user table disabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_disabled() {
	    use.deletedisabled();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page-del")
	public void admin_user_staff_table_is_displayed_in_manage_user_page_del() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff checks the rows in user table-del")
	public void admin_user_staff_checks_the_rows_in_user_table_del() {
	    use.checksarow();
	}
	@Then("Delete icon at the top left corner of the user table enabled")
	public void delete_icon_at_the_top_left_corner_of_the_user_table_enabled() {
	    
	}

	@Given("Admin\\/User\\/Staff checks the rows in user table")
	public void admin_user_staff_checks_the_rows_in_user_table() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks the delete icon at the top left corner of user table")
	public void admin_user_staff_clicks_the_delete_icon_at_the_top_left_corner_of_user_table() {
	    use.clickdelete();
	}

	@Then("Confirm dialog box should be displayed with Text Are you sure you want to delete the selected Admin\\/User\\/Staffs")
	public void confirm_dialog_box_should_be_displayed_with_text_are_you_sure_you_want_to_delete_the_selected_admin_user_staffs() {
	    use.dialogbox();
	}

	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
		use.clickdelete();
		use.dialogbox();
	}

	@When("Admin\\/User\\/Staff clicks button with text No")
	public void admin_user_staff_clicks_button_with_text_no() {
	    use.nodialogbox();
	}

	@Then("Selected rows should not be deleted and dialog box should be closed")
	public void selected_rows_should_not_be_deleted_and_dialog_box_should_be_closed() {
	    use.dialogboxclosed();
	}
	@Given("Admin\\/User\\/Staff checks the rows in user table-checksrow")
	public void admin_user_staff_checks_the_rows_in_user_table_checksrow() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
		}
	@When("Admin\\/User\\/Staff clicks button with text Yes")
	public void admin_user_staff_clicks_button_with_text_yes() {
	    use.dialogboxyes();
	}

	@Then("Selected rows should be deleted and popup should be shown with success message User deleted")
	public void selected_rows_should_be_deleted_and_popup_should_be_shown_with_success_message_user_deleted() {
	    use.succesdelmsg();
	}
	@Given("Admin\\/User\\/Staff is in confirm dialog box after clicking delete icon-x")
	public void admin_user_staff_is_in_confirm_dialog_box_after_clicking_delete_icon_x() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff clicks the close\\(x) icon")
	public void admin_user_staff_clicks_the_close_x_icon() {
	    use.close();
	}

	@Then("Confirm dialog box should be closed")
	public void confirm_dialog_box_should_be_closed() {
	    use.closeconfirm();
	    }
	@Given("Admin\\/User\\/Staff is on any page after Login-editdelete")
	public void admin_user_staff_is_on_any_page_after_login_editdelete() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab-editdelete")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab_editdelete() {
	    use.clicksusertab();
	}

	@Then("Admin\\/User\\/Staff should see the buttons with edit\\/delete icon in each row of Edit\\/Delete coulmn")
	public void admin_user_staff_should_see_the_buttons_with_edit_delete_icon_in_each_row_of_edit_delete_coulmn() {
	    use.seeeditdelete();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page-delfun")
	public void admin_user_staff_table_is_displayed_in_manage_user_page_delfun() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff clicks delete button")
	public void admin_user_staff_clicks_delete_button() {
	    use.clicksdelete();
	}

	@Then("Confirm dialog box should be displayed with Text Are you sure you want to delete selected user name")
	public void confirm_dialog_box_should_be_displayed_with_text_are_you_sure_you_want_to_delete_selected_user_name() {
	    use.rusure();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page-edit")
	public void admin_user_staff_table_is_displayed_in_manage_user_page_edit() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff clicks on the Edit button")
	public void admin_user_staff_clicks_on_the_edit_button() {
	    use.clicksedit();
	}

	@Then("User Details dialog box should be displayed for editing")
	public void user_details_dialog_box_should_be_displayed_for_editing() {
	    use.userdetailsdisplayed();
	}
	
	@Given("Admin\\/User\\/Staff is on any page after Login--search")
	public void admin_user_staff_is_on_any_page_after_login_search() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking User Tab-search")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab_search() {
	    use.clicksusertab();
	}
	@Then("Admin\\/User\\/Staff see the Search Text box has text as Search")
	public void admin_user_staff_see_the_search_text_box_has_text_as_search() {
	    use.serchdisplyed();
	}
	@Given("Admin\\/User\\/Staff is on any page after Login-searchinput")
	public void admin_user_staff_is_on_any_page_after_login_searchinput() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff is on the Manage user page after clicking UserTab-searchinput")
	public void admin_user_staff_is_on_the_manage_user_page_after_clicking_user_tab_searchinput() {
	    use.clicksusertab();
	}

	@Then("Admin\\/User\\/Staff should see the search input field with search icon and text as\" Search�\"")
	public void admin_user_staff_should_see_the_search_input_field_with_search_icon_and_text_as_search() {
	    use.serchicon();
	}
	@Given("Admin\\/User\\/Staff is on Manage user page-searchfun")
	public void admin_user_staff_is_on_manage_user_page_searchfun() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff types Name to search")
	public void admin_user_staff_types_name_to_search() {
	    
	}

	@Then("Rows with the name should be displayed")
	public void rows_with_the_name_should_be_displayed() {
	    use.rowdis();
	}
	@Given("Admin\\/User\\/Staff is on Manage user page--verifyfun")
	public void admin_user_staff_is_on_manage_user_page_verifyfun() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();

	}
	@When("Admin\\/User\\/Staff types random text in search field which has no matching entry")
	public void admin_user_staff_types_random_text_in_search_field_which_has_no_matching_entry() {
	    use.randomtext();
	}

	@Then("No rows is displayed")
	public void no_rows_is_displayed() {
	    use.norowdisp();
	}
	@Given("Admin\\/User\\/Staff table is displayed in manage user page-id")
	public void admin_user_staff_table_is_displayed_in_manage_user_page_id() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff clicks ID in any row")
	public void admin_user_staff_clicks_id_in_any_row() {
	    use.clicksid();
	}

	@Then("Admin\\/User\\/Staff  see dialog box displayed with user information")
	public void admin_user_staff_see_dialog_box_displayed_with_user_information() {
	    use.dispid();
	}
	@Given("Admin\\/User\\/Staff is on Manage user page-userdet")
	public void admin_user_staff_is_on_manage_user_page_userdet() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}
	@When("Admin\\/User\\/Staff clicks Add new user button")
	public void admin_user_staff_clicks_add_new_user_button() {
	    use.clicksadduse();
	}

	@Then("Admin\\/User\\/Staff should see User Details window with text as User Details")
	public void admin_user_staff_should_see_user_details_window_with_text_as_user_details() {
	    use.seeuserdetail();
	    }
	@Given("Admin\\/User\\/Staff is on Manage user page-cancel")
	public void admin_user_staff_is_on_manage_user_page_cancel() {
		use=new user(helper.getDriver());
		use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks Add new user button-cancel")
	public void admin_user_staff_clicks_add_new_user_button_cancel() {
	    use.clicksusertab();
	}
	@Then("Admin\\/User\\/Staff should see a button with text as Cancel  in User Details window")
	public void admin_user_staff_should_see_a_button_with_text_as_cancel_in_user_details_window() {
	    use.seecancel();
	}

	@Given("Admin\\/User\\/Staff is on User Details window")
	public void admin_user_staff_is_on_user_details_window() {
	    use=new user(helper.getDriver());
	    use.onmanaguserpage();
	    }

	@When("Admin\\/User\\/Staff clicks cancel button")
	public void admin_user_staff_clicks_cancel_button() {
	    use.clickscancel();
	}

	@Then("Admin\\/User\\/Staff  see User Details window getting  closed")
	public void admin_user_staff_see_user_details_window_getting_closed() {
	    use.winclosd();
	}
	@Given("Admin\\/User\\/Staff is on Manage user page-cancelx")
	public void admin_user_staff_is_on_manage_user_page_cancelx() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks Add new user button-cancelx")
	public void admin_user_staff_clicks_add_new_user_button_cancelx() {
	    use.clicksadduser();
	}
	@Then("Admin\\/User\\/Staff should see a cancelx icon")
	public void admin_user_staff_should_see_a_cancelx_icon() {
	    use.seecancel();
	}

	@Given("Admin\\/User\\/Staff is on User Details details window")
	public void admin_user_staff_is_on_user_details_details_window() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	    use.clicksedit();
	    
	}

	@When("Admin\\/User\\/Staff clicks cancelX")
	public void admin_user_staff_clicks_cancel_x() {
	    use.clickscancel();
	}

	@Then("User Details window should be closed")
	public void user_details_window_should_be_closed() {
	    use.winclosd();
	}
	@Given("Admin\\/User\\/STAFF in Manage user page")
	public void admin_user_staff_in_manage_user_page() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff CLIck Add new user button")
	public void admin_user_staff_cl_ick_add_new_user_button() {
	    use.clicksadduse();
	}

	@Then("Admin\\/User\\/Staff should see a button with text as Submit in user details window")
	public void admin_user_staff_should_see_a_button_with_text_as_submit_in_user_details_window() {
	    use.seeuserdetail();
	}

	@Given("Admin\\/User\\/Staff is on MAnage user page")
	public void admin_user_staff_is_on_m_anage_user_page() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();    
	}

	@When("Admin\\/User\\/Staff clicks ADD new user button-LabelText")
	public void admin_user_staff_clicks_add_new_user_button_label_text() {
		use.clicksadduse();
	}

	@Then("Admin\\/User\\/Staff should see the placeholders with Text As First name and so on")
	public void admin_user_staff_should_see_the_placeholders_with_text_as_first_name_and_so_on() {
	    use.placehodernametext();
	}

	@Given("Admin\\/uSER\\/Staff is on Manage user page")
	public void admin_u_ser_staff_is_on_manage_user_page() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks Add NEW user BUTTON-input")
	public void admin_user_staff_clicks_add_new_user_button_input() {
		use.clicksadduse();
	}

	@Then("Admin\\/User\\/Staff should see the input fields for First name,Middle name and so on")
	public void admin_user_staff_should_see_the_input_fields_for_first_name_middle_name_and_so_on() {
	    use.inputfield();
	}

	@Given("Admin\\/User\\/Staff is on User DETAils window")
	public void admin_user_staff_is_on_user_det_ails_window() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks the drop down icon for state")
	public void admin_user_staff_clicks_the_drop_down_icon_for_state() {
	    use.clicksdropdownstateicon();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for state")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_state() {
	    use.seedropdwmenu();
	    }

	@Given("Admin\\/User\\/Staff is on User details WINdow")
	public void admin_user_staff_is_on_user_details_wi_ndow() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks the drop down icon for User Role")
	public void admin_user_staff_clicks_the_drop_down_icon_for_user_role() {
	    use.clicksusericon();
	}

	@Then("Admin\\/User\\/Staff should select from the drop down menu for user role")
	public void admin_user_staff_should_select_from_the_drop_down_menu_for_user_role() {
		use.selectuserrole();
	}

	@Given("Admin\\/User\\/Staff is on User DetailswinDOW")
	public void admin_user_staff_is_on_user_detailswin_dow() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks submit button with all details empty")
	public void admin_user_staff_clicks_submit_button_with_all_details_empty() {
	    use.subfun();
	}

	@Then("Admin\\/User\\/Staff should see a Error message Mandatory Fields cannot be empty")
	public void admin_user_staff_should_see_a_error_message_mandatory_fields_cannot_be_empty() {
	    use.error();
	}

	@Given("Admin\\/User\\/Staff is on UserDetailswindow")
	public void admin_user_staff_is_on_user_detailswindow() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks Submit button by {string}")
	public void admin_user_staff_clicks_submit_button_by(String string) {
	    use.allsub(string);
	}

	@Then("Admin\\/User\\/Staff  see Success message  New User Created  is  Should be Saved.")
	public void admin_user_staff_see_success_message_new_user_created_is_should_be_saved() {
	    use.success();
	}

	@Given("Admin\\/User\\/Staff is on User Detailwindow")
	public void admin_user_staff_is_on_user_detailwindow() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks on Submit button after entering  Few Field details")
	public void admin_user_staff_clicks_on_submit_button_after_entering_few_field_details() {
	    use.namereq();
	}

	@Then("Admin\\/User\\/Staff see error message Name is required")
	public void admin_user_staff_see_error_message_name_is_required() {
	    use.namereq();
	}

	@Given("Admin\\/User\\/Staff is on User Detailswindow- foremailid")
	public void admin_user_staff_is_on_user_detailswindow_foremailid() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks on Submit button after entering wrong email address")
	public void admin_user_staff_clicks_on_submit_button_after_entering_wrong_email_address() {
	    use.namereq();
	}

	@Then("Admin\\/User\\/Staff see error message Invalid Email address")
	public void admin_user_staff_see_error_message_invalid_email_address() {
	    use.msg();
	}

	@Given("Admin\\/User\\/Staff is on Manage user page- foraddress2")
	public void admin_user_staff_is_on_manage_user_page_foraddress2() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks Add new user button -validating address")
	public void admin_user_staff_clicks_add_new_user_button_validating_address() {
	    use.clicksadduse();
	}

	@Then("Admin\\/User\\/Staff should see  button with text  Add C\\/O, Apt, Suite, Unit")
	public void admin_user_staff_should_see_button_with_text_add_c_o_apt_suite_unit() {
	    use.seetext();
	}

	@Given("Admin\\/User\\/Staff is  Manage user page")
	public void admin_user_staff_is_manage_user_page() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff Enters more than {string}")
	public void admin_user_staff_enters_more_than(String string) {
	    use.morethan10("10");
	}

	@Then("Admin\\/User\\/Staff see error message Invalid Input")
	public void admin_user_staff_see_error_message_invalid_input() {
	   use.invalid();
	}

	@Given("admin\\/User\\/Staff is on Manage user page-postal")
	public void admin_user_staff_is_on_manage_user_page_postal() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff Enters moreThan {string}-postal")
	public void admin_user_staff_enters_more_than_postal(String string) {
	    use.morethan5();
	}

	@Then("Admin\\/User\\/Staff see error message Invalid Input-Postal")
	public void admin_user_staff_see_error_message_invalid_input_postal() {
	    use.invalid();
	}

	@Given("Admin\\/User\\/Staff is on ManagE user page")
	public void admin_user_staff_is_on_manag_e_user_page() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	    }

	@When("Admin\\/User\\/Staff clicks on state dropdowN")
	public void admin_user_staff_clicks_on_state_dropdow_n() {
	    use.clicksstatedp();
	}

	@Then("Admin\\/User\\/Staff see list of states in Alphabetical Order")
	public void admin_user_staff_see_list_of_states_in_alphabetical_order() {
	    use.alphabet();
	}

	@Given("Validating UG Program Dropdown")
	public void validating_ug_program_dropdown() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff clicks on UG Program dropdown")
	public void admin_user_staff_clicks_on_ug_program_dropdown() {
	    use.ugdp();
	}

	@Then("Admin\\/User\\/Staff see list of UG Program")
	public void admin_user_staff_see_list_of_ug_program() {
	    use.listugdp();
	}

	@Given("Admin\\/User\\/Staff  on User Detailswindow")
	public void admin_user_staff_on_user_detailswindow() {
		use=new user(helper.getDriver());
	    use.onmanaguserpage();
	}

	@When("Admin\\/User\\/Staff CLicks the button  Add C\\/O, Apt, Suite, Unit")
	public void admin_user_staff_c_licks_the_button_add_c_o_apt_suite_unit() {
	    use.add();
	}

	@Then("Admin\\/User\\/Staff should see the input field with Label New Address2")
	public void admin_user_staff_should_see_the_input_field_with_label_new_address2() {
	    use.addifield();
	}




}