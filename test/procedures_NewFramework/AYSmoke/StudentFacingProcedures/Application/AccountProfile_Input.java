package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class AccountProfile_Input extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Operation in 'Account Profile' page")
	public void AccountProfile_Input() throws IOException, RowsExceededException, BiffException, WriteException{
		try {		
				writeDetails();
//				headerStatement("AccountProfile_Input");
//				startExecutionOrder(j);
//				writeParametersTable();
				String[]  accprofileidatarepo = datacontainer;
				Reporter.log("Proceed to retrieve Input Test Data for 'Account Profile' page");
				String firstgivenname = accprofileidatarepo[0];
				String firstnameyes = accprofileidatarepo[1];
				String lastorfamilyname = accprofileidatarepo[2];
				String emailaddress = accprofileidatarepo[3];
				String confirmemailaddress = accprofileidatarepo[4];
				String birthdate = accprofileidatarepo[5];
				String zippostalcode = accprofileidatarepo[6];
				String username = accprofileidatarepo[7];
				String password = accprofileidatarepo[8];
				String confirmpassword = accprofileidatarepo[9];
				String confirmyes = accprofileidatarepo[10];
				String createaccount = accprofileidatarepo[11];
				String AppPassword;
				Reporter.log("Input Test Data was retrieved for 'Account Profile' page");
				Date date = new Date();  
				DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String firstname = firstgivenname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();				
				if (!firstgivenname.equals("")) {
					Reporter.log("Step 1 - Enter 'First/Given Name' as ("+firstname+")");
					type(FirstName, firstname);		
					if (!firstnameyes.equals("")) {
						Reporter.log("Proceed to Write First Name as ("+firstname+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(firstname,firstnameyes);
					}
				}	
		
				
				String lastname = lastorfamilyname+Calendar.getInstance().getTimeInMillis();		
				if (!lastorfamilyname.equals("")) {
					Reporter.log("Step 2 - Enter 'Last or Family Name' as ("+lastname+")");		
					type(LastName, lastname);
				}	
				
				if (!emailaddress.equals("")) {
					Reporter.log("Step 3 - Enter 'Email Address' as ("+emailaddress+")");		
					type(EmailAddress, emailaddress);
				}
				
				if (!confirmemailaddress.equals("")) {			
					Reporter.log("Step 4 - Enter 'Confirm Email Address' as ("+confirmemailaddress+")");	
					type(ConfirmEmailAddress, confirmemailaddress);
				}	
				
				if (!birthdate.equals("")) {
					Reporter.log("Step 5 - Enter 'Birth date' as ("+birthdate+")");		
					type(BirthDate, birthdate);
				}
				
				if (!zippostalcode.equals("")) {
					Reporter.log("Step 6 - Enter 'Zip/Postal Code' as ("+zippostalcode+")");			
					type(ZipCode, zippostalcode);
				}
				
				if (!username.equals("")) {
					Reporter.log("Step 7 - Enter 'UserName' as ("+username+")");	
				}	
				
				if (!password.equals("")) {			
					Reporter.log("Step 8 - Enter 'Password' as ("+password+")");	
					AppPassword = Runtimedataread(password);
					type(Password, AppPassword);
				}		
				if (!confirmpassword.equals("")) {
					Reporter.log("Step 9 - Enter 'Confirm Password' as ("+confirmpassword+")");	
					AppPassword = Runtimedataread(confirmpassword);
					type(ConfirmPassword, AppPassword);			
					if (!confirmyes.equalsIgnoreCase("")) {
						Reporter.log("Proceed to Write Confirm Password as ("+confirmpassword+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(confirmpassword,confirmyes);			
					}
				}	
				
				if (!createaccount.equals("")) {
					Reporter.log("Step 10 - Click on 'Create Account' button");
					if (createaccount.equalsIgnoreCase("create account")) {
						click(CreateAccount);
						waitForPageToLoad();	
					}
					if(createaccount.equalsIgnoreCase("update account")){
						click(CA_CreateAccountBtn);
						waitForPageToLoad();
					}
				}
				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	


}
