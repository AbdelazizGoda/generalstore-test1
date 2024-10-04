package com.generalstore.tests;

import com.generalstore.pages.HomePage;
import org.testng.annotations.Test;

public class TestCase extends BaseTest {

    @Test
    public void testShoppingFlow() {
        // Initialize the HomePage object
        HomePage homePage = new HomePage(driver);

        // 1. Select Andorra from the country dropdown
        homePage.selectCountry("Andorra");

        // 2. Enter your name
        homePage.enterName("Zizo");

        // 3. Select your gender
        homePage.selectGender("Male");

        // 4. Click the "Let's Shop" button
        homePage.clickLetsShop();
        
        // You can now proceed to add further steps, such as:
        // - Adding a product to the cart
        // - Navigating to the cart screen
        // - Asserting that the product is displayed
    }
}
