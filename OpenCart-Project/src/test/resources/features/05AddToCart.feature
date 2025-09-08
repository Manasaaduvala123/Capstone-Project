Feature: Add to Cart Functionality
Scenario Outline: Add products to the cart
Given I am on the TutorialsNinja homepage
When I choose the featured product "<product>"
And I click on "Add to Cart"
Then my shopping cart count should be incremented by 1
And the cart total should reflect the "<product>" price
Examples:
    | product        |
    | iPhone         |
    | Canon EOS 5D   |



