package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Registration {
	@Given("User navigates to the Registration Account page")
	public void user_navigates_to_the_registration_account_page() {
	    System.out.println(">>user got naviagted to register account page");
	}

	@When("Enters the FirstName {string} in FirstName Field")
	public void enters_the_first_name_in_first_name_field(String firstName) {
		System.out.println(">>user enters the first name "+firstName +" field");
	}

	@When("Enters the LastName {string} in LastName Field")
	public void enters_the_last_name_in_last_name_field(String lastName) {
		System.out.println(">>user enters the last name "+lastName+"field");
	}

	@When("Enters the emailAddress {string} in email Field")
	public void enters_the_email_address_in_email_field(String email) {
		System.out.println(">>user enters the email name "+email+" field");
	}

	@When("Enters the Telephone {string} in Telephone Field")
	public void enters_the_telephone_in_Telephone_field(String Telephone) {
		System.out.println(">>user enters the Telephone "+Telephone+" field");
	}

	@When("Enters the Password {string} in password Field")
	public void enters_the_password_in_password_field(String password) {
		System.out.println(">>user enters the password "+password+" field");
	}

	@When("Enters the confirm password {string} in confirm password field Field")
	public void enters_the_confirm_password_in_confirm_password_field_field(String confirmPassword) {
		System.out.println(">>user enters the confirm password "+confirmPassword+" field");
	}

	@When("selects privacy policy field")
	public void selects_privacy_policy_field() {
		System.out.println(">>user privacy policy field");
	}

	@When("click on continue button")
	public void click_on_continue_button() {
		System.out.println(">>user clicks on continue button");
	}

	@Then("Account should be Succesfully registered")
	public void account_should_be_succesfully_registered() {
		System.out.println(">>Account successfully created");
	}

	@When("selects YES for Newsletter radio button")
	public void selects_yes_for_newsletter_radio_button() {
		System.out.println(">>selects yes for news letter");
	}

	@When("user dont enters details to any of the fields")
	public void user_dont_enters_details_to_any_f_the_fields() {
		System.out.println(">>user did not enter Any field");
	}

	@Then("Warning messages to be displayed in all mandatory fields")
	public void warning_messages_to_be_displayed_in_all_mandatory_fields() {
		System.out.println(">>Warnig message displayed in all mandatory field");
	}

	@Then("Warning message to be shown user about duplicate email address")
	public void warning_message_to_be_shown_user_about_duplicate_email_address() {
		System.out.println(">>warning mesage shown for duplicate email");
	}
	
	
}
