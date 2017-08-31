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
    public void WC_AddFeeRule() throws Exception{
        try {
            Reporter.log("This procedure is used to input add Fee rule in Application Module");
            String[] testdata = datacontainer;


        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }
        //endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order

    }
}

