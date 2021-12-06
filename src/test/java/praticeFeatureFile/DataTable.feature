Feature: testing data table

Scenario: data table example

Given user is on the home page
When user enters the valid data
|fields|value|
|firstname|rajesh|
|lastname|boyar|
|state|goa|
|country|india|
Then user registeration should be scessful