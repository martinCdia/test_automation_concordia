package clase_4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AperturaNavegador {
    public static void main(String[] args) throws InterruptedException {
        // Seteamos la property para la browser que deseamos abrir con la ubicacion del driver para Chrome
        // System.setProperty(property, value)
        // - property => webdriver.chrome.driver
        // - value => ubicacion de chromedriver
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver" );

        // Creamos un WebDriver del tipo browser
        WebDriver driver = new ChromeDriver();

        // mediante el metodo get le indicamos la url a visitar
        driver.get("https://www.saucedemo.com/");

        // Cierra la ventana del navegador que se tiene foco (pestaña o ventanas emergentes)
        /* driver.close();*/

        Thread.sleep(10000);

        // Cierra todas las ventanas del browser (cierra el browser por completo)
        driver.quit();
    }
}
