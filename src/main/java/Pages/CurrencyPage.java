package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CurrencyPage {
    WebDriver driver;
    public CurrencyPage(WebDriver driver){

        this.driver =driver;

    }
    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }
    public WebElement CurrencyDropMenu()
    {

        return driver.findElement(By.id("customerCurrency"));


    }
    public void CurrencyEuro()
    {

        Select Currencies = new Select(CurrencyDropMenu());

        Currencies.selectByVisibleText("Euro");


    }


    public void CurrencyDollar()
    {

        Select Currencies = new Select(CurrencyDropMenu());

        Currencies.selectByVisibleText("US Dollar");


    }

}
