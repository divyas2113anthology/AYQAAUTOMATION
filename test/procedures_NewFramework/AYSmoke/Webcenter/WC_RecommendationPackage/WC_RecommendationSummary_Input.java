package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationSummary_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation Summary' page")
	
	public void WC_RecommendationSummary_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Recommendation Summary'Page");
			
			String[] testdata = datacontainer;
			String status = testdata[0];

						
			if(!status.equals("")){
				Reporter.log("Clicking on the status as ("+status+")");
				waitForElementPresentWebdriver(attributeName_xpath, RS_Status, status);
				clickWebdriver(attributeName_xpath, RS_Status);
			}
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}

