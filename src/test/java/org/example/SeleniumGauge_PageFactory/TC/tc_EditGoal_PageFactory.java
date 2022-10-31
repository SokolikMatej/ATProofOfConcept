package org.example.SeleniumGauge_PageFactory.TC;

import com.thoughtworks.gauge.Step;
import org.example.SeleniumGauge_PageFactory.UC.uc_EditGoal_PageFactory;

public class tc_EditGoal_PageFactory {

    @Step("EditGoal_PageFactory")
    public void editwithPageFacotry() throws Exception {
        uc_EditGoal_PageFactory editPageFactory = new uc_EditGoal_PageFactory();
        editPageFactory.editGoal();
    }
}
