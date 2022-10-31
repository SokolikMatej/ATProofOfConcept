package org.example.SeleniumGauge_PageObject.TC;

import com.thoughtworks.gauge.Step;
import org.example.SeleniumGauge_PageObject.UC.uc_EditSalesGoal;

public class tc_EditSalesGoal {
    @Step("EditSalesGoal")
    public void editSalesGoal() throws Exception {
        uc_EditSalesGoal editGoal = new uc_EditSalesGoal();
        editGoal.editSalesGoals();
    }
}
