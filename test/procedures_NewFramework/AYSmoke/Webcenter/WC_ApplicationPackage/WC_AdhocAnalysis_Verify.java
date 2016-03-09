package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AdhocAnalysis_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Adhoc Analysis' page")
		public void WC_AdhocAnalysis_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Adhoc Analysis' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Adhoc Analysis' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, Ad_FormHeading, message);
				verifyElementContainsTextWebdriver(attributeName_xpath, Ad_FormHeading, message, message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, Ad_PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, Ad_PageName, pagename, "Page Name for Package");
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 3 - Verify the UI information in Add Import page");
				waitForElementPresentWebdriverWait(attributeName_xpath, Ad_CustomReport+verifyui+"')]", verifyui);
				verifyElementContainsTextWebdriver(attributeName_xpath, Ad_CustomReport+verifyui+"')]", verifyui, verifyui);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


