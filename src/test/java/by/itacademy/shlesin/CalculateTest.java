package by.itacademy.shlesin;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculateTest {

@Test
    public void checkCalc(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://svyatoslav.biz/testlab/wt/index.php");
        CalculatePage calculatePage = new CalculatePage(driver);
        calculatePage.clickButtonCalculate();
    }
}
