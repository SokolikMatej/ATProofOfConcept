package org.example.GaugeKing;

public class CommonXpathFactory {
    public static final String getMainLoading() {
        return "//progress";
    }

    public static final String getSecondaryLoading() {
        return "//kng-loading-overlay";
    }

    public static final String getBreadcrumbXpathByLabel(String label) {
        return "(//vigsk-breadcrumbs//a[contains(text(),'" + label + "')])[last()]";
    }

    public static final String getDashboardTileXpathByLabel(String label) {
        return "//div[@class='kng-dashboard-tile--inner-block']/*[contains(text(),'" + label + "')]";
    }

    public static final String getPositiveModalWindowCloseButtonXpathByText(String text) {
        return "(//span[contains(.,\"" + text + "\")]//ancestor::kng-notification//*[@kngtooltip='Zavrieť'] | //li[contains(.,\"" + text + "\")]//ancestor::kng-notification//*[@kngtooltip='Zavrieť'])";
    }

    public static final String getModalWindowSaveButton() {
        return "//div[contains(@style,'opacity: 1')  and contains(@class,'element-on-top')]//kng-button[@class!='kng-button-type btn-not-visible ng-star-inserted' and @class!='kng-button-type ng-star-inserted btn-not-visible']//span[contains(text(),'Uložiť')]/parent::button";
    }

    public static final String getModalButtonXpath(String buttonName) {
        return "//div[contains(@style,'opacity: 1')  and contains(@class,'element-on-top')]//kng-button[@class!='kng-button-type btn-not-visible ng-star-inserted' and @class!='kng-button-type ng-star-inserted btn-not-visible']//span[contains(text(),'" + buttonName + "')]/parent::button";
    }

    public static final String getModalCheckboxXpath(String textCheckboxu) {
        return "//div[contains(@style,'opacity: 1')  and contains(@class,'element-on-top')]//kng-checkbox[@label='" + textCheckboxu + "']/label/span/preceding-sibling::div[@kng-value]";
    }

    public static final String getFilterButtonXpathByFilterName(String kngFilterName) {
        return "//kng-filter[@name='" + kngFilterName + "']//span[./text()='Filtrovať']";
    }

    public static final String getTableActionIconXpath(String action) {
        switch (action) {
            case "edit":
                return "//*[@d='M20.71,7.04C21.1,6.65 21.1,6 20.71,5.63L18.37,3.29C18,2.9 17.35,2.9 16.96,3.29L15.12,5.12L18.87,8.87M3,17.25V21H6.75L17.81,9.93L14.06,6.18L3,17.25Z']/ancestor::kng-icon/..";
            case "delete":
                return "//*[@d='M19,4H15.5L14.5,3H9.5L8.5,4H5V6H19M6,19A2,2 0 0,0 8,21H16A2,2 0 0,0 18,19V7H6V19Z']/ancestor::kng-icon/..";
            case "magnify":
                return "//*[@d='M9.5,3A6.5,6.5 0 0,1 16,9.5C16,11.11 15.41,12.59 14.44,13.73L14.71,14H15.5L20.5,19L19,20.5L14,15.5V14.71L13.73,14.44C12.59,15.41 11.11,16 9.5,16A6.5,6.5 0 0,1 3,9.5A6.5,6.5 0 0,1 9.5,3M9.5,5C7,5 5,7 5,9.5C5,12 7,14 9.5,14C12,14 14,12 14,9.5C14,7 12,5 9.5,5Z']/ancestor::kng-icon/..";
            case "document":
                return "//*[@d='M14,2H6A2,2 0 0,0 4,4V20A2,2 0 0,0 6,22H18A2,2 0 0,0 20,20V8L14,2M18,20H6V4H13V9H18V20Z']/ancestor::kng-icon/..";
        }
        return "Not correct action";
    }

    public static final String getHighlightAllButtonXpathByTableName(String tableName) {
        return "//kng-table[@name='" + tableName + "']//div[@ref='ePinnedLeftHeader']//*[@d='M19,3H5C3.89,3 3,3.89 3,5V19A2,2 0 0,0 5,21H19A2,2 0 0,0 21,19V5C21,3.89 20.1,3 19,3M19,5V19H5V5H19Z']/../..";
    }

    public static final String getKngNotificationToastXpath() {
        return "//kng-notification//*[@kngtooltip='Zavrieť']";
    }

    public static final String getKngNotificationToastXpath(String textInToast) {
        return "(//span[contains(.,\"" + textInToast + "\")]//ancestor::kng-notification//*[@kngtooltip='Zavrieť'] | //li[contains(.,\"" + textInToast + "\")]//ancestor::kng-notification//*[@kngtooltip='Zavrieť'])";
    }

