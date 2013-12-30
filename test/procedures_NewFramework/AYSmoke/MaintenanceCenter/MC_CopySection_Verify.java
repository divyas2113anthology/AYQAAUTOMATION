package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_CopySection_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform Verification in 'Copy Section' page")
	public void MC_CopySection_Verify(){
		try{
			Reporter.log("Proceed to verify Copy Section page is saved in Maintenance center");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String pagename = testdata[1];
			Reporter.log("Check application Copy Section page is saved in  Maintenance center");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message is ["+message+"]");
				waitForText(message, message);
				verifyTextPresent(message);				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify page name is ["+pagename+"]");
				waitForText(pagename, message);
				verifyTextPresent(pagename);				
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage()); }
	}

}


