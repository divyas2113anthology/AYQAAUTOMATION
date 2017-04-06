package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;


public class EnrollmentPersonalInfo_Input extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Operation in 'Enrollment Personal Info' page")
	public void EnrollmentPersonalInfo_Input() throws IOException, RowsExceededException, BiffException, WriteException{
		try {		
				writeDetails();
				String[]  accprofileidatarepo = datacontainer;
				Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment Personal Info' page");
				String attend = accprofileidatarepo[0];
				String firstname = accprofileidatarepo[1];
				String lastname = accprofileidatarepo[2];
				String sayno = accprofileidatarepo[3];
				String livein = accprofileidatarepo[4];
				String choice = accprofileidatarepo[5];
				String submissionreset = accprofileidatarepo[6];
				Reporter.log("Input Test Data was retrieved for 'Enrollment Personal Info' page");
				if (!attend.equals("")) {
					Reporter.log("Step 1 - Select the attened as ("+attend+")");
					waitForElementPresentWebdriver(attributeName_xpath, EPI_AttendYes, attend);
					if (attend.equalsIgnoreCase("Yes")) {
						clickWebdriver(attributeName_xpath, EPI_AttendYes);
					}else if (attend.equalsIgnoreCase("No")) {
						clickWebdriver(attributeName_xpath, EPI_AttendNo);
					}
				}	
				if (!firstname.equals("")) {
					Reporter.log("Step 2 - Enter 'First Name' as ("+firstname+")");		
					String FirstName = getElementIDbyLabel("First name", EPI_FstName);
					sendKeys(attributeName_xpath, FirstName, firstname);
				}
				if (!lastname.equals("")) {
					Reporter.log("Step 3 - Enter 'Last Name' as ("+lastname+")");		
					String LastName = getElementIDbyLabel("Last Name", EPI_LstName);
					sendKeys(attributeName_xpath, LastName, lastname);
				}
				if (!sayno.equals("")) {
					Reporter.log("Step 4 - Enter 'SayNo' as ("+sayno+")");		
					String SayNo = getElementIDbyLabel("Why did you say NO?", EPI_SayNo);
					sendKeys(attributeName_xpath, SayNo, sayno);
				}
				if (!livein.equals("")) {
					Reporter.log("Step 5 - Select the 'Livein' as ("+livein+")");		
					String Livein = getElementIDbyLabel("Live In", EPI_LiveIn);
					selectByValueWebdriver(attributeName_xpath, Livein, livein);
				}
				
				if (!choice.equals("")) {
					Reporter.log("Step 6 - Select the choice as ("+choice+")");		
					String [] Choice = choice.split("_");
					if (choice.contains("Check")) {
						switchToDefaultContentWebdriver();
						waitForElementPresentWebdriverWait(attributeName_xpath, "//label[text()='"+Choice[0]+"']/../../input", Choice[0]);
						clickWebdriver(attributeName_xpath, "//label[text()='"+Choice[0]+"']");
					}else if (choice.contains("UnCheck")) {
						waitForElementPresentWebdriverWait(attributeName_xpath, "//label[text()='"+Choice[0]+"']/../../input", Choice[0]);
						doubleClickWebdriver(attributeName_xpath, "//label[text()='"+Choice[0]+"']");
					}
				}
				
				if (!submissionreset.equals("")) {
					Reporter.log("Step 7 - Click on '"+submissionreset+"' button");
					if (submissionreset.equalsIgnoreCase("proceed to submission")) {
						clickWebdriver(attributeName_xpath, EPI_ProToSubBtn);
						waitForPageToLoadWebdriver();
					}else if (submissionreset.equalsIgnoreCase("Reset")) {
						clickWebdriver(attributeName_xpath, EPI_ResetBtn);
					}
				}
				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
