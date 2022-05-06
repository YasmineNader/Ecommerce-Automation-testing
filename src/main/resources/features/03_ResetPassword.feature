@regression
Feature: User could reset his/her password successfully
Scenario:User Reset password

And   User click to log in page
When  user click on Forgot password?
And   User Enter Email
And   User click on recover button
Then  Confirm Email message
