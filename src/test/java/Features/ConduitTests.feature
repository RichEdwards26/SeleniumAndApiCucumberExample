Feature: Refreshing my Java Cucumber with selenium and api

  @Gui
  Scenario: Create a new user
    Given I am on the signup page
    When I complete the signup form with unique details and press submit
    Then a new account is logged in


