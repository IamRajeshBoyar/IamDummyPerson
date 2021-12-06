Feature: checking the login functionality with multiple user account

Scenario Outline: checking the login functionality OrangeHRM

Given user is on the login page of OrangeHrm
When user enters "<username>" and "<password>"
And clicks on the LoginButton of OrangeHrm
Then user should be navigated to home page of DemoOrangeHrm

Examples:
|username|password|
|Admin|admin123|
|Admin|admin234|
