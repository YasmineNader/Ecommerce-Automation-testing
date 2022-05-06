package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class ProductTagsSteps {


    @When("user go to TagsURL")
    public void GoTagsURL()  {


        Hooks.tags.tagsURL();


    }

    @Then("User Click on jewelry tag")
    public void clickJewelryTag() throws InterruptedException {

        Hooks.tags.jewelryTag().click();
        Thread.sleep(3000);

    }

    @And("User Click on cool tag")
    public void clickCoolTag() throws InterruptedException {

        Hooks.tags.coolTag().click();
        Thread.sleep(3000);
    }

    @And("User Click on awesome tag")
    public void clickAwesomeTag() throws InterruptedException {

     Hooks.tags.awesomeTag().click();
        Thread.sleep(3000);
    }

    @And("User Click on book tag")
    public void clickBookTab() throws InterruptedException {

  Hooks.tags.bookTag().click();
        Thread.sleep(3000);

    }


}
