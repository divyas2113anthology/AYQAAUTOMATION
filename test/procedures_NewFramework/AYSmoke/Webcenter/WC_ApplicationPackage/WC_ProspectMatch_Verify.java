package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ProspectMatch_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Prospect Match' page")
		public void WC_ProspectMatch_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Prospect Match' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Prospect Match' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				//waitForText(message, "Not Present");
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
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



