Feature: checking the login funtionality using data

Scenario: checking login daetails using username and pasword from datatable

Given user is on the login page of Demo.hrm
When user enters the below username and password
|Admin|admin123|
And user clicks on login button of hrm
Then user should be navigated to home page of hrm