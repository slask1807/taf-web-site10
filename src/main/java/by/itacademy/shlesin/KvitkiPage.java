package by.itacademy.shlesin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    private String buttonAcsessCookie = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    private String bunnerCloseLocator = "/html/body/div[7]/div";
    private String buttonSubmitAccountLocator = "//*[@class= 'user-account-text-hover']";
    private String textEnterLocator = "//*[contains(text(),\"Вход\") and @class='mdc-tab__text-label']";
    private String inputTextEmailLocator = "//*[@type='email' and @name='email']";
    private String inputTextPasswordLocator = "//*[@id=\"3w998ouvqkk-password\"]";
    private String clickfieldEmailLocator = "//*[@class='input-component ng-pristine ng-invalid input-error ng-touched']";
    private String clickfieldPasswordLocator = "//*[@class='input-component input-with-icon ng-pristine ng-invalid input-error ng-touched']";
    private String messegeEmtyEmailLocator = "//*[@class='form-field-error ng-tns-c7-18 ng-tns-c6-19 ng-trigger ng-trigger-slideInOut ng-star-inserted']";
    private String messegeEmtyPasswordLocator = "//*[@class='form-field-error ng-tns-c7-20 ng-tns-c6-21 ng-trigger ng-trigger-slideInOut ng-star-inserted']";
    private String errorMessegeWrongEmailLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error";

    private WebDriver driver;

    public KvitkiPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickButtonAcsessCookie() {
        driver.findElement(By.xpath(buttonAcsessCookie)).click();
    }

    public void bunnerCloseLocator (){
        driver.findElement(By.xpath(bunnerCloseLocator)).click();
    }

    public void clickbuttonSubmitAccount() {
        driver.findElement(By.xpath(buttonSubmitAccountLocator)).click();
    }

    public String getTextEnter() throws InterruptedException {
        Thread.sleep(2000);
        return driver.findElement(By.xpath(textEnterLocator)).getText();
    }

    public void clickFieldEmail() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(clickfieldEmailLocator)).click();
    }

    public void clickFieldPassword() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(clickfieldPasswordLocator)).click();
    }

    public String getErrorMessegeEmtyEmail() {
        return driver.findElement(By.xpath(messegeEmtyEmailLocator)).getText();
    }

    public String getErrorMessegeEmtyPassword() {
        return driver.findElement(By.xpath(messegeEmtyPasswordLocator)).getText();
    }

    public void setTextEmail(String email) {
        driver.findElement(By.xpath(inputTextEmailLocator)).sendKeys(email);
    }

    public String getErrorMessegeWrongEmail() {
        return driver.findElement(By.xpath(errorMessegeWrongEmailLocator)).getText();
    }
}
