package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class EnrollmentApplicantProcess_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Enrollment Applicant Process' page")
	public void EnrollmentApplicantProcess_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment Applicant Process page");
			String[]  mainidatarepo = datacontainer;
			String enrollment = mainidatarepo[0];
			String printclose = mainidatarepo[1];	
			Reporter.log("Input Test Data was retrieved for 'Enrollment Applicant Process' page");
			if (!enrollment.equals("")) {
				Reporter.log("Click on ("+enrollment+") Link");
				waitForElementPresentWebdriver(attributeName_partiallinktext, enrollment, enrollment);
				clickWebdriver(attributeName_partiallinktext, enrollment);
				waitForPageToLoadWebdriver();
			}
			if (!printclose.equals("")) {
				Reporter.log("Click on ("+printclose+") Event Package");
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

}

