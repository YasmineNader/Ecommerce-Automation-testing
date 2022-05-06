package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResetPasswordPage {

    WebDriver driver;
    public  ResetPasswordPage(WebDriver driver){

        this.driver =driver;

    }

    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }

    public WebElement ForgetPasswordLink(){


        return driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]"));


    }

    public WebElement email(){


        return driver.findElement(By.id("Email"));


    }

    public WebElement RecoveryButton(){


        return driver.findElement(By.name("send-email"));


    }

    public WebElement SendMailMsg(){


        return driver.findElement(By.className("content"));


    }
}
