Feature: testing the login functionality of adctin hotel

Scenario: checking the login using correct credential

Given user is on the login page
When user enters the correct username and password
And clicks on the login button
Then user should be navigated to search hotel page

Scenario: search hotels
Given user user is succesfully logined
When user selects location of the hotel
And user select hotel
And user selects room type and number of rooms
And user selects checkIn date and checkOut date
And user selects adults per room and children per room
And user clicks on search button
Then user should be navigated to select hotel page


Scenario: select hotel
Given user is on hotel page
When user clicks on select radio button
And user clicks on contiue button
Then user should be navigated to book hotel page

Scenario: book a hotel
Given user is on the book hotel page
When user enters the firstname, lastname, billing address
And enters credit card number, type, expiry date, cv number and clicks on book now
Then user should be able to book hotl sucessfully