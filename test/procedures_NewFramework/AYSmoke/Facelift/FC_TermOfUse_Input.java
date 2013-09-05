package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_TermOfUse_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Term Of Use' page")
	public void FC_TermOfUse_Input (){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Term of Use' page");
			String[]  eulaidatarepo = datacontainer;
			String iagree = eulaidatarepo[0];
			String privacy_policy = eulaidatarepo[1];
			String button_to_click = eulaidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Term of Use' page");
			if (!iagree.equals("")) {
				Reporter.log("Proceed to  ("+iagree+") in the 'I agree' Checkbox");
				if (iagree.equalsIgnoreCase("Check")) {
					if (isElementPresentWebdriver(attributeName_cssselector, TOU_Iagree)) {
						checkWebdriver(attributeName_cssselector, TOU_Iagree);
					}
				}else if (iagree.equalsIgnoreCase("Uncheck")) {
					uncheckWebdriver(attributeName_cssselector, TOU_Iagree);
				}			
			}
			
			if (!privacy_policy.equals("")) {
				Reporter.log("Proceed to check ("+privacy_policy+") in the 'Privacy Policy' Radio");
				if (privacy_policy.equalsIgnoreCase("Check")) {
					if (isElementPresentWebdriver(attributeName_cssselector, TOU_PrivacPolicy)) {
						checkWebdriver(attributeName_cssselector,TOU_PrivacPolicy);
					}
				}else if (privacy_policy.equalsIgnoreCase("Uncheck")) {
					uncheckWebdriver(attributeName_cssselector,TOU_PrivacPolicy);
				}
//				if (privacy_policy.equalsIgnoreCase("Yes")) {
//					check(TOU_PrivacPolicy_Yes);
//				}else if (privacy_policy.equalsIgnoreCase("No")) {
//					uncheck(TOU_PrivacPolicy_No);
//				}			
			}
			if (!button_to_click.equals("")) {
				Reporter.log("Proceed to Click on ("+button_to_click+") button");
				if (button_to_click.equalsIgnoreCase("Continue and Create")) {
					if (isElementPresentWebdriver(attributeName_xpath, TOU_ContinuAndCreate)) {
//					click(TOU_ContinuAndCreate);
					clickWebdriver(attributeName_xpath, TOU_ContinuAndCreate);
					waitForElementPresentWebdriver(attributeName_cssselector, DB_PageTitle, "Dashboard Page Title");
//					waitForPageToLoad();
//					waitForConditionisElementPresent(DB_PageTitle, "5");
					}
				}			
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
