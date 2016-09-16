package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_Welcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Welcome' page")
	public void REC_Welcome_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Welcome' page");
		String logoutoverview = testdata[0];
		String section = testdata[1];
		Reporter.log("Input Test Data was retrieved for 'Welcome' page");
		if (!logoutoverview.equals("")) {
			Reporter.log("Step 1 - Click on '"+logoutoverview+"' link in Welcome Page");
			if (logoutoverview.equalsIgnoreCase("Log Out")) {
				waitForElementPresentWebdriver(attributeName_partiallinktext, logoutoverview, "Log Out");
				clickWebdriver(attributeName_partiallinktext, logoutoverview);
				waitForElementPresentWebdriver(attributeName_xpath, "//td[@class='HelpBoxes']/b", "Successful Logout!");
//				verifyTextPresent("Successful Logout!");
//				waitForPageToLoadWebdriver();
			}else if (logoutoverview.equalsIgnoreCase("More Info")) {
				clickWebdriver(attributeName_partiallinktext, logoutoverview);
				recentPopupSelectWebdriver("More Info");
			}		
		}
		if (!section.equals("")) {
			Reporter.log("Step 2 - Click on '"+section+"' link in Welcome Page");
			waitForElementPresentWebdriver(attributeName_partiallinktext, section, "Side Menu Section");
			clickWebdriver(attributeName_partiallinktext, section);
//			waitForPageToLoadWebdriver();
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
