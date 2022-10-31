package org.example.SeleniumGauge_PageObject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Objects;

/**
 * Page containing menu button and user manipulation buttons
 */
public class MainPage {

    private final ChromeDriver driver;
    private final WebDriverWait wait;

    private final By mainMenuButton = By.xpath("//div[@role='navigation']/one-app-launcher-header");
    private final By salesMenuButton = By.xpath("//p[text() = 'Sales']//ancestor::one-app-launcher-menu-item");

    public MainPage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = Objects.requireNonNullElseGet(wait, () -> new WebDriverWait(this.driver, Duration.ofSeconds(10)));
    }


    public SalesPage FilterSales() throws Exception {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(mainMenuButton));
            this.driver.findElement(mainMenuButton).click();

            this.wait.until(ExpectedConditions.elementToBeClickable(salesMenuButton));
            this.driver.findElement(salesMenuButton).click();


            return new SalesPage(this.driver, this.wait);

        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while filtering sales in MainPage Pagebject");
        }
    }
}
