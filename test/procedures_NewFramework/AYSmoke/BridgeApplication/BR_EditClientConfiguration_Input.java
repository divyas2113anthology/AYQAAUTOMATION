package procedures_NewFramework.AYSmoke.BridgeApplication;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class BR_EditClientConfiguration_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Edit Client Configuration' page")
	public void BR_EditClientConfiguration_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Edit Client Configuration' page");
			String[]  testdata = datacontainer;
			String link_to_click = testdata[0];
			String button_to_click = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'Edit Client Configuration' page");
			if (!link_to_click.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+link_to_click+") Link");
				clickWebdriver(attributeName_partiallinktext, link_to_click);
				waitForPageToLoadWebdriver();
			}
			if (!button_to_click.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+button_to_click+") Link");
				if (button_to_click.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_name, BR_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

