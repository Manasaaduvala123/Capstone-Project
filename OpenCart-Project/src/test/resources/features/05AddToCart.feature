Feature: Add to Cart Functionality
Scenario: Add iPhone to the cart
Given I am on the Tutorials Ninja homepage
When I choose the featured product "iPhone"
And I click on "Add to Cart"
Then my shopping cart count should be incremented by 1
And the cart total should reflect the product price
