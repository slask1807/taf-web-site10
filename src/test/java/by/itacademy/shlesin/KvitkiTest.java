package by.itacademy.shlesin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class KvitkiTest extends BaseTest {

    @Test
    public void checkEmptyValue() throws InterruptedException {
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
               //kvitkiPage.bunnerCloseLocator();
        kvitkiPage.clickbuttonSubmitAccount();
        Assertions.assertEquals("Вход", kvitkiPage.getTextEnter());
        kvitkiPage.clickFieldEmail();
        kvitkiPage.clickFieldPassword();
        Assertions.assertEquals("Пожалуйста, заполните поле (Эл. почта)", kvitkiPage.getErrorMessegeEmtyEmail());
        kvitkiPage.clickFieldEmail();
        Assertions.assertEquals("Пожалуйста, заполните поле (Пароль)", kvitkiPage.getErrorMessegeEmtyPassword());
    }

    @Test
    public void checkFieldEmail() throws InterruptedException {
        KvitkiPage kvitkiPage = new KvitkiPage(driver);
        kvitkiPage.clickButtonAcsessCookie();
        kvitkiPage.bunnerCloseLocator();
        kvitkiPage.clickbuttonSubmitAccount();
        kvitkiPage.clickFieldEmail();
        kvitkiPage.setTextEmail("test");
        kvitkiPage.clickFieldPassword();
        Assertions.assertEquals("Пожалуйста, введите адрес электронной почты в правильном формате: name@example.com", kvitkiPage.getErrorMessegeWrongEmail());
    }
 }

