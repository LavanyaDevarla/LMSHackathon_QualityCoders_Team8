package StepDiFinitions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.gherkin.model.Scenario;

import Utilities.helper;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	 @Before
	  public static void setUp() {
	    	
	    helper.setUpDriver();
	  }
	
	/*  @After
	  public static void tearDown(Scenario scenario) {
	
	      if(scenario.isFailed()) {
	          final byte[] screenshot = ((TakesScreenshot) helper.getDriver()).getScreenshotAs(OutputType.BYTES);
	          scenario.attach(screenshot, "image/png", scenario.getGherkinName());
	      }
	      
	      helper.tearDown();
	  }*/

}
