package procedures_NewFramework.AYSmoke.Prospect;

import java.util.Calendar;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PRO_InformationRequest_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Personal Information' page")	
	public void PRO_InformationRequest_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Personal Information' page");
			String[]  personalinfoidatarepo = datacontainer;
			String firstname = personalinfoidatarepo[0];
			String lastname = personalinfoidatarepo[1];
			String email = personalinfoidatarepo[2];
			String dob = personalinfoidatarepo[3];
			String gender = personalinfoidatarepo[4];
			String ethnicity = personalinfoidatarepo[5];
			String ssn = personalinfoidatarepo[6];
			String address = personalinfoidatarepo[7];
			String suitenumber = personalinfoidatarepo[8];
			String city = personalinfoidatarepo[9];
			String state = personalinfoidatarepo[10];
			String zipcode = personalinfoidatarepo[11];
			String country = personalinfoidatarepo[12];
			String schoolinterest = personalinfoidatarepo[13];
			String terminterest = personalinfoidatarepo[14];
			String major = personalinfoidatarepo[15];
			String lookupsubmitreset = personalinfoidatarepo[16];
			Reporter.log("Input Test Data was retrieved for 'Personal Information' page");
			if (!firstname.equals("")) {
				Reporter.log("Step 1 - Enter First Name as ("+firstname+")");
				String fNameID = getElementIDbyLabelContains("First Name",IR_PI_FirstName);				
				type(fNameID, firstname+Calendar.getInstance().getTimeInMillis());
			}
			if (!lastname.equals("")) {
				Reporter.log("Step 2 - Enter Last Name as ("+lastname+")");
				String LNameID = getElementIDbyLabelContains("Last Name",IR_PI_LastName);				
				type(LNameID, lastname);
			}
			if (!email.equals("")) {
				Reporter.log("Step 3 - Enter the Email as ("+email+")");
				String Email = getElementIDbyLabelContains("Email Address",IR_PI_Email);				
				type(Email, email);
			}

			if (!dob.equals("")) {
				Reporter.log("Step 4 - Enter the DOB as ("+dob+")");
				String ethiID = getElementIDbyLabelContains("Date of Birth",IR_PI_Dob);
				check(ethiID);
			}
			if (!gender.equals("")) {
				Reporter.log("Step 5 - Select the Gender as ("+gender+")");
				clickWebdriver(attributeName_xpath, "//input[@value='"+gender+"']");
			}
			if (!ethnicity.equals("")) {
				Reporter.log("Step 6 - Select the Ethincity as ("+ethnicity+")");
				String Ethincity = getElementIDbyLabelContains("Ethnicity", IR_PI_Ethincity);
				selectByVisibleTextWebdriver(attributeName_xpath, Ethincity, ethnicity);
			}
			if (!ssn.equals("")) {
				Reporter.log("Step 7 - Enter Favourite Sports as ("+ssn+")");
				String SsnID = getElementIDbyLabelContains("SSN", IR_PI_Ssn);
				type(SsnID,ssn);			
			}
			if (!address.equals("")) {
				Reporter.log("Step 8 - Enter the address as ("+address+")");
				String Address = getElementIDbyLabelContains("Address",IR_AI_Address);				
				type(Address, address);
			}
			if (!suitenumber.equals("")) {
				Reporter.log("Step 9 - Enter suitenumber as ("+suitenumber+")");
				String Suitenumber = getElementIDbyLabelContains("Apt. or Suite Number",IR_AI_SuiteNumber);				
				type(Suitenumber, suitenumber);
			}
			if (!city.equals("")) {
				Reporter.log("Step 10 - Enter the city as ("+city+")");
				String City = getElementIDbyLabelContains("City",IR_AI_City);				
				type(City, city);
			}
			if (!state.equals("")) {
				Reporter.log("Step 11 - Enter the state as ("+state+")");
				String State = getElementIDbyLabelContains("State",IR_AI_State);				
				type(State, state);
			}
			if (!zipcode.equals("")) {
				Reporter.log("Step 12 - Enter the zipcode as ("+zipcode+")");
				String Zipcode = getElementIDbyLabelContains("Zip Code",IR_AI_ZipCode);				
				type(Zipcode, zipcode);
			}
			if (!country.equals("")) {
				Reporter.log("Step 13 - Enter the country as ("+country+")");
				String Country = getElementIDbyLabelContains("Country",IR_AI_Country);				
				type(Country, country);
			}
			if (!schoolinterest.equals("")) {
				Reporter.log("Step 14 - Select the school of interest as ("+schoolinterest+")");
				String SchoolInterest = getElementIDbyLabelContains("School of Interest", IR_OI_SchoolInterest);
				selectByVisibleTextWebdriver(attributeName_xpath, SchoolInterest, schoolinterest);
			}
			if (!terminterest.equals("")) {
				Reporter.log("Step 15 - Select the term of interest as ("+terminterest+")");
				String TermInterest = getElementIDbyLabelContains("Term of Interest", IR_OI_TermInterest);
				selectByVisibleTextWebdriver(attributeName_xpath, TermInterest, terminterest);
			}
			if (!major.equals("")) {
				Reporter.log("Step 16 - Select the major as ("+major+")");
				String MajorID = getElementIDbyLabel("Major:", IR_OI_Major);
//				select("//select[@id='s24536']", major);
				selectByVisibleTextWebdriver(attributeName_xpath, MajorID, major);
			}
			if (!lookupsubmitreset.equals("")) {
				Reporter.log("Step 17 - Click on ("+lookupsubmitreset+")Button");
				if (lookupsubmitreset.equalsIgnoreCase("Look Up")) {
					clickWebdriver(attributeName_name, IR_LookupBtn);
					recentPopupSelectWebdriver("Address Lookup");
				}else if (lookupsubmitreset.equalsIgnoreCase("Submit")) {
					waitForElementPresentWebdriver(attributeName_xpath, IR_SubmitBtn, lookupsubmitreset);
					clickWebdriver(attributeName_xpath, IR_SubmitBtn);
					waitForPageToLoadWebdriver();
				}else if (lookupsubmitreset.equalsIgnoreCase("Reset")) {
					clickWebdriver(attributeName_xpath,PI_Reset);
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}

