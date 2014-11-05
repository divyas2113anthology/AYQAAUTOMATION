package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_AssignReadyforReviewStatus_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some input operation in 'Assign Ready for Review Status' page")
		public void WC_AssignReadyforReviewStatus_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Assign Ready for Review Status' page");
			String[]  fpvdatarepo = datacontainer;
			String submit = fpvdatarepo[0];
			String back = fpvdatarepo[1];
			String appreviewstatus = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Assign Ready for Review Status' page");
			if (!appreviewstatus.equals("")) {
				
			}
			if (!submit.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath, AS_StatusSubmit, submit);
				clickWebdriver(attributeName_xpath, AS_StatusSubmit);
				
			}
			if (!back.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath, AS_StatusBack, back);
				clickWebdriver(attributeName_xpath, AS_StatusBack);
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
}
