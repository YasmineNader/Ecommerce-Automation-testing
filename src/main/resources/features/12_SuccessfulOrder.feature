@regression
Feature:  user Create successful Order



Scenario: Create successful Order with value


  And   User click to log in page
  When  User enter valid credentials
  And   user click on login button
  And   User login
  When  User Click on Electronics Category
  Then  click on cell phones Sub category
  And   add to shopping cart
  And   click on shopping cart Button
  And   User press checkOut
  And   User fill the form
  And   user click Continue billing
  And   User click continue shipping
  And   User click continue payment Method
  And   User click continue payment information
  And   User click confirm order
  Then  success Message for order
  And   Press End Continue