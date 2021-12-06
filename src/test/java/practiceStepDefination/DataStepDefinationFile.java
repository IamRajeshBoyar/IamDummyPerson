package practiceStepDefination;

import java.util.List;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStepDefinationFile {


	@Given("user is on the home page")
	public void user_is_on_the_home_page() {
	  
	}
	@When("user enters the valid data")
	public void user_enters_the_valid_data(io.cucumber.datatable.DataTable dataTable) {
	List<String> datarow = dataTable.asList(String.class);
	for(String d: datarow) {
		System.out.println(d);
	}
	
	}
	@Then("user registeration should be scessful")
	public void user_registeration_should_be_scessful() {
	  
	}



}
