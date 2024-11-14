Feature: Verify Search Functionality

  Scenario: Search for a player by name
    Given I am on the ESPN Cricinfo homepage
    When I search for "Virat Kohli"
    Then I should see search results related to "Virat Kohli"