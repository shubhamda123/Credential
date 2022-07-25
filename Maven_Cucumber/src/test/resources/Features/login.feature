Feature: Login functionality for mercury tours

@abc
Scenario: Login Functionality
Given User navigate to MTsite
When user login by using username "QQQQ"
And Pass by given password field "qqqq"
And Click on submit button
Then Login success

@abc1
Scenario: Flight search
Given After login succes
When click on flight hyperlink
Then close the browser

