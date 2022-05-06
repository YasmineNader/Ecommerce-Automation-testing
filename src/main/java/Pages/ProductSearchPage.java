package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductSearchPage {
    WebDriver driver;

    public ProductSearchPage(WebDriver driver){

        this.driver =driver;

    }

    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }
    public WebElement searchBar(){


        return driver.findElement(By.id("small-searchterms"));


    }
    public WebElement searchButton(){


        return driver.findElement(By.className("search-box-button"));


    }



}
