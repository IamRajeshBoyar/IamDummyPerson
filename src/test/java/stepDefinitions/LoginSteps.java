package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.BookHotelPage1;
import pageObjectModel.LoginPage1;
import pageObjectModel.SearchHotelPage1;
import pageObjectModel.SelectHotelPage1;
import pageObjectModel.SeleniumBase1;

public class LoginSteps extends SeleniumBase1{
	
	public static WebDriver driver = TestRunner.driver;
	
	LoginPage1 loginObject = new LoginPage1(driver);

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		getUrl("https://adactinhotelapp.com/");
	   System.out.println("launched browser");
	}
	@When("user enters the correct username and password")
	public void user_enters_the_correct_username_and_password() {
		inputValues(loginObject.getUsername(), "QARajesh");
		inputValues(loginObject.getPassword(), "Speeds@123");
		  System.out.println("entered user name and password");
	}
	@And("clicks on the login button")
	public void clicks_on_the_login_button() {
		click(loginObject.getLoginButton());
		 System.out.println("clicked on login button");
	}
	@Then("user should be navigated to search hotel page")
	public void user_should_be_navigated_to_search_hotel_page() {
	  System.out.println("displaying hotel page");
	}
	
	SearchHotelPage1 searchObject = new SearchHotelPage1(driver);
	
	@Given("user user is succesfully logined")
	public void user_user_is_succesfully_logined() {
	    System.out.println("user is succesfully logined in");
	}
	@When("user selects location of the hotel")
	public void user_selects_location_of_the_hotel() {
	  dropDown(searchObject.getLocation(), "Brisbane");
	}
	@When("user select hotel")
	public void user_select_hotel() {
	   dropDown(searchObject.getHotel(), "Hotel Hervey");
	}
	@When("user selects room type and number of rooms")
	public void user_selects_room_type_and_number_of_rooms() {
	    dropDown(searchObject.getRoomType(), "Deluxe");
	    dropDown(searchObject.getNUmberOfRooms(), "5 - Five");
	}
	@When("user selects checkIn date and checkOut date")
	public void user_selects_check_in_date_and_check_out_date() {
	    inputValues(searchObject.getCheckIn(), "22/11/2021");
	    inputValues(searchObject.getCheckOut(), "23/11/2021");
	}
	@When("user selects adults per room and children per room")
	public void user_selects_adults_per_room_and_children_per_room() {
	   dropDown(searchObject.getAdultRoom(), "3 - Three");
	   dropDown(searchObject.getChildRoom(), "3 - Three");
	}
	@When("user clicks on search button")
	public void user_clicks_on_search_button() {
	   click(searchObject.getSubmitButton());
	}
	@Then("user should be navigated to select hotel page")
	public void user_should_be_navigated_to_select_hotel_page() {
	   System.out.println("user navigated to hotel page");
	}

	SelectHotelPage1 selectObject = new SelectHotelPage1(driver);

	@Given("user is on hotel page")
	public void user_is_on_hotel_page() {
	  System.out.println("the user is on hotel page");
	}
	@When("user clicks on select radio button")
	public void user_clicks_on_select_radio_button() {
		click(selectObject.getRadioButton());
	}
	@When("user clicks on contiue button")
	public void user_clicks_on_contiue_button() {
	  click(selectObject.getContinueButton());
	}
	@Then("user should be navigated to book hotel page")
	public void user_should_be_navigated_to_book_hotel_page() {
	   System.out.println("the user is navigated to hotel page");
	}

	BookHotelPage1 bookObject = new BookHotelPage1(driver);

	@Given("user is on the book hotel page")
	public void user_is_on_the_book_hotel_page() {
	    System.out.println("the user is on the book hotel page");
	}
	@When("user enters the firstname, lastname, billing address")
	public void user_enters_the_firstname_lastname_billing_address() {
	   inputValues(bookObject.getFirstname(), "demo Firstname");
	   inputValues(bookObject.getLastname(), "demo lastname");
	   inputValues(bookObject.getAddress(), "demo house no and demo street");
	}
	@When("enters credit card number, type, expiry date, cv number and clicks on book now")
	public void enters_credit_card_number_type_expiry_date_cv_number_and_clicks_on_book_now() {
	   inputValues(bookObject.getCreditCardNumber(), "1234567891234567");
	   dropDown(bookObject.getCreditCardType(), "VISA");
	   dropDown(bookObject.getExpiryDate(), "March");
	   dropDown(bookObject.getExpiryYear(), "2022");
	   inputValues(bookObject.getCvNumber(), "123");
	   click(bookObject.getBookNowButton());
	}
	@Then("user should be able to book hotl sucessfully")
	public void user_should_be_able_to_book_hotl_sucessfully() {
	   System.out.println("user successfully booked a hotel");
	}
	
	//format = {"pretty", "html:target/Destination"} ) 

}
