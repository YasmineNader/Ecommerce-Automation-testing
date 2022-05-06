package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.asserts.SoftAssert;

public class SuccessfulOrderSteps {
    @And("User press checkOut")
    public void pressCheckOutButton() throws InterruptedException {
        Hooks.successOrder.termsAgreeCheck().click();
        Thread.sleep(2000);
        Hooks.successOrder.checkOutButton().click();

        Thread.sleep(4000);
    }

    @And("User fill the form")
    public void fillTheForm() throws InterruptedException {
        Hooks.successOrder.country();
        Hooks.successOrder.city().sendKeys("cairo");
        Hooks.successOrder.address1().sendKeys("cairo,Egypt");
        Hooks.successOrder.zipCode().sendKeys("123456");
        Hooks.successOrder.PhoneNumber().sendKeys("01111111111");
        Thread.sleep(2000);


    }
    @And("user click Continue billing")
    public void clickContinueBillingButton() throws InterruptedException {

        Hooks.successOrder.continueButton().click();

    }

    @And("User click continue shipping")
    public void continueShipping() throws InterruptedException {

 Hooks.successOrder.continueShipping().click();
  }

    @And("User click continue payment Method")
    public void continuePaymentMethod() throws InterruptedException {

        Hooks.successOrder.continuePaymentMethod().click();
        Thread.sleep(2000);
    }

    @And("User click continue payment information")
    public void continuePaymentInformation() throws InterruptedException {
        Thread.sleep(2000);
        Hooks.successOrder.continuePaymentInformation().click();
    }

    @And("User click confirm order")
    public void confirmOrder() throws InterruptedException {

        Hooks.successOrder.orderConfirmation().click();
        Thread.sleep(2000);
    }

    @Then("success Message for order")
    public void successOrder() throws InterruptedException {

        SoftAssert soft = new SoftAssert();
        soft.assertTrue(Hooks.successOrder.confirmMessage().isDisplayed());
        soft.assertAll();
        System.out.println(Hooks.successOrder.confirmMessage().getText());
        Thread.sleep(3000);
    }

    @And("Press End Continue")
    public void endContinue() throws InterruptedException {
   Hooks.successOrder.continueMessage().click();
        Thread.sleep(2000);
    }





//    @And("choose New address")
//    public void chooseNewAddress()  {
//
//        Hooks.successOrder.newAddress();
//    }


}
