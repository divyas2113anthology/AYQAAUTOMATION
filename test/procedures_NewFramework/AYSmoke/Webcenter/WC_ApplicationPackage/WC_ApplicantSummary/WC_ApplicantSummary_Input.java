package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.WindowMaximize;
import org.testng.Reporter;
import org.testng.annotations.Test;


import or.OR;
import processor.CommonSeleniumActions;

public class WC_ApplicantSummary_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Applicant Summary' page")
	public void WC_ApplicantSummary_Input(){
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
			Reporter.log("Input Test Data was retrieved for 'Applicant Summary' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
//			driver.manage().window().maximize();
			if (!subscribed.equals("")) {
				Reporter.log("Step 1 - Click the subscription status as ["+subscribed+"]");
				clickWebdriver(attributeName_linktext, subscribed);
			}	
			if (!inprocessstatus.equals("")) {
				Reporter.log("Step 2 - Select the Inprocess status as ["+inprocessstatus+"]");
				waitForElementPresentWebdriver(attributeName_xpath, AS_InprocessStatus, "In Process Status");
				selectByValueWebdriver(attributeName_xpath, AS_InprocessStatus, inprocessstatus);
			}
			if (!inprocessstatuspublishdate.equals("")) {
				Reporter.log("Step 3 - Select the Inprocess status Publish Date as ["+inprocessstatuspublishdate+"]");
				String publishdate = requiredDateAndFormat("MM/dd/yyyy", inprocessstatuspublishdate);
				sendKeys(attributeName_xpath, AS_InprocessStatusDate, publishdate);
			}
			if (!statuspublishdate.equals("")) {
				Reporter.log("Step 4 - Select the Inprocess status as ["+statuspublishdate+"]");
				String StatusPublishdate = requiredDateAndFormat("MM/dd/yyyy", statuspublishdate);
				sendKeys(attributeName_xpath, AS_StatusPublishDate, StatusPublishdate);
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
				String DecisionDate = requiredDateAndFormat("MM/dd/yyyy", decisiondate);
				sendKeys(attributeName_xpath, AS_DecisionDate, DecisionDate);
			}
			if (!decisionpublishdate.equals("")) {
				Reporter.log("Step 8 - Enter the Decision Publish Date as ["+decisionpublishdate+"]");
				String DecisionPublishDate = requiredDateAndFormat("MM/dd/yyyy", decisionpublishdate);
				sendKeys(attributeName_xpath, AS_DecisionPublishDate, DecisionPublishDate);
			}
			if (!enrollmentdeadlinedate.equals("")) {
				Reporter.log("Step 9 - Enter the Enrollment Dead Line Date as ["+enrollmentdeadlinedate+"]");
				String EnrollmentDeadlineDate = requiredDateAndFormat("MM/dd/yyyy", enrollmentdeadlinedate);
				sendKeys(attributeName_xpath, AS_EnrolmentDeadLineDate, EnrollmentDeadlineDate);
			}
			if (!viewfullapplication.equals("")) {
				Reporter.log("Step 10 - Click the View Full Application as ["+viewfullapplication+"]");
				String[] Splitviwefullapp = viewfullapplication.split(";");
				for (int i = 0; i < Splitviwefullapp.length; i++) {
					clickWebdriver(attributeName_linktext, Splitviwefullapp[i]);
				}
				recentPopupSelectWebdriver("Application Form3");
//				if (viewfullapplication.equalsIgnoreCase("Applicant Detail")) {
//					clickWebdriver(attributeName_linktext, viewfullapplication);
//				} else if (viewfullapplication.equalsIgnoreCase("Application Form3")){
//					clickWebdriver(attributeName_linktext, viewfullapplication);
//				}
			}
			if (!supportingdocuments.equals("")) {
				Reporter.log("Step 11 - Click the SUpporting Document as ["+supportingdocuments+"]");
				clickWebdriver(attributeName_linktext, supportingdocuments);
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
				if (buttons.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AS_SaveBtn);
					waitForPageToLoad();
//					selectMainWindowWebdriver();
				}else if (buttons.equalsIgnoreCase("Close Window")) {
					waitForElementPresentWebdriver(attributeName_xpath, AS_CloseWindow, "Close Window");
					clickWebdriver(attributeName_xpath, AS_CloseWindow);
					selectMainWindowWebdriver();
				}else if (buttons.equalsIgnoreCase("Print Application")) {
					clickWebdriver(attributeName_xpath, AS_PrintApplicationBtn);
					recentPopupSelectWebdriver("Application Printing");
				}	
				
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

