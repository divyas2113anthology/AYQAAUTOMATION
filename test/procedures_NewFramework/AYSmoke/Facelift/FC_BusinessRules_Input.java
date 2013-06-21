package procedures_NewFramework.AYSmoke.Facelift;

import java.util.Calendar;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class FC_BusinessRules_Input extends CommonSeleniumActions implements OR {

	@Test(description="This Procedure is to perform some Operation in 'Business Rules' page")
	public void FC_BusinessRules_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Test Data in Business Rules input");
			String[]  brdatarepo = datacontainer;
			String brstartdate1 = brdatarepo[0];
			String brrecruitmentprogramdate1 = brdatarepo[1];
			String brstudentstatus = brdatarepo[2];
			String brgre = brdatarepo[3];
			String bradddocument = brdatarepo[4];
			String brtofel = brdatarepo[5];
			String brinterview = brdatarepo[6];
			String brstartdate2 = brdatarepo[7];
			String brrecruitmentprogramdate2 = brdatarepo[8];
			String brsavecontinue = brdatarepo[9];
			String brsubmitbutton = brdatarepo[10];
			Reporter.log("Retrieved Test Data in Business Rules input");
			if (!brstartdate1.equals("")) {
				
			}
			if (!brrecruitmentprogramdate1.equals("")) {
				
			}
			if (!brstudentstatus.equals("")) {
				Reporter.log("Step 3 - Enter Student Status as ("+brstudentstatus+")");
				String StudentStatus = getElementIDbyLabel("Student status", BR_StudentStatus);				
				select(StudentStatus,brstudentstatus);
			}
			if (!brgre.equals("")) {
				
			}
			if (!bradddocument.equals("")) {
				
			}
			if (!brtofel.equals("")) {
				
			}
			if (!brinterview.equals("")) {
				
			}
			if (!brstartdate2.equals("")) {
				
			}
			if (!brrecruitmentprogramdate2.equals("")) {
				
			}
			if (!brsavecontinue.equals("")) {
				Reporter.log("Step 10 - Click on ("+brsavecontinue+")Button");
				if(brsavecontinue.equalsIgnoreCase("Save")){
					click(PSD_Save);
					waitForPageToLoad();
				}else if (brsavecontinue.equalsIgnoreCase("Save & Continue")) {
					click(PSD_SaveContinue);
					waitForPageToLoad();
				}else if (brsavecontinue.equalsIgnoreCase("Reset")) {
					click(PSD_Reset);
				}
			}
			if (!brsubmitbutton.equals("")) {
				Reporter.log("Step 11 - Click on ("+brsubmitbutton+")Button");
				if (brsubmitbutton.equalsIgnoreCase("Submit Applicant")) {
					click(AW_SubAppBtn);
					waitForPageToLoad();
				}
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

