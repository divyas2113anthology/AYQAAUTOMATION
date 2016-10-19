package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PersonalInformationForm_Verify extends CommonSeleniumActions	implements OR {
	

	
	@Test(description="This Procedure is to perform some Verification in 'Personal Information' page")
	public void PersonalInformationForm_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalInformationForm_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Personal Information' page");
			String[]  personalinfovdatarepo = datacontainer;
			String pivsuccessmessage = personalinfovdatarepo[0];
			String pivpagename = personalinfovdatarepo[1];
			String pivverifyui = personalinfovdatarepo[2];
			String pivaddressline1 = personalinfovdatarepo[3];
			String pivaddressline2 = personalinfovdatarepo[4];
			String pivaddressline3 = personalinfovdatarepo[5];
			String pivcity = personalinfovdatarepo[6];
			String pivstate = personalinfovdatarepo[7];
			String pivzip = personalinfovdatarepo[8];
			String pivcountry = personalinfovdatarepo[9];
			Reporter.log("Verify Test Data was retrieved for 'Personal Information' page");
			//recentOpenedPopupSelectWebdriver("View full Application");
			//selectMainWindowWebdriver();
			if (!pivsuccessmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+pivsuccessmessage+") was displayed correctly");
				//waitForText(pivsuccessmessage, "Address Line 1");
				waitForPageToLoadWebdriver();
				if (selenium.isTextPresent(pivsuccessmessage)) {
					Reporter.log("Message("+pivsuccessmessage+") was displayed correctly");
				} else {
					writeFailure("Message("+pivsuccessmessage+") was not displayed correctly");
				}
			}
			if (!pivpagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pivpagename+") page");
				if (selenium.isTextPresent(pivpagename)) {
					Reporter.log("Its navigate to ("+pivpagename+") page");
				} else {
					writeFailure("Its not navigate to ("+pivpagename+") page");
				}
			}
			if (!pivverifyui.equals("")) {
				Reporter.log("Step 3 - Verify its navigate to ("+pivpagename+") page");
			}
			if (!pivaddressline1.equals("")) {
				Reporter.log("Step 4 - Verify data("+pivaddressline1+") was displayed correctly in the 'Address Line1' Field");
				String addrwaitID = getElementIDbyLabel("Address Line1", PI_AddressLine1_wait);
				waitForElementPresentWebdriver(attributeName_xpath, addrwaitID, pivaddressline1);
				String addrID1 = getElementIDbyLabel("Address Line1", PI_AddressLine1);			
				String line1 = getValueWebdriver(attributeName_xpath,addrID1);
				if (line1.equals(pivaddressline1)) {
					Reporter.log("Data("+line1+") was displayed correctly in the [Address Line1] Field");				
				} else {
					writeFailure("Data("+line1+") was not displayed correctly in the [Address Line1] Field");
				}
			}
			if (!pivaddressline2.equals("")) {
				Reporter.log("Step 5 - Verify data("+pivaddressline2+") was displayed correctly in the 'Address Line2' Field");
				String addrID2 = getElementIDbyLabel("Address Line2", PI_AddressLine2);
				String line2 = getValueWebdriver(attributeName_xpath,addrID2);
				if (line2.equals(pivaddressline2)) {
					Reporter.log("Data("+line2+") was displayed correctly in the [Address Line2] Field");				
				} else {
					writeFailure("Data("+line2+") was not displayed correctly in the [Address Line2] Field");
				}
			}
			if (!pivaddressline3.equals("")) {
				Reporter.log("Step 6 - Verify data("+pivaddressline3+") was displayed correctly in the 'Address Line3' Field");
				String addrID3 = getElementIDbyLabel("Address Line3", PI_AddressLine3);
				String line3 = getValueWebdriver(attributeName_xpath,addrID3);
				if (line3.equals(pivaddressline3)) {
					Reporter.log("Data("+line3+") was displayed correctly in the [Address Line3] Field");				
				} else {
					writeFailure("Data("+line3+") was not displayed correctly in the [Address Line3] Field");
				}
			}
			if (!pivcity.equals("")) {
				Reporter.log("Step 7 - Verify data("+pivcity+") was displayed correctly in the 'City' Field");
				String cityID = getElementIDbyLabel("City", PI_City);
				String city = getValueWebdriver(attributeName_xpath,cityID);
				if (city.equals(pivcity)) {
					Reporter.log("Data("+city+") was displayed correctly in the [City] Field");				
				} else {
					writeFailure("Data("+city+") was not displayed correctly in the [City] Field");
				}
			}
			if (!pivstate.equals("")) {
				Reporter.log("Step 8 - Verify data("+pivstate+") was displayed correctly in the 'State' Field");
				String stateID = getElementIDbyLabel("State", PI_State);
				String state = getValueWebdriver(attributeName_xpath,stateID);
				if (state.equals(pivstate)) {
					Reporter.log("Data("+state+") was displayed correctly in the [State] Field");				
				} else {
					writeFailure("Data("+state+") was not displayed correctly in the [State] Field");
				}
			}
			if (!pivzip.equals("")) {
				Reporter.log("Step 9 - Verify data("+pivzip+") was displayed correctly in the 'Zip' Field");
				String zipID = getElementIDbyLabel("Zip", PI_Zip);
				String zip = getValueWebdriver(attributeName_xpath,zipID);
				if (zip.equals(pivzip)) {
					Reporter.log("Data("+zip+") was displayed correctly in the [Zip] Field");				
				} else {
					writeFailure("Data("+zip+") was not displayed correctly in the [Zip] Field");
				}
			}
			if (!pivcountry.equals("")) {
				Reporter.log("Step 10 - Verify data("+pivcountry+") was displayed correctly in the 'Country' Field");
				String countryID = getElementIDbyLabel("Country", PI_Country);
				String country = getValueWebdriver(attributeName_xpath,countryID);
				if (country.equals(pivcountry)) {
					Reporter.log("Data("+country+") was displayed correctly in the [Country] Field");				
				} else {
					writeFailure("Data("+country+") was not displayed correctly in the [Country] Field");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
