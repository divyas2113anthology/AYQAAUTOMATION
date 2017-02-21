package procedures_NewFramework.AYSmoke.Facelift;

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
				Reporter.log("Step 1 - Enter the First Name as ("+brstartdate1+") ");
				sendKeys(attributeName_xpath, "//input[@id='q24411']", brstartdate1);

				
			}
			if (!brrecruitmentprogramdate1.equals("")) {
				
			}
			if (!brstudentstatus.equals("")) {
				Reporter.log("Step 3 - Enter Student Status as ("+brstudentstatus+")");
				String StudentStatus = getElementIDbyLabel("Student status", BR_StudentStatus);				
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,StudentStatus,brstudentstatus);
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
					clickWebdriver(attributeName_xpath,PSD_Save);
					waitForPageToLoadWebdriver();
				}else if (brsavecontinue.equalsIgnoreCase("Save & Continue")) {
					clickWebdriver(attributeName_xpath,PSD_SaveContinue);
					waitForPageToLoadWebdriver();
				}else if (brsavecontinue.equalsIgnoreCase("Reset")) {
					clickWebdriver(attributeName_xpath,PSD_Reset);
				}
			}
			if (!brsubmitbutton.equals("")) {
				Reporter.log("Step 11 - Click on ("+brsubmitbutton+")Button");
				if (brsubmitbutton.equalsIgnoreCase("Submit Applicant")) {
					Thread.sleep(5000);
					clickWebdriver(attributeName_xpath,AW_SubAppBtn);
					waitForPageToLoadWebdriver();
				}
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

