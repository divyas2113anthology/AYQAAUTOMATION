package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_QuickAdd_ngu_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in NGU 'Quick Add' page")
	public void WC_QuickAdd_ngu_Input() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Test Data in 'Quick Add' input for NGU School");
		String[]  fpdatarepo = datacontainer;
		String prefix = fpdatarepo[0];
		String middlename = fpdatarepo[1];
		String firstname = fpdatarepo[2];
		String lastname = fpdatarepo[3];
		String suffix = fpdatarepo[4];
		String gender = fpdatarepo[5];
		String studentid = fpdatarepo[6];
		String describe = fpdatarepo[7];
		String dob = fpdatarepo[8];
		String cityofbirth = fpdatarepo[9];
		String countryofbirth = fpdatarepo[10];
		String willyoubeapply = fpdatarepo[11];
		String address1 = fpdatarepo[12];
		String city = fpdatarepo[13];
		String state = fpdatarepo[14];
		String postalcode = fpdatarepo[15];
		String email = fpdatarepo[16];
		String reviewapplnfee = fpdatarepo[17];
		String paymentmethod = fpdatarepo[18];
		String submitreset = fpdatarepo[19];
		
		Reporter.log("Input Test Data was retrieved for 'NGU Quick Add' Page");
		recentPopupSelectWebdriver("Quick Add");
		if (!prefix.equals("")) {
			Reporter.log("Step 1 - Select Prefix as ["+prefix+"]");
			selectByValueWebdriver(attributeName_xpath, NGU_Prefix, prefix);
		}
		if (!middlename.equals("")) {
			Reporter.log("Step 2 - Type MiddleName as ["+middlename+"]");
			sendKeys(attributeName_xpath, NGU__MiddleName, middlename);
		}
		if (!firstname.equals("")) {
			Reporter.log("Step 3 - Type FirstName as ["+firstname+"]");
			sendKeys(attributeName_xpath, NGU_FirstName, firstname);
		}
		if (!lastname.equals("")) {
			Reporter.log("Step 4 - Type LastName as ["+lastname+"]");
			sendKeys(attributeName_xpath, NGU_LastName, lastname);
		}
		if (!suffix.equals("")) {
			Reporter.log("Step 5 - Type Suffix as ["+suffix+"]");
			//sendKeys(attributeName_xpath, , suffix);
		}
		if (!gender.equals("")) {
			Reporter.log("Step 6 - Check Gender as ["+gender+"]");
			clickWebdriver(attributeName_xpath, NGU_Gender);
		}
		if (!studentid.equals("")) {
			Reporter.log("Step 7 - Type Student ID as ["+studentid+"]");
			//clickWebdriver(attributeName_xpath, NGU_Gender);
		}
		if (!describe.equals("")) {
			Reporter.log("Step 8 - Check Describe yourself as ["+describe+"]");
			clickWebdriver(attributeName_xpath, NGU_DescYourself);
		}
		if (!dob.equals("")) {
			Reporter.log("Step 9 - Type Date of Birth as ["+dob+"]");
			sendKeys(attributeName_xpath, NGU_DOB, dob);
		}
		if (!cityofbirth.equals("")) {
			Reporter.log("Step 10 - Type City as ["+cityofbirth+"]");
			sendKeys(attributeName_xpath, NGU_CityOfBirth, cityofbirth);
		}
		if (!countryofbirth.equals("")) {
			Reporter.log("Step 11 - Select Country as ["+countryofbirth+"]");
			//sendKeys(attributeName_xpath, NGU_CountryofBirth, countryofbirth);
			selectByValueWebdriver(attributeName_xpath, NGU_CountryofBirth, countryofbirth);
		}
		if (!willyoubeapply.equals("")) {
			Reporter.log("Step 12 - Select the option in Will you apply as ["+willyoubeapply+"]");
			//sendKeys(attributeName_xpath, NGU_FinancialAid, cityofbirth);
		}
		if (!address1.equals("")) {
			Reporter.log("Step 13 - Type Address as ["+address1+"]");
			sendKeys(attributeName_xpath, NGU_StreetAddress1, address1);
		}
		if (!city.equals("")) {
			Reporter.log("Step 14 - Type City as ["+city+"]");
			sendKeys(attributeName_xpath, NGU_City, city);
			//selectByValueWebdriver(attributeName_xpath, NGU_City, city);
		}
		if (!state.equals("")) {
			Reporter.log("Step 15 - Type State as ["+state+"]");
			//sendKeys(attributeName_xpath, NGU_State, state);
			selectByValueWebdriver(attributeName_xpath, NGU_State, state);
		}
		if (!postalcode.equals("")) {
			Reporter.log("Step 16 - Type Postal Code as ["+postalcode+"]");
			sendKeys(attributeName_xpath, NGU_PostalCode, postalcode);
		}
		if (!email.equals("")) {
			Reporter.log("Step 17 - Type Email as ["+email+"]");
			sendKeys(attributeName_xpath, NGU_Email, email);
		}
		if (!reviewapplnfee.equals("")) {
			Reporter.log("Step 18 - Select Review Application Fee as ["+reviewapplnfee+"]");
			//sendKeys(attributeName_xpath, NGU_Email, email);
			clickWebdriver(attributeName_xpath, NGU_ReviewAppFee);
		}
		if (!paymentmethod.equals("")) {
			Reporter.log("Step 19 - Select Review Application Fee as ["+paymentmethod+"]");
			//sendKeys(attributeName_xpath, NGU_Email, email);
			clickWebdriver(attributeName_xpath, NGU_PaymentMethod);
		}
		if (!submitreset.equals("")) {
			Reporter.log("Step 20 - Click on ["+submitreset+"]");
			//sendKeys(attributeName_xpath, NGU_Email, email);
			if(submitreset.equalsIgnoreCase("Submit"))
				clickWebdriver(attributeName_xpath, NGU_Submit);
			else if(submitreset.equalsIgnoreCase("Reset"))
				clickWebdriver(attributeName_xpath, NGU_Reset);
				
		}
		waitForPageToLoadWebdriver();
		//recentPopupCloseWebdriver();
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
}

}
