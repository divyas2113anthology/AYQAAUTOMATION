package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FinalStep_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Final Step: Signature Page' page")
	public void FinalStep_Input () throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Final Step' page");
			String[]  applicantwelidatarepo = datacontainer;
			String fullname = applicantwelidatarepo[0];
			String date = applicantwelidatarepo[1];
			String button = applicantwelidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Final Step' page");
	//		selectMainWindow();
			if (!fullname.equals("")) {
				Reporter.log("Step 1 - Proceed to Enter on ("+fullname+")");
					sendKeys(attributeName_cssselector,FS_FullName, fullname);
			}
			if (!date.equals("")) {
				Reporter.log("Step 2 - Proceed to Enter on ("+date+")");
				sendKeys(attributeName_cssselector,FS_Date, date);
			}

			if (!button.equals("")) {
				Reporter.log("Step 3 - Proceed to Click on ("+button+") Button");
				if (button.equalsIgnoreCase("Continue")) {
					clickWebdriver(attributeName_xpath, SP_Submit);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Submit")) {
					clickWebdriver(attributeName_xpath, FS_SubmitApp);
					waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}


