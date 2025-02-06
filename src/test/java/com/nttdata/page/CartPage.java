package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    private WebDriver driver;

    // Elementos del popup del carrito
    public static By cartItemQuantity = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[1]/div/div[2]/span[3]");
    public static By totalAmountPopup = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/p[4]/span[2]");
    public static By checkoutButton = By.xpath("//*[@id='blockcart-modal']/div/div/div[2]/div/div[2]/div/div/a");

    // Elementos de la página del carrito
    public static By cartTitle = By.xpath("//*[@id='main']/div/div[1]/div/div[1]/h1");
    public static By totalAmountCart = By.xpath("//*[@id='main']/div/div[2]/div[1]/div[1]/div[2]/div[2]/span[2]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void verifyCartDetails(String expectedQuantity, String expectedAmount) {
        String actualQuantity = driver.findElement(cartItemQuantity).getText();
        String actualAmount = driver.findElement(totalAmountPopup).getText();
        assert actualQuantity.equals(expectedQuantity);
        assert actualAmount.equals(expectedAmount);
    }

    public void proceedToCheckout() {
        driver.findElement(checkoutButton).click();
    }

    public void verifyCartPage(String expectedTitle, String expectedAmount) {
        String actualTitle = driver.findElement(cartTitle).getText();
        String actualAmount = driver.findElement(totalAmountCart).getText();
        assert actualTitle.equals(expectedTitle);
        assert actualAmount.equals(expectedAmount);
    }
}