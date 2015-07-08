package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ManagePackage;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ManagePackage_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Manage Package' page")
	public void WC_ManagePackage_Input(){
		try{
			
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Package' Page");
			String[] testdata = datacontainer;
			String packagename = testdata[0];
			String paymentamount = testdata[1];
			String description = testdata[2];
			String secondaryamount = testdata[3];
			String secdescription = testdata[4];
			String finaldeadline = testdata[5];
			String markssn = testdata[6];
			String printrecommendation = testdata[7];
			String includeoffline = testdata[8];
			String includeofflinecheck = testdata[9];
			String filterdate = testdata[10];
			String button = testdata[11];
			
			Reporter.log("Input Test Data was retrieved for 'Manage Package' Page");
			
			if (!includeoffline.equals("")) {
				Reporter.log("Verify the Text as ["+includeoffline+"]");
				waitForElementPresentWebdriver(attributeName_xpath, RecIncludeOffline, includeoffline);
				verifyElementContainsTextWebdriver(attributeName_xpath, RecIncludeOffline,includeoffline,includeoffline);
			}
			if (!includeofflinecheck.equals("")) {
				Reporter.log("Perform the operation to click the  Button as ["+includeofflinecheck+"]");
				doubleClickWebdriver(attributeName_xpath, IncludeOfflineCheck);
			}			
			
			if (!button.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath,CL_AddEdit+button+"')]", button);
				clickWebdriver(attributeName_xpath,CL_AddEdit+button+"')]");
				waitForPageToLoadWebdriver();
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());}
		}

}

