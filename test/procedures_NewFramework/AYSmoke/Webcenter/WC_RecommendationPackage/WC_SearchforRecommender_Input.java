package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;


import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_SearchforRecommender_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Search For Recommendation' page")
	public void WC_SearchforRecommender_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Search For Recommendation' Page");
			String[] testdata = datacontainer;
			String online = testdata[0];
			String offline = testdata[1];
			String both = testdata[2];
			String rec_submitted = testdata[3];
			String rec_notsubmitted = testdata[4];
			String rec_app_submitted = testdata[5];
			String rec_notprinted = testdata[6];
			String rec_notexported = testdata[7];
			String create_date = testdata[8];
			String submission_date = testdata[9];
			String rec_firstname = testdata[10];
			String rec_lastname = testdata[11];
			String rec_email = testdata[12];
			String rec_pac = testdata[13];
			String app_firstname = testdata[14];
			String app_lastname = testdata[15];
			String app_email = testdata[16];
			String app_pin = testdata[17];
			String app_appid = testdata[18];
			String submitdate_from = testdata[19];
			String submitdate_to = testdata[20];
			String printeddate_from = testdata[21];
			String printeddate_to = testdata[22];
			String exporteddate_from = testdata[23];
			String exporteddate_to = testdata[24];
			String clear = testdata[25];
			String submit = testdata[26];
			String daterange_from = testdata[27];
			String daterange_to = testdata[28];
			String systemqueries = testdata[29];
			String verifysystemquerylabel = testdata[30];
			
			Reporter.log("Input Test Data was retrieved for 'Search For Recommendation' Page");
			
			if (!app_firstname.equals("")) {
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, SFR_RecFirstName, app_firstname);
			}
			if (!systemqueries.equals("")) {
				Reporter.log("Select a system query as ["+systemqueries+"]");
				clickWebdriver(attributeName_xpath, "//input[@value='query']");
				waitForElementPresentWebdriver(attributeName_xpath, SAI_SysQuries, systemqueries);
				selectByVisibleTextWebdriver(attributeName_xpath, SAI_SysQuries, systemqueries);
				}
					/*if (!submit.equals("")) {
					Reporter.log("Click on the submit button");
					clickWebdriver(attributeName_xpath, SAI_SubmitBtnBottom);
					waitForPageToLoadWebdriver();
			}
			*/
			if (!verifysystemquerylabel.equals("")) {
				Reporter.log("Verify the label ["+verifysystemquerylabel+"] is present");
				waitForElementPresentWebdriver(attributeName_xpath, VerifySystemQueryLabel, verifysystemquerylabel);
				verifyElementContainsTextWebdriver(attributeName_xpath,VerifySystemQueryLabel,verifysystemquerylabel,verifysystemquerylabel);
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

