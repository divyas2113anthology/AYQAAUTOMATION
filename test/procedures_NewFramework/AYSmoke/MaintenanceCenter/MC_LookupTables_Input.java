package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_LookupTables_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Lookup Tabels' page")
	public void MC_LookupTables_Input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String lookup = testdata[0];
		String button = testdata[1];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!lookup.equals("")) {
			Reporter.log("Step 1 - Select the Look Up value as ["+lookup+"]");
			waitForElementPresentWebdriver(attributeName_id, "cboTables", lookup);
			selectByVisibleTextWebdriver(attributeName_id, "cboTables", lookup);			
		}
		if (!button.equals("")) {
			Reporter.log("Step 2 - Click on Button as ["+button+"]");
			if (button.equalsIgnoreCase("Differences Across Servers")) {
				clickWebdriver(attributeName_id,"btnViewDifferences");
//				waitForPageToLoadWebdriver();
			}else if (button.equalsIgnoreCase("Modify Data")) {
				clickWebdriver(attributeName_id,"btnModifyData");
				waitForPageToLoadWebdriver();
			}
		}
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}

