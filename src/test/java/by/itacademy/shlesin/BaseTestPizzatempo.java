package by.itacademy.shlesin;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTestPizzatempo {
    WebDriver driver;

    @BeforeEach
    public void start(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.pizzatempo.by/");
            }
    @AfterEach
    public void finish() {
        driver.quit();
    }
}
