package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SuccessfulOrderPage {
    WebDriver driver;
    public SuccessfulOrderPage(WebDriver driver){

        this.driver =driver;

    }

    public WebElement userAccount(){


        return driver.findElement(By.className("ico-account"));


    }
    public WebElement termsAgreeCheck(){


        return driver.findElement(By.id("termsofservice"));


    }
    public WebElement checkOutButton(){


        return driver.findElement(By.id("checkout"));


    }
    public WebElement firstName(){


        return driver.findElement(By.id("BillingNewAddress_FirstName"));


    }

    public WebElement lastName(){


        return driver.findElement(By.id("BillingNewAddress_LastName"));


    }
    public WebElement email(){


        return driver.findElement(By.id("BillingNewAddress_Email"));


    }

    public void country(){


        WebElement country = driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select Countries = new Select(country);
        Countries.selectByVisibleText("Egypt");


    }
    public WebElement city(){


        return driver.findElement(By.id("BillingNewAddress_City"));


    }
    public WebElement address1(){


        return driver.findElement(By.id("BillingNewAddress_Address1"));


    }


    public WebElement zipCode(){


        return driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));


    }

    public WebElement PhoneNumber(){


        return driver.findElement(By.id("BillingNewAddress_PhoneNumber"));


    }

    public WebElement continueButton(){


        return  driver.findElement(By.xpath("//button[@class='button-1 new-address-next-step-button' and contains(@onclick,'Billing.save()')]"));


    }


    public WebElement continueShipping(){


        return  driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button' and contains(@onclick,'ShippingMethod.save()')]"));


    }

    public WebElement continuePaymentMethod(){


        return  driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button' and contains(@onclick,'PaymentMethod.save()')]"));


    }

    public WebElement continuePaymentInformation(){


        return  driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button' and contains(@onclick,'PaymentInfo.save()')]"));


    }

    public WebElement orderConfirmation(){


        return  driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button' and contains(@onclick,'ConfirmOrder.save()')]"));


    }

    public WebElement confirmMessage(){


        return  driver.findElement(By.className("title"));


    }


    public WebElement continueMessage(){


        return  driver.findElement(By.xpath("//button[@class='button-1 order-completed-continue-button' and contains(@onclick,'setLocation(\"/\")')]"));



    }
//    public void newAddress(){
//
//        WebElement billingAddress = driver.findElement(By.id("billing-address-select"));
//        Select address = new Select(billingAddress);
//        address.selectByVisibleText("New Address");
//
//
//
//    }
}
