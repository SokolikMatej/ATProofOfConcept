package org.example.SeleniumGauge_DynamicElements.TC.Sales_Home;

import com.thoughtworks.gauge.Step;
import org.example.SeleniumGauge_DynamicElements.UC.Sales_Home.uc_ChangeGoal;

public class tc_ChangeGoal {
    uc_ChangeGoal changeGoal = new uc_ChangeGoal();


    @Step("Sales-ChangeGoal")
    public void editGoal() throws Exception {
        changeGoal.ChangeGoal();
    }

}
