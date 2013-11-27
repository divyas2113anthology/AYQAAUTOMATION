package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ProspectMatch_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Prospect Match' page")
	public void WC_ProspectMatch_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Prospect Match' Page");
			String[] testdata = datacontainer;
			String lastname = testdata[0];
			String firstname = testdata[1];
			String postalcode = testdata[2];
			String emailaddress = testdata[3];
			String birthdate = testdata[4];
			String systemidentieis = testdata[5];
			String choosetomatchprospect = testdata[6];
			String button = testdata[7];
			Reporter.log("Input Test Data was retrieved for 'Prospect Match' Page");
			if (!lastname.equals("")) {
				Reporter.log("Enter the last name as ["+lastname+"]");
				if (lastname.contains("Check")) {
					checkWebdriver(attributeName_name, PM_LastName);
				} else if (lastname.contains("Uncheck")) {
					uncheckWebdriver(attributeName_name, PM_LastName);
				}
			}
			if (!firstname.equals("")) {
				Reporter.log("Enter the first name as ["+firstname+"]");
				if (firstname.contains("Check")) {
					checkWebdriver(attributeName_name, PM_FirstName);
				} else if (firstname.contains("Uncheck")) {
					uncheckWebdriver(attributeName_name, PM_FirstName);
				}
			}
			if (!postalcode.equals("")) {
				Reporter.log("Enter the postal code as ["+postalcode+"]");
				if (postalcode.contains("Check")) {
					checkWebdriver(attributeName_name, PM_PostalCode);
				} else if (postalcode.contains("Uncheck")) {
					uncheckWebdriver(attributeName_name, PM_PostalCode);
				}
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Enter the email address as ["+emailaddress+"]");
				if (emailaddress.contains("Check")) {
					checkWebdriver(attributeName_name, PM_Email);
				} else if (emailaddress.contains("Uncheck")) {
					uncheckWebdriver(attributeName_name, PM_Email);
				}
			}
			if (!birthdate.equals("")) {
				Reporter.log("Enter the birth date as ["+birthdate+"]");
				if (birthdate.contains("Check")) {
					checkWebdriver(attributeName_name, PM_BirthDate);
				} else if (birthdate.contains("Uncheck")) {
					uncheckWebdriver(attributeName_name, PM_BirthDate);
				}
			}
			if (!systemidentieis.equals("")) {
				Reporter.log("Enter the system identieis as ["+systemidentieis+"]");
				if (systemidentieis.equalsIgnoreCase("Match to the Original")) {
					clickWebdriver(attributeName_name, PM_MatchToOriginal);
				} else if (systemidentieis.equalsIgnoreCase("Match to the Most Recent")) {
					clickWebdriver(attributeName_name, PM_MatchToMostRecent);
				}
			}
			if (!choosetomatchprospect.equals("")) {
				Reporter.log("Enter the choose to match prospect as ["+choosetomatchprospect+"]");
				if (systemidentieis.equalsIgnoreCase("Submitted Applicants")) {
					clickWebdriver(attributeName_name, PM_SubmitApplicants);
				} else if (systemidentieis.equalsIgnoreCase("All Applicants")) {
					clickWebdriver(attributeName_name, PM_AllApplicants);
				}
			}
			if (!button.equals("")) {
				Reporter.log("Click the button as ["+button+"]");
				waitForElementPresentWebdriver(attributeName_xpath, WCL_Savebutton, button);
				clickWebdriver(attributeName_xpath, WCL_Savebutton);
				String GetAlert = alertMessage();
				Reporter.log("Prospect Match Alert Message as ["+GetAlert+"]");
				alertAccept();
				waitForPageToLoadWebdriver();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


