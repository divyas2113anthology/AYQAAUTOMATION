package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.thoughtworks.selenium.webdriven.commands.WindowMaximize;
import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class WC_Transcript_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Transcript' page")
	public void WC_Transcript_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Transcript' Page");
			String[] testdata = datacontainer;
			String universityname = testdata[0];
			String universitycode = testdata[1];
			String universitytype = testdata[2];
			String dateoftranscript = testdata[3];
			String transcriptreceiveddate = testdata[4];
			String status = testdata[5];
			String gpa = testdata[6];
			String rank = testdata[7];
			String gpatype = testdata[8];
			String percentile = testdata[9];
			String gpascale = testdata[10];
			String classsize = testdata[11];
			String creditsattempted = testdata[12];
			String creditscompleted = testdata[13];
			String degreeearned = testdata[14];
			String degree = testdata[15];
			String saveclosewindow = testdata[16];
						
			Reporter.log("Input Test Data was retrieved for 'Transcript' Page");
			if (!universityname.equals("")) {
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, AS_TestScoreSchoolName, universityname);
			}
			if(!status.equals("")){
				Reporter.log("Verify("+status+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, AS_TranscriptStatus, status);
				selectByVisibleTextWebdriver(attributeName_xpath, AS_TranscriptStatus, status);
				//verifyElementContainsTextWebdriver(attributeName_xpath, AS_TranscriptStatus, status, status);
			}
			if(!saveclosewindow.equals("")){
				Reporter.log("Click on the Button"+saveclosewindow);
				clickWebdriver(attributeName_xpath, AS_SupportingDocCloseWindow+saveclosewindow+"')]");
				recentPopupCloseWebdriver();
			}	
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}



