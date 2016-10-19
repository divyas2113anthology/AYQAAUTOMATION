package procedures_NewFramework.AYSmoke.BridgeEvent;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class BR_InviteToEvent_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Invite To Event' page")
		public void BR_InviteToEvent_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Invite To Event' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String filtername = fpvdatarepo[2];
			String filterfolder = fpvdatarepo[3];
			String filterdescription = fpvdatarepo[4];
			String recordcount = fpvdatarepo[5];
			Reporter.log("Verify Test Data was retrieved for 'Invite To Event' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
//				waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, successmessage);
//				verifyElementPresentWebdriver(attributeName_xpath, QAE_Message, successmessage);
				waitForPageToLoadWebdriver();
				writeConsole(successmessage);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, ASR_Pagename, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, ASR_Pagename, pagename, "Page Name for Invite To Event");
			}
			if (!filtername.equals("")) {
				Reporter.log("Step 3 - Verify Filter Name Value as ("+filtername+")");
				verifyElementValueWebdriver(attributeName_name, "FilterName", filtername, "Filter Name");
			}
			if (!filterfolder.equals("")) {
				Reporter.log("Step 4 - Verify Filter Folder Value as ("+filterfolder+")");
				verifyElementValueWebdriver(attributeName_name, "FilterFolder", filterfolder, "Filter Folder");
			}
			if (!filterdescription.equals("")) {
				Reporter.log("Step 5 - Verify Filter Description Value as ("+filterdescription+")");
				verifyElementValueWebdriver(attributeName_name, "FilterDesc", filterdescription, "Filter Description");
			}
			if (!recordcount.equals("")) {
				Reporter.log("Step 6 - Verify Record Count Value as ("+recordcount+")");
				verifyElementValueWebdriver(attributeName_name, "RecordCount", recordcount, "Record Count");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



