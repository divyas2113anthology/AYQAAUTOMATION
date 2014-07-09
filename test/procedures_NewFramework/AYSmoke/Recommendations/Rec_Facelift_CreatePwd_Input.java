package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class Rec_Facelift_CreatePwd_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Create/Reset Password' in Recommendation Facelift page")
	public void Rec_Facelift_CreatePwd_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Create/Reset Password' in Recommendation Facelift page");
		String password = parameterValuesArray[0];
		String confirmpassword = parameterValuesArray[1];
		String submit = parameterValuesArray[2];
		
		Reporter.log("Input Test Data was retrieved for 'Create Password' Facelift page");
		//waitForElementPresentWebdriver(attributeName_xpath, RL_SubmitBtn, "Submit Button");

		if (!password.equals("")) {
			Reporter.log("Step 1 - Enter the Password as ["+password+"]");
			//String Password1 = Runtimedataread(password);
			sendKeys(attributeName_xpath, RF_Password, password);
					
		}
		if (!confirmpassword.equals("")) {
			Reporter.log("Step 2 - Enter the Confirm Password as ["+confirmpassword+"]");
			//String ConfirmPassword = Runtimedataread(confirmpassword);
			sendKeys(attributeName_xpath, RF_Cnf_Password , confirmpassword);
		}
		if (!submit.equals("")) {
			Reporter.log("Step 3 - Click the Submit Button");
			clickWebdriver(attributeName_xpath, RF_Submit);
			waitForPageToLoad();
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}


