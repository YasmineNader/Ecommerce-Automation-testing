package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class ProductSearchSteps {




    @When("User enter product name")
    public void userSearch()  {

        Hooks.search.searchBar().sendKeys("Apple MacBook Pro");


    }




    @Then("User click on Change search button")
    public void clickSearchbutton() throws InterruptedException {
       Hooks.search.searchButton().click();
       Thread.sleep(5000);
    }


}
