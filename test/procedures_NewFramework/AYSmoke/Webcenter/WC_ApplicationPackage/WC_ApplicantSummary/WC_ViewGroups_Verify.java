package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ViewGroups_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Applicant Summary' page")
		public void WC_ViewGroups_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Applicant Summary' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String message = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Applicant Summary' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, AS_ViewGroups, pagename);
				verifyElementPresentWebdriver(attributeName_xpath, AS_ViewGroups, pagename);
				
			}
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message as ("+message+") page");
				//waitForElementPresentWebdriver(attributeName_xpath, PS_HobsonsAuthMessage, pagename);
				//verifyElementPresentWebdriver(attributeName_xpath, PS_HobsonsAuthMessage, pagename);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
