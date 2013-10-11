package procedures_NewFramework.AYSmoke.BridgeApplication;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class BR_ShowMatching_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Show Matching' page")
	public void BR_ShowMatching_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Show Matching' page");
			String[]  testdata = datacontainer;
			String auth_and_matchscheme = testdata[0];
			String button_to_click = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'Show Matching' page");
			if (!auth_and_matchscheme.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+auth_and_matchscheme+") Link");
				waitForElementPresentWebdriver(attributeName_id, BR_AuthSchemeSelect, auth_and_matchscheme);
				selectByVisibleTextWebdriver(attributeName_id, BR_AuthSchemeSelect, auth_and_matchscheme);
			}
			if (!button_to_click.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+button_to_click+") Link");
				if (button_to_click.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_name, BR_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (button_to_click.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_name, BRSM_SaveBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}


