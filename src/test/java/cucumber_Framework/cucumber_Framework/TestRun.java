package cucumber_Framework.cucumber_Framework;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		monochrome=true,
		
		features = "feature",
		glue={"stepdefinition"}
		)
public class TestRun {

}