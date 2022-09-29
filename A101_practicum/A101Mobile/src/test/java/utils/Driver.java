package utils;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;



public class Driver {
    private static AndroidDriver driver;
    public static AndroidDriver InitializeDriver() throws MalformedURLException {
        if (driver == null) {
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability("platformName", "Android");
            desiredCapabilities.setCapability("appium:autoGrantPermissions", true);
            desiredCapabilities.setCapability("appium:app", "C:\\Users\\User\\Desktop\\A101_practicum\\A101Mobile\\apk\\a101.apk");
            desiredCapabilities.setCapability("APP_PACKAGE", "org.studionord.a101");
            desiredCapabilities.setCapability("APP_ACTIVITY", "host.exp.exponent.MainActivity");


            driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), desiredCapabilities);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver(){
        driver.quit();
    }

}