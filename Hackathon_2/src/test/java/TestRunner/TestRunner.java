package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
	@CucumberOptions(features="C:\\Users\\deepu\\eclipse-workspace\\Hackathon_2\\src\\test\\resources\\Batch_Feature",
	                 glue ="StepDiFinitions",
	                 dryRun=true,
	                 monochrome=true,
	                 plugin= {"pretty","html:test-output"})

	public class TestRunner {
}
