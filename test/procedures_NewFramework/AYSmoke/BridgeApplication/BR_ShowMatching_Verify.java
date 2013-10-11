package procedures_NewFramework.AYSmoke.BridgeApplication;


import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class BR_ShowMatching_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Show Matching' page")
		public void BR_ShowMatching_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Show Matching' page");
			String[]  fpvdatarepo = datacontainer;
			String verifyui = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Show Matching' page");
			if (!verifyui.equals("")) {
				Reporter.log("Step 1 - Verify UI was displayed correctly");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, BR_PageTitle, pagename);
				verifyElementTextWebdriver(attributeName_xpath, BR_PageTitle, pagename, pagename);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}






