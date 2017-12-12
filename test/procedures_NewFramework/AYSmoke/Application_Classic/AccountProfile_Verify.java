package procedures_NewFramework.AYSmoke.Application_Classic;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class AccountProfile_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Account Profile' page")
		public void AccountProfile_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Account Profile' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String verifyui = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Account Profile' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath,AP_PageTitle, pagename);
				verifyElementTextWebdriver(attributeName_xpath,AP_PageTitle, pagename, pagename);
			}
			if (!verifyui.equals("")) {
//				Reporter.log("Step 1 - Verify UI was displayed correctly");
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}


