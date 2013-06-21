package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_SecondarySchoolSupp_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Secondary School Supp' page")
	public void REC_SecondarySchoolSupp_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Secondary School Supp' page");
		String schoolstudies = testdata[0];
		String fromdate = testdata[1];
		String todate = testdata[2];
		String gobacksavenext = testdata[3];
		Reporter.log("Input Test Data was retrieved for 'Secondary School Supp' page");
		if (!schoolstudies.equals("")) {
			Reporter.log("Step 1 - Enter the School Studies as '"+schoolstudies+"' Page");
			String SchoolStudies = getElementIDbyLabel("School Studied",SSS_SchoolStudied);
			sendKeys(attributeName_xpath, SchoolStudies, schoolstudies);
		}
		if (!fromdate.equals("")) {
			Reporter.log("Step 2 - Enter the From Date as '"+fromdate+"' Page");
			String FromDate = getElementIDbyLabel("From Date",SSS_FromDate);
			sendKeys(attributeName_xpath, FromDate, fromdate);
		}
		if (!todate.equals("")) {
			Reporter.log("Step 3 - Enter the To Date as '"+todate+"' Page");
			String ToDate = getElementIDbyLabel("From Date",SSS_ToDate);
			sendKeys(attributeName_xpath, ToDate, todate);
		}
		if (!gobacksavenext.equals("")) {
			Reporter.log("Step 1 -Click the button as '"+gobacksavenext+"'");
			if (gobacksavenext.equalsIgnoreCase("Go Back")) {
				clickWebdriver(attributeName_xpath, CI_BackBtn);
				waitForPageToLoad();
			}else if (gobacksavenext.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_xpath, CI_SaveBtn);
			}else if (gobacksavenext.equalsIgnoreCase("Next")) {
				clickWebdriver(attributeName_xpath, CI_NextBtn);
				waitForPageToLoad();
			}
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}


