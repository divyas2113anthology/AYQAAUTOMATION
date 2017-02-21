package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.SelectanAction;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_RunReportResults_Verify extends CommonSeleniumActions implements OR {


	@Test(description="This Procedure is to perform some Verification in 'Run Report Results' page")
	public void WC_RunReportResults_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Run Report Results' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Run Report Results' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForPageToLoadWebdriver();
				writeConsole(message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				String PageName[] = pagename.split(":");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName+PageName[0].trim()+"')]", pagename, "Page Name for Run Import");
			}

			if (verifyui.equals("")) {
				Reporter.log("Step 3 - Verify the UI information in Add Import page");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_Success+verifyui+"')]", verifyui, verifyui);
				
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
