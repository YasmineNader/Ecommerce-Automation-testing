package stepDefi;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    static WebDriver driver;
   static RegisterPage register;
    static LoginPage login;
    static ChangePasswordPage changePassword;
    static ResetPasswordPage resetPassword;
    static ProductSearchPage search;

    static CurrencyPage CurrencyPage;
    static DifferentCategoriesPage categories;

    static FilterColorPage filter;
    static ProductTagPage tags;
    static ShoppingCartPage shoppingCart;
    static WishListPage wishList;
    static CompareListPage compareList;
    static SuccessfulOrderPage successOrder;

    @Before
    public static void open_browser(){

        String ChromePath = System.getProperty("user.dir")+ "\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", ChromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        register = new RegisterPage(driver);
        login = new LoginPage(driver);
        changePassword = new ChangePasswordPage(driver);
        resetPassword = new ResetPasswordPage(driver);
        search = new ProductSearchPage(driver);
        CurrencyPage = new CurrencyPage(driver);
        categories = new DifferentCategoriesPage(driver);
        filter = new FilterColorPage(driver);
        tags = new ProductTagPage(driver);
        shoppingCart = new ShoppingCartPage(driver);
        wishList = new WishListPage(driver);
        compareList = new CompareListPage(driver);
        successOrder =new SuccessfulOrderPage(driver);
    }

    @After
    public static void quite_browser(){

        driver.quit();

    }
}
