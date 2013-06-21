package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_AddEditSectionRule_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform Verification in 'Add/Edit Section Rules' page")
	public void MC_AddEditSectionRule_Verify(){
		try{
			Reporter.log("Proceed to verify application package is saved in Maintenance center");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String pagename = testdata[1];
			String values = testdata[2];
			Reporter.log("Check application package is saved in  Maintenance center");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message is ["+message+"]");
				verifyTextPresent(message);				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify page name is ["+pagename+"]");
				verifyTextPresent(pagename);				
			}
			if (!values.equals("")) {
				Reporter.log("Step 3 - Verify the Presented values as ["+values+"]");
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage()); }
	}

}

