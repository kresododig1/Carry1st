@smoke @regression
Feature: Carry1st search functionality

  @wip
  Scenario: User should be abel search for items from search box in main page
    Given user is on home page of Carry1st web application
    When user enters "playstation gift card" in search box
    And user clicks on "PlayStation Gift Cards" in search suggestions
    Then user should see options for vouchers with different prices
      | PSN Card 10 USD US  |
      | PSN Card 25 USD US |
      | PSN Card 50 USD US |
      | PSN Card 100 USD US |
      | PSN Card 75 USD US |