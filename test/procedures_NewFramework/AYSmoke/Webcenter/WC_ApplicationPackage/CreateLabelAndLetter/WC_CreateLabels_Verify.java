package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.CreateLabelAndLetter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_CreateLabels_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Create Label' page")
		public void WC_CreateLabels_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Create Label' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Create Label' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForText(message, "Not Present");
				verifyTextPresent(message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
//				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName, pagename, "Page Name for Run Import");
				waitForText(pagename, "Not Present");
				verifyTextPresent(pagename);
			}
			if (verifyui.equals("")) {
				Reporter.log("Step 3 - Verify the UI information in Create Label page");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



