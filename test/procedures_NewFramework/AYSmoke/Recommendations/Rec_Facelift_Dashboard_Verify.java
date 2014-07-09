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
		
		//waitForElementPresentWebdriver(attributeName_xpath, RL_SubmitBtn, "Submit Button");

		if (!verifytext.equals("")) {
			Reporter.log("Step 1 - Verify the text as ["+verifytext+"]");
			//String Password1 = Runtimedataread(password);
			waitForText(verifytext, "Welcome");
			verifyTextPresent(verifytext);
					
		}
			}
	catch (Exception e) {			
		writeFailure(e.getLocalizedMessage());
	}

	}	
}