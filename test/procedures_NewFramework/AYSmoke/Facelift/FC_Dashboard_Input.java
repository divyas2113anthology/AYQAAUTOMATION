package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_Dashboard_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Applicant Welcome' page")
	public void FC_Dashboard_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Welcome' page");
			String[]  applicantwelidatarepo = datacontainer;
			String dashboard_button = applicantwelidatarepo[0];
			String myapplications_button = applicantwelidatarepo[1];
			String event_package = applicantwelidatarepo[2];
			String link_to_click = applicantwelidatarepo[3];
			Reporter.log("Input Test Data was retrieved for 'Applicant Welcome' page");
			writeConsole("Welcome");
			if (!dashboard_button.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+dashboard_button+") Button");
				if (dashboard_button.equalsIgnoreCase("Dashboard")) {
					clickWebdriver(attributeName_xpath, DB_DbBtn);	//DB_DbBtn
					waitForPageToLoadWebdriver();
				}else if (dashboard_button.equalsIgnoreCase("Messages")) {
					clickWebdriver(attributeName_cssselector,DB_MsgBtn);
					waitForPageToLoad();
				}else if (dashboard_button.equalsIgnoreCase("Profile")) {
					clickWebdriver(attributeName_cssselector,DB_ProfBtn);
					waitForPageToLoad();
				}else if (dashboard_button.equalsIgnoreCase("Technical Support")) {
					clickWebdriver(attributeName_cssselector, DB_TecSupportBtn);
					recentPopupSelectWebdriver("Technical Support");
				}else if (dashboard_button.equalsIgnoreCase("Log Out")) {
					clickWebdriver(attributeName_xpath,DB_LogoutBtn);
					waitForPageToLoadWebdriver();
				}			
			}
			if (!myapplications_button.equals("")) {
				Reporter.log("Step 2 - My Application Name ("+myapplications_button+"):");
				if (myapplications_button.equalsIgnoreCase("Application for QA Automation_Start")) {
					waitForElementPresentWebdriver(attributeName_xpath, DB_QaAutomationStartButton, "Start Application");
					clickWebdriver(attributeName_xpath,DB_QaAutomationStartButton);
					waitForElementPresentWebdriver(attributeName_xpath, AW_PageTitle, "Page Title");
				}else if (myapplications_button.equalsIgnoreCase("Application for QA Automation_Edit")){
					waitForElementPresentWebdriver(attributeName_xpath, DB_QaAutomationEditButton, "Search");
					writeConsole("Edit");
					clickWebdriver(attributeName_xpath,DB_QaAutomationEditButton);	
					waitForElementPresentWebdriver(attributeName_xpath, AW_PageTitle, "Page Title");
				}else if (myapplications_button.equalsIgnoreCase("Application2_Start")){
					waitForElementPresentWebdriver(attributeName_xpath, DB_App2StartEditButton, "Start Application");
					clickWebdriver(attributeName_xpath,DB_App2StartEditButton);	
					waitForElementPresentWebdriver(attributeName_xpath, AW_PageTitle, "Page Title");
				}else if (myapplications_button.equalsIgnoreCase("Application2_Edit")){
					waitForElementPresent(DB_App2EditButton, "Edit Application");
					click(DB_App2EditButton);	
					waitForPageToLoad();
				}
			}
//				if (myapplications_name.equalsIgnoreCase("Application for QA Automation")) {
//					Reporter.log("Step 3 - Proceed to Click on ("+myapplications_button+") Button");
//					if (!myapplications_button.equals("")) {
//						if (myapplications_button.equalsIgnoreCase("Start Application")) {
////							waitForElement(DB_QaAutomationStartButton, "Start Application");
//							click(DB_QaAutomationStartButton);
//						}else if (myapplications_button.equalsIgnoreCase("Edit Application")){
//							waitForElement(DB_QaAutomationEditButton, "Edit Application");
//							click(DB_QaAutomationEditButton);					
//						}
//					}
//				}
//		
//			}
			
			if (!event_package.equals("")) {
				
			}
			if (!link_to_click.equals("")) {
				Reporter.log("Step 4 - Click the Link as ("+link_to_click+"):");
				waitForElementPresentWebdriverWait(attributeName_xpath, Applpackage+link_to_click+"')]", link_to_click);
				clickWebdriver(attributeName_xpath, Applpackage+link_to_click+"')]");
				waitForPageToLoadWebdriver();
			}
	
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
