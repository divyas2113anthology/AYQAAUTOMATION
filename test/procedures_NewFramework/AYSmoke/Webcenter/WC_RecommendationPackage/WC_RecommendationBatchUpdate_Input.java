package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationBatchUpdate_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation System BatchUpdate' page")
	
	public void WC_RecommendationBatchUpdate_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Recommendation System BatchUpdate'Page");
			
			String[] testdata = datacontainer;
			String status = testdata[0];
			String submitback = testdata[1];
						
			if(!status.equals("")){
				Reporter.log("Select Status as ("+status+")");
				waitForElementPresentWebdriver(attributeName_xpath, RSFBU_Status, status);
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, RSFBU_Status, status);
			}
			if(!submitback.equals("")){
				Reporter.log("Clicking on ("+submitback+")");
				if(submitback.equalsIgnoreCase("Submit"))
					clickWebdriver(attributeName_xpath, RSFBU_SubmitBack+submitback+"')]");
				else if(submitback.equalsIgnoreCase("Back"))
					clickWebdriver(attributeName_xpath, RSFBU_SubmitBack+submitback+"')]");
				
			}
			
						
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}
