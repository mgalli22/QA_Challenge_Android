package org.example.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;

public class LoginPage {
    private static AppiumDriver<MobileElement> driver;
    public void setUp() throws Exception {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Test phone");
        caps.setCapability(MobileCapabilityType.APP, "app-qa-release.apk");

        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(url, caps);
    }

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
    public void login(String username, String password) {

        MobileElement usernameField = driver.findElement(By.id("Email"));
        MobileElement passwordField = driver.findElement(By.id("Password"));
        MobileElement loginButton = driver.findElement(By.id("loginButton"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        loginButton.click();

    }
}
