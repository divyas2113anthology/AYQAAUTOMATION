package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class BusinessRules_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Business Rules' page")
	public void BusinessRules_Input() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Test Data in Business Rules input");
		String[]  fpdatarepo = datacontainer;
		String startdate = fpdatarepo[0];
		String recruitmentprogramdate = fpdatarepo[1];
		String studentstatus = fpdatarepo[2];
		String gre = fpdatarepo[3];
		String adddocument = fpdatarepo[4];
		String tofel = fpdatarepo[5];
		String interview = fpdatarepo[6];
		String startdatesecond = fpdatarepo[7];
		String recruitmentprogramdatesecond = fpdatarepo[8];
		String savecontinue = fpdatarepo[9];
		Reporter.log("Retrieved Test Data in Business Rules input");
		if (!startdate.equals("")) {
			Reporter.log("Step 1 - Enter the First Start Date as ("+startdate+")");
		}
		if (!recruitmentprogramdate.equals("")) {
			Reporter.log("Step 2 - Enter First Recruitment Proram Date as ("+recruitmentprogramdate+")");
		}
		if (!studentstatus.equals("")) {
			Reporter.log("Step 3 - Select Student Status as ("+studentstatus+")");
			String StudentStatus = getElementIDbyLabel("Student status",BR_StudentStatusApp);				
			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,StudentStatus,studentstatus);
		}
		if (!gre.equals("")) {
			Reporter.log("Step 4 - Enter GRE as ("+gre+")");
		}
		if (!adddocument.equals("")) {
			Reporter.log("Step 5 - Select Add Document as ("+adddocument+")");
		}
		if (!tofel.equals("")) {
			Reporter.log("Step 6 - Enter TOFEL as ("+tofel+")");
		}
		if (!interview.equals("")) {
			Reporter.log("Step 7 - Select Interview as ("+interview+")");
		}
		if (!startdatesecond.equals("")) {
			Reporter.log("Step 8 - Enter the Second Start Date as ("+startdatesecond+")");
		}
		if (!recruitmentprogramdatesecond.equals("")) {
			Reporter.log("Step 9 - Enter First Recruitment Proram Date as ("+recruitmentprogramdatesecond+")");
		}
		if (!savecontinue.equals("")) {
			Reporter.log("Step 27 - Click on ("+savecontinue+")Button");
			if(savecontinue.equalsIgnoreCase("Save")){
				clickWebdriver(attributeName_xpath,PD_Save);
				waitForPageToLoadWebdriver();
			}else if (savecontinue.equalsIgnoreCase("Save & Continue")) {
				clickWebdriver(attributeName_xpath,PD_SaveContinue);
				waitForPageToLoadWebdriver();
			}else if (savecontinue.equalsIgnoreCase("Reset")) {
				clickWebdriver(attributeName_xpath,PD_Reset);
			}
		}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
}

}

