package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class UpdateProfile_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Update Profile' page")
	public void UpdateProfile_Verify() throws Exception{
		try {
		writeDetails();
//		headerStatement("UpdateProfile_Verify");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Verify Test Data 'Update Profile' page");
		String[]  updateprovdatarepo = datacontainer;
		String successmessage = updateprovdatarepo[0];
		String pagename = updateprovdatarepo[1];
		String verifyui = updateprovdatarepo[2];
		Reporter.log("Verify Test Data was retrieved for 'Update Profile' page");
		if (!successmessage.equals("")) {
			Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
			waitForElementPresentWebdriverWait(attributeName_xpath, RC_Question+successmessage+"')]", successmessage);
			verifyElementContainsTextWebdriver(attributeName_xpath, RC_Question+successmessage+"')]", successmessage, successmessage);
		}
		if (!pagename.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			if (selenium.isTextPresent(pagename)) {
				Reporter.log("Its navigate to 'Update Profile' page");
			} else {
				writeFailure("Its not navigate to 'Update Profile' page");
			}			
		}
		if (!verifyui.equals("")) {
			
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}


}
