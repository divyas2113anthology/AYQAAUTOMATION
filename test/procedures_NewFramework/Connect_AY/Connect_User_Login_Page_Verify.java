package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_User_Login_Page_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Connect_UserLogin' page")
		public void Connect_User_Login_Page_Verify() throws Exception{
		try {
			
			Reporter.log("Proceed to retrieve Verify Test Data 'Connect User Login' page");
			String[]  testdata = datacontainer;
			String lockmsg=testdata[0];
			
			Reporter.log("Verify Test Data was retrieved for 'Applicant Welcome' page");
			if (!lockmsg.equals("")) {
				Reporter.log("Step 2 - Verify the Last name text matches with ["+lockmsg+"]");
				verifyElementPresentWebdriver(attributeName_xpath, RP_Lock_Msg, lockmsg);
				//waitForElementPresentWebdriver(attributeName_xpath, CEUP_Lastname, lastnamepresent);
							
			}
			/*if (!lockmsg.equals("")) {
				Reporter.log("Step 1 - Verify its throwing the lock info as ("+lockmsg+")");
				waitForText(lockmsg, "Your account is currently locked due to multiple failed login attempts. You will receive an e-mail with instructions on how to unlock your account. You can also click on the Reset password link below.");
				verifyTextPresent(lockmsg);

			}*/
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	
	}

}
