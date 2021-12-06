Feature: this is practice cucumber

Scenario Outline: checking the valid functionality

Given users is on the home page of HRMDemoPage
When user eneters the "<username>" and "<password>"
And clicks on the login button
Then user should be navigated to homepage


Examples:
|username|password|
|rohini|rajendran|
|rajesh|boyar|

