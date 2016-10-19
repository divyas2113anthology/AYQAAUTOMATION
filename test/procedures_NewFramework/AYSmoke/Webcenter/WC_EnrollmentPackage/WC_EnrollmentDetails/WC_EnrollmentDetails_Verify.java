package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.WC_EnrollmentDetails;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_EnrollmentDetails_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Enrollment Details' page")
		public void WC_EnrollmentDetails_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Enrollment Details' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String ui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Enrollment Details' page");
			if (!message.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='divAyConfirmation']/font", message);
				verifyElementContainsTextWebdriver(attributeName_xpath, "//div[@id='divAyConfirmation']/font", message, "Success Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				//waitForText(pagename, "Page Name");
				waitForPageToLoadWebdriver();
				writeConsole(pagename);
			}
			if (!ui.equals("")) {
				Reporter.log("Step 3 - Verify UI in the 'Enrollment Details' page");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

