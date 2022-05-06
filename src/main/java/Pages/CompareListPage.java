package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CompareListPage {


    WebDriver driver;
    public CompareListPage(WebDriver driver){

        this.driver =driver;

    }
    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }

    public WebElement AddToCompareList(){


        return   driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-compare-list-button\"])[1]"));


    }

    public WebElement CompareListButton(){

        return driver.findElement(By.cssSelector("a[href=\"/compareproducts\"]"));



    }
}
