 package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class REC_ContactInformation_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Recommendation Facelift' page")
		public void REC_ContactInformation_Verify() throws Exception{
		try {
			writeDetails();

			String[]  testdata = datacontainer;
			String Forgot_SysMsg = testdata[0];
			if(!Forgot_SysMsg.equals("")){
				Reporter.log("Step 1 - Verify the text as ["+Forgot_SysMsg+"]");
				//String Password1 = Runtimedataread(password);
				waitForText(Forgot_SysMsg, "An email with a link to reset your password has been sent to your email address. Please click the link in the email to proceed.");
				verifyTextPresent(Forgot_SysMsg);
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}





