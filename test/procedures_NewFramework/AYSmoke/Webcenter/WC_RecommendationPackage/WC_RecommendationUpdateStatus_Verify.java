package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationUpdateStatus_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Recommendation Update Status' page")
	
	public void WC_RecommendationUpdateStatus_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Recommendation Update Status'Page");
			
			String[] testdata = datacontainer;
			String pagename = testdata[0];
						
			if(!pagename.equals("")){
				Reporter.log("Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, RUS_Pagename, pagename);
				verifyElementPresentWebdriver(attributeName_xpath, RUS_Pagename, pagename);
			}
						
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}

