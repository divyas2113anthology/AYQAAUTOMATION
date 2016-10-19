package procedures_NewFramework.AYSmoke.Recommendations;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Rec_Facelift_RecLocking_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in Recommendation Facelift page")
	public void Rec_Facelift_RecLocking_Verify() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		String system_msg = testdata[0];
		
		if (!system_msg.equals("")) {
			Reporter.log("Step 1 - Verify the text as ["+system_msg+"]");
			//String Password1 = Runtimedataread(password);
			//waitForText(system_msg, "Unfortunately, your account has been suspended due to multiple login failures.");
			waitForPageToLoadWebdriver();
			writeConsole(system_msg);
					
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
