package org.example.GaugeKing;

import com.thoughtworks.gauge.ContinueOnFailure;
import com.thoughtworks.gauge.Step;

public class tc_KontaktneUdajeAdresa {
    uc_KontaktneUdajeAdresa partnerAdresa = new uc_KontaktneUdajeAdresa();

    @ContinueOnFailure
    @Step("PAR-KontaktneUdajeAdresa-VytvorSlovenskuAdresu")
    public void vytvorSlovenskuAdresu() throws Exception {
        partnerAdresa.entryPoint();
        partnerAdresa.getData("VytvorSK");
        partnerAdresa.vytvorSlovenskuAdresu();
        partnerAdresa.getPartialCheck("Vytvorenie");
        partnerAdresa.getFinalCheck();
    }

    @ContinueOnFailure
    @Step("PAR-KontaktneUdajeAdresa-UpravAdresu")
    public void upravAdresu() throws Exception {

        partnerAdresa.entryPoint();
        partnerAdresa.getData("Uprav");
        partnerAdresa.upravAdresu();
        partnerAdresa.getPartialCheck("Uprava");
        partnerAdresa.getFinalCheck();
//        partnerAdresa.nulujPremenne();

    }

    @ContinueOnFailure
    @Step("PAR-KontaktneUdajeAdresa-VytvorZahranicnuAdresu")
    public void vytvorZahranicnuAdresu() throws Exception {

        partnerAdresa.entryPoint();
        partnerAdresa.getData("VytvorIna");
        partnerAdresa.vytvorZahranicnuAdresu();
        partnerAdresa.getPartialCheck("Vytvorenie");
        partnerAdresa.getFinalCheck();
//        partnerAdresa.nulujPremenne();
    }
}
