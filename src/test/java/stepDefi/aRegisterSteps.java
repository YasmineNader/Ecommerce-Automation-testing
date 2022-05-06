package stepDefi;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;



public class aRegisterSteps {



//    @Given("User open browser")
//    public void user_Open_Browser() throws InterruptedException
//    {
//        String ChromePath = System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", ChromePath);
//        Hooks.driver = new ChromeDriver();
//        Hooks.driver.manage().window().maximize();
//        Hooks.driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//
//
//        Hooks.register = new RegisterPage(Hooks.driver);


//    }
//    @Given("User navigates to home page")
//    public void user_Navigates_home() {
//
//        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
//
//    }


    @And("User click to register page")
    public void user_Navigate_Register()  {
//        Hooks.driver.findElement(By.className("ico-register")).click();
        Hooks.register.registerLink().click();

    }


    @When("User enter valid data")
    public void valid_Data()  {

        Hooks.register.gender().click();
        Hooks.register.firstName().sendKeys("Yasmine");
        Hooks.register.lastName().sendKeys("Nader");
        Hooks.register.birthDay().sendKeys("24");
        Hooks.register.birthMonth().sendKeys("February");
        Hooks.register.birthYear().sendKeys("1994");
        Hooks.register.email().sendKeys("Test@yahoo.com");
        Hooks.register.company().sendKeys("udacity");
        Hooks.register.password().sendKeys("Password@1234");
        Hooks.register.confirmPassword().sendKeys("Password@1234");



    }

    @And("user click on register button")
    public void register_Button()  {
//        Hooks.driver.findElement(By.id("register-button")).click();
        Hooks.register.registerButton().click();

    }
    @Then("Success message is appear")
    public void successMessage(){

    SoftAssert soft = new SoftAssert();
    soft.assertEquals("Your registration completed",Hooks.register.message());
    soft.assertAll();
    }
//    @And("user close browser")
//    public void closeBrowser(){
//        Hooks.driver.quit();
//    }
}

