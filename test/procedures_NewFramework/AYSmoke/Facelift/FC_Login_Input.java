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
		String view_source = loginInputArray[2];
		Reporter.log("Input Test Data was retrieved for 'Application Login' page");
		if (!tab_to_select.equals("")) {
			Reporter.log("Step 1 - Select this Tab, '"+ tab_to_select +"'");
			if (tab_to_select.equalsIgnoreCase("Create Account")) {
//				click(LI_CreateAccountSelect);
				clickWebdriver(attributeName_linktext, tab_to_select);
				waitForElementPresentWebdriver(attributeName_cssselector, CA_FirstName, "First or Given Name");
			}	else if (tab_to_select.equalsIgnoreCase("User Login")) {
				Reporter.log("Select the Tab, '"+ tab_to_select +"'");
				clickWebdriver(attributeName_cssselector,LI_UserLoginSelect);
			}
			
		}
		
		if (!link_to_click.equalsIgnoreCase("")) {
			Reporter.log("Step 2 - Click This Link, '"+ link_to_click +"'");
			if (link_to_click.equalsIgnoreCase("Contact Us")) {
				Reporter.log("Click the 'Contact Us' Link");
				clickWebdriver(attributeName_cssselector,LI_contactUs);
			} else if (link_to_click.equalsIgnoreCase("Frequently Asked Questions")) {
				Reporter.log("Click the 'Frequently Asked Questions' Link");
				clickWebdriver(attributeName_cssselector,LI_frAskedQst);
			} else if (link_to_click.equalsIgnoreCase("Technical Support")) {
				Reporter.log("Click the 'Technical Support' Link");
				clickWebdriver(attributeName_cssselector,LI_technicalSupport);
			} else if (link_to_click.equalsIgnoreCase("Security Information")) {
				Reporter.log("Click the 'Frequently Asked Questions' Link");
				clickWebdriver(attributeName_cssselector,LI_securityInfo);
			} else if (link_to_click.equalsIgnoreCase("System Requirements")) {
				Reporter.log("Click the 'Technical Support' Link");
				clickWebdriver(attributeName_linktext,LI_systemRequirements);
			}else if(!tab_to_select.equalsIgnoreCase("User Name")){
				waitForElementPresentWebdriver(attributeName_xpath, ForgotUserNamePassword, tab_to_select);
				clickWebdriver(attributeName_xpath,ForgotUserNamePassword);
				waitForPageToLoadWebdriver();
			}
			
		}
		if(!view_source.equals("")){
			String pagesource = driver.getPageSource();
			String instance = Runtimedataread("Instance");
			
			if(pagesource.contains(view_source)){
				if(instance.equalsIgnoreCase("USQA") && pagesource.contains("id=GTM-5BXB27"))
						System.out.println("US QA String Present");
			else if(instance.equalsIgnoreCase("UKQA") && pagesource.contains("id=GTM-PSKDLP"))
						System.out.println("US QA String Present");
			else
				writeFailure("Given Test Data["+view_source+"] has not be available");
			}
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
