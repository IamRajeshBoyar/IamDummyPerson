Feature: checking the login feature of orange.hrm using header
Scenario: checking the user long using headers

Given user is on the login page of demo.hrm login page
When user enters the below credential with header
|username|password|
|Admin|admin123|
And clicks on the login button of demo.hrm login page
Then user should be navigated to demo.hrm home page