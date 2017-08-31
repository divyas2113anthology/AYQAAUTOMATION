package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_PersonalData_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Personal Data' page")
		public void FC_PersonalData_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Personal Data' page");
			String[]  fpvdatarepo = datacontainer;
			String verifyui = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String successmessage = fpvdatarepo[2];
			String errormessage = fpvdatarepo[3];
			String VerifyQuestion=fpvdatarepo[4];
			Reporter.log("Verify Test Data was retrieved for 'Personal Data' page");
			if (!verifyui.equals("")) {
//				Reporter.log("Step 1 - Verify UI was displayed correctly");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
//				verifyElementText(PSD_PageName, pagename, "Page Name");
				waitForElementPresentWebdriverWait(attributeName_xpath, PSD_PageName+pagename+"')]", pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, PSD_PageName+pagename+"')]", pagename, pagename);
			}
			if (!successmessage.equals("")) {
				Reporter.log("Step 3 - Verify Message("+successmessage+") was displayed correctly");
//				verifyElementText(PSD_SuccessMsg, successmessage, "Sucesses Message");
				waitForElementPresentWebdriverWait(attributeName_xpath,PSD_SuccessMsg, successmessage);

				verifyElementContainsTextWebdriver(attributeName_xpath,PSD_SuccessMsg, successmessage, successmessage);

			}
			if (!errormessage.equals("")) {
				Reporter.log("Step 3 - Verify Success Message:("+errormessage+") was displayed correctl");
//				String errormessage1 = errormessage.replace(";", "\n");
				String[] errormessage1 = errormessage.split(";");
				waitForElementPresentWebdriver(attributeName_xpath, PSD_ErrorMsg, errormessage);
//				verifyElementTextWebdriver(attributeName_xpath, PSD_ErrorMsg, errormessage1, "System Message:");
				for (int i = 0; i < errormessage1.length; i++) {
					verifyElementContainsTextWebdriver(attributeName_xpath, PSD_ErrorMsg, errormessage1[i], "System Message:");
				}
			}
			if(!VerifyQuestion.equals("")){

					Reporter.log("Step 4 - Verify the ("+VerifyQuestion+") element present");
					verifyElementPresent("//div[text()='"+VerifyQuestion+"']",VerifyQuestion);

			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
