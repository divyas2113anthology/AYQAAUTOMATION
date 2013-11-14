package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Imports;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ImportResults_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Import Results' page")
		public void WC_ImportResults_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Import Results' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String successmessage = fpvdatarepo[1];
			String totalrecordsrecognized = fpvdatarepo[2];
			String validrecognizedrecords = fpvdatarepo[3];
			String invalidrecords = fpvdatarepo[4];
			Reporter.log("Verify Test Data was retrieved for 'Import Results' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, IR_PageTitle, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, IR_PageTitle, pagename, pagename);
			}
			if (!successmessage.equals("")) {
				Reporter.log("Step 2 - Verify Message("+successmessage+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, IR_MessageContent, successmessage);
				verifyElementContainsTextWebdriver(attributeName_xpath, IR_MessageContent, successmessage, successmessage);
			}
			if (!totalrecordsrecognized.equals("")) {
				Reporter.log("Step 3 - Verify total records recognized");
				waitForElementPresentWebdriver(attributeName_xpath, IR_MessageContent, totalrecordsrecognized);
				verifyElementContainsTextWebdriver(attributeName_xpath, IR_MessageContent, totalrecordsrecognized, totalrecordsrecognized);
				
			}
			if (!validrecognizedrecords.equals("")) {
				Reporter.log("Step 4 - Verify Valid recognized records");
				waitForElementPresentWebdriver(attributeName_xpath, IR_MessageContent, validrecognizedrecords);
				verifyElementContainsTextWebdriver(attributeName_xpath, IR_MessageContent, validrecognizedrecords, validrecognizedrecords);
			}
			if (!invalidrecords.equals("")) {
				Reporter.log("Step 5 - Verify invalid records");
				waitForElementPresentWebdriver(attributeName_xpath, IR_MessageContent, invalidrecords);
				verifyElementContainsTextWebdriver(attributeName_xpath, IR_MessageContent, invalidrecords, invalidrecords);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}




