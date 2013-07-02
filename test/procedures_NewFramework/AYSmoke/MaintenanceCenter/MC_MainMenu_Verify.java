package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_MainMenu_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Main Menu' page")
	public void MC_MainMenu_Verify(){
		try{
			Reporter.log("Proceed to Manage client screen in Maintenance center");
			String[] testdata = datacontainer;
			String page = testdata[0];
			Reporter.log("Check in manage client screen in Maintenance center");
			if (!page.equals("")) {
				Reporter.log("Step 1 - Verify page name is  ["+page+"]");
				if (page.contains("Applicant Lookup")) {
					verifyTextPresent(page);
//					waitForElementPresentVerifyContainsTextWebdriver(attributeName_xpath, "//font[contains(text(),'Applicant Lookup')]", page, "Page Name");
//					verifyElementContainsTextWebdriver(attributeName_xpath, "//font[contains(text(),'Applicant Lookup')]", page, "Page Name");
//				}else if (page.contains("Manage")) {
//					waitForElementPresentVerifyContainsTextWebdriver(attributeName_xpath, "//div[@id='AYInstructions']/following-sibling::font", page, "Page Name");
				}else{
					waitForElementPresentVerifyContainsTextWebdriver(attributeName_xpath, "//div[@id='AYInstructions']/following-sibling::font", page, "Page Name");
				}
			}
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}
