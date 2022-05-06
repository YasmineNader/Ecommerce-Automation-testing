@regression
Feature: Logged user could select different Categories

  Background: User logged with valid credentials
    And User click to log in page
    When  User enter valid credentials
    And user click on login button
    And User login
  Scenario: User select from different Categories


    When User Click on Category
    And  User hover on sub category
    Then click on Sub category