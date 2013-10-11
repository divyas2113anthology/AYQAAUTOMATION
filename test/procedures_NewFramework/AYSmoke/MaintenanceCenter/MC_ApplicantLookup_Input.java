package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ApplicantLookup_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Applicant Lookup' page")
	public void MC_ApplicantLookup_Input(){
		try{
			Reporter.log("Proceed to click main menu link in Maintenance center");
			String[] testdata = datacontainer;
			String clientid = testdata[0];
			String lastname = testdata[1];
			String firstname = testdata[2];
			String emailaddress = testdata[3];
			String dateofbirth = testdata[4];
			String zipcode = testdata[5];
			String applicantpinrecommendationpac = testdata[6];
			String applicantclientid = testdata[7];
			String lastaccessedmodified = testdata[8];
			String profilecreated = testdata[9];
			String lookuptype = testdata[10];
			String button = testdata[11];
			Reporter.log("Check user click on Manage client link in Maintenance center");
			if (!clientid.equals("")) {
				Reporter.log("Step 1 - Enter the ClientID as  ["+clientid+"]");
				sendKeys(attributeName_xpath, AL_ClientID, clientid);
			}
			if (!lastname.equals("")) {
				Reporter.log("Step 2 - Enter the Last Name as  ["+lastname+"]");
				sendKeys(attributeName_xpath, AL_LastName, lastname);
			}
			if (!firstname.equals("")) {
				Reporter.log("Step 3 - Enter the First Name as  ["+firstname+"]");
				sendKeys(attributeName_xpath, AL_FirstName, firstname);
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Step 4 - Enter the Email Address as  ["+emailaddress+"]");
				sendKeys(attributeName_xpath, AL_EmailAdd, emailaddress);
			}
			if (!dateofbirth.equals("")) {
				Reporter.log("Step 5 - Enter the DOB as  ["+dateofbirth+"]");
				sendKeys(attributeName_xpath, AL_DOB, dateofbirth);
			}
			if (!zipcode.equals("")) {
				Reporter.log("Step 6 - Enter the Zip Code as  ["+zipcode+"]");
				sendKeys(attributeName_xpath, AL_ZipCOde, zipcode);
			}
			if (!applicantpinrecommendationpac.equals("")) {
				Reporter.log("Step 7 - Enter the Applicant Pin Recommendation PAC as  ["+applicantpinrecommendationpac+"]");
				sendKeys(attributeName_xpath, AL_AppPinRecPAC, applicantpinrecommendationpac);
			}
			if (!applicantclientid.equals("")) {
				Reporter.log("Step 8 - Enter the Applicant Client ID as  ["+applicantclientid+"]");
				sendKeys(attributeName_xpath, AL_AppClientID, applicantclientid);
			}
			if (!lastaccessedmodified.equals("")) {
				Reporter.log("Step 9 - Select the Last Accessed/Modified as  ["+lastaccessedmodified+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AL_LastAccessedModified, lastaccessedmodified);
			}
			if (!profilecreated.equals("")) {
				Reporter.log("Step 10 - Select the Profile Created as  ["+profilecreated+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AL_ProfileCreated, profilecreated);
			}
			if (!lookuptype.equals("")) {
				Reporter.log("Step 11 - Select the LookUp Type as  ["+lookuptype+"]");
				if (lookuptype.equalsIgnoreCase("Applicant")) {
					clickWebdriver(attributeName_xpath, AL_LookupApp);
				}else if (lookuptype.equalsIgnoreCase("Recommender")) {
					clickWebdriver(attributeName_xpath, AL_LookupRec);
				}
			}
			if (!button.equals("")) {
				Reporter.log("Step 11 - Click the submit Button");
				clickWebdriver(attributeName_xpath, AL_SubmitBtn);
				waitForPageToLoadWebdriver();
			}
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}

