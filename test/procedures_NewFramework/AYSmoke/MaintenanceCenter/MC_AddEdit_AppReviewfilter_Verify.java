package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class MC_AddEdit_AppReviewfilter_Verify extends CommonSeleniumActions implements OR {
	@Test(description="This Procedure is to perform Verification in 'Add/Edit AppReviewfilter' page")
	public void  MC_AddEdit_AppReviewfilter_Verify() {
		// TODO Auto-generated constructor stub
		try{
			Reporter.log("Proceed to verify application package is saved in Maintenance center");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String pagename = testdata[1];
			String verifyui = testdata[2];
			Reporter.log("Verify Test Data was retrieved for 'Add/Edit AppReviewfilter' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, CSC_FormHeading+"')]", message);
				verifyElementContainsTextWebdriver(attributeName_xpath, CSC_FormHeading+"')]", message, message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, Ad_PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, Ad_PageName, pagename, "Edit AppReview Filter");
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 3 - Verify the UI information in SearchResultConfig page");
				verifyElementContainsTextWebdriver(attributeName_xpath, Ad_MessageHeading, verifyui, verifyui);
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage()); }
	}


	}


