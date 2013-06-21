package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_AddEditPackageApplication_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Add Edit' page")
	public void MC_AddEditPackageApplication_Input(){
		try{
			Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
			String[] testdata = datacontainer;
			String button = testdata[0];
			Reporter.log("Check user clicked on save button in application package of Maintenance center");
			if (!button.equals("")) {
				click(MCL_SaveModbutton);
				waitForPageToLoad();
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());}
		}

}
