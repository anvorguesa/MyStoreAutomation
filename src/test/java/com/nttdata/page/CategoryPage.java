package com.nttdata.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {

    private WebDriver driver;

    // Elementos para navegar en categorías
    public static By clothesLink = By.xpath("//*[@id='left-column']/div[1]/ul/li[2]/ul/li[1]/a");
    public static By menCategoryLink = By.xpath("//*[@id='left-column']/div[1]/ul/li[2]/ul/li[1]/a");

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToClothesCategory() {
        driver.findElement(clothesLink).click();
    }

    public void goToMenCategory() {
        driver.findElement(menCategoryLink).click();
    }
}