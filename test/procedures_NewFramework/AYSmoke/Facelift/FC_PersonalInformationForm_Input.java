package procedures_NewFramework.AYSmoke.Facelift;

import or.OR;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.util.Calendar;

public class FC_PersonalInformationForm_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Personal Information' page")	
	public void FC_PersonalInformationForm_Input () throws Exception{
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
			String button_to_click = personalinfoidatarepo[9];
			String pisubmitappbtn = personalinfoidatarepo[10];
			Reporter.log("Input Test Data was retrieved for 'Personal Information' page");
			/*if (!pisuffix.equals("")) {
				Reporter.log("Step 1 - Select Suffix as ("+pisuffix+")");

				String SufID = getElementIDbyLabel("Suffix",PII_Suffix);
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,SufID, pisuffix);
			}*/
			if (!pifirstgivenname.equals("")) {
				Reporter.log("Step 2 - Enter First Name as ("+pifirstgivenname+")");
				String fNameID = getElementIDbyLabel("First Name",PII_FirstName);
				sendKeys(attributeName_xpath,fNameID, pifirstgivenname+Calendar.getInstance().getTimeInMillis());
			}
			if (!pilastname.equals("")) {
				Reporter.log("Step 3 - Enter Last Name as ("+pilastname+")");
				String LNameID = getElementIDbyLabel("Last Name",PII_LastName);
				sendKeys(attributeName_xpath,LNameID, pilastname);
			}
			if (!pifulltimestudent.equals("")) {
				Reporter.log("Step 4 - Check Full Time Student as ("+pifulltimestudent+")");
				if (pifulltimestudent.equalsIgnoreCase("Yes")){
					driver.findElement(By.xpath(PII_FullTimeStudent_Yes)).sendKeys(" ");
					clickWebdriver(attributeName_xpath, PII_FullTimeStudent_Yes);		
				}else if  (pifulltimestudent.equalsIgnoreCase("No")){
					driver.findElement(By.xpath(PII_FullTimeStudent_No)).sendKeys(" ");
					clickWebdriver(attributeName_xpath, PII_FullTimeStudent_No);
				}			
			}
			if (!piethnicity.equals("")) {
				Reporter.log("Step 5 - Check Ethnicity as ("+piethnicity+")");
				String ethiID = getElementIDbyLabel(piethnicity,PII_EthniValue);
				checkWebdriver(attributeName_xpath,ethiID);
			}
			if (!pissn.equals("")) {
				Reporter.log("Step 6 - Enter Social Security Number as ("+pissn+")");
				String ssnID = getElementIDbyLabel("Social Security Number", PII_SSN);
				sendKeys(attributeName_xpath,ssnID, pissn);
			}
			if (!piDateofBirth.equals("")) {
				Reporter.log("Step 7 - Enter Date of Birth as ("+piDateofBirth+")");
				String dobID = getElementIDbyLabel("Date of Birth", PII_DOB);
				sendKeys(attributeName_xpath,dobID, piDateofBirth);
			}
			if (!pisportsinterest.equals("")) {
				Reporter.log("Step 8 - Enter Favourite Sports as ("+pisportsinterest+")");
				String sportID = getElementIDbyLabel("Favourite Sports", PII_Sports);
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,sportID,pisportsinterest);
			}
			if (!piluckyno.equals("")) {
				Reporter.log("Step 9 - Check Lucky Number as ("+piluckyno+")");
				String LuckyID = getElementIDbyLabel(piluckyno,PII_Luckyno);
				checkWebdriver(attributeName_xpath,LuckyID);
			}
			if (!button_to_click.equals("")) {
				Reporter.log("Step 10 - Click on ("+button_to_click+")Button");
				if (button_to_click.equalsIgnoreCase("Address Lookup")) {
					clickWebdriverWithCoordinates(attributeName_xpath, PII_AddressLookupBtn);
					waitForPopupWebdriver();
					waitForPageToLoadWebdriver();
					Thread.sleep(5000);
					//recentPopupSelectWebdriver("Address Lookup");
					recentPopupSelect_without_window_nameWebdriver();

				} else if(button_to_click.equalsIgnoreCase("Save")){
					waitForElementPresentWebdriver(attributeName_xpath,PSD_Save, button_to_click);
					//clickWebdriver(attributeName_xpath,PII_SaveBottom);
					clickWebdriver(attributeName_xpath, PSD_Save);
					//waitForPopupWebdriver();
					waitForPageToLoadWebdriver();
				}else if (button_to_click.equalsIgnoreCase("Save & Continue")) {
					clickWebdriver(attributeName_xpath,PII_SaveContinue);
				}else if (button_to_click.equalsIgnoreCase("Reset")) {
					clickWebdriver(attributeName_xpath,PII_Reset);
				}
			}
			if (!pisubmitappbtn.equals("")) {
				Reporter.log("Step 11 - Click on ("+pisubmitappbtn+")Button");
				if (pisubmitappbtn.equalsIgnoreCase("Submit Applicant")) {
					clickWebdriver(attributeName_xpath,AW_SubAppBtn);
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
