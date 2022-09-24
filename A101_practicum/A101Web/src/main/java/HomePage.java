import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage {
    private WebDriver driver;
    private final By giyim_aksesuar_xpath = By.xpath("(//li[@class=\"js-navigation-item \"])[4]");
    private final By dizalti_corap_xpath = By.xpath("//a[@title=\"Dizaltı Çorap\"]");
    private final By accept_cookies_xpath = By.xpath("//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]");
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void accept_cookies() {
        WebElement cookies = driver.findElement(accept_cookies_xpath);
        cookies.click();
        System.out.println("Çerezler Kabul Edildi.");
    }

    public void go_to_dizalticorap() {
        WebDriverWait wt = new WebDriverWait(driver,6);
        Actions action = new Actions(driver);
        WebElement giyim_aksesuar = driver.findElement(giyim_aksesuar_xpath);
        action.moveToElement(giyim_aksesuar).perform();
        wt.until(ExpectedConditions.elementToBeClickable(dizalti_corap_xpath));
        WebElement dizalti_corap = driver.findElement(dizalti_corap_xpath);
        dizalti_corap.click();
        System.out.println("Giyim--> Aksesuar--> Kadın İç Giyim-->Dizaltı Çorap Bölumune Tıklandı.");
    }
}
