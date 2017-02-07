package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
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
	}

}

