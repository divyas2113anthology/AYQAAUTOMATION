package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_AddEditEventRegistration_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Add/Edit Event Registration' page")
	public void WC_AddEditEventRegistration_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Add/Edit Event Registration' page");
			String[]  dataprov = datacontainer;
			String firstname = dataprov[0];
			String lastname = dataprov[1];
			String birthdate = dataprov[2];
			String email = dataprov[3];
			String scode = dataprov[4];
			String updateregister = dataprov[5];
			Reporter.log("Input Test Data was retrieved for 'Add/Edit Event Registration' page");
			waitForPageToLoadWebdriver();
			waitForElementPresentWebdriver(attributeName_xpath, AER_RegisterOrNotAttened, "Register Button or Not Attened Button");
			if (!firstname.equals("")) {
				Reporter.log("Step 1 -Enter the First Name as ("+firstname+")");
				String FirstName = getElementIDbyLabelContainsusingXpathWebdirver("First Name", AER_FirstName);
				sendKeys(attributeName_xpath, FirstName, firstname);
			}
			if (!lastname.equals("")) {
				Reporter.log("Step 2 -Enter the Last Name as ("+lastname+")");
				String LastName = getElementIDbyLabelContainsusingXpathWebdirver("Last Name", AER_LastName);
				sendKeys(attributeName_xpath,LastName , lastname);
			}
			if (!birthdate.equals("")) {
				Reporter.log("Step 3 -Enter the Birth Date as ("+birthdate+")");
				String BirthDate = getElementIDbyLabelContainsusingXpathWebdirver("Birth Date", AER_Birthdate);
				sendKeys(attributeName_xpath,BirthDate , birthdate);
			}
			if (!email.equals("")) {
				Reporter.log("Step 4 -Enter the Email as ("+email+")");
				String Email = getElementIDbyLabelContainsusingXpathWebdirver("Email Address", AER_Email);
				sendKeys(attributeName_xpath,Email , email);
			}
			if (!scode.equals("")) {
				Reporter.log("Step 5 -Enter the Scode as ("+scode+")");
				String Scode = getElementIDbyLabelContainsusingXpathWebdirver("Scode", AER_Scode);
				sendKeys(attributeName_xpath,Scode , scode);
			}
			if (!updateregister.equals("")) {
				Reporter.log("Step 6 - Proceed to Click on ("+updateregister+") Button");
				if (updateregister.equalsIgnoreCase("i will not be able to attend")) {
					clickWebdriver(attributeName_xpath, AER_NotAttened);
					waitForPageToLoadWebdriver();
				}else if (updateregister.equalsIgnoreCase("Register")) {
					clickWebdriver(attributeName_xpath, AER_Register);
					waitForPageToLoadWebdriver();
				}else if (updateregister.equalsIgnoreCase("update_my_information")) {
					clickWebdriver(attributeName_xpath, AER_UpdateMyInformation+updateregister+"')]");
					waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}


