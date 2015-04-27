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
			String applicantcheck = testdata[0];
			String applicantclick = testdata[1];
			String pdf = testdata[2];
			String selectaction = testdata[3];
			String apply=testdata[4];
			String buttons=testdata[4];
						
			if (!applicantclick.equals("")) {
				Reporter.log("Click on Applicant Name");
				clickWebdriver(attributeName_xpath, RSR_ApplicantClick+applicantclick+"')]");	
				
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}
