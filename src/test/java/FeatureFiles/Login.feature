Feature: User Login
Register user should be able to login in order to access the account details

Background: Given User navigates to login page

Scenario Outline: User login with valid credentials
When User enters valid email address <email>
And enters valid password <password>
And clicks on login button
Then User should login succesfully
Examples:
|email|password|
|sathishappu1019@gmail.com|123456789|
|sathishappu1020@gmail.com|123456710|
|sathishappu1021@gmail.com|123456711|


Scenario: User login with in-valid credentials
When User enters valid email address "sathishappu@gmail.com"
And enters valid password "123456"
And clicks on login button
Then User should get a proper warning message

Scenario: User login with valid email and invalid password 
When User enters valid email address "sathishappu1019@gmail.com"
And enters valid password "123456"
And clicks on login button
Then User should get a proper warning message 

Scenario: User login with in-valid email and valid password 
When User enters valid email address "sathishappu@gmail.com"
And enters valid password "123456789"
And clicks on login button
Then User should get a proper warning message

Scenario: User login with-out credentials
When User dont enter any credentials
And clicks on login button
Then User should get a proper warning message    