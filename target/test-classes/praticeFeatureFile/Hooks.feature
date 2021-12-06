Feature: testing hook feature

Scenario: Checking the hook functionality

Given user is on the registration page
When user enters firstname, email and password
And use clicks on register link
Then user should be succesfull registered


Scenario: Checking the hooks functionality with second scenario

Given user is on login page
When user enters the username and password
And user clicks on login button scenario
Then user is navigated to home page