package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_SendEmail_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Send Email' page")
	public void WC_SendEmail_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Send Email' Page");
			String[] testdata = datacontainer;
			String selectatemplate = testdata[0];
			String subject = testdata[1];
			String message = testdata[2];
			String sender = testdata[3];
			String from = testdata[4];
			String replyto = testdata[5];
			String to = testdata[6];
			String bccall = testdata[7];
			String bccnotification = testdata[8];
			String messagetype = testdata[9];
			String actionlabel = testdata[10];
			String sendemail = testdata[11];
			String campaign = testdata[12];
			String mailbatchname = testdata[13];
			String mailbatchdescription = testdata[14];
			String mailnow = testdata[15];
			String timetomailed = testdata[16];
			String datetobemaild = testdata[17];
			String button = testdata[18];
			Reporter.log("Input Test Data was retrieved for 'Send Email' Page");
			
			if (!selectatemplate.equals("")) {
				Reporter.log("Step 1 - Select at Template as  ["+selectatemplate+"] ");
				//waitForElementPresentWebdriver(attributeName_name, SE_Template, selectatemplate);
				waitForElementPresentWebdriverWait(attributeName_xpath, SE_TemplateName, selectatemplate);
				select(SE_Template, "regexp:"+selectatemplate);
				//selectByVisibleTextWithTrimSpaceWebdriver(attributeName_name, SE_Template, selectatemplate);
				//waitForPageToLoadWebdriver();
				try {
					Alert alert = driver.switchTo().alert();
			        String AlertText = alert.getText();
			        System.out.println(AlertText);
			        alert.accept();
			    } catch (Exception e) {
			        System.out.println("no alert");
			    }
			}
			
			if (!subject.equals("")) {
				Reporter.log("Step 2 - Enter the Subject as  ["+subject+"] ");
//				sendKeys(attributename, attributevalue, value);		
			}
			
			if (!message.equals("")) {
				Reporter.log("Step 3 - Enter the Message as  ["+message+"] ");
//				sendKeys(attributename, attributevalue, value);		
			}
			
			if (!sender.equals("")) {
				Reporter.log("Step 4 - Enter the sender as  ["+sender+"] ");
//				sendKeys(attributename, attributevalue, value);		
			}
			
			if (!from.equals("")) {
				Reporter.log("Step 5 - Enter the from as  ["+from+"] ");
//				sendKeys(attributename, attributevalue, value);		
			}
			
			if (!replyto.equals("")) {
				Reporter.log("Step 6 - Enter the reply to as  ["+replyto+"] ");
//				sendKeys(attributename, attributevalue, value);		
			}
			
			if (!to.equals("")) {
				Reporter.log("Step 7 - Enter the to as  ["+to+"] ");
//				sendKeys(attributename, attributevalue, value);		
			}
			
			if (!bccall.equals("")) {
				Reporter.log("Step 8 - Enter the BCC all as  ["+bccall+"] ");
//				sendKeys(attributename, attributevalue, value);		
			}
			
			if (!bccnotification.equals("")) {
				Reporter.log("Step 9 - Enter the BCC Notification as  ["+bccnotification+"] ");
			}
			
			if (!messagetype.equals("")) {
				Reporter.log("Step 10 - Enter the Message type as  ["+messagetype+"] ");
			}
			
			if (!actionlabel.equals("")) {
				Reporter.log("Step 11 - Enter the action label as  ["+actionlabel+"] ");
			}
			
			if (!sendemail.equals("")) {
				Reporter.log("Step 12 - Enter the send mail as  ["+sendemail+"] ");
			}
			if (!campaign.equals("")) {
				Reporter.log("Step 14 - Enter the campaign as  ["+campaign+"] ");
				
			}
			
			if (!mailbatchname.equals("")) {
				Reporter.log("Step 15 - Enter the mail batch name as  ["+mailbatchname+"] ");
				
			}
			
			if (!mailbatchdescription.equals("")) {
				Reporter.log("Step 16 - Enter the mail batch description as  ["+mailbatchdescription+"] ");
				
			}
			
			if (!mailnow.equals("")) {
				Reporter.log("Step 17 - Enter the mail now as  ["+mailnow+"] ");
				
			}
			
			if (!timetomailed.equals("")) {
				Reporter.log("Step 18 - Enter the time to mailed as  ["+timetomailed+"] ");
				
			}
			
			if (!datetobemaild.equals("")) {
				Reporter.log("Step 19 - Enter the date tobe maild as  ["+datetobemaild+"] ");
				
			}
			
			if (!button.equals("")) {
				Reporter.log("Step 20 - Click the button as  ["+button+"] ");
				if (button.equalsIgnoreCase("Send")) {
					waitForElementPresentWebdriverWait(attributeName_xpath, SE_SendBtn, button);
					clickWebdriver(attributeName_xpath, SE_SendBtn);
					try {
						 
				        Alert alert = driver.switchTo().alert();
				        String AlertText = alert.getText();
				        System.out.println(AlertText);
				        alert.accept();
				    } catch (Exception e) {
				        System.out.println("no alert");
				    }
					
					selenium.keyPressNative("10");
					//SendKeys(Keys.ENTER);
         //					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, SE_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
