package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ApplicantDecision_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Applicant Summary' page")
	public void WC_ApplicantDecision_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Manage Choice Groups'Page");
			
			String[] testdata = datacontainer;
			String message = testdata[0];
			
			
			if(!message.equals("")){
				Reporter.log("Verify the message is present");
				waitForElementPresentWebdriver(attributeName_xpath, AS_ApplicantDecision+message+"')]", message);
				verifyElementPresentWebdriver(attributeName_xpath, AS_ApplicantDecision+message+"')]", message);
			}
	
			
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}