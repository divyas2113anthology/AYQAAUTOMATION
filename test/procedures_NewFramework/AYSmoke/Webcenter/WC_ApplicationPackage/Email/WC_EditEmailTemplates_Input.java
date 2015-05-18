package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Email;

import or.OR;

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
			String subject = fpvdatarepo[4];
			String message = fpvdatarepo[5];
			String mailmergesection = fpvdatarepo[6];
			String mailmergetag = fpvdatarepo[7];
			String querytag = fpvdatarepo[8];
			String savecancel = fpvdatarepo[9];
			String decision = fpvdatarepo[10];
						
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
				//select(AMET_MailMergeSection, mailmergesection);
			}
			if (!mailmergetag.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				//select(AMET_MailMergeTag, mailmergetag);
				selectByVisibleTextWebdriver(attributeName_xpath, AMET_MailMergeTag, mailmergetag);
				
			}
			if (!querytag.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				wait(1000);
				System.out.println("aaaaaaaaaaaaaaaaaaaaa");
				String query=selenium.getValue(AMET_QueryTag);
				System.out.println(query);
				sendKeys(attributeName_xpath, AMET_Message,message+" "+query+"\n\n This is for testing purpose. \n\n Thanks, \n Tester");
				
			}
			if (!savecancel.equals("")) {
				//Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				clickWebdriver(attributeName_xpath, WC_AddDelMoveToFolder+savecancel+"')]");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}