package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_Application2Welcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Applicant Welcome' page")
	public void FC_Application2Welcome_Input () throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Welcome' page");
			String[]  applicantwelidatarepo = datacontainer;
			String link_to_click = applicantwelidatarepo[0];
			String button_to_click = applicantwelidatarepo[1];
			Reporter.log("Input Test Data was retrieved for 'Applicant Welcome' page");
	//		selectMainWindow();
			if (!button_to_click.equals("")) {
				if (button_to_click.equalsIgnoreCase("Start Application")) {
					click(AW_StartAppBtn);
					waitForPageToLoad();
				}else if (button_to_click.equalsIgnoreCase("Messages")) {
					click(AW_AppInstBtn);
					waitForPageToLoad();
				}else if (button_to_click.equalsIgnoreCase("Profile")) {
					click(AW_SubAppBtn);
					waitForPageToLoad();
				}
			}
			
			if (!link_to_click.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+link_to_click+") Link");
				if (link_to_click.equalsIgnoreCase("Application2")) {
					click(AW_App2Lnk);
					waitForPageToLoad();
				}else if (link_to_click.equalsIgnoreCase("Virginia")) {
//					waitForElement(AW_VirginiaLnk, "Virginia Link");
					click(AW_VirginiaLnk);
					waitForPageToLoad();
				}else if (link_to_click.equalsIgnoreCase("Fa1rfax")) {
//					waitForElement(AW_Fa1rfaxLnk, "Fa1rfax Link");
					click(AW_Fa1rfaxLnk);
					waitForPageToLoad();
				}
			}
	
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
