package org.example.SeleniumGauge_DynamicElements.MainClass;

import com.thoughtworks.gauge.datastore.SpecDataStore;
import org.example.SeleniumGauge_DynamicElements.StaticVariables.CommonXpathFactory;
import org.example.SeleniumGauge_DynamicElements.StaticVariables.SpecVariables;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RBIClass {
    private final ChromeDriver driver;
    private final WebDriverWait wait;

    public RBIClass() {
        this.driver = (ChromeDriver) SpecDataStore.get(SpecVariables.CHROME_DRIVER);
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }


    public void clickMainMenu() throws Exception {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonXpathFactory.getMainMenuXpath())));
            this.driver.findElement(By.xpath(CommonXpathFactory.getMainMenuXpath())).click();
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while clicking main menu");
        }
    }

    public void clickMainMenuItem(String menuItemName) throws Exception {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonXpathFactory.getMainMenuItemXpath(menuItemName))));
            this.driver.findElement(By.xpath(CommonXpathFactory.getMainMenuItemXpath(menuItemName))).click();
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while clicking menu item");
        }
    }

    public void clickNavigationMenuItem(String navigationActionName) throws Exception {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonXpathFactory.getNavigationMenuItem(navigationActionName))));
            this.driver.findElement(By.xpath(CommonXpathFactory.getNavigationMenuItem(navigationActionName))).click();
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while clicking navigation menu item");
        }
    }

    public void clickEditField(String fieldName) throws Exception {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonXpathFactory.getEditIconXpath(fieldName))));
            this.driver.findElement(By.xpath(CommonXpathFactory.getEditIconXpath(fieldName))).click();
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while clicking edit icon after field: " + fieldName);
        }
    }

    public void setText(String inputLabel, String text) throws Exception {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonXpathFactory.getInputByLabel(inputLabel))));
            this.driver.findElement(By.xpath(CommonXpathFactory.getInputByLabel(inputLabel))).clear();
            this.driver.findElement(By.xpath(CommonXpathFactory.getInputByLabel(inputLabel))).sendKeys(text);
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while setting text " + text + " to input with label " + inputLabel);
        }
    }

    public void delay(int seconds) throws InterruptedException {
        TimeUnit.SECONDS.sleep(seconds);
    }

    public void clickButton(String buttonText) throws Exception {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(By.xpath(CommonXpathFactory.getButtonXpath(buttonText))));
            this.driver.findElement(By.xpath(CommonXpathFactory.getButtonXpath(buttonText))).click();
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while clicking button with text: " + buttonText);

        }
    }
}
