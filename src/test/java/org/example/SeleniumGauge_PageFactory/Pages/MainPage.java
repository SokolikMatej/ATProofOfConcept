package org.example.SeleniumGauge_PageFactory.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
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

    @FindBy(xpath = "//div[@role='navigation']/one-app-launcher-header")
    private WebElement mainMenuButton;
    @FindBy(xpath = "//p[text() = 'Sales']//ancestor::one-app-launcher-menu-item")
    private WebElement salesMenuButton;

    public MainPage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = Objects.requireNonNullElseGet(wait, () -> new WebDriverWait(this.driver, Duration.ofSeconds(10)));
        PageFactory.initElements(this.driver, this);
    }


    public SalesPage filterSales() throws Exception {
        try {
            this.wait.until(ExpectedConditions.elementToBeClickable(mainMenuButton));
            mainMenuButton.click();

            this.wait.until(ExpectedConditions.elementToBeClickable(salesMenuButton));
            salesMenuButton.click();


            return new SalesPage(this.driver, this.wait);

        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while filtering sales in MainPage Pagebject");
        }
    }
}
