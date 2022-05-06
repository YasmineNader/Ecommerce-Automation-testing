@regression
Feature: Logged user could filter with color

  Background: User logged with valid credentials
    And User click to log in page
    When  User enter valid credentials
    And user click on login button
    And User login
  Scenario: User filter product with color

    When User click on apparel tab
    And User Choose shoes tab
    Then user click on favourite color


