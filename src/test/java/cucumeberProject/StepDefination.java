package cucumeberProject;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	


	@Given("user enters the username before scenario")
	public void user_enters_the_username_before_scenario() {
	   System.out.println("background 1");
	}
	@Given("user enters the password before scenario")
	public void user_enters_the_password_before_scenario() {
		System.out.println("user is enetering username and password....");
	}

	@Given("this first step")
	public void this_first_step() {
	   System.out.println("this is first step");
	   
	   int count = 2;
		
		if(count==2) {
			Assert.fail();
		}
	}
	@When("this second step")
	public void this_second_step() {
		 System.out.println("this is second step");
	}
	@When("this is third step")
	public void this_is_third_step() {
		 System.out.println("this is third step");
	}
	@Then("this fourth step")
	public void this_fourth_step() {
		 System.out.println("this is fourth step");
	}

	@Given("fail test {int}")
	public void fail_test(Integer int1) {
		System.out.println("fail test step 1");
	}
	@When("user enters username and password fail test1")
	public void user_enters_username_and_password_fail_test1() {
		System.out.println("fail test step 2");
	}
	@When("clicks on failtest login")
	public void clicks_on_failtest_login() {
		System.out.println("fail test step 3");
	}
	@Then("user should be displayed fail message")
	public void user_should_be_displayed_fail_message() {
		System.out.println("fail test step 4");
		
		int count = 2;
		
		if(count==2) {
			Assert.fail();
		}
	}






}
