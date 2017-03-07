package procedures_NewFramework.AYSmoke.BridgeWebcenter;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class BR_WCManualAdd extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Operation in 'Account Profile' page")
	public void BR_WCManualAdd() throws IOException, RowsExceededException, BiffException, WriteException{
		try {		
				writeDetails();
				String[]  accprofileidatarepo = datacontainer;
				Reporter.log("Proceed to retrieve Input Test Data for 'Account Profile' page");
				String firstgivenname = accprofileidatarepo[0];
				String lastorfamilyname = accprofileidatarepo[1];
				String emailaddress = accprofileidatarepo[2];
				String confirmemailaddress = accprofileidatarepo[3];
				String birthdate = accprofileidatarepo[4];
				String zippostalcode = accprofileidatarepo[5];
				String createaccount = accprofileidatarepo[6];
				Reporter.log("Input Test Data was retrieved for 'Account Profile' page");
				recentPopupSelectWebdriver("Manual Add");
				Date date = new Date();  
				DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String firstname = firstgivenname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();				
				if (!firstgivenname.equals("")) {
					Reporter.log("Step 1 - Enter 'First/Given Name' as ("+firstname+")");
					sendKeys(attributeName_name, "AppFName", firstname);
					Reporter.log("Proceed to Write First Name as ("+firstname+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
					Runtimedatawrite(firstname,firstgivenname);
				}	
				String lastname = lastorfamilyname+Calendar.getInstance().getTimeInMillis();		
				if (!lastorfamilyname.equals("")) {
					Reporter.log("Step 2 - Enter 'Last or Family Name' as ("+lastname+")");		
//					type(LastName, lastname);
					sendKeys(attributeName_name, "AppLName", lastname);
				}	
				
				if (!emailaddress.equals("")) {
					Reporter.log("Step 3 - Enter 'Email Address' as ("+emailaddress+")");		
//					type(EmailAddress, emailaddress);
					sendKeys(attributeName_name, "AppEmail", emailaddress);
				}
				
				if (!confirmemailaddress.equals("")) {			
					Reporter.log("Step 4 - Enter 'Confirm Email Address' as ("+confirmemailaddress+")");	
//					type(ConfirmEmailAddress, confirmemailaddress);
					sendKeys(attributeName_name, "AppVerificationEmail", confirmemailaddress);
				}	
				
				if (!birthdate.equals("")) {
					Reporter.log("Step 5 - Enter 'Birth date' as ("+birthdate+")");		
//					type(BirthDate, birthdate);
					sendKeys(attributeName_name, "AppBirthdt", birthdate);
				}
				
				if (!zippostalcode.equals("")) {
					Reporter.log("Step 6 - Enter 'Zip/Postal Code' as ("+zippostalcode+")");			
//					type(ZipCode, zippostalcode);
					sendKeys(attributeName_name, "AppZip", zippostalcode);
				}
				
				if (!createaccount.equals("")) {
					Reporter.log("Step 7 - Click on 'Create Account' button");
					clickWebdriver(attributeName_xpath, CreateAccount_ManualAdd);
					waitForPageToLoadWebdriver();
				}
				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	


}

