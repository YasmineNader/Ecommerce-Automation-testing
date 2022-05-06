package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;

public class DifferentCategoriesSteps {

    @When("User Click on Category")
    public void categoryChoose() throws InterruptedException {
        Hooks.categories.category();
        Thread.sleep(3000);


    }


    @And("User hover on sub category")
    public void subCategoryChoose() throws InterruptedException {


     Hooks.categories.subCategory();
        Thread.sleep(3000);




    }

    @Then("click on Sub category")
    public void clickSubCategory() throws InterruptedException {


        Hooks.categories.openSubCategory().click();
        Thread.sleep(3000);




    }



}
