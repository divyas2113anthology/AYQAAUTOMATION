package procedures_NewFramework.AYSmoke.Recommendations;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class REC_ContactInformation_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Contact Information' page")
	public void REC_ContactInformation_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Contact Information' page");
		String lastname = testdata[0];
		String firstname = testdata[1];
		String prefix = testdata[2];
		String title = testdata[3];
		String organization = testdata[4];
		String email = testdata[5];
		String streetaddress = testdata[6];
		String city = testdata[7];
		String state = testdata[8];
		String zippostalcode = testdata[9];
		String country = testdata[10];
		String uploaddocument = testdata[11];
		String numbertest = testdata[12];
		String gobacksavenext = testdata[13];
		Reporter.log("Input Test Data was retrieved for 'Contact Information' page");
		if (!lastname.equals("")) {
			Reporter.log("Step 1 - Enter the Last Name as '"+lastname+"' Page");
			String LastName = getElementIDbyLabel("Last Name",CI_LstName);
			sendKeys(attributeName_xpath, LastName, lastname);
		}
		if (!firstname.equals("")) {
			Reporter.log("Step 2 - Enter the Last Name as '"+firstname+"' Page");
			String FirstName = getElementIDbyLabel("First Name",CI_FstName);
			sendKeys(attributeName_xpath, FirstName, firstname);
		}
		if (!prefix.equals("")) {
			Reporter.log("Step 3 -Select the prefix as '"+prefix+"' Page");
			String Prefix = getElementIDbyLabel("Prefix",CI_Prefix);
			selectByValueWebdriver(attributeName_xpath, Prefix, prefix);
		}
		if (!title.equals("")) {
			Reporter.log("Step 4 - Enter the Title as '"+title+"' Page");
			String PositionOrTitle = getElementIDbyLabel("Position or Title:",CI_PositionOrTitle);
			sendKeys(attributeName_xpath, PositionOrTitle, title);
		}
		if (!organization.equals("")) {
			Reporter.log("Step 5 - Enter the Organization as '"+organization+"' Page");
			String Organization = getElementIDbyLabel("Organization",CI_Organization);
			sendKeys(attributeName_xpath, Organization, organization);
		}
		if (!email.equals("")) {
			Reporter.log("Step 6 - Enter the Email as '"+email+"' Page");
			String Email = getElementIDbyLabel("Email:",CI_Email);
			sendKeys(attributeName_xpath, Email, email);
		}
		if (!streetaddress.equals("")) {
			Reporter.log("Step 7 - Enter the Street Address as '"+streetaddress+"' Page");
			String StreetAddress = getElementIDbyLabel("Street Address:",CI_StreetAdd);
			sendKeys(attributeName_xpath, StreetAddress, streetaddress);
		}
		if (!city.equals("")) {
			Reporter.log("Step 8 - Enter the City as '"+city+"' Page");
			String City = getElementIDbyLabel("City:",CI_City);
			sendKeys(attributeName_xpath, City, city);
		}
		if (!state.equals("")) {
			Reporter.log("Step 9 -Select the State as '"+state+"' Page");
			String State = getElementIDbyLabel("State:",CI_State);
			selectByValueWebdriver(attributeName_xpath, State, state);
		}
		if (!zippostalcode.equals("")) {
			Reporter.log("Step 10 - Enter the Zip/Postal code as '"+zippostalcode+"' Page");
			String ZipPostalCode = getElementIDbyLabel("Zip/Postal Code:",CI_PostalCode);
			sendKeys(attributeName_xpath, ZipPostalCode, zippostalcode);
		}
		if (!country.equals("")) {
			Reporter.log("Step 11 -Select the Country as '"+country+"' Page");
			String Country = getElementIDbyLabel("Country",CI_Country);
			selectByValueWebdriver(attributeName_xpath, Country, country);

		}
		if (!uploaddocument.equals("")) {
			waitForPageToLoadWebdriver();
			Reporter.log("Step 12 -Click the Upload Doc button");
			try {
				clickWebdriver(attributeName_xpath, CI_UploadDocBtn);
			}catch(Exception e){clickWebdriver(attributeName_name,"Upload");}
			waitForPageToLoadWebdriver();
			recentPopupSelectWebdriver("File Upload");
		}
		if (!gobacksavenext.equals("")) {
			Reporter.log("Step 13 -Click the button as '"+gobacksavenext+"'");
			if (gobacksavenext.equalsIgnoreCase("Go Back")) {
				clickWebdriver(attributeName_xpath, CI_BackBtn);
				waitForPageToLoadWebdriver();
			}else if (gobacksavenext.equalsIgnoreCase("Save")) {
				clickWebdriver(attributeName_xpath, "//a[@id='btnSave']");
			}else if (gobacksavenext.equalsIgnoreCase("Next")) {
				waitForElementPresentWebdriver(attributeName_xpath, CI_NextBtn, gobacksavenext);
				clickWebdriver(attributeName_xpath, CI_NextBtn);
				waitForPageToLoadWebdriver();
			}else if(gobacksavenext.contains("Save and Continue")){
				clickWebdriver(attributeName_xpath, "//a[@id='btnSaveCnt']");
				waitForPageToLoadWebdriver();
				waitForPageToLoadWebdriver();
				waitForPageToLoadWebdriver();
			}

		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}

