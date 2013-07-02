package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_ResetPassword_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Reset Password' page")
	public void FC_ResetPassword_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Test Data in Reset password input");
			String[]  fpdatarepo = datacontainer;
			String password = fpdatarepo[0];
			String confirmpassword = fpdatarepo[1];
			String submit = fpdatarepo[2];
			Reporter.log("Enter Data in PIN if it is not empty");
			String Password;
			if (!password.equals("")) {
				Reporter.log("Step 1 - Enter PIN as ("+password+")");
				Password = Runtimedataread(password);
				waitForElementPresentWebdriver(attributeName_name,"Password",Password);
				sendKeysType(attributeName_name,"Password",Password);
			}
			if (!confirmpassword.equals("")) {
				Reporter.log("Step 2 - Enter Email Address as ("+confirmpassword+")");
				Password = Runtimedataread(confirmpassword);
				sendKeys(attributeName_name,"ConPassword",Password);
			}
			if (!submit.equals("")) {
				Reporter.log("Step 3 - Click on ("+submit+") Button");
				if (submit.equalsIgnoreCase("submit")) {
//					click(RPI_submit);
					clickWebdriver(attributeName_id, "ay-externalSubmit");
//					waitForElementPresentWebdriver(attributeName_xpath, "//div/h2", "Reset Password Page");
				}else if (submit.equalsIgnoreCase("close window")) {
					recentPopupClose();
				}else if (submit.equalsIgnoreCase("here")) {
					waitForElementPresentWebdriver(attributeName_partiallinktext, submit, "Submit Button");
					clickWebdriver(attributeName_partiallinktext, submit);
//					waitForElementPresentWebdriver(attributeName_cssselector, DB_PageTitle, "My Applications");	
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
