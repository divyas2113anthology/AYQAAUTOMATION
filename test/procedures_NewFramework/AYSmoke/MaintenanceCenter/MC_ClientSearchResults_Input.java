package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ClientSearchResults_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Client Search' page")
	public void MC_ClientSearchResults_Input(){
	try{
		Reporter.log("Proceed to click on page icon in manage client :: search results screen of Maintenance center");
		String[] testdata = datacontainer;
		String clickpageicon = testdata[0];
		String clickclientname = testdata[1];
		String button = testdata[2];
		Reporter.log("Check user clicked on page icon in Maintenance center");
		if (!clickpageicon.equals("")) {
			Reporter.log("Step 1 - Click on page icon ["+clickpageicon+"]");
			click(MCL_pageicon);					
		}
		if (!clickclientname.equals("")) {
			Reporter.log("Step 2 - Click on client name ["+clickclientname+"]");
			click(MCL_ClientName);					
		}
		if (button.equalsIgnoreCase("button")) {
			click(MCL_NewSearchbutton);
			waitForPageToLoad();
		}
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage()); }
	}
}
