package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Imports;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ManageImportTemplate_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Manage Import Template' page")
		public void WC_ManageImportTemplate_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Manage Import Template' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Manage Import Template' page");
			if (!successmessage.equals("")) {
//				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, PageName, pagename);
				verifyElementContainsTextWebdriver(attributeName_xpath, PageName, pagename, "Page Name for Manage Import Template");
			}
			if (!verifyui.equals("")) {
//				Reporter.log("Step 3 - Verify UI was displayed correctly");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



