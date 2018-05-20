package headles.cucumber.project.headles.cucumber.project;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	WebDriver driver = new HtmlUnitDriver(BrowserVersion.FIREFOX_38);
	
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
		Assert.assertEquals("Google", actual);
	}
	
	@Then("^Search button should be present$")
	public void search_button_should_be_present() throws Throwable {
		 Assert.assertTrue(driver.findElement(By.name("btnK")).isDisplayed());
	}
	
	@Given("^Facebook page is opened$")
	public void facebook_page_is_opened() throws Throwable {
	    driver.get("https://www.facebook.com");
	}

	@When("^Invalid credentials are provided$")
	public void invalid_credentials_are_provided() throws Throwable {
	    driver.findElement(By.name("email")).sendKeys("invalidEmail@ma.com");
	}

	@Then("^User should not be able to view dashboard page$")
	public void user_should_not_be_able_to_view_dashboard_page() throws Throwable {
	    Assert.assertTrue(driver.findElement(By.name("email")).isDisplayed());;
		
	}
	
	@Given("^Instagram page is opened$")
	public void instagram_page_is_opened() throws Throwable {
	    driver.get("http://www.google.pl");
	    System.out.println("PRZED TESTEM: "+driver.getTitle());
	    WebElement searchBox = driver.findElement(By.id("lst-ib"));
	    searchBox.sendKeys("dupa",Keys.ENTER);
	    System.out.println("PO TESCIE: "+driver.getTitle());
	}

	@When("^User put valid credentials$")
	public void user_put_valid_credentials() throws Throwable {
	    driver.findElement(By.name("username")).sendKeys("antekpoli8@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.name("password")).sendKeys("Password8");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button")).click();
	}

	@Then("^Page should display main menu$")
	public void page_should_display_main_menu() throws Throwable {
		 Thread.sleep(1000);
		Assert.assertFalse(driver.findElement(By.xpath("//img[@alt='Zdjęcie profilowe antekpoli8']")).isDisplayed());
	    
	}

}
