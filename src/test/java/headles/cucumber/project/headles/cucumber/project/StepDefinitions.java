package headles.cucumber.project.headles.cucumber.project;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	WebDriver driver = new HtmlUnitDriver();
	@When("^I open browser$")
	public void i_open_browser() throws Throwable {
	    driver.get("http://www.google.pl");
	}

	@Then("^Search box should be displayed$")
	public void search_box_should_be_displayed() throws Throwable {
	    Assert.assertTrue(driver.findElement(By.name("q")).isDisplayed());
	}
	
	@Then("^Expected page title should be matched to the expected one$")
	public void expected_page_title_should_be_matched_to_the_expected_one() throws Throwable {
		String actual = driver.getTitle();
		Assert.assertEquals("Gooogle", actual);
	}
	
	@Then("^Search button should be present$")
	public void search_button_should_be_present() throws Throwable {
		 Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed());
	}

}
