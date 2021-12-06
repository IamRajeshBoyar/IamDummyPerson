@taggedHooks
Feature: this is the login feature for orange hrm

Description: the purpose  of this description is

Background: user is logined in
 Given user enters the username before scenario
 Given user enters the password before scenario

@first
Scenario: first scenario
Given this first step
When this second step
And this is third step
Then this fourth step

@second
Scenario: second scenario
Given this first step
When this second step
And this is third step
Then this fourth step

@third
Scenario: third scenario
Given this first step
When this second step
And this is third step
Then this fourth step

@fourth
Scenario: scenario 4
Given fail test 1
When user enters username and password fail test1
And clicks on failtest login
Then user should be displayed fail message