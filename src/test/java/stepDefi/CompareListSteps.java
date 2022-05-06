package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompareListSteps {

    @And("add to compare list")
    public void AddToCompareList() throws InterruptedException {

        Hooks.compareList.AddToCompareList().click();
        Thread.sleep(4000);
    }


    @And("click on compare list Button")
    public void clickCompareListButton() throws InterruptedException {
        Hooks.compareList.CompareListButton().click();
        Thread.sleep(3000);

    }
}
