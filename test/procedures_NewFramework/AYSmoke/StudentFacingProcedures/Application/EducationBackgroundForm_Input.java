package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class EducationBackgroundForm_Input extends CommonSeleniumActions implements OR {

	

	@Test(description="This Procedure is to perform some Operation in 'Education Background' page")
	public void EducationBackgroundForm_Input() throws Exception{
		try {
		writeDetails();
//		headerStatement("EducationBackgroundForm_Input");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Input Test Data for 'Education Background' page");
		String[]  educationidatarepo = datacontainer;
		String highschoolname = educationidatarepo[0];
		String highschooltype = educationidatarepo[1];
		String counselorname = educationidatarepo[2];
		String streetaddress = educationidatarepo[3];
		String city = educationidatarepo[4];
		String state = educationidatarepo[5];
		String country = educationidatarepo[6];
		String postalcode = educationidatarepo[7];
		String lookupbutton = educationidatarepo[8];
		String dateofentry = educationidatarepo[9];
		String dateofgraduation = educationidatarepo[10];
		String gpa = educationidatarepo[11];
		String savebutton = educationidatarepo[12];
		Reporter.log("Input Test Data was retrieved for 'Education Background' page");
		if (!highschoolname.equals("")) {
			Reporter.log("Step 1 - Enter High School Name as ("+highschoolname+")");
			String hsnameID = getElementIDbyLabel("High School Name",EB_HighSchoolName);
			sendKeys(attributeName_xpath,hsnameID, highschoolname);
		}
		if (!highschooltype.equals("")) {
			Reporter.log("Step 2 - Select High School Type as ("+highschooltype+")");
			String hstypeID = getElementIDbyLabel("High School Type",EB_HighSchoolType);
			sendKeys(attributeName_xpath,hstypeID, highschooltype);
		}
		if (!counselorname.equals("")) {
			Reporter.log("Step 3 - Enter Counselor Name as ("+counselorname+")");
			String counselorID = getElementIDbyLabel("Counselor Name",EB_CounselorName);
			sendKeys(attributeName_xpath,counselorID, counselorname);
		}
		if (!streetaddress.equals("")) {
			Reporter.log("Step 4 - Enter Street Address as ("+streetaddress+")");
			String streetID = getElementIDbyLabel("Street Address",EB_StreetAddress);
			sendKeys(attributeName_xpath,streetID, streetaddress);
		}
		if (!city.equals("")) {
			Reporter.log("Step 5 - Enter City as ("+city+")");
			String cityID = getElementIDbyLabel("City",EB_City);
			sendKeys(attributeName_xpath,cityID, city);
		}
		if (!state.equals("")) {
			Reporter.log("Step 6 - Enter State as ("+state+")");
			String stateID = getElementIDbyLabel("State",EB_State);
			sendKeys(attributeName_xpath,stateID, state);
		}
		if (!country.equals("")) {
			Reporter.log("Step 7 - Enter Country as ("+country+")");
			String countryID = getElementIDbyLabel("Country",EB_Country);
			sendKeys(attributeName_xpath,countryID, country);
		}
		if (!postalcode.equals("")) {
			Reporter.log("Step 8 - Enter Postal Code as ("+postalcode+")");
			String postalID = getElementIDbyLabel("Postal Code",EB_PostalCode);
			sendKeys(attributeName_xpath,postalID, postalcode);
		}
		if (!lookupbutton.equals("")) {
			Reporter.log("Step 9 - Click on ("+lookupbutton+") Button");
			clickWebdriver(attributeName_xpath,EB_Lookup);
//			recentPopupSelect("");
			recentPopupSelectWebdriver("Look Up");
		}
		if (!dateofentry.equals("")) {
			Reporter.log("Step 10 - Enter Date of Entry as ("+dateofentry+")");
			String doentryID = getElementIDbyLabel("Date of Entry",EB_DateofEntry);
			sendKeys(attributeName_xpath,doentryID, dateofentry);
		}
		if (!dateofgraduation.equals("")) {
			Reporter.log("Step 11 - Enter Date of Graduation as ("+dateofgraduation+")");
			String dogradID = getElementIDbyLabel("Date of Graduation",EB_DateofGraduation);
			sendKeys(attributeName_xpath,dogradID, dateofgraduation);
		}
		if (!gpa.equals("")) {
			Reporter.log("Step 12 - Enter GPA as ("+gpa+")");
			String gpaID = getElementIDbyLabel("GPA",EB_GPA);
			sendKeys(attributeName_xpath,gpaID, gpa);
		}
		if (!savebutton.equals("")) {
			Reporter.log("Step 13 - Click on ("+savebutton+") Button");
			if (savebutton.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_xpath,EB_Save);
				waitForPageToLoadWebdriver();
			}else if (savebutton.equalsIgnoreCase("Save & Continue")) {
				clickWebdriver(attributeName_xpath,EB_SaveContinue);
				waitForPageToLoadWebdriver();
			}else if (savebutton.equalsIgnoreCase("Reset")) {
				clickWebdriver(attributeName_xpath,EB_Reset);
			}
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}	
	
}
