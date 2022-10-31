package org.example.SeleniumGauge_DynamicElements.StaticVariables;

public class CommonXpathFactory {
    public static String getMainMenuXpath() {
        return "//div[@role='navigation']/one-app-launcher-header";
    }

    public static String getMainMenuItemXpath(String itemName) {
        return "//p[text() = '" + itemName + "']//ancestor::one-app-launcher-menu-item";
    }

    public static String getNavigationMenuItem(String navigationActionName) {
        return "//a[@title='" + navigationActionName + "']/..";
    }

    public static String getEditIconXpath(String fieldName) {
        return "//span[text()='" + fieldName + "']/following-sibling::button";
    }

    public static String getInputByLabel(String inputLabel) {
        return "//span[text()='" + inputLabel + "']/following-sibling::lightning-input//input[@lightning-input_input]";
    }

    public static String getButtonXpath(String buttonText) {
        return "//button[text()='" + buttonText + "']";
    }
}
