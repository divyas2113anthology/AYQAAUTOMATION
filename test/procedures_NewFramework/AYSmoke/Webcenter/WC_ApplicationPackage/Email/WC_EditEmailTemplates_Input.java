package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Email;

import or.OR;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EditEmailTemplates_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some input operation in 'Edit Email Template' page")
		public void WC_EditEmailTemplates_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Edit Email Template' page");
			String[]  fpvdatarepo = datacontainer;
			String templatename = fpvdatarepo[0];
			String description = fpvdatarepo[1];
			String emailsender = fpvdatarepo[2];
			String emailfromfield = fpvdatarepo[3];
			String to_email= fpvdatarepo[4];
			String subject = fpvdatarepo[5];
			String message = fpvdatarepo[6];
			String mailmergesection = fpvdatarepo[7];
			String mailmergetag = fpvdatarepo[8];
			String querytag = fpvdatarepo[9];
			String decision = fpvdatarepo[10];
			String filter = fpvdatarepo[11];
			String conditionalmessage = fpvdatarepo[12];
			String clickfiltername = fpvdatarepo[13];
			String customtemplateactive = fpvdatarepo[14];
			String savecancel = fpvdatarepo[15];

			Reporter.log("Verify Test Data was retrieved for 'Edit Email Template' page");
			if (!decision.equals("")) {
				//Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				//sendKeys(attributeName_xpath, AMET_TemplateName, templatename);
				selectByVisibleTextWebdriver(attributeName_xpath, AMET_Decision, decision);
			}
			if (!templatename.equals("")) {
				//Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				sendKeys(attributeName_xpath, AMET_TemplateName, templatename);
			}
			if (!description.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				sendKeys(attributeName_xpath, AMET_Description, description);
			}
			if (!emailsender.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				sendKeys(attributeName_xpath, AMET_EmailSender, emailsender);
			}

			if (!emailfromfield.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				sendKeys(attributeName_xpath, AMET_EmailFrom, emailfromfield);
			}

			if (!to_email.equals("")){
				waitForElementPresentWebdriver(attributeName_xpath,"//input[@id='EmailToOther']",to_email);
				clickWebdriver(attributeName_xpath,"//input[@id='EmailToOther']");
				sendKeys(attributeName_xpath,"//input[@id='TextEmailTo']",to_email);
				clickWebdriver(attributeName_xpath,"//*[@id='DonotsendFlag']");

			}
			if (!subject.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				sendKeys(attributeName_xpath, AMET_Subject, subject);
			}
			if (!message.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				sendKeys(attributeName_xpath, AMET_Message, message);
			}
			if (!mailmergesection.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				//sendKeys(attributeName_xpath, AMET_MailMergeSection, mailmergesection);
				selectByVisibleTextWebdriver(attributeName_xpath , AMET_MailMergeSection, mailmergesection);
				waitForPageToLoadWebdriver();
				//select(AMET_MailMergeSection, mailmergesection);
			}
			if (!mailmergetag.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				//select(AMET_MailMergeTag, mailmergetag);
				waitForPageToLoadWebdriver();
				selectByVisibleTextWebdriver(attributeName_xpath, AMET_MailMergeTag, mailmergetag);
				waitForPageToLoadWebdriver();

			}
			if (!querytag.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				//String query=selenium.getValue(AMET_QueryTag);
				String query = driver.findElement(By.xpath(AMET_QueryTag)).getText();
				System.out.println(query);
				if(mailmergetag.equals("Payment Status")){
					query = "<ay:tag type=\"MM\" id=\"pmtStatus\" name=\"Payment Status\"/>";
				}
				sendKeys(attributeName_xpath, AMET_Message,message+" "+query+"\n\n This is for testing purpose. \n\n Thanks, \n Tester");

			}

			if (!filter.equals("")) {
				Reporter.log("Click on Filter button");
				clickWebdriver(attributeName_xpath, WC_AddDelMoveToFolder+filter+"')]");
				waitForPageToLoadWebdriver();
			}
			if (!clickfiltername.equals("")) {
				Reporter.log("Click on the Filter Name");
				clickWebdriver(attributeName_xpath, CDT_FilterName+clickfiltername+"')]");
				waitForPageToLoadWebdriver();
			}
			if (!customtemplateactive.equals("")) {
				Reporter.log("Step 14 - Check the check box for CustomTemplateActive");

				waitForElementPresentWebdriverWait(attributeName_xpath, AMET_CustomTemplateCheckbox+customtemplateactive+"']", customtemplateactive);
				clickWebdriver(attributeName_xpath, AMET_CustomTemplateCheckbox+customtemplateactive+"']");
				alertAccept();
				Thread.sleep(1000);

			}
			if (!savecancel.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				waitForElementPresentWebdriver(attributeName_xpath, WC_AddDelMoveToFolder+savecancel+"')]",savecancel);
				clickWebdriver(attributeName_xpath, WC_AddDelMoveToFolder+savecancel+"')]");
			}


		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}