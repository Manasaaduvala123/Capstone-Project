Feature: User Registration on TutorialsNinja
Scenario: Successful Registration with valid details
Given I am on the Registration page
When I enter "Manasa" in the Registration First Name fieldSS
And I enter "Aduvala" in the Registration Last Name field
And I enter "manasaaduvala123@gmail.com" in the Registration Email field
And I enter "9876543210" in the Registration Telephone field
And I enter "@Admin123" in the Registration Password field
And I enter "@Admin123" in the Registration Confirm Password field
And I select "Yes" for Registration Newsletter subscription
And I check the Registration Privacy Policy checkbox
And I click on the Registration Continue button
Then I should see the Registration success message "Your Account Has Been Created!"
