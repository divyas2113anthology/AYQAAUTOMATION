package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class MC_ApplicantLookup_Verify extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Applicant Lookup' page")
		public void MC_ApplicantLookup_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Applicant Lookup' Result Section");
			String[]  testdata = datacontainer;
			String clientid = testdata[0];
			String name = testdata[1];
			String emailaddress = testdata[2];
			String dateofbirth = testdata[3];
			String zip = testdata[4];
			String pin = testdata[5];
			String pac = testdata[6];
			String lastaccessmodified = testdata[7];
			String profilecreated = testdata[8];
			Reporter.log("Verify Test Data was retrieved for 'Applicant Lookup' Result Section");
			if (!clientid.equals("")) {
				Reporter.log("Step 1 - Verify the Client ID as  ["+clientid+"]");
				waitForPageToLoadWebdriver();
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "Client ID", clientid);
			}
			if (!name.equals("")) {
				Reporter.log("Step 2 - Verify the Name as  ["+name+"]");
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "Name", name);
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Step 3 - Verify the Email Address as  ["+emailaddress+"]");
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "Email Address", emailaddress);
			}
			if (!dateofbirth.equals("")) {
				Reporter.log("Step 4 - Verify the DOB as  ["+dateofbirth+"]");
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "Date Of Birth", dateofbirth);
			}
			if (!zip.equals("")) {
				Reporter.log("Step 5 - Verify the ZIP as  ["+zip+"]");
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "Zip", zip);
			}
			if (!pin.equals("")) {
				Reporter.log("Step 6 - Verify the PIN as  ["+pin+"]");
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "PIN", pin);
			}
			if (!pac.equals("")) {
				Reporter.log("Step 7 - Verify the PAC as  ["+pac+"]");
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "PAC", pac);
			}
			if (!lastaccessmodified.equals("")) {
				Reporter.log("Step 8 - Verify the Last Access/Modified as  ["+lastaccessmodified+"]");
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "Last Access / Modified", lastaccessmodified);
			}
			if (!profilecreated.equals("")) {
				Reporter.log("Step 9 - Verify the Profile Created as  ["+profilecreated+"]");
				verifyRowvalueswithExactcolumnNamesusingxpathWebdriver(attributeName_xpath, "//td[contains(text(),'Results found') or contains(text(),'Result found')]/table", "Profile Created", profilecreated);
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}

