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
				waitForPageToLoadWebdriver();
				writeConsole(message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify page name is ["+pagename+"]");
				waitForPageToLoadWebdriver();
				writeConsole(pagename);
			}
			if (!values.equals("")) {
				Reporter.log("Step 3 - Verify the Presented values as ["+values+"]");
				clickWebdriver(attributeName_xpath, "//a[text()='Add SectionRule']");
				clickWebdriver(attributeName_xpath, MC_SR_SelectMenu);
				//clickWebdriver(attributeName_xpath, "//a[text()='"+values+"']");
				verifyDropDownContainsOptionsWebdriver(attributeName_xpath, MC_SR_Values+values+"')]", values, values);
				//verifySelectContainsOptionsWebdriver(attributeName_xpath, MC_SR_Values, values, values);
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage()); }
	}

}

