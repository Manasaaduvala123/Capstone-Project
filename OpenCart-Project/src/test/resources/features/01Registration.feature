Feature: User Registration
Scenario: Successful Registration with valid details
Given I am on the Registration page
When I enter "Manasa" in the Registration First Name field
And I enter "Aduvala" in the Registration Last Name field
And I enter "manasaaduvala123@example.com" in the Registration Email field
And I enter "9818964267" in the Registration Telephone field
And I enter "newpass123" in the Registration Password field
And I enter "newpass123" in the Registration Confirm Password field
And I select "Yes" for Registration Newsletter subscription
And I check the Registration Privacy Policy checkbox
And I click on the Registration Continue button
Then I should see the Registration success message "Your Account Has Been Created!"
