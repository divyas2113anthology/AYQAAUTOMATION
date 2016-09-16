package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_CreateResetPassword extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Create Reset Password' page")
	public void REC_CreateResetPassword() throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Create Reset Password' page");
		String applicantfirstnamelabel = parameterValuesArray[0];
		String applicantlastnamelabel = parameterValuesArray[1];
		String yournamelabel = parameterValuesArray[2];
		String personalaccesscodelabel = parameterValuesArray[3];
		String password = parameterValuesArray[4];
		String passwordlabel = parameterValuesArray[5];
		String confirmpassword = parameterValuesArray[6];
		String submit = parameterValuesArray[7];
		Reporter.log("Input Test Data was retrieved for 'Create Reset Password' page");
		waitForElementPresentWebdriver(attributeName_xpath, RL_SubmitBtn, "Submit Button");
		if (!applicantfirstnamelabel.equals("")) {
			Reporter.log("Step 1 - Proceed to Write Applicant First Name from Excel Sheet(C:/Selenium/InputTestdata.xls)");
//			String ApplicantName = getTextWebdriver(attributeName_xpath, "//td[div/b[contains(text(),'Name of applicant:')]]/following-sibling::td/font");
			String ApplicantName = attributeNameValue(attributeName_xpath, "//td[div/b[contains(text(),'Name of applicant:')]]/following-sibling::td/font").getText();
			writeConsole("Applicant Name: "+ApplicantName);
			String [] ApplicantNameSplit = ApplicantName.split(" ");
			writeConsole("First Name: "+ApplicantNameSplit[0]);
			Runtimedatawrite(ApplicantNameSplit[0], applicantfirstnamelabel);
		}
		if (!applicantlastnamelabel.equals("")) {
			Reporter.log("Step 2 - Proceed to Write Applicant Last Name from Excel Sheet(C:/Selenium/InputTestdata.xls)");
//			String ApplicantName = getTextWebdriver(attributeName_xpath, "//td[div/b[contains(text(),'Name of applicant:')]]/following-sibling::td/font");
			String ApplicantName = attributeNameValue(attributeName_xpath, "//td[div/b[contains(text(),'Name of applicant:')]]/following-sibling::td/font").getText();
			writeConsole("Applicant Name: "+ApplicantName);
			String [] ApplicantNameSplit = ApplicantName.split(" ");
			writeConsole("Last Name: "+ApplicantNameSplit[1]);
			Runtimedatawrite(ApplicantNameSplit[1], applicantlastnamelabel);
		}
		if (!yournamelabel.equals("")) {
			Reporter.log("Step 3 - Proceed to Write Your Name from Excel Sheet(C:/Selenium/InputTestdata.xls)");
//			String YourName = getTextWebdriver(attributeName_xpath, "//td[div/b[contains(text(),'Your name:')]]/following-sibling::td/font");
			String YourName = attributeNameValue(attributeName_xpath, "//td[div/b[contains(text(),'Your name:')]]/following-sibling::td/font").getText();
			writeConsole("Your Name: "+YourName);
			Runtimedatawrite(YourName, yournamelabel);
		}
		if (!personalaccesscodelabel.equals("")) {
			Reporter.log("Step 4 - Proceed to Write Personal Access Code from Excel Sheet(C:/Selenium/InputTestdata.xls)");
//			String PersonalAccessCode = getTextWebdriver(attributeName_xpath, "//td[div/b[contains(text(),'Personal Access Code:')]]/following-sibling::td/font");
			String PersonalAccessCode = attributeNameValue(attributeName_xpath, "//td[div/b[contains(text(),'Personal Access Code:')]]/following-sibling::td/font").getText();
			writeConsole("Personal Access Name: "+PersonalAccessCode);
			Runtimedatawrite(PersonalAccessCode, personalaccesscodelabel);
		}
		if (!password.equals("")) {
			Reporter.log("Step 5 - Enter the Password as ["+password+"]");
			String Password1 = Runtimedataread(password);
			sendKeys(attributeName_xpath, RL_Password, Password1);
			if (!passwordlabel.equals("")) {
				Reporter.log("Step 6 - Proceed to Write Password from Excel Sheet(C:/Selenium/InputTestdata.xls)");
				String Password = getValueWebdriver(attributeName_xpath, RL_Password);
				Runtimedatawrite(Password, passwordlabel);
			}		
		}
		if (!confirmpassword.equals("")) {
			Reporter.log("Step 7 - Enter the Confirm Password as ["+confirmpassword+"]");
			String ConfirmPassword = Runtimedataread(confirmpassword);
			sendKeys(attributeName_xpath, RL_ConfirmPass, ConfirmPassword);
		}
		if (!submit.equals("")) {
			Reporter.log("Step 8 - Click the Submit Button");
			clickWebdriver(attributeName_xpath, RL_SubmitBtn);
			waitForPageToLoadWebdriver();
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}


