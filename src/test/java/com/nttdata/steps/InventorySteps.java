package com.nttdata.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class InventorySteps {
    private WebDriver driver;

    public InventorySteps(WebDriver driver) {
        this.driver = driver;
    }

    public boolean validateProductExistence() {
        List<WebElement> productos = driver.findElements(By.xpath("//article[contains(@class, 'product-miniature')]"));
        return !productos.isEmpty();
    }

    public int getProductCount() {
        List<WebElement> productos = driver.findElements(By.xpath("//article[contains(@class, 'product-miniature')]"));
        return productos.size();
    }
}

