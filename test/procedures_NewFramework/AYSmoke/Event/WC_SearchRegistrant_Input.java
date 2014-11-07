package procedures_NewFramework.AYSmoke.Event;

import or.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_SearchRegistrant_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Event Registration' page")
		public void WC_SearchRegistrant_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Data 'Search for Registrants' page");
			String[]  fpvdatarepo = datacontainer;
			String Firstname = fpvdatarepo[0];
			String Lastname = fpvdatarepo[1];
			String Email = fpvdatarepo[2];
			String Register = fpvdatarepo[3];
			String Status = fpvdatarepo[4];
			String ApplicantID = fpvdatarepo[5];
			String ProspectID = fpvdatarepo[6];
			String Regspecificdate = fpvdatarepo[7];
			String Regdaterangefrom = fpvdatarepo[8];
			String Regdaterangeto = fpvdatarepo[9];
			String Clear = fpvdatarepo[10];
			String Submit = fpvdatarepo[11];
			String Findallrecordsnotmatchedtoapplicants = fpvdatarepo[12];  //Find all records not matched to applicants
			String Findallrecordsmatchedtoapplicants = fpvdatarepo[13];
			String Findallrecordsnotmatchedtoprospects = fpvdatarepo[14];
			String Findallrecordsmatchedtoprospects = fpvdatarepo[15];
			
			if (!Firstname.equals("")) {
				Reporter.log("First name"+Firstname);
				waitForElementPresentWebdriver(attributeName_xpath, AL_FirstName, Firstname);
				sendKeys(attributeName_xpath, AL_FirstName, Firstname);
			}
			if (!Lastname.equals("")) {
				Reporter.log("Last name"+Lastname);
				waitForElementPresentWebdriver(attributeName_xpath, AL_LastName, Lastname);
				sendKeys(attributeName_xpath, AL_LastName, Lastname);
			}
			if (!Email.equals("")) {
				Reporter.log("Email address as"+Email);
				waitForElementPresentWebdriver(attributeName_xpath, SAI_EmailAddress, Email);
				sendKeys(attributeName_xpath, SAI_EmailAddress, Email);
			}
			if(!Status.equals("")){
				Reporter.log("Status as"+Status);
				if(Status.equals("Invited"))
					clickWebdriver(attributeName_xpath, ESA_StatusInvited);
				else if(Status.equals("Registered"))
					clickWebdriver(attributeName_xpath, ESA_StatusRegistered);
				else if(Status.equals("Declined"))
					clickWebdriver(attributeName_xpath, ESA_StatusDeclined);
				else if(Status.equals("Waitlisted"))
					clickWebdriver(attributeName_xpath, ESA_StatusWaitlisted);
				else if(Status.equals("Attended"))
					clickWebdriver(attributeName_xpath, ESA_StatusAttended);
				else if(Status.equals("Did not attend"))
					clickWebdriver(attributeName_xpath, ESA_StatusDidnotattend);
			}
			if (!ApplicantID.equals("")) {
				Reporter.log("Registration Number"+ApplicantID);
				waitForElementPresentWebdriver(attributeName_xpath, ESA_ApplicantID, ApplicantID);
				sendKeys(attributeName_xpath, ESA_ApplicantID, ApplicantID);	
			}
		
			if (!Findallrecordsnotmatchedtoapplicants.equals("")) {
				Reporter.log("Matched Record as ["+Findallrecordsnotmatchedtoapplicants+"]");
				waitForElementPresentWebdriver(attributeName_xpath, ESA_Findallrecordsnotmatchedtoapplicants, Findallrecordsnotmatchedtoapplicants);
				clickWebdriver(attributeName_xpath, ESA_Findallrecordsnotmatchedtoapplicants);
			}
			if (!Findallrecordsmatchedtoapplicants.equals("")) {
				Reporter.log("Matched Record as ["+Findallrecordsmatchedtoapplicants+"]");
				waitForElementPresentWebdriver(attributeName_xpath, ESA_Findallrecordsmatchedtoapplicants, Findallrecordsmatchedtoapplicants);
				clickWebdriver(attributeName_xpath, ESA_Findallrecordsmatchedtoapplicants);
			}
			if (!ProspectID.equals("")) {
				Reporter.log("Registration Number"+ProspectID);
//				waitForElementPresentWebdriver(attributeName_xpath, ESA_ProspectID, ProspectID);
//				sendKeys(attributeName_xpath, ESA_ProspectID, ProspectID);	
				//Upto Prospect ID
				
				waitForElementPresentWebdriver(attributeName_xpath, ESA_Findallrecordsnotmatchedtoprospects, Findallrecordsnotmatchedtoprospects);
				clickWebdriver(attributeName_xpath, ESA_Findallrecordsnotmatchedtoprospects);
			}
			//Findallrecordsnotmatchedtoapplicants
			if (!Findallrecordsnotmatchedtoprospects.equals("")) {
				Reporter.log("Matched Record as ["+Findallrecordsnotmatchedtoprospects+"]");
				waitForElementPresentWebdriver(attributeName_xpath, ESA_Findallrecordsnotmatchedtoprospects, Findallrecordsnotmatchedtoprospects);
				clickWebdriver(attributeName_xpath, ESA_Findallrecordsnotmatchedtoprospects);
			}
			if (!Findallrecordsmatchedtoapplicants.equals("")) {
				Reporter.log("Matched Record as ["+Findallrecordsmatchedtoapplicants+"]");
				waitForElementPresentWebdriver(attributeName_xpath, ESA_Findallrecordsmatchedtoapplicants, Findallrecordsmatchedtoapplicants);
				clickWebdriver(attributeName_xpath, ESA_Findallrecordsmatchedtoapplicants);
			}
			if (!Regspecificdate.equals("")) {
				Reporter.log("Specific Date as"+Regspecificdate);		
				waitForElementPresentWebdriver(attributeName_xpath, ESA_SpecificDate, Regspecificdate);
				sendKeys(attributeName_xpath, ESA_SpecificDate, Regspecificdate);
			}
			if (!Regdaterangefrom.equals("")) {
				Reporter.log("Date Range From"+Regdaterangefrom);
				waitForElementPresentWebdriver(attributeName_xpath, ESA_DateRangeFrom, Regdaterangefrom);
				sendKeys(attributeName_xpath, ESA_DateRangeFrom, Regdaterangefrom);
			}
			if (!Regdaterangeto.equals("")) {
				Reporter.log("Date Range To"+Regdaterangeto);
				waitForElementPresentWebdriver(attributeName_xpath, ESA_DateRangeTo, Regdaterangeto);
				sendKeys(attributeName_xpath, ESA_DateRangeTo, Regdaterangeto);
			}
			if (!Clear.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath, SFE_Clear, Clear);
				//sendKeys(attributeName_xpath, SFE_Clear, clear);
				clickWebdriver(attributeName_xpath, SFE_Clear);
			}
			
			if (!Submit.equals("")) {
				Reporter.log("Click the submit button");
				clickWebdriver(attributeName_xpath, SAI_SubmitBtnBottom);
				
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

