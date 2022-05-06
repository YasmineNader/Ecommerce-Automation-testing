package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {

    WebDriver driver;
    public RegisterPage(WebDriver driver){

        this.driver =driver;

    }
    public WebElement registerLink(){


        return driver.findElement(By.className("ico-register"));


    }
    public WebElement gender(){


        return driver.findElement(By.cssSelector("input[id=\"gender-female\"]"));


    }
    public WebElement firstName(){


        return driver.findElement(By.id("FirstName"));


    }

    public WebElement lastName(){


        return driver.findElement(By.id("LastName"));


    }

    public WebElement birthDay(){


        return driver.findElement(By.name("DateOfBirthDay"));


    }
    public WebElement birthMonth(){


        return driver.findElement(By.name("DateOfBirthMonth"));


    }
    public WebElement birthYear(){


        return driver.findElement(By.name("DateOfBirthYear"));


    }

    public WebElement email(){


        return driver.findElement(By.id("Email"));


    }




    public WebElement company(){


        return driver.findElement(By.id("Company"));


    }

    public WebElement password(){


        return driver.findElement(By.id("Password"));


    }

    public WebElement confirmPassword(){


        return driver.findElement(By.id("ConfirmPassword"));


    }


    public WebElement registerButton(){


        return driver.findElement(By.id("register-button"));


    }

    public String message(){


        return driver.findElement(By.className("result")).getText();


    }


}
