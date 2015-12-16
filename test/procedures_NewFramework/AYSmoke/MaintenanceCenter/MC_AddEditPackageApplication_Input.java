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
			String offlinerecommendation = testdata[1];
			String offlinerecommendationcheck = testdata[2];
			String enableapplicationreview = testdata[3];
			String readyforreviewcondition = testdata[4];
			Reporter.log("Check user clicked on save button in application package of Maintenance center");
			
			if (!offlinerecommendation.equals("")) {
				Reporter.log("Verify the Text as ["+offlinerecommendation+"]");
				waitForElementPresentWebdriver(attributeName_xpath, IncludeOffline, offlinerecommendation);
				verifyElementContainsTextWebdriver(attributeName_xpath, IncludeOffline,offlinerecommendation,offlinerecommendation);
			}
			if (!offlinerecommendationcheck.equals("")) {
				Reporter.log("Perform the operation to click the  Button as ["+offlinerecommendationcheck+"]");
				doubleClickWebdriver(attributeName_xpath, IncludeOfflineCheck);
			}			
			if (!enableapplicationreview.equals("")) {
				Reporter.log("Perform the operation to Verify enable application review");
				if(enableapplicationreview.equalsIgnoreCase("verify"))
					verifyElementCheckedWebdriver(attributeName_xpath, CL_EnableAppreview, enableapplicationreview);
				else if(enableapplicationreview.equalsIgnoreCase("check"))
					checkWebdriverCheckbox(attributeName_xpath, CL_EnableAppreview);					
			}
			if (!readyforreviewcondition.equals("")) {
				Reporter.log("Perform the operation to click the  Button as ["+offlinerecommendationcheck+"]");
				
			}
			if (!button.equals("")) {
				clickWebdriver(attributeName_xpath,CL_AddEdit+button+"')]");
				waitForPageToLoadWebdriver();
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());}
		}

}
