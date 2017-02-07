package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class ResetPassword_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to Verify the some Operation in 'Reset Password' page")
	public void ResetPassword_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to verify Test Data in Reset password verify");
			String[]  fpdatarepo = datacontainer;
			String message = fpdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Reset Password' page");
			if (!message.equals("")) {
				Reporter.log("Proceed to Verify the '"+message+"' 'Reset Password' page");
//				verifyTextPresent(message);
				waitForElementPresentWebdriver(attributeName_xpath, "//p", message);
				verifyElementContainsTextWebdriver(attributeName_xpath, "//div[@id='Resetpassword']//p", message, "Success Message");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}


