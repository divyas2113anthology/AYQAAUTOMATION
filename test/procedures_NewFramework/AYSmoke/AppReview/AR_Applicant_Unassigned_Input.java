package procedures_NewFramework.AYSmoke.AppReview;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class AR_Applicant_Unassigned_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Applicant Search' page")
	public void AR_Applicant_Unassigned_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Search' Page");
			String[] testdata = datacontainer;
			String tab_to_select = testdata[0];
			String reviewpool_select = testdata[1];
			String applicant_search_present = testdata[2];
			String applicant_search_notpresent = testdata[3];
									
			
			if (!tab_to_select.equals("")) {
				Reporter.log("Step 1 - Clicking on ["+tab_to_select+"]");
				clickWebdriver(attributeName_xpath, AR_MainSubmenu+tab_to_select+"')]");
			}
			if(!reviewpool_select.equals("")){
				Reporter.log("Step 2 - Select Review Pool option as ["+reviewpool_select+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, AR_ReviewPool, reviewpool_select);
			}
			if(!applicant_search_present.equals("")){
				Reporter.log("Step 3 - Search for ["+applicant_search_present+"]");
				sendKeys(attributeName_xpath, AR_AppSearchBox, applicant_search_present);
				waitForElementPresentWebdriver(attributeName_xpath, AR_AppSearchButton, "Search");
				clickWebdriver(attributeName_xpath, AR_AppSearchButton);
				waitForPageToLoad();
				verifyElementContainsTextWebdriver(attributeName_xpath, AR_SearchAppLName+applicant_search_present+"')]", applicant_search_present, applicant_search_present);
			}
			if(!applicant_search_notpresent.equals("")){
				Reporter.log("Step 3 - Search for ["+applicant_search_notpresent+"]");
				sendKeys(attributeName_xpath, AR_AppSearchBox, applicant_search_notpresent);
				waitForElementPresentWebdriver(attributeName_xpath, AR_AppSearchButton, "Search");
				clickWebdriver(attributeName_xpath, AR_AppSearchButton);
				waitForPageToLoad();
				waitForPageToLoad();
				
				verifyElementNotContainsTextWebdriver(attributeName_xpath, AR_SearchAppLName+applicant_search_notpresent+"')]", applicant_search_notpresent, applicant_search_notpresent); 
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
