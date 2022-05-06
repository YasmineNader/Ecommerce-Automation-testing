package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChangePasswordPage {
    WebDriver driver;
    public ChangePasswordPage(WebDriver driver){

        this.driver =driver;

    }

    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }
    public WebElement changePasswordLink(){


        return driver.findElement(By.cssSelector("a[href=\"/customer/changepassword\"]"));


    }
    public WebElement oldPassword(){


        return driver.findElement(By.id("OldPassword"));


    }
    public WebElement NewPassword(){


        return driver.findElement(By.id("NewPassword"));


    }

    public WebElement confirmNewPassword(){


        return driver.findElement(By.id("ConfirmNewPassword"));


    }


    public WebElement changePasswordButton(){


        return driver.findElement(By.className("change-password-button"));


    }

    public WebElement changePasswordMessage(){


        return driver.findElement(By.className("content"));


    }


}
