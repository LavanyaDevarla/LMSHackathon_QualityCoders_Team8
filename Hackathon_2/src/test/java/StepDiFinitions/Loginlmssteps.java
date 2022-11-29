package StepDiFinitions;

import BaseClass.Base;
import PageObjects.LMSlogin;

import Utilities.helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginlmssteps extends Base{
	 Loginlmssteps ls;
	// Program p;
	 LMSlogin l;
	//-----------------------LOGINBUTTON--------------------
	 
	
	@Given("Admin\\/User\\/Staff is on Browser")
	public void admin_user_staff_is_on_browser() {
		//p=new Program(helper.getDriver()); 
		
	}

	@When("Admin\\/User\\/Staff opens the LMS website")
	public void admin_user_staff_opens_the_lms_website() {
		 helper.openPage("url");
		// Loggerload.info("LMS WEB SITE OPENED");
	}

	@Then("Admin\\/user\\/Staff should be navigated to login page")
	public void admin_user_staff_should_be_navigated_to_login_page() {
		//Loggerload.info("LOGIN page opened");
		
	}
	
	//--------------------LOGIN INVALID CREDENTIALS----------------
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		
		 //Loggerload.info("USER IS IN LOGIN PAGE");
	}

	@When("User clicks login button after entering name and Password")
	public void user_clicks_login_button_after_entering_name_and_password() {
	    
	//	l.loginbutton();
	    
	}

	@Then("User see header text as {string}")
	public void user_see_header_text_as(String string) {
		l.loginsuccess();
		// Loggerload.info("User see header text as  login success");
	}

	@Given("Admin\\/staff is on Login Page")
	public void admin_staff_is_on_login_page() {
	   
		 //Loggerload.info("USER IS IN LOGIN PAGE");
	}

	@When("Admin\\/Staff  clicks login Button after entering  Username,Password,code")
	public void admin_staff_clicks_login_button_after_entering_username_password_code() {
	    l.username("sai");
	    l.password("xxx");
	    l.code("s123");
		l.loginbutton();
		
	}

	@Then("Admin\\/Staff see header text as {string}")
	public void admin_staff_see_header_text_as(String string) {
	    l.loginsuccess();
		
	}
	
//-------------------------------LOGIN INVALID CREDENTIALS-------------------------
	
	
	
	@When("User clicks login button after entering valid Username and invalid Password")
	public void user_clicks_login_button_after_entering_valid_username_and_invalid_password() {

		l.username("sai");
	    l.password("x6x");
	
		l.loginbutton();
		
	}

	@Then("User should see a error message {string}")
	public void user_should_see_a_error_message(String string) {
	    
		l.loginerror();
		
	}

	@When("User clicks login button after entering  Invalid username and valid Password")
	public void user_clicks_login_button_after_entering_invalid_username_and_valid_password() {

		l.username("sai1");
	    l.password("xxx");
	
		l.loginbutton();
		
		
	}

	@When("User clicks login button after entering Invalid username and invalid Password")
	public void user_clicks_login_button_after_entering_invalid_username_and_invalid_password() {
		l.username("sai1");
	    l.password("xxx1");
	
		l.loginbutton();
		
	}

	@Given("User  is on the Login Page")
	public void user_is_on_the_login_page() {
	  //  Loggerload.info("User  is on the Login Page");
		
	}

	@When("User clicks login button after entering valid username and leaves Password field empty")
	public void user_clicks_login_button_after_entering_valid_username_and_leaves_password_field_empty() {
		l.username("sai1");
	    l.password(" ");
	
		l.loginbutton();
		
		
	}

	@Then("It should show error message {string}")
	public void it_should_show_error_message(String string) {
	  
		l.loginerror();
		
	}

	@Given("Admin\\/Staff is on the Login Page")
	public void admin_staff_is_on_the_login_page() {
	   
	//	Loggerload.info("User  is on the Login Page");
	}

	@When("Admin\\/Staff  clicks login button after entering  valid username invalid Password and code")
	public void admin_staff_clicks_login_button_after_entering_valid_username_invalid_password_and_code() {
		l.username("sai");
	    l.password("xxy");
	    l.code("s123");
		l.loginbutton();
		
	}

	@Then("Admin\\/Staff should see a error message {string}")
	public void admin_staff_should_see_a_error_message(String string) {
	  
		l.loginerror();
	}

	@When("Admin\\/Staff  clicks login button after entering invalid username,valid Password and code")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_code() {
		l.username("sai6");
	    l.password("xxx");
	    l.code("s123");
		l.loginbutton();
		
	}

	@When("Admin\\/Staff  clicks login button after entering invalid username,valid Password  and without code")
	public void admin_staff_clicks_login_button_after_entering_invalid_username_valid_password_and_without_code() {
	    
		l.username("sai6");
	    l.password("xxx");
	    l.code(" ");
		l.loginbutton();
	}
	
	
