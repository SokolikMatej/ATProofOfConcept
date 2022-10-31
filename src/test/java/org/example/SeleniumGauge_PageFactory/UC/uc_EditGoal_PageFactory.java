package org.example.SeleniumGauge_PageFactory.UC;

import com.thoughtworks.gauge.datastore.SpecDataStore;
import org.example.SeleniumGauge_DynamicElements.StaticVariables.SpecVariables;
import org.example.SeleniumGauge_PageFactory.Pages.MainPage;
import org.openqa.selenium.chrome.ChromeDriver;

public class uc_EditGoal_PageFactory {

    public void editGoal() throws Exception {
        MainPage editGoal_PageFactory = new MainPage((ChromeDriver) SpecDataStore.get(SpecVariables.CHROME_DRIVER), null);

        editGoal_PageFactory.filterSales()
                .openSalesHome()
                .editGoal("985");
    }
}
