package cucumberStepDefinationFile;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinationFile {
	WebDriver driver;

	@Given("users is on the home page of HRMDemoPage")
	public void users_is_on_the_home_page_of_hrm_demo_page() {

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

	}

	@When("user eneters the {string} and {string}")
	public void user_eneters_the_and(String username, String Password) {
	    System.out.println(username+" "+Password);
	}


//	@When("user eneters the username and password")
//	public void user_eneters_the_username_and_password(io.cucumber.datatable.DataTable dataTable) {
//	   
//		List<Map<String, String>> table = dataTable.asMaps(String.class, String.class);
//		
//		String username  = table.get(0).get("username");
//		String password  = table.get(0).get("password");
//		
//		System.out.println(username);
//	    System.out.println(password);
//	}

//	@When("user eneters the username and password")
//	public void user_eneters_the_username_and_password() {
//		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
//		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
//	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
//	  driver.findElement(By.id("btnLogin")).click();
	}


	@Then("user should be navigated to homepage")
	public void user_should_be_navigated_to_homepage() {
	 
//		String expectedUrl = "https://opensource-demo.orangehrmlive.com/index.php/dashboard";
//		
//		String currentUrl = driver.getCurrentUrl();
//		
//		Assert.assertEquals(expectedUrl, currentUrl);

	}

}
