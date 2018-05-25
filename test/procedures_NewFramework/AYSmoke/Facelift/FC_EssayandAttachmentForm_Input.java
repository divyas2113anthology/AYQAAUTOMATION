package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_EssayandAttachmentForm_Input extends CommonSeleniumActions	implements OR {
	

	@Test(description="This Procedure is used to perform some operation in 'Essay and Attachment' page")
	public void FC_EssayandAttachmentForm_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Essay and Attachment' page");
			String[] essayattachidatarepo = datacontainer;
			String shortessay = essayattachidatarepo[0];
			String essaywithattachment = essayattachidatarepo[1];
			String essaywithattachmentuploaddocument = essayattachidatarepo[2];
			String essaywithoutattachment = essayattachidatarepo[3];
			String uploadattachmentonlydocument = essayattachidatarepo[4];
			String uploadmediafile = essayattachidatarepo[5];
			String button_to_click = essayattachidatarepo[6];		
			String pisubmitappbtn = essayattachidatarepo[7];
			Reporter.log("Input Test Data was retrieved for 'Essay and Attachment' page");
			
			if (!shortessay.equals("")) {
				String shortessayID = getElementIDbyLabel("Short Essay", EAI_ShortEssay);
				sendKeys(attributeName_xpath,shortessayID,shortessay);
			}
			if (!essaywithattachment.equals("")) { 
				String essaywithattachmentID = getElementIDbyLabel("Essay with Attachment", EAI_EssaywithAttachment);
				sendKeys(attributeName_xpath,essaywithattachmentID,essaywithattachment);
			}
			if (!essaywithattachmentuploaddocument.equals("")) {
				if (essaywithattachmentuploaddocument.equals("upload document")) {
					clickWebdriver(attributeName_xpath, EAI_EssaywithAttachment_UploadDocument);
					recentPopupSelectWebdriver("File Upload");
				}else if (essaywithattachmentuploaddocument.equals("view document")) {
					clickWebdriver(attributeName_xpath, EAI_EssaywithAttachment_ViewDocument);
					recentPopupSelectWebdriver("view document");
				}else if (essaywithattachmentuploaddocument.equals("delete")) {
					//clickchooseokgetconfirmationpagepload(EAI_EssaywithAttachment_DeleteDocument);
//					chooseOkOnNextConfirmation();
					clickWebdriver(attributeName_xpath,EAI_EssaywithAttachment_DeleteDocument);
//					getConfirmation();
				}
			}
			if (!essaywithoutattachment.equals("")) {
				String essaywithoutattachmentID = getElementIDbyLabel("Essay without Attachment", EAI_EssaywithoutAttachment);
				sendKeys(attributeName_xpath,essaywithoutattachmentID,essaywithoutattachment);
			}
			if (!uploadattachmentonlydocument.equals("")) {
				if (uploadattachmentonlydocument.equals("upload document")) {
					clickWebdriver(attributeName_xpath, EAI_AttachmentOnly_UploadDocument);
					recentPopupSelectWebdriver("File Upload");
//					recentPopupSelect("File Upload");
				}else if (uploadattachmentonlydocument.equals("view document")) {
					clickWebdriver(attributeName_xpath, EAI_AttachmentOnly_ViewDocument);
					recentPopupSelectWebdriver("view document");
				}else if (uploadattachmentonlydocument.equals("delete")) {
//					clickchooseokgetconfirmationpagepload(EAI_AttachmentOnly_DeleteDocument);
//					chooseOkOnNextConfirmation();
					clickWebdriver(attributeName_xpath,EAI_AttachmentOnly_DeleteDocument);
					alertAccept();
//					getConfirmation();
				}
			}

			if (!uploadmediafile.equals("")) {
				if (uploadmediafile.equalsIgnoreCase("Upload File")) {
					clickWebdriver(attributeName_xpath,EAI_MediaAttachment_UploadFile);
//					recentPopupSelect("File Upload");
					recentPopupSelectWebdriver("File Upload");
				}else if (uploadmediafile.equalsIgnoreCase("View File")) {
					clickWebdriver(attributeName_xpath,EAI_MediaAttachment_Viewfile);
					recentPopupSelectWebdriver("View File");
				}else if (uploadmediafile.equalsIgnoreCase("delete")) {
					//clickchooseokgetconfirmationpagepload(EAI_MediaAttachment_Deletefile);
//					chooseOkOnNextConfirmation();
					clickWebdriver(attributeName_xpath,EAI_MediaAttachment_Deletefile);
//					getConfirmation();
				}
			}
			
			if (!button_to_click.equals("")) {
				Reporter.log("Step 10 - Click on ("+button_to_click+")Button");
				if(button_to_click.equalsIgnoreCase("Save")){
					try {
						clickWebdriver(attributeName_xpath, PII_Save);
						waitForPageToLoadWebdriver();
					}catch (Throwable e){
						clickWebdriver(attributeName_xpath, PII_SaveBottom);
						waitForPageToLoadWebdriver();
					}
				}else if (button_to_click.equalsIgnoreCase("Save & Continue")) {
					clickWebdriver(attributeName_xpath,PII_SaveContinue);
				}else if (button_to_click.equalsIgnoreCase("Reset")) {
					clickWebdriver(attributeName_xpath,PII_Reset);
				}else if (button_to_click.equals("close window")) {
					clickWebdriver(attributeName_xpath,EAI_CloseButton);
					selectMainWindowWebdriver();
				}
			}
			if (!pisubmitappbtn.equals("")) {
				Reporter.log("Step 11 - Click on ("+pisubmitappbtn+")Button");
				if (pisubmitappbtn.equalsIgnoreCase("Submit Applicant")) {
					clickWebdriver(attributeName_xpath,AW_SubAppBtn);
				}
			}
	

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
