package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Exports;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Export_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Exports' page")
	public void WC_Export_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Exports' Page");
			String[] testdata = datacontainer;
			String selectname = testdata[0];
			String checkbox = testdata[1];
			String actionhistory = testdata[2];
			String actionlabel = testdata[3];
			String button = testdata[4];
			Reporter.log("Input Test Data was retrieved for 'Run Imports' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!selectname.equals("")) {
				waitForPageToLoadWebdriver();
				Reporter.log("Step 1 - Perform the operation to click the Radio Button as ["+selectname+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//td[contains(text(),'\"+selectname+\"')]/preceding-sibling::td/input", "Export Page");
				clickWebdriver(attributeName_xpath, "//td[contains(text(),'"+selectname+"')]/preceding-sibling::td/input");
				//td[contains(text(),'TestingEnrollmentExport')]/preceding-sibling::td/input
			}			
			if (!checkbox.equals("")) {
				Reporter.log("Step 2 - Select the column header as ["+checkbox+"]");
				clickWebdriver(attributeName_xpath, RPT_CheckBox+checkbox+"')]");
			
			}
			if (!actionhistory.equals("")) {
				Reporter.log("Step 3 - Select an Rule as ["+actionhistory+"]");
				
			}			
			if (!actionlabel.equals("")) {
				Reporter.log("Step 4 - Select the Column Header as ["+actionlabel+"]");
			}
			if (!button.equals("")) {
				Reporter.log("Step 5 - Click button as ["+button+"]");
				if (button.equalsIgnoreCase("Run")) {
					waitForElementPresentWebdriverWait(attributeName_xpath, RPT_RunBtn,button);
					clickWebdriver(attributeName_xpath, RPT_RunBtn);
				}
//				clickWebdriver(attributeName_name, "Transferx");
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
