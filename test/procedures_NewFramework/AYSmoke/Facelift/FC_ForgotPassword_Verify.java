package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_ForgotPassword_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Forgot Password Verification'  page")
		public void FC_ForgotPassword_Verify(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Test Data in forgot password verify");
			String[]  fpverifydata = datacontainer;
			String ui = fpverifydata[0];
			String page_title = fpverifydata[1];
			String errormessage = fpverifydata[2];
			String successmessage = fpverifydata[3];
			Reporter.log("Email is sent to your account");
			if (!ui.equals("")) {

			}

			if (!page_title.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+page_title+") page");
				waitForElementPresent(FPV_PageName, page_title);
//				verifyText(FPV_PageName, "Forgot UserName/Password.", "Popup Title");
				verifyElementText(FPV_PageName, page_title, "Popup Title");
			}
			if (!errormessage.equals("")) {
				Reporter.log("Step 3 - Verify Success Message:("+errormessage+") was displayed correctl");
				errormessage = errormessage.replace(";", "\n");
				verifyElementText(FPV_ErrorMsg, errormessage, "System Message:");
				}
			if (!successmessage.equals("")) {
				Reporter.log("Step 4 - Verify Success Message:("+successmessage+") was displayed correctly");
				waitForElementPresent(FPV_SuccessMsg, successmessage);
				verifyElementText(FPV_SuccessMsg, successmessage, "Forgot Password Reset Message");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
