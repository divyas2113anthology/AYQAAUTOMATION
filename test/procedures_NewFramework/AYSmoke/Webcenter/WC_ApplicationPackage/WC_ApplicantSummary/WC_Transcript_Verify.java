package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;


import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_Transcript_Verify extends CommonSeleniumActions implements OR{
	
	@Test(description="This Procedure is to perform some Verification in 'Transcript' page")
	
	public void WC_Transcript_Verify() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Transcript' page");
		String[]  fpvdatarepo = datacontainer;
		String pagename = fpvdatarepo[0];
		Reporter.log("Verify Test Data was retrieved for 'Transcript' page");
		
		if (!pagename.equals("")) {
			waitForPageToLoadWebdriver();
			Reporter.log("Verify its navigate to ("+pagename+") page");
			waitForElementPresentWebdriver(attributeName_xpath, AS_pagename, pagename);
			verifyElementPresentWebdriver(attributeName_xpath, AS_pagename, pagename);
		}
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}

	}
}
