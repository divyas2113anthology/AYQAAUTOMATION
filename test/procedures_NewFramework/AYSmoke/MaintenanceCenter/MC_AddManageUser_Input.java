package procedures_NewFramework.AYSmoke.MaintenanceCenter;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MC_AddManageUser_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Add Manage User' page")
	public void MC_AddManageUser_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Manage User' Page");
			String[] testdata = datacontainer;
			String showhideinstruction = testdata[0];
			String savecancel = testdata[1];
			String userid = testdata[2];
			String firstname = testdata[3];
			String lastname = testdata[4];
			String title = testdata[5];
			String emailaddress = testdata[6];
			String status = testdata[7];
			String arrow = testdata[8];
			String rolesassigned = testdata[9];
			String rolesnotassigned = testdata[10];
			String privilegesassigned = testdata[11];
			String checkprivilegesnotassigned = testdata[12];
			String privilegesname = testdata[13];
						
			Reporter.log("Input Test Data was retrieved for 'Add Manage User' Page");
			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String useridMC = userid+dateFormat.format(date)+ Calendar.getInstance().getTimeInMillis();
			if (!userid.equals("")) {
				Reporter.log("Enter the user id as ["+useridMC+"]");
				sendKeys(attributeName_xpath, MS_userid, useridMC);
			}
			String firstnameMC = userid+dateFormat.format(date)+ Calendar.getInstance().getTimeInMillis();
			if (!firstname.equals("")) {
				Reporter.log("Enter the First Name as ["+firstnameMC+"]");
				sendKeys(attributeName_xpath, MS_firstname, firstnameMC);
			}
			String lastnameMC = userid+dateFormat.format(date)+ Calendar.getInstance().getTimeInMillis();
			if (!lastname.equals("")) {
				Reporter.log("Enter the Last Name as ["+lastnameMC+"]");
				sendKeys(attributeName_xpath, MS_lastname, lastnameMC);
			}

			if (!title.equals("")) {
				Reporter.log("Enter the Title as ["+title+"]");
				sendKeys(attributeName_xpath, MS_title, title);
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Enter the Title as ["+emailaddress+"]");
				sendKeys(attributeName_xpath, MS_Email, emailaddress);
			}
						
			if(!checkprivilegesnotassigned.equals("")){
				Reporter.log("Check"+title);
				//clickWebdriver(attributeName_xpath, MS_CheckPrivilege+privilegesname+"']//preceding-sibling::input[@type='checkbox']");
				clickWebdriver(attributeName_xpath, "//font[contains(.,'"+checkprivilegesnotassigned+"')]/input[contains(@name,'cbPrivID')]");
				/*(attributeName_xpath,"//input[@name='cbPrivID1']");
				clickWebdriver(attributeName_xpath,"//input[@name='cbPrivID3']");
				clickWebdriver(attributeName_xpath,".//input[@name='cbRoleID5']");
				clickWebdriver(attributeName_xpath,"//input[@name='cbPrivID6']");*/
				Thread.sleep(5000);
			}	
		
			if(!savecancel.equals("")){
				Reporter.log("Click on the Button"+savecancel);
				clickWebdriver(attributeName_xpath, MS_savecancel+savecancel+"')]");
			}	
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	}
