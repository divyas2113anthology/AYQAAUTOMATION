package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.WC_EnrollmentDetails;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

import java.util.Iterator;

public class WC_EnrollmentDTFee_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Enrollment DT Fee' page")
	
	public void WC_EnrollmentDTFee_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment DT Fee'Page");
			
			String[] testdata = datacontainer;
			String paymenttype = testdata[0];
			String verifypaymentstatus = testdata[1];
			String paymentstatus = testdata[2];
			String paymentamountreceived = testdata[3];
			String paymentreceiveddate = testdata[4];
			String backcloseprintsave = testdata[5];
						
			if(!verifypaymentstatus.equals("")){
				Reporter.log("Verify("+verifypaymentstatus+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, EDT_VerifyPaymentStatus+verifypaymentstatus+"')]", verifypaymentstatus);
				verifyElementContainsTextWebdriver(attributeName_xpath, EDT_VerifyPaymentStatus+verifypaymentstatus+"')]", verifypaymentstatus, verifypaymentstatus);
			}
			if (!paymentstatus.equals("")) {
				Reporter.log("Select the payment status as ["+paymentstatus+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, EDT_PaymentStatus , paymentstatus);
			}
			if(!backcloseprintsave.equals("")){
				Reporter.log("Click on the Button"+backcloseprintsave);
				//clickWebdriver(attributeName_xpath, EDT_ButtontoClick+backcloseprintsave+"')]");
				switchToOldWindow();
			}		
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}
