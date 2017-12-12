package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;

public class WC_ApplicantSummary_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Applicant Summary' page")
	public void WC_ApplicantSummary_Input()throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Summary' Page");
			String[] testdata = datacontainer;
			String subscribed = testdata[0];
			String inprocessstatus = testdata[1];
			String inprocessstatuspublishdate = testdata[2];
			String statuspublishdate = testdata[3];
			String decision = testdata[4];
			String decisionreason = testdata[5];
			String decisiondate = testdata[6];
			String decisionpublishdate = testdata[7];
			String enrollmentdeadlinedate = testdata[8];
			String viewfullapplication = testdata[9];
			String supportingdocuments = testdata[10];
			String completestatus = testdata[11];
			String enrollment = testdata[12];
			String buttons = testdata[13];
			String view = testdata[14];
			String closewindow = testdata[15];
			String UnsubmitApplicant = testdata[16];
			Reporter.log("Input Test Data was retrieved for 'Applicant Summary' Page");
			
			//AppSummaryWindowName = driver.getWindowHandle();
			//driver.navigate().refresh();
			//waitForPageToLoadWebdriver();
			if (!subscribed.equals("")) {
				Reporter.log("Step 1 - Click the subscription status as ["+subscribed+"]");
				waitForElementPresentWebdriver(attributeName_linktext, subscribed, subscribed);
				clickWebdriver(attributeName_linktext, subscribed);
			}	
			if (!inprocessstatus.equals("")) {
				Reporter.log("Step 2 - Select the Inprocess status as ["+inprocessstatus+"]");
				waitForElementPresentWebdriver(attributeName_xpath, AS_InprocessStatus, "In Process Status");
				//selectByValueWebdriver(attributeName_xpath, AS_InprocessStatus, inprocessstatus);
				selectByVisibleTextWebdriver(attributeName_xpath, AS_InprocessStatus, inprocessstatus);
			}
			if (!inprocessstatuspublishdate.equals("")) {
				Reporter.log("Step 3 - Select the Inprocess status Publish Date as ["+inprocessstatuspublishdate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String publishdate = requiredDateAndFormat("dd/MM/yyyy", inprocessstatuspublishdate);
					sendKeys(attributeName_xpath, AS_InprocessStatusDate, publishdate);
				}else{
				String publishdate = requiredDateAndFormat("MM/dd/yyyy", inprocessstatuspublishdate);
				sendKeys(attributeName_xpath, AS_InprocessStatusDate, publishdate);
				}
			}
			if (!statuspublishdate.equals("")) {
				Reporter.log("Step 4 - Select the Inprocess status as ["+statuspublishdate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String StatusPublishdate = requiredDateAndFormat("dd/MM/yyyy", statuspublishdate);
					sendKeys(attributeName_xpath, AS_StatusPublishDate, StatusPublishdate);
				}else{
				String StatusPublishdate = requiredDateAndFormat("MM/dd/yyyy", statuspublishdate);
				sendKeys(attributeName_xpath, AS_StatusPublishDate, StatusPublishdate);
				}
			}
			if (!decision.equals("")) {
				Reporter.log("Step 5 - Select the Decision as ["+decision+"]");
				selectByValueWebdriver(attributeName_name, "Decision", decision);
			}
			if (!decisionreason.equals("")) {
				Reporter.log("Step 6 - Select the Decision Reason as ["+decisionreason+"]");
				selectByVisibleTextWithSpaceWebdriver(attributeName_name, "DecisionReason", decisionreason);
//				selectByValueWebdriver(attributeName_name, "DecisionReason", decisionreason);
			}
			if (!decisiondate.equals("")) {
				Reporter.log("Step 7 - Enter the Decision Date as ["+decisiondate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String DecisionDate = requiredDateAndFormat("dd/MM/yyyy", decisiondate);
					sendKeys(attributeName_xpath, AS_DecisionDate, DecisionDate);
				}else{
				String DecisionDate = requiredDateAndFormat("MM/dd/yyyy", decisiondate);
				sendKeys(attributeName_xpath, AS_DecisionDate, DecisionDate);
				}
			}
			if (!decisionpublishdate.equals("")) {
				Reporter.log("Step 8 - Enter the Decision Publish Date as ["+decisionpublishdate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String DecisionPublishDate = requiredDateAndFormat("dd/MM/yyyy", decisionpublishdate);
					sendKeys(attributeName_xpath, AS_DecisionPublishDate, DecisionPublishDate);
				}else{
					String DecisionPublishDate = requiredDateAndFormat("MM/dd/yyyy", decisionpublishdate);
					sendKeys(attributeName_xpath, AS_DecisionPublishDate, DecisionPublishDate);
				}
			}
			if (!enrollmentdeadlinedate.equals("")) {
				Reporter.log("Step 9 - Enter the Enrollment Dead Line Date as ["+enrollmentdeadlinedate+"]");
				environment = Runtimedataread("Instance");
				if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
					String EnrollmentDeadlineDate = requiredDateAndFormat("dd/MM/yyyy", enrollmentdeadlinedate);
					sendKeys(attributeName_xpath, AS_EnrolmentDeadLineDate, EnrollmentDeadlineDate);
				}else{
					String EnrollmentDeadlineDate = requiredDateAndFormat("MM/dd/yyyy", enrollmentdeadlinedate);
					sendKeys(attributeName_xpath, AS_EnrolmentDeadLineDate, EnrollmentDeadlineDate);
				}
			}
			if (!viewfullapplication.equals("")) {
				Reporter.log("Step 10 - Click the View Full Application as ["+viewfullapplication+"]");
				String[] Splitviwefullapp = viewfullapplication.split(";");
				for (int i = 0; i < Splitviwefullapp.length; i++) {
					waitForElementPresentWebdriver(attributeName_linktext, Splitviwefullapp[i], viewfullapplication);
					clickWebdriver(attributeName_linktext, Splitviwefullapp[i]);
					waitForPageToLoadWebdriver();
				}
				waitForPageToLoadWebdriver();
				recentPopupSelectWebdriver("Application Form3");
//				int WindowCount = getWindowHandles();
//				recentMultiplePopupSelectWebdriver("Application Form3", WindowCount);
//				if (viewfullapplication.equalsIgnoreCase("Applicant Detail")) {
//					clickWebdriver(attributeName_linktext, viewfullapplication);
//				} else if (viewfullapplication.equalsIgnoreCase("Application Form3")){
//					clickWebdriver(attributeName_linktext, viewfullapplication);
//				}
			}
			if (!supportingdocuments.equals("")) {
				Reporter.log("Step 11 - Click the SUpporting Document as ["+supportingdocuments+"]");
				//clickWebdriver(attributeName_linktext, supportingdocuments);
				//recentPopupSelect_without_window_nameWebdriver();
				String[] splitsupport = supportingdocuments.split(";");
				System.out.println("String1"+splitsupport[0]);
				waitForPageToLoadWebdriver();
				for (int i = 0; i < splitsupport.length; i++) {

					waitForPageToLoadWebdriver();
					Thread.sleep(1000);
					switchToDefaultContentWebdriver();
					if (splitsupport[i].equals("Standardized Test Scores")) {
						waitForElementPresentWebdriver(attributeName_xpath, "//a[contains(text(),'" + splitsupport[i] + "')]", splitsupport[i]);
						Thread.sleep(5000);
						clickWebdriver(attributeName_xpath, "//a[text()='" + splitsupport[i] + "']");
					} else {



						//waitForElementPresentWebdriver(attributeName_xpath, "//a[text()='" + splitsupport[i] + "']", splitsupport[i]);

						waitForElementPresentWebdriver(attributeName_xpath, "//a[contains(text(),'" + splitsupport[i] + "')]", splitsupport[i]);

						Thread.sleep(5000);
						clickWebdriver(attributeName_partiallinktext, splitsupport[i]);
						waitForPageToLoadWebdriver();
						//clickWebdriver(attributeName_xpath,"//a[text()='Recommendation-DT']");
						recentPopupSelectWebdriver("Application Fee");


					}
				}
				//recentPopupSelectWebdriver("Supporting Document");
//				if (supportingdocuments.equalsIgnoreCase("Application Fee")) {
//					clickWebdriver(attributeName_linktext, supportingdocuments);
//				} else if (supportingdocuments.equalsIgnoreCase("Recommendation-Shiva")){
//					clickWebdriver(attributeName_linktext, supportingdocuments);
//				} else if (supportingdocuments.equalsIgnoreCase("Standardized Test Scores")){
//					clickWebdriver(attributeName_linktext, supportingdocuments);
//				} else if (supportingdocuments.equalsIgnoreCase("Transcripts")){
//					clickWebdriver(attributeName_linktext, supportingdocuments);
//				} else if (supportingdocuments.equalsIgnoreCase("Other Supporting Documents")){
//					clickWebdriver(attributeName_linktext, supportingdocuments);
//				}
			}
			if (!completestatus.equals("")) {
				Reporter.log("Step 12 - Check the Complete Status as ["+completestatus+"]");
				String [] SplitStatus = completestatus.split("_");
				if (SplitStatus[0].equalsIgnoreCase("Application Fee") && SplitStatus[1].equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, AS_ApplicationFee);
				} else if (SplitStatus[0].equalsIgnoreCase("Application Fee") && SplitStatus[1].equalsIgnoreCase("UnCheck")) {
					uncheckWebdriverCheckbox(attributeName_xpath, AS_ApplicationFee);
				}else if (SplitStatus[0].equalsIgnoreCase(" Transcripts") && SplitStatus[1].equalsIgnoreCase("Check")) {
					checkWebdriverCheckbox(attributeName_xpath, AS_Transcripts);
				} else if (SplitStatus[0].equalsIgnoreCase(" Transcripts") && SplitStatus[1].equalsIgnoreCase("UnCheck")) {
					uncheckWebdriverCheckbox(attributeName_xpath, AS_Transcripts);
				}
			}
			if (!enrollment.equals("")) {
				
			}
			if (!buttons.equals("")) {
				Reporter.log("Step 13 - Check the Name of the Button as ["+buttons+"]");
				if (buttons.equalsIgnoreCase("Save")) 
				{
					clickWebdriver(attributeName_xpath, AS_SaveBtn);
					waitForElementPresentWebdriver(attributeName_xpath, AS_CloseWindow, "Close Window");
					recentPopupCloseWebdriver();
//					selectMainWindowWebdriver();
				}else if (buttons.equalsIgnoreCase("Close Window") || buttons.equalsIgnoreCase("close_window"))
				{
					//waitForElementPresentWebdriver(attributeName_xpath, AS_CloseWindow, "Close Window");
					System.out.println("out");

					//clickWebdriver(attributeName_xpath, AS_CloseWindow);
					//driver.manage().deleteAllCookies();
					//driver.switchTo().window(ApplicationPage);
					recentPopupCloseWebdriver();
					//selectMainWindowWebdriver();
				}else if (buttons.equalsIgnoreCase("Close")) 
				{
					waitForElementPresentWebdriver(attributeName_xpath, AS_CloseWindow, "Close Window");
					clickWebdriver(attributeName_xpath, AS_CloseWindow);
					deselectPopUp();
					System.out.println("1st popup closed");
					recentPopupSelect("Applicant Summary");
					clickWebdriver(attributeName_xpath, AS_CloseWindow);
					deselectPopUp();	
					System.out.println("2nd popup closed");
				}else if (buttons.equalsIgnoreCase("print")) {
					clickWebdriver(attributeName_xpath, AS_PrintApplicationBtn);
					recentPopupSelectWebdriver("Application Printing");
				}else if (buttons.equalsIgnoreCase("Application Fee")) {
					clickWebdriver(attributeName_xpath, AS_AppFee);
					recentPopupSelectWebdriver("Application Printing");	
				}
			
			}
			if(!view.equals("")){
				waitForElementPresentWebdriver(attributeName_xpath, AS_ViewDetailes+view+"')]", "View");
				clickWebdriver(attributeName_xpath, AS_ViewDetailes+view+"')]");
				recentPopupSelectWebdriver("View");
			}
			if (!closewindow.equals("")){
				Reporter.log("Step 15 - Check the Name of the Button as ["+closewindow+"]");
				if (closewindow.equalsIgnoreCase("closewindow")) {

					waitForElementPresentWebdriver(attributeName_xpath, AS_CloseWindow, "Close Window");
					System.out.println("out");
					//clickWebdriver(attributeName_xpath, AS_CloseWindow);
					//driver.manage().deleteAllCookies();
					//driver.switchTo().window(ApplicationPage);
					recentPopupCloseWebdriver();
					//selectMainWindowWebdriver();
				}
			}
			if(!UnsubmitApplicant.equals("")){
				Reporter.log("Step 16 - Procedd to click the link  ["+UnsubmitApplicant+"] to un-submit the applicant");
				waitForPageToLoadWebdriver();
				switchToSecondPopupWindow();
				waitForElementPresentWebdriver(attributeName_xpath, AS_UnSubmit,UnsubmitApplicant);
				clickWebdriver(attributeName_xpath, AS_UnSubmit);
				alertAccept();
				switchToOldWindow();
				//recentPopupClose();
			}




		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

