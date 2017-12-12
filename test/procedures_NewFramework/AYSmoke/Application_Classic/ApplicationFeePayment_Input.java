package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
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
					checkWebdriver(attributeName_xpath,AF_Domestic);
				}else if (feereviewappfee.equalsIgnoreCase("International")) {
					checkWebdriver(attributeName_xpath,AF_International);
				}
			}
			if (!feepaymentmethod.equals("")) {
				Reporter.log("Step 2 - Proceed to Check ("+feepaymentmethod+") Select Payment Method Radio");
				if (feepaymentmethod.equalsIgnoreCase("Check")) {
					checkWebdriver(attributeName_xpath,AF_Check);
				}else if (feepaymentmethod.equalsIgnoreCase("Fee Waiver")) {
					checkWebdriver(attributeName_xpath,AF_FeeWaiver);
				}else if (feepaymentmethod.equalsIgnoreCase("Credit Card")) {
					checkWebdriver(attributeName_xpath,AF_CreditCard);
				}			
			}
			if (!feepaycontinue.equals("")) {
				Reporter.log("Step 3 - Click on ("+feepaycontinue+") Button");
				waitForElementPresentWebdriver(attributeName_xpath, AF_PayContinue, "Pay & Continue Button");
				clickWebdriver(attributeName_xpath, AF_PayContinue);
				alertAccept();
//				if (feepaycontinue.equalsIgnoreCase("pay & continue")) {
//					clickchooseokgetconfirmationpagepload(AF_PayContinue);
//				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
