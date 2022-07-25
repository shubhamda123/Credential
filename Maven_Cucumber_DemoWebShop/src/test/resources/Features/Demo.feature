Feature: All fuctionality in DemoWebShop site

@Register
Scenario: Register DemoWebshop site
Given User navigate to DemoWebShop
When User click on male gender radio button
And User enter firstname is "Shubham"
And User enter lastname is "Dandekar"
And User enter email is "shubham123@gmail.com"
And User enter password is "Shubham111"
And User enter confirm password is "Shubham111"
And click on register button
Then registered successfully

@Login
Scenario: Login DemoWebShop
Given User navigate to Demo webshop login page "http://demowebshop.tricentis.com/login"
When User enter the email "ShubhamD123@gmail.com"
And User enter password "Shubham@123"
And Click on login  button
Then Login successfully

@AddToCart
Scenario: Add to cart funtionality
Given User have to click on Apparel&Shoes
When User click on add to cart item
And User click on shopping cart option
Then user click on logout hyperlink