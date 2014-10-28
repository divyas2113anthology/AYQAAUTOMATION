package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ViewHistory_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Applicant Summary' page")
		public void WC_ViewHistory_Verify() throws Exception{
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
				waitForElementPresentWebdriver(attributeName_xpath, AS_ViewHistory, pagename);
				verifyElementPresentWebdriver(attributeName_xpath, AS_ViewHistory, pagename);
				
			}
			if (!message.equals("")) {
				
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