//--------------------------------FORRGOT PASSWORD-------------------------------
	
	@Given("Admin\\/User\\/Staff is on Forgot Password Page")
	public void admin_user_staff_is_on_forgot_password_page() {
	   
	//	Loggerload.info("Admin\\\\/User\\\\/Staff is on Forgot Password Page");
	}

	@When("Admin\\/User\\/Staff  clicks continue after entering valid email address")
	public void admin_user_staff_clicks_continue_after_entering_valid_email_address() {
	 
		l.email("aaaa@gmail.com");
		l.loginbutton();
		
	}

	@Then("Admin\\/User\\/Staff should be redirected to enter verification code page and verification code will be sent to email")
	public void admin_user_staff_should_be_redirected_to_enter_verification_code_page_and_verification_code_will_be_sent_to_email() {
	   
	//	Loggerload.info("Enter verification code page and verification code will be sent to email");
	}

	@Given("Admin\\/User\\/Staff is on Enter verification code Page")
	public void admin_user_staff_is_on_enter_verification_code_page() {
	    
	//	Loggerload.info("Admin\\\\/User\\\\/Staff is on Enter verification code page ");
	}

	@When("Admin\\/User\\/Staff  clicks continue after entering verification code")
	public void admin_user_staff_clicks_continue_after_entering_verification_code() {
	   
		l.verificode("1233");
		l.continuelog();
		
		
	}

	@Then("Admin\\/User\\/Staff should be redirected reset password page")
	public void admin_user_staff_should_be_redirected_reset_password_page() {
//	   Loggerload.info("Admin\\/User\\/Staff should be redirected reset password page");
		
	}
	@Given("Admin\\/User\\/Staff is on the enter verification code Page")
	public void admin_user_staff_is_on_the_enter_verification_code_page() {
		
	//	Loggerload.info("Admin\\\\/User\\\\/Staff is on the enter verification code Page");
		
	}


	@When("Admin\\/User\\/Staff clicks Click here link to resend")
	public void admin_user_staff_clicks_click_here_link_to_resend() {
	   
		l.resend();
	}

	@Then("The verification code should be resend to email")
	public void the_verification_code_should_be_resend_to_email() {
		//Loggerload.info(" The verification code should be resend to email");
	    
	}

	
	//-----------------------------RESET PASSWORD-------------------------------
	
	@Given("Admin\\/User\\/Staff is on Reset Password Page")
	public void admin_user_staff_is_on_reset_password_page() {
	  
	//	Loggerload.info("Admin\\\\/User\\\\/Staff is on Reset Password Page");
		
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering new password and retype password")
	public void admin_user_staff_clicks_submit_button_after_entering_new_password_and_retype_password() {
	   l.newpassword("asaa");
	   l.retypepass("asaa");
		l.submit();
	}


	@Then("Admin\\/User\\/Staff  should be redirected to login page")
	public void admin_user_staff_should_be_redirected_to_login_page() {
	   
	//	Loggerload.info("Admin\\\\/User\\\\/Staff  should be redirected to login page");
	}

	
	

	@Then("Admin\\/User\\/Staff  should see an error message {string}")
	public void admin_user_staff_should_see_an_error_message(String string) {
	   l.loginerror();
		
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering password  with less than {int} characters")
	public void admin_user_staff_clicks_submit_button_after_entering_password_with_less_than_characters(Integer int1) {
	    l.password("we");
	    l.submit();
	}

	@Then("It should display an error message {string}")
	public void it_should_display_an_error_message(String string) {
	   l.loginerror();
		
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering password without Capital letter")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_capital_letter() {
	    l.password("xxx");
	    l.submit();
	//    Loggerload.info("Admin\\\\/User\\\\/Staff clicks submit button after entering password without Capital letter");
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering  password without Number")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_number() {
		l.password("xxx");
	    l.submit();
	 //   Loggerload.info("Admin\\\\/User\\\\/Staff clicks submit button after entering  password without Number");
	}

	@When("Admin\\/User\\/Staff clicks submit button after entering password without Special character")
	public void admin_user_staff_clicks_submit_button_after_entering_password_without_special_character() {
		l.password("xxx");
	    l.submit();
//	    Loggerload.info("Admin\\\\/User\\\\/Staff clicks submit button after entering password without Special character");
	}

	@When("Admin\\/User\\/Staff clicks cancel button after entering new password and retype password")
	public void admin_user_staff_clicks_cancel_button_after_entering_new_password_and_retype_password() {
	   l.newpassword("www");
	   l.retypepass("www");
	   l.cancel();
		
	}

	@Then("Admin\\/User\\/Staff  should see a refreshed reset password page with empty fields")
	public void admin_user_staff_should_see_a_refreshed_reset_password_page_with_empty_fields() {
	 //   Loggerload.info("Admin\\\\/User\\\\/Staff  should see a refreshed reset password page with empty fields");
		
	}

}
