package practiceStepDefination;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksStepDefination {


	@Given("user is on the registration page")
	public void user_is_on_the_registration_page() {
	   System.out.println("Registration page got loaded");
	}
	@When("user enters firstname, email and password")
	public void user_enters_firstname_email_and_password() {
	   System.out.println("user is entering firstname..email..password!!");
	}
	@When("use clicks on register link")
	public void use_clicks_on_register_link() {
		System.out.println("user is now clicking on registration button..");
	}
	@Then("user should be succesfull registered")
	public void user_should_be_succesfull_registered() {
	    System.out.println("user now got successfully got registered");
	}
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    System.out.println("user is on login page---------");
	}
	@When("user enters the username and password")
	public void user_enters_the_username_and_password() {
	   System.out.println("user enters username and password...............");
	   
	}
	
	@When("user clicks on login button scenario")
	public void user_clicks_on_login_button_scenario() {
	    System.out.println("now user is clicking on the login button.....");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	   System.out.println("user is navigated to homepage-----------");
	}

	@Before(order = 1)
	public void beforHooks() {
		System.out.println("this will run before hooks");
	}
	
	@After (order = 1)
	public void afterHooks() {
		System.out.println("this will run after hooks");
	}
	
	@Before(order = 2)
	public void beforHooks1() {
		System.out.println("this will run before hooks1");
	}
	
	@After(order = 2)
	public void afterHooks1() {
		System.out.println("this will run after hooks1");
	}
	
}
