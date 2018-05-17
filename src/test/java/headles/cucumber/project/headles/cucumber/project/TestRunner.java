package headles.cucumber.project.headles.cucumber.project;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"features/","classpath:headles.cucumber.project.headles.cucumber.project.StepDefinitions"},
		format = {"pretty","json:target/cucumber.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

	
	
}
