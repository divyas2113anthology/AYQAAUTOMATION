package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_Login_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Application Login' page")
	public void FC_Login_Input() throws Exception{
		try {
		writeDetails();
		String[]  loginInputArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Application Login' page");
		String tab_to_select = loginInputArray[0];
		String link_to_click = loginInputArray[1];
		Reporter.log("Input Test Data was retrieved for 'Application Login' page");
		if (!tab_to_select.equals("")) {
			Reporter.log("Step 1 - Select this Tab, '"+ tab_to_select +"'");
			if (tab_to_select.equalsIgnoreCase("Create Account")) {
//				click(LI_CreateAccountSelect);
				clickWebdriver(attributeName_linktext, tab_to_select);
				waitForElementPresentWebdriver(attributeName_cssselector, CA_FirstName, "First or Given Name");
			}	else if (tab_to_select.equalsIgnoreCase("User Login")) {
				Reporter.log("Select the Tab, '"+ tab_to_select +"'");
				click(LI_UserLoginSelect);
			}
		}
		
		if (!link_to_click.equalsIgnoreCase("")) {
			Reporter.log("Step 2 - Click This Link, '"+ link_to_click +"'");
			if (link_to_click.equalsIgnoreCase("Contact Us")) {
				Reporter.log("Click the 'Contact Us' Link");
				click(LI_contactUs);
			} else if (link_to_click.equalsIgnoreCase("Frequently Asked Questions")) {
				Reporter.log("Click the 'Frequently Asked Questions' Link");
				click(LI_frAskedQst);
			} else if (link_to_click.equalsIgnoreCase("Technical Support")) {
				Reporter.log("Click the 'Technical Support' Link");
				click(LI_technicalSupport);
			} else if (link_to_click.equalsIgnoreCase("Security Information")) {
				Reporter.log("Click the 'Frequently Asked Questions' Link");
				click(LI_securityInfo);
			} else if (link_to_click.equalsIgnoreCase("System Requirements")) {
				Reporter.log("Click the 'Technical Support' Link");
				click(LI_systemRequirements);
			}
			
		}
		
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
