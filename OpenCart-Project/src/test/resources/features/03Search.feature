Feature: Product Search Functionality
Scenario: Search multiple products from search bar
Given User is on the TutorialNinja homepage
When User searches for "Canon EOS 5D"
Then User should see the search results for "Canon EOS 5D"
And wait for 2 seconds
When User searches for "Apple Cinema 30"
Then User should see the search results for "Apple Cinema 30"
And wait for 2 seconds
