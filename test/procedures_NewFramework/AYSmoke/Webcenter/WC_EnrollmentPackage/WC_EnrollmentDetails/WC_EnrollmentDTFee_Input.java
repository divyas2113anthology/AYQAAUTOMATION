package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.WC_EnrollmentDetails;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EnrollmentDTFee_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Enrollment DT Fee' page")
	
	public void WC_EnrollmentDTFee_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment DT Fee'Page");
			
			String[] testdata = datacontainer;
			String paymenttype = testdata[0];
			String paymentstatus = testdata[1];
			String paymentamountreceived = testdata[2];
			String paymentreceiveddate = testdata[3];
			String backcloseprintsave =testdata[4];
						
			if(!paymentstatus.equals("")){
				Reporter.log("Verify("+paymentstatus+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, EDT_PaymentStatus, paymentstatus);
				verifyElementContainsTextWebdriver(attributeName_xpath, EDT_PaymentStatus, paymentstatus, paymentstatus);
			}
			
			if(!backcloseprintsave.equals("")){
				Reporter.log("Click on the Button"+backcloseprintsave);
				clickWebdriver(attributeName_xpath, EDT_ButtontoClick+backcloseprintsave+"')]");
			}		
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}
