package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishListPage {

    WebDriver driver;
    public WishListPage(WebDriver driver){

        this.driver =driver;

    }

    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }

    public WebElement AddToWishList(){


        return   driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]"));


    }

    public WebElement WishListButton(){

        return driver.findElement(By.className("wishlist-label"));



    }
}