    public static final String getBusinessErrorToastXpath() {
        return "//div[@class='notifications']/kng-notification/div[@class='notif berror']";
    }


    public static final String getInputElementXpathById(String elementType, String identificator) {
        switch (elementType) {
            case "input":
                if (identificator.charAt(0) == '.') {
                    return "(//input[@id='" + identificator + "']|//textarea[@id='" + identificator + "']|//input[contains(@id, '" + identificator + "')])[last()]";
                } else {
                    return "(//input[@id='" + identificator + "']|//textarea[@id='" + identificator + "'])[last()]";
                }
            case "button":
                return "(//kng-button[not(contains(@class, 'btn-not-visible'))]|//kng-link[not(contains(@class, 'btn-not-visible'))]|//kng-button-menu[not(contains(@class, 'btn-not-visible'))])//span[./text()='" + identificator + "']";
            case "checkbox":
                return "(//kng-checkbox[@label='" + identificator + "']/label/span/preceding-sibling::div[@kng-value]|//kng-checkbox//span[contains(.,'" + identificator + "')]/../div)";
            case "nadpis":
                return "//h3[contains(text(),'" + identificator + "')]";
            case "radio":
                return "//kng-radiobutton//label[contains(text(),'" + identificator + "')]";
            case "link":
                return "//kng-link//span[./text()='" + identificator + "']";
            default:
                throw new IllegalArgumentException("Neznámy elementType");
        }
    }

    /*Wizard*/
    public static final String getWizardTabXpath(String nazovTabu) {
        return "//kng-wizard/ol/li//span[contains(text(),'" + nazovTabu + "')]";
    }

    public static final String getWizardTab(String tab) {
        return "(//kng-wizard/ol/li//span[contains(text(),'" + tab + "')] | //li[@role='tab']//span[contains(text(),'" + tab + "')])";
    }

    public static final String getWizardButtonXpath(String button) {
        return "(//kng-wizard/following-sibling::kng-action-bar//span[text() = '" + button + "']|//kng-wizard//kng-wizard-step[contains(@style,'display: block')]//kng-button[not(contains(@class, 'btn-not-visible'))]//span[text() = '" + button + "'])";
    }

    /*Tabulka*/

    public static final String getTableTabXpath(String tab) {
        return "//li[@role='tab']//span[contains(text(),'" + tab + "')]";
    }

    public static final String getTableButtonXpath(String nazovTabulky, String nazovButtonu) {
        return "(//kng-table[@name='" + nazovTabulky + "']//kng-action-bar//span[contains(text(),'" + nazovButtonu + "')]|//div[contains(@class,'mat-menu-content')]//button[not (contains(@class,'ui-state-disabled'))]//span[contains(text(),'" + nazovButtonu + "')]/following-sibling::div)";
    }

    public static String getTableMagnifyXpath(String nazovPrekliku) {
        return "//div[contains(@style,'position: static')]//span[contains(text(),'" + nazovPrekliku + "')]";
    }

    public static String getTableMagnifyXpathExact(String nazovPrekliku) {
        return "//div[contains(@style,'position: static')]//span[text() = '" + nazovPrekliku + "']";
    }

    public static String getTableRowHighlightXpath(String nazovTabulky) {
        //return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='headerRoot']//div[@ref='ePinnedLeftHeader']//div[@ref='cbSelectAll']//*[@viewBox]/..";
        //return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='ePinnedLeftHeader']//input[@aria-label='Toggle Selection of All Rows']";
        return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='eWrapper']//input";
    }

    public static String getTableRowHighlightActionXpath(String nazovTabulky, String varian) {
        switch (varian) {
            case "all":
                //kng-table[@name='provizieListTable']//div[@ref='ePinnedLeftHeader']//input[@aria-label='Toggle Selection of All Rows']/../../div[contains(@class,"ag-checked")]
                //return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='ePinnedLeftHeader']//*[@d='M19,3H5C3.89,3 3,3.89 3,5V19A2,2 0 0,0 5,21H19A2,2 0 0,0 21,19V5C21,3.89 20.1,3 19,3M19,5V19H5V5H19Z']/../..";
//                return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='ePinnedLeftHeader']//input[@aria-label='Toggle Selection of All Rows']/../../div[contains(@class,'')]";
                return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='eWrapper']//input/../../div//following-sibling::div[not(contains(@class,'ag-checked')) and not(contains(@class,'ag-indetermined'))]";
            case "allRest":
//                return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='ePinnedLeftHeader']//*[@d='M19,19V5H5V19H19M19,3A2,2 0 0,1 21,5V19A2,2 0 0,1 19,21H5A2,2 0 0,1 3,19V5C3,3.89 3.9,3 5,3H19M17,11V13H7V11H17Z']/../..";
//                return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='ePinnedLeftHeader']//input[@aria-label='Toggle Selection of All Rows']/../../div[contains(@class,'ag-indeterminate')]";
                return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='eWrapper']//input/../../div//following-sibling::div[contains(@class,'ag-indeterminate')]";
            case "lowlightAll":
