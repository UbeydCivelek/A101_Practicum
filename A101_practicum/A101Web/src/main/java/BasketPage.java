import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasketPage {
    private WebDriver driver;
    private final By confirm_cart_xpath = By.xpath("(//div/a[@title=\"Sepeti Onayla\"])[2]");

    public BasketPage(WebDriver driver){
        this.driver = driver;
    }

    public void confirm_basket(){
        WebDriverWait wt = new WebDriverWait(driver,6);
        wt.until(ExpectedConditions.elementToBeClickable(confirm_cart_xpath));
        WebElement confirmcart = driver.findElement(confirm_cart_xpath);
        confirmcart.click();
        System.out.println("Sepet onaylandı.");
    }
}