package procedures_NewFramework.AYSmoke.Prospect;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PRO_InformationRequest_Verify extends CommonSeleniumActions implements OR {	

	@Test(description="This Procedure is to perform some Verification in 'Education Background' page")
	public void PRO_InformationRequest_Verify() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Education Background' page");
			String[]  educationvdatarepo = datacontainer;
			String edusuccessmessage = educationvdatarepo[0];
			String edupagename = educationvdatarepo[1];
			String codelookuphs = educationvdatarepo[2];
			String eduhighschoolname = educationvdatarepo[3];
			String educity = educationvdatarepo[4];
			String edustate = educationvdatarepo[5];
			String educountry = educationvdatarepo[6];
			String edupostalcode = educationvdatarepo[7];
			Reporter.log("Verify Test Data was retrieved for 'Education Background' page");
			if (!edusuccessmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+edusuccessmessage+") was displayed correctly");
				if (selenium.isTextPresent(edusuccessmessage)) {
					Reporter.log("Message("+edusuccessmessage+") was displayed correctly");
				} else {
					writeFailure("Message("+edusuccessmessage+") was not displayed correctly");
				}
			}
			if (!edupagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+edupagename+") page");
				if (isDisplayedWebdriver(attributeName_xpath,"//font[text()='Information Request']")) {
					Reporter.log("Its navigate to ["+edupagename+"]age");
				} else {
					writeFailure("Its not navigate to ["+edupagename+"] page");
				}
			}
			if (!codelookuphs.equals("")) {
				Reporter.log("Step 3 - Verify Code LookUp");
			}
			if (!eduhighschoolname.equals("")) {
				Reporter.log("Step 4 - Verify data("+eduhighschoolname+") was displayed correctly in the 'High School Name' Field");
				String hsnameID = getElementIDbyLabel("HS Name", HS_Name);
				waitForElementPresentWebdriver(attributeName_xpath, hsnameID, eduhighschoolname);
				String vhsname = getValueWebdriver(attributeName_xpath,hsnameID);
				if (vhsname.equals(eduhighschoolname)) {
					Reporter.log("Data("+vhsname+") was displayed correctly in the [High School Name] Field");				
				} else {
					writeFailure("Data("+vhsname+") was not displayed correctly in the [High School Name] Field");
				}
			}
			if (!educity.equals("")) {
				Reporter.log("Step 8 - Verify data("+educity+") was displayed correctly in the 'City' Field");
				String cityID = getElementIDbyLabel("HS City", HS_City);
				String vcity = getValueWebdriver(attributeName_xpath,cityID);
				if (vcity.equals(educity)) {
					Reporter.log("Data("+vcity+") was displayed correctly in the [City] Field");				
				} else {
					writeFailure("Data("+vcity+") was not displayed correctly in the [City] Field");
				}
			}
			if (!edustate.equals("")) {
				Reporter.log("Step 9 - Verify data("+edustate+") was displayed correctly in the 'State' Field");
				String stateID = getElementIDbyLabel("HS State", HS_State);
				String vstate = getValueWebdriver(attributeName_xpath,stateID);
				if (vstate.equals(edustate)) {
					Reporter.log("Data("+vstate+") was displayed correctly in the [State] Field");				
				} else {
					writeFailure("Data("+vstate+") was not displayed correctly in the [State] Field");
				}
			}
			if (!educountry.equals("")) {
				Reporter.log("Step 10 - Verify data("+educountry+") was displayed correctly in the 'Country' Field");
				String countryID = getElementIDbyLabel("HS Country", HS_Country);
				String vcountry = getValueWebdriver(attributeName_xpath,countryID);
				if (vcountry.equals(educountry)) {
					Reporter.log("Data("+vcountry+") was displayed correctly in the [Country] Field");				
				} else {
					writeFailure("Data("+vcountry+") was not displayed correctly in the [Country] Field");
				}
			}
			if (!edupostalcode.equals("")) {
				Reporter.log("Step 11 - Verify data("+edupostalcode+") was displayed correctly in the 'Postal Code' Field");
				String postalID = getElementIDbyLabel("HS Zip", HS_Zip);
				String vpostal = getValueWebdriver(attributeName_xpath,postalID);
				if (vpostal.equals(edupostalcode)) {
					Reporter.log("Data("+vpostal+") was displayed correctly in the [Postal Code] Field");				
				} else {
					writeFailure("Data("+vpostal+") was not displayed correctly in the [Postal Code] Field");
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
