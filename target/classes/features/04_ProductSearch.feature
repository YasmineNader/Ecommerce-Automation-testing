@regression
Feature: Logged User could search for any product

  Background: User logged with valid credentials
    And User click to log in page
    When  User enter valid credentials
    And user click on login button
    And User login
  Scenario: User Search for any Product


    When User enter product name
    Then User click on Change search button

