package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationDetails_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation Details' page")
	
	public void WC_RecommendationDetails_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation Details'Page");
			String[] testdata = datacontainer;
			String editprofile = testdata[0];
			String email = testdata[1];
			String submitdate = testdata[2];
			String status = testdata[3];
			String viewinpdf=testdata[4];
			String viewfullrecommendation=testdata[5];
			String linktoclick=testdata[6];
			String closewindow=testdata[7];
			
			if (!status.equals("")) {
				Reporter.log("Click on Status");
				clickWebdriver(attributeName_xpath, RSR_ApplicantClick+status+"')]");	
				
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}

