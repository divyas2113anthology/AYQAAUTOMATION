package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ManageQueries;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_AddInputCriteria_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Add Input Criteria' page")
		public void WC_AddInputCriteria_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Add Input Criteria' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyvalues = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Add Input Criteria' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, "//*[contains(text(),'"+message+"')]", "Display Manage Users Message");
				verifyElementPresentWebdriver(attributeName_xpath, "//*[contains(text(),'"+message+"')]", "Display Manage Users Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, BP_PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, BP_PageName, pagename, "Page Name for Manage Users");
			}
			if (!verifyvalues.equals("")) {
				Reporter.log("Step 3 - Verify the list values as ["+verifyvalues+"]");
				clickWebdriver(attributeName_xpath, MQ_ValueButton);
				waitForElementPresentWebdriver(attributeName_xpath, MQ_ValuesDropdown, verifyvalues);
				verifyDropDownContainsOptionsWebdriver(attributeName_xpath, MQ_ValuesDropdown, verifyvalues, verifyvalues);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


