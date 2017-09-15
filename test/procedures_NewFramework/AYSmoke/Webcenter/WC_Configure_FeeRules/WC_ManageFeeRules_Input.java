package procedures_NewFramework.AYSmoke.Webcenter.WC_Configure_FeeRules;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

/**
 * Created by Indium on 9/11/2017.
 */
public class WC_ManageFeeRules_Input extends CommonSeleniumActions implements OR {
    @Test(description = "This Procedure is to perform some creation in 'Add Input Criteria' page")
    public void WC_ManageFeeRules_Input() {
        try {
            Reporter.log("This procedure is used to input add Fee rule in Application Module");
            String[] testdata = datacontainer;
            String Button_addprintdelete = testdata[0];
            String Checkbox = testdata[1];
            String Linkname = testdata[2];
            String showhide = testdata[3];
            if(!Checkbox.equals(""))
            {
                Reporter.log("Step 1 - Enter the name as ["+Checkbox+"]");
                waitForElementPresentWebdriver(attributeName_xpath, FR_RuleName+Checkbox+"')]]"+FR_CheckBox, Checkbox);
                clickWebdriver(attributeName_xpath, FR_RuleName+Checkbox+"')]]"+FR_CheckBox);
            }
            if(!Linkname.equals(""))
                Reporter.log("Step 2 - Enter the name as ["+Linkname+"]");
            {

            }
            if(!showhide.equals("")) {
                Reporter.log("Step 3 - Enter the name as ["+showhide+"]");
                waitForElementPresentWebdriver(attributeName_xpath, FR_Show, showhide);
                clickWebdriver(attributeName_xpath, FR_Show);

            }

            if(!Button_addprintdelete.equals(""))
            {
                Reporter.log("Step 4 - Enter the name as ["+Button_addprintdelete+"]");
				/*waitForElementPresentWebdriver(attributeName_xpath, MCG_Package+Button_addprintdelete+"']", Button_addprintdelete);
				clickWebdriver(attributeName_xpath, MCG_Package+Button_addprintdelete+"']");*/
                if (Button_addprintdelete.equalsIgnoreCase("Add")) {
                    waitForElementPresentWebdriver(attributeName_xpath, MSR_AddBtn, Button_addprintdelete);
                    clickWebdriver(attributeName_xpath, MSR_AddBtn);
                }else if (Button_addprintdelete.equalsIgnoreCase("Back")) {
                    clickWebdriver(attributeName_xpath, MSR_BackBtn);
                }else if (Button_addprintdelete.equalsIgnoreCase("Delete")) {
                    clickWebdriver(attributeName_xpath, MSR_DeleteBtn);
                    String RuleDeleteAlertMsg = alertMessage();
                    Reporter.log("Delete Rule Alert Message : "+RuleDeleteAlertMsg);
                    alertAccept();
                    waitForPageToLoadWebdriver();
                }
            }

        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }

    }
}
