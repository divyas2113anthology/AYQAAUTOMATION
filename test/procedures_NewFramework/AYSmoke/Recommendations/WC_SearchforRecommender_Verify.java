package procedures_NewFramework.AYSmoke.Recommendations;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_SearchforRecommender_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Verification in 'Search for Recommender' page")
	public void WC_SearchforRecommender_Verify() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Search for Recommender' page");
		String[]  fpvdatarepo = datacontainer;
		String message = fpvdatarepo[0];
		String pagename = fpvdatarepo[1];
		String verifyui = fpvdatarepo[2];
		Reporter.log("Verify Test Data was retrieved for 'Search for Recommender' page");
		if (!message.equals("")) {
			Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
			waitForElementPresentWebdriver(attributeName_xpath, Ad_MessageHeading, message);
			verifyElementContainsTextWebdriver(attributeName_xpath, Ad_MessageHeading, message, message);
			
		}
		if (!pagename.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			waitForElementPresentWebdriver(attributeName_xpath, Ad_PageName, pagename);
			verifyElementContainsTextWebdriver(attributeName_xpath, Ad_PageName, pagename, pagename);
		}
		if (!verifyui.equals("")) {
			
		}
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
}