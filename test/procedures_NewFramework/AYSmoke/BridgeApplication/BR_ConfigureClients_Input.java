package procedures_NewFramework.AYSmoke.BridgeApplication;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class BR_ConfigureClients_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Configured Clients' page")
	public void BR_ConfigureClients_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configured Clients' page");
			String[]  testdata = datacontainer;
			String selectclient = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'Configured Clients' page");
			if (!selectclient.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on AY client Abbreviation ("+selectclient+") Link");
				clickWebdriver(attributeName_xpath, "//td[text()='"+selectclient+"']/preceding-sibling::td/input[@value='Select']");
				waitForPageToLoadWebdriver();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
