package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class ApplicationFeePayment_Input extends CommonSeleniumActions	implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Application Fee Payment' page")
	public void ApplicationFeePayment_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationFeePayment_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Application Fee Payment' page");
			String[]  appfeeidatarepo = datacontainer;
			String feereviewappfee = appfeeidatarepo[0];
			String feepaymentmethod = appfeeidatarepo[1];
			String feepaycontinue = appfeeidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Application Fee Payment' page");
			if (!feereviewappfee.equals("")) {
				Reporter.log("Step 1 - Proceed to Check ("+feereviewappfee+") Review Application Fee Radio");
				if (feereviewappfee.equalsIgnoreCase("Domestic")) {
					check(AF_Domestic);				
				}else if (feereviewappfee.equalsIgnoreCase("International")) {
					check(AF_International);
				}
			}
			if (!feepaymentmethod.equals("")) {
				Reporter.log("Step 2 - Proceed to Check ("+feepaymentmethod+") Select Payment Method Radio");
				if (feepaymentmethod.equalsIgnoreCase("Check")) {
					check(AF_Check);
				}else if (feepaymentmethod.equalsIgnoreCase("Fee Waiver")) {
					check(AF_FeeWaiver);				
				}else if (feepaymentmethod.equalsIgnoreCase("Credit Card")) {
					check(AF_CreditCard);
				}			
			}
			if (!feepaycontinue.equals("")) {
				Reporter.log("Step 3 - Click on ("+feepaycontinue+") Button");
				waitForElementPresentWebdriver(attributeName_xpath, AF_PayContinue, "Pay & Continue Button");
				clickWebdriver(attributeName_xpath, AF_PayContinue);
//				alertAccept();
//				if (feepaycontinue.equalsIgnoreCase("pay & continue")) {
//					clickchooseokgetconfirmationpagepload(AF_PayContinue);
//				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
