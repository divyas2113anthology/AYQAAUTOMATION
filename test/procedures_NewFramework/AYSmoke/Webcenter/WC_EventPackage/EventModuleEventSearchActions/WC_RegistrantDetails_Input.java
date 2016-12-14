package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.EventModuleEventSearchActions;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;
public class WC_RegistrantDetails_Input  extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some Operation on 'Registrant Details' Page")
	public void WC_RegistrantDetails_Input(){
		try {
			writeDetails();
			Reporter.log("This procedure is used to input Registrant Details");
			String[] testdata = datacontainer;
			String firstname = testdata[0];
			String lastname = testdata[1];
			String gender = testdata[2];
			String ethincity = testdata[3];
			String email = testdata[4];
			String yesorno = testdata[5];
			String phone1 = testdata[6];
			String phone2 = testdata[7];
			String phone3 = testdata[8];
			String phone4 = testdata[9];
			String phone5 = testdata[10];
			String ssn = testdata[11];
			String tfuppercase = testdata[12];
			String button = testdata[13];
			Reporter.log("Input Test Data was retrieved for 'Webcenter Registrant Details' Page");
			if (!firstname.equals("")) {
				Reporter.log("Step 1 - Enter the First Name as ["+firstname+"]");
				String FirstName = getElementIDbyLabelContains("First Name:", RD_FirstName);
				sendKeys(attributeName_xpath, FirstName, firstname);
			}
			if (!lastname.equals("")) {
				Reporter.log("Step 2 - Enter the Last Name as ["+lastname+"]");
				String LastName = getElementIDbyLabelContains("Last Name:", RD_LastName);
				sendKeys(attributeName_xpath, LastName, lastname);
			}
			if (!gender.equals("")) {
				Reporter.log("Step 3 - Select the gender as ["+gender+"]");
				clickWebdriver(attributeName_xpath, RD_Gender+gender+"']");
				
			}
			if (!ethincity.equals("")) {
				Reporter.log("Step 4 - Select the Ethincity as ["+ethincity+"]");
				String EthinCity = getElementIDbyLabelContains("Ethnicity:", RD_Ethincity);
				selectByValueWebdriver(attributeName_xpath, EthinCity, ethincity);
				
			}
			if (!email.equals("")) {
				Reporter.log("Step 5 - Enter the Email as ["+ethincity+"]");
				String Email = getElementIDbyLabelContains("Email Address:", RD_EmailAddress);
				sendKeys(attributeName_xpath, Email, email);
			}
			if (!yesorno.equals("")) {
				Reporter.log("Step 6 - Select the option as ["+yesorno+"]");
				clickWebdriver(attributeName_xpath, RD_GuestYesOrNo+yesorno+"']");
			}
			if (!phone1.equals("")) {
				Reporter.log("Step 7 - Enter the Text - TF Phone 1 as ["+phone1+"]");
				String Phone1 = getElementIDbyLabelContains("Text - TF Ph ###-####", RD_Phone1);
				sendKeys(attributeName_xpath, Phone1, phone1);
			}
			if (!phone2.equals("")) {
				Reporter.log("Step 8 - Enter the Text - TF Phone 2 as ["+phone2+"]");
				String Phone2 = getElementIDbyLabelContains("Text - TF Ph ###.####", RD_Phone2);
				sendKeys(attributeName_xpath, Phone2, phone2);
				
			}
			if (!phone3.equals("")) {
				Reporter.log("Step 9 - Enter the Text - TF Phone 3 as ["+phone3+"]");
				String Phone3 = getElementIDbyLabelContains("Text - TF ###.###.#### Ph", RD_Phone3);
				sendKeys(attributeName_xpath, Phone3, phone3);
				
			}
			if (!phone4.equals("")) {
				Reporter.log("Step 10 - Enter the Text - TF Phone 4 as ["+phone4+"]");
				String Phone4 = getElementIDbyLabelContains("Text - TF ###-###-#### Ph", RD_Phone4);
				sendKeys(attributeName_xpath, Phone4, phone4);
				
			}
			if (!phone5.equals("")) {
				Reporter.log("Step 11 - Enter the Text - TF Phone 5 as ["+phone5+"]");
				String Phone5 = getElementIDbyLabelContains("Text - TF (###) ###-#### Ph", RD_Phone5);
				sendKeys(attributeName_xpath, Phone5, phone5);
				
			}
			if (!ssn.equals("")) {
				Reporter.log("Step 12 - Enter the TWF-TextFF SSNWithDashes as ["+ssn+"]");
				String SSN = getElementIDbyLabelContains("TWF-TextFF SSNWithDashes", RD_TextFF);
				sendKeys(attributeName_xpath, SSN, ssn);
			}
			if (!tfuppercase.equals("")) {
				Reporter.log("Step 13 - Enter the Text - TF Upper Case as ["+tfuppercase+"]");
				
			}
			if (!button.equals("")) {
				Reporter.log("Step 14 - Click on Button ");
				if (button.equalsIgnoreCase("close window")) {
					waitForElementPresentWebdriverWait(attributeName_xpath, AEE_CloseWindow, button);
					clickWebdriver(attributeName_xpath, AEE_CloseWindow);
					selectMainWindowWebdriver();
				}else if(button.equalsIgnoreCase("will_not")){
					waitForElementPresentWebdriverWait(attributeName_xpath, "//img[contains(@src,'will_not')]", button);
					clickWebdriver(attributeName_xpath, "//img[contains(@src,'will_not')]");
					switchToOldWindow();
					}
				else {
					waitForElementPresentWebdriver(attributeName_xpath, AER_UpdateMyInformation+button+"')]", button);
					clickWebdriver(attributeName_xpath, AER_UpdateMyInformation+button+"')]");
					waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}

