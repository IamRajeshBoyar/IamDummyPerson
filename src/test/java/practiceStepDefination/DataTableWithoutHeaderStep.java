package practiceStepDefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithoutHeaderStep {
	WebDriver driver;
	
	@Given("user is on the login page of Demo.hrm")
	public void user_is_on_the_login_page_of_demo_hrm() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		System.out.println("datatable login page");
	}
	@When("user enters the below username and password")
	public void user_enters_the_below_username_and_password(io.cucumber.datatable.DataTable dataTable) {
		
		List<String> credential =dataTable.asList(String.class);
		
		String username = credential.get(0);
		String password = credential.get(1);
		
		   driver.findElement(By.id("txtUsername")).sendKeys(username);
		   driver.findElement(By.id("txtPassword")).sendKeys(password);
		   System.out.println("data table username and password");
	}
	@When("user clicks on login button of hrm")
	public void user_clicks_on_login_button_of_hrm() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("user should be navigated to home page of hrm")
	public void user_should_be_navigated_to_home_page_of_hrm() {
		System.out.println("the user is navigated to home page successfully");
	}




}
