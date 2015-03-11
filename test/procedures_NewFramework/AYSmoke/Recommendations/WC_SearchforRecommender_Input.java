package procedures_NewFramework.AYSmoke.Recommendations;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_SearchforRecommender_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some input in 'Search for Recommender' page")
	public void WC_SearchforRecommender_Input() throws Exception{
	try {
		writeDetails();
		String[]  fpvdatarepo = datacontainer;
		String online = fpvdatarepo[0];
		String offline = fpvdatarepo[1];
		String both = fpvdatarepo[2];
		String rec_submitted = fpvdatarepo[3];
		String rec_notsubmitted = fpvdatarepo[4];
		String rec_app_submitted = fpvdatarepo[5];
		String rec_notprinted = fpvdatarepo[6];
		String rec_notexported = fpvdatarepo[7];
		String create_date = fpvdatarepo[8];
		String submission_date = fpvdatarepo[9];
		String rec_firstname = fpvdatarepo[10];
		String rec_lastname = fpvdatarepo[11];
		String rec_email = fpvdatarepo[12];
		String rec_pac = fpvdatarepo[13];
		String app_firstname = fpvdatarepo[14];
		String app_lastname = fpvdatarepo[15];
		String app_email = fpvdatarepo[16];
		String app_pin = fpvdatarepo[17];
		String app_appid = fpvdatarepo[18];
		String submitdate_from = fpvdatarepo[19];
		String submitdate_to = fpvdatarepo[20];
		String printeddate_from = fpvdatarepo[21];
		String printeddate_to = fpvdatarepo[22];
		String exporteddate_from = fpvdatarepo[23];
		String exporteddate_to = fpvdatarepo[24];
		String clear = fpvdatarepo[25];
		String submit = fpvdatarepo[26];
		String daterange_from = fpvdatarepo[27];
		String daterange_to = fpvdatarepo[28];
		
		if (!online.equals("")) {
			Reporter.log("Step 1 - Verify Message("+online+") was displayed correctly");
			
			
		}
		if (!offline.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+offline+") page");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_DisplayOffline, offline);
			clickWebdriver(attributeName_xpath, SFR_DisplayOffline);
			
		}
		if (!both.equals("")) {
			Reporter.log("Step 3 - Verify its navigate to ("+both+") page");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_DisplayBoth, both);
			clickWebdriver(attributeName_xpath, SFR_DisplayBoth);
		}
		if (!rec_submitted.equals("")) {
			Reporter.log("Step 4 - Select the option of ("+rec_submitted+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecSubmitted, rec_submitted);
			clickWebdriver(attributeName_xpath, SFR_RecSubmitted);
		}
		if (!rec_notsubmitted.equals("")) {
			Reporter.log("Step 5 - Select the option of ("+rec_notsubmitted+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecNotSubmitted, rec_notsubmitted);
			clickWebdriver(attributeName_xpath, SFR_RecNotSubmitted);
		}
		if (!rec_app_submitted.equals("")) {
			Reporter.log("Step 6 - Select the option of ("+rec_app_submitted+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecAppSubmitted, rec_app_submitted);
			clickWebdriver(attributeName_xpath, SFR_RecAppSubmitted);
		}
		if (!rec_notprinted.equals("")) {
			Reporter.log("Step 7 - Select the option of ("+rec_notprinted+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecNotPrinted, rec_notprinted);
			clickWebdriver(attributeName_xpath, SFR_RecNotPrinted);
		}
		if (!rec_notexported.equals("")) {
			Reporter.log("Step 8 - Select the option of ("+rec_notexported+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecNotExported, rec_notexported);
			clickWebdriver(attributeName_xpath, SFR_RecNotExported);
		}
		if (!create_date.equals("")) {
			Reporter.log("Step 8 - Select the option of ("+create_date+")");
			waitForElementPresentWebdriver(attributeName_xpath, SAI_CreationDate, create_date);
			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, SAI_CreationDate, create_date);
		}
		if (!submission_date.equals("")) {
			Reporter.log("Step 9 - Select the option of ("+submission_date+")");
			waitForElementPresentWebdriver(attributeName_xpath, SAI_SubmissionDate, submission_date);
			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, SAI_SubmissionDate, submission_date);
		}
		if(!daterange_from.equals("")){
			Reporter.log("Step 9.2 - Enter the date range from as ("+daterange_from+")");  
			waitForElementPresentWebdriver(attributeName_xpath, SAI_DateRangeFrom, daterange_from);
			clickWebdriver(attributeName_xpath, SAI_DateRangeFrom);
			sendKeys(attributeName_xpath, SAI_DateRangeFrom, daterange_from);
		}
		if(!daterange_to.equals("")){
			Reporter.log("Step 9.5 - Enter the date range to as ("+daterange_to+")");  
			waitForElementPresentWebdriver(attributeName_xpath, SAI_DateRangeFrom, daterange_to);
			clickWebdriver(attributeName_xpath, SAI_DateRangeTo);
			sendKeys(attributeName_xpath, SAI_DateRangeTo, daterange_to);
		}
		if (!rec_firstname.equals("")) {
			Reporter.log("Step 10 - Select the option of ("+rec_firstname+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecFirstName, rec_firstname);
			clickWebdriver(attributeName_xpath, SFR_RecFirstName);
			sendKeys(attributeName_xpath, SFR_RecFirstName, rec_firstname);
		}
		if (!rec_lastname.equals("")) {
			Reporter.log("Step 11 - Select the option of ("+rec_lastname+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecLastName, rec_lastname);
			clickWebdriver(attributeName_xpath, SFR_RecLastName);
			sendKeys(attributeName_xpath, SFR_RecLastName, rec_lastname);
		}
		if (!rec_email.equals("")) {
			Reporter.log("Step 12 - Select the option of ("+rec_email+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecEmail, rec_email);
			clickWebdriver(attributeName_xpath, SFR_RecEmail);
			sendKeys(attributeName_xpath, SFR_RecEmail, rec_email);
		}
		if (!rec_pac.equals("")) {
			Reporter.log("Step 13 - Select the option of ("+rec_pac+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecPAC, rec_pac);
			clickWebdriver(attributeName_xpath, SFR_RecPAC);
			sendKeys(attributeName_xpath, SFR_RecPAC, rec_pac);
		}
		if (!app_firstname.equals("")) {
			Reporter.log("Step 14 - Select the option of ("+app_firstname+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_AppFirstName, app_firstname);
			clickWebdriver(attributeName_xpath, SFR_AppFirstName);
			sendKeys(attributeName_xpath, SFR_AppFirstName, app_firstname);
		}
		if (!app_lastname.equals("")) {
			Reporter.log("Step 15 - Select the option of ("+app_lastname+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_RecLastName, app_lastname);
			clickWebdriver(attributeName_xpath, SFR_RecLastName);
			sendKeys(attributeName_xpath, SFR_RecLastName, app_lastname);
		}
		if (!app_email.equals("")) {
			Reporter.log("Step 16 - Select the option of ("+app_email+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_AppEmail, app_email);
			clickWebdriver(attributeName_xpath, SFR_AppEmail);
			sendKeys(attributeName_xpath, SFR_AppEmail, app_email);
		}
		if (!app_pin.equals("")) {
			Reporter.log("Step 17 - Select the option of ("+app_pin+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_AppPin, app_pin);
			clickWebdriver(attributeName_xpath, SFR_AppPin);
			sendKeys(attributeName_xpath, SFR_AppPin, app_pin);
		}
		if (!app_appid.equals("")) {
			Reporter.log("Step 18 - Select the option of ("+app_appid+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_AppID, app_appid);
			clickWebdriver(attributeName_xpath, SFR_AppID);
			sendKeys(attributeName_xpath, SFR_AppID, app_appid);
		}
		if (!submitdate_from.equals("")) {
			Reporter.log("Step 19 - Select the option of ("+submitdate_from+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_SubmittedFrom, submitdate_from);
			clickWebdriver(attributeName_xpath, SFR_SubmittedFrom);
			sendKeys(attributeName_xpath, SFR_SubmittedFrom, submitdate_from);
		}
		if (!submitdate_to.equals("")) {
			Reporter.log("Step 20 - Select the option of ("+submitdate_to+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_SubmittedTo, submitdate_to);
			clickWebdriver(attributeName_xpath, SFR_SubmittedTo);
			sendKeys(attributeName_xpath, SFR_SubmittedTo, submitdate_to);
		}
		if (!printeddate_from.equals("")) {
			Reporter.log("Step 21 - Select the option of ("+printeddate_from+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_PrintedFrom, printeddate_from);
			clickWebdriver(attributeName_xpath, SFR_PrintedFrom);
			sendKeys(attributeName_xpath, SFR_PrintedFrom, printeddate_from);
		}
		if (!printeddate_to.equals("")) {
			Reporter.log("Step 22 - Select the option of ("+printeddate_to+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_PrintedTo, printeddate_to);
			clickWebdriver(attributeName_xpath, SFR_PrintedTo);
			sendKeys(attributeName_xpath, SFR_PrintedTo, printeddate_to);
		}
		if (!exporteddate_from.equals("")) {
			Reporter.log("Step 23 - Select the option of ("+exporteddate_from+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_ExportedFrom, exporteddate_from);
			clickWebdriver(attributeName_xpath, SFR_ExportedFrom);
			sendKeys(attributeName_xpath, SFR_ExportedFrom, exporteddate_from);
		}
		if (!exporteddate_to.equals("")) {
			Reporter.log("Step 24 - Select the option of ("+exporteddate_to+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFR_ExportedTo, exporteddate_to);
			clickWebdriver(attributeName_xpath, SFR_ExportedTo);
			sendKeys(attributeName_xpath, SFR_ExportedTo, exporteddate_to);
		}
		if (!clear.equals("")) {
			Reporter.log("Step 25 - Select the option of ("+clear+")");
			waitForElementPresentWebdriver(attributeName_xpath, SFE_Clear, clear);
			clickWebdriver(attributeName_xpath, SFE_Clear);
		}
		if (!submit.equals("")) {
			Reporter.log("Step 26 - Select the option of ("+submit+")");
			waitForElementPresentWebdriver(attributeName_xpath, SAI_SubmitBtnBottom, submit);
			clickWebdriver(attributeName_xpath, SAI_SubmitBtnBottom);
		}
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
}