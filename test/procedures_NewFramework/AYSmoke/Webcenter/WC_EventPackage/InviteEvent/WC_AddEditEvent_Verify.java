package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.InviteEvent;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddEditEvent_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Add/Edit Event' page")
		public void WC_AddEditEvent_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Add/Edit Event' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];

			Reporter.log("Verify Test Data was retrieved for 'Add/Edit Event' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				waitForPageToLoadWebdriver();
				waitForElementPresentWebdriver(attributeName_xpath, AEV_SuccessMsg, successmessage);
				verifyElementContainsTextWebdriver(attributeName_xpath, AEV_SuccessMsg, successmessage, "Success Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementTextWebdriver(attributeName_xpath, SAV_PageName, pagename, "Page Name for Search For Applicant");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


