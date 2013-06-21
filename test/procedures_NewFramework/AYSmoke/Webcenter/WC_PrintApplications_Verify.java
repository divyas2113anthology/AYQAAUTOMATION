package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_PrintApplications_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Print Application' page")
		public void WC_PrintApplications_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Print Application' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Print Application' page");
			if (!message.equals("")) {
//				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementContainsTextWebdriver(attributeName_xpath, PA_PageName, pagename, "Page Name for Search For Applicant");
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


