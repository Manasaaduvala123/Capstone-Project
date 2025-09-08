Feature: Login functionality
Scenario Outline: Successful login with valid credentials
Given I am on the Login page
When I enter "<email>" in the Email field
And I enter "<password>" in the Login Password field
And I click on the Login button
Then I should be logged in successfully
Examples:
    | email                  | password |
    | manasa2002@gmail.com   | newpass  |
    | ravi.kumar@example.com | test123  |

