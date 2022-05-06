package stepDefi;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class CurrencySteps {



    @When("User click on  Currencies dropDown menu")
    public void dropDownMenuClick()  {

        Hooks.CurrencyPage.CurrencyDropMenu().click();

    }




    @Then("User Choose Euro Currency")
    public void clickOnCurrencyEuro() throws InterruptedException {
        Hooks.CurrencyPage.CurrencyEuro();
        Thread.sleep(5000);
    }

    @Then("User Choose Dollar Currency")
    public void clickOnCurrencyDollar() throws InterruptedException {
        Hooks.CurrencyPage.CurrencyDollar();
        Thread.sleep(5000);
    }
}
