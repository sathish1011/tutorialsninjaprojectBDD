Feature: Forgot password
when user forgot the password he should be able to Rest it

Scenario: Reset password on forgetting
	Given user opens the application
When user clicks on my account
And Selects login option
And clicks on forgotten password option
And enters valid email address
And click on continue button
Then proper confirmation message should be displayed

