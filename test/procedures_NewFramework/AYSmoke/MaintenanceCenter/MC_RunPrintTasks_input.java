package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_RunPrintTasks_input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Run Print Task' page")
	public void MC_RunPrintTasks_input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String printtask = testdata[0];
		String button = testdata[1];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!printtask.equals("")) {
			Reporter.log("Step 1 - Select the Look Up value as ["+printtask+"]");
			waitForElementPresentWebdriver(attributeName_name, "printTask", printtask);
			selectByVisibleTextWebdriver(attributeName_name, "printTask", printtask);			
		}
		if (!button.equals("")) {
			Reporter.log("Step 2 - Click on Button as ["+button+"]");
			clickWebdriver(attributeName_xpath, RPT_RunBtn);
		}
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}


