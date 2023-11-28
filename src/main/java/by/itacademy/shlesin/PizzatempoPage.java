package by.itacademy.shlesin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PizzatempoPage {

    private String buttonpizza = "//*[@alt= 'Пицца']";
    private String buttonOrderMargarita = "//*[@id=\"1\"]//*[contains(text(),'Заказ')]";
    private String butonChooseSize = "//*[@id=\"order_pizza_popup\"]//*[contains(text(),'26')]";
    private String buttonGotOrder = "//*[@id=\"order_pizza_popup\" ]//*[@class=\"order-btn\" ]//*[contains(text(),'Заказ' )]";
    private String buttonBasket = "//*[@class=\"bs-price-col\" ]//a[contains(@href,'order')] ";
    private String namePizzaInBasket = "//*[@id=\"basket_expand\"]//div[@class='cart-product-name title']";
    private WebDriver driver;

    public PizzatempoPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickbuttonPizza() {
        driver.findElement(By.xpath(buttonpizza)).click();
    }

    public void clickEnterMargarita() {
        driver.findElement(By.xpath(buttonOrderMargarita)).click();
    }

    public void clickChooseSize() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(butonChooseSize)).click();
    }

    public void clickGotOrder() {
        driver.findElement(By.xpath(buttonGotOrder)).click();
    }

    public void clickButtonBasket() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath(buttonBasket)).click();
    }

    public String checkNamePizzaInBasket() {
        return driver.findElement(By.xpath(namePizzaInBasket)).getText();
    }
}
