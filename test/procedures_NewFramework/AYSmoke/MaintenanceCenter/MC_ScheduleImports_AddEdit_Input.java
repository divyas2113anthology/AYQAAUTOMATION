package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ScheduleImports_AddEdit_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Schedule Import Add/Edit' page")
	public void MC_ScheduleImports_AddEdit_Input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String importdefinition = testdata[0];
		String servernameip = testdata[1];
		String serverdirectory = testdata[2];
		String username = testdata[3];
		String usesftp = testdata[4];
		String password = testdata[5];
		String importfilename = testdata[6];
		String emailreport = testdata[7];
		String startdate = testdata[8];
		String starthour = testdata[9];
		String startminute = testdata[10];
		String enddate = testdata[11];
		String testsavecancel = testdata[12];
		String queryname = testdata[13];
		String publickey = testdata[14];
		String sftport = testdata[15];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!importdefinition.equals("")) {
			Reporter.log("Step 1 - Select the Import Definition as ["+importdefinition+"]");
//			select("//select[@name='txtInterfaceId']", "regexp:"+exportdefinition);
//			selectByVisibleTextWebdriver(attributeName_name, "txtInterfaceId", "regexp:"+exportdefinition);
//			WebElement SelectValue = attributeNameValue(attributeName_xpath, "//select/option[contains(text(), '" + exportdefinition + "')]");
//			SelectValue.click();
			clickWebdriver(attributeName_xpath, "//select/option[contains(text(), '" + importdefinition + "')]");
		}
		if (!servernameip.equals("")) {
			Reporter.log("Step 2 - Enter the Server Name as ["+servernameip+"]");
			sendKeys(attributeName_name, "txtFTPServer", servernameip);
		}
		if (!serverdirectory.equals("")) {
			Reporter.log("Step 3 - Enter the Server Directory as ["+serverdirectory+"]");
			sendKeys(attributeName_name, "txtFTPDirectory", serverdirectory);
		}
		if (!username.equals("")) {
			Reporter.log("Step 4 - Enter the User Name as ["+username+"]");
			sendKeys(attributeName_name, "txtFTPUsername", username);
		}
		if (!usesftp.equals("")) {
			Reporter.log("Step 5  - Select the USE SFTP as ["+usesftp+"]");
			if (usesftp.equalsIgnoreCase("Check")) {
				checkWebdriver(attributeName_name, "chkUseSFTP");
			}else{
				uncheckWebdriver(attributeName_name, "chkUseSFTP");
			}
		}
		if (!password.equals("")) {
			Reporter.log("Step 6 - Enter the Password as ["+password+"]");
			sendKeys(attributeName_name, "txtFTPPassword", password);
		}
		if (!importfilename.equals("")) {
			Reporter.log("Step 7 - Enter the Import file name as ["+importfilename+"]");
			sendKeys(attributeName_name, "txtFilename", importfilename);
		}
		if (!emailreport.equals("")) {
			Reporter.log("Step 8 - Enter the  Email for execution report as ["+emailreport+"]");
			sendKeys(attributeName_name, "txtEmailList", emailreport);
		}
		if (!startdate.equals("")) {
			Reporter.log("Step 9 - Enter the Start Date as ["+startdate+"]");
			String getcurrentdate = requiredDateAndFormat("MM/dd/yyyy", startdate);
			sendKeys(attributeName_name, "txtStartDate", getcurrentdate);
		}
		if (!starthour.equals("")) {
			Reporter.log("Step 10 - Enter the Start Hour as ["+starthour+"]");
			String StartHour = requiredHourAndMinute("hh", starthour);
			selectByVisibleTextWebdriver(attributeName_name, "selHourStart", StartHour);
		}
		if (!startminute.equals("")) {
			Reporter.log("Step 11 - Enter the Start Minute as ["+startminute+"]");
			String StartMinute = requiredHourAndMinute("mm", startminute);
			selectByVisibleTextWebdriver(attributeName_name, "selMinutesStart", StartMinute);
		}
		if (!enddate.equals("")) {
			Reporter.log("Step 9 - Enter the Start Date as ["+enddate+"]");
			String getcurrentdate = requiredDateAndFormat("MM/dd/yyyy", enddate);
			sendKeys(attributeName_name, "txtEndDate", getcurrentdate+1);
		}
		if (!testsavecancel.equals("")) {
			Reporter.log("Step 12 - Click the name of the button as ["+testsavecancel+"]");
			if (testsavecancel.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_name, "imgSubmitBtnTop");
			}else if (testsavecancel.equalsIgnoreCase("Cancel")) {
				clickWebdriver(attributeName_xpath, ESR_Cancel);
				waitForPageToLoadWebdriver();
			}else if (testsavecancel.equalsIgnoreCase("Test FTP Connection")) {
				clickWebdriver(attributeName_name, "btnTestFTP");
				recentPopupSelectWebdriver("FTP Test");
			}
		}
		if(!sftport.equals("")){
			Reporter.log("Step 15 - Enter SFTP Port as ["+sftport+"]");
			sendKeys(attributeName_name, "txtSFTPPort", sftport);
		}
		
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}