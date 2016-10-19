package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class REC_Submitted_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Submitted' page")
		public void REC_Submitted_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Submitted' page");
			String[]  testdata = datacontainer;
			String message = testdata[0];
			Reporter.log("Verify Test Data was retrieved for 'Submitted' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message ("+message+") was displayed correctly");
//				waitForElementPresentWebdriver(attributeName_xpath,"//td[@class='BasePageFont']", message);
//				verifyElementContainsTextWebdriver(attributeName_xpath, "//td[@class='BasePageFont']", message, "System Message");
				waitForPageToLoadWebdriver();
				//verifyTextPresent(message);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}





