package clase_7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ManejoWebDriverManager {

    @Test
    public void navegadorChrome(){
        WebDriverManager.chromedriver().setup();
        /*System.setProperty(
                "webdriver.chrome.driver",
                System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver"
        );*/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }
}
