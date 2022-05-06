package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class LoginSteps {
//    @Given("User navigates to home page")
//    public void user_Navigates_home() {
//
//        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
//
//    }


    @And("User click to log in page")
    public void user_Navigate_Login()  {
//        Hooks.driver.findElement(By.className("ico-login")).click();
                Hooks.login.loginLink().click();
    }


    @When("User enter valid credentials")
    public void valid_Data() {



        Hooks.login.email().sendKeys("Test@yahoo.com");
        Hooks.login.password().sendKeys("Password@1234");




    }

    @And("user click on login button")
    public void loginButton() throws InterruptedException {
//        Hooks.driver.findElement(By.cssSelector(" div[class=\"buttons\"]>button[type=\"submit\"]")).click();
        Hooks.login.loginButton().click();
        Thread.sleep(3000);

    }
//    @Then("Success message is appear")
//    public void successMessage(){
//
//        SoftAssert soft = new SoftAssert();
//        soft.assertEquals("Your registration completed",Hooks.register.message());
//        soft.assertAll();
//    }
}
