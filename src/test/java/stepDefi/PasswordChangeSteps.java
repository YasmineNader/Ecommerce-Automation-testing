package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class PasswordChangeSteps {


    @Given("User login")
    public void loginUser(){
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.CurrencyPage.userAccount().isDisplayed());
        soft.assertAll();
    }

    @And("User Click on My account button")
    public void user_Navigate_UserAccount()  {

//        SoftAssert soft = new SoftAssert();
////        soft.assertTrue(Hooks.driver.findElement(By.className("ico-account")).isDisplayed());
//        soft.assertTrue(Hooks.changePassword.userAccount().isDisplayed());
//        soft.assertAll();
//        Hooks.driver.findElement(By.className("ico-account")).click();
         Hooks.changePassword.userAccount().click();
    }


    @And("User Click on Change Password Link")
    public void user_Navigate_ChangePassword()  {

//        Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/changepassword\"]")).click();
          Hooks.changePassword.changePasswordLink().click();


    }

    @When("User Enter New Password")
    public void newPassword()  {
//     Hooks.driver.findElement(By.id("OldPassword")).sendKeys("Password@12346");
//     Hooks.driver.findElement(By.id("NewPassword")).sendKeys("Password@2222");
//     Hooks.driver.findElement(By.id("ConfirmNewPassword")).sendKeys("Password@2222");
        Hooks.changePassword.oldPassword().sendKeys("Password@12346");
        Hooks.changePassword.NewPassword().sendKeys("Password@2222");
        Hooks.changePassword.confirmNewPassword().sendKeys("Password@2222");


    }
    @Then("User click on Change Password button")
    public void clickChangePasswordButton(){
//    Hooks.driver.findElement(By.className("change-password-button")).click();
      Hooks.changePassword.changePasswordButton().click();

    }
    @And("Confirm message")
    public void confirmMessage()  {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.changePassword.changePasswordMessage().isDisplayed());
        soft.assertAll();
        System.out.println("Email with instructions has been sent to you.");


    }

}
