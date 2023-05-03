package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class ApplicantWelcome_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Applicant Welcome' page")
		public void ApplicantWelcome_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Applicant Welcome' page");
			String[]  fpvdatarepo = datacontainer;
			String pagename = fpvdatarepo[0];
			String verifyui = fpvdatarepo[1];
			String section = fpvdatarepo[2];
			String presentnot = fpvdatarepo[3];
			Reporter.log("Verify Test Data was retrieved for 'Applicant Welcome' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+pagename+") page");
				waitForPageToLoadWebdriver();
				writeConsole(pagename);
//				verifyElementText(PSD_PageName, pagename, "Page Name");
			}
			if (!verifyui.equals("")) {
//				Reporter.log("Step 2 - Verify UI was displayed correctly");
			}
			if (!section.equalsIgnoreCase("")) {
				
			}
			if (!presentnot.equalsIgnoreCase("")) {
				
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");

// Add saran kumar 29 nov 2022
	 finally {
		// An 'Assert.fail' statement would cause the procedure to fail but it would also stop the procedure from executing
		// further.  Instead of failing a procedure (with the 'Assert.fail' statement) for every mismatch, we are failing it once
		// at its end.  Every mismatch would be recorded in the report via. the 'writeFailure' function.  Since, in the
		// 'writeFailure' function, the 'global variable', 'globalFailureNotification' would be given a value, the condition,
		// 'globalFailureNotification' is not equal to "empty"
		// would denote that there was a mismatch.  In that case, the procedure would be failed via. the 'Assert.fail' statement
		// After failing the procedure, the 'globalFailureNotification' variable would again be set to "empty"
		ifAppropriateFailTheProcedure();
	}
	}

}

