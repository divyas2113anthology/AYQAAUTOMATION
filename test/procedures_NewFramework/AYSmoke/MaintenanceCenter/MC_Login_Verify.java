package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_Login_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Maintanence Center' page")
	public void MC_Login_Verify()throws Exception{
		try{
			Reporter.log("Proceed to verify sucessfully login to Maintenance center");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String page = testdata[1];
			Reporter.log("Check login to Maintenance center");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message is ["+message+"]");
				writeConsole(message);
			}
			if (!page.equals("")) {
				Reporter.log("Step 2 - Verify page name is  ["+page+"]");
				writeConsole(page);
			}
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}
