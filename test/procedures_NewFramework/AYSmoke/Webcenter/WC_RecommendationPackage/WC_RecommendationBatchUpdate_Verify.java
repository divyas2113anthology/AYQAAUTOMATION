package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationBatchUpdate_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Recommendation System BatchUpdate' page")
	
	public void WC_RecommendationBatchUpdate_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Recommendation System BatchUpdate'Page");
			
			String[] testdata = datacontainer;
			String pagename = testdata[0];
			System.out.println("=========="+pagename);
			if(!pagename.equals("")){
				Reporter.log("Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, RSFBU_Pagename, pagename);
				verifyElementPresentWebdriver(attributeName_xpath, RSFBU_Pagename, pagename);
			}
						
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}

