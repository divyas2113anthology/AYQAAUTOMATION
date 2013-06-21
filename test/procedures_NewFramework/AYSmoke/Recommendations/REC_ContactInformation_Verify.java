package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class REC_ContactInformation_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Contact Information' page")
		public void REC_ContactInformation_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Contact Information' page");
			String[]  testdata = datacontainer;
			String message = testdata[0];
			String pagename = testdata[1];
			String lastname = testdata[2];
			String uploadviewdeletepresent = testdata[3];
			Reporter.log("Verify Test Data was retrieved for 'Contact Information' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message ("+message+") was displayed correctly");
				verifyElementContainsTextWebdriver(attributeName_xpath, SSS_SysMsg, message, "System Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify the its navigated to the Page Name as ("+pagename+")");
				verifyElementContainsTextWebdriver(attributeName_xpath, SSS_PageName , pagename, "Page Title");
			}
			if (!lastname.equals("")) {
				Reporter.log("Step 2 - Verify the its Last name as ("+lastname+")");
				String LastName = getElementIDbyLabel("Last Name",CI_LstName);
				verifyElementValueWebdriver(attributeName_xpath, LastName, lastname, "Last Name Value");
			}
			if (!uploadviewdeletepresent.equals("")) {
				
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}





