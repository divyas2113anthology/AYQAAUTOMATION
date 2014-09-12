package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class UpdateProfile_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Update Profile' page")
	public void UpdateProfile_Input() throws Exception{
		try {
			writeDetails();			
//			headerStatement("UpdateProfile_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Update Profile' page");
			String[]  updateproidatarepo = datacontainer;
			String firstgivenname = updateproidatarepo[0];
			String lastfamilyname = updateproidatarepo[1];
			String emailaddress = updateproidatarepo[2];
			String birthdate = updateproidatarepo[3];
			String zippostalcode = updateproidatarepo[4];
			String password = updateproidatarepo[5];
			String confirmpassword = updateproidatarepo[6];
			String beforeapplicationsubmission = updateproidatarepo[7];
			String updateclose = updateproidatarepo[8];
			Reporter.log("Input Test Data was retrieved for 'Update Profile' page");
			Date date = new Date();  
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String firstname = firstgivenname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();
			if (!firstgivenname.equals("")) {
				Reporter.log("Step 1 - Enter 'First/Given Name' as ("+firstname+")");
				type(upaFirstName, firstname);				
			}
			String lastname = lastfamilyname+Calendar.getInstance().getTimeInMillis();
			if (!lastfamilyname.equals("")) {
				Reporter.log("Step 2 - Enter 'Last or Family Name' as ("+lastname+")");		
				type(upaLastName, lastname);
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Step 3 - Enter 'Email Address' as ("+emailaddress+")");		
				type(upaEmailAddress, emailaddress);
			}
			if (!birthdate.equals("")) {
				Reporter.log("Step 4 - Enter 'Birth date' as ("+birthdate+")");	
				waitForElementPresentWebdriver(attributeName_xpath, upaBirthDate, birthdate);
				type(upaBirthDate, birthdate);
			}
			if (!zippostalcode.equals("")) {
				Reporter.log("Step 5 - Enter 'Zip/Postal Code' as ("+zippostalcode+")");			
				type(upaZipCode, zippostalcode);
			}
			if (!password.equals("")) {
				Reporter.log("Step 6 - Enter 'Password' as ("+password+")");	
				type(upaPassword, password);
			}
			if (!confirmpassword.equals("")) {
				Reporter.log("Step 7 - Enter 'Confirm Password' as ("+confirmpassword+")");	
				type(upaConfirmPassword, confirmpassword);
			}
			if (!beforeapplicationsubmission.equals("")) {
				Reporter.log("Step 8 - Check("+beforeapplicationsubmission+") in the 'Application Submission' Radio");
				if (beforeapplicationsubmission.equalsIgnoreCase("Yes")) {
					check(upaappsubmission_Yes);
				}else if(beforeapplicationsubmission.equalsIgnoreCase("No")) {
					check(upaappsubmission_No);
				}
			}
			if (!updateclose.equals("")) {
				Reporter.log("Step 9 - Click on ("+updateclose+") Button");
				if (updateclose.equalsIgnoreCase("update")) {
					click(upaupdatebtn);
					waitForPageToLoad();
				}else if (updateclose.equalsIgnoreCase("close window")) {
					click(upaclosebtn);
//					writeFailure("Its Not Naviagted to Main Page");
					selectMainWindowWebdriver();			
	//				writeFailure("Its Not Naviagted to Main Page");
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
