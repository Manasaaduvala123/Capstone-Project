Feature: Verify footer section As a user
I want to view the footer section
So that I can access important links
Scenario: Verify footer links are displayed
Given I am on the home page
When I scroll down to the footer
Then I should see the following footer links:
      | About Us          |
      | Contact Us        |
      | Privacy Policy    |
      | Terms & Conditions|
      | Site Map          |