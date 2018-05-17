package headles.cucumber.project.headles.cucumber.project;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;


public class HeadlessTest 
    
{
	@Test
    public void test() {
    	
    	WebDriver driver = new HtmlUnitDriver();
    	driver.get("http://www.facebook.com");
    	System.out.println(driver.getTitle());
    }
}
