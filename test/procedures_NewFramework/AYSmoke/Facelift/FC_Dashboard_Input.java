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
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Welcome' page");
			String[]  applicantwelidatarepo = datacontainer;
			String dashboard_button = applicantwelidatarepo[0];
			String myapplications_button = applicantwelidatarepo[1];
			String event_package = applicantwelidatarepo[2];
			String link_to_click = applicantwelidatarepo[3];
			Reporter.log("Input Test Data was retrieved for 'Applicant Welcome' page");
	//		selectMainWindow();
						
			if (!dashboard_button.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+dashboard_button+") Button");
				if (dashboard_button.equalsIgnoreCase("Dashboard")) {
					click(DB_DbBtn);
					waitForPageToLoad();
				}else if (dashboard_button.equalsIgnoreCase("Messages")) {
					click(DB_MsgBtn);
					waitForPageToLoad();
				}else if (dashboard_button.equalsIgnoreCase("Profile")) {
					click(DB_ProfBtn);
					waitForPageToLoad();
				}else if (dashboard_button.equalsIgnoreCase("Technical Support")) {
					clickWebdriver(attributeName_cssselector, DB_TecSupportBtn);
					recentPopupSelectWebdriver("Technical Support");
//					waitForUniqueNameWindow();
				}else if (dashboard_button.equalsIgnoreCase("Log Out")) {
					click(DB_LogoutBtn);
//					waitForPageToLoad();
//					waitForElementPresent(LV_LogoutMsg, "Sucessfully Logout");
					waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='ay-login-text']/h2", "Sucessfully Logout");
				}			
			}
			if (!myapplications_button.equals("")) {
				Reporter.log("Step 2 - My Application Name ("+myapplications_button+"):");
				if (myapplications_button.equalsIgnoreCase("Application for QA Automation_Start")) {
					waitForElementPresentWebdriver(attributeName_xpath, DB_QaAutomationStartButton, "Start Application");
					click(DB_QaAutomationStartButton);
					waitForElementPresent(AW_PageTitle, "Page Title");
//					Reporter.log("Call AutoIT script to close Google window");
//					Runtime.getRuntime().exec("T:/WebProducts/QA/SeleniumScripts/AY/AutoIT/CloseWindows/GoogleFacelift.exe");
				}else if (myapplications_button.equalsIgnoreCase("Application for QA Automation_Edit")){
//					waitForElement(DB_QaAutomationEditButton, "Edit Application");
					click(DB_QaAutomationEditButton);	
					waitForElementPresent(AW_PageTitle, "Page Title");
//					}else if (myapplications_button.equalsIgnoreCase("Application for QA Automation_View")){
//					waitForElement(DB_QaAutomationViewButton, "View Application");
//					click(DB_QaAutomationViewButton);					
				}else if (myapplications_button.equalsIgnoreCase("Application2_Start")){
//						waitForElement(DB_App2StartButton, "Start Application");
					waitForElementPresentWebdriver(attributeName_xpath, DB_App2StartButton, "Start Application");
					click(DB_App2StartButton);	
//						waitForPageToLoad();
					waitForElementPresent(AW_PageTitle, "Page Title");
//					Reporter.log("Call AutoIT script to close Google window");
//					Runtime.getRuntime().exec("T:/WebProducts/QA/SeleniumScripts/AY/AutoIT/CloseWindows/GoogleFacelift.exe");
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
				
			}
	
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
