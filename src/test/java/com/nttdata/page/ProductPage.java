package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {

    private WebDriver driver;

    // Elementos para seleccionar el producto
    public static By firstProductLink = By.xpath("//*[@id='js-product-list']/div[1]/div/article/div/div[1]/a/picture/img");
    public static By quantityField = By.xpath("//*[@id='quantity_wanted']");
    public static By addToCartButton = By.xpath("//*[@id='add-to-cart-or-refresh']/div[2]/div/div[2]/button");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addProductToCart(int quantity) {
        driver.findElement(firstProductLink).click();
        driver.findElement(quantityField).clear();
        driver.findElement(quantityField).sendKeys(String.valueOf(quantity));
        driver.findElement(addToCartButton).click();
    }
}