package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_ResetPwdConfirmPage_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to verify the 'Edit User Profile' page matches with Application")
	public void Connect_ResetPwdConfirmPage_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Edit User Profile' Page");
			String[] testdata = datacontainer;
			String clickok = testdata[0];
			
			Reporter.log("Input Test Data was retrieved for 'Edit User Profile' Page");

			if (!clickok.equals("")) {
				
				clickWebdriver(attributeName_xpath, RP_Ok_Confirm);
				waitForPageToLoadWebdriver();
			}
				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
