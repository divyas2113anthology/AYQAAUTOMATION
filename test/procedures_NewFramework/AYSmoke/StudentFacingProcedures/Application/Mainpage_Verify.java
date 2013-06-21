package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class Mainpage_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Main' page")
		public void Mainpage_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Main' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Main' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresent(MN_PageTitle, pagename);
				verifyElementText(MN_PageTitle, pagename, "Page Name");
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}



