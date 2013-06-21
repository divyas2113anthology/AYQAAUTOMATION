package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import java.util.Calendar;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PersonalData_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Personal Data' page")
	public void PersonalData_Input() throws Exception{
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
		String pdsave = fpdatarepo[25];
		Reporter.log("Retrieved Test Data in Personal Data input");
		if (!pdsufix.equals("")) {
			Reporter.log("Step 1 - Select Suffix as ("+pdsufix+")");
			String Sufixpd = getElementIDbyLabel("Suffix",PD_Suffix);				
			select(Sufixpd,pdsufix);
		}
		if (!pdfirstname.equals("")) {
			Reporter.log("Step 2 - Enter First Name as ("+pdfirstname+")");
			String Fnamepd = getElementIDbyLabel("First Given Name",PD_FirstGivenName);				
			type(Fnamepd,pdfirstname+Calendar.getInstance().getTimeInMillis());
		}
		if (!pdmiddlename.equals("")) {
			Reporter.log("Step 3 - Enter Middle Name as ("+pdmiddlename+")");
			String MNamepd = getElementIDbyLabel("Middle Name",PD_Middlename);				
			type(MNamepd,pdmiddlename);
		}
		if (!pdlastname.equals("")) {
			Reporter.log("Step 4 - Enter Last Name as ("+pdlastname+")");
			String LNamepd = getElementIDbyLabel("Last name",PD_Lastname);				
			type(LNamepd,pdlastname);
		}
		if (!pddateofbirth.equals("")) {
			Reporter.log("Step 5 - Enter Date of birth as ("+pddateofbirth+")");
			String Dateofbirthpd = getElementIDbyLabel("Date of birth",PD_Dateofbirth);				
			type(Dateofbirthpd,pddateofbirth);
		}
		if (!pdssn.equals("")) {
			Reporter.log("Step 6 - Enter SSN as ("+pdssn+")");
			String SSNpd = getElementIDbyLabel("SSN",PD_SSN);				
			type(SSNpd,pdssn);
		}
		if (!pdparentssn.equals("")) {
			Reporter.log("Step 7 - Enter Parent SSN as ("+pdparentssn+")");
			String Pssnpd = getElementIDbyLabel("Parent SSN",PD_ParentSSN);				
			type(Pssnpd,pdparentssn);
		}
		if (!pdgender.equals("")) {
			Reporter.log("Step 8 - Select Gender as ("+pdgender+")");
			String Genderpd = getElementIDbyLabel("Gender",PD_Gender);				
			select(Genderpd,pdgender);
		}
		if (!pdhomephone.equals("")) {
			Reporter.log("Step 9 - Enter Home phone as ("+pdhomephone+")");
			String Homephonepd = getElementIDbyLabel("Home Phone",PD_HomePhone);				
			type(Homephonepd, pdhomephone);
		}
		if (!pdcellphone.equals("")) {
			Reporter.log("Step 10 - Enter Cell Phone as ("+pdcellphone+")");
			String Cellphonepd = getElementIDbyLabel("Cell Phone",PD_CellPhone);				
			type(Cellphonepd, pdcellphone);
		}
		if (!pdfulltimestudent.equals("")) {
			Reporter.log("Step 11 - Check Full Time Student as ("+pdfulltimestudent+")");
			if (pdfulltimestudent.equalsIgnoreCase("Yes")){
				click(PD_Fulltimestudent_Yes);		
			}else if  (pdfulltimestudent.equalsIgnoreCase("No")){
				click(PD_Fulltimestudent_No);
			}			
		}
		if (!pdextracircularactivities.equals("")) {
			Reporter.log("Step 12 - Enter Extracurricular activities as ("+pdcellphone+")");
			String Extracircularpd = getElementIDbyLabel("Extracurricular activities",PD_Extracurricularactivities);				
			type(Extracircularpd,pdextracircularactivities);
		}
		if (!pdcountry.equals("")) {
			Reporter.log("Step 13 - Select Country as ("+pdcountry+")");
			String Countrypd = getElementIDbyLabel("Country",PD_Country);				
			select(Countrypd,pdcountry);
		}
		if (!pdstate.equals("")) {
			Reporter.log("Step 14 - Select State / province as ("+pdstate+")");
			String Statepd = getElementIDbyLabel("State / province",PD_Stateprovince);				
			select(Statepd,pdstate);
		}
		if (!pdgradelevel.equals("")) {
			Reporter.log("Step 15 - Check Grade Level as ("+pdgradelevel+")");
//			String Gradelevelpd = getElementIDbyLabel("Grade Level",PD_GradeLevel);
//			check(Gradelevelpd);
			if ( !attributeNameValue(attributeName_xpath, PD_GradeLevel).isSelected() )
			{
				attributeNameValue(attributeName_xpath, PD_GradeLevel).click();
			}
		}
		if (!pdessay.equals("")) {
			Reporter.log("Step 16 - Select Essay without attachment as ("+pdessay+")");
			String Essaypd = getElementIDbyLabel("Essay without attachment",PD_Essaywithoutattachment);				
			select(Essaypd,pdessay);
		}
		if (!pdupload.equals("")) {
			Reporter.log("Step 17 - Upload document ("+pdupload+")");
			String Uploaddocumentpd = getElementIDbyLabel("upload document", PD_uploaddocument);
			type(Uploaddocumentpd, pdupload);
		}
		if (!pdcollegehousing.equals("")) {
			Reporter.log("Step 18 - Select Do you intend to live in college housing as ("+pdcollegehousing+")");
			String Collegehousingpd = getElementIDbyLabel("Do you intend to live in college housing", PD_Collegehousing);
			type(Collegehousingpd,pdcollegehousing);
		}
		if (!pdsportsintrest.equals("")) {
			Reporter.log("Step 19 - Select Sports Interest as ("+pdsportsintrest+")");
			String Sportsintrestpd = getElementIDbyLabel("Sports Interest", PD_SportsInterest);
			select(Sportsintrestpd,pdsportsintrest);			
		}
		if (!pdtestscore.equals("")) {
			Reporter.log("Step 20 - Enter Test score as ("+pdtestscore+")");
			String Testscorepd = getElementIDbyLabel("Test score",PD_Testscore);
			type(Testscorepd,pdtestscore);
		}
		if (!pdacademicintrest.equals("")) {
			Reporter.log("Step 21 - Enter Academic Interest as ("+pdacademicintrest+")");
			String Academicinterestpd = getElementIDbyLabel("Academic Interest",PD_AcademicInterest);
			select(Academicinterestpd,pdacademicintrest);
		}
		if (!pdschoolcode.equals("")) {
			Reporter.log("Step 23 - Enter School code as ("+pdschoolcode+")");
			String Schoolcodepd = getElementIDbyLabel("School Code",PD_SchoolCode);
			type(Schoolcodepd,pdschoolcode);
		}
		if (!pdemailaddress.equals("")) {
			Reporter.log("Step 24 - Enter Email address as ("+pdemailaddress+")");
			String Emailaddresspd = getElementIDbyLabel("Email address",PD_Emailaddress);
			type(Emailaddresspd,pdemailaddress);
		}
		if (!pdaptnumber.equals("")) {
			Reporter.log("Step 25 - Enter Apt number as ("+pdaptnumber+")");
			String Aptnumberpd = getElementIDbyLabel("Apt number",PD_Aptnumber);
			type(Aptnumberpd,pdaptnumber);
		}
		if (!pdemailrecommended.equals("")) {
			Reporter.log("Step 26 - Enter EmailRecommended as ("+pdemailrecommended+")");
			String Emailrecommendedpd = getElementIDbyLabel("EmailRecommended",PD_EmailRecommended);
			type(Emailrecommendedpd,pdemailrecommended);
		}

		if (!pdsave.equals("")) {
			Reporter.log("Step 27 - Click on ("+pdsave+")Button");
			if(pdsave.equalsIgnoreCase("Save")){
				click(PD_Save);
				waitForPageToLoad();
			}else if (pdsave.equalsIgnoreCase("Save & Continue")) {
				click(PD_SaveContinue);
				waitForPageToLoad();
			}else if (pdsave.equalsIgnoreCase("Reset")) {
				click(PD_Reset);
			}
		}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
}

}
