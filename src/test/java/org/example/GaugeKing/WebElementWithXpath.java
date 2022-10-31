package org.example.GaugeKing;

import com.thoughtworks.gauge.Gauge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.InvalidObjectException;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class WebElementWithXpath {
    private String xpath;
    private WebElement webElement;

    public WebElementWithXpath(WebElement w, String xpath) {
        this.webElement = w;
        this.xpath = xpath;
    }

    public static WebElementWithXpath createWebElementWithXpath(ChromeDriver driver, String xpath) throws Exception {
        try {
            WebDriverWait waiter = new WebDriverWait(driver, TimeoutConstants.MAX_SHORT_LOADING_TIME);
            List<WebElement> elemety = driver.findElements(By.xpath("//body//*[contains(text(),'null')]"));
            if (elemety.size() > 0) {
                throw new Exception("null element was found");
            }

            waiter.until(presenceOfElementLocated(By.xpath(xpath)));
            return getWebElementByXpath(driver, xpath);

        } catch (Exception e) {
            throw new InvalidObjectException(e.getMessage() + "\n Chyba pri vytvarani elementu: " + xpath);
        }


    }

    private static WebElementWithXpath getWebElementByXpath(ChromeDriver driver, String xpath) {
        try {
            return new WebElementWithXpath(driver.findElement(By.xpath(xpath)), xpath);

        } catch (Exception e) {
            Gauge.writeMessage("Chyba pri vytarani elementu" + xpath);
            throw e;
        }
    }

    public String getXpath() {
        return xpath;
    }

    public WebElement getWebElement() throws InvalidObjectException {
        if (this.webElement != null) {
            return this.webElement;
        } else {
            throw new InvalidObjectException("WebElement je null");
        }
    }

    public void click() throws InvalidObjectException {
        if (this.webElement != null) {
            this.webElement.click();
        } else {
            throw new InvalidObjectException("WebElement je null");
        }
    }
}
