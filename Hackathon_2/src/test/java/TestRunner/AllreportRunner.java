package TestRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\deepu\\eclipse-workspace\\Hackathon_2\\src\\test\\resources\\Feature",
                 glue ="StepDiFinitions",
                 dryRun=false,
                 monochrome=true,
                 //plugin= {"pretty","html:test-output"})
                		 plugin= {"pretty","html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
                		         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                		        })

public class AllreportRunner {
	

}
