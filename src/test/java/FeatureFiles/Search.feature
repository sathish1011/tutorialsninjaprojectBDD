Feature: Search functionality
  user can search the product in the search bar

Background: Given user opens the application

  Scenario: Search for valid product
    When user enters the valid product into search field
    And user clicked on search button
    Then valid product to be diaplayed in the search results

  Scenario: Search for Non-existing product
    When user enters the Non-existing product into search field
    And user clicked on search button
    Then proper text to be displayed informing the user that their is no product matching

  Scenario: Search Without providing any product
    When user did not enter any product into search field
    And user clicked on search button
    Then proper text to be displayed informing the user about no product matching to be displayed,
