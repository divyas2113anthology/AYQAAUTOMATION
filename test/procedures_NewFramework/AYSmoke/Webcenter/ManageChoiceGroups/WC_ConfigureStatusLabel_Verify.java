package procedures_NewFramework.AYSmoke.Webcenter.ManageChoiceGroups;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ConfigureStatusLabel_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Manage Choice Groups' page")
	
	public void WC_ConfigureStatusLabel_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Manage Choice Groups'Page");
			
			String[] testdata = datacontainer;
			String pagename = testdata[0];  
			String message = testdata[1];
			switchToFrameNameIdWebdriver("frmContent");
			
			if(!pagename.equals("")){
				Reporter.log("Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, SAV_PageName, pagename);
				verifyElementPresentWebdriver(attributeName_xpath, SAV_PageName, pagename);
			}
			if(!message.equals("")){
				Reporter.log("Verify its navigate to ("+message+") page");
				waitForElementPresentWebdriver(attributeName_xpath, AY_ConfigureStatusConfirmationText+message+"')]", message);
				verifyElementPresentWebdriver(attributeName_xpath, AY_ConfigureStatusConfirmationText+message+"')]", message);
			}
	
			
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}
