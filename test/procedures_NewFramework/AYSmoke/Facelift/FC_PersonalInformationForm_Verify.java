package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_PersonalInformationForm_Verify extends CommonSeleniumActions	implements OR {
	

	
	@Test(description="This Procedure is to perform some Verification in 'Personal Information' page")
	public void FC_PersonalInformationForm_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalInformationForm_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Personal Information' page");
			String[]  personalinfovdatarepo = datacontainer;
			String successmessage = personalinfovdatarepo[0];
			String pagename = personalinfovdatarepo[1];
			String pivverifyui = personalinfovdatarepo[2];
			String pivaddressline1 = personalinfovdatarepo[3];
			String pivaddressline2 = personalinfovdatarepo[4];
			String pivaddressline3 = personalinfovdatarepo[5];
			String pivcity = personalinfovdatarepo[6];
			String pivstate = personalinfovdatarepo[7];
			String pivzip = personalinfovdatarepo[8];
			String pivcountry = personalinfovdatarepo[9];
			Reporter.log("Verify Test Data was retrieved for 'Personal Information' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				verifyElementTextWebdriver(attributeName_xpath,PSD_SuccessMsg,successmessage, "Sucesses Message");
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				verifyElementTextWebdriver(attributeName_xpath,PSD_PageName, pagename, "Page Name");
			}
			if (!pivverifyui.equals("")) {
				
			}
	
			if (!pivaddressline1.equals("")) {
				Reporter.log("Step 3 - Verify data("+pivaddressline1+") was displayed correctly in the 'Address Line1' Field");
//				String addrwaitID = getElementIDbyLabel("Address Line1", PII_AddressLine1_wait);
//				waitForConditionisElementPresent(addrwaitID, "60000");
				waitForElementPresentWebdriver(attributeName_xpath, PII_AddressLine1, "Address Lookup");
				String addrID1 = getElementIDbyLabel("Address Line1", PII_AddressLine1);			
				String line1 = getValueWebdriver(attributeName_xpath,addrID1);
				if (line1.equals(pivaddressline1)) {
					Reporter.log("Data("+line1+") was displayed correctly in the [Address Line1] Field");				
				} else {
					writeFailure("Data("+line1+") was not displayed correctly in the [Address Line1] Field");
				}
			}
			if (!pivaddressline2.equals("")) {
				Reporter.log("Step 4 - Verify data("+pivaddressline2+") was displayed correctly in the 'Address Line2' Field");
				String addrID2 = getElementIDbyLabel("Address Line2", PII_AddressLine2);
				String line2 = getValueWebdriver(attributeName_xpath,addrID2);
				if (line2.equals(pivaddressline2)) {
					Reporter.log("Data("+line2+") was displayed correctly in the [Address Line2] Field");				
				} else {
					writeFailure("Data("+line2+") was not displayed correctly in the [Address Line2] Field");
				}
			}
			if (!pivaddressline3.equals("")) {
				Reporter.log("Step 5 - Verify data("+pivaddressline3+") was displayed correctly in the 'Address Line3' Field");
				String addrID3 = getElementIDbyLabel("Address Line3", PII_AddressLine3);
				String line3 = getValueWebdriver(attributeName_xpath,addrID3);
				if (line3.equals(pivaddressline3)) {
					Reporter.log("Data("+line3+") was displayed correctly in the [Address Line3] Field");				
				} else {
					writeFailure("Data("+line3+") was not displayed correctly in the [Address Line3] Field");
				}
			}
			if (!pivcity.equals("")) {
				Reporter.log("Step 6 - Verify data("+pivcity+") was displayed correctly in the 'City' Field");
				String cityID = getElementIDbyLabel("City", PII_City);
				String city = getValueWebdriver(attributeName_xpath,cityID);
				if (city.equals(pivcity)) {
					Reporter.log("Data("+city+") was displayed correctly in the [City] Field");				
				} else {
					writeFailure("Data("+city+") was not displayed correctly in the [City] Field");
				}
			}
			if (!pivstate.equals("")) {
				Reporter.log("Step 7 - Verify data("+pivstate+") was displayed correctly in the 'State' Field");
				String stateID = getElementIDbyLabel("State", PII_State);
				String state = getValueWebdriver(attributeName_xpath,stateID);
				if (state.equals(pivstate)) {
					Reporter.log("Data("+state+") was displayed correctly in the [State] Field");				
				} else {
					writeFailure("Data("+state+") was not displayed correctly in the [State] Field");
				}
			}
			if (!pivzip.equals("")) {
				Reporter.log("Step 8 - Verify data("+pivzip+") was displayed correctly in the 'Zip' Field");
				String zipID = getElementIDbyLabel("Zip", PII_Zip);
				String zip = getValueWebdriver(attributeName_xpath,zipID);
				if (zip.equals(pivzip)) {
					Reporter.log("Data("+zip+") was displayed correctly in the [Zip] Field");				
				} else {
					writeFailure("Data("+zip+") was not displayed correctly in the [Zip] Field");
				}
			}
			if (!pivcountry.equals("")) {
				Reporter.log("Step 9 - Verify data("+pivcountry+") was displayed correctly in the 'Country' Field");
				String countryID = getElementIDbyLabel("Country", PII_Country);
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
