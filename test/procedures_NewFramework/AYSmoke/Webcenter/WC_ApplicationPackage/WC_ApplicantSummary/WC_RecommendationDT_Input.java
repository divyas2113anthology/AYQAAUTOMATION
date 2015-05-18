package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationDT_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation DT' page")
	
	public void WC_RecommendationDT_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation DT'Page");
			
			String[] testdata = datacontainer;
			String editprofile = testdata[0];
			String online = testdata[1];
			String email = testdata[2];
			String status = testdata[3];
			String verifystatus = testdata[4];
			String closewindow = testdata[5];
						
			if(!verifystatus.equals("")){
				Reporter.log("Verify("+verifystatus+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RD_VerifyStatus+verifystatus+"')]", verifystatus);
				verifyElementContainsTextWebdriver(attributeName_xpath, RD_VerifyStatus+verifystatus+"')]", verifystatus, verifystatus);
				
			}
			if(!status.equals("")){
				Reporter.log("Click on the Status"+status);
				clickWebdriver(attributeName_xpath, RD_VerifyStatus);
			}
			if(!closewindow.equals("")){
				Reporter.log("Click on the Button"+closewindow);
				clickWebdriver(attributeName_xpath, RD_CloseWindow);
			}		
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}
