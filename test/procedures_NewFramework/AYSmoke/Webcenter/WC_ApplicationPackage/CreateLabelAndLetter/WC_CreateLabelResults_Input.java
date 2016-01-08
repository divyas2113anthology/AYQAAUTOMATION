package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.CreateLabelAndLetter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_CreateLabelResults_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Create Label Results' page")
	public void WC_CreateLabelResults_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Create Label Results' Page");
			String[] testdata = datacontainer;
			String button = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'Create Label Results' Page");
			if (!button.equals("")) {
				Reporter.log("Step 1 - Click the Button as ["+button+"]");
				if (button.equalsIgnoreCase("View")) {
					waitForPageToLoadWebdriver();
					waitForElementPresentWebdriver(attributeName_xpath, CL_ViewBtn, button);
					clickWebdriver(attributeName_xpath, CL_ViewBtn);
					waitForPageToLoadWebdriver();
				} else if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


