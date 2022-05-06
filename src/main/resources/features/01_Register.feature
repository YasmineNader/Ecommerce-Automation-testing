@regression
Feature: User could register with valid data

  Scenario: User sign up with valid data
#    Given User open browser
#    Given User navigates to home page
    And User click to register page
    When  User enter valid data
    And user click on register button
    Then Success message is appear
#    And user close browser