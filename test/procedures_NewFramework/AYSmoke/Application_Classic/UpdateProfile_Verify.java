package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
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
		String closeWindow = updateprovdatarepo[3];
		Reporter.log("Verify Test Data was retrieved for 'Update Profile' page");
		if (!successmessage.equals("")) {
			Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
			waitForElementPresentWebdriverWait(attributeName_xpath, RC_Question1+successmessage+"')]", successmessage);
			verifyElementContainsTextWebdriver(attributeName_xpath, RC_Question1+successmessage+"')]", successmessage, successmessage);
		}
		if (!pagename.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			String actualText = pagename;
			String expectedText = pagename;
			if (actualText.equals(expectedText)) {
				Reporter.log("Its navigate to 'Update Profile' page");
			} else {
				writeFailure("Its not navigate to 'Update Profile' page");
			}			
		}
		if (!verifyui.equals("")) {
			
		}
		if(!closeWindow.equals("")){
			Reporter.log("Close the Window");
			clickWebdriver(attributeName_xpath,"//button[@class='close']");
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		} finally {
			// An 'Assert.fail' statement would cause the procedure to fail but it would also stop the procedure from executing
			// further.  Instead of failing a procedure (with the 'Assert.fail' statement) for every mismatch, we are failing it once
			// at its end.  Every mismatch would be recorded in the report via. the 'writeFailure' function.  Since, in the
			// 'writeFailure' function, the 'global variable', 'globalFailureNotification' would be given a value, the condition,
			// 'globalFailureNotification' is not equal to "empty"
			// would denote that there was a mismatch.  In that case, the procedure would be failed via. the 'Assert.fail' statement
			// After failing the procedure, the 'globalFailureNotification' variable would again be set to "empty"
			ifAppropriateFailTheProcedure();
		}
		}
	}



