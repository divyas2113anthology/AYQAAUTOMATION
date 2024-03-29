package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_OtherSupportingDoc_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Business Rules' page")
		public void WC_OtherSupportingDoc_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Business Rules' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Business Rules' page");
			recentPopupSelectWebdriver("Parent");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForPageToLoadWebdriver();
				waitForElementPresentWebdriver(attributeName_xpath, Ad_FormHeading, message);
				verifyElementContainsTextWebdriver(attributeName_xpath, Ad_FormHeading, message, message);
			}
			if (!pagename.equals("")) {

				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForPageToLoadWebdriver();
				String PageName[] = pagename.split(" ");
				//waitForElementPresentWebdriver(attributeName_xpath,"//font[contains(text(),'Support') and @color='white']",PageName[0]);
				//verifyElementContainsTextWebdriver(attributeName_xpath, "//font[contains(text(),'Support') and @color='white']", PageName[0], "Page Name for Package");
				waitForElementPresentWebdriver(attributeName_xpath, CSC_FormHeading+PageName[0]+"')]", PageName[0]);
				verifyElementContainsTextWebdriver(attributeName_xpath, CSC_FormHeading+PageName[0]+"')]", PageName[0], "Page Name for Package");
			}
			if (verifyui.equals("")) {
				Reporter.log("Step 3 - Verify the UI information in Application page");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

