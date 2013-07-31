package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.EventModuleManageGroups;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddEditGroup_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Add/Edit Group' page")
		public void WC_AddEditGroup_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Add/Edit Group' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String eventincludegroup = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Add/Edit Group' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				waitForText(successmessage, successmessage);
				verifyTextPresent(successmessage);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, ASR_Pagename, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, ASR_Pagename, pagename, "Page Name for Applicant Search Results");
			}
			if (!eventincludegroup.equals("")) {
				Reporter.log("Step 3 - Verify Event Include Group as ("+eventincludegroup+")");
				String ScheduleEventTitle = Runtimedataread(eventincludegroup);
				waitForElementPresentWebdriver(attributeName_xpath, "//font[contains(text(),'"+ScheduleEventTitle+"')]", eventincludegroup);
				verifyElementPresentWebdriver(attributeName_xpath, "//font[contains(text(),'"+ScheduleEventTitle+"')]", eventincludegroup);
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}





