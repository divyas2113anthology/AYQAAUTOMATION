package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.openqa.selenium.Keys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class ApplicantWelcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Applicant Welcome' page")
	public void ApplicantWelcome_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Welcome' page");
			String[]  applicantwelidatarepo = datacontainer;
			String logout = applicantwelidatarepo[0];
			String updatetechsupport = applicantwelidatarepo[1];
			String applicantsection = applicantwelidatarepo[2];
			String helpfulhints = applicantwelidatarepo[3];
			String print = applicantwelidatarepo[4];
			String applicationhome = applicantwelidatarepo[5];
			Reporter.log("Input Test Data was retrieved for 'Applicant Welcome' page");
			if (!logout.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+logout+") Link");
				click(Logoutmain+logout+"']");
				waitForPageToLoad();
			}
			if (!updatetechsupport.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+updatetechsupport+") Button");
				if (updatetechsupport.equalsIgnoreCase("Home")) {
					waitForElementPresentWebdriver(attributeName_xpath,AW_Home, updatetechsupport);
					clickWebdriver(attributeName_xpath, AW_Home);
					waitForPageToLoad();
				}else if (updatetechsupport.equalsIgnoreCase("Technical Support")) {
					waitForElementPresentWebdriver(attributeName_xpath, AW_TecSupp, updatetechsupport);
					clickWebdriver(attributeName_xpath, AW_TecSupp);
					recentPopupSelectWebdriver("Technical Support");
//					alertAccept();
				}else if (updatetechsupport.equalsIgnoreCase("Update your Profile")) {
//					sendKeyStroke(attributeName_xpath, UpdateProfileBtn, Keys.SPACE);
//					sendKeyStroke(attributeName_xpath, "xpath=(//img[@alt='Update your Profile' and contains(@src,'update_profile_o.gif')])[1]", Keys.SPACE);
					waitForElementPresentWebdriver(attributeName_xpath, AW_Profile, updatetechsupport);
					clickWebdriver(attributeName_xpath, AW_Profile);
					recentPopupSelectWebdriver("Update Profile");
				}else if (updatetechsupport.equalsIgnoreCase("Submit")) {
					waitForElementPresentWebdriver(attributeName_xpath, AW_Submit, updatetechsupport);
					clickWebdriver(attributeName_xpath,AW_Submit);
					waitForPageToLoadWebdriver();
				}
			}
			if (!applicantsection.equals("")) {
				Reporter.log("Step 3 - Proceed to Click on Applicant Section ("+applicantsection+") Link");
				click(Section+applicantsection+"']");
				waitForPageToLoad();			
			}
			if (!helpfulhints.equals("")) {
				Reporter.log("Step 4 - Proceed to Click on ("+helpfulhints+") in the 'Helpful Hints' Section");
//				click(helphint+helpfulhints+"']");
				clickWebdriver(attributeName_linktext, helpfulhints);
				recentPopupSelectWebdriver(helpfulhints);
			}
			if (!print.equals("")) {
				Reporter.log("Step 5 - Proceed to Click on ("+print+") Button");
				if (print.equalsIgnoreCase("print")) {
					click(PrintBtn+print+"']");
					recentPopupSelect("Print");
				}			
			}
			if (!applicationhome.equals("")) {
				Reporter.log("Step 6 - Proceed to Click on ("+applicationhome+") Link");
				if (applicationhome.equalsIgnoreCase("Application Home")) {
					click(updatelink+applicationhome+"']");
					waitForPageToLoad();
				}else if (applicationhome.equalsIgnoreCase("Technical Support")) {
					click(updatelink+applicationhome+"']");
					recentPopupSelect("Technical Support");
				}else if (applicationhome.equalsIgnoreCase("Update Profile")) {
					click(updatelink+applicationhome+"']");
					recentPopupSelect("Update Profile");
				}else if (applicationhome.equalsIgnoreCase("Logout")) {
					click(updatelink+applicationhome+"']");
					waitForPageToLoad();
				}
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
