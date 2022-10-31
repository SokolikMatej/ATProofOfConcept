package org.example.GaugeKing;

import com.thoughtworks.gauge.datastore.SpecDataStore;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class uc_KontaktneUdajeAdresa extends KingTest {
    public String Partner_id = "initialString";
    public String TypAdresy = "initialString";
    public String Ulica = "initialString";
    public String PSC = "initialString";
    public String Objekt = "initialString";
    public String Stat = "initialString";
    public String Cislo = "initialString";
    public String Mesto = "initialString";
    public String Adresa = "initialString";
    public ChromeDriver driver = (ChromeDriver) SpecDataStore.get("ChromeDriver");

    //Kontroln� premenn�
    public String TypAdresyKon = "initialString";
    public String UlicaKon = "initialString";
    public String PSCKon = "initialString";
    public String ObjektKon = "initialString";
    public String StatKon = "initialString";
    public String CisloKon = "initialString";
    public String MestoKon = "initialString";
    public String AdresaKon = "initialString";

    public void entryPoint() throws IllegalAccessException {
        try {
            System.out.println("element");
            driver.findElement(By.xpath("//a[@title='Leads']/..")).click();
//            navigateToUrl(environmentFork.getUrl());
//
//            clickBreadcrumb("KING.SK");
//
//            clickDlazdice("Partneri");
//            clickDlazdice("Partneri");

        } catch (Exception e) {
            System.out.println(e);
//            workflowHandler.logTestDataAndContinue(this, e);
        }
    }

    public void getData(String nazovVarianty) throws IllegalAccessException {
        try {

            if (
                //        isInitialString(this.Partner_id)
                    true) {
//                executeQuery("SELECT TOP (1) Partner_ID AS Partner_id, \n" +
//                        "               Adr_no AS Adresa\n" +
//                        "FROM Pa_Adresa WITH(NOLOCK)\n" +
//                        "WHERE Partner_id IN\n" +
//                        "(\n" +
//                        "    SELECT TOP (100) adr.Partner_ID\n" +
//                        "    FROM Pa_Adresa adr WITH(NOLOCK)\n" +
//                        "         LEFT JOIN Partner par ON adr.Partner_ID = par.Partner_ID\n" +
//                        "    WHERE adr.Partner_id > 500000\n" +
//                        "          AND AdrTyp_ID = 'T'\n" +
//                        "\t\t  AND adr.PSC_ID NOT LIKE '00000'\n" +
//                        "          AND par.STATUS IS NULL\n" +
//                        ")\n" +
//                        " AND AdrTyp_ID != 'A' " +
//                        "ORDER BY NEWID();");
            }

            switch (nazovVarianty) {
                case "VytvorSK":
//                    executeQuery("select top(1) AdrTyp_txt as TypAdresy from No_AdrTyp with(nolock) where AdrTyp_ID not in ('T','ADR') order by newid()");
//                    executeQuery("select top(1) PSC_ID as PSC from No_PSC_SK_Posta a with(nolock) where Is_POBOX =0  and (select count(1) from no_psc_sk_obce with(nolock) where psc_id = a.PSC_ID ) > 1 and PSC_ID not in ('7400787','1352437') order by newid()");
//                    setVariableValue("Ulica", "Testerska");
//                    setVariableValue("Objekt", "Testersky");
//                    setVariableValue("Cislo", "25");
//                    setVariableValue("Stat", "SK");
//                    executeQuery("select top(1) dobec as Mesto ,PSC_ID from no_psc_sk_obce with(nolock) where psc_id = " + this.PSC + " group by PSC_ID,dobec order by newid()");
                    break;

                case "VytvorIna":
//                    executeQuery("select top(1) AdrTyp_txt as TypAdresy from No_AdrTyp with(nolock) where AdrTyp_ID != 'T' order by newid()");
//                    executeQuery("select top(1) Stat_id as Stat from no_psc with(nolock) where Stat_id not in('##','SK') group by stat_id order by newid()");
//                    setVariableValue("PSC", getRandomNumber(7)); //generujNahodneCislo(7) @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//                    setVariableValue("Cislo", "25");
//                    setVariableValue("Mesto", "Testovo");
//                    setVariableValue("Ulica", "Testerska");
//                    setVariableValue("Objekt", "Testersky");
                    break;

                case "Uprav":
//                    executeQuery("select top(1) AdrTyp_txt as TypAdresy from No_AdrTyp with(nolock) where AdrTyp_ID != 'T' order by newid()");
//                    executeQuery("select top(1) PSC_ID as PSC from No_PSC_SK_Posta a with(nolock) where Is_POBOX =0  and (select count(1) from no_psc_sk_obce with(nolock) where psc_id = a.PSC_ID ) > 1 order by newid()");
//                    setVariableValue("Ulica", "Testerska");
//                    setVariableValue("Objekt", "Testersky");
//                    executeQuery("select top(1) dobec as Mesto,PSC_ID from no_psc_sk_obce with(nolock) where psc_id = " + this.PSC + " group by PSC_ID,dobec order by newid()");
//                    setVariableValue("Cislo", "25");
//                    setVariableValue("Stat", "SK");
                    break;
            }
        } catch (Exception e) {
//            workflowHandler.logTestDataAndContinue(this, e);
        }
    }


    public void vytvorSlovenskuAdresu() throws IllegalAccessException {
        try {
//            setText("partneriPrehladFilter.PartnerId", this.Partner_id);
//
//            clickFiltrovat("partneriPrehladFilter");
//
//            tableActionOnRow("Partneri_Prehlad_Datatable", "PartnerId", this.Partner_id, "magnify");
//
//            clickTableMagnifyButton("Detail partnera");
//
//            tableAddNewEntry("partnerDetailAdresy");
//
//            setText("adresaDataForm.AdrTypId", "T. Trval�");
//
//            setText("adresaDataForm.StatId", this.Stat);
//
//            setText("adresaDataForm.Ulica", this.Ulica);
//
//            setText("adresaDataForm.Cislo", this.Cislo);
//
//            setText("adresaDataForm.Psc", this.PSC);
//
//            setText("adresaDataForm.CastObce", this.Mesto);
//
//            setText("adresaDataForm.Objekt", this.Objekt);
//
//            clickModalUlozit(1, false, false);
//
//            clickToastClose(1, false, false);
//
//            setText("adresaDataForm.AdrTypId", this.TypAdresy);
//
//            clickModalUlozit(1, false, false);
//
//            clickToastClose("Z�znam bol ulo?en�.");
        } catch (Exception e) {
//            workflowHandler.logTestDataAndContinue(this, e);
        }
    }

    public void vytvorSlovenskuAdresuData() throws IllegalAccessException {
        try {
//            setText("partneriPrehladFilter.PartnerId", this.Partner_id);
//
//            clickFiltrovat("partneriPrehladFilter");
//
//            tableActionOnRow("Partneri_Prehlad_Datatable", "PartnerId", this.Partner_id, "magnify");
//
//            clickTableMagnifyButton("Detail partnera");
//
//            tableAddNewEntry("partnerDetailAdresy");
//
//            setText("adresaDataForm.AdrTypId", this.TypAdresy);
//
//            setText("adresaDataForm.StatId", this.Stat);
//
//            setText("adresaDataForm.Psc", this.PSC);
//
//            setText("adresaDataForm.Ulica", this.Ulica);
//
//            setText("adresaDataForm.Cislo", this.Cislo);
//
//            setText("adresaDataForm.CastObce", this.Mesto);
//
//            setText("adresaDataForm.Objekt", this.Objekt);
//
//            clickModalUlozit(1, false, false);
//
//            clickToastClose("Z�znam bol ulo?en�.");
        } catch (Exception e) {
//            workflowHandler.logTestDataAndContinue(this, e);
        }
    }

    public void vytvorZahranicnuAdresu() throws IllegalAccessException {
        try {
//            setText("partneriPrehladFilter.PartnerId", this.Partner_id);
//
//            clickFiltrovat("partneriPrehladFilter");
//
//            tableActionOnRow("Partneri_Prehlad_Datatable", "PartnerId", this.Partner_id, "magnify");
//
//            clickTableMagnifyButton("Detail partnera");
//
//            tableAddNewEntry("partnerDetailAdresy");
//
//            setText("adresaDataForm.AdrTypId", this.TypAdresy);
//
//            setText("adresaDataForm.StatId", this.Stat);
//
//            setText("adresaDataForm.Ulica", this.Ulica);
//
//            setText("adresaDataForm.Cislo", this.Cislo);
//
//            click(elementByXpath("//kng-combobox//kng-zoom-button//kng-zoom-button-custom"));
//
//            setText("pscDialogForm.psc", this.PSC);
//
//            setText("pscDialogForm.mesto", this.Mesto);
//
//            clickModalUlozit();
//
//            setText("adresaDataForm.Objekt", this.Objekt);
//
//            clickModalUlozit(1, false, false);
//
//            clickToastClose("Z�znam bol ulo?en�.");
        } catch (Exception e) {
//            workflowHandler.logTestDataAndContinue(this, e);
        }
    }

    public void upravAdresu() throws IllegalAccessException {
        try {
//            setText("partneriPrehladFilter.PartnerId", this.Partner_id);
//
//            clickFiltrovat("partneriPrehladFilter");
//
//            tableActionOnRow("Partneri_Prehlad_Datatable", "PartnerId", this.Partner_id, "magnify");
//
//            clickTableMagnifyButton("Detail partnera");
//
//            tableActionTableKey("partnerDetailAdresy", this.Adresa, "edit");
//
//            setText("adresaDataForm.AdrTypId", this.TypAdresy);
//
//            setText("adresaDataForm.Ulica", this.Ulica);
//
//            setText("adresaDataForm.StatId", this.Stat);
//
//            setText("adresaDataForm.Psc", this.PSC);
//
//            setText("adresaDataForm.CastObce", this.Mesto);
//
//            setText("adresaDataForm.Objekt", this.Objekt);
//
//            setText("adresaDataForm.Cislo", this.Cislo);
//
//            clickModalUlozit(1, false, false);
//
//            clickToastClose("Z�znam bol ulo?en�.");

        } catch (Exception e) {
//            workflowHandler.logTestDataAndContinue(this, e);
        }
    }

    public void getPartialCheck(String nazovVariantu) throws IllegalAccessException {
        try {

            switch (nazovVariantu) {
                case "Vytvorenie":
//                    executeQuery("select (select AdrTyp_txt from No_AdrTyp with(nolock) where AdrTyp_ID = a.AdrTyp_ID) as TypAdresyKon,Stat_ID as StatKon,PSC_ID as PSCKon,Objekt as ObjektKon,Dom_No as CisloKon,Ulica_txt as UlicaKon,Cast_obce as MestoKon from Pa_Adresa a with (nolock) where Partner_ID = " + this.Partner_id + " and Adr_No = (select max(Adr_No) from Pa_Adresa with(nolock) where Partner_ID = " + this.Partner_id + ")");
                    break;

                case "Uprava":
//                    executeQuery("select (select AdrTyp_txt from No_AdrTyp with(nolock) where AdrTyp_ID = a.AdrTyp_ID) as TypAdresyKon,Stat_ID as StatKon,PSC_ID as PSCKon,Objekt as ObjektKon,Dom_No as CisloKon,Ulica_txt as UlicaKon,Cast_obce as MestoKon from Pa_Adresa a with (nolock) where Partner_ID = " + this.Partner_id + " and Adr_No = " + this.Adresa);
                    break;
            }
        } catch (Exception e) {
//            workflowHandler.logTestDataAndContinue(this, e);
        }
    }


    public void getFinalCheck() throws IllegalAccessException {
        try {
//            partialCheck(this.TypAdresy, "==", this.TypAdresyKon);
//            partialCheck(this.Stat, "==", this.StatKon);
//            partialCheck(this.PSC, "==", this.PSCKon);
//            partialCheck(this.Objekt, "==", this.ObjektKon);
//            partialCheck(this.Cislo, "==", this.CisloKon);
//            partialCheck(this.Ulica.toUpperCase(), "==", this.UlicaKon);
//            finalCheck();
        } catch (Exception e) {
//            workflowHandler.logTestDataAndContinue(this, e);
        }

    }
}
