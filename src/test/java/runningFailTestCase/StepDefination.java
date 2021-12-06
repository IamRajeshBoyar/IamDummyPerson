package runningFailTestCase;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefination {
	WebDriver driver;
	
	@Given("user is on the {string}")
	public void user_is_on_the(String string) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get(string);
	}
	@When("user eneter search term {string}")
	public void user_eneter_search_term(String string) {
	  driver.findElement(By.id("search"));
	}
	@When("clicks on submit button")
	public void clicks_on_submit_button() {
	  driver.findElement(By.xpath("(//button[@type='submit'])[1]"));
	}
	@Then("user is url should be {string}")
	public void user_is_url_should_be(String url) {
	   
		String expected = url;
		String actualUrl = driver.getCurrentUrl();
		
		Assert.assertEquals(expected, actualUrl);
	}



	
	
}
