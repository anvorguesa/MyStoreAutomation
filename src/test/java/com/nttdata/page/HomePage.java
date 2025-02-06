package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    // Elementos para navegar a las categorías
    public static By allProductsLink = By.xpath("//*[@id='content']/section[1]/a");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToAllProducts() {
        driver.findElement(allProductsLink).click();
    }
}