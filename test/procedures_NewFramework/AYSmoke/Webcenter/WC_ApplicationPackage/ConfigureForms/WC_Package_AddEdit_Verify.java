package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Package_AddEdit_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Package' page")
		public void WC_Package_AddEdit_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Package' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Package page");
			switchToFrameNameIdWebdriver("frmContent");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, message);
				verifyElementPresentWebdriver(attributeName_xpath, QAE_Message, message);
//				waitForText(message, "Not Present");
//				verifyTextPresent(message);
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName, pagename, "Page Name for Package");
			}
			switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
