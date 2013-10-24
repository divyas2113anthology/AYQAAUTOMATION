package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_BatchPrint_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Batch Printing' page")
		public void WC_BatchPrint_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Batch Printing' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Batch Printing' page");
			if (!message.equals("")) {
//				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, "//*[contains(text(),'"+message+"')]", "Display Batch Printing Message");
				verifyElementPresentWebdriver(attributeName_xpath, "//*[contains(text(),'"+message+"')]", "Display Batch Printing Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementContainsTextWebdriver(attributeName_xpath, BP_PageName, pagename, "Page Name for Batch Printing");
			}
			if (!verifyui.equals("")) {
//				Reporter.log("Step 1 - Verify UI was displayed correctly");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



