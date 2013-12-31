package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_CopySection_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Copy Section' page")
	public void MC_CopySection_Input(){
		try{
			Reporter.log("Proceed to perform Operation in 'Copy Section' page");
			String[] testdata = datacontainer;
			String sourceclientid = testdata[0];
			String sourcepackage = testdata[1];
			String sourceform = testdata[2];
			String sourcesection = testdata[3];
			String targetclientid = testdata[4];
			String targetpackage = testdata[5];
			String targetsection = testdata[6];
			String button = testdata[7];
			Reporter.log("Check user click on Manage client link in Maintenance center");
			if (!sourceclientid.equals("")) {
				Reporter.log("Step 1 - Select the source ClientID as  ["+sourceclientid+"]");
				waitForElementPresentWebdriver(attributeName_name, "sourceclientid", sourceclientid);
				selectByVisibleTextWebdriver(attributeName_name, "sourceclientid", sourceclientid);				
			}
			if (!sourcepackage.equals("")) {
				Reporter.log("Step 2 - Click the Source Package as  ["+sourcepackage+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text(),'"+sourcepackage+"')]/input[@name='sPackageID']", sourcepackage);
				clickWebdriver(attributeName_xpath, "//td[contains(text(),'"+sourcepackage+"')]/input[@name='sPackageID']");
			}
			if (!sourceform.equals("")) {
				Reporter.log("Step 3 - Click the Source Form as  ["+sourceform+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+sourceform+"')]/input[@name='FormID']", sourceform);
				clickWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+sourceform+"')]/input[@name='FormID']");
			}
			if (!sourcesection.equals("")) {
				Reporter.log("Step 4 - Click the Source Section as  ["+sourcesection+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+sourcesection+"')]/input[@name='SectionID']", sourcesection);
				clickWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+sourcesection+"')]/input[@name='SectionID']");
			}
			if (!targetclientid.equals("")) {
				Reporter.log("Step 5 - Select the Target ClientID as  ["+targetclientid+"]");
				waitForElementPresentWebdriver(attributeName_name, "targetclientid", sourceclientid);
				selectByVisibleTextWebdriver(attributeName_name, "targetclientid", sourceclientid);				
			}
			if (!targetpackage.equals("")) {
				Reporter.log("Step 6 - Click the Target Package as  ["+targetpackage+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text(),'"+targetpackage+"')]/input[@name='tPackageID']", targetpackage);
				clickWebdriver(attributeName_xpath, "//td[contains(text(),'"+targetpackage+"')]/input[@name='tPackageID']");
			}
			if (!targetsection.equals("")) {
				Reporter.log("Step 7 - Click the Target Form as  ["+targetsection+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+targetsection+"')]/input[@name='tFormID']", targetsection);
				clickWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+targetsection+"')]/input[@name='tFormID']");
			}
			if (!button.equals("")) {
				Reporter.log("Step 8 - Click the submit Button");
				clickWebdriver(attributeName_xpath, MCL_SaveModbutton);
				waitForPageToLoadWebdriver();
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}


