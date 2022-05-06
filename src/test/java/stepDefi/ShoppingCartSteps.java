package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class ShoppingCartSteps {

    @When("User Click on Electronics Category")
    public void clickElectronicsCategory(){

       Hooks.shoppingCart.electronics().click();

    }
    @Then("click on cell phones Sub category")
    public void clickCellPhones(){
     Hooks.shoppingCart.cellPhones().click();

    }
    @And("add to shopping cart")
    public void addShoppingCart() throws InterruptedException {

        Hooks.shoppingCart.AddToCartButton().click();
      Thread.sleep(2000);
    }


    @And("click on shopping cart Button")
    public void clickOnShoppingCart() throws InterruptedException {
        Thread.sleep(5000);
        Hooks.shoppingCart.shoppingCartButton().click();
        Thread.sleep(3000);

    }



}
