package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ManageUsers_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Manage Users' page")
		public void WC_ManageUsers_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Manage Users' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Manage Users' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, "//*[contains(text(),'"+message+"')]", "Display Manage Users Message");
				verifyElementPresentWebdriver(attributeName_xpath, "//*[contains(text(),'"+message+"')]", "Display Manage Users Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, BP_PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, BP_PageName, pagename, "Page Name for Manage Users");
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
