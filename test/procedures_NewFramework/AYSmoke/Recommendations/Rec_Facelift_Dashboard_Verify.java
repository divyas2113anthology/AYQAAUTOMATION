package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;


public class Rec_Facelift_Dashboard_Verify extends CommonSeleniumActions implements OR
{
	@Test(description="This Procedure is to perform some operation in 'Create/Reset Password' in Recommendation Facelift page")
	public void Rec_Facelift_Dashboard_Verify() throws Exception
	{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("This procedure is to verify the text present in the Home page");
		String verifytext = parameterValuesArray[0];
		String firstgivenname = parameterValuesArray[1];
		String middlename = parameterValuesArray[2];
		String dateofbirth = parameterValuesArray[3];
		String lastname = parameterValuesArray[4];
		String gender = parameterValuesArray[5];
		String fulltimestudent = parameterValuesArray[6];
		String academicinterest= parameterValuesArray[7];
		String emailaddress = parameterValuesArray[8];
		String currentmailingaddress1 = parameterValuesArray[9];
		String currentmailingaddress2 = parameterValuesArray[10];
		String currentmailingcity = parameterValuesArray[11];
		String currentmailingstate = parameterValuesArray[12];
		String currentnailingzip = parameterValuesArray[13];
		String currentmailingcountry = parameterValuesArray[14];

		
		//waitForElementPresentWebdriver(attributeName_xpath, RL_SubmitBtn, "Submit Button");

		if (!verifytext.equals("")) {
			Reporter.log("Step 1 - Verify the text as ["+verifytext+"]");
			//String Password1 = Runtimedataread(password);
			waitForText(verifytext, "Welcome");
			verifyTextPresent(verifytext);
					
		}
		
		if (!lastname.equals("")) {
			Reporter.log("Step 2 - Verify the text as ["+lastname+"]");
		    waitForElementPresentWebdriver(attributeName_xpath, REC_Display_lname , lastname);
		    verifyElementPresentWebdriver(attributeName_xpath, REC_Display_lname , lastname);
					
		}
		if (!dateofbirth.equals("")) {
			Reporter.log("Step 3 - Verify the text as ["+dateofbirth+"]");
			waitForElementPresentWebdriver(attributeName_xpath, REC_Display_dob , dateofbirth);
		    verifyElementPresentWebdriver(attributeName_xpath, REC_Display_dob , dateofbirth);
					
		}
		
			}
	catch (Exception e) {			
		writeFailure(e.getLocalizedMessage());
	}

	}	
}