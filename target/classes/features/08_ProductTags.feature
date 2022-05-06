@regression
Feature: Logged user could select different tags



  Scenario: User select from different tags

    And User click to log in page
    When  User enter valid credentials
    And user click on login button
    And User login
    When user go to TagsURL
    Then User Click on jewelry tag
    And  User Click on cool tag
    And User Click on awesome tag
    And User Click on book tag