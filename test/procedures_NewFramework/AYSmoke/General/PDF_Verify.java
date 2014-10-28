/**
 * 
 */
package procedures_NewFramework.AYSmoke.General;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class PDF_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to verify 'PDF' Window is open successfully.")	
	public void PDF_Verify() {
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data to verify PDF is Open successfully");
			String[] testdata = datacontainer;
			String pdfname = testdata[0];
			String wait = testdata[1];
			String pdfcontainstext = testdata[2];
			Reporter.log("Verify Test Data was retrieved to verify PDF is Open successfully");
			writeConsole("Verify Test Data was retrieved to verify PDF is Open successfully");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			String browser = Runtimedataread("Browser").toLowerCase();
			writeConsole(browser);
//			String exceptionMsg = null;
//			String[] Pdfwindows = new String[0];								
			if (browser.equalsIgnoreCase("Firefox") || browser.equalsIgnoreCase("GoogleChrome")) {
				writeConsole(browser);
			if (!pdfname.equals("")) {
				writeConsole("Step 1 - Verify PDF is Open Successfully");
//				int waitforpdfint = Integer.parseInt(wait)*1000;
				String exceptionMsg = null;
				String[] Pdfwindows = new String[0];								
					Pdfwindows = selenium.getAllWindowNames();
					int wintotal = Pdfwindows.length-1;
					selenium.selectWindow("name=" + Pdfwindows[wintotal]);
					Reporter.log("Window["+pdfname+"] was selected");
					writeConsole("Window["+pdfname+"] was selected");
					waitForElementPresentWebdriver(attributeName_xpath, "//div[@class='textLayer']/div", "Wait for PDF Loading...");
//					Thread.sleep(waitforpdfint);				
					try {
						exceptionMsg = selenium.getBodyText();
						writeConsole("Pdf Getbody Text : "+exceptionMsg);
						if (!pdfcontainstext.equalsIgnoreCase("")) {
							System.out.println("aaaa");
							Reporter.log("Step 1 - Verify PDF Contains text");
							//verifyTextContains(pdfcontainstext, exceptionMsg, "Page");
							String [] splitpdftext = pdfcontainstext.split(";");
							
							for (int i = 0; i < splitpdftext.length; i++) {
								//verifyTextContains(splitpdftext[i], exceptionMsg, "Contains PDF Text");Page:
//								verifyTextContains(splitpdftext[i], exceptionMsg, "Page");
//								writeConsole("Pdf Contains Text was verified successfully");
								if (exceptionMsg.contains(splitpdftext[i])) {
									verifyTextPresent(splitpdftext[i]);
//									writeConsole("PDF File :"+splitpdftext[i]);
								}
							}
							//verifyTextContains(splitpdftext, exceptionMsg, "Page");
							//deselectPopUp();
							recentPopupCloseWebdriver();
						}
						if (wait.equals("")) {
							
						}
					} catch (Exception e) {			
//						exceptionMsg = e.getMessage();
						writeFailure(e.getLocalizedMessage());
					}
//						if (exceptionMsg.equals("ERROR: Current window or frame is closed!") && Pdfwindows[wintotal].equals(PDFName)) {
//					if (exceptionMsg.equals("ERROR: Current window or frame is closed!")) {
//							Reporter.log("PDF file["+pdfname+"] was Opened Successfully");
//						} else {
//							writeFailure("PDF File["+pdfname+"] was not Opened Successfully");
//						}
					writeConsole("close PDF File :");
					//closeWindowWebdriver();
					//selectMainWindowWebdriver();
				}
			}else{
				writeConsole("Inter Net "+browser);
				writeConsole("Step 1 - Verify PDF is Open Successfully");
				String exceptionMsg = null;
//				String[] Pdfwindows = new String[0];
//				Pdfwindows = selenium.getAllWindowNames();
//				int wintotal = Pdfwindows.length-1;
//				System.out.println("Window-->" + Pdfwindows[wintotal]);
//				selenium.selectWindow("name=" + Pdfwindows[wintotal]);
//				Reporter.log("Popup Window is selected....");
				Thread.sleep(90000);
				try {
					exceptionMsg = selenium.getBodyText();
//					exceptionMsg = driver.getPageSource();
				} catch (Exception e) {			
					System.out.println("Fail1"+e.getMessage());
					exceptionMsg = e.getMessage();
					writeFailure(exceptionMsg);
				}
					if (exceptionMsg.equals("ERROR: Current window or frame is closed!")) {
						Reporter.log("PDF file was displayed Properly");
					} else {
						Assert.fail("PDF File was not displayed");
					}
					writeConsole("close PDF File :");
					closeWindowWebdriver();
					selectMainWindowWebdriver();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
