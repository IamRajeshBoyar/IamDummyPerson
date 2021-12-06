package practiceStepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationPractice {
	WebDriver driver;
	
	@Given("user is on HrmDemo login page")
	public void user_is_on_hrm_demo_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("user enters correct username and password")
	public void user_enters_correct_username_and_password() {
	   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	}
	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   driver.findElement(By.id("btnLogin")).click();
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
		System.out.println("user is logined successfuly");
	
	}

}
