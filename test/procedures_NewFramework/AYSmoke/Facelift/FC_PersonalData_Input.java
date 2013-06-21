package procedures_NewFramework.AYSmoke.Facelift;

import java.util.Calendar;

import or.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class FC_PersonalData_Input extends CommonSeleniumActions implements OR {

	@Test(description="This Procedure is to perform some Operation in 'Personal Data' page")
	public void FC_PersonalData_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Test Data in Personal Data input");
			String[]  fpdatarepo = datacontainer;
			String pdsufix = fpdatarepo[0];
			String pdfirstname = fpdatarepo[1];
			String pdmiddlename = fpdatarepo[2];
			String pdlastname = fpdatarepo[3];
			String pddateofbirth = fpdatarepo[4];
			String pdssn = fpdatarepo[5];
			String pdparentssn = fpdatarepo[6];
			String pdgender = fpdatarepo[7];
			String pdhomephone = fpdatarepo[8];
			String pdcellphone = fpdatarepo[9];
			String pdfulltimestudent = fpdatarepo[10];
			String pdextracircularactivities = fpdatarepo[11];
			String pdcountry = fpdatarepo[12];
			String pdstate = fpdatarepo[13];
			String pdgradelevel = fpdatarepo[14];
			String pdessay = fpdatarepo[15];
			String pdupload = fpdatarepo[16];
			String pdcollegehousing = fpdatarepo[17];
			String pdsportsintrest = fpdatarepo[18];
			String pdtestscore = fpdatarepo[19];
			String pdacademicintrest = fpdatarepo[20];
			String pdschoolcode = fpdatarepo[21];
			String pdemailaddress= fpdatarepo[22];
			String pdaptnumber = fpdatarepo[23];
			String pdemailrecommended = fpdatarepo[24];
			String pisubmitappbtn = fpdatarepo[25];
			String pdsave = fpdatarepo[26];
			Reporter.log("Retrieved Test Data in Personal Data input");
			if (!pdsufix.equals("")) {
				Reporter.log("Step 1 - Select Suffix as ("+pdsufix+")");
				String Sufixpd = getElementIDbyLabel("Suffix",PSD_Suffix);				
				select(Sufixpd,pdsufix);
			}
			if (!pdfirstname.equals("")) {
				Reporter.log("Step 2 - Enter First Name as ("+pdfirstname+")");
				String Fnamepd = getElementIDbyLabel("First Given Name",PSD_FirstGivenName);				
				type(Fnamepd,pdfirstname+Calendar.getInstance().getTimeInMillis());
			}
			if (!pdmiddlename.equals("")) {
				Reporter.log("Step 3 - Enter Middle Name as ("+pdmiddlename+")");
				String MNamepd = getElementIDbyLabel("Middle Name",PSD_Middlename);				
				type(MNamepd,pdmiddlename);
			}
			if (!pdlastname.equals("")) {
				Reporter.log("Step 4 - Enter Last Name as ("+pdlastname+")");
				String LNamepd = getElementIDbyLabel("Last name", PSD_Lastname);				
				type(LNamepd,pdlastname);
			}
			if (!pddateofbirth.equals("")) {
				Reporter.log("Step 5 - Enter Date of birth as ("+pddateofbirth+")");
				String Dateofbirthpd = getElementIDbyLabel("Date of birth",PSD_Dateofbirth);				
				type(Dateofbirthpd,pddateofbirth);
			}
			if (!pdssn.equals("")) {
				Reporter.log("Step 6 - Enter SSN as ("+pdssn+")");
				String SSNpd = getElementIDbyLabel("SSN",PSD_SSN);				
				type(SSNpd,pdssn);
			}
			if (!pdparentssn.equals("")) {
				Reporter.log("Step 7 - Enter Parent SSN as ("+pdparentssn+")");
				String Pssnpd = getElementIDbyLabel("Parent SSN",PSD_ParentSSN);				
				type(Pssnpd,pdparentssn);
			}
			if (!pdgender.equals("")) {
				Reporter.log("Step 8 - Select Gender as ("+pdgender+")");
				String Genderpd = getElementIDbyLabel("Gender",PSD_Gender);				
				select(Genderpd,pdgender);
			}
			if (!pdhomephone.equals("")) {
				Reporter.log("Step 9 - Enter Home phone as ("+pdhomephone+")");
				String Homephonepd = getElementIDbyLabel("Home Phone",PSD_HomePhone);				
				type(Homephonepd, pdhomephone);
			}
			if (!pdcellphone.equals("")) {
				Reporter.log("Step 10 - Enter Cell Phone as ("+pdcellphone+")");
				String Cellphonepd = getElementIDbyLabelContains("Cell Phone",PSD_CellPhone);				
				type(Cellphonepd, pdcellphone);
			}
			if (!pdfulltimestudent.equals("")) {
				Reporter.log("Step 11 - Check Full Time Student as ("+pdfulltimestudent+")");
				if (pdfulltimestudent.equalsIgnoreCase("Yes")){
//					actionsClickWebdriver(attributeName_xpath, PSD_Fulltimestudent_Yes);
//					sendKeysType(attributeName_xpath, PSD_Fulltimestudent_Yes, " ");
//					clickWebdriver(attributeName_xpath, PSD_Fulltimestudent_Yes);
					sendKeyStroke(attributeName_xpath, PSD_Fulltimestudent_No, Keys.SPACE);
//					click(PSD_Fulltimestudent_Yes);		
				}else if (pdfulltimestudent.equalsIgnoreCase("No")){
//					actionsClickWebdriver(attributeName_xpath, PSD_Fulltimestudent_No);					
//					sendKeysType(attributeName_xpath, PSD_Fulltimestudent_No, " ");
//					radioWebdriver(attributeName_xpath, PSD_Fulltimestudent_No);
//					click(PSD_Fulltimestudent_No);
//					sendKeysType(attributeName_xpath, PSD_Fulltimestudent_No, " ");
//					clickWebdriver(attributeName_xpath, PSD_Fulltimestudent_No);
					sendKeyStroke(attributeName_xpath, PSD_Fulltimestudent_No, Keys.SPACE);
				}			
			}
			if (!pdextracircularactivities.equals("")) {
				Reporter.log("Step 12 - Enter Extracurricular activities as ("+pdcellphone+")");
				String Extracircularpd = getElementIDbyLabel("Extracurricular activities",PSD_Extracurricularactivities);				
				type(Extracircularpd,pdextracircularactivities);
			}
			if (!pdcountry.equals("")) {
				Reporter.log("Step 13 - Select Country as ("+pdcountry+")");
				String Countrypd = getElementIDbyLabel("Country",PSD_Country);				
				select(Countrypd,pdcountry);
			}
			if (!pdstate.equals("")) {
				Reporter.log("Step 14 - Select State / province as ("+pdstate+")");
				String Statepd = getElementIDbyLabel("State / province",PSD_Stateprovince);				
				select(Statepd,pdstate);
			}
			if (!pdgradelevel.equals("")) {
				Reporter.log("Step 15 - Check Grade Level as ("+pdgradelevel+")");
//				String Gradelevelpd = getElementIDbyLabel("Grade Level",PSD_GradeLevel);
//				System.out.println("Grade Level ID : "+Gradelevelpd);
//				checkWebdriver(attributeName_xpath, Gradelevelpd);
				if ( !attributeNameValue(attributeName_xpath, PSD_GradeLevel+pdgradelevel+"']").isSelected() )
						{
							attributeNameValue(attributeName_xpath, PSD_GradeLevel+pdgradelevel+"']").click();
						}
//				check(Gradelevelpd);
			}
			if (!pdessay.equals("")) {
				Reporter.log("Step 16 - Select Essay without attachment as ("+pdessay+")");
				String Essaypd = getElementIDbyLabel("Essay without attachment",PSD_Essaywithoutattachment);				
				select(Essaypd,pdessay);
			}
			if (!pdupload.equals("")) {
				Reporter.log("Step 17 - Upload document ("+pdupload+")");
				String Uploaddocumentpd = getElementIDbyLabel("upload document", PSD_uploaddocument);
				type(Uploaddocumentpd, pdupload);
			}
			if (!pdcollegehousing.equals("")) {
				Reporter.log("Step 18 - Select Do you intend to live in college housing as ("+pdcollegehousing+")");
				String Collegehousingpd = getElementIDbyLabel("Do you intend to live in college housing", PSD_Collegehousing);
				type(Collegehousingpd,pdcollegehousing);
			}
			if (!pdsportsintrest.equals("")) {
				Reporter.log("Step 19 - Select Sports Interest as ("+pdsportsintrest+")");
				String Sportsintrestpd = getElementIDbyLabel("Sports Interest", PSD_SportsInterest);
				select(Sportsintrestpd,pdsportsintrest);			
			}
			if (!pdtestscore.equals("")) {
				Reporter.log("Step 20 - Enter Test score as ("+pdtestscore+")");
				String Testscorepd = getElementIDbyLabel("Test score",PSD_Testscore);
				type(Testscorepd,pdtestscore);
			}
			if (!pdacademicintrest.equals("")) {
				Reporter.log("Step 21 - Enter Academic Interest as ("+pdacademicintrest+")");
				String Academicinterestpd = getElementIDbyLabel("Academic Interest",PSD_AcademicInterest);
				select(Academicinterestpd,pdacademicintrest);
			}
			if (!pdschoolcode.equals("")) {
				Reporter.log("Step 22 - Enter School code as ("+pdschoolcode+")");
				String Schoolcodepd = getElementIDbyLabel("School Code",PSD_SchoolCode);
				type(Schoolcodepd,pdschoolcode);
			}
			if (!pdemailaddress.equals("")) {
				Reporter.log("Step 23 - Enter Email address as ("+pdemailaddress+")");
				String Emailaddresspd = getElementIDbyLabel("Email address",PSD_Emailaddress);
				type(Emailaddresspd,pdemailaddress);
			}
			if (!pdaptnumber.equals("")) {
				Reporter.log("Step 24 - Enter Apt number as ("+pdaptnumber+")");
				String Aptnumberpd = getElementIDbyLabel("Apt number",PSD_Aptnumber);
				type(Aptnumberpd,pdaptnumber);
			}
			if (!pdemailrecommended.equals("")) {
				Reporter.log("Step 25 - Enter EmailRecommended as ("+pdemailrecommended+")");
				String Emailrecommendedpd = getElementIDbyLabel("EmailRecommended",PSD_EmailRecommended);
				type(Emailrecommendedpd,pdemailrecommended);
			}
			if (!pisubmitappbtn.equals("")) {
				Reporter.log("Step 26 - Click on ("+pisubmitappbtn+")Button");
				if (pisubmitappbtn.equalsIgnoreCase("Submit Applicant")) {
					click(AW_SubAppBtn);
				}
			}
			if (!pdsave.equals("")) {
				Reporter.log("Step 27 - Click on ("+pdsave+")Button");
				if(pdsave.equalsIgnoreCase("Save")){
					click(PSD_SaveBottom);
					waitForPageToLoad();
				}else if (pdsave.equalsIgnoreCase("Save & Continue")) {
					click(PSD_SaveContinue);
					waitForPageToLoad();
				}else if (pdsave.equalsIgnoreCase("Reset")) {
					click(PSD_Reset);
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
