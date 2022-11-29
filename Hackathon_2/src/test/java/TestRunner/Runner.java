package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\deepu\\eclipse-workspace\\Hackathon_2\\src\\test\\resources\\Feature\\Programfeatures",
                 glue ="StepDiFinitions",
                 dryRun=false,
                 monochrome=true,
                		  plugin= {"pretty",
                	        		"html:target/cu.html",
                	        		"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                	                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",})
                // plugin= {"pretty","html:test-output"})
public class Runner {

}
