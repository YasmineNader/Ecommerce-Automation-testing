@regression
Feature: User could log in with valid email and password

  Scenario: User login with valid data
#
#    Given User navigates to home page
    And User click to log in page
    When  User enter valid credentials
    And user click on login button
#    Then User go to home page
