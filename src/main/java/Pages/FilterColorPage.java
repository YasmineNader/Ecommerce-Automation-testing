package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FilterColorPage {
    WebDriver driver;
    public  FilterColorPage(WebDriver driver){

        this.driver =driver;

    }

    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }

    public WebElement apparelCategory(){


        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/apparel\"]"));


    }

    public WebElement ShoesCategory(){


        return driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000010_shoes_450.jpeg\"]"));


    }

    public WebElement redColorFilter(){


        return driver.findElement(By.id("attribute-option-15"));


    }


}
