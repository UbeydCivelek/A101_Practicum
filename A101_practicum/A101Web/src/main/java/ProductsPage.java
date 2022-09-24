import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProductsPage {

    private WebDriver driver;
    private final By siyah_renk_checkbox_xpath = By.xpath("(//li[@class=\"checkbox\"])[5]");
    private final By product_xpath = By.xpath("(//article[@class=\"product-card js-product-wrapper\"])[1]");

    public ProductsPage(WebDriver driver){
        this.driver = driver;
    }

    public void select_product() {
        WebElement siyah_checkbox = driver.findElement(siyah_renk_checkbox_xpath);
        siyah_checkbox.click();
        WebElement product =driver.findElement(product_xpath);
        product.click();
        System.out.println("Urun seçildi.");
    }
}
