package org.example.SeleniumGauge_PageObject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SalesPage {

    private final ChromeDriver driver;
    private final WebDriverWait wait;

    private final By upperMenuHome = By.xpath("//a[@title='Home']/..");

    public SalesPage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SalesHomePage openSalesHome() throws Exception {
        try {
            TimeUnit.SECONDS.sleep(5);
            this.wait.until(ExpectedConditions.elementToBeClickable(upperMenuHome));
            this.driver.findElement(upperMenuHome).click();
            return new SalesHomePage(this.driver, this.wait);
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while clicking Home submenu on sales page");
        }
    }


}
