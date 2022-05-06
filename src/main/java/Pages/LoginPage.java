package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    public  LoginPage(WebDriver driver){

        this.driver =driver;

    }

    public WebElement loginLink(){


        return driver.findElement(By.className("ico-login"));


    }
    public WebElement email(){


        return driver.findElement(By.id("Email"));


    }


    public WebElement password(){


        return driver.findElement(By.id("Password"));


    }


    public WebElement loginButton(){


        return driver.findElement(By.cssSelector(" div[class=\"buttons\"]>button[type=\"submit\"]"));


    }


}
