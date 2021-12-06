package cucumberStepDefinationFile;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CollegeExample {
	

	@Given("student finds the best medical college")
	public void student_finds_the_best_medical_college() {
	    System.out.println("student finds best medical college");
	}
	@When("student enrolls himself in the medical college")
	public void student_enrolls_himself_in_the_medical_college() {
		System.out.println("student enrolls himself in medical college");
	}
	@Then("student should be selected to medical college")
	public void student_should_be_selected_to_medical_college() {
		System.out.println("student gets selected to medical college");
	}


	@Given("student finds the best engineering college")
	public void student_finds_the_best_engineering_college() {
		 System.out.println("student finds best engineering college");
	}
	@When("student enrolls himself in the engineering college")
	public void student_enrolls_himself_in_the_engineering_college() {
		System.out.println("student enrolls himself in engineering college");
	}
	@Then("student should be selected to engineering college")
	public void student_should_be_selected_to_engineering_college() {
		System.out.println("student gets selected to engineering college");
	}

	@Given("student completed 10th standard")
	public void student_completed_10th_standard() {
	  System.out.println("student completed 10th standard");
	}
	@Given("student completed 12th standard")
	public void student_completed_12th_standard() {
	   System.out.println("student comppleted 12th standard");
	}





}
