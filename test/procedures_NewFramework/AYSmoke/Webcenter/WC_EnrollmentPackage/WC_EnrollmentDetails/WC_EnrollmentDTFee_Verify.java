package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.WC_EnrollmentDetails;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EnrollmentDTFee_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Enrollment DT Fee' page")
	
	public void WC_EnrollmentDTFee_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Enrollment DT Fee'Page");
			
			String[] testdata = datacontainer;
			String pagename = testdata[0];
			
			if(!pagename.equals("")){
				Reporter.log("Verify its navigate to ("+pagename+") page");
				String PageName[] = pagename.split(" ");
				waitForElementPresentWebdriver(attributeName_xpath, EDT_PageName+PageName[0]+"')]", pagename);
				verifyElementPresentWebdriver(attributeName_xpath, EDT_PageName+PageName[0]+"')]", pagename);
			}
			
	
			
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}

