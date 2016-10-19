package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_QuickViewResults_Verify  extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Quick View' page")
	public void MC_QuickViewResults_Verify(){
		try{
			Reporter.log("Proceed to verify navigate to Manage Clients :: Edit Package for ayauto screen in Maintenance center");
			String[] testdata = datacontainer;
			String page = testdata[0];
			Reporter.log("Check navigate to Manage Clients :: Edit Package for ayauto screen Maintenance center");
			if (!page.equals("")) {
				Reporter.log("Step 1 - Verify page is ["+page+"]");
				writeConsole(page);
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage()); }
	}
}
