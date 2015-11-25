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
			System.out.println("sdfsffsfsfsdfsdfsfsdsdfsd");
			if (!appreviewstatus.equals("")) {
				
			}
			if (!submit.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath, AR_AssignReadyforReviewStatusSubmit, submit);
				clickWebdriver(attributeName_xpath, AR_AssignReadyforReviewStatusSubmit);
				
			}
			if (!back.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath, AR_AssignReadyforReviewStatusBack, back);
				clickWebdriver(attributeName_xpath, AR_AssignReadyforReviewStatusBack);
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
}
