package procedures_NewFramework.AYSmoke.Facelift;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.util.Calendar;

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
			String pdtestdemo = fpdatarepo[11];
			String pdextracircularactivities = fpdatarepo[12];
			String pdcountry = fpdatarepo[13];
			String pdstate = fpdatarepo[14];
			String pdgradelevel = fpdatarepo[15];
			String pdessay = fpdatarepo[16];
			String pdupload = fpdatarepo[17];
			String pdcollegehousing = fpdatarepo[18];
			String pdsportsintrest = fpdatarepo[19];
			String pdtestscore = fpdatarepo[20];
			String pdacademicintrest = fpdatarepo[21];
			String pdschoolcode = fpdatarepo[22];
			String pdemailaddress= fpdatarepo[23];
			String pdaptnumber = fpdatarepo[24];
			String pdemailrecommended = fpdatarepo[25];
			String pisubmitappbtn = fpdatarepo[26];
			String button_to_click = fpdatarepo[27];
			String pverifyErrormessage = fpdatarepo[28];
			Reporter.log("Retrieved Test Data in Personal Data input");
			/*if (!pdsufix.equals("")) {
				Reporter.log("Step 1 - Select Suffix as ("+pdsufix+")");
				String Sufixpd = getElementIDbyLabel("Suffix",PSD_Suffix);				
//				select(Sufixpd,pdsufix);
				System.out.println("Suffix"    +Sufixpd);
				waitForElementPresentWebdriver(attributeName_linktext, Sufixpd,pdsufix);
				selectByValueWebdriver(attributeName_linktext, Sufixpd,pdsufix);
			}*/
			if (!pdfirstname.equals("")) {
				Reporter.log("Step 2 - Enter First Name as ("+pdfirstname+")");
			//	String Fnamepd = getElementIDbyLabel("First Name", PSD_FirstGivenName);//Modified by Rahul Mehta


				sendKeys(attributeName_xpath,"//*[@id='q35020']",pdfirstname+Calendar.getInstance().getTimeInMillis()); // change xpath by saran jun 9 2023
				selectByIndexWebdriver(attributeName_xpath,"//*[@id='s40207']",2);// add this line for this 69986 TC By saran kumar k jun 9 2023
			}
			if (!pdmiddlename.equals("")) {
				Reporter.log("Step 3 - Enter Middle Name as ("+pdmiddlename+")");
				String MNamepd = getElementIDbyLabel("Middle Name",PSD_Middlename);				
				sendKeys(attributeName_xpath,MNamepd,pdmiddlename);
			}
			if (!pdlastname.equals("")) {
				Reporter.log("Step 4 - Enter Last Name as ("+pdlastname+")");
				String LNamepd = getElementIDbyLabel("Last name", PSD_Lastname);				
				sendKeys(attributeName_xpath,LNamepd,pdlastname);
			}
			if (!pddateofbirth.equals("")) {
				Reporter.log("Step 5 - Enter Date of birth as ("+pddateofbirth+")");
				String Dateofbirthpd = getElementIDbyLabel("Date of birth",PSD_Dateofbirth);				
				sendKeys(attributeName_xpath,Dateofbirthpd,pddateofbirth);
			}
			if (!pdssn.equals("")) {
				Reporter.log("Step 6 - Enter SSN as ("+pdssn+")");
				String SSNpd = getElementIDbyLabel("SSN",PSD_SSN);				
				sendKeys(attributeName_xpath,SSNpd,pdssn);
			}
			if (!pdparentssn.equals("")) {
				Reporter.log("Step 7 - Enter Parent SSN as ("+pdparentssn+")");
				String Pssnpd = getElementIDbyLabel("Parent Social Security num",PSD_ParentSSN);//Modified by rahul Mehta
				sendKeys(attributeName_xpath,Pssnpd,pdparentssn);
			}
			if (!pdgender.equals("")) {
				Reporter.log("Step 8 - Select Gender as ("+pdgender+")");
				String Genderpd = getElementIDbyLabel("Gender",PSD_Gender);				
//				select(Genderpd,pdgender);
				selectByValueWebdriver(attributeName_xpath, Genderpd,pdgender);
			}
			if (!pdhomephone.equals("")) {
				Reporter.log("Step 9 - Enter Home phone as ("+pdhomephone+")");
				String Homephonepd = getElementIDbyLabel("Home Phone",PSD_HomePhone);				
				sendKeys(attributeName_xpath,Homephonepd, pdhomephone);
			}
			if (!pdcellphone.equals("")) {
				Reporter.log("Step 10 - Enter Cell Phone as ("+pdcellphone+")");
				String Cellphonepd = getElementIDbyLabelContains("Cell Phone",PSD_CellPhone);
				waitForElementPresentWebdriverWait(attributeName_xpath, Cellphonepd, pdcellphone);
				if (pdcellphone.equalsIgnoreCase("Null")) {
					attributeNameValue(attributeName_xpath, Cellphonepd).clear();
				}else {
					sendKeys(attributeName_xpath,Cellphonepd, pdcellphone);
				}
			}
			if (!pdfulltimestudent.equals("")) {
				Reporter.log("Step 11 - Check Full Time Student as ("+pdfulltimestudent+")");
				if (pdfulltimestudent.equalsIgnoreCase("Yes")){
					waitForElementPresentWebdriver(attributeName_xpath, PSD_Fulltimestudent_Yes, pdfulltimestudent);
					clickWebdriver(attributeName_xpath, PSD_Fulltimestudent_Yes);
				}else if (pdfulltimestudent.equalsIgnoreCase("No")){
					waitForElementPresentWebdriver(attributeName_xpath, PSD_Fulltimestudent_No, pdfulltimestudent);
					clickWebdriver(attributeName_xpath, PSD_Fulltimestudent_No);
				}			
			}
			if(!pdtestdemo.equals(""))
			{
				Reporter.log("Step 11.5 - Enter value for TestDemo as("+pdtestdemo+")");
				waitForElementPresentWebdriver(attributeName_xpath, PSD_TestDemo, pdtestdemo);
				sendKeys(attributeName_xpath, PSD_TestDemo, pdtestdemo);
			}
			if (!pdextracircularactivities.equals("")) {
				Reporter.log("Step 12 - Enter Extracurricular activities as ("+pdcellphone+")");
				String Extracircularpd = getElementIDbyLabel("Extracurricular activities",PSD_Extracurricularactivities);				
				sendKeys(attributeName_xpath,Extracircularpd,pdextracircularactivities);
			}
			if (!pdcountry.equals("")) {
				Reporter.log("Step 13 - Select Country as ("+pdcountry+")");
				String Countrypd = getElementIDbyLabel("Country",PSD_Country);
//				environment = Runtimedataread("Instance");
//				if (pdcountry.contains("United States")) {
//					if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
//						pdcountry = pdcountry.replace("United States", "USA");
//					}
//				}
//				select(Countrypd,pdcountry);
				waitForElementPresentWebdriver(attributeName_xpath, Countrypd,pdcountry);
				selectByValueWebdriver(attributeName_xpath, Countrypd,pdcountry);
			}
			if (!pdstate.equals("")) {
				Reporter.log("Step 14 - Select State / province as ("+pdstate+")");
				String Statepd = getElementIDbyLabel("State / province",PSD_Stateprovince);
//				environment = Runtimedataread("Instance");
//				if (pdstate.contains("Washington DC")) {
//					if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
//						pdstate = pdstate.replace("Washington DC", "Virginia");
//					}
//				}
//				select(Statepd,pdstate);
				waitForElementPresentWebdriver(attributeName_xpath, Statepd,pdstate);
				selectByValueWebdriver(attributeName_xpath, Statepd,pdstate);
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
//				select(Essaypd,pdessay);
				selectByValueWebdriver(attributeName_xpath, Essaypd,pdessay);
			}
			if (!pdupload.equals("")) {
				Reporter.log("Step 17 - Upload document ("+pdupload+")");
				String Uploaddocumentpd = getElementIDbyLabel("upload document", PSD_uploaddocument);
				sendKeys(attributeName_xpath,Uploaddocumentpd, pdupload);
			}
			if (!pdcollegehousing.equals("")) {
				Reporter.log("Step 18 - Select Do you intend to live in college housing as ("+pdcollegehousing+")");
				String Collegehousingpd = getElementIDbyLabel("Do you intend to live in college housing", PSD_Collegehousing);
				sendKeys(attributeName_xpath,Collegehousingpd,pdcollegehousing);
			}
			if (!pdsportsintrest.equals("")) {
				Reporter.log("Step 19 - Select Sports Interest as ("+pdsportsintrest+")");
				String Sportsintrestpd = getElementIDbyLabel("Sports Interest", PSD_SportsInterest);
//				select(Sportsintrestpd,pdsportsintrest);	
				waitForElementPresentWebdriver(attributeName_xpath, Sportsintrestpd, pdsportsintrest);
				selectByValueWebdriver(attributeName_xpath, Sportsintrestpd, pdsportsintrest);
			}
			if (!pdtestscore.equals("")) {
				Reporter.log("Step 20 - Enter Test score as ("+pdtestscore+")");
				String Testscorepd = getElementIDbyLabel("Test score",PSD_Testscore);
				sendKeys(attributeName_xpath,Testscorepd,pdtestscore);
			}
			if (!pdacademicintrest.equals("")) {
				Reporter.log("Step 21 - Enter Academic Interest as ("+pdacademicintrest+")");
				String Academicinterestpd = getElementIDbyLabel("Academic Interest",PSD_AcademicInterest);
//				select(Academicinterestpd,pdacademicintrest);
				selectByValueWebdriver(attributeName_xpath, Academicinterestpd,pdacademicintrest);
			}
			if (!pdschoolcode.equals("")) {
				Reporter.log("Step 22 - Enter School code as ("+pdschoolcode+")");
				String Schoolcodepd = getElementIDbyLabel("School Code",PSD_SchoolCode);
				sendKeys(attributeName_xpath,Schoolcodepd,pdschoolcode);
			}
			if (!pdemailaddress.equals("")) {
				Reporter.log("Step 23 - Enter Email address as ("+pdemailaddress+")");
				String Emailaddresspd = getElementIDbyLabel("Email address",PSD_Emailaddress);
				sendKeys(attributeName_xpath,Emailaddresspd,pdemailaddress);
			}
			if (!pdaptnumber.equals("")) {
				Reporter.log("Step 24 - Enter Apt number as ("+pdaptnumber+")");
				String Aptnumberpd = getElementIDbyLabel("Apt number",PSD_Aptnumber);
				sendKeys(attributeName_xpath,Aptnumberpd,pdaptnumber);
			}
			if (!pdemailrecommended.equals("")) {
				Reporter.log("Step 25 - Enter EmailRecommended as ("+pdemailrecommended+")");
				String Emailrecommendedpd = getElementIDbyLabel("EmailRecommended",PSD_EmailRecommended);
				sendKeys(attributeName_xpath,Emailrecommendedpd,pdemailrecommended);
			}


			
			if (!button_to_click.equals("")) {
				Reporter.log("Step 27 - Click on ("+button_to_click+")Button");
				if(button_to_click.equalsIgnoreCase("Save")){
					waitForElementPresentWebdriverWait(attributeName_xpath, PSD_Save, button_to_click);
//					actionsClickWebdriver(attributeName_xpath, PSD_Save);
					//clickWebdriverWithCoordinates(attributeName_xpath, PSD_Save);
					clickWebdriver(attributeName_xpath, PSD_Save);
//					sendKeyStroke(attributeName_xpath, PSD_Save, Keys.SPACE);
					sleep(2);//Modified By Rahul Mehta
				
				}else if (button_to_click.equalsIgnoreCase("Save & Continue")) {
					clickWebdriver(attributeName_xpath, PSD_SaveContinue);
					waitForPageToLoadWebdriver();
				}else if (button_to_click.equalsIgnoreCase("Reset")) {
					clickWebdriver(attributeName_xpath, PSD_Reset);
					waitForPageToLoadWebdriver();//Modified By Rahul Mehta
				}
			}
				if (!pisubmitappbtn.equals("")) {
					System.out.println("BBBBBBBBBBBBBB");
					Reporter.log("Step 26 - Click on ("+pisubmitappbtn+")Button");
					if (pisubmitappbtn.equalsIgnoreCase("Submit Applicant")) {
						System.out.println("AAAAAAAAAAAAAAAAAAA");
						clickWebdriver(attributeName_xpath, AW_SubAppBtn);
					}
				}
				if(!pverifyErrormessage.equals("")){
					sleep(2);//Modified By Rahul Mehta
					if(isDisplayedWebdriver(attributeName_xpath,AW_SystemMessage)){
						Reporter.log("Step 28 - Verify System error message for mandatory fields successfully");
					}
					else if(pverifyErrormessage.equalsIgnoreCase("validation")){

						isDisplayedWebdriver(attributeName_xpath,"//p/a[text()='Company']");
						Reporter.log("Step 28 - Verify System Validation message for mandatory fields successfully");
					}
					else{
						writeFailure("Couldn't verify the System error message for mandatory fields");
					}


				}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
