import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BaseTest {
    HomePage homePage;
    ProductsPage productsPage;
    ProductPage productPage;
    BasketPage basketPage;
    LoginPage loginPage;
    OrdersCheckoutPage ordersCheckoutPage;

    @BeforeAll
    public void setUp() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.a101.com.tr/");
        driver.manage().window().maximize();
        System.out.println("Test başlatıldı.");
        homePage = new HomePage(driver);
        productsPage = new ProductsPage(driver);
        productPage = new ProductPage(driver);
        basketPage = new BasketPage(driver);
        loginPage = new LoginPage(driver);
        ordersCheckoutPage = new OrdersCheckoutPage(driver);
    }

    @AfterAll
    public void tearDown(){
        ordersCheckoutPage.driver.quit();
        System.out.println("Test bitti.");
    }


}
