Feature: User Registration
Scenario Outline: Successful Registration with valid details
Given I am on the Registration page
When I enter "<firstName>" in the Registration First Name field
And I enter "<lastName>" in the Registration Last Name field
And I enter "<email>" in the Registration Email field
And I enter "<telephone>" in the Registration Telephone field
And I enter "<password>" in the Registration Password field
And I enter "<confirmPassword>" in the Registration Confirm Password field
And I select "<newsletter>" for Registration Newsletter subscription
And I check the Registration Privacy Policy checkbox
And I click on the Registration Continue button
Then I should see the Registration success message "Your Account Has Been Created!"
Examples:
    | firstName | lastName | email                  | telephone    | password | confirmPassword | newsletter |
    | Manasa    | Aduvala  | manasa2002@example.com | 07981896421 | newpass  | newpass         | Yes        |
    | Ravi      | Kumar    | ravi.kumar@example.com | 9876543210  | test123  | test123         | No         |

