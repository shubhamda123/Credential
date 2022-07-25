Feature: Sign in  functionality for DBsite

@signup
Scenario: Sign in Details
Given User navigate to DB sign in site
When User have to click on sign up button
And User have to enter valid username "Shubham123@gmail.com"
And User have to enter valid password "Shubham@123"
And User have to click on sign up button for registered
And User have to accept popup1
Then sign in successfully
Then close sign up

@login
Scenario: login in demoblaze
Given User have to click on login button
When User have to enter valid user "Shubham123@gmail.com"
And User have to enter valid pass "Shubham@123"
And User have to click on login 
Then login successfully

@addtoCart
Scenario: addto cart functionality
Given User have to click on item
When User have to click on addtocart
And User have to click on accept alert
And User have to click on cart
And User have to click on placeorder
And User have to enter Name "Shubham"
And User have to enter Country "India"
And User have to enter City "Wardha"
And User have to enter Credit card "123456789"
And User have to enter Month "07"
And User have to enter Year "2022"
Then User have to click on purchase
