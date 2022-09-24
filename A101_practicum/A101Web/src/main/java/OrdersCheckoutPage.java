import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OrdersCheckoutPage {
    public WebDriver driver;
    private final By create_new_address_xpath = By.xpath("(//a[@title=\"Yeni adres oluştur\"])[1]");
    private final By address_name_xpath = By.xpath("//input[@placeholder=\"Ev adresim, iş adresim vb.\"]");
    private final By name_xpath = By.xpath("//input[@name=\"first_name\"]");
    private final By surname_xpath = By.xpath("//input[@name=\"last_name\"]");
    private final By telephone_number_xpath = By.xpath("//input[@name=\"phone_number\"]");
    private final By city_xpath = By.xpath("//option[@value=\"40\"]");
    private final By district_xpath = By.xpath("//option[@value=\"457\"]");
    private final By neighborhood_xpath = By.xpath("//option[@value=\"35548\"]");
    private final By address_xpath = By.xpath("//textarea[@class=\"js-address-textarea\"]");
    private final By postcode_xpath = By.xpath("//input[@name=\"postcode\"]");
    private final By save_button_xpath = By.xpath("//button[@class=\"button green js-set-country js-prevent-emoji\"]");
    private final By save_and_contiune_xpath = By.xpath("//button[@class=\"button block green js-proceed-button\"]");
    private final By pay_xpath = By.xpath("(//div[@class = \"section-hero\"])[6]");

    public OrdersCheckoutPage(WebDriver driver){
        this.driver = driver;
    }
    public void create_new_address() {
        WebDriverWait wt = new WebDriverWait(driver,6);
        wt.until(ExpectedConditions.elementToBeClickable(create_new_address_xpath));
        WebElement createnewaddress = driver.findElement(create_new_address_xpath);
        createnewaddress.click();
    }

    public void entering_address_information() {
        WebDriverWait wt = new WebDriverWait(driver,6);
        WebElement addressname = driver.findElement(address_name_xpath);
        WebElement name = driver.findElement(name_xpath);
        WebElement surname = driver.findElement(surname_xpath);
        WebElement telephone = driver.findElement(telephone_number_xpath);
        WebElement city = driver.findElement(city_xpath);
        WebElement address = driver.findElement(address_xpath);
        //WebElement postcode = driver.findElement(postcode_xpath);
        WebElement savebutton = driver.findElement(save_button_xpath);
        addressname.sendKeys("Iş adresi");
        name.sendKeys("Patika");
        surname.sendKeys("DEV");
        telephone.sendKeys("1234567890");
        city.click();
        wt.until(ExpectedConditions.elementToBeClickable(district_xpath));
        WebElement district = driver.findElement(district_xpath);
        district.click();
        wt.until(ExpectedConditions.elementToBeClickable(neighborhood_xpath));
        WebElement neighborhood = driver.findElement(neighborhood_xpath);
        neighborhood.click();
        address.sendKeys("adres adres adres adres adres adres adres");
        //postcode.sendKeys("12345");
        savebutton.click();
        System.out.println("Adres bilgileri girildi.");
    }

    public void save_and_contiune(){
        WebDriverWait wt = new WebDriverWait(driver,6);
        wt.until(ExpectedConditions.elementToBeClickable(save_and_contiune_xpath));
        WebElement saveandcontiune = driver.findElement(save_and_contiune_xpath);
        saveandcontiune.click();
        System.out.println("Kaydet ve devam et butonuna basıldı");
    }

    public String pay(){
        WebElement pay = driver.findElement(pay_xpath);
        String string_pay = pay.getAttribute("textContent");
        return string_pay.replaceAll(" ", "").replaceAll("\n","");
    }

    public void check_on_the_payment_screen(){
        Assertions.assertEquals("TAKSİTSEÇENEKLERİ",pay(), "Hata! Ödeme ekranına ulaşılamadı.");
        System.out.println("Ödeme ekranına geldiği kontrol edildi.");
        }
}
