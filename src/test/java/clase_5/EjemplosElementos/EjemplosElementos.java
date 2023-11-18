package clase_5.EjemplosElementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class EjemplosElementos {
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/radio.html");
        driver.manage().window().maximize(); // Para que la ventana del browser este maximizada

        // CheckBox
        // Obtenenmos el elemento
        WebElement check_one = driver.findElement(By.id("vfb-6-0"));
        //Llamamos la accion click. Si esta checkeado --> quita check, si no esta checkeado --> checkea
        check_one.click();

        // Radio Button
        // Obtenenmos el elemento
        WebElement radio_one = driver.findElement(By.id("vfb-7-1"));
        //Llamamos la accion click. Si esta selecionado --> mantiene, si no esta seleccionado --> marca
        radio_one.click();

        driver.get("https://demo.guru99.com/test/login.html");
        driver.manage().window().maximize(); // Para que la ventana del browser este maximizada

        // TextBox
        // Obtenenmos el elemento
        WebElement email = driver.findElement((By.id("email")));
        //mediante sendKeys el texto a escribir
        email.sendKeys("flashpoint@gmail.com");

        // Button
        // Obtenenmos el elemento
        WebElement sign_in = driver.findElement(By.xpath("//button[@type='submit']"));
        //Hacemos click en el boton
        sign_in.click();

        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize(); // Para que la ventana del browser este maximizada

        // DropDownList
        //Creamos un Select buscando el elemento
        Select select = new Select(driver.findElement(By.id("dropdown")));
        //Elegimos una manera de seleccionar una opcion
        select.selectByValue("1");
        select.selectByVisibleText("Option 1");
        select.selectByIndex(1);

        //Obtenemos el elemento
        Select elements = new Select(driver.findElement(By.id("dropdown")));
        for (WebElement element : elements.getOptions()) {
            System.out.println("Tag Name: " + element.getTagName());
            System.out.println("Value: " + element.getAttribute("value"));
            System.out.println("Text: " + element.getText());

            System.out.println("------------------------------");
        }
    }
}
