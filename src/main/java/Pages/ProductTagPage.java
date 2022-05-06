package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductTagPage {

    WebDriver driver;
    public ProductTagPage(WebDriver driver){

        this.driver =driver;

    }
    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }
    public void tagsURL(){


         driver.navigate().to("https://demo.nopcommerce.com/producttag/all");


    }

    public WebElement jewelryTag(){

        return driver.findElement(By.cssSelector("ul[class=\"product-tags-list\"]>li>a[href=\"/jewelry-2\"]"));



    }
    public WebElement awesomeTag(){

//    return driver.findElement(By.cssSelector("ul[class=\"product-tags-list\"]>li>a[href=\"/awesome\"]"));
return driver.findElement(By.cssSelector("div[class=\"tags\"]>ul>li>a[href=\"/awesome\"]"));


    }
    public WebElement coolTag(){


//        return driver.findElement(By.cssSelector("ul[class=\"product-tags-list\"]>li>a[href=\"/cool\"]"));

        return driver.findElement(By.cssSelector("div[class=\"tags\"]>ul>li>a[href=\"/cool\"]"));
    }
    public WebElement bookTag(){

//        return driver.findElement(By.cssSelector("ul[class=\"product-tags-list\"]>li>a[href=\"/book\"]"));
        return driver.findElement(By.cssSelector("div[class=\"tags\"]>ul>li>a[href=\"/book\"]"));


    }
}
