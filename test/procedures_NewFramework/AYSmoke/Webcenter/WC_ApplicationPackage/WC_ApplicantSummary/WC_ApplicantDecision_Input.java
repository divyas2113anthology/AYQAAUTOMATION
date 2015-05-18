package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ApplicantDecision_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Applicant Decision' page")
	
	public void WC_ApplicantDecision_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Decision'Page");
			String[] testdata = datacontainer;
			String printclosewindow = testdata[0];
			
			if (!printclosewindow.equals("")) {
				Reporter.log("Click ("+printclosewindow+")button");
				clickWebdriver(attributeName_xpath, AS_PrintCloseWindow+printclosewindow+"')]");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}

