import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ProductPage {
    private WebDriver driver;
    private final By add_to_basket_xpath = By.xpath("//button[@class=\"add-to-basket button green block with-icon js-add-basket\"]");
    private final By navigate_to_basket_xpath = By.xpath("//*[@id=\"js-modal-basket\"]/div[3]/a[3]");
    private final By product_color_xpath = By.xpath("//div[@class = \"selected-variant-text\"]/span");
    public ProductPage(WebDriver driver){
        this.driver = driver;
    }

    public void correct_product_color_is_black() {
        WebDriverWait wt = new WebDriverWait(driver,6);
        wt.until(ExpectedConditions.elementToBeClickable(product_color_xpath));
        WebElement product_color = driver.findElement(product_color_xpath);
        String color = product_color.getAttribute("textContent");
        Assertions.assertEquals("SİYAH",color, "Hata! Seçilen ürünün rengi siyah değil.");
        System.out.println("Seçilen ürünün rengi siyah olduğu doğrulandı.");
    }

    public void add_to_basket() {
        WebElement addtobasket = driver.findElement(add_to_basket_xpath);
        addtobasket.click();
        System.out.println("Sepete eklendi.");
    }

    public void navigate_to_basket() {
        WebDriverWait wt = new WebDriverWait(driver,6);
        wt.until(ExpectedConditions.elementToBeClickable(navigate_to_basket_xpath));
        WebElement navigatetobasket = driver.findElement(navigate_to_basket_xpath);
        navigatetobasket.click();
        System.out.println("Sepete gidildi.");
    }
}
