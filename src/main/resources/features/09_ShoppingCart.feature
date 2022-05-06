@regression
Feature:  Logged user could add different products to Shopping cart


  Scenario: User add products to Shopping cart

    And User click to log in page
    When  User enter valid credentials
    And user click on login button
    And User login
    When User Click on Electronics Category
    Then click on cell phones Sub category
    And  add to shopping cart
    And  User Click on awesome tag
    And  add to shopping cart
    And  User Click on cool tag
    And  add to shopping cart
    And  User Click on book tag
    And  add to shopping cart
    And  click on shopping cart Button

