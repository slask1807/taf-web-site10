package by.itacademi.shlesin;

import by.itacademy.shlesin.BaseTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassRwByRuTest extends BaseTest {
    @Test
    public void testFormAutorisationThisEmptyValue() throws InterruptedException  {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        by.itacademi.shlesin.PassRwByRuPage passRwByRuPage = new by.itacademi.shlesin.PassRwByRuPage(driver);
        driver.navigate().to("https://pass.rw.by/ru/");
        passRwByRuPage.clickButtonPersonalAccount();
        Assertions.assertEquals("Авторизация", passRwByRuPage.getTextAutorisation());
        passRwByRuPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле", passRwByRuPage.getTextErrorLoginMessege());
        driver.close();
    }

    @Test
    public void testFormAutorisationThisOneEmptyValue() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        by.itacademi.shlesin.PassRwByRuPage passRwByRuPage = new by.itacademi.shlesin.PassRwByRuPage(driver);
        driver.navigate().to("https://pass.rw.by/ru/");
        passRwByRuPage.clickButtonPersonalAccount();
        passRwByRuPage.setInputLogin("hala");
        passRwByRuPage.clickButtonEnter();
        Assertions.assertEquals("Заполните поле", passRwByRuPage.getErrorMessegePassword());
        driver.close();
    }

    @Test
    public void testFormAutorisationThisNoExistValue() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        by.itacademi.shlesin.PassRwByRuPage passRwByRuPage = new by.itacademi.shlesin.PassRwByRuPage(driver);
        driver.navigate().to("https://pass.rw.by/ru/");
        passRwByRuPage.clickButtonPersonalAccount();
        passRwByRuPage.setInputLogin("hala");
        passRwByRuPage.setInputPassword("qwerty");
        passRwByRuPage.clickButtonEnter();
        Assertions.assertEquals("Пользователь не найден", passRwByRuPage.getErrorMessegeNoExisValue());
        driver.close();
    }
}
