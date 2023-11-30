package by.itacademy.shlesin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DominosPage {
    private String buttonAdvertisingClose = "//*[@class='custom-button custom-button--transparent custom-button--no-paddings custom-button--size-small custom-modal__close-button']";
    private String buttonAddToBasket = "//*[@id=\"app-root\"]/div/div[1]/div/div[6]/div/div/div[30]/div/div[6]/div[2]/button";
    private String buttonBasket = "//*[@class=\"cart-button__button-text\"]";
    private String textMargaritaBasket = "//div[text()='Маргарита']";
    private WebDriver driver;

    public DominosPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAdvertisingClose() {
        driver.findElement(By.xpath(buttonAdvertisingClose)).click();
    }

    public void clickAddtoBasket() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(buttonAddToBasket)).click();
    }

    public void clickButtonBusket() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(buttonBasket)).click();
    }

    public String getTextMargarita() {
        return driver.findElement(By.xpath(textMargaritaBasket)).getText();
    }
}
