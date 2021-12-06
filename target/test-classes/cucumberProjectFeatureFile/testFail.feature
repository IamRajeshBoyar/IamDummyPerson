Feature: test to re-run cucumber fail test cases

Scenario: eneter text in search term

Given user is on the "https://www.target.com/"

When user eneter search term "computer"

And clicks on submit button 

Then user is url should be "https://www.target.com/s?searchTerm=computer"