package practiceStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutlineStep {
WebDriver driver;
	
	@Given("user is on the login page of OrangeHrm")
	public void user_is_on_the_login_page_of_orange_hrm() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
		 driver.findElement(By.id("txtUsername")).sendKeys(username);
		   driver.findElement(By.id("txtPassword")).sendKeys(password);
	}
	@When("clicks on the LoginButton of OrangeHrm")
	public void clicks_on_the_login_button_of_orange_hrm() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("user should be navigated to home page of DemoOrangeHrm")
	public void user_should_be_navigated_to_home_page_of_demo_orange_hrm() {
	   System.out.println("user is navigated to home page of hrmdemo scenario outline example");
	}



	
}
