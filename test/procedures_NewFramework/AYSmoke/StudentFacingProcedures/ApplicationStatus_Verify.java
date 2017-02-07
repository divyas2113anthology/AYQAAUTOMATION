package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class ApplicationStatus_Verify extends CommonSeleniumActions implements	OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Application Status: Ready for Submission' page")
	public void ApplicationStatus_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Application Status: Ready for Submission' page");
			String[]  appstatusvdatarepo = datacontainer;
			String stapagename = appstatusvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Application Status: Ready for Submission' page");
			if (!stapagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+stapagename+") page");
				if (selenium.isTextPresent(stapagename)) {
					Reporter.log("Its navigate to ["+stapagename+"]age");
				} else {
					writeFailure("Its not navigate to ["+stapagename+"] page");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

}