//                return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='ePinnedLeftHeader']//*[@d='M10,17L5,12L6.41,10.58L10,14.17L17.59,6.58L19,8M19,3H5C3.89,3 3,3.89 3,5V19A2,2 0 0,0 5,21H19A2,2 0 0,0 21,19V5C21,3.89 20.1,3 19,3Z']/../..";
//                return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='ePinnedLeftHeader']//input[@aria-label='Toggle Selection of All Rows']/../../div[contains(@class,'ag-checked')]";
                return "//kng-table[@name='" + nazovTabulky + "']//div[@ref='eWrapper']//input/../../div//following-sibling::div[contains(@class,'ag-checked')]";
        }
        return "wrong variant";
    }


    public static String getFilterRolloutXpath(String nazovFiltra) {
        return "//span[./text()='" + nazovFiltra + "']/preceding-sibling::a";
    }

    public static String getFilterNameXpath(String nazovFiltra) {
        return "//kng-filter[@name='" + nazovFiltra + "']//span[./text()='Filtrovať']";
    }

    public static String getKngNotificationPositiveToastXpath() {
        return "//kng-notification//div[@class='notif success']//*[@kngtooltip='Zavrieť']";
    }

    public static String getPickListAddItem(String input) {
        return "//kng-pick-list//div[contains(@class,'ui-picklist-source-wrapper')]//li//div[@class='text-content']/span[contains(text(),'" + input + "')]";
    }

    public static String getPickListAddItem(String input, String source) {
        return "(//div[contains(text(),'" + source + "')]/following::ul)[1]/li/div[contains(@class,'text-content')]/span[contains(text(),'" + input + "')]";
    }

    public static String getPickListRemoveItem(String input) {
        return "//kng-pick-list//div[contains(@class,'ui-picklist-listwrapper ui-picklist-target-wrapper')]//li//div[@class='text-content']/span[contains(text(),'" + input + "')]";
    }

    public static String getPickListAddButton() {
        return "//kng-pick-list//*[@d='M8.59,16.58L13.17,12L8.59,7.41L10,6L16,12L10,18L8.59,16.58Z']/ancestor::kng-icon";
    }

    public static String getPickListAddButton(String ciel) {
        return "//div[contains(text(),'" + ciel + "')]/../parent::main//*[@d='M8.59,16.58L13.17,12L8.59,7.41L10,6L16,12L10,18L8.59,16.58Z']/ancestor::button";
    }

    public static String getPickListRemoveButton() {
        return "//kng-pick-list//*[@d='M15.41,16.58L10.83,12L15.41,7.41L14,6L8,12L14,18L15.41,16.58Z']/ancestor::kng-icon";
    }

    public static String getPickListRemoveButton(String zdroj) {
        return "//div[contains(text(),'" + zdroj + "')]/../parent::main//*[@d='M15.41,16.58L10.83,12L15.41,7.41L14,6L8,12L14,18L15.41,16.58Z']/ancestor::button";
    }


    public static String getPickListAddAllButton() {
        return "//kng-pick-list//*[@d='M5.59,7.41L7,6L13,12L7,18L5.59,16.59L10.17,12L5.59,7.41M11.59,7.41L13,6L19,12L13,18L11.59,16.59L16.17,12L11.59,7.41Z']/ancestor::kng-icon";
    }

    public static String getPickListRemoveAllButton() {
        return "//kng-pick-list//*[@d='M18.41,7.41L17,6L11,12L17,18L18.41,16.59L13.83,12L18.41,7.41M12.41,7.41L11,6L5,12L11,18L12.41,16.59L7.83,12L12.41,7.41Z']/ancestor::kng-icon";
    }

    public static String getInputMagnifyButtonXpath(String inputId) {
        return "(//input[@id='" + inputId + "']/ancestor::label/following-sibling::kng-zoom-button//kng-button-menu | //input[@id='" + inputId + "']/ancestor::label/following-sibling::kng-zoom-button//kng-link | //input[@id='" + inputId + "']/ancestor::label/following-sibling::kng-zoom-button//kng-button)";
    }

    public static String getInputButtonXpath(String naznovPrekliku) {
        return "//span[./ text() = '" + naznovPrekliku + "']";
    }

    public static String getComboboxTerminateButtonXpath(String id) {
        return "//input[@id='" + id + "']/../kng-icon[@kngtooltip = 'Zmazať hodnoty']";
    }

    public static String getComboboxRolloutButtonXpath(String id) {
        return getInputElementXpathById("input", id) + "/../following-sibling::button";
    }

    public static String getComboboxFirstValueXpath(String id) {
        return "//input[@id='" + id + "']/ancestor::label/parent::*//div[contains(@style,'display: block')]/ul/kng-combobox-item";
    }

    public static String getComboboxValueXpath(String id, String value) {
        return getInputElementXpathById("input", id) + "/ancestor::label/parent::*//div[contains(@style,'display: block')]/ul//kng-combobox-item[" + value + "]";
    }

    public static String getComboboxNotValueXpath(String id, String values) {
        return getInputElementXpathById("input", id) + "/../following-sibling::div//kng-combobox-item//span[not(" + values + ")]";
    }

    public static String getComboboxNotValueXpath(String id, String values, int position) {
        return "(" + getInputElementXpathById("input", id) + "/../following-sibling::div//kng-combobox-item//span[not(" + values + ")])[" + position + "]";
    }


    public static String getComboboxValueXpathFromCombobox(String id, String value) {
        return id + "/ancestor::label/parent::*//div[contains(@style,'display: block')]/ul//kng-combobox-item[" + value + "]";

    }

    public static String getComboboxStringValueXpath(String id, String value) {
        return getInputElementXpathById("input", id) + "/../..//kng-combobox-item//span[contains(translate(@title,' ',' '),'" + value + "')]";
    }

    public static String getInputValidationXpath(String inputId) {
        return "//input[@id='" + inputId + "']/ancestor::label/following-sibling::kng-validation-message[contains(@style,'visibility: visible')]";
    }

    public static String getRadioButtonValidationXpath(String inputId) {
        return "//kng-radiobutton//label[contains(text(),'" + inputId + "')]//ancestor::div[@class='kng-radio-options']/following-sibling::kng-validation-message[contains(@style,'visibility: visible')]";
    }

    public static String getTableMenuButtonXpath(String button) {
        return "//div[contains(@class,'mat-menu-content')]//button[not(contains(@class, 'btn-not-visible'))]//span[./text()='" + button + "']";
    }

    public static String getTableDofiltrovatInputXpath(String tabulka) {
        return "//kng-table[@name= '" + tabulka + "']//div[contains(@class,'table-filter')]/input";
    }

    public static String getInputValidationTextXpath() {
        return "//div[contains(@class,'ui-tooltip ')]";
    }

    public static String getUserXpath() {
        return "//vigsk-header//span[@class='user-name']";
    }

    public static String getElementTextXpath(String text) {
        return "(//div[contains(@style,'display: block') and contains(@class,'element-on-top')]//span[contains(.,'" + text + "')]|//*[text()[contains(.,'" + text + "')]])";
    }

    public static String getKngNotificationPositiveToastTextXpath(String textVToaste) {
        return "(//kng-notification//span[@class='notif-body']/span[contains(text(),'" + textVToaste + "')] | //kng-notification//span[@class='notif-body']/ul/li[contains(text(),'" + textVToaste + "')] | //kng-notification//span[contains(text(),'" + textVToaste + "')])";
    }

    public static String getFormUlozitXpath(String kngDataForm_name) {
        return "//kng-data-form[@name='" + kngDataForm_name + "']//div[@class='form-group']//kng-action-bar/kng-button[@class != 'btn-not-visible ng-star-inserted']//button//span[contains(text(),'Uložiť')]";
    }

    public static String getTableAddEntry(String nazovTabulky) {
        return "//kng-table[@name='" + nazovTabulky + "'][//kng-button | kng-link]//kng-icon//*[@d = 'M19,13H13V19H11V13H5V11H11V5H13V11H19V13Z']/ancestor::kng-icon";
    }

    public static String getTableTempCheckboxXpath(String attribute) {
        return "//div[@class='ag-pinned-left-cols-container']/div[@row-id='" + attribute + "']//div[@class='ag-selection-checkbox']";
    }

    public static String getTableCell(String rowId, String colId) {
        return "//div[@row-id='" + rowId + "']/div[@col-id='" + colId + "']";
    }

    public static String getTableAddEntryPath(String pathToTable) {
        return pathToTable + "[//kng-button | kng-link]//kng-icon//*[@d = 'M19,13H13V19H11V13H5V11H11V5H13V11H19V13Z']/ancestor::kng-icon";
    }

    public static String getTableByValueInColumnXpath(String tableXpath, String hodnota, String stlpec) {
        return "(" + tableXpath + "//*[@title='" + hodnota + "']|" + tableXpath + "//*[starts-with(@title,'" + hodnota + "') and contains(substring-after(.,'" + hodnota + "'),'.')])/ancestor::div[@col-id='" + stlpec + "']/ancestor::div[@role='row'][not(contains(@class,'ag-row-selected'))]";
    }

    public static String getTableByValueInColumnXpathToEdit(String tableXpath, String hodnota, String stlpec) {
        return "(" + tableXpath + "//*[@title='" + hodnota + "']|" + tableXpath + "//*[starts-with(@title,'" + hodnota + "') and contains(substring-after(.,'" + hodnota + "'),'.')])/ancestor::div[@col-id='" + stlpec + "']/ancestor::div[@role='row']";
    }

    public static String getTableExactValueInColumnXpath(String tableXpath, String hodnota, String stlpec) {
        return tableXpath + "//*[@title='" + hodnota + "']/ancestor::div[@col-id='" + stlpec + "']/ancestor::div[@role='row'][not(contains(@class,'ag-row-selected'))]";
    }

    public static String getTableByValueInColumnsXpath(String tableXpath, String hodnota, String stlpec, String hodnota2, String stlpec2) {
        return tableXpath + "//div[@col-id='" + stlpec + "']/span[contains(text(),'" + hodnota + "')]/..//preceding-sibling::div[@col-id='" + stlpec2 + "']/span[contains(text(),'" + hodnota2 + "')]/ancestor::div[@role='row'][not(contains(@class,'ag-row-selected'))]";
    }

    public static String getTableColumnsBuilderXpath(String hodnota, String stlpec) {
        return "/..//following-sibling::div[@col-id='" + hodnota + "']/span[contains(text(),'" + stlpec + "')]";
    }

    public static String getKngNotificationInfoToastXpath() {
        return "//kng-notification//div[@class='notif inbox']//*[@kngtooltip='Zavrieť']";
    }

    public static String getButtonMenuAncestor() {
        return "/ancestor::div[@class='mat-menu-content']";
    }

    /**
     * @return Xpath tiered menu pod menu buttonom
     */
    public static String getTieredMenuXpath() {
        return "//div[contains(@class, 'mat-menu-content')]";
    }

    /**
     * @return String xpathu menu elementov v rozbalenom menu pod menu buttonom
     */
    public static String getMenuItem() {
        return "(//div[contains(@class,'mat-menu-content')]//a[@role='menuitem']|//div[contains(@class,'mat-menu-content')]//button[@role='menuitem'])";
    }

    public static String getComboboxDroppedMenu(String id) {
        return getInputElementXpathById("input", id) + "//parent::div//following-sibling::div/ul";
    }


    public static String getFileValidationXpath(String fileName) {
        return "//span[contains(text(),'" + fileName + "')]/parent::div/kng-icon";
    }

    public static String getZobacikXpath(String input) {
        return "//input[@id='" + input + "']//ancestor::label//following-sibling::kng-zoom-button/kng-zoom-button-custom/kng-action-bar/kng-button";
    }

    public static String getTableCheckboxEndXpath() {
        return "/ancestor::div[@role='row'][not(contains(@class,'ag-row-selected'))]";
    }

    public static String getTreeElementXpath(String nazov) {
        return "(//span[starts-with(text(),'" + nazov + "')])[last()]//ancestor::kng-tree-node[1]/li";
    }

    public static String getLookupXpath(String input) {
        return "(//input[@id='" + input + "']//ancestor::label//following-sibling::kng-zoom-button/kng-zoom-button-button//kng-button|//input[@id='" + input + "']//ancestor::label//following-sibling::kng-zoom-button/kng-zoom-button-custom//kng-button|//input[@id='" + input + "']//ancestor::label//following-sibling::kng-zoom-button/kng-zoom-button-lookup//kng-button)";
    }

    public static String getTextEditXpath(String formcontrolName) {
        return "//kng-text-edit[@formcontrolname='" + formcontrolName + "']/label[@class='kng-print-content']/div";
    }
}
