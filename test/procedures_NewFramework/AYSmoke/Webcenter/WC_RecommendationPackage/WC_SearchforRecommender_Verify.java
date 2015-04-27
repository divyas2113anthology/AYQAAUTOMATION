package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_SearchforRecommender_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Verification in 'Search for Recommendation' page")
	public void WC_SearchforRecommender_Verify() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Search for Recommendation' page");
		String[]  fpvdatarepo = datacontainer;
		String message = fpvdatarepo[0];
		String pagename = fpvdatarepo[1];
		String verifyui = fpvdatarepo[2];
		Reporter.log("Verify Test Data was retrieved for 'Search for Enrollment' page");
		
		if (!pagename.equals("")) {
			Reporter.log("Verify its navigate to ("+pagename+") page");
			waitForElementPresentWebdriver(attributeName_xpath, SRV_PageName, pagename);
			verifyElementPresentWebdriver(attributeName_xpath, SRV_PageName, pagename);	}
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}

	}
}
