package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ClientSearchResults_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Client Search' page")
	public void MC_ClientSearchResults_Verify(){
		try{
			Reporter.log("Proceed to verify navigate to quick view results screen in Maintenance center");
			String[] testdata = datacontainer;
			String page = testdata[0];
			Reporter.log("Check navigate to quick view results screen Maintenance center");
			if (!page.equals("")) {
				Reporter.log("Step 1 - Verify page is ["+page+"]");
				waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='AYInstructions']/following-sibling::font", page);
//				verifyTextPresent(page);	
				verifyElementContainsTextWebdriver(attributeName_xpath, "//div[@id='AYInstructions']/following-sibling::font", page, "Quick View Results");
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage()); }
	}
}
