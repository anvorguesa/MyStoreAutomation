package com.nttdata.stepsdefinitions;

import com.nttdata.steps.LoginSteps;
import com.nttdata.steps.InventorySteps;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.nttdata.core.DriverManager.getDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class LoginStepsDef {

    private WebDriver driver;
    private LoginSteps loginSteps;
    private InventorySteps inventorySteps;

    @Dado("que me encuentro en la página de la tienda")
    public void que_me_encuentro_en_la_página_de_la_tienda() {
        driver = getDriver();
        driver.get("https://qalab.bensg.com/store/pe/iniciar-sesion?back=https%3A%2F%2Fqalab.bensg.com%2Fstore%2Fpe%2F");
    }

    @Cuando("me logueo con mi email {string} y clave {string}")
    public void me_logueo_con_mi_email_y_clave(String email, String password) {
        loginSteps = new LoginSteps(driver);
        loginSteps.typeEmail(email);  //
        loginSteps.typePassword(password);
        loginSteps.login();
    }


    @Entonces("valido que debería aparecer el título de {string}")
    public void valido_que_debería_aparecer_el_título_de(String tituloEsperado) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5)); // Espera máxima de 10 segundos


        WebElement tituloElemento = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/section[1]/h2")));


        String tituloActual = tituloElemento.getText().trim();

        // Mostrar en consola el título esperado y el obtenido
        System.out.println("Título esperado: " + tituloEsperado);
        System.out.println("Título actual en la UI: " + tituloActual);

        // Validar que el título en la UI coincide con el esperado
        Assertions.assertEquals(tituloEsperado, tituloActual, "El título de la tienda no coincide.");
    }

    @Entonces("también valido que al menos exista un producto en la tienda")
    public void también_valido_que_al_menos_exista_un_producto_en_la_tienda() {
        inventorySteps = new InventorySteps(driver);
        Assertions.assertTrue(inventorySteps.validateProductExistence(), "No se encontraron productos en la tienda.");
    }

}
