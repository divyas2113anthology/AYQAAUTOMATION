package procedures_NewFramework.AYSmoke.Connect;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class CRM_EditViewContact_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Search for Contacts' page")
	public void CRM_EditViewContact_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Search for Contacts' page");
			String[]  testdata = datacontainer;
			String tab_to_click = testdata[0];
			String button_to_click = testdata[1];
			String comm_log_edit = testdata[2];
			Reporter.log("Input Test Data was retrieved for 'Search for Contacts' page");
			if (!tab_to_click.equals("")) {
				Reporter.log("Step 1 - Click on the Tab as ("+tab_to_click+") ");
				waitForElementPresentWebdriver(attributeName_linktext, tab_to_click, tab_to_click);
				clickWebdriver(attributeName_linktext, tab_to_click);
			}
			if (!button_to_click.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+button_to_click+") ");
				waitForElementPresentWebdriver(attributeName_id, "newContactComm", button_to_click);
				clickWebdriver(attributeName_id, "newContactComm");
				waitForPageToLoadWebdriver();
			}
			if (!comm_log_edit.equals("")) {
				Reporter.log("Step 3 - Proceed to Click on Edit ("+comm_log_edit+") Link");
				clickWebdriver(attributeName_xpath, "//td[text()='"+comm_log_edit+"']/preceding-sibling::td/a[text()='Edit']");
				waitForPageToLoadWebdriver();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}



