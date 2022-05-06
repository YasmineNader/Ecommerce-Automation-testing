@regression
Feature: Logged user could add different products to compare list


  Scenario: User add products to compare list
    And   User click to log in page
    When  User enter valid credentials
    And   user click on login button
    And   User login
    When User Click on Electronics Category
    Then click on cell phones Sub category
    And  add to compare list
    And  User Click on cool tag
    And  add to compare list
    And  User Click on book tag
    And  add to compare list
    And  click on compare list Button

