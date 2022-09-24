import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Random;


public class LoginPage {
    private WebDriver driver;
    private final By continue_without_a_member_xpath = By.xpath("//div/a[@title=\"ÜYE OLMADAN DEVAM ET\"]");
    private final By email_xpath = By.name("user_email");
    private final By continue_button_xpath = By.xpath("//button[@class=\"button block green\"]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void contiune_without_a_member() {
        WebElement contiune = driver.findElement(continue_without_a_member_xpath);
        contiune.click();
        System.out.println("Uye olamdan devam et butonuna tıklandı.");
    }

    protected String getRandomString() {
        String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * CHARS.length());
            salt.append(CHARS.charAt(index));
        }
        String saltStr = salt.toString();
        System.out.println("Random email oluşturuldu.");
        return saltStr;
    }

    public void register_email() {
        WebDriverWait wt = new WebDriverWait(driver,6);
        wt.until(ExpectedConditions.elementToBeClickable(email_xpath));
        WebElement email = driver.findElement(email_xpath);
        email.sendKeys(getRandomString()+"@patika.com");
        wt.until(ExpectedConditions.elementToBeClickable(email_xpath));
        WebElement contiune = driver.findElement(continue_button_xpath);
        contiune.click();
        System.out.println("Email girildi.");
    }
}
