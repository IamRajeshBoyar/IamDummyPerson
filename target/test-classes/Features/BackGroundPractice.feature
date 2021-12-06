Feature: testing background in cucumber

Background:
    Given the user is logged in
    And goes to landing page

Scenario: Testing the add product
Given when user is on the product page
When user clicks on the lenvo laptop
And user clicks on add laptop
Then laptop should be added to the cart


Scenario: testing the remove items from cart
Given when user is on the product page
When user click on the cart button
And user select the lenvo laptop and clicks on the remove from cart
Then the product lenovo should be removed from cart