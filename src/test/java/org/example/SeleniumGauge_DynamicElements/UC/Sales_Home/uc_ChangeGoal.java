package org.example.SeleniumGauge_DynamicElements.UC.Sales_Home;

import org.example.SeleniumGauge_DynamicElements.MainClass.RBIClass;

public class uc_ChangeGoal extends RBIClass {


    public void ChangeGoal() throws Exception {
        try {
            clickMainMenu();
            clickMainMenuItem("Sales");
            delay(5);
            clickNavigationMenuItem("Home");
            clickEditField("Goal");
            setText("EUR", "3600");
            clickButton("Save");
        } catch (Exception e) {
            throw e;
        }
    }

}
