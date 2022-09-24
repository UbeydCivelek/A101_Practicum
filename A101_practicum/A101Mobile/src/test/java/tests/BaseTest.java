package tests;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.support.PageFactory;
import pages.*;
import utils.Driver;
import java.net.MalformedURLException;

public class BaseTest {
    public AndroidDriver<MobileElement> driver;
    HomePage homePage;
    ProductsPage productsPage;
    BasketPage basketPage;
    LoginPage loginPage;
    OrdersCheckoutPage ordersCheckoutPage;

    @Before
    public void setUp() throws MalformedURLException {
        driver = (AndroidDriver) Driver.InitializeDriver();
        PageFactory.initElements(driver, this);
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        basketPage = new BasketPage(driver);
        loginPage = new LoginPage(driver);
        ordersCheckoutPage = new OrdersCheckoutPage(driver);
        System.out.println("Test başladı.");
    }

    @After
    public void tearDown() {
        Driver.quitDriver();
    }
}