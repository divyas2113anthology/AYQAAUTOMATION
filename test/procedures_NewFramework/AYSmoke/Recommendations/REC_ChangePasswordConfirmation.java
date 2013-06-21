package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class REC_ChangePasswordConfirmation extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Change Password Confirmation' page")
		public void REC_ChangePasswordConfirmation() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Change Password Confirmation' page");
			String[]  fpvdatarepo = datacontainer;
			String cpmessage = fpvdatarepo[0];
			String cppagename = fpvdatarepo[1];
			String cpcontinue = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Change Password Confirmation' page");
			if (!cpmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+cpmessage+") was displayed correctly");
				waitForElementPresentWebdriver(attributeName_xpath, CP_Message, cpmessage);
				verifyElementContainsTextWebdriver(attributeName_xpath, CP_Message, cpmessage, "Confirmation Message");
			}
			if (!cppagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+cppagename+") page");
				verifyElementText(PSD_PageName, cppagename, "Page Name");
			}
			if (!cpcontinue.equals("")) {
				Reporter.log("Step 3 - Click on continue button");
				clickWebdriver(attributeName_xpath, CP_Continue);
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


