package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.PostMessage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_PostMessage_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Verification in 'Post Message' page")
	public void WC_PostMessage_Verify() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Post Message' page");
		String[]  fpvdatarepo = datacontainer;
		String message = fpvdatarepo[0];
		String pagename = fpvdatarepo[1];
		String verifyui = fpvdatarepo[2];
		Reporter.log("Verify Test Data was retrieved for 'Post Message' page");
		if (!message.equals("")) {
			Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
			waitForElementPresentWebdriver(attributeName_xpath, Ad_PageName, message);
			verifyElementContainsTextWebdriver(attributeName_xpath, Ad_PageName, message, message);
			
		}
		if (!pagename.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			waitForElementPresentWebdriver(attributeName_xpath, Ad_PageName, pagename);
			verifyElementContainsTextWebdriver(attributeName_xpath, Ad_PageName, pagename, pagename);
		}
		if (!verifyui.equals("")) {
			
		}
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
}


}
