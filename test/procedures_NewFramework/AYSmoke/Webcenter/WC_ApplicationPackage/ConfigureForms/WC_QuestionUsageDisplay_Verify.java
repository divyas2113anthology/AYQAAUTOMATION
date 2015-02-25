package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_QuestionUsageDisplay_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Usage Question Display' page")
		public void WC_QuestionUsageDisplay_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data 'Usage Question Display' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String verifyui = fpvdatarepo[1];
			String message = fpvdatarepo[2];
						
			Reporter.log("Verify Test Data was retrieved for 'Usage Question Display' page");
			recentPopupSelectWebdriver("Question");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, PA_PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName, pagename, pagename);
			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 2 - Verify the Usage page");
				System.out.println("aaaa");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_UsageQuestion, verifyui, verifyui);
			}
			
			if (!message.equals("")) {
				Reporter.log("Step 3 - Verify Message("+message+") was displayed correctly");
				waitForText(message, "Not Present");
				verifyTextPresent(message);
			}
			recentPopupCloseWebdriver();
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


