package stepDefi;

import io.cucumber.java.en.And;


public class WishListSteps {

    @And("add to WishList")
    public void AddToWishList() throws InterruptedException {
        Hooks.wishList.AddToWishList().click();
        Thread.sleep(4000);
    }


    @And("click on WishList Button")
    public void clickWishListButton() throws InterruptedException {
       Hooks.wishList.WishListButton().click();
       Thread.sleep(3000);

    }
}
