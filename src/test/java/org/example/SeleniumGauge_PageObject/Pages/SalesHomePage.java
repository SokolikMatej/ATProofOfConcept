package org.example.SeleniumGauge_PageObject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesHomePage {
    private final ChromeDriver driver;
    private final WebDriverWait wait;

    private final By editGoalButton = By.xpath("//span[text()='Goal']/following-sibling::button");
    private final By editGoalInput = By.xpath("//span[text()='EUR']/following-sibling::lightning-input//input[@lightning-input_input]");
    private final By editGoalSaveButton = By.xpath("//button[text()='Save']");

    public SalesHomePage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public SalesHomePage editGoal(String sumToSet) {
        this.wait.until(ExpectedConditions.elementToBeClickable(editGoalButton));
        this.driver.findElement(editGoalButton).click();

        this.wait.until(ExpectedConditions.elementToBeClickable(editGoalInput));
        this.driver.findElement(editGoalInput).clear();
        this.driver.findElement(editGoalInput).sendKeys(sumToSet);

        this.wait.until(ExpectedConditions.elementToBeClickable(editGoalSaveButton));
        this.driver.findElement(editGoalSaveButton).click();

        return this;
    }


}
