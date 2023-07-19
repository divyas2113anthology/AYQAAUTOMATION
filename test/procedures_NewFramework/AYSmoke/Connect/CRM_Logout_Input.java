package procedures_NewFramework.AYSmoke.Connect;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class CRM_Logout_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Connect Login' page")
	public void CRM_Logout_Input () throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Connect Login' page");
		String logout = parameterValuesArray[0];
		Reporter.log("Input Test Data was retrieved for 'Connect Login' page");
		if (!logout.equals("")) {
			if (logout.equalsIgnoreCase("logout") ) {
				Reporter.log("Step 1 - Click on 'Logout' Button");
				mouseOverWebdriver(attributeName_xpath,"//div[text()='jyothsna reddy1']"); //change xpath by saran kumar 10th july 2023
				mouseOverWebdriver(attributeName_xpath,"//a[text()='Logout']");
				waitForElementPresentWebdriver(attributeName_xpath,"//a[text()='Logout']", logout);
				clickWebdriver(attributeName_xpath,"//a[text()='Logout']");
				waitForPageToLoadWebdriver();
			} else if (logout.equalsIgnoreCase("Logout_jyothsna reddy")) { // add new code and xpath by saran kumar 10 july 2023
				mouseOverWebdriver(attributeName_xpath,"//div[text()='jyothsna reddy']");
				mouseOverWebdriver(attributeName_xpath,"//a[text()='Logout']");
				waitForElementPresentWebdriver(attributeName_xpath,"//a[text()='Logout']", logout);
				clickWebdriver(attributeName_xpath,"//a[text()='Logout']");
				waitForPageToLoadWebdriver();
			}

		}

		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
