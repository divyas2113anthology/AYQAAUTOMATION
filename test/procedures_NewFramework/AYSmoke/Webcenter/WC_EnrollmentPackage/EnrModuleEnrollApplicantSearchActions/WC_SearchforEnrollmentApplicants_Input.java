package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.EnrModuleEnrollApplicantSearchActions;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_SearchforEnrollmentApplicants_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Search For Enrollment Applicants' page")
	public void WC_SearchforEnrollmentApplicants_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Search For Enrollment Applicants' Page");
			String[] testdata = datacontainer;
			String recorddisplay = testdata[0];
			String createddate = testdata[1];
			String firstname = testdata[2];
			String lastname = testdata[3];
			String birthdate = testdata[4];
			String emailaddress = testdata[5];
			String zip = testdata[6];
			String createddatefrom = testdata[7];
			String createddateto = testdata[8];
			String applicantid = testdata[9];
			String searchindiquerygroupaction = testdata[10];
			String systemqueries = testdata[11];
			String userqueries = testdata[12];
			String selectagroup = testdata[13];
			String searchbyaction = testdata[14];
			String submit = testdata[15];
			Reporter.log("Input Test Data was retrieved for 'Search For Enrollment Applicants' Page");
			if (!recorddisplay.equals("")) {
				Reporter.log("Step 1 - Enter Number Of recodrs display as ["+recorddisplay+"]");
				selectByValueWebdriver(attributeName_xpath, SAI_NoOFRecords, recorddisplay);
			}			
			if (!createddate.equals("")) {
				Reporter.log("Step 2 - Select the creation date as ["+createddate+"]");
				selectByValueWebdriver(attributeName_xpath, SAI_CreationDate, createddate);
			}
			if (!firstname.equals("")) {
				if(firstname.equals("Rashi")){
					waitForElementPresentWebdriver(attributeName_xpath, SAI_FirstName, firstname);
					click(SAI_FirstName);
					sendKeys(attributeName_xpath, SAI_FirstName, firstname);
					
				}
				else
				{
				String FirstName = Runtimedataread(firstname);
				Reporter.log("Step 3 - Enter the First Name as ["+FirstName+"]");
				System.out.println("aaaaaa");
				waitForElementPresentWebdriver(attributeName_xpath, SAI_FirstName, FirstName);
				click(SAI_FirstName);
				sendKeys(attributeName_xpath, SAI_FirstName, FirstName);
				}
			}
			if (!lastname.equals("")) {
				Reporter.log("Step 4 - Enter the Last Name as ["+lastname+"]");
				waitForElementPresentWebdriver(attributeName_xpath, SAI_LastName, lastname);
				click(SAI_LastName);
				sendKeys(attributeName_xpath, SAI_LastName, lastname);
			}
			if (!birthdate.equals("")) {
				Reporter.log("Step 5 - Enter the birth date as ["+birthdate+"]");
				click(SAI_BirthDate);
				sendKeys(attributeName_xpath, SAI_BirthDate, birthdate);
			}	
			if (!emailaddress.equals("")) {
				Reporter.log("Step 6 - Enter the email address as ["+emailaddress+"]");
				waitForElementPresentWebdriver(attributeName_xpath, SAI_EmailAddress, emailaddress);
				click(SAI_EmailAddress);
				sendKeys(attributeName_xpath, SAI_EmailAddress, emailaddress);
			}
			if (!zip.equals("")) {
				Reporter.log("Step 7 - Enter the Zip as ["+zip+"]");
				click(SAI_Zip);
				sendKeys(attributeName_xpath, SAI_Zip, zip);
			}
			if (!createddatefrom.equals("")) {
				Reporter.log("Step 8 - Enter the Created From date as ["+createddatefrom+"]");
				click("CreatedFrom");
				sendKeys(attributeName_name, "CreatedFrom", createddatefrom);
			}
			if (!createddateto.equals("")) {
				Reporter.log("Step 9 - Enter the Created To date as ["+createddateto+"]");
				sendKeys(attributeName_name, "CreatedTo", createddateto);
			}
			if (!applicantid.equals("")) {
				Reporter.log("Step 10 - Enter the Applicant ID as ["+applicantid+"]");
				click(SAI_EnrollAppID);
				sendKeys(attributeName_xpath, SAI_EnrollAppID, applicantid);
			}
			if (!searchindiquerygroupaction.equals("")) {
				Reporter.log("Step 11 - Search by using ["+searchindiquerygroupaction+"]");
				sendKeyStroke(attributeName_xpath, "//td[font[contains(text(),'"+searchindiquerygroupaction+"')]]/preceding-sibling::td/input[@type='radio']", Keys.SPACE);
//				clickWebdriver(attributeName_xpath, "//td[font[contains(text(),'"+searchindiquerygroupaction+"')]]/preceding-sibling::td/input[@type='radio']");
				clickWebdriver(attributeName_xpath, "//td[font[contains(text(),'"+searchindiquerygroupaction+"')]]/following-sibling::td/input[contains(@src,'admin_submit_small')]");
				waitForPageToLoad();
			}

			if (!systemqueries.equals("")) {
				Reporter.log("Step 12 - Select the system quries as ["+systemqueries+"]");
				//selectByValueWebdriver(attributeName_xpath, SAI_SysQuries, systemqueries);
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, SAI_SysQuries, systemqueries);
			}	
			if (!userqueries.equals("")) {
				Reporter.log("Step 13 - Select the user quries as ["+userqueries+"]");
				//clickWebdriver(attributeName_xpath, SAI_UserQuries);
				waitForElementPresentWebdriver(attributeName_xpath, SAI_UserQuries, userqueries);
				sendKeys(attributeName_xpath, SAI_UserQuries, userqueries);
				
				//selectByValueWebdriver(attributeName_xpath, SAI_UserQuries, userqueries);
				//selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, SAI_UserQuries, userqueries);
			}
			
			if (!selectagroup.equals("")) {
				Reporter.log("Step 14 - Select a group as ["+selectagroup+"]");
				selectByValueWebdriver(attributeName_xpath, SAI_SearchGroupSelect, selectagroup);
			}			
			if (!searchbyaction.equals("")) {
				Reporter.log("Step 15 - Click the search by action submit button");
				selectByValueWebdriver(attributeName_xpath, SAI_Action, searchbyaction);
			}
			if (!submit.equals("")) {
				Reporter.log("Step 16 - Click the submit button");
				clickWebdriver(attributeName_xpath, SAI_SubmitBtnBottom);
				waitForPageToLoadWebdriver();
			}


		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

