package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.SelectanAction;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_RunReportResults_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Run Report Results' page")
	public void WC_RunReportResults_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Run Report Results' Page");
			String[] testdata = datacontainer;
			String button = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'Run Report Results' Page");
			if (!button.equals("")) {
				Reporter.log("Click the button as ["+button+"]");
				if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, IE_BackBtn);
					waitForPageToLoadWebdriver();
				} else if (button.equalsIgnoreCase("View")) {
					waitForElementPresentWebdriver(attributeName_xpath, BP_ViewBtn, button);
					clickWebdriver(attributeName_xpath, BP_ViewBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


