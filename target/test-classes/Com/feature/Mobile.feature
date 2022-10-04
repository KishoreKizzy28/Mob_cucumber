Feature: To Buy Mobile in Mobile app

Scenario: Home Page
Given user Launch the Application
When user Click on the Mobile button
Then it Navigate to Mobile Page


Scenario: Mobile Page
When user Click on add to cart button
Then it Navigates to Shopping cart page

Scenario: Shopping Cart Page
When user Enter the quantity in cart
And user Enter the coupon code
And user Click the update
And user Select the country 
And user Select the states
And user Enter the zip 
Then user Click the proceed to Check out And it Navigates to CheckOut page

Scenario: CheckOut Page
When user Click the continue button
Then it Navigate to Information Page

Scenario: Information Page
When user Enter the First Name
And user Enter the Last Name
And user Enter the Email Address
And user Enter the Address
And user Enter the City
And user Select the State
And user Enter the Zip
And user Select the country1
And user Enter the Mobile number
Then user Click on continue1 button And it Navigates to Shipping page



Scenario: Shipping Page
When user Click the continue2 button
Then it Navigates to Payment Page


Scenario: Payment Page
When user Select the Credit card saved button
And user Enter the Name on Card
And user Select the Card Type
And  user Enter the Credit Card Number
And user Select the Month And user Select the date
And user Enter cvv numver
And user Click the Check button
Then user Click the continue3 button And it Navigate to Order Review Page

Scenario: Order Review Page
When user Click the Place Order button
Then it Navigates to Success Page

Scenario: RestAssured

Given user Enter the uri
When user Get the response code
And user Get the response status Line
And user Get the response Aspretty
Then user Validate the response Code


