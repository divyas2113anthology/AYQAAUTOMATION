package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_QuickViewResults_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Quick View' page")
	public void MC_QuickViewResults_Input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String clientname = testdata[0];
		String modulename = testdata[1];
		String packagename = testdata[2];
		String button = testdata[3];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!clientname.equals("")) {
			Reporter.log("Step 1 - Click on client name ["+clientname+"]");
			waitForElementPresentWebdriverWait(attributeName_xpath, MCL_ClientName, clientname);
			clickWebdriver(attributeName_xpath, MCL_ClientName);				
		}
		if (!modulename.equals("")) {
			Reporter.log("Step 2 - Click on module name ["+modulename+"]");
			waitForElementPresentWebdriverWait(attributeName_xpath, MCL_ModuleName, modulename);
			clickWebdriver(attributeName_xpath, MCL_ModuleName);
		}
		if (!packagename.equals("")) {
			Reporter.log("Step 2 - Click on package name ["+packagename+"]");
			waitForElementPresentWebdriver(attributeName_xpath, ER_linktoclick+packagename+"')]", packagename);
			clickWebdriver(attributeName_xpath, ER_linktoclick+packagename+"')]");
		}
		if (!button.equals("")) {
			waitForElementPresentWebdriverWait(attributeName_xpath, MCL_NewSearchbutton, button);
			clickWebdriver(attributeName_xpath, MCL_NewSearchbutton);
			waitForPageToLoadWebdriver();
		}
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}
