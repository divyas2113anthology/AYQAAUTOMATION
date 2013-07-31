package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class CreditCardPayment_Input extends CommonSeleniumActions implements	OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Credit Card Payment' page")
	public void CreditCardPayment_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Credit Card Payment' page");
			String[]  appstatusidatarepo = datacontainer;
			String pagename = appstatusidatarepo[0];
			String cancel = appstatusidatarepo[1];
			String status = appstatusidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Credit Card Payment' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify the page name as ("+pagename+")");
				waitForText(pagename, "Creditcard Page");
				verifyTextPresent(pagename);
			}		
			if (!cancel.equals("")) {
				Reporter.log("Step 2 - Proceed to click on ("+cancel+") Button");
				waitForElementPresentWebdriver(attributeName_xpath, NP_Cancel, cancel);
				clickWebdriver(attributeName_xpath, NP_Cancel);
			}		
			if (!status.equals("")) {
				Reporter.log("Step 3 - Verify the status as ("+status+")");
				waitForText(status, "Sucessfully Submitted");
				verifyTextPresent(status);
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}

