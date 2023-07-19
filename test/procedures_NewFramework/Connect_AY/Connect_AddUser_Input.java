package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Connect_AddUser_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to fill all required details in ADD USER page")
	public void Connect_AddUser_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add User");
			String[] testdata = datacontainer;
			String userid = testdata[0];
			String firstname = testdata[1];
			String lastname = testdata[2];
			String title = testdata[3];
			String emailid = testdata[4];
			String status = testdata[5];
			String defaultproduct = testdata[6];
			String savecancel = testdata[7];
			
			Reporter.log("Input Test Data was retrieved for 'Add User' Page");
			Date date = new Date();
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");

			String useridcreated = userid+dateFormat.format(date)+ Calendar.getInstance().getTimeInMillis();

			if (!userid.equals("")) {

				Reporter.log("Step 1 - Enter the User id as ["+useridcreated+"]");
				sendKeys(attributeName_xpath, MML_userid, useridcreated);
				waitForPageToLoadWebdriver();
				Runtimedatawrite(useridcreated,userid);
			}
			if (!firstname.equals("")) {
				Reporter.log("Step 2 - Enter the First Name as ["+firstname+"]");
				sendKeys(attributeName_xpath, MML_FirstName, firstname);
				waitForPageToLoadWebdriver();
			}
			if (!lastname.equals("")) {
				Reporter.log("Step 3 - Enter the Last Name as ["+lastname+"]");
				sendKeys(attributeName_xpath, MML_LastName, lastname);
				waitForPageToLoadWebdriver();
			}
			if (!emailid.equals("")) {
				Reporter.log("Step 4 - Enter the Email ID as ["+emailid+"]");
				sendKeys(attributeName_xpath, MML_Email, emailid);
				waitForPageToLoadWebdriver();
			}
			if (!savecancel.equals("")) {
				Reporter.log("Step 5 - Click on ["+savecancel+"]");
				if(savecancel.equalsIgnoreCase("save"))
				{
					clickWebdriver(attributeName_xpath, MML_Save);
					waitForPageToLoadWebdriver();
				}
				else {
					clickWebdriver(attributeName_id, MML_Cancel);
					waitForPageToLoadWebdriver();
				}
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}


}
