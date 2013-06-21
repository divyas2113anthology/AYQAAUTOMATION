package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Question_AddEdit_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Question Add/Edit' page")
		public void WC_Question_AddEdit_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Question Add/Edit' page");
			String[]  fpvdatarepo = datacontainer;
			String message = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Question Add/Edit' page");
			if (!message.equals("")) {
//				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementContainsTextWebdriver(attributeName_xpath, QAE_PageName, pagename, "Page Name for Question Add/Edit");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
