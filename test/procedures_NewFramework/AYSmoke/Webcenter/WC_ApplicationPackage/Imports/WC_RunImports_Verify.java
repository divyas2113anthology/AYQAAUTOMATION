package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Imports;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_RunImports_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Run Import' page")
		public void WC_RunImports_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Run Import' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
//			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Run Import' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				waitForElementPresentWebdriverWait(attributeName_xpath, IR_MessageContent, message);
				verifyElementContainsTextWebdriver(attributeName_xpath, IR_MessageContent, message, message);
				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForPageToLoadWebdriver();
				String []Pagename = pagename.split(":");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName+Pagename[0]+"')]", Pagename[0], "Page Name for Run Import");
			}
//			if (verifyui.equals("")) {
//				Reporter.log("Step 3 - Verify the UI information in Add Import page");
//			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

