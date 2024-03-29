package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class EssayandAttachmentForm_Input extends CommonSeleniumActions	implements OR {
	

	@Test(description="This Procedure is used to perform some operation in 'Essay and Attachment' page")
	public void EssayandAttachmentForm_Input(){
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
			String save = essayattachidatarepo[6];		
			Reporter.log("Input Test Data was retrieved for 'Essay and Attachment' page");
			
			if (!shortessay.equals("")) {
				waitForPageToLoadWebdriver();
				String shortessayID = getElementIDbyLabel("Short Essay", EA_ShortEssay);
				sendKeys(attributeName_xpath,shortessayID,shortessay);
			}
			if (!essaywithattachment.equals("")) { 
				waitForPageToLoadWebdriver();
				String essaywithattachmentID = getElementIDbyLabel("Essay with Attachment", EA_EssaywithAttachment);
				sendKeys(attributeName_xpath,essaywithattachmentID,essaywithattachment);
			}
			if (!essaywithattachmentuploaddocument.equals("")) {
				if (essaywithattachmentuploaddocument.equals("upload document")) {
					waitForElementPresentWebdriver(attributeName_xpath, EAI_EssaywithAttachment_UploadDocument, essaywithattachmentuploaddocument);
					clickWebdriver(attributeName_xpath, EAI_EssaywithAttachment_UploadDocument);
					recentPopupSelectWebdriver("File Upload");
				}else if (essaywithattachmentuploaddocument.equals("view document")) {
					waitForElementPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument, essaywithattachmentuploaddocument);
					clickWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument);
					recentPopupSelectWebdriver("view document");
					waitForPageToLoadWebdriver();
				}
				else if (essaywithattachmentuploaddocument.equalsIgnoreCase("close")) {
					waitForPageToLoadWebdriver();
					recentPopupCloseWebdriver();
				}
				else if (essaywithattachmentuploaddocument.equals("delete")) {
					waitForElementPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_DeleteDocument, essaywithattachmentuploaddocument);
					clickWebdriver(attributeName_xpath, EA_EssaywithAttachment_DeleteDocument);
					alertAccept();
					waitForElementPresentWebdriver(attributeName_xpath,EA_EssaywithAttachment_UploadDocument, "Upload Document");
				}
			}
			if (!essaywithoutattachment.equals("")) {
				String essaywithoutattachmentID = getElementIDbyLabel("Essay without Attachment", EA_EssaywithoutAttachment);
				sendKeys(attributeName_xpath,essaywithoutattachmentID,essaywithoutattachment);
			}
			if (!uploadattachmentonlydocument.equals("")) {
				if (uploadattachmentonlydocument.equals("upload document")) {
					waitForElementPresentWebdriver(attributeName_xpath, EAI_AttachmentOnly_UploadDocument, uploadattachmentonlydocument);
					clickWebdriver(attributeName_xpath, EAI_AttachmentOnly_UploadDocument);
					recentPopupSelectWebdriver("File Upload");
				}else if (uploadattachmentonlydocument.equals("view document")) {
					waitForElementPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_ViewDocument, uploadattachmentonlydocument);
					clickWebdriver(attributeName_xpath, EA_AttachmentOnly_ViewDocument);
//					recentPopupSelectWebdriver("view document");
//					Runtime.getRuntime().exec("T:/WebProducts/QA/SeleniumScripts/AY/AutoIT/PdfClose/ViewDocPdf.exe");
				}else if (uploadattachmentonlydocument.equals("delete")) {
//					clickchooseokgetconfirmationpagepload(EA_AttachmentOnly_DeleteDocument);
//					chooseOkOnNextConfirmation();
					waitForElementPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_DeleteDocument, uploadattachmentonlydocument);
					clickWebdriver(attributeName_xpath, EA_AttachmentOnly_DeleteDocument);
//					getConfirmation();
					alertAccept();
				}
			}

			if (!uploadmediafile.equals("")) {
				if (uploadmediafile.equalsIgnoreCase("Upload File")) {
					waitForElementPresentWebdriver(attributeName_xpath, EAI_MediaAttachment_UploadFile, uploadmediafile);
					clickWebdriver(attributeName_xpath,EAI_MediaAttachment_UploadFile);
					recentPopupSelectWebdriver("File Upload");
				}else if (uploadmediafile.equalsIgnoreCase("View File")) {
					waitForElementPresentWebdriver(attributeName_xpath, EAI_MediaAttachment_UploadFile, uploadmediafile);
					clickWebdriver(attributeName_xpath, EA_MediaAttachment_Viewfile);
//					recentPopupSelectWebdriver("View File");
//					Runtime.getRuntime().exec("T:/WebProducts/QA/SeleniumScripts/AY/AutoIT/PdfClose/ViewDocPdf.exe");
				}else if (uploadmediafile.equalsIgnoreCase("delete")) {
//					clickchooseokgetconfirmationpagepload(EA_MediaAttachment_Deletefile);
//					chooseOkOnNextConfirmation();
					clickWebdriver(attributeName_xpath, EA_MediaAttachment_Deletefile);
//					getConfirmation();
					alertAccept();
				}

			}
			if (!save.equals("")) {
				if (save.equalsIgnoreCase("Save")) {
					waitForElementPresentWebdriver(attributeName_xpath, EA_Save, save);
					clickWebdriver(attributeName_xpath, EA_Save);
					waitForPageToLoadWebdriver();
				} else if (save.equalsIgnoreCase("Save & Continue")) {
					clickWebdriver(attributeName_xpath, EA_SaveandContinue);
					waitForPageToLoadWebdriver();
				}else if (save.equalsIgnoreCase("Reset")) {
					clickWebdriver(attributeName_xpath, EA_Reset);
				}else if (save.equalsIgnoreCase("close window")) {
					clickWebdriver(attributeName_xpath, EA_CloseButton);
//					selectMainWindow();	
					selectMainWindowWebdriver();
				}else if (save.equalsIgnoreCase("closewindow")) {
					waitForElementPresentWebdriver(attributeName_xpath, EA_CloseWindow, "Close Window");
					clickWebdriver(attributeName_xpath, EA_CloseWindow);
					selectMainWindowWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
