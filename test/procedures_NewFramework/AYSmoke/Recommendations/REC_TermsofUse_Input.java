package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_TermsofUse_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Terms of Use' page")
	public void REC_TermsofUse_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Terms of Use' page");
		String eula = testdata[0];
		String continuebtn = testdata[1];
		Reporter.log("Input Test Data was retrieved for 'Terms of Use' page");
		if (isElementPresent(TOU_Continue)) {
			waitForElementPresentWebdriver(attributeName_xpath, TOU_Continue, "Continue Button");
		if (!eula.equals("")) {
			writeConsole("Step 1 - Chose the conformation as '"+eula+"' in 'Terms of Use' page");
			Reporter.log("Step 1 - Chose the conformation as '"+eula+"' in 'Terms of Use' page");
			if (eula.equalsIgnoreCase("Check")) {
				checkWebdriver(attributeName_xpath, TOU_CheckUncheck);
			}else if (eula.equalsIgnoreCase("UnCheck")) {
				uncheckWebdriver(attributeName_xpath, TOU_CheckUncheck);
			}		
		}
		if (!continuebtn.equals("")) {
			Reporter.log("Step 2 - Click on Continue Button in the Terms of Use Page");
			clickWebdriver(attributeName_xpath, TOU_Continue);
			waitForPageToLoadWebdriver();
		}
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}

