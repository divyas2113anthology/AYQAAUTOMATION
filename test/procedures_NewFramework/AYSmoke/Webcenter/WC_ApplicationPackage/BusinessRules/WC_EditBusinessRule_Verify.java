package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.BusinessRules;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EditBusinessRule_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Configure Business Rules' page")
		public void WC_EditBusinessRule_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Configure Business Rules' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Configure Business Rules' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				//verifyElementText(PSD_SuccessMsg, message, "Sucesses Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				String PageName[] = pagename.split(" ");
				waitForElementPresentWebdriver(attributeName_xpath, PA_PageName+PageName[0]+"')]", pagename);
				writeConsole("Hi");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName+PageName[0]+"')]", pagename, "Page Name for Business Rule");
			}
			
			
			if (!verifyui.equals("")) {
				Reporter.log("Step 2 - Verify UI having the Message("+verifyui+")");
				//waitForElementPresentVerifyContainsTextWebdriver(attributename, attributevalue, expectedtext, elementname);
				verifyElementContainsTextWebdriver(attributeName_xpath, Message+verifyui+"')]", verifyui, verifyui);
			
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}