package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_TestScore_Verify extends CommonSeleniumActions implements OR{
	
	@Test(description="This Procedure is to perform some Verification in 'TestScore' page")
	
	public void WC_TestScore_Verify() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'TestScore' page");
		String[]  fpvdatarepo = datacontainer;
		String message = fpvdatarepo[0];
		String pagename = fpvdatarepo[1];
		String verifyui = fpvdatarepo[2];
		
		Reporter.log("Verify Test Data was retrieved for 'TestScore' page");
		
		if (!pagename.equals("")) {
			Reporter.log("Verify its navigate to ("+pagename+") page");
			waitForElementPresentWebdriver(attributeName_xpath, AS_TestScorepagename, pagename);
			verifyElementPresentWebdriver(attributeName_xpath, AS_TestScorepagename, pagename);	}
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}

	}
}

