package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_EducationBackgroundForm_Input extends CommonSeleniumActions implements OR {

	

	@Test(description="This Procedure is to perform some Operation in 'Education Background' page")
	public void FC_EducationBackgroundForm_Input() throws Exception{
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
			type(hsnameID, highschoolname);
		}
		if (!highschooltype.equals("")) {
			Reporter.log("Step 2 - Select High School Type as ("+highschooltype+")");
			String hstypeID = getElementIDbyLabel("High School Type",EB_HighSchoolType);				
			type(hstypeID, highschooltype);
		}
		if (!counselorname.equals("")) {
			Reporter.log("Step 3 - Enter Counselor Name as ("+counselorname+")");
			String counselorID = getElementIDbyLabel("Counselor Name",EB_CounselorName);				
			type(counselorID, counselorname);
		}
		if (!streetaddress.equals("")) {
			Reporter.log("Step 4 - Enter Street Address as ("+streetaddress+")");
			String streetID = getElementIDbyLabel("Street Address",EB_StreetAddress);				
			type(streetID, streetaddress);
		}
		if (!city.equals("")) {
			Reporter.log("Step 5 - Enter City as ("+city+")");
			String cityID = getElementIDbyLabel("City",EB_City);				
			type(cityID, city);
		}
		if (!state.equals("")) {
			Reporter.log("Step 6 - Enter State as ("+state+")");
			String stateID = getElementIDbyLabel("State",EB_State);				
			type(stateID, state);
		}
		if (!country.equals("")) {
			Reporter.log("Step 7 - Enter Country as ("+country+")");
			String countryID = getElementIDbyLabel("Country",EB_Country);				
			type(countryID, country);
		}
		if (!postalcode.equals("")) {
			Reporter.log("Step 8 - Enter Postal Code as ("+postalcode+")");
			String postalID = getElementIDbyLabel("Postal Code",EB_PostalCode);				
			type(postalID, postalcode);
		}
		if (!lookupbutton.equals("")) {
			Reporter.log("Step 9 - Click on ("+lookupbutton+") Button");
			waitForElementPresentWebdriver(attributeName_xpath, EB_Lookup, lookupbutton);
			clickWebdriver(attributeName_xpath, EB_Lookup);
			recentPopupSelectWebdriver("CEEB Look Up");
//			waitForUniqueNameWindow();
//			recentPopupSelect("");
		}
		if (!dateofentry.equals("")) {
			Reporter.log("Step 10 - Enter Date of Entry as ("+dateofentry+")");
			String doentryID = getElementIDbyLabel("Date of Entry",EB_DateofEntry);				
			type(doentryID, dateofentry);
		}
		if (!dateofgraduation.equals("")) {
			Reporter.log("Step 11 - Enter Date of Graduation as ("+dateofgraduation+")");
			String dogradID = getElementIDbyLabel("Date of Graduation",EB_DateofGraduation);				
			type(dogradID, dateofgraduation);
		}
		if (!gpa.equals("")) {
			Reporter.log("Step 12 - Enter GPA as ("+gpa+")");
			String gpaID = getElementIDbyLabel("GPA",EB_GPA);				
			type(gpaID, gpa);
		}
		if (!savebutton.equals("")) {
			Reporter.log("Step 13 - Click on ("+savebutton+") Button");
			if (savebutton.equalsIgnoreCase("Save")) {
				actionsClickWebdriver(attributeName_xpath, EB_SaveBottom);
//				click(EB_Save);
//				waitForPageToLoad();
			}else if (savebutton.equalsIgnoreCase("Save & Continue")) {
				click(EB_SaveContinue);
				waitForPageToLoad();
			}else if (savebutton.equalsIgnoreCase("Reset")) {
				click(EB_Reset);				
			}
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}	
	
}
