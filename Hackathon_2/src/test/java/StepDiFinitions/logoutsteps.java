package StepDiFinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.Base;
import PageObjects.logout;
import Utilities.helper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class logoutsteps extends Base{
	logout logou;
	private static final Logger LOGGER=LogManager.getLogger(logoutsteps.class);
@Given("Admin\\/User\\/Staff Logged on to LMS website application")
public void admin_user_staff_logged_on_to_lms_website_application() {
    logou=new logout(helper.getDriver());
    logou.logon();
    LOGGER.info("useris loged on");
}

@When("Admin\\/User\\/Staff  Clicks on LogOut button")
public void admin_user_staff_clicks_on_log_out_button() {
    logou.clicklogout();
    LOGGER.info("userclicks logout");
}

@Then("Admin\\/User\\/Staff should be navigated to Login Screen")
public void admin_user_staff_should_be_navigated_to_login_screen() {
    logou.navlogout();

}
}