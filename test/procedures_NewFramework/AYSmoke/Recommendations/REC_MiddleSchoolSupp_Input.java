package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_MiddleSchoolSupp_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Middle School Supp' page")
	public void REC_MiddleSchoolSupp_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Middle School Supp' page");
		String sports = testdata[0];
		String recommomandthestudent = testdata[1];
		String backsavenext = testdata[2];
		Reporter.log("Input Test Data was retrieved for 'Middle School Supp' page");
		if (!sports.equals("")) {
			Reporter.log("Step 1 - Enter the Sports as '"+sports+"' Page");
			String Sports = getElementIDbyLabel("Sports",MSS_Sports);
			sendKeys(attributeName_xpath, Sports, sports);
		}
		if (!recommomandthestudent.equals("")) {
			Reporter.log("Step 2 - Enter the Recommomand the student as '"+recommomandthestudent+"' Page");
			String RecStudent = getElementIDbyLabel("Do you recommomand the student",MSS_RecStudent);
			sendKeys(attributeName_xpath, RecStudent, recommomandthestudent);
		}
		if (!backsavenext.equals("")) {
			Reporter.log("Step 3 -Click the button as '"+backsavenext+"'");
			if (backsavenext.equalsIgnoreCase("Go Back")) {
				clickWebdriver(attributeName_xpath, CI_BackBtn);
				waitForPageToLoadWebdriver();
			}else if (backsavenext.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_xpath, CI_SaveBtn);
			}else if (backsavenext.equalsIgnoreCase("Next")) {
				waitForElementPresentWebdriver(attributeName_xpath, CI_NextBtn, backsavenext);
				clickWebdriver(attributeName_xpath, CI_NextBtn);
				waitForPageToLoadWebdriver();
			}else if (backsavenext.equalsIgnoreCase("RecNext")) {
				waitForElementPresentWebdriver(attributeName_xpath, "//a[@id='btnSaveCnt']", backsavenext);
				clickWebdriver(attributeName_xpath, "//a[@id='btnSaveCnt']");
				waitForPageToLoadWebdriver();
			}
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}



