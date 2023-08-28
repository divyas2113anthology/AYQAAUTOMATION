package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_ResetPwdPage_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This procedure is used to reset the password in 'Reset Password' page.")
	public void Connect_ResetPwdPage_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Test Data in Reset password input");
			String[]  testdata = datacontainer;
			String username=testdata[0];
			String emailid=testdata[1];
			String okcancel=testdata[2];
			
			Reporter.log("Input Test Data was retrieved for 'Reset Password' Page");
			if (!username.equals("")) {
				Reporter.log("Step 1 - Enter username address as ["+username+"]");
				sendKeys(attributeName_xpath,  "//input[@id='USERNAME']", username);
				waitForPageToLoadWebdriver();
			}


			if (!emailid.equals("")) {
								
				Reporter.log("Step 1 - Enter Email address as ["+emailid+"]");
				sendKeys(attributeName_xpath, RP_EmailId, emailid);
				waitForPageToLoadWebdriver();
			}
			if (!okcancel.equals("")) {
				
				Reporter.log("Step 2 - Click on OK or Cancel");
			
			if (okcancel.equalsIgnoreCase("OK")) {
				clickWebdriver(attributeName_xpath, RP_Ok);
				waitForPageToLoadWebdriver();
			}else if (okcancel.equalsIgnoreCase("cancel")) {
				clickWebdriver(attributeName_xpath, RP_Cancel);
				waitForPageToLoadWebdriver();
			}
			
		}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
