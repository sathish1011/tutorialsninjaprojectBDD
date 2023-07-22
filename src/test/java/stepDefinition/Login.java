package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	@Given("User navigates to login page")
	public void user_navigates_to_login_page() {
		System.out.println(">> user got navigated to login page");
	}

	@When("User enters valid email address (.+)$")
	public void user_enters_valid_email_address(String email) {
		System.out.println(">> user enters valid email address "+email);
	}

	@When("enters valid password (.+)$")
	public void enters_valid_password(String password) {
		System.out.println(">> user enters valid password "+password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println(">> user clicked on login button");
	}

	@Then("User should login succesfully")
	public void user_should_login_succesfully() {
		System.out.println("user logged in succesfully");
	}

	@Then("User should get a proper warning message")
	public void user_should_get_a_proper_warning_message() {
		System.out.println(">> login failed with proper waring message");
	}

	@When("User dont enter any credentials")
	public void user_dont_enter_any_credentials() {
		System.out.println(">> login failed without any credenials");
	}

}
