package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ApplicantSummary_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Applicant Summary' page")
		public void WC_ApplicantSummary_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Applicant Summary' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			recentPopupSelect_without_window_nameWebdriver();
			Reporter.log("Verify Test Data was retrieved for 'Applicant Summary' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, "//font[contains(text(),'Application System :: ')]", pagename);
				//verifyElementTextWebdriver(attributeName_xpath, "//font[contains(text(),'Application System :: ')]", pagename, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, "//font[contains(text(),'Application System :: ')]", pagename, pagename);
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 1 - Verify UI was displayed correctly");
				Thread.sleep(20000);
				driver.navigate().refresh();
				waitForElementPresentWebdriver(attributeName_xpath, APP_Status+verifyui+"')]", verifyui);
				driver.navigate().refresh();
				waitForElementPresentWebdriver(attributeName_xpath, APP_Status+verifyui+"')]", verifyui);
				driver.navigate().refresh();
				waitForElementPresentWebdriver(attributeName_xpath, APP_Status+verifyui+"')]", verifyui);
				driver.navigate().refresh();
				verifyElementContainsTextWebdriver(attributeName_xpath, APP_Status+verifyui+"')]", verifyui, verifyui);
				
			}
			//recentPopupCloseWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


