package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.EnrModuleEnrollApplicantSearchActions;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EnrollmentSearchResults_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Manage Choice Groups' page")
	
	public void WC_EnrollmentSearchResults_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Manage Choice Groups'Page");
			
			String[] testdata = datacontainer;
			String message = testdata[0];
			String page = testdata[1];
			String ui = testdata[2];
			
			if(!page.equals("")){
				Reporter.log("Verify its navigate to ("+page+") page");
				waitForElementPresentWebdriver(attributeName_xpath, EDT_Page, page);
				verifyElementPresentWebdriver(attributeName_xpath, EDT_Page, page);
			}
		
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}

