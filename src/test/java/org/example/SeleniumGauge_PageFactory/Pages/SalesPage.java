package org.example.SeleniumGauge_PageFactory.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SalesPage {

    private final ChromeDriver driver;
    private final WebDriverWait wait;
    @FindBy(xpath = "//a[@title='Home']/..")
    private WebElement upperMenuHome;

    public SalesPage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(this.driver,this);
    }

    public SalesHomePage openSalesHome() throws Exception {
        try {
            TimeUnit.SECONDS.sleep(5);
            this.wait.until(ExpectedConditions.elementToBeClickable(upperMenuHome));
            upperMenuHome.click();
            TimeUnit.SECONDS.sleep(2);
            return new SalesHomePage(this.driver, this.wait);
        } catch (Exception e) {
            throw new Exception(e.getMessage() + "\n Error while clicking Home submenu on sales page");
        }
    }


}
