package stepDefinitions;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Hook;

public class BackgroundStepsDef {


	@Given("the user is logged in")
	public void the_user_is_logged_in() {
	   System.out.println("the background step code");
	}
	@Given("goes to landing page")
	public void goes_to_landing_page() {
	   System.out.println("the background code part2 ");
	}
	@Given("when user is on the product page")
	public void when_user_is_on_the_product_page() {
	  System.out.println("the scenario 1 user is on the product page");
	}
	@When("user clicks on the lenvo laptop")
	public void user_clicks_on_the_lenvo_laptop() {
	  System.out.println("the user clicks on lenovo laptop scenario 1");
	}
	@When("user clicks on add laptop")
	public void user_clicks_on_add_laptop() {
	   System.out.println("scenario 1 user clicks on the laptop scenario");
	}
	@Then("laptop should be added to the cart")
	public void laptop_should_be_added_to_the_cart() {
	   System.out.println("laptop should be added to cart");
	}
	
	@When("user click on the cart button")
	public void user_click_on_the_cart_button() {
	  System.out.println("user clicks on the cart button scenario 2");
	}
	@When("user select the lenvo laptop and clicks on the remove from cart")
	public void user_select_the_lenvo_laptop_and_clicks_on_the_remove_from_cart() {
		System.out.println("the user selects the laptop scenario 2");
	}
	@Then("the product lenovo should be removed from cart")
	public void the_product_lenovo_should_be_removed_from_cart() {
	   System.out.println("the user removes laptop scenario 2");
	}
	
	@Before(order = 1)
	public void beforeHooks1() {
		System.out.println("before hooks 1");
	}
	@Before(order = 2)
	public void beforeHooks2() {
		System.out.println("before hooks 2");
	}
	@After(order = 1)
	public void afterHooks() {
		System.out.println("after hooks 1");
	}
	@After(order = 2)
	public void afterHooks2() {
		System.out.println("after hooks 2");
	}


}
