package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_AssignReadyforReviewStatus_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Assign Ready for Review Status' page")
		public void WC_AssignReadyforReviewStatus_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Assign Ready for Review Status' page");
			String[]  fpvdatarepo = datacontainer;
			String verifyui = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Assign Ready for Review Status' page");
			if (!verifyui.equals("")) {
				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, AS_AppReviewStatus+pagename+"')]", pagename);
				//waitForElementPresentVerifyContainsTextWebdriver(attributename, attributevalue, expectedtext, elementname);
				verifyElementPresentWebdriver(attributeName_xpath, AS_AppReviewStatus+pagename+"')]", pagename);
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
