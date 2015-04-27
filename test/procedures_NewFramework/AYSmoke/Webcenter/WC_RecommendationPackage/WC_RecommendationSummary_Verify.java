package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationSummary_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Recommendation Summary' page")
	
	public void WC_RecommendationSummary_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Recommendation Summary'Page");
			
			String[] testdata = datacontainer;
			String pagename = testdata[0];
			String status = testdata[1];
						
			if(!pagename.equals("")){
				Reporter.log("Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, RUS_Pagename, pagename);
				verifyElementPresentWebdriver(attributeName_xpath, RUS_Pagename, pagename);
			}
			if(!status.equals("")){
				Reporter.log("Verify the status as ("+status+")");
				waitForElementPresentWebdriver(attributeName_xpath, RS_Status, status);
				verifyElementPresentWebdriver(attributeName_xpath, RS_Status, status);
			}
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}
