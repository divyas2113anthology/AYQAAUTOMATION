package procedures_NewFramework.AYSmoke.BridgeEvent;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;
import or.OR;

import org.openqa.selenium.Keys;
import com.thoughtworks.selenium.webdriven.commands.Uncheck;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class BR_InviteToEvent_Inputs extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Invite To Event' page")
	public void BR_InviteToEvent_Inputs () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Invite To Event' page");
			String[]  applicantwelidatarepo = datacontainer;
			String filterlookup = applicantwelidatarepo[0];
			String selectfilter = applicantwelidatarepo[1];
			String selecttemplate = applicantwelidatarepo[2];
			String subject = applicantwelidatarepo[3];
			String invite = applicantwelidatarepo[4];
			Reporter.log("Input Test Data was retrieved for 'Invite To Event' page");
			if (!filterlookup.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+filterlookup+") Link");
				clickWebdriver(attributeName_xpath, IE_FilterLookup);
				recentPopupSelectWebdriver("Lookup");
			}
			if (!selectfilter.equals("")) {
				Reporter.log("Step 2 - Select the Filter as ("+selectfilter+") ");
				waitForElementPresentWebdriver(attributeName_partiallinktext, selectfilter, "Select Filter Link");
				clickWebdriver(attributeName_partiallinktext, selectfilter);
				selectMainWindowWebdriver();
			}
			if (!selecttemplate.equals("")) {
				Reporter.log("Step 3 - Select the Template as ("+selecttemplate+")");
				selectByVisibleTextWithSpaceWebdriver(attributeName_name,IE_SelectTemplate, "regexp:"+selecttemplate);
			}
			if (!subject.equals("")) {
				Reporter.log("Step 4 -Enter the Subject as ("+subject+")");
				sendKeys(attributeName_name, IE_Subject, subject);
			}
			if (!invite.equals("")) {
				Reporter.log("Step 5 - Proceed to Click on ("+invite+") Button");
				clickWebdriver(attributeName_xpath, IE_InviteBtn);
				alertAccept();
				waitForPageToLoadWebdriver();
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}