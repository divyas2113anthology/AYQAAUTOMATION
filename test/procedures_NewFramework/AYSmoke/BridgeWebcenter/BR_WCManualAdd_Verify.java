package procedures_NewFramework.AYSmoke.BridgeWebcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class BR_WCManualAdd_Verify extends CommonSeleniumActions implements OR {
	

	private String pagename;

	@Test(description="This Procedure is to perform some Verification in 'Account Profile' page")
		public void BR_WCManualAdd_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Account Profile' page");
			String[]  fpvdatarepo = datacontainer;
			String verifyui = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String message = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Account Profile' page");
			if (!verifyui.equals("")) {
				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, "//b[contains(text(),'"+pagename+"')]", pagename);
				verifyElementPresentWebdriver(attributeName_xpath, "//b[contains(text(),'"+pagename+"')]", pagename);
			}
			if (!message.equals("")) {
				
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



