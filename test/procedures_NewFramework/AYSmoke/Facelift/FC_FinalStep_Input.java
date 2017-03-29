package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_FinalStep_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Applicant Welcome' page")
	public void FC_FinalStep_Input () throws Exception{
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
			String ClosePopup = applicantwelidatarepo[3];

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
				clickWebdriver(attributeName_cssselector,AW_SubmitAppBtn);
				waitForPageToLoadWebdriver();
			}
			if (!ClosePopup.equals("")) {
				Reporter.log("Step 4 - Proceed to close recently openned popup triggered by Business Rule");
				//recentPopupClose();
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
