package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_AddRecommendation_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Add Recommendation' page")
	public void WC_AddRecommendation_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add Recommendation'Page");
			String[] testdata = datacontainer;
			String firstname = testdata[0];
			String lastname = testdata[1];
			String address1 = testdata[2];
			String address2 = testdata[3];
			String city = testdata[4];
			String state = testdata[5];
			String postalcode = testdata[6];
			String country = testdata[7];
			String phone = testdata[8];
			String emailaddress = testdata[9];
			String title = testdata[10];
			String employer = testdata[11];
			String relationship = testdata[12];
			String recommendationtype = testdata[13];
			String status = testdata[14];
			String receiveddate = testdata[15];
			String saveclose = testdata[16];
			
			recentPopupSelect_without_window_nameWebdriver();
			
			if(!firstname.equals("")){
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, AR_FirstName, firstname);
				
			}
			if(!lastname.equals("")){
				Reporter.log("Enter the Last Name");
				sendKeys(attributeName_xpath, AR_LastName, lastname);
			}
				
			if(!address1.equals("")){
				Reporter.log("Enter the Address1");
				sendKeys(attributeName_xpath, AR_Address1, address1);
				
			}	
			if(!address2.equals("")){
				Reporter.log("Enter the Address2");
				sendKeys(attributeName_xpath, AR_Address2, address2);
				
			}
			if(!city.equals("")){
				Reporter.log("Enter the City");
				sendKeys(attributeName_xpath, AR_City, city);
				
			}
			if (!state.equals("")) {
				Reporter.log("Select ("+state+")");
				selectByVisibleTextWebdriver(attributeName_xpath, AR_State, state);
			}
			if(!postalcode.equals("")){
				Reporter.log("Enter the Postal Code");
				sendKeys(attributeName_xpath, AR_PostalCode, postalcode);
				
			}
			if (!country.equals("")) {
				Reporter.log("Select ("+country+")");
				selectByVisibleTextWebdriver(attributeName_xpath, AR_Country, country);
			}
			if(!phone.equals("")){
				Reporter.log("Enter the Phone");
				sendKeys(attributeName_xpath, AR_Phone, phone);
				
			}
			if(!emailaddress.equals("")){
				Reporter.log("Enter the Email Address");
				sendKeys(attributeName_xpath, AR_EmailAddress, emailaddress);
				
			}
			if(!title.equals("")){
				Reporter.log("Enter the Title");
				sendKeys(attributeName_xpath, AR_Title, title);
				
			}
			if(!employer.equals("")){
				Reporter.log("Enter the Employer");
				sendKeys(attributeName_xpath, AR_Employer, employer);
				
			}
			if(!relationship.equals("")){
				Reporter.log("Enter the RelationShip");
				sendKeys(attributeName_xpath, AR_RelationShip, relationship);
			}
			if (!recommendationtype.equals("")) {
				Reporter.log("Select ("+recommendationtype+")");
				selectByVisibleTextWebdriver(attributeName_xpath, AR_RecommendationType, recommendationtype);
			}
			if (!saveclose.equals("")) {
				Reporter.log("Click on Save");
				waitForElementPresentWebdriver(attributeName_xpath, AR_Save , saveclose);   
				clickWebdriver(attributeName_xpath, AR_Save);
				//recentPopupCloseWebdriver();
				clickWebdriver(attributeName_xpath,"//img[@src='../Images/common_images/admin_close_window_large.gif']");
				Thread.sleep(5000);
								
			}
			//switchToDefaultContentWebdriver();
			switchToOldWindow();

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}