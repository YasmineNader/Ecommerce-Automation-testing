package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class FilterColorSteps {


    @When("User click on apparel tab")
    public void clickApparelTab()  {

        Hooks.filter.apparelCategory().click();

    }




    @And("User Choose shoes tab")
    public void clickOnShoes() throws InterruptedException {
    Hooks.filter.ShoesCategory().click();
    Thread.sleep(2000);
    }

    @Then("user click on favourite color")
    public void ChooseFilterColor() throws InterruptedException {
        Hooks.filter.redColorFilter().click();
        Thread.sleep(2000);
    }
}
