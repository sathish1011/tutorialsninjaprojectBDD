package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	@Given("user opens the application")
	public void user_opens_the_application() {
	   System.out.println(">> user opened the application");
	}

	@When("user enters the valid product into search field")
	public void user_enters_the_valid_product_into_search_field() {
		System.out.println(">> user entered valid product code");
	}

	@When("user clicked on search button")
	public void user_clicked_on_search_button() {
		System.out.println(">> user clicked on search button");
	}

	@Then("valid product to be diaplayed in the search results")
	public void valid_product_to_be_diaplayed_in_the_search_results() {
		System.out.println(">> Valid product code has been displayed");
	}

	@When("user enters the Non-existing product into search field")
	public void user_enters_the_non_existing_product_into_search_field() {
		System.out.println(">> user entered a non existing product code and warning message is displayed");
	}

	@Then("proper text to be displayed informing the user that their is no product matching")
	public void proper_text_to_be_displayed_informing_the_user_that_their_is_no_product_matching() {
		System.out.println(">> proper texts has been displayed");
	}

	@When("user did not enter any product into search field")
	public void user_did_not_enter_any_product_into_search_field() {
		System.out.println(">> user did not search with any of the fields");
	}

	@Then("proper text to be displayed informing the user about no product matching to be displayed,")
	public void proper_text_to_be_displayed_informing_the_user_about_no_product_matching_to_be_displayed() {
		System.out.println(">>Message being displayed no products match");
	}
}
