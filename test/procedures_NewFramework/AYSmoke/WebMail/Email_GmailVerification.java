package procedures_NewFramework.AYSmoke.WebMail;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;

//public class Email_GmailVerification extends CommonSeleniumActions implements OR {
	
//	@Test(description="This Procedure is used to Perform operation and Verification in Received Email in User Account Hobsons")
//	public void Email_GmailVerification (){
//		try {
//			writeDetails();
//			Reporter.log("Proceed to retrieve Input and Verify Test Data for 'Gmail Verification' in Gmail Account");
//			String[] EmailVerify= datacontainer;
//			String url = EmailVerify[0];
//			String username = EmailVerify[1];
//			String password = EmailVerify[2];
//			String login= EmailVerify[3];
//			String emailsubject = EmailVerify[4];
//			String emailsubjectcontains = EmailVerify[5];
//			String personallabel = EmailVerify[6];
//			String passwordlabel = EmailVerify[7];
//			String firstnamelabel= EmailVerify[8];
//			String lastnamelabel = EmailVerify[9];
//			String urlcontainslink = EmailVerify[10];
//			String clicklinkcontains = EmailVerify[11];
//			String logout = EmailVerify[12];
//			Reporter.log("Input and Verify  Test Data was retrieved for 'Hotmail Verification'  in Hobsons Account");
//			if (!url.equals("")) {
//				Reporter.log("Step 1 - Opening the Gmail Window");
//				get("http://www.gmail.com/");
//				waitForPageToLoadWebdriver();
//			}
//			if (!username.equals("")) {
//				Reporter.log("Step 2 - Enter UserName");
//				sendKeys(attributeName_xpath, GM_WLogin, username);
//			}
//			if (!password.equals("")) {
//				Reporter.log("Step 3 - Enter Password");
//				sendKeys(attributeName_xpath, GM_WPassword, password);
//			}
//			if (!login.equals("")) {
//				Reporter.log("Step 4 - Click Log-In Button");
//				clickWebdriver(attributeName_xpath, GM_WSignIn);
//				waitForElementPresentWebdriver(attributeName_xpath, "//span[@class='gb_Da']", "Google Image");
//			}
//			if (!emailsubject.equals("")) {
//				Reporter.log("Step 5 - Email Subject as'"+emailsubject+"'");
////				writeConsole("Email Subject Contains:"+emailsubjectcontainsread);
//
//				//selenium.waitForCondition("selenium.isElementPresent(\"//span[contains(@class,'FolderLabel') and contains(text(),'Inbox')]\")", "120000");
//				Reporter.log("Click on Inbox");
//				writeConsole("Click on Inbox");
//				//clickWebdriver(attributeName_partiallinktext, HM_Inbox);
//				//clickWebdriver(attributeName_xpath, HM_Inbox);
//				/*clickWebdriver(attributeName_xpath, HM_InboxSide);
//				writeConsole("I am here");
//
//				try {
//					for (int second = 0;; second++)
//					{
//						if (second >= 300) writeFailure(" Timeout after 1 minute..");
//						//switchToFrameByWebelementWebdriver(attributeName_tagname, HC_BodyFrame);
//						//if (selenium.isVisible(HM_InboxSide)) {
//						if (selenium.isVisible("//div[@class='ContentRight WithRightRail RPOff']")) {
//
//							//clickWebdriver(attributeName_xpath,"//div[@class='ContentRight WithRightRail RPOff']");
//							try { if (selenium.isVisible("//div[@class='c-MessageGroup mailListPane InboxTable']//li[contains(@class,'c-MessageRow')]/span[@class='Sb']/a[text()[contains(.,'"+emailsubject+"')]")) break; } catch (Exception e) {}
//
//						}
//					}
//					selenium.waitForCondition("selenium.isVisible(\"//*[contains(@class,'InboxTable')]//li[contains(@class,'mlUnrd')]//span[@class='Sb']/a[text()[contains(.,'"+emailsubject+"')]\")", "120000");
//					//clickWebdriver(attributeName_xpath,"//*[@class='InboxTable']//li[contains(@class,'mlUnrd mlUnsel')]//span[@class='Sb']/a[contains(text(),'"+emailsubject+"')]");
//					clickWebdriver(attributeName_xpath,"//div[@class='c-MessageGroup mailListPane InboxTable']//li[contains(@class,'c-MessageRow')]/span[@class='Sb']/a[text()[contains(.,'"+emailsubject+"')]");
////					waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='mpf0_MsgContainer']", "Message Container");
//					waitForElementPresentWebdriver(attributeName_id, "rmic1_usertile", "Message Container");
//				} catch (Exception e) {
//					writeFailure("Email Notification was not Recevied in Hotmail Inbox or Element Error message("+e.getMessage()+")");
//				}*/
//				waitForPageToLoadWebdriver();
//				clickWebdriver(attributeName_xpath, HM_InboxSide);
//				waitForPageToLoadWebdriver();
//				try {
//					for (int second = 0;; second++)
//					{
//						if (second >= 300) writeFailure(" Timeout after 1 minute..");
////						if (selenium.isVisible("//div[@class='nH nn']")) {
//							waitForPageToLoadWebdriver();
//							//clickWebdriver(attributeName_xpath,"//ul[@class='mailList InboxTableBody ']/li");
//							//try {
////								if (selenium.isVisible("//div[@class='xS']//b[text()[contains(.,"+emailsubject+"')]]"))
//									writeConsole("2");
//									break;
//								}
////								} catch (Exception e) {}
////						}
//					}
////					selenium.waitForCondition("selenium.isVisible(\"//div[@class='xS']//b[text()[contains(.,"+emailsubject+"')]]\")", "120000");
//					clickWebdriver(attributeName_xpath,"//div[@class='xS']//b[text()[contains(.,"+emailsubject+"')]]");
//					//waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='mpf0_MsgContainer']", "Message Container");
//				} catch (Exception e) {
//					writeFailure("Email Notification was not Recevied in Hotmail Inbox or Element Error message("+e.getMessage()+")");
//				}
//
//			}
//
//////			if (!emailsubjectcontains.equals("")) {
//////				String emailsubjectcontainsread = Runtimedataread(emailsubjectcontains);
////				writeConsole("Email Subject Contains:"+emailsubjectcontainsread);
////				writeConsole("aaaa");
////				Reporter.log("Step 6 - Entered Username and Password");
////				//public static final String HM_InboxSide ="//li[contains(@class,'leftnavitem')]//span[text()='Inbox']";
////				//selenium.waitForCondition("selenium.isElementPresent(\"//span[contains(@class,'FolderLabel') and contains(text(),'Inbox')]\")", "120000");
////				//selenium.waitForCondition("selenium.isElementPresent(\"//div[@class='aim ain']//a[contains(text(),'Inbox')]\")", "120000");
////				Reporter.log("Click on Inbox");
////				writeConsole("Click on Inbox");
////				//clickWebdriver(attributeName_partiallinktext, HM_Inbox);
////				clickWebdriver(attributeName_xpath, GM_InboxSide);
////				waitForPageToLoadWebdriver();
////				try {
////					for (int second = 0;; second++)
////					{
////						if (second >= 300) writeFailure(" Timeout after 1 minute..");
////						if (selenium.isVisible("//div[@class='messageListContainer']")) {
////							waitForPageToLoadWebdriver();
////							//clickWebdriver(attributeName_xpath,"//ul[@class='mailList InboxTableBody ']/li");
////							//try {
////								if (selenium.isVisible("//div[@class='xS']//b[text()[contains(.,"+emailsubject+"')]]"))
////									writeConsole("2");
////									break;
//								}
////								} catch (Exception e) {}
////						}
//					}
////					//selenium.waitForCondition("selenium.isVisible(\"/div[@class='xS']//b[text()[contains(.,"+emailsubject+"')]]\")", "120000");
////					clickWebdriver(attributeName_xpath,"/div[@class='xS']//b[text()[contains(.,"+emailsubject+"')]]");
////					//waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='mpf0_MsgContainer']", "Message Container");
////				} catch (Exception e) {
////					writeFailure("Email Notification was not Recevied in Hotmail Inbox or Element Error message("+e.getMessage()+")");
////				}
////			}
////			if (!urlcontainslink.equals("")) {
////				Reporter.log("Step 7 - Proceed to Click on Set Password Link");
////				/*				String setPassword = selenium.getText("//a[contains (text(), 'code')]"); //UK
////				System.out.println("href "+setPassword);
////				Reporter.log("Procced to Modify url"); //modifying "https://rec.applyyourself.com/" to "https://uatrec.applyyourself.com/"
////				String[] recSplit = setPassword.split("//");
////				System.out.println("href first part  "+recSplit[0]);
////				System.out.println("href sceond part  "+recSplit[1]);
////				//String instance = CommonReuseable4Testing.getInstance();
//////				String recLink = recSplit[0]+"//"+instance+recSplit[1];
////				String recLink = recSplit[0]+"//uat"+recSplit[1];
////				//String recLink = recSplit[0]+"//uat"+recSplit[1];
////				get(recLink);
////				waitForPageToLoadWebdriver();*/
////				String GetURL = selenium.getText("//div[@class='ReadMsgBody']"); //UK
////				System.out.println("Get Body Text: "+GetURL);
////				String urlmodify = null;
////				environment = Runtimedataread("Instance");
////				if (GetURL.contains("Submit your letter of Recommendation System at:")) {
////					clickWebdriver(attributeName_xpath, "//a[contains(@href,'rec')]");
////					recentPopupSelectWebdriver("Create/Reset Password");
////				}
////				//				else if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
////				//					String[] SplitGetURL1 = GetURL.split("https://");
////				//					System.out.println("Get Url 1: "+SplitGetURL1[0]);
////				//					System.out.println("Get Url 2: "+SplitGetURL1[1]);
////				//					String[] SplitGetURL2 = SplitGetURL1[1].split("Your Personal Access Code");
////				//					String GetOpenURL = SplitGetURL2[0].trim();
////				//					System.out.println("Get Url 3: "+GetOpenURL);
////				//					String OpenURL = "https://"+GetOpenURL;
////				//					System.out.println("Get Url 4: "+OpenURL);
////				//					if (OpenURL.contains("uat")) {
////				//						if (environment.equalsIgnoreCase("USPR")) {
////				//							String[] spliturl =OpenURL.split("uat");
//				//							urlmodify = spliturl[0]+spliturl[1];
//				//							System.out.println("Get Url 5: "+urlmodify);
//				//						}
//				//					}else if (!OpenURL.contains("uat")) {
//				//						if (environment.equals("USQA")) {
//				////							String[] spliturl =OpenURL.split("https://");
//				//							urlmodify = "https://uat"+OpenURL.substring(8, OpenURL.length()-1);
//				//							System.out.println("Get Url 6: "+urlmodify);
//				//						}
//				//					}
//				//					urlmodify= OpenURL;
//				//					System.out.println("Get Url 7: "+urlmodify);
//				//					selenium.openWindow(urlmodify, "Recommendation Page");
//				////					clickWebdriver(attributeName_xpath, "//a[contains(@href,'"+urlcontainslink+"')]");
//				//					recentPopupSelectWebdriver("Create/Reset Password");
//				//				}
////				else{
////					String[] SplitGetURL1 = GetURL.split("https://");
////					System.out.println("Get Url 1: "+SplitGetURL1[0]);
////					System.out.println("Get Url 2: "+SplitGetURL1[1]);
////					String[] SplitGetURL2 = SplitGetURL1[1].split("NOTE:");
////					String GetOpenURL = SplitGetURL2[0].trim();
////					System.out.println("Get Url 3: "+GetOpenURL);
////					String OpenURL = "https://"+GetOpenURL;
////					System.out.println("Get Url 4: "+OpenURL);
////					if (OpenURL.contains("uat")) {
////						if (environment.equalsIgnoreCase("USPR")) {
////							String[] spliturl =OpenURL.split("uat");
////							urlmodify = spliturl[0]+spliturl[1];
////							System.out.println("Get Url 5: "+urlmodify);
////						}
////					}else if (!OpenURL.contains("uat")) {
////						if (environment.equals("USQA")) {
////							//						String[] spliturl =OpenURL.split("https://");
////							urlmodify = "https://uat"+OpenURL.substring(8, OpenURL.length()-1);
////							System.out.println("Get Url 6: "+urlmodify);
////						}
////					}
////					urlmodify= OpenURL;
////					System.out.println("Get Url 7: "+urlmodify);
////					selenium.openWindow(urlmodify, "Recommendation Page");
////					//				clickWebdriver(attributeName_xpath, "//a[contains(@href,'"+urlcontainslink+"')]");
////					recentPopupSelectWebdriver("Create/Reset Password");
////				}
////			}
////
////			if (!clicklinkcontains.equals("")) {
////				Reporter.log("Step  8 - Proceed to click on Message contains Link");
////				waitForElementPresentWebdriver(attributeName_partiallinktext, clicklinkcontains, clicklinkcontains);
////				clickWebdriver(attributeName_partiallinktext, clicklinkcontains);
////				waitForPageToLoadWebdriver();
////				recentPopupSelectWebdriver("Update Information");
////				//recentPopupSelect("Update Information");
////			}
////			if (!logout.equals("")) {
////				Reporter.log("Step  9 - Proceed to click on Logout Link");
////				clickWebdriver(attributeName_xpath, "//div[@id='gb']//a[@title='hobsonsqatest@gmail.com']");
////				waitForElementPresentWebdriver(attributeName_linktext, "Sign out", "Log Out link");
////				clickWebdriver(attributeName_linktext, "Sign out");
////				waitForElementPresentWebdriver(attributeName_xpath, "//a[contains(text(),'Sign out')]", "Log Out Page");
////				driver.close();
////			}
////			} catch (Exception e) {
////			writeFailure(e.getLocalizedMessage());
////
////		}
////
////	}
//
//}

