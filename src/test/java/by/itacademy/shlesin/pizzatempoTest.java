package by.itacademy.shlesin;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class pizzatempoTest extends BaseTestPizzatempo {

    @Test
    public void checkBasket() throws InterruptedException {
        driver.navigate().to("https://www.pizzatempo.by/");
        PizzatempoPage pizzatempoPage = new PizzatempoPage(driver);
        pizzatempoPage.clickbuttonPizza();
        pizzatempoPage.clickEnterMargarita();
        pizzatempoPage.clickChooseSize();
        pizzatempoPage.clickGotOrder();
        pizzatempoPage.clickButtonBasket();
        Assertions.assertEquals("Пицца \"Маргарита\" (26см)", pizzatempoPage.checkNamePizzaInBasket());
    }
}
