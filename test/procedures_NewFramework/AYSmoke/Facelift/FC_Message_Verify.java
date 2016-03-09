package procedures_NewFramework.AYSmoke.Facelift;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class FC_Message_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Message' page")
		public void FC_Message_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Message' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String verifyui = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Message' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				//verifyElementText(PSD_SuccessMsg, message, "Sucesses Message");
			}
			
			if (!verifyui.equals("")) {
				Reporter.log("Step 2 - Verify UI having the Message("+verifyui+")");
				//waitForElementPresentVerifyContainsTextWebdriver(attributename, attributevalue, expectedtext, elementname);
				//recentPopupSelectWebdriver("Message");
				waitForElementPresentWebdriverWait(attributeName_xpath, Message+verifyui+"')]", verifyui);
				verifyElementContainsTextWebdriver(attributeName_xpath, Message+verifyui+"')]", verifyui, verifyui);
			
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

