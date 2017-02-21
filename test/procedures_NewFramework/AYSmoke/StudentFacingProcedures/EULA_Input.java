package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class EULA_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'EULA' page")
	public void EULA_Input(){
		try {
			writeDetails();
//			headerStatement("EULA_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'EULA' page");
			String[]  eulaidatarepo = datacontainer;
			String iagree = eulaidatarepo[0];
			String privacypolicy = eulaidatarepo[1];
			String continuecreate = eulaidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'EULA' page");
			if (!iagree.equals("")) {
				Reporter.log("Proceed to  ("+iagree+") in the 'I agree' Checkbox");
				if (iagree.equalsIgnoreCase("Check")) {
					checkWebdriver(attributeName_xpath,Iagree);
				}else if (iagree.equalsIgnoreCase("Uncheck")) {
					uncheckWebdriver(attributeName_xpath,Iagree);
				}			
			}
			if (!privacypolicy.equals("")) {
				Reporter.log("Proceed to check ("+privacypolicy+") in the 'Privacy Policy' Radio");
				if (privacypolicy.equalsIgnoreCase("Check")) {
					checkWebdriver(attributeName_xpath,PrivacyPolicy);
				}else if (privacypolicy.equalsIgnoreCase("UnCheck")) {
					uncheckWebdriver(attributeName_xpath,PrivacyPolicy);
				}			
			}
			if (!continuecreate.equals("")) {
				Reporter.log("Proceed to Click on ("+continuecreate+") button");
				if (continuecreate.equalsIgnoreCase("continue & create new account")) {
					clickWebdriver(attributeName_xpath,Continue);
					waitForPageToLoadWebdriver();
				}			
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
