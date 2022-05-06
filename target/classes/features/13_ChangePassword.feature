#@regression
Feature: User could change his/her password successfully

  Background: User logged with valid credentials
    And User click to log in page
    When  User enter valid credentials
    And user click on login button
    And User login
    Scenario: User change password


    And User Click on My account button
    And User Click on Change Password Link
    When User Enter New Password
    Then User click on Change Password button
    And Confirm message
