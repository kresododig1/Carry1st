Feature: Carry1st search functionality

  @wip
  Scenario: User should be abel search for items from search box in main page
    Given user is on home page of Carry1st web application
    When user enters "playstation gift card" in search box
    And user clicks on "PlayStation Gift Cards" in search suggestions
    Then user should see options for vouchers with different prices
      | PlayStation US $10  |
      | PlayStation US $25  |
      | PlayStation US $50  |
      | PlayStation US $100 |