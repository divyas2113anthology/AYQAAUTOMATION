package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_ScheduleExports_AddEdit_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Schedule Exports Add/Edit' page")
	public void MC_ScheduleExports_AddEdit_Input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String exportdefinition = testdata[0];
		String servernameip = testdata[1];
		String serverdirectory = testdata[2];
		String username = testdata[3];
		String usesftp = testdata[4];
		String password = testdata[5];
		String startdate = testdata[6];
		String starthour = testdata[7];
		String startminute = testdata[8];
		String testsavecancel = testdata[9];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!exportdefinition.equals("")) {
			Reporter.log("Step 1 - Select the Export Definition as ["+exportdefinition+"]");
//			select("//select[@name='txtInterfaceId']", "regexp:"+exportdefinition);
//			selectByVisibleTextWebdriver(attributeName_name, "txtInterfaceId", "regexp:"+exportdefinition);
//			WebElement SelectValue = attributeNameValue(attributeName_xpath, "//select/option[contains(text(), '" + exportdefinition + "')]");
//			SelectValue.click();
			clickWebdriver(attributeName_xpath, "//select/option[contains(text(), '" + exportdefinition + "')]");
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
		if (!startdate.equals("")) {
			Reporter.log("Step 7 - Enter the Start Date as ["+startdate+"]");
			String getcurrentdate = requiredDateAndFormat("MM/dd/yyyy", startdate);
			sendKeys(attributeName_name, "txtStartDate", getcurrentdate);
		}
		if (!starthour.equals("")) {
			Reporter.log("Step 8 - Enter the Start Hour as ["+starthour+"]");
			String StartHour = requiredHourAndMinute("hh", starthour);
			selectByVisibleTextWebdriver(attributeName_name, "selHourStart", StartHour);
		}
		if (!startminute.equals("")) {
			Reporter.log("Step 9 - Enter the Start Minute as ["+startminute+"]");
			String StartMinute = requiredHourAndMinute("mm", startminute);
			selectByVisibleTextWebdriver(attributeName_name, "selMinutesStart", StartMinute);
		}
		if (!testsavecancel.equals("")) {
			Reporter.log("Step 10 - Click the name of the button as ["+testsavecancel+"]");
			if (testsavecancel.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_name, "imgSubmitBtnTop");
			}else if (testsavecancel.equalsIgnoreCase("Cancel")) {
				clickWebdriver(attributeName_xpath, ESR_Cancel);
				waitForPageToLoad();
			}else if (testsavecancel.equalsIgnoreCase("Test FTP Connection")) {
				clickWebdriver(attributeName_name, "btnTestFTP");
				recentPopupSelectWebdriver("FTP Test");
			}
		}
		
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}


