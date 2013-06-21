package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.SelectanAction;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_RunExportResults_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Run Export Results' page")
		public void WC_RunExportResults_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Run Export Results' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];

			Reporter.log("Verify Test Data was retrieved for 'Run Export Results' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, SAV_PageName, pagename);
				verifyElementTextWebdriver(attributeName_xpath, SAV_PageName, pagename, "Page Name for Applicant Summary");
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 1 - Verify UI was displayed correctly");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



