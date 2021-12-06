Feature: Checking the login functionality

Scenario: checking the login function using valid credential

Given user is on HrmDemo login page
When user enters correct username and password
And user clicks on login button
Then user should be navigated to home page