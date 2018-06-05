/**
 * 
 */
package procedures_NewFramework.AYSmoke.General;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

import java.io.BufferedInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class PDF_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to verify 'PDF' Window is open successfully.")	
	public void PDF_Verify() {
		try {
			writeDetails();
			Iterator<String> windows = driver.getWindowHandles().iterator();
			String parent = windows.next();
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
				waitForPageToLoadWebdriver();
				writeConsole("Step 1 - Verify PDF is Open Successfully");
//				int waitforpdfint = Integer.parseInt(wait)*1000;
				String exceptionMsg = null;
				//String[] Pdfwindows = new String[0];
				Set<String> PdfWindows = driver.getWindowHandles();
				int wintotal = PdfWindows.size();

				wintotal = wintotal -1;
				System.out.println("+++++++++++"+wintotal);
				String[] Pdfwindows = PdfWindows.toArray(new String[PdfWindows.size()]);
                System.out.print("==============="+driver.getTitle()+""+Pdfwindows[wintotal]);
				    //Pdfwindows = selenium.getAllWindowNames();
					//int wintotal = Pdfwindows.length-1;
					//selenium.selectWindow("name=" + Pdfwindows[wintotal]);
				//selectWindow(Pdfwindows[wintotal]);
				driver.switchTo().window(Pdfwindows[wintotal]);
				System.out.print("==============="+driver.getTitle()+"=="+Pdfwindows[wintotal]);
				String temp = driver.getTitle();
					//waitForPageToLoadWebdriver();
					Reporter.log("Window["+pdfname+"] was selected");
					writeConsole("Window["+pdfname+"] was selected");
					System.out.println("Malik");
					//waitForElementPresentWebdriver(attributeName_xpath, "//div[@class='textLayer']/div", "Wait for PDF Loading...");
					try {
				/*		//exceptionMsg = selenium.getBodyText();//Issue in taking the content from PFD file opened
					//	String  exceptionmsg = driver.findElement(By.xpath("//div[@id='pageContainer1']/div[2]")).getAttribute("innerHTML");
						String  exceptionmsg = driver.getPageSource("");
						System.out.println("Page Source text  "+exceptionmsg);
					//	String  exceptionmsg = driver.findElement(By.xpath("//div[contains(@id,'pageContainer1')]//div[contains(@class,'textLayer')]//div[4]")).getText();
						//String exceptionmsg = driver.findElement(By.xpath("//div[contains(@class,'textLayer')]")).getText();
						

						//switchToDefaultContentWebdriver();
						//String exceptionmsg = driver.findElement(By.xpath("//div[@class='textLayer']//div[2]")).getText();
						System.out.println("Exception is " + exceptionmsg);
						//exceptionMsg = exceptionmsg.getText();
						writeConsole("Pdf Getbody Text : "+exceptionmsg);*/
						/*List<WebElement> pdfContent = driver.findElements(By.xpath("//html[@dir='ltr']//div[@id='viewerContainer']//div[@id='pageContainer1']//div[@class='textLayer']//div"));

						for(WebElement eachDiv : pdfContent){
							exceptionmsg += eachDiv.getText();
						}*/
						waitForPageToLoadWebdriver();
						List<WebElement> elementLocator = driver.findElements(By.xpath("//div[@id='viewerContainer']//div[@class='textLayer']//div"));
						String exceptionmsg = ""; //= elementLocator.getText();

						for(int i =1;i<elementLocator.size();i++){
							String element = elementLocator.get(i).getText();
							Reporter.log("Actual text = "+element);
							System.out.println(""+element);
							String actualmessage[]=null;
							actualmessage[i] = element;
						}



						System.out.println("====="+exceptionmsg);

						if (!pdfcontainstext.equalsIgnoreCase("")) {
							System.out.println("aaaa");
							Reporter.log("Step 1 - Verify PDF Contains text");
							//verifyTextContains(pdfcontainstext, exceptionMsg, "Page");
							String [] splitpdftext = pdfcontainstext.split(";");
							waitForPageToLoadWebdriver();
							for (int i = 0; i < splitpdftext.length; i++) {
								//verifyTextContains(splitpdftext[i], exceptionMsg, "Contains PDF Text");Page:
//								verifyTextContains(splitpdftext[i], exceptionMsg, "Page");
//								writeConsole("Pdf Contains Text was verified successfully");
								if (exceptionmsg.contains(splitpdftext[i])) {
									writeConsole(splitpdftext[i]);
									waitForPageToLoadWebdriver();
//									writeConsole("PDF File :"+splitpdftext[i]);
								}
							}
							waitForPageToLoadWebdriver();
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
					closeWindowWebdriver();
					//deselectPopUp();
					System.out.println("Select Applicant summary popup");
					//recentPopupSelect("Applicant Summary");
					//deselectPopUp();
					//recentPopupCloseWebdriver();
					//selectMainWindowWebdriver();
				selectMainWindowWebdriver(parent);

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
				//Removed wait time
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
