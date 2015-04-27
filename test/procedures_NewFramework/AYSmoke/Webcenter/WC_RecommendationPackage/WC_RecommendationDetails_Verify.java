package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationDetails_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Recommendation Deatails' page")
	
	public void WC_RecommendationDetails_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Recommendation Deatails'Page");
			
			String[] testdata = datacontainer;
			String pagename = testdata[0];
						
			if(!pagename.equals("")){
				Reporter.log("Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, RD_Pagename, pagename);
				verifyElementPresentWebdriver(attributeName_xpath, RD_Pagename, pagename);
			}
						
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}