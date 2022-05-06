@regression
Feature: Logged User could switch between currencies US-Euro


  Scenario: User switch between Euro currencies
    And User click to log in page
    When  User enter valid credentials
    And user click on login button
    And User login
    When User click on  Currencies dropDown menu
    Then User Choose Euro Currency
    When User click on  Currencies dropDown menu
    Then User Choose Dollar Currency

