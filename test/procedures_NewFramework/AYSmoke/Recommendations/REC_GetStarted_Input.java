package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_GetStarted_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Recommend an Applicant' page")
	public void REC_GetStarted_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Recommend an Applicant' page");
		String readfulloverview = parameterValuesArray[0];
		String changeyourpassword = parameterValuesArray[1];
		String next = parameterValuesArray[2];
		Reporter.log("Input Test Data was retrieved for 'Recommend an Applicant' page");
		
		if (!readfulloverview.equals("")) {
			Reporter.log("Step 1 - Proceed to Click on link as 'Read Full Overview'");
			clickWebdriver(attributeName_partiallinktext, "Read Full Overview");		
		}
		if (!changeyourpassword.equals("")) {
			Reporter.log("Step 2 - Proceed to Click on link as 'Click here to change your password' ");
			clickWebdriver(attributeName_partiallinktext, "Click here to change your password");
			waitForElementPresentWebdriver(attributeName_xpath, CP_Update, "Update Button");
		}
		if (!next.equals("")) {
			Reporter.log("Step 3 - Proceed to Click on Next Button");
			waitForElementPresentWebdriver(attributeName_xpath, GS_NextBtn,next);
			clickWebdriver(attributeName_xpath, GS_NextBtn);		
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
