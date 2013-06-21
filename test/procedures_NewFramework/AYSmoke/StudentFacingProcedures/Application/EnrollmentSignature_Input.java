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

public class EnrollmentSignature_Input extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Operation in 'Enrollment Signature' page")
	public void EnrollmentSignature_Input() throws IOException, RowsExceededException, BiffException, WriteException{
		try {		
				writeDetails();
//				headerStatement("AccountProfile_Input");
//				startExecutionOrder(j);
//				writeParametersTable();
				String[]  accprofileidatarepo = datacontainer;
				Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment Signature' page");
				String fullname = accprofileidatarepo[0];
				String date = accprofileidatarepo[1];
				String submit = accprofileidatarepo[2];
				Reporter.log("Input Test Data was retrieved for 'Enrollment Signature' page");
				if (!fullname.equals("")) {
					Reporter.log("Step 1 - Enter 'Full Name' as ("+fullname+")");
					if (!fullname.equals("")) {
						Reporter.log("Enter the Full Name as ("+fullname+") ");
						sendKeys(attributeName_id, "eSignName", fullname);
					}
				}	
				if (!date.equals("")) {			
					Reporter.log("Step 2 - Enter 'Date' as ("+date+")");	
					sendKeys(attributeName_id, "esignDate", date);
				}		
				if (!submit.equals("")) {
					Reporter.log("Step 3 - Click on 'Submit' button");
					clickWebdriver(attributeName_xpath, EFP_SubmitEnrollmentBtn);
					waitForPageToLoad();	
				}
				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	


}

