package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class EnrollmentSubmissionComplete_Verify extends CommonSeleniumActions implements OR {	

	@Test(description="This Procedure is to perform some Verification in 'Education Background' page")
	public void EnrollmentSubmissionComplete_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("EducationBackgroundForm_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Education Background' page");
			String[]  educationvdatarepo = datacontainer;
			String pagename = educationvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Education Background' page");
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				//waitForText(pagename, "Submission Not Present");
				waitForPageToLoadWebdriver();
				writeConsole(pagename);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}

