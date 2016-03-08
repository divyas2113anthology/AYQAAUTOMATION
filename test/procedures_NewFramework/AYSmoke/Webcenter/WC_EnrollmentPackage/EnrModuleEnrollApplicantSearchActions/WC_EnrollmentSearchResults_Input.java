package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.EnrModuleEnrollApplicantSearchActions;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EnrollmentSearchResults_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Enrollment Search Results' page")
	public void WC_EnrollmentSearchResults_Input(){
	try{
		Reporter.log("Proceed to click on package name in Manage Section Rules screen of Maintenance center");
		String[] testdata = datacontainer;
		String operationtoperform = testdata[0];
		String applicantcheck = testdata[1];
		String applicantclick = testdata[2];
		String selectaction = testdata[3];
		String apply = testdata[4];
		String button = testdata[5];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!applicantcheck.equals("") && !operationtoperform.equals("")) {
			String ApplicantFirstNameCheck = Runtimedataread(applicantcheck);
			Reporter.log("Step 1 - Check the checkbox against ["+ApplicantFirstNameCheck+"]");
			if (operationtoperform.equalsIgnoreCase("Check")) {
				checkWebdriverCheckbox(attributeName_xpath, "//td[a[contains(text(),'"+ApplicantFirstNameCheck+"')]]/preceding-sibling::td/input[@type='checkbox']");
			}else if (operationtoperform.equalsIgnoreCase("UnCheck")) {
				checkWebdriverCheckbox(attributeName_xpath, "//td[a[contains(text(),'"+ApplicantFirstNameCheck+"')]]/preceding-sibling::td/input[@type='checkbox']");
			}
		}
		if (!applicantclick.equals("")) {
			String ApplicantFirstName = Runtimedataread(applicantclick);
			Reporter.log("Step 2 - Click on Rule name ["+applicantclick+"]");
			waitForElementPresentWebdriver(attributeName_xpath, ES_ApplicantClick+ApplicantFirstName+"')]", ApplicantFirstName);
			clickWebdriver(attributeName_xpath,ES_ApplicantClick+ApplicantFirstName+"')]" );
			recentPopupSelectWebdriver("Enrollment");
		}
		if (!selectaction.equals("")) {
			Reporter.log("Step 3 - Select a Action as ["+selectaction+"]");
			selectByVisibleTextWebdriver(attributeName_name, "ActionTypeID", selectaction);
		}
		if (!apply.equals("")) {
			Reporter.log("Step 4 - Click the radio button as ["+apply+"]");
			if (apply.equalsIgnoreCase("Apply to Selected")) {
				clickWebdriver(attributeName_xpath, ASR_ApplySelected);
			}else if (apply.equalsIgnoreCase("Apply to All")) {
				clickWebdriver(attributeName_xpath, ASR_ApplyAll);
			}
		}
		if (!button.equals("")) {
			Reporter.log("Step 3 - Click on button as ["+button+"]");
			if (button.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_xpath, MSR_AddBtn);
			}else if (button.equalsIgnoreCase("Back")) {
				clickWebdriver(attributeName_xpath, MSR_BackBtn);
			}else if (button.equalsIgnoreCase("Delete")) {
				clickWebdriver(attributeName_xpath, MSR_DeleteBtn);
			}
		}
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}


