package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ScheduleExport_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Schedule Exports Add/Edit' page")
	public void MC_ScheduleExport_Input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String exportdefinition = testdata[0];
		String applicant_search = testdata[1];
		String export_filename = testdata[2];
		String servernameip = testdata[3];
		String serverdirectory = testdata[4];
		String username = testdata[5];
		String usesftp = testdata[6];
		String password = testdata[7];
		String testsftp = testdata[8];
		String runtime_options = testdata[9];
		String startdate = testdata[10];
		String starthour = testdata[11];
		String startminute = testdata[12];
		String enddate = testdata[13];
		String save_cancel = testdata[14];
		
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!exportdefinition.equals("")) {
			Reporter.log("Step 1 - Select the Export Definition as ["+exportdefinition+"]");
//			select("//select[@name='txtInterfaceId']", "regexp:"+exportdefinition);
//			selectByVisibleTextWebdriver(attributeName_name, "txtInterfaceId", "regexp:"+exportdefinition);
//			WebElement SelectValue = attributeNameValue(attributeName_xpath, "//select/option[contains(text(), '" + exportdefinition + "')]");
//			SelectValue.click();
			//clickWebdriver(attributeName_xpath, "//select/option[contains(text(), '" + exportdefinition + "')]");
			clickWebdriver(attributeName_xpath, "//select/option[contains(text(), '" + exportdefinition + "')]");
		}
		if (!applicant_search.equals("")) {
			Reporter.log("Step 2 - Select Applicant search option as ["+applicant_search+"]");
			if(applicant_search.equalsIgnoreCase("Query")){
				clickWebdriver(attributeName_xpath, "//input[contains(@id,'"+applicant_search+"')]");
				clickWebdriver(attributeName_xpath, "//select/option[contains(text(),'TestforUserQueries')]");
			}
			else if(applicant_search.equalsIgnoreCase("XML"))
				clickWebdriver(attributeName_xpath, "//input[contains(@id,'"+applicant_search+"')]");
		}
		if (!export_filename.equals("")) {
			Reporter.log("Step 4 - Enter the Export file name as ["+export_filename+"]");
			waitForElementPresentWebdriver(attributeName_name, "rdoFilename",export_filename);
			clickWebdriver(attributeName_id, "rdoFilenameGiven");
			waitForElementPresentWebdriver(attributeName_name, "txtFilename", "Export");
			sendKeys(attributeName_name, "txtFilename", export_filename);
		}
		if (!servernameip.equals("")) {
			Reporter.log("Step 5 - Enter the Server Name as ["+servernameip+"]");
			sendKeys(attributeName_name, "txtFTPServer", servernameip);
		}
		if (!serverdirectory.equals("")) {
			Reporter.log("Step 6 - Enter the Server Directory as ["+serverdirectory+"]");
			sendKeys(attributeName_name, "txtFTPDirectory", serverdirectory);
		}
		if (!username.equals("")) {
			Reporter.log("Step 7 - Enter the User Name as ["+username+"]");
			sendKeys(attributeName_name, "txtFTPUsername", username);
		}
		if (!usesftp.equals("")) {
			Reporter.log("Step 8  - Select the USE SFTP as ["+usesftp+"]");
			if (usesftp.equalsIgnoreCase("yes")) {
				checkWebdriver(attributeName_name, "chkUseSFTP");
			}else{
				uncheckWebdriver(attributeName_name, "chkUseSFTP");
			}
		}
		if (!password.equals("")) {
			Reporter.log("Step 9 - Enter the Password as ["+password+"]");
			sendKeys(attributeName_name, "txtFTPPassword", password);
		}
		//testsftp
		if (!testsftp.equals("")) {
			Reporter.log("Step 10 - Click on Test FTP connection as ["+testsftp+"]");
			clickWebdriver(attributeName_name, "btnTestFTP");
			recentPopupSelectWebdriver("FTP Test");
		}
		//runtime_options
		if (!runtime_options.equals("")) {
			Reporter.log("Step 11 - Select Runtime option as ["+runtime_options+"]");
			if(runtime_options.equalsIgnoreCase("Empty"))
				clickWebdriver(attributeName_xpath, "//input[contains(@name,'"+runtime_options+"')]");
			else if(runtime_options.equalsIgnoreCase("Inc"))
				clickWebdriver(attributeName_xpath, "//input[contains(@name,'"+runtime_options+"')]");
			else if(runtime_options.equalsIgnoreCase("Exclude"))
				clickWebdriver(attributeName_xpath, "//input[contains(@name,'"+runtime_options+"')]");
			else if(runtime_options.equalsIgnoreCase("Mark"))
				clickWebdriver(attributeName_xpath, "//input[contains(@name,'"+runtime_options+"')]");
			else if(runtime_options.equalsIgnoreCase("Email")){
				clickWebdriver(attributeName_xpath, "//input[contains(@name,'"+runtime_options+"')]");
				sendKeys(attributeName_name, "txtEmailList", "emtqaaccount@hobsons.com");
		}
		if (!startdate.equals("")) {
			Reporter.log("Step 12 - Enter the Start Date as ["+startdate+"]");
			String getcurrentdate = requiredDateAndFormat("MM/dd/yyyy", startdate);
			sendKeys(attributeName_name, "txtStartDate", getcurrentdate);
		}
		if (!starthour.equals("")) {
			Reporter.log("Step 13 - Enter the Start Hour as ["+starthour+"]");
			String StartHour = requiredHourAndMinute("hh", starthour);
			selectByVisibleTextWebdriver(attributeName_name, "selHourStart", StartHour);
		}
		if (!startminute.equals("")) {
			Reporter.log("Step 14 - Enter the Start Minute as ["+startminute+"]");
			String StartMinute = requiredHourAndMinute("mm", startminute);
			selectByVisibleTextWebdriver(attributeName_name, "selMinutesStart", StartMinute);
		}
		if (!enddate.equals("")) {
			Reporter.log("Step 15 - Enter the Start Date as ["+enddate+"]");
			String getcurrentdate = requiredDateAndFormat("MM/dd/yyyy", enddate);
			sendKeys(attributeName_name, "txtEndDate", getcurrentdate+1);
		}
		if (!save_cancel.equals("")) {
			Reporter.log("Step 12 - Click the name of the button as ["+save_cancel+"]");
			if (save_cancel.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_name, "imgSubmitBtnTop");
			}else if (save_cancel.equalsIgnoreCase("Cancel")) {
				clickWebdriver(attributeName_xpath, ESR_Cancel);
				waitForPageToLoad();
			}
				
		}
		}
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}

