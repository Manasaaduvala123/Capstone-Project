Feature: Add a product to Wish List
Scenario Outline: Add products to the Wish List after login
Given I am logged in to TutorialsNinja
When I navigate to the "<category>" category
And I add the "<product>" product to the Wish List
Then I should see a success message "Success: You have added <product> to your wish list!"
And the product "<product>" should be listed in my Wish List
Examples:
    | category        | product              |
    | Phones & PDAs   | iPhone               |
    | Cameras         | Canon EOS 5D         |
    | Laptops & Notebooks | MacBook Pro      |

