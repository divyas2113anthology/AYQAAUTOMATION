package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import java.io.IOException;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;


public class EnrollmentSubmissionComplete_Input extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Operation in 'Enrollment Submission Complete' page")
	public void EnrollmentSubmissionComplete_Input() throws IOException, RowsExceededException, BiffException, WriteException{
		try {		
				writeDetails();
				String[]  accprofileidatarepo = datacontainer;
				Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment Submission Complete' page");
				String printclose = accprofileidatarepo[0];
				Reporter.log("Input Test Data was retrieved for 'Enrollment Submission Complete' page");
				if (!printclose.equals("")) {
					Reporter.log("Step 1 - Click on '"+printclose+"' button");
					if (printclose.equalsIgnoreCase("Print")) {
						clickWebdriver(attributeName_xpath, EFP_PrintBtn);
						waitForPageToLoad();	
					}else if (printclose.equalsIgnoreCase("Close Window")) {
						clickWebdriver(attributeName_xpath, EFP_CloseWindowBtn);
//						waitForPageToLoad();
						selectMainWindowWebdriver();
					}else if (printclose.equalsIgnoreCase("Close")) {
						closeWindowWebdriver();
//						waitForPageToLoad();
//						selectMainWindowWebdriver();
					}
				}
				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}


