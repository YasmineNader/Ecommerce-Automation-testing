package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DifferentCategoriesPage {
        WebDriver driver;

        public DifferentCategoriesPage(WebDriver driver){

            this.driver =driver;

        }
        public WebElement userAccount(){


            return driver.findElement(By.className("ico-account"));


        }

    public void category(){

        WebElement dropMenu =  driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/computers\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(dropMenu).perform();


    }


    public void subCategory(){

        WebElement subcategory =  driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/notebooks\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(subcategory).perform();


    }

    public WebElement openSubCategory(){

       return  driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>ul[class=\"sublist first-level\"]>li>a[href=\"/notebooks\"]"));


    }
}
