package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class REC_MiddleSchoolSupp_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Middle School Supp' page")
		public void REC_MiddleSchoolSupp_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Middle School Supp' page");
			String[]  testdata = datacontainer;
			String message = testdata[0];
			String pagename = testdata[1];
			Reporter.log("Verify Test Data was retrieved for 'Middle School Supp' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message ("+message+") was displayed correctly");
				verifyElementContainsTextWebdriver(attributeName_xpath, SSS_SysMsg, message, "System Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify the its navigated to the Page Name as ("+pagename+")");
				verifyElementContainsTextWebdriver(attributeName_xpath, SSS_PageName , pagename, "Page Title");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}




