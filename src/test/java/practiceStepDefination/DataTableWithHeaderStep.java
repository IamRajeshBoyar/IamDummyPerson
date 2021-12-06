package practiceStepDefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableWithHeaderStep {

	WebDriver driver;
	
	@Given("user is on the login page of demo.hrm login page")
	public void user_is_on_the_login_page_of_demo_hrm_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\MavenProjectMain\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("user enters the below credential with header")
	public void user_enters_the_below_credential_with_header(DataTable dataTable) {
		
		List<Map<String, String>> keyValuePair=dataTable.asMaps(String.class, String.class);
		String username =keyValuePair.get(0).get("username");
		String password = keyValuePair.get(0).get("password");
		
		   driver.findElement(By.id("txtUsername")).sendKeys(username);
		   driver.findElement(By.id("txtPassword")).sendKeys(password);
		
	}
	@When("clicks on the login button of demo.hrm login page")
	public void clicks_on_the_login_button_of_demo_hrm_login_page() {
		driver.findElement(By.id("btnLogin")).click();
	}
	@Then("user should be navigated to demo.hrm home page")
	public void user_should_be_navigated_to_demo_hrm_home_page() {
	   System.out.println("the user successfully got logined using dataTable with header");
	}



	
}
