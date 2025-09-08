Feature: Product Search Functionality
Scenario Outline: Search for products from the search bar
Given User is on the TutorialNinja homepage
When User searches for "<productName>"
Then User should see the search results for "<productName>"
And wait for 2 seconds
Examples:
    | productName       |
    | Canon EOS 5D      |
    | Apple Cinema 30   |
    


