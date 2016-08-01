package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.AppModuleApplicantSearchActions;

import org.openqa.selenium.remote.server.handler.SwitchToWindow;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ApplicantSearchResults_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Applicant Search Results' page")
		public void WC_ApplicantSearchResults_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Applicant Search Results' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Applicant Search Results' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
//				waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, successmessage);
//				verifyElementPresentWebdriver(attributeName_xpath, QAE_Message, successmessage);
				waitForText(successmessage, successmessage);
				verifyTextPresent(successmessage);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				/*waitForElementPresentWebdriver(attributeName_xpath, ASR_Pagename, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, ASR_Pagename, pagename, "Page Name for Applicant Search Results");*/
				waitForElementPresentWebdriver(attributeName_xpath, SAV_PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, SAV_PageName, pagename, pagename);
				
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 3 - Verify UI was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, ASR_SearchColumn, verifyui);
				System.out.println(getTextWebdriver(attributeName_xpath, ASR_SearchColumn));
				verifyElementContainsTextWebdriver(attributeName_xpath, ASR_SearchColumn, verifyui, "Page Name for Applicant Search Results");
			}
			deselectPopUp();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


