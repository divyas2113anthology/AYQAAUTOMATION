package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

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
//				String SufID = getElementIDbyLabel("Suffix",PI_Suffix);				
//				select(SufID, pisuffix);
				sendKeys(attributeName_xpath, PI_Suffix, pisuffix);
			}
			if (!pifirstgivenname.equals("")) {
				Reporter.log("Step 2 - Enter First Name as ("+pifirstgivenname+")");
				String fNameID = getElementIDbyLabel("First Name",PI_FirstName);
				sendKeys(attributeName_xpath,fNameID, pifirstgivenname+Calendar.getInstance().getTimeInMillis());
			}
			if (!pilastname.equals("")) {
				Reporter.log("Step 3 - Enter Last Name as ("+pilastname+")");
				String LNameID = getElementIDbyLabel("Last Name",PI_LastName);
				sendKeys(attributeName_xpath,LNameID, pilastname);
			}
			if (!pifulltimestudent.equals("")) {
				Reporter.log("Step 4 - Check Full Time Student as ("+pifulltimestudent+")");
				if (pifulltimestudent.equalsIgnoreCase("Yes")){
					clickWebdriver(attributeName_xpath,PI_FullTimeStudent_Yes);
				}else if  (pifulltimestudent.equalsIgnoreCase("No")){
					clickWebdriver(attributeName_xpath,PI_FullTimeStudent_No);
				}			
			}
			if (!piethnicity.equals("")) {
				Reporter.log("Step 5 - Check Ethnicity as ("+piethnicity+")");
				String ethiID = getElementIDbyLabel(piethnicity,PI_EthniValue);
				checkWebdriver(attributeName_xpath,ethiID);
			}
			if (!pissn.equals("")) {
				Reporter.log("Step 6 - Enter Social Security Number as ("+pissn+")");
				String ssnID = getElementIDbyLabel("Social Security Number", PI_SSN);
				sendKeys(attributeName_xpath,ssnID, pissn);
			}
			if (!piDateofBirth.equals("")) {
				Reporter.log("Step 7 - Enter Date of Birth as ("+piDateofBirth+")");
				String dobID = getElementIDbyLabel("Date of Birth", PI_DOB);
				sendKeys(attributeName_xpath,dobID, piDateofBirth);
			}
			if (!pisportsinterest.equals("")) {
				Reporter.log("Step 8 - Enter Favourite Sports as ("+pisportsinterest+")");
				String sportID = getElementIDbyLabel("Favourite Sports", PI_Sports);
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,sportID,pisportsinterest);
			}
			if (!piluckyno.equals("")) {
				Reporter.log("Step 9 - Check Lucky Number as ("+piluckyno+")");
				String LuckyID = getElementIDbyLabel(piluckyno,PI_Luckyno);
				checkWebdriver(attributeName_xpath,LuckyID);
			}
			if (!pisavebutton.equals("")) {
				Reporter.log("Step 10 - Click on ("+pisavebutton+")Button");
				if (pisavebutton.equalsIgnoreCase("Address Lookup")) {
					clickWebdriver(attributeName_xpath,PI_AddressLookupBtn);
				//	recentPopupSelect("Address Lookup");
					recentPopupSelectWebdriver("Address Lookup");
				} else if(pisavebutton.equalsIgnoreCase("Save")){
					clickWebdriverWithCoordinates(attributeName_xpath, PI_Save);
					waitForPageToLoadWebdriver();
				}else if (pisavebutton.equalsIgnoreCase("Save & Continue")) {
					clickWebdriver(attributeName_xpath,PI_SaveContinue);
					waitForPageToLoadWebdriver();
				}else if (pisavebutton.equalsIgnoreCase("Reset")) {
					clickWebdriver(attributeName_xpath,PI_Reset);
				}else if (pisavebutton.equalsIgnoreCase("close window")) {
					closeWindowWebdriver();
					//Removed wait time
					selectMainWindowWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
