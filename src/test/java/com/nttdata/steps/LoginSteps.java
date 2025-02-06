package com.nttdata.steps;
import java.time.Duration;
import com.nttdata.page.MyStorePage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginSteps {

    private WebDriver driver;

    // Constructor
    public LoginSteps(WebDriver driver) {
        this.driver = driver;
    }

    /**
     * Ingresa el usuario en el campo de login
     */
    public void typeEmail(String email) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));  // Espera hasta 10 segundos
        WebElement emailField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("field-email")));
        emailField.sendKeys(email);
    }


    /**
     * Ingresa la contraseña en el campo de login
     */
    public void typePassword(String password) {
        driver.findElement(LoginPage.passwordField).sendKeys(password);
    }

    /**
     * Hace click en el botón de login
     */
    public void login() {
        driver.findElement(LoginPage.loginButton).click();
    }

    /**
     * Valida que al menos haya un producto disponible en la tienda
     */
    public boolean validateProductExistence() {
        List<WebElement> products = driver.findElements(MyStorePage.productList);
        return !products.isEmpty();
    }
}
