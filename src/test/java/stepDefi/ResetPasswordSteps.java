package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class ResetPasswordSteps {
    @When("user click on Forgot password?")
    public void clickForgotPassword()  {

Hooks.resetPassword.ForgetPasswordLink().click();

    }

    @And("User Enter Email")
    public void EnterMail()  {

Hooks.resetPassword.email().sendKeys("Test@yahoo.com");

    }

    @And("User click on recover button")
    public void clickRecoverButton() throws InterruptedException {

  Hooks.resetPassword.RecoveryButton().click();
  Thread.sleep(6000);

    }

    @Then("Confirm Email message")
    public void confirmMailMessage() throws InterruptedException {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.resetPassword.SendMailMsg().isDisplayed());
        soft.assertAll();
        System.out.println(Hooks.resetPassword.SendMailMsg().getText());

    }

}
