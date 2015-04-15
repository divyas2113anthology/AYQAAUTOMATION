package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import java.util.Calendar;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PersonalInformationForm_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Personal Information' page")	
	public void PersonalInformationForm_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalInformationForm_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Personal Information' page");
			String[]  personalinfoidatarepo = datacontainer;
			String pisuffix = personalinfoidatarepo[0];
			String pifirstgivenname = personalinfoidatarepo[1];
			String pilastname = personalinfoidatarepo[2];
			String pifulltimestudent = personalinfoidatarepo[3];
			String piethnicity = personalinfoidatarepo[4];
			String pissn = personalinfoidatarepo[5];
			String piDateofBirth = personalinfoidatarepo[6];
			String pisportsinterest = personalinfoidatarepo[7];
			String piluckyno = personalinfoidatarepo[8];
			String picity = personalinfoidatarepo[9];
			String pisavebutton = personalinfoidatarepo[10];
			Reporter.log("Input Test Data was retrieved for 'Personal Information' page");
			if (!pisuffix.equals("")) {
				Reporter.log("Step 1 - Select Suffix as ("+pisuffix+")");
				String SufID = getElementIDbyLabel("Suffix",PI_Suffix);				
				select(SufID, pisuffix);
				//sendKeys(attributeName_xpath, PI_Suffix, pisuffix);
			}
			if (!pifirstgivenname.equals("")) {
				Reporter.log("Step 2 - Enter First Name as ("+pifirstgivenname+")");
				String fNameID = getElementIDbyLabel("First Name",PI_FirstName);				
				type(fNameID, pifirstgivenname+Calendar.getInstance().getTimeInMillis());
			}
			if (!pilastname.equals("")) {
				Reporter.log("Step 3 - Enter Last Name as ("+pilastname+")");
				String LNameID = getElementIDbyLabel("Last Name",PI_LastName);				
				type(LNameID, pilastname);
			}
			if (!pifulltimestudent.equals("")) {
				Reporter.log("Step 4 - Check Full Time Student as ("+pifulltimestudent+")");
				if (pifulltimestudent.equalsIgnoreCase("Yes")){
					click(PI_FullTimeStudent_Yes);		
				}else if  (pifulltimestudent.equalsIgnoreCase("No")){
					click(PI_FullTimeStudent_No);
				}			
			}
			if (!piethnicity.equals("")) {
				Reporter.log("Step 5 - Check Ethnicity as ("+piethnicity+")");
				String ethiID = getElementIDbyLabel(piethnicity,PI_EthniValue);
				check(ethiID);
			}
			if (!pissn.equals("")) {
				Reporter.log("Step 6 - Enter Social Security Number as ("+pissn+")");
				String ssnID = getElementIDbyLabel("Social Security Number", PI_SSN);
				type(ssnID, pissn);
			}
			if (!piDateofBirth.equals("")) {
				Reporter.log("Step 7 - Enter Date of Birth as ("+piDateofBirth+")");
				String dobID = getElementIDbyLabel("Date of Birth", PI_DOB);
				type(dobID, piDateofBirth);
			}
			if (!pisportsinterest.equals("")) {
				Reporter.log("Step 8 - Enter Favourite Sports as ("+pisportsinterest+")");
				String sportID = getElementIDbyLabel("Favourite Sports", PI_Sports);
				select(sportID,pisportsinterest);			
			}
			if (!piluckyno.equals("")) {
				Reporter.log("Step 9 - Check Lucky Number as ("+piluckyno+")");
				String LuckyID = getElementIDbyLabel(piluckyno,PI_Luckyno);
				check(LuckyID);
			}
			if (!pisavebutton.equals("")) {
				Reporter.log("Step 10 - Click on ("+pisavebutton+")Button");
				if (pisavebutton.equalsIgnoreCase("Address Lookup")) {
					click(PI_AddressLookupBtn);
//					recentPopupSelect("Address Lookup");	
					recentPopupSelectWebdriver("Address Lookup");
				} else if(pisavebutton.equalsIgnoreCase("Save")){
					clickWebdriverWithCoordinates(attributeName_xpath, PI_Save);
					waitForPageToLoad();
				}else if (pisavebutton.equalsIgnoreCase("Save & Continue")) {
					click(PI_SaveContinue);
					waitForPageToLoad();
				}else if (pisavebutton.equalsIgnoreCase("Reset")) {
					click(PI_Reset);
				}else if (pisavebutton.equalsIgnoreCase("close window")) {
					closeWindowWebdriver();
					Thread.sleep(3000);
					selectMainWindowWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
