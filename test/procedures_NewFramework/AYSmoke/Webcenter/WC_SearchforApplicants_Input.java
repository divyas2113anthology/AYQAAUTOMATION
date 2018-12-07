package procedures_NewFramework.AYSmoke.Webcenter;

import or.OR;
import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

//import com.thoughtworks.selenium.webdriven.commands.waitForPageToLoadWebdriver;

public class WC_SearchforApplicants_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Search For Applicants' page")
	public void WC_SearchforApplicants_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Search For Applicants' Page");
			String[] testdata = datacontainer;
			String numberofrecordsdisplay = testdata[0];
			String record_options = testdata[1];
			String viewrecords_withdetails = testdata[2];
			String search_by_date = testdata[3];
			String createddate = testdata[4];
			String submittedate = testdata[5];
			String searchbydate_submit = testdata[6];
			String firstname = testdata[7];
			String lastname = testdata[8];
			String birthdate = testdata[9];
			String emailaddress = testdata[10];
			String zip = testdata[11];
			String pin = testdata[12];
			String applicantid = testdata[13];
			String searchbyindividual =  testdata[14];
			String systemqueries = testdata[15];
			String userqueries = testdata[16];
			String search_using_query = testdata[17];
			String selectagroup = testdata[18];
			String search_by_group = testdata[19];
			String select_action = testdata[20];
			String searchbyaction = testdata[21];
			String submit = testdata[22];
			String pros_id = testdata[23];
			String daterange_from = testdata[24];
			String daterange_to = testdata[25];
			String connectid = testdata[26];
			
			//ApplicationPage = driver.getWindowHandle();
			ApplicationPage = driver.getWindowHandle();
			
					
			Reporter.log("Input Test Data was retrieved for 'Search For Applicants' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			//waitForElementPresentWebdriver(attributeName_xpath, SAI_NoOFRecords, "Number of Records Display");
			
					
			if (!numberofrecordsdisplay.equals("")) {
				Reporter.log("Step 1 - Enter Number Of recodrs display as ["+numberofrecordsdisplay+"]");
				selectByValueWebdriver(attributeName_xpath, SAI_NoOFRecords, numberofrecordsdisplay);
			}			
			if (!record_options.equals("")) {
				Reporter.log("Step 2 - Select the record options as ["+record_options+"]");
				if (record_options.equalsIgnoreCase("Submitted")) {
					clickWebdriver(attributeName_xpath, SAI_SubmitRadioBtn);
				}
				if (record_options.equalsIgnoreCase("Not Submitted")) {
					clickWebdriver(attributeName_xpath, SAI_NotSubmitRadioBtn);
				}
				if (record_options.equalsIgnoreCase("Both")) {
					clickWebdriver(attributeName_xpath, SAI_BothtRadioBtn);
				}
			}
			if (!viewrecords_withdetails.equals("")) {
				Reporter.log("Step 3 - Select view records with details as ["+viewrecords_withdetails+"]");
				if (viewrecords_withdetails.equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, SAI_ViewRecords);
				}else if (viewrecords_withdetails.equalsIgnoreCase("Uncheck")) {
					uncheckWebdriverCheckbox(attributeName_xpath, SAI_ViewRecords);
				}
			}
			if (!search_by_date.equals("")) {
				Reporter.log("Step 4 - Search by date as ["+search_by_date+"]");
				if (search_by_date.equalsIgnoreCase("Creation Date")) {
					clickWebdriver(attributeName_xpath, SAI_CreationDateRadio);				
				}else if (search_by_date.equalsIgnoreCase("Submission Date")) {
//					clickWebdriver(attributeName_xpath, SAI_SubmissionDateRadio);
					sendKeyStroke(attributeName_xpath, SAI_SubmissionDateRadio, Keys.SPACE);
				}else if (search_by_date.equalsIgnoreCase("All")) {
						selectByVisibleTextWithSpaceWebdriver(attributeName_name, "Days", search_by_date);			
					}
				
			}			
			if (!createddate.equals("")) {
				Reporter.log("Step 5 - Select the creation date as ["+createddate+"]");
				waitForElementPresentWebdriverWait(attributeName_xpath, SAI_CreationDateRadio, createddate);
				clickWebdriver(attributeName_xpath, SAI_CreationDateRadio);
			}
			if (!submittedate.equals("")) {
				Reporter.log("Step 6 - Select the submission date as ["+submittedate+"]");
				//selectByVisibleTextWebdriver(attributeName_xpath, SAI_SubmissionDate, submittedate);
				selectByVisibleTextWebdriver(attributeName_xpath, SAI_SpecificPeriod, submittedate);
			}
			if(!daterange_from.equals("")) {
				Reporter.log("Step 7 - Enter the date range from as ["+daterange_from+"]");
				waitForElementPresentWebdriver(attributeName_xpath, SAI_DateRangeFrom, daterange_from);
				sendKeys(attributeName_xpath, SAI_DateRangeFrom, daterange_from);
			}
			if(!daterange_to.equals("")) {
				Reporter.log("Step 8 - Enter the date range to as ["+daterange_to+"]");
				waitForElementPresentWebdriver(attributeName_xpath, SAI_DateRangeTo, daterange_to);
				clickWebdriver(attributeName_xpath, SAI_DateRangeTo);
				sendKeys(attributeName_xpath, SAI_DateRangeTo, daterange_to);
			}
			
			if (!searchbydate_submit.equals("")) {
				Reporter.log("Step 9 - Click Submit in search by date");
				clickWebdriver(attributeName_xpath, SAI_SearchByDateSubmit);
				waitForPageToLoadWebdriver();
			}
			if (!searchbyindividual.equals("")) {
				Reporter.log("Step 10 - Click Submit in search by Individual");
				
				waitForPageToLoadWebdriver();
				waitForElementPresentWebdriver(attributeName_xpath, SAI_SearchByIndividualsRadio, searchbyindividual);
//				actionsClickWebdriver(attributeName_xpath, SAI_SearchByIndividualsRadio);
//				clickWebdriver(attributeName_xpath, SAI_SearchByIndividualsRadio);
//				waitForElementPresentWebdriver(attributeName_xpath, SAI_SearchByIndividualsSubmit, searchbyindividual);
				sendKeyStroke(attributeName_xpath, SAI_SearchByIndividualsRadio, Keys.SPACE);
			    //clickWebdriver(attributeName_xpath, SAI_SearchByIndividualsSubmit);
				clickWebdriver(attributeName_xpath, SAI_SearchByIndividualsRadio);
				waitForPageToLoadWebdriver();
				
			}
			if (!firstname.equals("")) {
				Reporter.log("Step 11 - Enter the First Name as ["+firstname+"]");
				if (firstname.equals("Applicant First Name") || firstname.equals("ManualAdd")) {
					String DataFirstName = Runtimedataread(firstname);
					clickWebdriver(attributeName_xpath,SAI_FirstName);
					sendKeys(attributeName_xpath, SAI_FirstName, DataFirstName);
					
				}else if (firstname.equals("FaceliftAppFirstName") || firstname.equals("SMOKETEST") || firstname.equals("TESTAPPREVIEW") || firstname.equals("BridgeAppFirstName")){
					String DataFirstName = Runtimedataread(firstname);
					clickWebdriver(attributeName_xpath,SAI_FirstName);
					sendKeys(attributeName_xpath, SAI_FirstName, DataFirstName);
				}else if (firstname.equals("AppReview FirstName")) {
					System.out.println("aaaa"+firstname);
					String DataFirstName = Runtimedataread(firstname);
					clickWebdriver(attributeName_xpath,SAI_FirstName);
					sendKeys(attributeName_xpath, SAI_FirstName, DataFirstName);
				}else if (firstname.equals("OLIVE")) {
					String DataFirstName = Runtimedataread(firstname);
					sendKeys(attributeName_xpath, SAI_FirstName, DataFirstName);
				}
				else{
					clickWebdriver(attributeName_xpath,SAI_FirstName);
					waitForElementPresentWebdriver(attributeName_xpath, SAI_FirstName, firstname);
					sendKeys(attributeName_xpath, SAI_FirstName, firstname);
				}
			}
			if (!lastname.equals("")) {
				Reporter.log("Step 12 - Enter the Last Name as ["+lastname+"]");
				waitForPageToLoadWebdriver();
				waitForElementPresentWebdriver(attributeName_xpath, SAI_LastName, lastname);
				clickWebdriver(attributeName_xpath, SAI_LastName);
				sendKeys(attributeName_xpath, SAI_LastName, lastname);
			}
			if (!birthdate.equals("")) {
				Reporter.log("Step 13 - Enter the birth date as ["+birthdate+"]");
				sendKeys(attributeName_xpath, SAI_BirthDate, birthdate);
			}	
			if (!emailaddress.equals("")) {
				Reporter.log("Step 14 - Enter the email address as ["+emailaddress+"]");
				clickWebdriver(attributeName_xpath, SAI_EmailAddress);
				sendKeys(attributeName_xpath, SAI_EmailAddress, emailaddress);
			}
			if (!zip.equals("")) {
				Reporter.log("Step 15 - Enter the Zip as ["+zip+"]");
				sendKeys(attributeName_xpath, SAI_Zip, zip);
			}
			if (!pin.equals("")) {
				Reporter.log("Step 16 - Enter the PIN as ["+pin+"]");
				if(pin.contains("Pin")){
					clickWebdriver(attributeName_xpath, SAI_Pin);
					String pinnumber = Runtimedataread(pin);
					sendKeys(attributeName_xpath, SAI_Pin, pinnumber);
				}else {
					clickWebdriver(attributeName_xpath, SAI_Pin);
					sendKeys(attributeName_xpath, SAI_Pin, pin);
				}
			}
			if (!applicantid.equals("")) {
				Reporter.log("Step 17 - Enter the Applicant ID as ["+applicantid+"]");
				sendKeys(attributeName_xpath, SAI_ApplicantID, applicantid);
			}
			
			if (!systemqueries.equals("")) {
				Reporter.log("Step 18 - Select the system quries as ["+systemqueries+"]");
				waitForElementPresentWebdriverWait(attributeName_name, "SysQuery", systemqueries);
				selectByVisibleTextWithSpaceWebdriver(attributeName_name, "SysQuery", systemqueries);
				waitForPageToLoadWebdriver();
			}	
			if (!userqueries.equals("")) {
				Reporter.log("Step 19 - Select the user quries as ["+userqueries+"]");
//				waitForElementPresentWebdriver(attributeName_xpath, SAI_UserQuries+userqueries+"')]", userqueries);
//				selectByValueWebdriver(attributeName_xpath, SAI_UserQuries+userqueries+"')]", userqueries);
				//clickWebdriver(attributeName_xpath, SAI_UserQuries);
				if(isElementPresentWebdriver(attributeName_xpath, SAI_UserQuries)) {
					//selectByVisibleTextWebdriver(attributeName_xpath, SAI_UserQuries, "   "+userqueries);
					clickWebdriver(attributeName_xpath, SAI_UserQuries);
					waitForPageToLoadWebdriver();
					clickWebdriver(attributeName_xpath, MQ_Queryselect+userqueries+"')]");
				} /*else {
					selectByVisibleTextWebdriver(attributeName_xpath, SAI_UserQuries, userqueries);
				}*/
			}
			
			if (!search_using_query.equals("")) {
				Reporter.log("Step 20 - Click the Search using query Submit Button ");
				waitForElementPresentWebdriver(attributeName_xpath, SAI_SearchUsingQuerySubmit, search_using_query);
				sendKeyStroke(attributeName_xpath, SAI_SearchUsingQueryRadio, Keys.SPACE);
				clickWebdriver(attributeName_xpath, SAI_SearchUsingQuerySubmit);
				waitForPageToLoadWebdriver();
				
			}
			if (!selectagroup.equals("")) {
				Reporter.log("Step 21 - Select a group as ["+selectagroup+"]");
				waitForElementPresentWebdriverWait(attributeName_xpath, ASR_Group, selectagroup);
				doubleClickWebdriver(attributeName_xpath, ASR_Group);
			}			
			if (!search_by_group.equals("")) {
				Reporter.log("Step 21 - Click the Search by using Submit Button");
				waitForElementPresentWebdriverWait(attributeName_name, SAI_SearchGroupSelect, search_by_group);
				selectByVisibleTextWithSpaceWebdriver(attributeName_name, SAI_SearchGroupSelect, search_by_group);
			}
			if (!select_action.equals("")) {
				Reporter.log("Step 22 - Select a action as ["+select_action+"]");
				clickWebdriver(attributeName_name, SAI_SearchbyActionSelect);
				selectByVisibleTextWithSpaceWebdriver(attributeName_name, SAI_SearchbyActionSelect, select_action);
			}
			if (!searchbyaction.equals("")) {
				Reporter.log("Step 23 - Click the search by action submit button");
			}
			if (!pros_id.equals("")) {
				Reporter.log("Step 24 - Send Prospect ID");
				waitForElementPresentWebdriver(attributeName_xpath, SAI_SearchProspectID, pros_id);
				clickWebdriver(attributeName_xpath, SAI_SearchProspectID);
				sendKeys(attributeName_xpath, SAI_SearchProspectID, pros_id);
			}

            if (!connectid.equals("")) {
				Reporter.log("Step 26 - Enter the Connect ID as ["+connectid+"]");
				sendKeys(attributeName_xpath, SAI_ConnectID, connectid);
			}
			if (!submit.equals("")) {
				Reporter.log("Step 25 - Click the submit button");
				waitForElementPresentWebdriverWait(attributeName_xpath, SAI_SubmitBtnBottom, submit);
				clickWebdriver(attributeName_xpath, SAI_SubmitBtnBottom);
				//waitForPageToLoadWebdriver();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
