package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationUpdateStatus_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation Update Status' page")
	
	public void WC_RecommendationUpdateStatus_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation Update Status'Page");
			String[] testdata = datacontainer;
			String status = testdata[0];
			String date = testdata[1];
			String hour = testdata[2];
			String minutes = testdata[3];
			String saveclosewindow = testdata[4];
			
			
			if(!status.equals("")){
				Reporter.log("Verify("+status+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RUS_Status, status);
				verifyElementContainsTextWebdriver(attributeName_xpath, RUS_Status, status, status);
			}
			if(!saveclosewindow.equals("")){
				Reporter.log("Click on the Button"+saveclosewindow);
				clickWebdriver(attributeName_xpath, RUS_CloseWindow+saveclosewindow+"')]");
			}	
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}

