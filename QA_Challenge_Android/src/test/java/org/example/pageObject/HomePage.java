package org.example.pageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    public HomePage(WebDriver driver) {

    }

    private static AppiumDriver<MobileElement> driver;

    private static final MobileElement title = driver.findElement(By.id("Title"));


    public static boolean verifyHomePageTitle(){
        return title.isDisplayed();
    }

}
