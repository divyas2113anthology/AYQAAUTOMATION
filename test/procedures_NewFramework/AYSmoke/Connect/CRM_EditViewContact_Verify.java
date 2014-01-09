package procedures_NewFramework.AYSmoke.Connect;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.sun.corba.se.impl.io.FVDCodeBaseImpl;

import or.OR;
import processor.CommonSeleniumActions;

public class CRM_EditViewContact_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Verification in 'Edit/View Contact' page")
		public void CRM_EditViewContact_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Edit/View Contact' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String message = fpvdatarepo[1];
			String contactedit = fpvdatarepo[2];
			String datasource = fpvdatarepo[3];
			String sourcecode = fpvdatarepo[4];
			String editeddate = fpvdatarepo[5];
			String editedby = fpvdatarepo[6];
			Reporter.log("Verify Test Data was retrieved for 'Edit/View Contact' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify Navigate to ("+pagename+") page correctly");
				waitForElementPresentWebdriver(attributeName_xpath, "//h1[contains(text(),'View/Edit Contact')]", pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, "//h1[contains(text(),'View/Edit Contact')]", pagename, pagename);
			}
			if (!message.equals("")) {
				Reporter.log("Step 2 - Verify message was displayed ("+message+") correctly");
				waitForElementPresentWebdriver(attributeName_xpath, "//div[@class='simplemessage-error']", message);
				verifyElementContainsTextWebdriver(attributeName_xpath, "//div[@class='simplemessage-error']", message, message);
			}
			if (!contactedit.equals("")) {
				Reporter.log("Step 3 - Verify the exact contact edit log ("+contactedit+") correctly");
				verifyAllUserTableCellValuePresentInColumn(contactedit, "Contact Edit");
			}
			if (!datasource.equals("")) {
				Reporter.log("Step 4 - Verify the exact contact edit log ("+datasource+") correctly");
				verifyAllUserTableCellValuePresentInColumn(datasource, "Datasource");
			}
			if (!sourcecode.equals("")) {
				Reporter.log("Step 5 - Verify the exact contact edit log ("+sourcecode+") correctly");
				verifyAllUserTableCellValuePresentInColumn(sourcecode, "Source Code");
			}
			if (!editeddate.equals("")) {
				Reporter.log("Step 6 - Verify the exact contact edit log ("+editeddate+") correctly");
				verifyAllUserTableCellValuePresentInColumn(editeddate, "Edited Date");
			}
			if (!editedby.equals("")) {
				Reporter.log("Step 7 - Verify the exact contact edit log ("+editedby+") correctly");
				verifyAllUserTableCellValuePresentInColumn(editedby, "Edited By");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
