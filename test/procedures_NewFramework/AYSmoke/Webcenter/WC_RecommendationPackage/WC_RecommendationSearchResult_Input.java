package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationSearchResult_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation Search Result' page")
	
	public void WC_RecommendationSearchResult_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation Search Result'Page");
			String[] testdata = datacontainer;
			String operationtoperform = testdata[0];
			String applicantcheck = testdata[1];
			String applicantclick = testdata[2];
			String pdf = testdata[3];
			String selectaction = testdata[4];
			String apply = testdata[5];
			String buttons = testdata[6];
			
			if (!applicantclick.equals("")) {
				Reporter.log("Click on Rule name ["+applicantclick+"]");
				waitForElementPresentWebdriver(attributeName_xpath, ES_ApplicantClick+applicantclick+"')]", applicantclick);
				clickWebdriver(attributeName_xpath,ES_ApplicantClick+applicantclick+"')]" );
				recentPopupSelectWebdriver("Recommendation");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}
