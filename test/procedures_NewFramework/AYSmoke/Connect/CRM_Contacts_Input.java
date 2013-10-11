package procedures_NewFramework.AYSmoke.Connect;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class CRM_Contacts_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Contacts Overview' page")
	public void CRM_Contacts_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Contacts Overview' page");
			String[]  testdata = datacontainer;
			String link_to_click = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'Contacts Overview' page");
			if (!link_to_click.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+link_to_click+") Link");
				waitForElementPresentWebdriver(attributeName_linktext, link_to_click, link_to_click);
				clickWebdriver(attributeName_linktext, link_to_click);
				waitForPageToLoadWebdriver();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

