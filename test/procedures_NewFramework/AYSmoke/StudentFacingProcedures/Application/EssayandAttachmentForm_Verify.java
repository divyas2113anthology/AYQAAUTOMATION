package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.w3c.dom.ls.LSException;

import or.OR;
import processor.CommonSeleniumActions;

public class EssayandAttachmentForm_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verification in 'Essay and Attachment' page")
	public void EssayandAttachmentForm_Verify(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Essay and Attachment' Page");
			String[] testdata = datacontainer;
			String success = testdata[0];
			String pagename = testdata[1];
			String verifyui = testdata[2];
			String shortessay = testdata[3];
			String essaywithattachmentuploaddocumentpresent = testdata[4];
			String essaywithattachmentuploaddocumentnotpresent = testdata[5];
			String essaywithattachment = testdata[6];
			String essaywithoutattachment = testdata[7];
			String uploadattachmentonlydocumentpresent = testdata[8];
			String uploadattachmentonlydocumentnotpresent = testdata[9];
			String uploadmediafilepresent = testdata[10];
			String uploadmediafilenotpresent = testdata[11];			
			Reporter.log("Verify Test Data was retrieved for 'Essay and Attachment' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!success.equals("")) {
				Reporter.log("Step 1 - Verify Success Message ["+success+"]");
				verifyElementVisible(EA_SuccessMessage+success+"']","Success Message["+success+"]");

			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify Page Name as["+pagename+"]");
				verifyElementTextWebdriver(attributeName_cssselector,EA_SectionName, pagename, "Section Name");

			}
			if (!verifyui.equals("")) {
				Reporter.log("Step 3 - ");
				

			}
			if (!shortessay.equals("")) {
				Reporter.log("Step 4 - Verify Short Essay as ["+shortessay+"]");
				String shortessayID = getElementIDbyLabel("Short Essay", EA_ShortEssay);					
//				verifyElementText(shortessayID, shortessay, "Short Essay");
				waitForElementPresentWebdriver(attributeName_xpath,shortessayID, shortessay);
				verifyElementValueWebdriver(attributeName_xpath,shortessayID, shortessay, shortessay);

			}
			if (!essaywithattachmentuploaddocumentpresent.equals("")) {
				Reporter.log("Step 5 - Verify Button["+essaywithattachmentuploaddocumentpresent+"] is Displayed");
				String[] essaywithattachmentuploaddocumentpresentarray = essaywithattachmentuploaddocumentpresent.split(";");				
				for (int i = 0; i < essaywithattachmentuploaddocumentpresentarray.length; i++) {
					if (essaywithattachmentuploaddocumentpresentarray[i].equalsIgnoreCase("upload document")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_UploadDocument, "Essay with Attachment Upload Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_UploadDocument, "Essay with Attachment Upload Document");						
					}else if (essaywithattachmentuploaddocumentpresentarray[i].equalsIgnoreCase("view document")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument, "Essay with Attachment View Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument, "Essay with Attachment View Document");
						
					}else if (essaywithattachmentuploaddocumentpresentarray[i].equalsIgnoreCase("delete")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_DeleteDocument, "Essay with Attachment Delete Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_DeleteDocument, "Essay with Attachment Delete Document");
						
					}else {
						writeFailure("Given Test Data["+essaywithattachmentuploaddocumentpresentarray[i]+"] either Incorrect or has not be Scripted ");
					}
				}

			}
			if (!essaywithattachmentuploaddocumentnotpresent.equals("")) {
				waitForPageToLoadWebdriver();
				Reporter.log("Step 6 - Verify Button["+essaywithattachmentuploaddocumentnotpresent+"] is Not Displayed");
				String[] essaywithattachmentuploaddocumentnotpresentarray = essaywithattachmentuploaddocumentnotpresent.split(";");				
				for (int i = 0; i < essaywithattachmentuploaddocumentnotpresentarray.length; i++) {
					if (essaywithattachmentuploaddocumentnotpresentarray[i].equalsIgnoreCase("upload document")) {
						waitForElementNotPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_UploadDocument, "Essay with Attachment Upload Document");
						verifyElementNotPresentWebdriver(attributeName_xpath,EA_EssaywithAttachment_UploadDocument, "Essay with Attachment Upload Document");	
						
					}else if (essaywithattachmentuploaddocumentnotpresentarray[i].equalsIgnoreCase("view document")) {
						//waitForPageToLoadWebdriver();
						waitForElementNotPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_ViewDocument, "Essay with Attachment View Document");
						verifyElementNotPresentWebdriver(attributeName_xpath,EA_EssaywithAttachment_ViewDocument, "Essay with Attachment View Document");
						
					}else if (essaywithattachmentuploaddocumentnotpresentarray[i].equalsIgnoreCase("delete")) {
						//waitForPageToLoadWebdriver();
						waitForElementNotPresentWebdriver(attributeName_xpath, EA_EssaywithAttachment_DeleteDocument, "Essay with Attachment Delete Document");
						verifyElementNotPresentWebdriver(attributeName_xpath,EA_EssaywithAttachment_DeleteDocument, "Essay with Attachment Delete Document");
						
					}else {
						writeFailure("Given Test Data["+essaywithattachmentuploaddocumentnotpresentarray[i]+"] either Incorrect or has not be Scripted ");
					}
				}

			}
			if (!essaywithattachment.equals("")) {
				Reporter.log("Step 7 - Verify Essay With Attachment as ["+essaywithattachment+"]");
				String essaywithattachmentID = getElementIDbyLabel("Essay with Attachment", EA_EssaywithAttachment);					
				verifyElementTextWebdriver(attributeName_xpath,essaywithattachmentID, essaywithattachment, "Essay with Attachment");

			}
			if (!essaywithoutattachment.equals("")) {
				Reporter.log("Step 8 - Verify Eassy without Attachement as ["+essaywithoutattachment+"]");
				String essaywithoutattachmentID = getElementIDbyLabel("Essay without Attachment", EA_EssaywithoutAttachment);
				verifyElementTextWebdriver(attributeName_xpath,essaywithoutattachmentID, essaywithoutattachment, "Essay without Attachment");

			}
			if (!uploadattachmentonlydocumentpresent.equals("")) {
				Reporter.log("Step 9 - Verify Button["+uploadattachmentonlydocumentpresent+"] is Displayed");
				String[] uploadattachmentonlydocumentpresentarray = uploadattachmentonlydocumentpresent.split(";");				
				for (int i = 0; i < uploadattachmentonlydocumentpresentarray.length; i++) {
					if (uploadattachmentonlydocumentpresentarray[i].equalsIgnoreCase("upload document")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_UploadDocument, "Attachment Only Upload Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_UploadDocument, "Attachment Only Upload Document");	
						
					}else if (uploadattachmentonlydocumentpresentarray[i].equalsIgnoreCase("view document")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_ViewDocument, "Attachment Only View Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_ViewDocument, "Attachment Only View Document");
						
					}else if (uploadattachmentonlydocumentpresentarray[i].equalsIgnoreCase("delete")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_DeleteDocument, "Attachment Only Delete Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_DeleteDocument, "Attachment Only Delete Document");
						
					}else {
						writeFailure("Given Test Data["+uploadattachmentonlydocumentpresentarray[i]+"] either Incorrect or has not be Scripted ");
					}
				}

			}
			if (!uploadattachmentonlydocumentnotpresent.equals("")) {
				Reporter.log("Step 10 - Verify Button["+uploadattachmentonlydocumentpresent+"] is Not Displayed");
				String[] uploadattachmentonlydocumentnotpresenttarray = uploadattachmentonlydocumentnotpresent.split(";");				
				for (int i = 0; i < uploadattachmentonlydocumentnotpresenttarray.length; i++) {
					if (uploadattachmentonlydocumentnotpresenttarray[i].equalsIgnoreCase("upload document")) {
						waitForElementNotPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_UploadDocument, "Attachment Only Upload Document");
						verifyElementNotPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_UploadDocument, "Attachment Only Upload Document");	
						
					}else if (uploadattachmentonlydocumentnotpresenttarray[i].equalsIgnoreCase("view document")) {
						waitForElementNotPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_ViewDocument, "Attachment Only View Document");
						verifyElementNotPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_ViewDocument, "Attachment Only View Document");
						
					}else if (uploadattachmentonlydocumentnotpresenttarray[i].equalsIgnoreCase("delete")) {
						waitForElementNotPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_DeleteDocument, "Attachment Only Delete Document");
						verifyElementNotPresentWebdriver(attributeName_xpath, EA_AttachmentOnly_DeleteDocument, "Attachment Only Delete Document");
						
					}else {
						writeFailure("Given Test Data["+uploadattachmentonlydocumentnotpresenttarray[i]+"] either Incorrect or has not be Scripted ");
					}
				}

			}
			if (!uploadmediafilepresent.equals("")) {
				Reporter.log("Step 11 - Verify Button["+uploadmediafilepresent+"] is Displayed");
				String[] uploadmediafilepresentarray = uploadmediafilepresent.split(";");				
				for (int i = 0; i < uploadmediafilepresentarray.length; i++) {
					if (uploadmediafilepresentarray[i].equalsIgnoreCase("Upload File")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_MediaAttach_UploadMedia, "Media Attachment Upload Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_MediaAttach_UploadMedia, "Media Attachment Upload Document");	
						
					}else if (uploadmediafilepresentarray[i].equalsIgnoreCase("View File")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_MediaAttach_Viewfile, "Media Attachment View Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_MediaAttach_Viewfile, "Media Attachment View Document");
						
					}else if (uploadmediafilepresentarray[i].equalsIgnoreCase("delete")) {
						waitForElementPresentWebdriver(attributeName_xpath, EA_MediaAttach_Deletefile, "Media Attachment Delete Document");
						verifyElementPresentWebdriver(attributeName_xpath, EA_MediaAttach_Deletefile, "Media Attachment Delete Document");
						
					}else {
						writeFailure("Given Test Data["+uploadmediafilepresentarray[i]+"] either Incorrect or has not be Scripted ");
					}
				}

			}
			if (!uploadmediafilenotpresent.equals("")) {
				Reporter.log("Step 12 - Verify Button["+uploadmediafilenotpresent+"] is Not Displayed");
				String[] uploadmediafilenotpresentarray = uploadmediafilenotpresent.split(";");				
				for (int i = 0; i < uploadmediafilenotpresentarray.length; i++) {
					if (uploadmediafilenotpresentarray[i].equalsIgnoreCase("upload document")) {
						verifyElementNotPresentWebdriver(attributeName_xpath, EA_MediaAttachment_UploadFile, "Media Attachment Upload Document");	
						
					}else if (uploadmediafilenotpresentarray[i].equalsIgnoreCase("view document")) {
						verifyElementNotPresentWebdriver(attributeName_xpath, EA_MediaAttachment_Viewfile, "Media Attachment View Document");
						
					}else if (uploadmediafilenotpresentarray[i].equalsIgnoreCase("delete")) {
						verifyElementNotPresentWebdriver(attributeName_xpath, EA_MediaAttachment_Deletefile, "Media Attachment Delete Document");
						
					}else {
						writeFailure("Given Test Data["+uploadmediafilenotpresentarray[i]+"] either Incorrect or has not be Scripted ");
					}
				}

			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
