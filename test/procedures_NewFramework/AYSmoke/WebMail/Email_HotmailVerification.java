package procedures_NewFramework.AYSmoke.WebMail;

import org.openqa.selenium.internal.seleniumemulation.OpenWindow;
import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class Email_HotmailVerification extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to Perform operation and Verification in Received Email in User Account Hobsons")
	public void Email_HotmailVerification (){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input and Verify Test Data for 'Hotmail Verification' in Hobsons Account");
			String[] EmailVerify= datacontainer;			
			String url = EmailVerify[0];
			String username = EmailVerify[1];
			String password = EmailVerify[2];
			String login= EmailVerify[3];
			String emailsubject = EmailVerify[4];
			String emailsubjectcontains = EmailVerify[5];
			String personallabel = EmailVerify[6];
			String passwordlabel = EmailVerify[7];
			String firstnamelabel= EmailVerify[8];
			String lastnamelabel = EmailVerify[9];
			String urlcontainslink = EmailVerify[10];
			String logout = EmailVerify[11];				
			Reporter.log("Input and Verify  Test Data was retrieved for 'Hotmail Verification'  in Hobsons Account");	
			if (!url.equals("")) {						
				Reporter.log("Step 1 - Opening the Hotmail Window");
				get("http://mail.hotmail.com/");
				waitForPageToLoad();
			}
			if (!username.equals("")) {
				Reporter.log("Step 2 - Enter UserName");
				sendKeys(attributeName_xpath, HM_WLogin, username);
			}
			if (!password.equals("")) {
				Reporter.log("Step 3 - Enter Password");
				sendKeys(attributeName_xpath, HM_WPassword, password);
			}
			if (!login.equals("")) {
				Reporter.log("Step 4 - Click Log-In Button");
				clickWebdriver(attributeName_xpath, HM_WSignIn);
				waitForElementPresentWebdriver(attributeName_xpath, "//img[@class='is_img']", "Outlook Image");
			}
			if (!emailsubject.equals("")) {
				Reporter.log("Step 5 - Entered Username and Password");
//				String pinLabel = null;
				waitForConditionisElementPresent("//span[contains(@class,'FolderLabel') and contains(text(),'Inbox')]", "120000");
//				selenium.waitForCondition("selenium.isElementPresent(\"//span[contains(@class,'FolderLabel') and contains(text(),'Inbox')]\")", "120000");
				Reporter.log("Click on Inbox");
//				clickWebdriver(attributeName_partiallinktext, HM_Inbox);
//				 Thread.sleep(6000);
				 try {
				    	for (int second = 0;; second++)
				    	{
							if (second >= 300) writeFailure(" Timeout after 1 minute..");
							 if (selenium.isVisible(HM_InboxSide)) {
								 Thread.sleep(3000);
								 clickWebdriver(attributeName_xpath,HM_InboxSide);
									try { if (selenium.isVisible("//*[@class='InboxTable']//li[contains(@class,'mlUnrd mlUnsel')]//span[@class='Sb']/a[text(),'"+emailsubject+"']")) break; } catch (Exception e) {}
									Thread.sleep(500);
								}
						}
				    	
				    	selenium.waitForCondition("selenium.isVisible(\"//*[@class='InboxTable']//li[contains(@class,'mlUnrd mlUnsel')]//span[@class='Sb']/a[text(),'"+emailsubject+"']\")", "120000");
				    	clickWebdriver(attributeName_xpath,"//*[@class='InboxTable']//li[contains(@class,'mlUnrd mlUnsel')]//span[@class='Sb']/a[text(),'"+emailsubject+"']");
				    	
				    selenium.waitForCondition("selenium.isElementPresent(\"//div[@id='mpf0_MsgContainer']\")", "120000");
//					String text=selenium.getText("//div[@id='mpf0_MsgContainer']");
					//Get the Personal Access Code:
/*				    	selenium.waitForCondition("selenium.isElementPresent(\"//div[@id='mpf0_MsgContainer']\")", "120000");
						String MailSubject=selenium.getText("//div[@id='mpf0_MsgContainer']");
//						System.out.println("Personal Access Code "+MailSubject);
						String[] PerAccCodeSplit = MailSubject.split("Personal Access Code:");
//						String[] RecUrlSplit = PerAccCodeSplit[0].split("Recommendation at:");
//						String RecUrl = RecUrlSplit[1].trim();
//						writeConsole("Recommendation URL:"+RecUrl);
//						String[] RecommendationUrlSplit =  RecUrl.split("https://");
						String[] perAccCode = PerAccCodeSplit[1].split("Initial Password:");
						String PersonalAccessCode = perAccCode[0].trim();
						if (!personallabel.equals("")) {
						writeConsole("Personal Access Code:"+PersonalAccessCode);
						Reporter.log("Proceed to Write Personal Access Code as ("+PersonalAccessCode+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(PersonalAccessCode,personallabel);
						}
						String[] ApplicantSplit =  perAccCode[1].split("Name of Applicant:");
						String Password = ApplicantSplit[0].trim();
						if (!passwordlabel.equals("")) {
						writeConsole("Password:"+Password);
						Reporter.log("Proceed to Write Initial Password as ("+Password+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(Password,passwordlabel);
						}
						String[] FstSplit = ApplicantSplit[1].split(" ");
						String FirstName = FstSplit[2].trim();
//						String LastName = FstSplit[3].trim();
						if (!firstnamelabel.equals("")) {
						writeConsole("First Name:"+FirstName);
						Reporter.log("Proceed to Write First Name as ("+FirstName+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(FirstName,firstnamelabel);
						}
						if (!lastnamelabel.equals("")) {
						writeConsole("Last Name:"+LastName);
						Reporter.log("Proceed to Write Last Name as ("+LastName+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(LastName,lastnamelabel);
						}*/
						} catch (Exception e) {
						//System.out.println("Error message("+e.getMessage()+")");
						writeFailure("Email Notification was not Recevied in Hotmail Inbox or Element Error message("+e.getMessage()+")");
						}
			}
			
			if (!emailsubjectcontains.equals("")) {
				String emailsubjectcontainsread = Runtimedataread(emailsubjectcontains);
				writeConsole("Email Subject Contains:"+emailsubjectcontainsread);
//				Reporter.log("Opening the Hotmail Window");
//				selenium.openWindow("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=11&ct=1312790651&rver=6.1.6206.0&wp=MBI&wreply=http:%2F%2Fmail.live.com%2Fdefault.aspx&lc=1033&id=64855&mkt=en-us&cbcxt=mai&snsc=1", "Sign In");
//				Reporter.log("Selecting the Hotmail Window");
//				selenium.selectWindow("Sign In");
//				//selenium.open("https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=11&ct=1312790651&rver=6.1.6206.0&wp=MBI&wreply=http:%2F%2Fmail.live.com%2Fdefault.aspx&lc=1033&id=64855&mkt=en-us&cbcxt=mai&snsc=1");
//				Reporter.log("Wait For Page To Load");
//				waitForPageToLoad();
//				if (!selenium.isElementPresent("//a[text()='sign out']")) {
//				if (selenium.isElementPresent("//input[@id='i0116']")) {
//				Reporter.log("Proceed to Enter Username and Password");
//				type(HM_WLogin,username);
//				type(HM_WPassword,password);
//				click(HM_WSignIn);
//				waitForPageToLoad();
				//Thread.sleep(10000);
				/*if(selenium.isElementPresent("//input[@id='SaveBtn']")){
					click("//input[@id='SaveBtn']");
					Thread.sleep(20000);
				}*/
				Reporter.log("Entered Username and Password");
				selenium.waitForCondition("selenium.isElementPresent(\"//span[contains(@class,'FolderLabel') and contains(text(),'Inbox')]\")", "120000");
				Reporter.log("Click on Inbox");
				clickWebdriver(attributeName_partiallinktext, HM_Inbox);
				 Thread.sleep(6000);
				/*if (selenium.isTextPresent("sign out")) {
				Reporter.log("Its Navigated to Main Page");
				} else {
				writeFailure("Its Not Navigated to Main Page");
				}*/
//				}
//				}
				
			    try {
			    	for (int second = 0;; second++)
			    	{
						if (second >= 300) writeFailure(" Timeout after 1 minute..");
						//selenium.waitForCondition("selenium.isElementPresent(\"//*[@class='Caption' and text()='Inbox ']\")", "120000");
						 if (selenium.isVisible(HM_InboxSide)) {
							 Thread.sleep(3000);
								click(HM_InboxSide);
								//waitForPageToLoad();
								try { if (selenium.isVisible("//*[@class='InboxTable']//li[contains(@class,'mlUnrd mlUnsel')]//span[@class='Sb']/a[contains(text(),'"+emailsubjectcontainsread+"')]")) break; } catch (Exception e) {}
								Thread.sleep(500);
							}
					}
			    	
			    	selenium.waitForCondition("selenium.isVisible(\"//*[@class='InboxTable']//li[contains(@class,'mlUnrd mlUnsel')]//span[@class='Sb']/a[contains(text(),'"+emailsubjectcontainsread+"')]\")", "120000");
			    	clickWebdriver(attributeName_xpath,"//*[@class='InboxTable']//li[contains(@class,'mlUnrd mlUnsel')]//span[@class='Sb']/a[contains(text(),'"+emailsubjectcontainsread+"')]");
			    	
				/*try {
			    	for (int second = 0;; second++)
			    	{
						if (second >= 300) writeFailure(" Timeout after 1 minute..");
						if (selenium.isVisible(HM_Inbox)) {
							click(HM_Inbox);
						} else if (selenium.isVisible(HM_InboxSide)) {
							click(HM_InboxSide);
						}
						waitForPageToLoad();
						selenium.waitForCondition("selenium.isElementPresent(\"//table[@class='InboxTable']\")", "120000");
					//	Subject = Subject.substring(0,Subject.length()-1);
						try { 
							if(selenium.isVisible("//table[@class='InboxTable']/tbody/tr[td[img[@alt='Unread']]]/td/a[contains(text(),'"+Subject+"')]")){
								selenium.click("//table[@class='InboxTable']/tbody/tr[td[img[@alt='Unread']]]/td/a[contains(text(),'"+Subject+"')]");
								break; 
							}
						} 
						catch (Exception e) {}
						
						Thread.sleep(500);
					}*/
			    	
			    waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='mpf0_MsgContainer']", "Message Container");
//			    selenium.waitForCondition("selenium.isElementPresent(\"//div[@id='mpf0_MsgContainer']\")", "120000");
				/*String MailSubject=selenium.getText("//div[@id='mpf0_MsgContainer']");
//				System.out.println("Personal Access Code "+MailSubject);
				String[] PerAccCodeSplit = MailSubject.split("Personal Access Code:");
//				String[] RecUrlSplit = PerAccCodeSplit[0].split("Recommendation at:");
//				String RecUrl = RecUrlSplit[1].trim();
//				writeConsole("Recommendation URL:"+RecUrl);
//				String[] RecommendationUrlSplit =  RecUrl.split("https://");
				String[] perAccCode = PerAccCodeSplit[1].split("Initial Password:");
				String PersonalAccessCode = perAccCode[0].trim();
				if (!personallabel.equals("")) {
				writeConsole("Personal Access Code:"+PersonalAccessCode);
				Reporter.log("Proceed to Write Personal Access Code as ("+PersonalAccessCode+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
				Runtimedatawrite(PersonalAccessCode,personallabel);
				}
				String[] ApplicantSplit =  perAccCode[1].split("Name of Applicant:");
				String Password = ApplicantSplit[0].trim();
				if (!passwordlabel.equals("")) {
				writeConsole("Password:"+Password);
				Reporter.log("Proceed to Write Initial Password as ("+Password+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
				Runtimedatawrite(Password,passwordlabel);
				}
				String[] FstSplit = ApplicantSplit[1].split(" ");
				String FirstName = FstSplit[2].trim();
//				String LastName = FstSplit[3].trim();
				if (!firstnamelabel.equals("")) {
				writeConsole("First Name:"+FirstName);
				Reporter.log("Proceed to Write First Name as ("+FirstName+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
				Runtimedatawrite(FirstName,firstnamelabel);
				}
				if (!lastnamelabel.equals("")) {
					writeConsole("Last Name:"+LastName);
					Reporter.log("Proceed to Write Last Name as ("+LastName+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
					Runtimedatawrite(LastName,lastnamelabel);
					}*/
				} catch (Exception e) {
				//System.out.println("Error message("+e.getMessage()+")");
				writeFailure("Email Notification was not Recevied in Hotmail Inbox or Element Error message("+e.getMessage()+")");
				}
			}
			if (!urlcontainslink.equals("")) {
				Reporter.log("Proceed to Click on Set Password Link");
/*				String setPassword = selenium.getText("//a[contains (text(), 'code')]"); //UK
				System.out.println("href "+setPassword);
				Reporter.log("Procced to Modify url"); //modifying "https://rec.applyyourself.com/" to "https://uatrec.applyyourself.com/"
				String[] recSplit = setPassword.split("//");
				System.out.println("href first part  "+recSplit[0]);
				System.out.println("href sceond part  "+recSplit[1]);
				//String instance = CommonReuseable4Testing.getInstance();
//				String recLink = recSplit[0]+"//"+instance+recSplit[1];
				String recLink = recSplit[0]+"//uat"+recSplit[1];
				//String recLink = recSplit[0]+"//uat"+recSplit[1];
				get(recLink);
				waitForPageToLoad();*/	
				String GetURL = selenium.getText("//div[@class='ReadMsgBody']"); //UK
				System.out.println("Get Body Text: "+GetURL);
				String urlmodify = null;
				environment = Runtimedataread("Instance");
				if (GetURL.contains("Submit your letter of Recommendation System at:")) {
					clickWebdriver(attributeName_xpath, "//a[contains(@href,'rec')]");
					recentPopupSelectWebdriver("Create/Reset Password");
				}
//				else if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
//					String[] SplitGetURL1 = GetURL.split("https://");
//					System.out.println("Get Url 1: "+SplitGetURL1[0]);
//					System.out.println("Get Url 2: "+SplitGetURL1[1]);
//					String[] SplitGetURL2 = SplitGetURL1[1].split("Your Personal Access Code");
//					String GetOpenURL = SplitGetURL2[0].trim();
//					System.out.println("Get Url 3: "+GetOpenURL);
//					String OpenURL = "https://"+GetOpenURL;
//					System.out.println("Get Url 4: "+OpenURL);
//					if (OpenURL.contains("uat")) {
//						if (environment.equalsIgnoreCase("USPR")) {
//							String[] spliturl =OpenURL.split("uat");
//							urlmodify = spliturl[0]+spliturl[1];
//							System.out.println("Get Url 5: "+urlmodify);
//						}
//					}else if (!OpenURL.contains("uat")) {
//						if (environment.equals("USQA")) {
////							String[] spliturl =OpenURL.split("https://");
//							urlmodify = "https://uat"+OpenURL.substring(8, OpenURL.length()-1);
//							System.out.println("Get Url 6: "+urlmodify);
//						}
//					}
//					urlmodify= OpenURL;
//					System.out.println("Get Url 7: "+urlmodify);
//					selenium.openWindow(urlmodify, "Recommendation Page");
////					clickWebdriver(attributeName_xpath, "//a[contains(@href,'"+urlcontainslink+"')]");
//					recentPopupSelectWebdriver("Create/Reset Password");
//				}
				else{
				String[] SplitGetURL1 = GetURL.split("https://");
				System.out.println("Get Url 1: "+SplitGetURL1[0]);
				System.out.println("Get Url 2: "+SplitGetURL1[1]);
				String[] SplitGetURL2 = SplitGetURL1[1].split("NOTE:");
				String GetOpenURL = SplitGetURL2[0].trim();
				System.out.println("Get Url 3: "+GetOpenURL);
				String OpenURL = "https://"+GetOpenURL;
				System.out.println("Get Url 4: "+OpenURL);
				if (OpenURL.contains("uat")) {
					if (environment.equalsIgnoreCase("USPR")) {
						String[] spliturl =OpenURL.split("uat");
						urlmodify = spliturl[0]+spliturl[1];
						System.out.println("Get Url 5: "+urlmodify);
					}
				}else if (!OpenURL.contains("uat")) {
					if (environment.equals("USQA")) {
//						String[] spliturl =OpenURL.split("https://");
						urlmodify = "https://uat"+OpenURL.substring(8, OpenURL.length()-1);
						System.out.println("Get Url 6: "+urlmodify);
					}
				}
				urlmodify= OpenURL;
				System.out.println("Get Url 7: "+urlmodify);
				selenium.openWindow(urlmodify, "Recommendation Page");
//				clickWebdriver(attributeName_xpath, "//a[contains(@href,'"+urlcontainslink+"')]");
				recentPopupSelectWebdriver("Create/Reset Password");
				}
			}
			if (!logout.equals("")) {
				Reporter.log("Step  - Proceed to click on Logout Link");
				clickWebdriver(attributeName_xpath, "//span[@id='c_meun']");
				clickWebdriver(attributeName_partiallinktext, logout);
				waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='brand']/following-sibling::h2", "Log Out Page");
			}
			} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
 			
		}
		
	}

}

