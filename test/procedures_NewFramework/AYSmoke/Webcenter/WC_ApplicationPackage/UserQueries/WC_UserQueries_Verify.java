package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.UserQueries;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_UserQueries_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Manage Queries' page")
	public void WC_UserQueries_Verify(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage User Queries'Page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Batch Update' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 5 - Verify its navigate to ("+pagename+") page");
//				waitForElementPresentWebdriver(attributeName_xpath, SAV_PageName, pagename);
//				verifyElementTextWebdriver(attributeName_xpath, SAV_PageName, pagename, "Page Name for Search For Applicant");
				waitForText(pagename, "User Queries");
				verifyTextPresent(pagename);
			}
			if (!verifyui.equals("")) {
//				Reporter.log("Step 1 - Verify UI was displayed correctly");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
}
