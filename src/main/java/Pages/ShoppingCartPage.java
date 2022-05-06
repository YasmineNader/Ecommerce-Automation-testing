package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppingCartPage {


    WebDriver driver;
    public ShoppingCartPage(WebDriver driver){

        this.driver =driver;

    }

    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }
    public WebElement electronics(){


        return   driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/electronics\"]"));


    }

    public WebElement cellPhones(){


        return   driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000007_cell-phones_450.jpeg\"]"));


    }
    public WebElement AddToCartButton(){


        return   driver.findElement(By.xpath("(//button[@class=\"button-2 product-box-add-to-cart-button\"])[2]"));


    }

    public WebElement shoppingCartButton(){

         return driver.findElement(By.className("cart-label"));



    }

}

