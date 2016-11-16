package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class ForgotPassword_Verify extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Forgot Password Verification'  page")
		public void ForgotPassword_Verify(){
		try {
			writeDetails();
//			headerStatement("ForgotPassword_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Test Data in forgot password verify");
			String[]  fpverifydata = datacontainer;
			String fpmessage = fpverifydata[0];
			String successmessage = fpverifydata[1];
			String fppagename = fpverifydata[2];
	//		String ui = fpverifydata[2];
			String userpinpassword = fpverifydata[3];
			String messagetoverify= fpverifydata[4];
			Reporter.log("Email is sent to your account");
			if (!userpinpassword.equals("")) {
				Reporter.log("Step 4 - Verify ("+userpinpassword+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, UserName+userpinpassword+"')]", userpinpassword);
				verifyElementPresentWebdriver(attributeName_xpath, UserName+userpinpassword+"')]", userpinpassword);
				//verifyElementContainsTextWebdriver(attributeName_xpath,"//font[@class='BasePageFont']",userpinpassword,"Element present");
				
			}
			if (!messagetoverify.equals("")) {
				Reporter.log("Step 5 - Verify ("+messagetoverify+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, ".//*[@id='Table1']/tbody/tr[4]/td/font/font", messagetoverify);
				verifyElementPresentWebdriver(attributeName_xpath, ".//*[@id='Table1']/tbody/tr[4]/td/font/font", messagetoverify);
				//verifyElementContainsTextWebdriver(attributeName_xpath,"//font[@class='BasePageFont']",userpinpassword,"Element present");

			}

			if (!fpmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+fpmessage+") was displayed correctly");
//				if (selenium.isTextPresent(fpmessage)) {
//					Reporter.log("Message("+fpmessage+") was displayed correctly");
//				}else {
//					writeFailure("Message("+fpmessage+") was not displayed correctly");
//				}			
				fpmessage = fpmessage.replace(";", "\n\n");
				verifyElementTextWebdriver(attributeName_xpath,"//div[@id='divErrMsg']", fpmessage, "System Message:");
			}
			if (!successmessage.equals("")) {
				Reporter.log("Step 2 - Verify Success Message:("+successmessage+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath,"//font[@class='BasePageFont']", successmessage);
				verifyElementTextWebdriver(attributeName_xpath,"//font[@class='BasePageFont']", successmessage, "Forgot Password Reset Message");
			}
			if (!fppagename.equals("")) {
				Reporter.log("Step 3 - Verify its navigate to ("+fppagename+") page");
				if (selenium.isTextPresent(fppagename)) {
					Reporter.log("Its navigate to 'PIN Lookup' page");
				} else {
					writeFailure("Its not navigate to 'PIN Lookup' page");
				}	
//				waitForElementPresent(FPV_SuccessMsg, successmessage);
//				verifyElementText(FPV_SuccessMsg, successmessage, "Forgot Password Reset Message");
			
		}
		
		
//		if (!ui.equals("")) {
//			
//		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
