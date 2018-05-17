package headles.cucumber.project.headles.cucumber.project;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		features = {"target/","classpath:headles.cucumber.project.headles.cucumber.project.StepDefinitions"},
		format = {"pretty","json:target/cucumber.json"}
		)

public class TestRunner extends AbstractTestNGCucumberTests {

	
	
}
