Feature: Add a product to Wish List
Scenario: Add iPhone to the Wish List after login
Given I am logged in to TutorialsNinja
When I navigate to the "Phones & PDAs" category
And I add the "iPhone" product to the Wish List
Then I should see a success message "Success: You have added iPhone to your wish list!"
And the product "iPhone" should be listed in my Wish List
