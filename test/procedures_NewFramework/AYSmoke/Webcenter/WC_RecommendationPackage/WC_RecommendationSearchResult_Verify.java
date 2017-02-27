package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationSearchResult_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Recommendation Search Results' page")
	
	public void WC_RecommendationSearchResult_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Recommendation Search Results'Page");
			
			String[] testdata = datacontainer;
			String pagename = testdata[0];
						
			if(!pagename.equals("")){
				Reporter.log("Verify its navigate to ("+pagename+") page");
				String Pagename[] = pagename.split(" ");
				waitForElementPresentWebdriver(attributeName_xpath, SRV_PageName+Pagename[0]+"')]", pagename);
				verifyElementPresentWebdriver(attributeName_xpath, SRV_PageName+Pagename[0]+"')]", pagename);
			}
						
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}
