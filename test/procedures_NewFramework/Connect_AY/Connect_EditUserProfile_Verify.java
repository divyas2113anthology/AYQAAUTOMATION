package procedures_NewFramework.Connect_AY;

import or.OR;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_EditUserProfile_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to verify the 'Edit User Profile' page matches with Application")
	public void Connect_EditUserProfile_Verify(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Edit User Profile' Page");
			String[] testdata = datacontainer;
			String lockmsg = testdata[0];
			
			Reporter.log("Input Test Data was retrieved for 'Edit User Profile' Page");

			if (!lockmsg.equals("")) {
				Reporter.log("Step 2 - Verify the Last name text matches with ["+lockmsg+"]");
				verifyElementPresentWebdriver(attributeName_xpath, RP_Lock_Msg, lockmsg);
				//waitForElementPresentWebdriver(attributeName_xpath, CEUP_Lastname, lastnamepresent);
							
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}
