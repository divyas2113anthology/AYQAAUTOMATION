package procedures_NewFramework.AYSmoke.WebMail;

import static processor.CommonSeleniumActions.Runtimedataread;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.HasInputDevices;
import org.openqa.selenium.interactions.Keyboard;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class Email_Verification extends CommonSeleniumActions implements OR {
	//	public static String browser;

	@Test(description="This Procedure is used to Perform operation and Verification in Received Email in User Account Hobsons")
	public void Email_Verification (){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input and Verify Test Data for 'Email Verification' in Hobsons Account");
			String[] EmailVerify= datacontainer;			
			String url = EmailVerify[0];
			String username = EmailVerify[1];
			String password = EmailVerify[2];
			String login= EmailVerify[3];
			String emailsubject = EmailVerify[4];
			String emailsubjectcontains = EmailVerify[5];
			String from = EmailVerify[6];
			String to = EmailVerify[7];
			String subject= EmailVerify[8];
			String verifycontents = EmailVerify[9];
			String contentcontains = EmailVerify[10];
			String verifylink = EmailVerify[11];
			String verifylinkcontains = EmailVerify[12];
			String linkcontains = EmailVerify[13];
			String getlinkopen = EmailVerify[14];
			String getinternallink = EmailVerify[15];
			String openemailclose = EmailVerify[16];
			String logout = EmailVerify[17];				
			Reporter.log("Input and Verify  Test Data was retrieved for 'Email Verification'  in Hobsons Account");	
			String browser = Runtimedataread("Browser").toLowerCase();
			
			if (browser.equalsIgnoreCase("InternetExplorer")) {
				writeConsole("Internet Explorer Browser");
				if (!url.equals("")) {						 
					Reporter.log("Step 1 - Open URL");
//					get("http://webmail.hobsons.com/");
					get("http://mail.hobsons.com/");
					waitForPageToLoad();
				}

				if (!username.equals("")) {
					Reporter.log("Step 2 - Enter UserName");
					sendKeys(attributeName_xpath,HC_UserName,username);
				}
				if (!password.equals("")) {
					Reporter.log("Step 3 - Enter Password");
					sendKeys(attributeName_xpath,HC_Password,password);
				}
				
				if (!emailsubject.equals("")) {
					Reporter.log("Step 5 - Click on Email Subject");
					//                      waitForElementPresentWebdriver(attributeName_xpath, HC_EmailSubject+emailsubject+"']", "Email Subject["+emailsubject+"]");
					switchToFrameByWebelementWebdriver(attributeName_tagname, HC_BodyFrame);
					if (isDisplayedWebdriver(attributeName_xpath, HC_EmailSubject+emailsubject+"']")) {                                      
						doubleClickWebdriver(attributeName_xpath, HC_EmailSubject+emailsubject+"']");      
						recentPopupSelectWebdriver("Open Email");
					} else {
						writeFailure("Email Notification Subject["+emailsubject+"] was not Recevied in Hobsons WebMail Inbox ");
					}

					//                      if (isElementPresent(HC_EmailSubject+emailsubject+"']")) {
					//                             clickAt(HC_EmailSubject+emailsubject+"']","");
					//                             doubleClick(HC_EmailSubject+emailsubject+"']");                             
					//                             recentPopupSelect("Open Email");
					//                      } else {
					//                             writeFailure("Email Notification Subject["+emailsubject+"] was not Recevied in Hobsons WebMail Inbox ");
					//                      }
				}
				if (!emailsubjectcontains.equals("")) {
					Reporter.log("Step 6 - Click on Email Subject Contains");
					switchToFrameByWebelementWebdriver(attributeName_tagname, HC_BodyFrame);
					waitForElementPresentWebdriver(attributeName_xpath, HC_EmailSubjectContains+emailsubjectcontains+"')]","Send Email");
					if (isDisplayedWebdriver(attributeName_xpath, HC_EmailSubjectContains+emailsubjectcontains+"')]")) {
						doubleClickWebdriver(attributeName_xpath, HC_EmailSubjectContains+emailsubjectcontains+"')]");                                     
						recentPopupSelectWebdriver("Open Email");                                   
					} else {
						writeFailure("Email Notification Subject["+emailsubjectcontains+"] was not Recevied in Hobsons WebMail Inbox ");
					}
					//                      if (isElementPresent(HC_EmailSubjectContains+emailsubjectcontains+"')]")) {
					//                             clickAt(HC_EmailSubjectContains+emailsubjectcontains+"')]","");                           
					//                             doubleClick(HC_EmailSubjectContains+emailsubjectcontains+"')]");                     
					//                             recentPopupSelect("Open Email");
					//                      } else {
					//                             writeFailure("Email Notification Subject["+emailsubjectcontains+"] was not Recevied in Hobsons WebMail Inbox ");
					//                      }
				}

				if (!from.equals("")) {
					Reporter.log("Step 7 - Verify 'From' Address");
					verifyElementWithTitle(HC_From, from, "From Address["+from+"]");
				}
				if (!to.equals("")) {
					Reporter.log("Step 8 - Verify 'To' Address");
					verifyElementWithTitle(HC_To,to, "To Address("+to+")");
				}
				if (!subject.equals("")) {
					Reporter.log("Step 9 - Verify 'Subject'");
					verifyElementText(HC_Subject,subject, "Subject("+subject+")");
				}
				if (!verifycontents.equals("")) {
					Reporter.log("Step 10 - Verify Email Content["+verifycontents+"]");
					String environment = Runtimedataread("Instance").toLowerCase();
					if (verifycontents.contains("http://ardemo.applyyourself.com/")) {
						verifycontents = verifycontents.replace("http://ardemo.applyyourself.com/", "http://"+environment+".applyyourself.com/");
					}else if (verifycontents.contains("http://arqa.applyyourself.com/")) {
						verifycontents = verifycontents.replace("http://arqa.applyyourself.com/", "http://"+environment+".applyyourself.com/");
					}else if (verifycontents.contains("http://ar.applyyourself.com/")) {
						verifycontents = verifycontents.replace("http://ar.applyyourself.com/", "http://"+environment+".applyyourself.com/");
					}else if (verifycontents.contains(";;")) {
						verifycontents = verifycontents.replace(";;", " \n\n");						
					}else if (verifycontents.contains(";")) {						
						verifycontents = verifycontents.replace(";", " \n");
					}
					System.out.println("Expected Text"+verifycontents);

					//					getText("css=div[id='divBdy']");
					//					getText("css=iframe[id='ifBdy']");
					//					getText("css=body[ocsi='1']");
					//					waitForElementPresent(HC_MailBody_Content, "Email Body Content");
					verifyElementText(HC_MailBody_Content, verifycontents, "Email Body");

				}
				if (!contentcontains.equals("")) {
					Reporter.log("Step 11 - Verify Email Subject Content Contains");
					//					if (contentcontains.contains(":")) {
					//						contentcontains = contentcontains.replace(":", ",");
					//					}
					String[] contentcontainsarray = contentcontains.split(";");
					for (int i = 0; i < contentcontainsarray.length; i++) {
						//						verifyIsTextPresent(contentcontainsarray[i]);						
						verifyElementContainsText(HC_Body, contentcontainsarray[i], "EMail Body Content ");
					}

				}

				if (!verifylink.equals("")) {
					Reporter.log("Step 12 - Verify Email Content link["+verifylink+"]");
					Reporter.log("Proceed to retrieve Environment Instance From Excel Sheet(C:/Selenium/InputTestdata.xls)");
					String environment = Runtimedataread("Instance").toLowerCase();					
					//					if (verifylink.contains(":")) {
					//						verifylink = verifylink.replace(":", ",");
					//					}
					String[] verifylinkarray = verifylink.split(";");
					for (int i = 0; i < verifylinkarray.length; i++) {
						String urlprefix = null;
						if (verifylinkarray[i].contains("ar") && verifylinkarray[i].contains("applyyourself")) {
							String[] urlarray = verifylinkarray[i].split("\\.");
							urlprefix = "http://"+environment;
							for (int j = 1; j < urlarray.length; j++) {
								urlprefix = urlprefix+"."+urlarray[j];
							}					
							verifyElementPresent(HC_Content_Link+urlprefix+"']", "Email Content Link ("+urlprefix+")");
						}else {
							verifyElementPresent(HC_Content_Link+verifylinkarray[i]+"']", "Email Content Link ("+verifylinkarray[i]+")");
						}
					}

				}

				if (!verifylinkcontains.equals("")) {
					Reporter.log("Step 13 -Verify Email Content link contains["+verifylinkcontains+"]");
					if (verifylinkcontains.contains(":")) {
						verifylinkcontains = verifylinkcontains.replace(":", ",");
					}
					String[] verifylinkcontainsarray = verifylinkcontains.split(";");
					for (int i = 0; i < verifylinkcontainsarray.length; i++) {
						verifyElementPresent(HC_Content_LinkContians+verifylinkcontainsarray[i]+"')", "Email Content Link Contains("+verifylinkcontainsarray[i]+")");
					}

				}

				if (!linkcontains.equals("")) {
					Reporter.log("Step 14 - Click on Link Contains");
					//					waitForElementPresentWebdriver(attributeName_partiallinktext, linkcontains, linkcontains);
					//					clickWebdriver(attributeName_partiallinktext, linkcontains);
					switchToFrameByWebelementWebdriver(attributeName_tagname, HC_BodyFrame);
					waitForElementPresentWebdriver(attributeName_xpath, "//a[contains(@href,'AYForgottenpassword')]", linkcontains);
					clickWebdriver(attributeName_xpath, "//a[contains(@href,'AYForgottenpassword')]");
					recentPopupSelectWebdriver("Register Event");
				}
				if (!getlinkopen.equals("")) {
					Reporter.log("Step 15 - Get Link Entire Text and Open in Same Window");
					String getLinkText = getText(HC_LinkContians+getlinkopen+"')]");
					openAndWait(getLinkText);
				}
				if (!getinternallink.equals("")) {
					Reporter.log("Step 16 - Get Link HREF Property(Entire URL) and Open in Same Window");
					String getLinkHref = getAttribute(HC_LinkContians+getinternallink+"')]", "href");
					Reporter.log("Step 16 - Get Link HREF Property(Entire URL) and Open in Same Window"+getLinkHref);
					openAndWait(getLinkHref);					
				}
				if (!openemailclose.equals("")) {
					Reporter.log("Step 17 - Closing All Opened Pop Ups");
					recentPopupClose();
				}
				if (!logout.equals("")) {
					Reporter.log("Step 18 - Click on Log Off Link");
					waitForElementPresentWebdriver(attributeName_xpath, "//a[@id='lo']", logout);
					clickWebdriver(attributeName_xpath, "//a[@id='lo']");
					waitForPageToLoad();
				}
			}
			//			This is for Other browsers like "Firefox, Chrome"
			else{
				writeConsole("Other Browser");
				if (!url.equals("")) {						
					Reporter.log("Step 1 - Open URL");
//					get("http://webmail.hobsons.com/");
					get("http://mail.hobsons.com/");
					waitForPageToLoadWebdriver();
				}

				if (!username.equals("")) {
					Reporter.log("Step 2 - Enter UserName");
					sendKeys(attributeName_xpath,HC_UserName,username);
				}
				if (!password.equals("")) {
					Reporter.log("Step 3 - Enter Password");
					sendKeys(attributeName_xpath,HC_Password,password);
				}
				if (!login.equals("")) {
					Reporter.log("Step 4 - Click Log-In Button");
					waitForElementPresentWebdriver(attributeName_xpath, HC_Login, login);
					doubleClickWebdriver(attributeName_xpath, HC_Login);
					//assign key board object
				       Keyboard keyboard=((HasInputDevices) driver).getKeyboard();
				       //enter a key
				       keyboard.pressKey(Keys.ENTER);
					//waitForElementPresentWebdriverWait(attributeName_xpath,"//div[@id='MailFolderPane.FavoritesFolders']//span[@title='Inbox']", "Inbox");	
					//clickWebdriver(attributeName_xpath, HC_Login);
					//checkWebdriver(attributeName_xpath, HC_Login);

					//waitForElementPresentWebdriver(attributeName_id, "lo", "Log Off");
					
					//waitForElementPresentWebdriver(attributeName_xpath, HC_Inbox, "Inbox");
					//waitForElementPresentWebdriver(attributeName_xpath, HC_Home, "EMT QA Account");         
				}
				//			}
				//			waitForConditionisElementPresent(HC_LogOff, "120000");
				if (!emailsubject.equals("")) {
					Reporter.log("Step 5 - Click on Email Subject");
					try {
						for (int second = 0;; second++)
						{
							if (second >= 300) writeFailure(" Timeout after 1 minute..");
//							clickWebdriver(attributeName_cssselector,"css=a[title='Inbox']");   
							clickWebdriver(attributeName_xpath,"//div[@id='MailFolderPane.FavoritesFolders']//span[@title='Inbox']");
							waitForPageToLoad();
							try { if (selenium.isVisible("//div[@class='conductorContent']//span[contains(text(),'"+emailsubject+"')]")) break; } catch (Exception e) {}
							waitForPageToLoadWebdriver();
						}
						selenium.waitForCondition("selenium.isVisible(\"//div[@class='conductorContent']//span[contains(text(),'"+emailsubject+"')]\")", "120000");
						clickWebdriver(attributeName_xpath,"//div[@class='conductorContent']//span[contains(text(),'"+emailsubject+"')]");
						waitForPageToLoadWebdriver();
						// selenium.click("//*[@class='bld']/a[text()='"+emailSub+"']");
						waitForPageToLoad();
						/*if(selenium.isElementPresent("//a[contains(text(),'click here.')]")){
							clickWebdriver(attributeName_xpath,"//a[contains(text(),'click here.')]");
							waitForPageToLoadWebdriver();
						}*/
					} catch (Exception e) {
						//System.out.println("Error message("+e.getMessage()+")");
						writeFailure("Email Notification was not Recevied in emtqaaccount Inbox or Element Error message("+e.getMessage()+")");
					}
				}
				if (!emailsubjectcontains.equals("")) {
					Reporter.log("Step 6 - Click on Email Subject Contains");
					System.out.println("Login");
					try {
						for (int second = 0;; second++)
						{
							if (second >= 60) writeFailure(" Timeout after 1 minute..");
							//clickWebdriver(attributeName_cssselector,"css=a[title='Inbox']");  //div[@id='MailFolderPane.FavoritesFolders']//span[@title='Inbox']
							waitForElementPresentWebdriver(attributeName_xpath, HC_Inbox, "Inbox");
//							checkWebdriver(attributeName_xpath, HC_Inbox);
							//clickWebdriver(attributeName_xpath,"//div[@id='MailFolderPane.FavoritesFolders']//span[@title='Inbox']");
							clickWebdriver(attributeName_xpath, "//div[@role='group' and @aria-label='EMT QA Account']//span[text()='Inbox']");
							//clickWebdriver(attributeName_xpath, "//div[@role='tree' and @aria-labelledby='MailFolderPane.FavoritesHeader']//span[text()='Inbox']");
							writeConsole("I am here");
							//waitForPageToLoadWebdriver();
							//waitForElementPresentWebdriver(attributeName_xpath, HC_Inbox, "Inbox");
							//waitForPageToLoad();  //table[@class='lvw']/tbody/tr[td[img[@alt='Message: Unread']]]/td/h1[@class='bld']/a[contains(text(),
							try { 
								System.out.println("Entered in try block");
								if (selenium.isVisible("//div[@class='conductorContent']//span[contains(text(),'"+emailsubjectcontains+"')]"))
									writeConsole("I am in try block");
									break; 
							} catch (Exception e) {}
							waitForPageToLoadWebdriver();
						}
						//selenium.waitForCondition("selenium.isVisible(\"//table[@class='lvw']/tbody/tr[td[img[@alt='Message: Unread']]]/td/h1[@class='bld']/a[contains(text(),'"+emailsubjectcontains+"')]\")", "120000");
						selenium.waitForCondition("selenium.isVisible(\"//div[@class='conductorContent']//span[contains(text(),'"+emailsubjectcontains+"')]\")", "120000");
						//clickWebdriver(attributeName_xpath,"//table[@class='lvw']/tbody/tr[td[img[@alt='Message: Unread']]]/td/h1[@class='bld']/a[contains(text(),'"+emailsubjectcontains+"')]");
						
						clickWebdriver(attributeName_xpath,"//div[@class='conductorContent']//span[contains(text(),'"+emailsubjectcontains+"')]");
						waitForPageToLoadWebdriver();
						// selenium.click("//*[@class='bld']/a[text()='"+emailSub+"']");
						//			    	waitForPageToLoad();
//						waitForElementPresentWebdriver(attributeName_id, "lnkHdrclose", "Close Mail");
						//waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='ItemHeader.ToContainer']/span[contains(text(),'To:')]", "To");
						waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='ItemHeader.ToContainer']","EMT");
						if(selenium.isElementPresent("//a[contains(text(),'click here.')]")){
							clickWebdriver(attributeName_xpath,"//a[contains(text(),'click here.')]");
							waitForPageToLoadWebdriver();
						}
					} catch (Exception e) {
						//System.out.println("Error message("+e.getMessage()+")");
						writeFailure("Email Notification was not Recevied in emtqaaccount Inbox or Element Error message("+e.getMessage()+")");
					}
				}

				if (!from.equals("")) {
					Reporter.log("Step 7 - Verify 'From' Address");
					verifyElementWithTitle(HC_From, from, "From Address["+from+"]");
				}
				if (!to.equals("")) {
					Reporter.log("Step 8 - Verify 'To' Address");
					verifyElementWithTitle(HC_To,to, "To Address("+to+")");
				}
				if (!subject.equals("")) {
					Reporter.log("Step 9 - Verify 'Subject'");
					verifyElementText(HC_Subject,subject, "Subject("+subject+")");
				}
				if (!verifycontents.equals("")) {
					Reporter.log("Step 10 - Verify Email Content["+verifycontents+"]");
					//				String environment = Runtimedataread("Instance").toLowerCase();
				
					waitForElementPresentWebdriver(attributeName_xpath, WebMail_Body, verifycontents);
					verifyElementPresentWebdriver(attributeName_xpath, WebMail_Body, verifycontents);
					

				}
				if (!contentcontains.equals("")) {
					Reporter.log("Step 11 - Verify Email Subject Content Contains");
					//				if (contentcontains.contains(":")) {
					//					contentcontains = contentcontains.replace(":", ",");
					//				}
					String[] contentcontainsarray = contentcontains.split(";");
					for (int i = 0; i < contentcontainsarray.length; i++) {
						//					verifyIsTextPresent(contentcontainsarray[i]);						
						verifyElementContainsText(HC_Body, contentcontainsarray[i], "EMail Body Content ");
					}

				}

				if (!verifylink.equals("")) {
					Reporter.log("Step 12 - Verify Email Content link["+verifylink+"]");
					Reporter.log("Proceed to retrieve Environment Instance From Excel Sheet(C:/Selenium/InputTestdata.xls)");
					String environment = Runtimedataread("Instance").toLowerCase();					
					//				if (verifylink.contains(":")) {
					//					verifylink = verifylink.replace(":", ",");
					//				}
					String[] verifylinkarray = verifylink.split(";");
					for (int i = 0; i < verifylinkarray.length; i++) {
						String urlprefix = null;
						if (verifylinkarray[i].contains("ar") && verifylinkarray[i].contains("applyyourself")) {
							String[] urlarray = verifylinkarray[i].split("\\.");
							urlprefix = "http://"+environment;
							for (int j = 1; j < urlarray.length; j++) {
								urlprefix = urlprefix+"."+urlarray[j];
							}					
							verifyElementPresent(HC_Content_Link+urlprefix+"']", "Email Content Link ("+urlprefix+")");
						}else {
							verifyElementPresent(HC_Content_Link+verifylinkarray[i]+"']", "Email Content Link ("+verifylinkarray[i]+")");
						}
					}

				}

				if (!verifylinkcontains.equals("")) {
					Reporter.log("Step 13 -Verify Email Content link contains["+verifylinkcontains+"]");
					if (verifylinkcontains.contains(":")) {
						verifylinkcontains = verifylinkcontains.replace(":", ",");
					}
					String[] verifylinkcontainsarray = verifylinkcontains.split(";");
					for (int i = 0; i < verifylinkcontainsarray.length; i++) {
						verifyElementPresent(HC_Content_LinkContians+verifylinkcontainsarray[i]+"')", "Email Content Link Contains("+verifylinkcontainsarray[i]+")");
					}

				}

				if (!linkcontains.equals("")) {
					Reporter.log("Step 14 - Click on Link Contains");
					if(!linkcontains.equals(""))
					{
						if (linkcontains.equalsIgnoreCase("Click here")) 
						{
							clickWebdriver(attributeName_partiallinktext, linkcontains);
							recentPopupSelectWebdriver("Register Event");
						}
						else if(linkcontains.equalsIgnoreCase("Reset your password")){
							//a[contains(text(),'Reset your password')]
							Reporter.log("Clicked on Reset Link");
							clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+linkcontains+"')]");
							recentPopupSelectWebdriver("Create/Reset Password");
						}
						else
						{
							//verifyElementPresent(attributeName_xpath, "//a[contains(text(),'"+linkcontains+"')]");
							clickWebdriver(attributeName_xpath, "//a[contains(text(),'"+linkcontains+"')]");
							recentPopupSelectWebdriver("Create/Reset Password");

						}
					}
				}
				if (!getlinkopen.equals("")) {
					Reporter.log("Step 15 - Get Link Entire Text and Open in Same Window");
					String getLinkText = getText(HC_LinkContians+getlinkopen+"')]");
					openAndWait(getLinkText);
				}
				if (!getinternallink.equals("")) {
					Reporter.log("Step 16 - Get Link HREF Property(Entire URL) and Open in Same Window");
					String getLinkHref = getAttribute(HC_LinkContians+getinternallink+"')]", "href");
					Reporter.log("Step 16 - Get Link HREF Property(Entire URL) and Open in Same Window"+getLinkHref);
					openAndWait(getLinkHref);					
				}
				if (!openemailclose.equals("")) {
					Reporter.log("Step 17 - Closing All Opened Pop Ups");
					recentPopupClose();
				}
				if (!logout.equals("")) {
					Reporter.log("Step 18 - Click on Log Off Link");
					waitForElementVisibleWebdriverWait(attributeName_xpath, HC_Home, logout);
//					waitForElementPresentWebdriver(attributeName_xpath, "//a[@id='lo']", logout);  //button[@aria-label='EMT QA Account - Away menu with submenu']
					waitForElementPresentWebdriver(attributeName_xpath, HC_Home, "EMT QA Account");
					//waitForElementPresentWebdriver(attributeName_xpath, "//button[contains(@id,'MainLink_Help')]", "EMT QA Account");
//					clickWebdriver(attributeName_xpath, "//a[@id='lo']");
					//clickWebdriver(attributeName_xpath, "//button[@aria-label='EMT QA Account']");
					clickWebdriver(attributeName_xpath, "//button[contains(@aria-label,'EMT QA Account')]");
					clickWebdriver(attributeName_xpath, "//span[@aria-label='Sign out']");
					//clickWebdriver(attributeName_xpath, "//div[@class='headerMenuDropShadow contextMenuPopup removeFocusOutline']//div[@role='menu']//span[@aria-label='Sign out']");
					//waitForPageToLoad();
					waitForPageToLoadWebdriver();
				}

			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());

		}

	}

}
