# @Feature
Feature: Test flipkart with valid credentials

  # @Scenario
  Scenario: Test login with valid credentials
  
    Given Open firefox and start application
    
    When I click on login button
    When I enter valid username and valid password
    Then user should be able to login successfully
    
    When I click on login button
    When I enter valid username and invalid password
    Then user should be able to login successfully
    
    When I click on login button
    When I enter invalid username and valid password
    Then user should be able to login successfully
    
    When I click on login button
    When I enter nill username and nill password
    Then user should be able to login successfully
    
    
    
    
   When I click on Sell on Flipkart
   Then Check whether it navigates to seller.flipkart page
   Then user is succesfully navigated to the sell on flipkart page

    
    When I click on Advertise
    Then Check whether it navigates to ads.flipkart page
    Then user is succesfully navigated to the advertise page
    
    When I click on Gift Card
    Then Check whether it navigates to Gift Card page
    Then user is succesfully navigated to the gift card  page
    
    When I click on Download App
    Then Check whether it navigates to Download App page
    Then user is succesfully navigated to the Download App  page
    
    When I click on 24x7 Customer Care
    Then Check whether it navigates to 24x7 Customer Care page
    Then user is succesfully navigated to the 24x7 Customer Care  page
    
    When I click on Track Order
    Then Check whether it navigates to Track Order page
    Then user is succesfully navigated to the Track Order  page
    
    When I click on Account
    Then Check whether it navigates to Account page
    Then user is succesfully navigated to the Account  page
    
    When I click on Wallet
    Then Check whether it navigates to Wallet page
    Then user is succesfully navigated to the Wallet  page
    
    When I click on My Rewards
    Then Check whether it navigates to My Rewards page
    Then user is succesfully navigated to the My Rewards  page
    
    When I click on Wishlist
    Then Check whether it navigates to Wishlist page
    Then user is succesfully navigated to the Wishlist  page
    
    When I click on Reviews & Ratings
    Then Check whether it navigates to Reviews & Ratings page
    Then user is succesfully navigated to the Reviews & Ratings  page
    
    When I click on Email Preferences
    Then Check whether it navigates to Email Preferences page
    Then user is succesfully navigated to the Email Preferences  page
    
     When I click on Flipkart First
    Then Check whether it navigates to Flipkart First page
    Then user is succesfully navigated to the Flipkart First  page
    
    