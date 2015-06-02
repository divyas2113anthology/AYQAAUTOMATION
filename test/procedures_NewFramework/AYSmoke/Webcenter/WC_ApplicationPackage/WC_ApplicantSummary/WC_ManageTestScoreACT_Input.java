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

public class WC_ManageTestScoreACT_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Manage Test Score ACT' page")
	public void WC_ManageTestScoreACT_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Test Score ACT' Page");
			String[] testdata = datacontainer;
			String english = testdata[0];
			String reading = testdata[1];
			String math = testdata[2];
			String science = testdata[3];
			String composite = testdata[4];
			String savecancelclose = testdata[5];
						
			Reporter.log("Input Test Data was retrieved for 'Manage Test Score ACT' Page");
			
			if (!english.equals("")) {
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, AS_TestScoreEnglish, english);
			}
			if (!reading.equals("")) {
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, AS_TestScoreReading, reading);
			}
			
			if (!math.equals("")) {
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, AS_TestScoreMath, math);
			}
			
			if (!science.equals("")) {
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, AS_TestScoreScience, science);
			}
			if (!composite.equals("")) {
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, AS_TestScoreComposite, composite);
			}
							
			if(!savecancelclose.equals("")){
				Reporter.log("Click on the button");
				clickWebdriver(attributeName_xpath, AS_TestScoreSave);
				waitForPageToLoadWebdriver();
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
