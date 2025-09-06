Feature: Change currency on TutorialNinja

  Scenario: User changes currency to Euro
    Given User is on TutorialNinja homepage
    When User changes currency to "Euro"
    Then Currency should be displayed as "€"

  Scenario: User changes currency to Dollar
    Given User is on TutorialNinja homepage
    When User changes currency to "Dollar"
    Then Currency should be displayed as "$"

  Scenario: User changes currency to Pound
    Given User is on TutorialNinja homepage
    When User changes currency to "Pound"
    Then Currency should be displayed as "£"
