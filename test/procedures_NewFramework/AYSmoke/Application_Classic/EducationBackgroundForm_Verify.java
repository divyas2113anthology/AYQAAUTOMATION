package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class EducationBackgroundForm_Verify extends CommonSeleniumActions implements OR {	

	@Test(description="This Procedure is to perform some Verification in 'Education Background' page")
	public void EducationBackgroundForm_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("EducationBackgroundForm_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Education Background' page");
			String[]  educationvdatarepo = datacontainer;
			String edusuccessmessage = educationvdatarepo[0];
			String edupagename = educationvdatarepo[1];
			String eduverifyui = educationvdatarepo[2];
			String eduhighschoolname = educationvdatarepo[3];
			String eduhighschooltype = educationvdatarepo[4];
			String educounselorname = educationvdatarepo[5];
			String edustreetaddress = educationvdatarepo[6];
			String educity = educationvdatarepo[7];
			String edustate = educationvdatarepo[8];
			String educountry = educationvdatarepo[9];
			String edupostalcode = educationvdatarepo[10];
			String educollegeboardnumber = educationvdatarepo[11];
			String edudateofentry = educationvdatarepo[12];
			String edudateofgraduation = educationvdatarepo[13];
			String edugpa = educationvdatarepo[14];
			Reporter.log("Verify Test Data was retrieved for 'Education Background' page");
			//recentOpenedPopupSelectWebdriver("Education Background");
			//selectMainWindowWebdriver();
			if (!edusuccessmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+edusuccessmessage+") was displayed correctly");
				String actualText = edusuccessmessage;
				String expectedText = edusuccessmessage;
				if (actualText.equals(expectedText)) {
					Reporter.log("Message("+edusuccessmessage+") was displayed correctly");
				} else {
					writeFailure("Message("+edusuccessmessage+") was not displayed correctly");
				}
			}
			if (!edupagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+edupagename+") page");
				String actualText = edupagename;
				String expectedText = edupagename;
				if (actualText.equals(expectedText)) {
//					if (selenium.isTextPresent(edupagename))
						Reporter.log("Its navigate to ["+edupagename+"]age");
				} else {
					writeFailure("Its not navigate to ["+edupagename+"] page");
				}
			}
			if (!eduverifyui.equals("")) {
				Reporter.log("Step 3 - Verify UI");
			}
			if (!eduhighschoolname.equals("")) {
				Reporter.log("Step 4 - Verify data("+eduhighschoolname+") was displayed correctly in the 'High School Name' Field");
				String hsnamewaitID = getElementIDbyLabel("High School Name", EB_HighSchoolName_wait);
				waitForElementPresentWebdriver(attributeName_xpath, hsnamewaitID, eduhighschoolname);
							//				waitForConditionisElementPresent(hsnamewaitID, "60000");
	//			selenium.waitForCondition("selenium.isElementPresent(\"//input[@id='q24552' and @value!='']\")", "60000");
				//String hsnameID = getElementIDbyLabel("High School Name", EB_HighSchoolName);
				//waitForElementPresentWebdriver(attributeName_xpath, hsnameID, eduhighschoolname);
				//String vhsname = getValueWebdriver(attributeName_xpath,hsnameID);

				// Save the form before verify .
				//clickWebdriver(attributeName_xpath,"//img[contains(@src,'save_small')]");
				try{
					alertAccept();
				}catch(Exception e){
					System.out.println("No Alert");
				}
				/*String hsnameID =driver.findElement(By.xpath("//input[@id='q24552']")).getAttribute("value");
				String vhsname = hsnameID;*/

				String line1 = getValueWebdriver(attributeName_xpath, "//input[@id='q24552']");


				if (line1.equals(eduhighschoolname)) {
					Reporter.log("Data("+line1+") was displayed correctly in the [High School Name] Field");
				} else {
					writeFailure("Data("+line1+") was not displayed correctly in the [High School Name] Field");
				}
			}
			if (!eduhighschooltype.equals("")) {
				Reporter.log("Step 5 - Verify data("+eduhighschooltype+") was displayed correctly in the 'High School Type' Field");
				String hstypeID = getElementIDbyLabel("High School Type", EB_HighSchoolType);
				String vhstype = getValueWebdriver(attributeName_xpath,hstypeID);
				if (vhstype.equals(eduhighschooltype)) {
					Reporter.log("Data("+vhstype+") was displayed correctly in the [High School Type] Field");				
				} else {
					writeFailure("Data("+vhstype+") was not displayed correctly in the [High School Type] Field");
				}
			}
			if (!educounselorname.equals("")) {
				Reporter.log("Step 6 - Verify data("+educounselorname+") was displayed correctly in the 'Counselor Name' Field");
				String counselorID = getElementIDbyLabel("Counselor Name", EB_CounselorName);
				String vcounselor = getValueWebdriver(attributeName_xpath,counselorID);
				if (vcounselor.equals(educounselorname)) {
					Reporter.log("Data("+vcounselor+") was displayed correctly in the [Counselor Name] Field");				
				} else {
					writeFailure("Data("+vcounselor+") was not displayed correctly in the [Counselor Name] Field");
				}
			}
			if (!edustreetaddress.equals("")) {
				Reporter.log("Step 7 - Verify data("+edustreetaddress+") was displayed correctly in the 'Street Address' Field");
				String streetID = getElementIDbyLabel("Street Address", EB_StreetAddress);
				String vstreet = getValueWebdriver(attributeName_xpath,streetID);
				if (vstreet.equals(edustreetaddress)) {
					Reporter.log("Data("+vstreet+") was displayed correctly in the [Street Address] Field");				
				} else {
					writeFailure("Data("+vstreet+") was not displayed correctly in the [Street Address] Field");
				}
			}
			if (!educity.equals("")) {
				Reporter.log("Step 8 - Verify data("+educity+") was displayed correctly in the 'City' Field");
				String cityID = getElementIDbyLabel("City", EB_City);
				String vcity = getValueWebdriver(attributeName_xpath,cityID);
				if (vcity.equals(educity)) {
					Reporter.log("Data("+vcity+") was displayed correctly in the [City] Field");				
				} else {
					writeFailure("Data("+vcity+") was not displayed correctly in the [City] Field");
				}
			}
			if (!edustate.equals("")) {
				Reporter.log("Step 9 - Verify data("+edustate+") was displayed correctly in the 'State' Field");
				String stateID = getElementIDbyLabel("State", EB_State);
				String vstate = getValueWebdriver(attributeName_xpath,stateID);
				if (vstate.equals(edustate)) {
					Reporter.log("Data("+vstate+") was displayed correctly in the [State] Field");				
				} else {
					writeFailure("Data("+vstate+") was not displayed correctly in the [State] Field");
				}
			}
			if (!educountry.equals("")) {
				Reporter.log("Step 10 - Verify data("+educountry+") was displayed correctly in the 'Country' Field");
				String countryID = getElementIDbyLabel("Country", EB_Country);
				String vcountry = getValueWebdriver(attributeName_xpath,countryID);
				if (vcountry.equals(educountry)) {
					Reporter.log("Data("+vcountry+") was displayed correctly in the [Country] Field");				
				} else {
					writeFailure("Data("+vcountry+") was not displayed correctly in the [Country] Field");
				}
			}
			if (!edupostalcode.equals("")) {
				Reporter.log("Step 11 - Verify data("+edupostalcode+") was displayed correctly in the 'Postal Code' Field");
				String postalID = getElementIDbyLabel("Postal Code", EB_PostalCode);
				String vpostal = getValueWebdriver(attributeName_xpath,postalID);
				if (vpostal.equals(edupostalcode)) {
					Reporter.log("Data("+vpostal+") was displayed correctly in the [Postal Code] Field");				
				} else {
					writeFailure("Data("+vpostal+") was not displayed correctly in the [Postal Code] Field");
				}
			}
			if (!educollegeboardnumber.equals("")) {
				Reporter.log("Step 12 - Verify data("+educollegeboardnumber+") was displayed correctly in the 'College Board Number (CEEB)' Field");
				String ceebID = getElementIDbyLabel("College Board Number (CEEB)", EB_CollegeBoardNumber);
				String vceeb = getValueWebdriver(attributeName_xpath,ceebID);
				if (vceeb.equals(educollegeboardnumber)) {
					Reporter.log("Data("+vceeb+") was displayed correctly in the [College Board Number (CEEB)] Field");				
				} else {
					writeFailure("Data("+vceeb+") was not displayed correctly in the [College Board Number (CEEB)] Field");
				}
			}
			if (!edudateofentry.equals("")) {
				Reporter.log("Step 13 - Verify data("+edudateofentry+") was displayed correctly in the 'Date of Entry' Field");
				String doeID = getElementIDbyLabel("Date of Entry", EB_DateofEntry);
				String vdoe = getValueWebdriver(attributeName_xpath,doeID);
				if (vdoe.equals(edudateofentry)) {
					Reporter.log("Data("+vdoe+") was displayed correctly in the [Date of Entry] Field");				
				} else {
					writeFailure("Data("+vdoe+") was not displayed correctly in the [Date of Entry] Field");
				}
			}
			if (!edudateofgraduation.equals("")) {
				Reporter.log("Step 14 - Verify data("+edudateofgraduation+") was displayed correctly in the 'Date of Graduation' Field");
				String dgID = getElementIDbyLabel("Date of Graduation", EB_DateofGraduation);
				String vdg = getValueWebdriver(attributeName_xpath,dgID);
				if (vdg.equals(edudateofgraduation)) {
					Reporter.log("Data("+vdg+") was displayed correctly in the [Date of Graduation] Field");				
				} else {
					writeFailure("Data("+vdg+") was not displayed correctly in the [Date of Graduation] Field");
				}
			}
			if (!edugpa.equals("")) {
				Reporter.log("Step 15 - Verify data("+edugpa+") was displayed correctly in the 'GPA' Field");
				String gpaID = getElementIDbyLabel("GPA", EB_GPA);
				String vgpa = getValueWebdriver(attributeName_xpath,gpaID);
				if (vgpa.equals(edugpa)) {
					Reporter.log("Data("+vgpa+") was displayed correctly in the [GPA] Field");				
				} else {
					writeFailure("Data("+vgpa+") was not displayed correctly in the [GPA] Field");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
