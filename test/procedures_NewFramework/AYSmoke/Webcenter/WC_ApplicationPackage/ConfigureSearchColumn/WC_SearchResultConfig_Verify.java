package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureSearchColumn;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_SearchResultConfig_Verify extends CommonSeleniumActions implements OR{

	@Test(description="This Procedure is to perform some Verification in 'SearchResultConfig' page")
	public void WC_SearchResultConfig_Verify() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'SearchResultConfig' page");
		String[]  fpvdatarepo = datacontainer;
		String message = fpvdatarepo[0];
		String pagename = fpvdatarepo[1];
		String verifyui = fpvdatarepo[2];
		Reporter.log("Verify Test Data was retrieved for 'SearchResultConfig' page");
		if (!message.equals("")) {
			Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
			//waitForElementPresentWebdriver(attributeName_xpath, CSC_FormHeading+message+"')]", message);
			isElementPresentWebdriver(attributeName_xpath,"//font[contains(text(),'Search Result Config was successfully Updated')]");
			//verifyElementContainsTextWebdriver(attributeName_xpath, "//font[contains(text(),'Search Result Config was successfully Updated')]", message, message);

			//Search Result Config was successfully Updated
		}
		if (!pagename.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			waitForElementPresentWebdriver(attributeName_xpath, Ad_PageName, pagename);
			verifyElementContainsTextWebdriver(attributeName_xpath, Ad_PageName, pagename, "SearchResultConfig");
		}
		if (!verifyui.equals("")) {
			Reporter.log("Step 3 - Verify the UI information in SearchResultConfig page");
			verifySelectNotContainsOptionsWebdriver(attributeName_xpath, CSC_Select, verifyui,verifyui);
		}
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
}

}
