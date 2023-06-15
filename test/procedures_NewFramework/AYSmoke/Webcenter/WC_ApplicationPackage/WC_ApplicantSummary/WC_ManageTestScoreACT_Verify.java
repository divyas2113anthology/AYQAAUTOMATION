package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;
import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import static processor.CommonSeleniumActions.writeFailure;

public class WC_ManageTestScoreACT_Verify extends CommonSeleniumActions implements OR  {
    @Test(description = "This Procedure is used to perform some input operation in 'Manage Test Score ACT' page")
    public void WC_ManageTestScoreACT_Verify() {
        try {

            writeDetails();
            String[]  fpvdatarepo = datacontainer;

            String pagename = fpvdatarepo[0];
            String successmessage = fpvdatarepo[1];

            if (!successmessage.equals("")) {
                Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
                waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, successmessage);
                verifyElementContainsTextWebdriver(attributeName_xpath, QAE_Message, successmessage, "A record has been created successfully.");

            }

            if (!pagename.equals("")) {
                Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
                String Pagename[] = pagename.split(" ");
                waitForElementPresentWebdriver(attributeName_xpath, "//font[contains(text(),'"+Pagename[0]+"')]", Pagename[0]);

                verifyElementContainsTextWebdriver(attributeName_xpath, "//font[contains(text(),'"+Pagename[0]+"')]", Pagename[0], pagename);
            }

        } catch (Exception e){

        }


    }
}






