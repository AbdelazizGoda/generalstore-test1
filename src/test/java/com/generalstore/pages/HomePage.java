package com.generalstore.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage {

    private AndroidDriver<MobileElement> driver;

    // Constructor
    public HomePage(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    // Locators
    By countryDropdown = By.id("android:id/text1");
    By nameField = By.id("com.androidsample.generalstore:id/nameField");
    By genderRadioMale = By.id("com.androidsample.generalstore:id/radioMale");
    By genderRadioFemale = By.id("com.androidsample.generalstore:id/radioFemale");
    By letsShopButton = By.id("com.androidsample.generalstore:id/btnLetsShop");

    // Methods to interact with the elements
    public void selectCountry(String country) {
        driver.findElement(countryDropdown).click();
        driver.findElement(By.xpath("//android.widget.TextView[@text='" + country + "']")).click();
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
    }

    public void selectGender(String gender) {
        if (gender.equalsIgnoreCase("Male")) {
            driver.findElement(genderRadioMale).click();
        } else {
            driver.findElement(genderRadioFemale).click();
        }
    }

    public void clickLetsShop() {
        driver.findElement(letsShopButton).click();
    }
}
