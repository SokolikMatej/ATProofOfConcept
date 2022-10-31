package org.example.SeleniumGauge_PageFactory.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SalesHomePage {
    private final ChromeDriver driver;
    private final WebDriverWait wait;

    @FindBy(xpath = "//span[text()='Goal']/following-sibling::button")
    private WebElement editGoalButton;
    @FindBy(xpath = "//span[text()='EUR']/following-sibling::lightning-input//input[@lightning-input_input]")
    private WebElement editGoalInput;

    @FindBy(xpath = "//button[text()='Save']")
    private WebElement editGoalSaveButton;

    public SalesHomePage(ChromeDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

        PageFactory.initElements(this.driver, this);
    }

    public SalesHomePage editGoal(String sumToSet) throws InterruptedException {
        this.wait.until(ExpectedConditions.elementToBeClickable(editGoalButton));
        editGoalButton.click();

        TimeUnit.SECONDS.sleep(2);
        this.wait.until(ExpectedConditions.elementToBeClickable(editGoalInput));
        editGoalInput.clear();
        editGoalInput.sendKeys(sumToSet);

        TimeUnit.SECONDS.sleep(1);
        this.wait.until(ExpectedConditions.elementToBeClickable(editGoalSaveButton));
        editGoalSaveButton.click();

        return this;
    }


}
