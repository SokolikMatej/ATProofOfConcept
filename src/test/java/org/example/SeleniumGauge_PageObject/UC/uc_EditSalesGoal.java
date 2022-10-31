package org.example.SeleniumGauge_PageObject.UC;

import com.thoughtworks.gauge.datastore.SpecDataStore;
import org.example.SeleniumGauge_DynamicElements.StaticVariables.SpecVariables;
import org.example.SeleniumGauge_PageObject.Pages.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class uc_EditSalesGoal {
    public void editSalesGoals() throws Exception {
        MainPage editGoal = new MainPage((ChromeDriver) SpecDataStore.get(SpecVariables.CHROME_DRIVER), null);
        editGoal.FilterSales()
                .openSalesHome()
                .editGoal("500");
    }


}
