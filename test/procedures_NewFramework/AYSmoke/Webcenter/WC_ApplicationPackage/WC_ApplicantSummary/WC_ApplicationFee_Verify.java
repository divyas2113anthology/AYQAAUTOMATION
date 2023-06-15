package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ApplicationFee_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Application Fee' page")
		public void WC_ApplicationFee_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Application Fee' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String successmessage = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Application Fee' page");
			if (!pagename.equals("")) {

				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");

//				waitForElementPresentWebdriver(attributeName_xpath,"//form[@name='frmMain']/descendant::font[1]", pagename); // change xpath jun 8 2023
//				verifyElementContainsTextWebdriver(attributeName_xpath, "//form[@name='frmMain']/descendant::font[1]", pagename, "Application Fee"); // removed "Page Name for "
	}
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, successmessage);
				verifyElementContainsTextWebdriver(attributeName_xpath, QAE_Message, successmessage, "Successfully Updated");
				switchToOldWindow();

			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 1 - Verify Message("+verifyui+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, QAE_PaymentType, verifyui);
				//verifyElementContainsTextWebdriver(attributeName_xpath, QAE_PaymentType, verifyui, verifyui);
				VerifyFirstSelectedOptionWebdriver(attributeName_xpath, QAE_PaymentType, verifyui, verifyui);
			}
			//recentPopupCloseWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



