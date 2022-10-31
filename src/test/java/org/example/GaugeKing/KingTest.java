package org.example.GaugeKing;

import com.thoughtworks.gauge.datastore.SpecDataStore;
import org.openqa.selenium.chrome.ChromeDriver;
//import vigsk.king.test.constants.TimeoutConstants;
//import vigsk.king.test.core.*;

import java.lang.reflect.Method;
import java.util.*;

public class KingTest {
    public LinkedList<String> vyslednyReport = new LinkedList<>();
    public Map<String, String> negovaneOperacie = new HashMap<>();
//    public NavigationActions navigationActions;
    public ChromeDriver driver;
//    public AgGridActions agGridActions;
//    public UiActions uiActions;
//    public DbAccess dbAccess;
//    public WorkflowHandler workflowHandler;
//    public SupportActions supportActions;
    public ArrayList<Method> getersAndSetters;
    public Map<String, Class<?>> variables = new HashMap<>();
    public LinkedList<String> opravneniaNaMazanie = new LinkedList<>();


    public KingTest() {

        negovaneOperacie.put("==", "!=");
        negovaneOperacie.put("=", "!=");
        negovaneOperacie.put("!=", "==");
        negovaneOperacie.put("<", ">=");
        negovaneOperacie.put(">", "<=");
        negovaneOperacie.put(">=", "<");
        negovaneOperacie.put("<=", ">");
        this.driver = (ChromeDriver) SpecDataStore.get("chromeDriver");
//        this.dbAccess = (DbAccess) ScenarioDataStore.get("dbAccess");
//        this.uiActions = new UiActions(driver);
//        this.supportActions = new SupportActions(driver);
//        this.navigationActions = new NavigationActions(driver);
//        this.workflowHandler = new WorkflowHandler(driver);
//        this.agGridActions = new AgGridActions(driver);
//        getersAndSetters = SupportActions.findGettersAndSetters(this.getClass());
//        this.environmentFork = new EnvironmentFork();
        Class<?> tmpClass = this.getClass();
        int saveNet = 0;
        while (!tmpClass.isInstance(KingTest.class) && saveNet < 80) {
            saveNet++;
            Class<?> finalTmpClass = tmpClass;
            Arrays.asList(tmpClass.getDeclaredFields()).forEach(x -> this.variables.put(x.getName(), finalTmpClass));
            tmpClass = tmpClass.getSuperclass();
        }
    }

    /**
     * Vlozi text do elementu<br>
     * <img src = "../docFiles/input_name.png" style="align:left" >
     *
     * @param element      Element do koreho sa zada text
     * @param text         Text ktory chceme zadat
     * @param whatToExpect Jedná sa o OPTIONAL parameter. Súvisí so spôsobom ako sa bude čakať na element Defaultne sa nastavuje na 0, true true <br>
     *                     <ul>
     *                     <li>Prvý parameter je čas čakania:
     *                     <ul>
     *                     <li>0 - {@value TimeoutConstants#MAX_SHORT_LOADING_TIME} sekúnd </li>
     *                     <li>1 - {@value TimeoutConstants#MAX_LONG_LOADING_TIME} sekúnd</li>
     *                     <li>2 - {@value TimeoutConstants#MAX_BACKGROUNDJOB_TIME} sekúnd</li>
     *                     </ul>
     *                     </li>
     *                     <li>Druhý je čakanie na progress:
     *                     <ul>
     *                     <li>true</li>
     *                     <li>false</li>
     *                     </ul>
     *                     </li>
     *                     <li> Tretí je kontrola business erroru:
     *                     <ul>
     *                     <li>true</li>
     *                     <li>false</li>
     *                     </ul>
     *                     </li>
     *                     </ul>
     */
//    public void setText(final WebElementWithXpath element, final String text, final Object... whatToExpect) throws Exception {
//        try {
//            workflowHandler.logSingleMessage("Sending text " + text + "to input " + element.getXpath());
//            navigationActions.zamerajElementPredAkciou(element, whatToExpect);
//            uiActions.clearAndSetTextBezKontroly(element, text, whatToExpect);
//        } catch (final Exception e) {
//            throw new Exception(e.getMessage() + "\n Chyba pri setText KingClass");
//        }
//    }

}
