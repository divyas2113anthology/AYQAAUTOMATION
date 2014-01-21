package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ManageConfigureDynamicText_Input extends CommonSeleniumActions implements OR {

	@Test(description="This Procedure is used to perform some operation in 'Manage Configure Dynamic Text' page")
	public void WC_ManageConfigureDynamicText_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Configure Dynamic Text' Page");
			String[] testdata = datacontainer;
			String clicklink = testdata[0];
			String dynamictext = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'Manage Configure Dynamic Text' Page");
			if (!clicklink.equals("") && !dynamictext.equals("")) {
				Reporter.log("Step 1 - Click the link as ["+dynamictext+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//*[text()='"+dynamictext+"']/following-sibling::td/a", dynamictext+clicklink);
				clickWebdriver(attributeName_xpath, "//*[text()='"+dynamictext+"']/following-sibling::td/a");
				waitForPageToLoadWebdriver(); 
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}

	}

}