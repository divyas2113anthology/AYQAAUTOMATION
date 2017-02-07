package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class ApplicationStatus_Input extends CommonSeleniumActions implements	OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Application Status: Ready for Submission' page")
	public void ApplicationStatus_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Application Status: Ready for Submission' page");
			String[]  appstatusidatarepo = datacontainer;
			String stapriviewappl = appstatusidatarepo[0];
			String stasubmissioncomplete = appstatusidatarepo[1];
			String stacontinue = appstatusidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Application Status: Ready for Submission' page");
			if (!stapriviewappl.equals("")) {
				Reporter.log("Step 1 - Click on ("+stapriviewappl+") Link");
//				click(AS_PreviewApp);
				waitForElementPresentWebdriver(attributeName_xpath, AW_PrintPreviewPdfBtn, "Print Preview Button");
				clickWebdriver(attributeName_xpath, AW_PrintPreviewPdfBtn);
//				SelectPrintWindow("PrintApplication");
				recentPopupSelectWebdriver("Print Pdf");
			}		
			if (!stasubmissioncomplete.equals("")) {
				Reporter.log("Step 2 - Proceed to ("+stasubmissioncomplete+") Submission Complete! Checkbox");
				if (stasubmissioncomplete.equalsIgnoreCase("Check")) {
					checkWebdriver(attributeName_xpath,AS_Submissioncomplete);
				}else if (stasubmissioncomplete.equalsIgnoreCase("Uncheck")) {
					uncheckWebdriver(attributeName_xpath,AS_Submissioncomplete);
				}
			}		
			if (!stacontinue.equals("")) {
				Reporter.log("Step 3 - Click on ("+stacontinue+") Button ");
//				click(AS_Continue);
				clickWebdriver(attributeName_xpath, AS_Continue);
				waitForPageToLoadWebdriver();
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
