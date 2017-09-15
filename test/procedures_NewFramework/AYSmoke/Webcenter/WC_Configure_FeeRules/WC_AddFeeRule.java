package procedures_NewFramework.AYSmoke.Webcenter.WC_Configure_FeeRules;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

/**
 * Created by Indium on 7/4/2017.
 */
public class WC_AddFeeRule extends CommonSeleniumActions implements OR {
    @Test(description="This Procedure is to perform some creation in 'Add Input Criteria' page")
    public void WC_AddFeeRule(){
        try {
            Reporter.log("This procedure is used to input add Fee rule in Application Module");
            String[] testdata = datacontainer;
            String add_button = testdata[0];
            String feerulename = testdata[1];
            String feeruledesc = testdata[2];
            String feeammount = testdata[3];
            String startdate = testdata[4];
            String enddate = testdata[5];
            String mode = testdata[6];
            String field = testdata[7];
            String operator = testdata[8];
            String value = testdata[9];




        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }
        //endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order

    }
}

