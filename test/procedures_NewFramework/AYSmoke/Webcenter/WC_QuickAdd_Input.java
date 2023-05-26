package procedures_NewFramework.AYSmoke.Webcenter;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.util.Calendar;

public class WC_QuickAdd_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Quick Add' page")
	public void WC_QuickAdd_Input() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Test Data in 'Quick Add' input");
		String[]  fpdatarepo = datacontainer;
		String pdsufix = fpdatarepo[0];
		String pdfirstname = fpdatarepo[1];
		String pdmiddlename = fpdatarepo[2];
		String pdlastname = fpdatarepo[3];
		String checkbutton = fpdatarepo[4];
		String pddateofbirth = fpdatarepo[5];
		String pdssn = fpdatarepo[6];
		String pdgender = fpdatarepo[7];
		String pdcellphone = fpdatarepo[8];
		String pdfulltimestudent = fpdatarepo[9];
		String pdcollegehousing = fpdatarepo[10];
		String pdsportsintrest = fpdatarepo[11];
		String pdschoolcode = fpdatarepo[12];
		String pdemailaddress= fpdatarepo[13];
		String pullquestion = fpdatarepo[14];
		String pushquestion = fpdatarepo[15];
		String feereviewappfee = fpdatarepo[16];
		String feepaymentmethod = fpdatarepo[17];
		String paymentreceiveddate = fpdatarepo[18];
		String paymentstatus = fpdatarepo[19];
		String pdsave = fpdatarepo[20];
		String addrecommendationproviders = fpdatarepo[21];
		Reporter.log("Retrieved Test Data in 'Quick Add' input");
		recentPopupSelectWebdriver("Quick Add");
		if (!pdsufix.equals("")) {
			Reporter.log("Step 1 - Select Suffix as ("+pdsufix+")");
			String Sufixpd = getElementIDbyLabel("Suffix",PD_Suffix);
			waitForElementPresentWebdriver(attributeName_xpath, Sufixpd, pdsufix);
			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,Sufixpd,pdsufix);
		}
		if (!pdfirstname.equals("")) {
			Reporter.log("Step 2 - Enter First Name as ("+pdfirstname+")");
			String Fnamepd = getElementIDbyLabel("First Given Name",PD_FirstGivenName);	
			String PDFirstName = pdfirstname+Calendar.getInstance().getTimeInMillis();
			sendKeys(attributeName_xpath,Fnamepd,PDFirstName);
			Runtimedatawrite(PDFirstName, pdfirstname);
		}
		if (!pdmiddlename.equals("")) {
			Reporter.log("Step 3 - Enter Middle Name as ("+pdmiddlename+")");
			String MNamepd = getElementIDbyLabel("Middle name",PD_Middlename);				
			sendKeys(attributeName_xpath,MNamepd,pdmiddlename);
		}
		if (!pdlastname.equals("")) {
			Reporter.log("Step 4 - Enter Last Name as ("+pdlastname+")");
			String LNamepd = getElementIDbyLabel("Last name",PD_Lastname);		
			String PDLastName = pdlastname+Calendar.getInstance().getTimeInMillis();
			sendKeys(attributeName_xpath,LNamepd,PDLastName);
		}
		if (!checkbutton.equals("")) {
			Reporter.log("Step 5 - Click the Check Button");
			int currentpopupcount = getWindowHandles();
			clickWebdriver(attributeName_xpath, "//input[@value='Check']");
			waitForPageToLoadWebdriver();
			recentMultiplePopupSelectWebdriver("Online Application", currentpopupcount);
			
		}
		
		if (!pddateofbirth.equals("")) {
			Reporter.log("Step 6 - Enter Date of birth as ("+pddateofbirth+")");
			String Dateofbirthpd = getElementIDbyLabel("Date of birth",PD_Dateofbirth);				
			sendKeys(attributeName_xpath,Dateofbirthpd, pddateofbirth);
		}
		if (!pdssn.equals("")) {
			Reporter.log("Step 7 - Enter SSN as ("+pdssn+")");
			String SSNpd = getElementIDbyLabel("SSN",PD_SSN);				
			sendKeys(attributeName_xpath,SSNpd,pdssn);
		}
		if (!pdgender.equals("")) {
			Reporter.log("Step 8 - Select Gender as ("+pdgender+")");
			String Genderpd = getElementIDbyLabel("Gender",PD_Gender);				
			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,Genderpd,pdgender);
		}
		if (!pdcellphone.equals("")) {
			Reporter.log("Step 9 - Enter Cell Phone as ("+pdcellphone+")");
			String Cellphonepd = getElementIDbyLabel("Cell Phone",PD_CellPhone);				
			if (pdcellphone.equalsIgnoreCase("Null")) {
				attributeNameValue(attributeName_xpath, Cellphonepd).clear();
			}else {
				sendKeys(attributeName_xpath,Cellphonepd, pdcellphone);
			}
		}
		if (!pdfulltimestudent.equals("")) {
			Reporter.log("Step 10 - Check Full Time Student as ("+pdfulltimestudent+")");
			if (pdfulltimestudent.equalsIgnoreCase("Yes")){
				clickWebdriver(attributeName_xpath,PD_Fulltimestudent_Yes);
			}else if  (pdfulltimestudent.equalsIgnoreCase("No")){
				clickWebdriver(attributeName_xpath,PD_Fulltimestudent_No);
			}			
		}
		if (!pdcollegehousing.equals("")) {
			Reporter.log("Step 11 - Select Do you intend to live in college housing as ("+pdcollegehousing+")");
//			String Replacepdcollegehousing = pdcollegehousing.replace(";", ", ");
			String Collegehousingpd = getElementIDbyLabel("Do you intend to live in college housing", PD_Collegehousing);
			selectByVisibleTextWebdriver(attributeName_xpath,Collegehousingpd,pdcollegehousing);
		}
		if (!pdsportsintrest.equals("")) {
			Reporter.log("Step 12 - Select Sports Interest as ("+pdsportsintrest+")");
			String Sportsintrestpd = getElementIDbyLabel("Sports Interest", PD_SportsInterest);
			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,Sportsintrestpd,pdsportsintrest);
		}
		if (!pdschoolcode.equals("")) {
			Reporter.log("Step 13 - Enter School code as ("+pdschoolcode+")");
			String Schoolcodepd = getElementIDbyLabel("School Code",PD_SchoolCode);
			sendKeys(attributeName_xpath,Schoolcodepd,pdschoolcode);
		}
		if (!pdemailaddress.equals("")) {
			Reporter.log("Step 14 - Enter Email address as ("+pdemailaddress+")");
			String Emailaddresspd = getElementIDbyLabel("Email address",PD_Emailaddress);
			sendKeys(attributeName_xpath,Emailaddresspd,pdemailaddress);
		}
		if (!pullquestion.equals("")) {
			Reporter.log("Step 15 - Enter Pull Question as ("+pullquestion+")");
			String PullQuestion = getElementIDbyLabel("Pull Question",PD_PullQuestion);
			sendKeys(attributeName_xpath,PullQuestion,pullquestion);
		}
		if (!pushquestion.equals("")) {
			Reporter.log("Step 16 - Enter Push Question as ("+pushquestion+")");
			String PullQuestion = getElementIDbyLabel("Push Question",PD_PullQuestion);
			sendKeys(attributeName_xpath,PullQuestion,pullquestion);
		}
		if (!feereviewappfee.equals("")) {
			Reporter.log("Step 17 - Proceed to Check ("+feereviewappfee+") Review Application Fee Radio");
			//clickWebdriver(attributeName_xpath, "//font[contains(text(),'')]/input[@type='radio']");

                scrollDown(driver,400);
				clickWebdriver(attributeName_xpath, "//font[contains(text(),'"+feereviewappfee+"')]/descendant::input[@type='radio']");//changed by saran kumar



//			if (feereviewappfee.equalsIgnoreCase("Domestic")) {
//				clickWebdriver(attributeName_xpath, QA_Domestic);				
//			}else if (feereviewappfee.equalsIgnoreCase("International")) {
//				clickWebdriver(attributeName_xpath, QA_International);		
//			}
		}
		if (!feepaymentmethod.equals("")) {
			Reporter.log("Step 18 - Proceed to Check ("+feepaymentmethod+") Select Payment Method Radio");
			clickWebdriver(attributeName_xpath, "//font[contains(text(),'"+feepaymentmethod+"')]/input[@type='radio']");
//			if (feepaymentmethod.equalsIgnoreCase("Check")) {
//				clickWebdriver(attributeName_xpath, QA_International);	
//			}else if (feepaymentmethod.equalsIgnoreCase("Fee Waiver")) {
//				clickWebdriver(attributeName_xpath, QA_International);			
//			}else if (feepaymentmethod.equalsIgnoreCase("Credit Card")) {
//				clickWebdriver(attributeName_xpath, QA_International);	
//			}			
		}
		if (!paymentreceiveddate.equals("")) {
			Reporter.log("Step 19 - Enter the payment received ("+paymentreceiveddate+") ");
			sendKeys(attributeName_name, "paymentReceivedDt", paymentreceiveddate);
		}
		if (!paymentstatus.equals("")) {
			Reporter.log("Step 20 - Enter the payment status ("+paymentreceiveddate+") ");
			//selectByVisibleTextWebdriver(attributeName_name, "paymentstatus", paymentstatus);
			if(paymentstatus.equals("App Fee Status")){
				String status = Runtimedataread(paymentstatus);
				waitForElementPresentWebdriver(attributeName_name, "paymentstatus", status);
				selectByVisibleTextWithSpaceWebdriver(attributeName_name, "paymentstatus", status);
				}
			selectByVisibleTextWithSpaceWebdriver(attributeName_name, "paymentstatus", paymentstatus);
		}
		if (!pdsave.equals("")) {
			Reporter.log("Step 21 - Click on ("+pdsave+")Button");
			if(pdsave.equalsIgnoreCase("Submit")){
				clickWebdriver(attributeName_xpath, QA_SubmitBtn);
				waitForPageToLoadWebdriver();
				Thread.sleep(5000);

			}else if (pdsave.equalsIgnoreCase("Reset")) {
				clickWebdriver(attributeName_xpath, QA_ResetBtn);
			}
		}
		if (!addrecommendationproviders.equals("")) {
			Reporter.log("Step 22 - Select the add recommendation providers ("+feereviewappfee+")");
			if (addrecommendationproviders.contains("check")) {
				checkWebdriver(attributeName_name, "cbAddRcmds");				
			}else if (addrecommendationproviders.contains("Uncheck")) {
				uncheckWebdriver(attributeName_name, "cbAddRcmds");	
			}
		}
	
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
}

}
