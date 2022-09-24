package pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.*;

public class BasketPage {
    public AndroidDriver<MobileElement> driver;
    private final By color_xpath = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[2]");
    private final By accept_the_basket_button_xpath = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]");
    public BasketPage(AndroidDriver driver) {

        this.driver = driver;
    }
    public void confirm_color_the_product() throws InterruptedException {
        Thread.sleep(5000);
        WebElement color = driver.findElement(color_xpath);
        String color_name = color.getAttribute("text");
        Assertions.assertEquals("SİYAH",color_name, "Hata! Seçilen ürünün rengi siyah değil.");
        System.out.println("Ürünün rengi siyah olduğu doğrulandı.");
    }
    public void click_to_accept_the_basket_button(){
        WebElement acceptbasket = driver.findElement(accept_the_basket_button_xpath);
        acceptbasket.click();
        System.out.println("Sepeti kabul et butonuna tıklandı.");
    }
}