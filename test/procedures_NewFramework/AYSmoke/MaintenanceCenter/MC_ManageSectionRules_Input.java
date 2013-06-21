package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ManageSectionRules_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Manage Section Rules' page")
	public void MC_ManageSectionRules_Input(){
	try{
		Reporter.log("Proceed to click on package name in Manage Section Rules screen of Maintenance center");
		String[] testdata = datacontainer;
		String operationtoperform = testdata[0];
		String checkrulename = testdata[1];
		String clickrulename = testdata[2];
		String button = testdata[3];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!checkrulename.equals("") && !operationtoperform.equals("")) {
			Reporter.log("Step 1 - Check the checkbox against ["+checkrulename+"]");
			if (operationtoperform.equalsIgnoreCase("Check")) {
				checkWebdriverCheckbox(attributeName_xpath, "//td[a[contains(text(),'"+checkrulename+"')]]/preceding-sibling::td/input[@type='checkbox']");
			}else if (operationtoperform.equalsIgnoreCase("UnCheck")) {
				checkWebdriverCheckbox(attributeName_xpath, "//td[a[contains(text(),'"+checkrulename+"')]]/preceding-sibling::td/input[@type='checkbox']");
			}
		}
		if (!clickrulename.equals("")) {
			Reporter.log("Step 2 - Click on Rule name ["+clickrulename+"]");
			clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+clickrulename+"')]");
		}
		if (!button.equals("")) {
			Reporter.log("Step 3 - Click on button as ["+button+"]");
			if (button.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_xpath, MSR_AddBtn);
			}else if (button.equalsIgnoreCase("Back")) {
				clickWebdriver(attributeName_xpath, MSR_BackBtn);
			}else if (button.equalsIgnoreCase("Delete")) {
				clickWebdriver(attributeName_xpath, MSR_DeleteBtn);
			}
		}
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}

