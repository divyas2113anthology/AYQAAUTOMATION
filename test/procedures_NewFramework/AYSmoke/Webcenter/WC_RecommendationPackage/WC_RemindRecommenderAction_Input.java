package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.thoughtworks.selenium.webdriven.commands.WindowMaximize;
import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class WC_RemindRecommenderAction_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Remind Recommender Action' page")
	public void WC_RemindRecommenderAction_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Remind Recommender Action' Page");
			String[] testdata = datacontainer;
			String selectatemplate = testdata[0];
			String subject = testdata[1];
			String comment = testdata[2];
			String preview = testdata[3];
			String sender = testdata[4];
			String from = testdata[5];
			String replyto = testdata[6];
			String to = testdata[7];		
			String recordemail = testdata[8];	
			String actionlabel = testdata[9];	
			String batchname = testdata[10];	
			String batchdescription = testdata[11];	
			String mailnow = testdata[12];	
			String timehr = testdata[13];	
			String timemin = testdata[14];	
			String date = testdata[15];	
			String sendback = testdata[16];	
				
			Reporter.log("Input Test Data was retrieved for 'Remind Recommender Action' Page");
			
			if(!selectatemplate.equals("")){
				Reporter.log("Verify("+selectatemplate+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RR_SelectTemplate, selectatemplate);
				verifyElementContainsTextWebdriver(attributeName_xpath, RR_SelectTemplate, selectatemplate, selectatemplate);
			}
			if(!subject.equals("")){
				Reporter.log("Verify("+subject+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RR_Subject, selectatemplate);
				verifyElementValueWebdriver(attributeName_xpath, RR_Subject, subject, subject);
				
			}	
			if(!comment.equals("")){
				Reporter.log("SProvide the comments as("+comment+")");
				sendKeys(attributeName_xpath, RR_Comment, comment);

			}
			if(!actionlabel.equals("")){
				Reporter.log("Verify("+actionlabel+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RR_ActionLabel, actionlabel);
				verifyElementValueWebdriver(attributeName_xpath, RR_ActionLabel, actionlabel, actionlabel);
				
			}
			if(!mailnow.equals("")){
				Reporter.log("Click on the CheckBox "+mailnow);
				clickWebdriver(attributeName_xpath, RR_MailNow);
			}	
			if(!sendback.equals("")){
				Reporter.log("Click on the Button "+sendback);
				waitForElementPresentWebdriver(attributeName_xpath, RR_SendBack+sendback+"')]", sendback);
				clickWebdriver(attributeName_xpath, RR_SendBack+sendback+"')]");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
