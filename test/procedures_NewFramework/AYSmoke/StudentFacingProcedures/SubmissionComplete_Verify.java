package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class SubmissionComplete_Verify extends CommonSeleniumActions implements	OR {
	
	
	@Test(description="This Procedure is to perform some Verification in 'Submission Complete!' page")
	public void SubmissionComplete_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Submission Complete!' page");
			String[]  subcompletevdatarepo = datacontainer;
			String subpagename = subcompletevdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Submission Complete!' page");
			if (!subpagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+subpagename+") page");
				if (selenium.isTextPresent(subpagename)) {
					Reporter.log("Its navigate to ["+subpagename+"]age");
				} else {
					writeFailure("Its not navigate to ["+subpagename+"] page");
				}
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}


}
