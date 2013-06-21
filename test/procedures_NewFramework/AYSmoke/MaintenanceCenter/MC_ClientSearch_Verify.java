package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ClientSearch_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Client Search' page")
	public void MC_ClientSearch_Verify(){
		try{
			Reporter.log("Proceed to verify search has returned correct client Maintenance center");
			String[] testdata = datacontainer;
			String page = testdata[0];
			String clientid = testdata[1];
			Reporter.log("Check search client Maintenance center");
			if (!page.equals("")) {
				Reporter.log("Step 1 - Verify page is ["+page+"]");
				verifyTextPresent(page);				
			}
			if (!clientid.equals("")) {
				Reporter.log("Step 2 - Verify client ID is  ["+clientid+"]");
				verifyTextPresent(clientid);				
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}
}
