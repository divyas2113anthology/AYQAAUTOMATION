package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_CopyPickList_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Copy PickList' page")
	public void MC_CopyPickList_Input(){
		try{
			Reporter.log("Proceed to perform Operation in 'Copy PickList' page");
			String[] testdata = datacontainer;
			String sourceclientid = testdata[0];
			String applicationforqaacutomation = testdata[1];
			String academicintrest = testdata[2];
			String targetclientid = testdata[3];
			String targetapplicationforqaautomation = testdata[4];
			String button = testdata[5];
			Reporter.log("Check user click on Manage client link in Maintenance center");
			if (!sourceclientid.equals("")) {
				Reporter.log("Step 1 - Select the source ClientID as  ["+sourceclientid+"]");
				waitForElementPresentWebdriver(attributeName_name, "sourceclientid", sourceclientid);
				selectByVisibleTextWebdriver(attributeName_name, "sourceclientid", sourceclientid);				
			}
			if (!applicationforqaacutomation.equals("")) {
				Reporter.log("Step 2 - Click the Source Package as  ["+applicationforqaacutomation+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text(),'"+applicationforqaacutomation+"')]/input[@name='sPackageID']", applicationforqaacutomation);
				clickWebdriver(attributeName_xpath, "//td[contains(text(),'"+applicationforqaacutomation+"')]/input[@name='sPackageID']");
			}
			//Input value as "Academic interest.check;Country.check"
			if (!academicintrest.equals("")) {
				Reporter.log("Step 3 - Select the Academic Intrest as  ["+academicintrest+"]");
				String[] CheckItem = academicintrest.split(";");
				for (int i = 0; i < CheckItem.length; i++) {
					String[] SplitItem = CheckItem[i].split(".check");
					if (CheckItem[i].contains("check")) {
						checkWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+SplitItem[0]+"')]/input[@name='ChoiceGroupID']");
					}else if (CheckItem[i].contains("uncheck")) {
						uncheckWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+SplitItem[0]+"')]/input[@name='ChoiceGroupID']");
					}
				}
			}
			if (!targetclientid.equals("")) {
				Reporter.log("Step 4 - Select the Target ClientID as  ["+targetclientid+"]");
				waitForElementPresentWebdriver(attributeName_name, "targetclientid", sourceclientid);
				selectByVisibleTextWebdriver(attributeName_name, "targetclientid", sourceclientid);				
			}
			if (!targetapplicationforqaautomation.equals("")) {
				Reporter.log("Step 5 - Select Target Application as  ["+targetapplicationforqaautomation+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text(),'"+targetapplicationforqaautomation+"')]/input[@name='tPackageID']", targetapplicationforqaautomation);
				clickWebdriver(attributeName_xpath, "//td[contains(text(),'"+targetapplicationforqaautomation+"')]/input[@name='tPackageID']");
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



