Feature: User Registration
  New users need to register in order to login into the account

Background: Given User navigates to the Registration Account page

  Scenario: User Registration with mandatory fields
    When Enters the FirstName "Sachin" in FirstName Field
    And Enters the LastName "Tendulkar" in LastName Field
    And Enters the emailAddress "Sachin.Tendulkar@gmail.com" in email Field
    And Enters the Telephone "9964109013" in Telephone Field
    And Enters the Password "cricket" in password Field
    And Enters the confirm password "cricket" in confirm password field Field
		And selects privacy policy field
		And click on continue button
		Then Account should be Succesfully registered 
		
	Scenario: User Registration with mandatory fields
    When Enters the FirstName "Sachin" in FirstName Field
    And Enters the LastName "Tendulkar" in LastName Field
    And Enters the emailAddress "Sachin.Tendulkar@gmail.com" in email Field
    And Enters the Telephone "9964109013" in Telephone Field
    And Enters the Password "cricket" in password Field
    And Enters the confirm password "cricket" in confirm password field Field
		And selects YES for Newsletter radio button
		And selects privacy policy field
		And click on continue button
		Then Account should be Succesfully registered 
		
Scenario: User Registration with mandatory fields
    Given User navigates to the Registration Account page
    When user dont enters details to any of the fields
    And click on continue button
    Then Warning messages to be displayed in all mandatory fields
    
 Scenario:  Register with duplicate email address
    When Enters the FirstName "virat" in FirstName Field
    And Enters the LastName "kohli" in LastName Field
    And Enters the emailAddress "Sachin.Tendulkar@gmail.com" in email Field
    And Enters the Telephone "9964109013" in Telephone Field
    And Enters the Password "cricket" in password Field
    And Enters the confirm password "cricket" in confirm password field Field
		And selects YES for Newsletter radio button
		And selects privacy policy field
		And click on continue button
		Then Warning message to be shown user about duplicate email address
		


 