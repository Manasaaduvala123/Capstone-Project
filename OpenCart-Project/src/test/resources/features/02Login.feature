Feature: Login functionality
Scenario: Successful login with valid credentials
Given I am on the Login page
When I enter "manasaaduvala123@gmail.com" in the Email field
And I enter "newpass123" in the Login Password field
And I click on the Login button
Then I should be logged in successfully
