package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.InviteEvent;

import or.OR;

import org.openqa.selenium.Keys;
import com.thoughtworks.selenium.webdriven.commands.Uncheck;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_InviteEvent_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Invite To Event' page")
	public void WC_InviteEvent_Input () throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Invite To Event' page");
			String[]  applicantwelidatarepo = datacontainer;
			String eventlookup = applicantwelidatarepo[0];
			String selecttemplate = applicantwelidatarepo[1];
			String inviteback = applicantwelidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Invite To Event' page");
	//		selectMainWindow();
			if (!eventlookup.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+eventlookup+") Link");
				clickWebdriver(attributeName_xpath, IE_EventLookup);
				recentPopupSelectWebdriver("Lookup");
			}
			if (!selecttemplate.equals("")) {
				Reporter.log("Step 2 - Proceed to Select the Template as ("+selecttemplate+")");
//				selectByVisibleTextWithSpaceWebdriver(attributeName_name, IE_TemplateSelect, selecttemplate);
				select(IE_TemplateSelect, "regexp:"+selecttemplate);
			}
			if (!inviteback.equals("")) {
				Reporter.log("Step 3 - Proceed to Click on ("+inviteback+") Button");
				if (inviteback.equalsIgnoreCase("Invite")) {
					clickWebdriver(attributeName_xpath, IE_InviteBtn);
					alertAccept();
					}else if (inviteback.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, IE_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}

