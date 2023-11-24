package by.itacademy.shlesin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KvitkiPage {
    private String buttonAcsessCookie = "//*[@id=\"CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll\"]";
    private String bunnerCloseLocator = "/html/body/div[7]/div";
    private String buttonSubmitAccountLocator = "/html/body/div[3]/div[2]/div/app-user-account-link/app-profile-link";
    private String textEnterLocator = "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span[1]";
    private String inputTextEmailLocator = "/html/body/div[9]/div[2]/div/mat-dialog-container/div/div/app-user-auth-form/div[2]/mat-tab-group/div/mat-tab-body[1]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div/input";
    private String inputTextPasswordLocator = "//*[@id=\"3w998ouvqkk-password\"]";
    private String clickfieldEmailLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/div";
    private String clickfieldPasswordLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/div";
    private String messegeEmtyEmailLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[1]/app-email-input/app-field-error/app-collapsible";
    private String messegeEmtyPasswordLocator = "//*[@id=\"mat-tab-content-0-0\"]/div/app-user-login-form/app-collapsible/div/app-form-builder/form/app-collapsible[2]/app-password-input/app-field-error/app-collapsible";
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
