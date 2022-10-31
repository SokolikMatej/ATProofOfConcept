package org.example.SupportVeci;

import com.thoughtworks.gauge.BeforeSpec;
import com.thoughtworks.gauge.ExecutionContext;
import com.thoughtworks.gauge.datastore.SpecDataStore;
import org.example.SeleniumGauge_DynamicElements.StaticVariables.SpecVariables;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SpecificationManipulation {
    @BeforeSpec
    public void createChromeDriver(ExecutionContext context) throws IOException, InterruptedException {
        ChromeDriver chromeDriver = null;
        ChromeOptions options = new ChromeOptions();
        if (context.getCurrentSpecification().getName().toLowerCase().contains("test")) {
            checkConnection();
            options.setExperimentalOption("debuggerAddress", "localhost:9014");
            chromeDriver = new ChromeDriver(options);
        } else {
            chromeDriver = new ChromeDriver();
        }

        if (chromeDriver.manage().window().getSize().height != 1080 && chromeDriver.manage().window().getSize().width != 1920) {
            chromeDriver.manage().window().setSize(new Dimension(1920, 1080));
        }

        SpecDataStore.put(SpecVariables.CHROME_DRIVER, chromeDriver);
    }

    private void checkConnection() throws IOException, InterruptedException {
        try {
            var client = HttpClient.newHttpClient();
            var request = HttpRequest.newBuilder(
                            URI.create("http://localhost:9014/selenium-server/driver/?cmd=shutDownSeleniumServer"))
                    .header("accept", "application/json")
                    .build();

            var response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            System.out.println("this is new error message: " + e);
            openBrowser();
        }
    }

    private void openBrowser() throws IOException {
        String chromeDebugLocation = System.getProperty("user.dir") + "\\chromeDebug";
        Runtime.getRuntime().exec("cmd /c start cmd.exe /K \"chrome.exe -remote-debugging-port=9014 --user-data-dir=" + chromeDebugLocation.replace("\\", "\\\\") + "\"");
    }
}
