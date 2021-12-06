@college
Feature: example of medical and engineer college

Background: prequiste for students
Given student completed 10th standard
Given student completed 12th standard


@medical
Scenario: medical college
Given student finds the best medical college
When student enrolls himself in the medical college
Then student should be selected to medical college

@engineer
Scenario: Enginering college
Given student finds the best engineering college
When student enrolls himself in the engineering college
Then student should be selected to engineering college