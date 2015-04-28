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

public class WC_TestScore_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Manage Test Score' page")
	public void WC_TestScore_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Test Score' Page");
			String[] testdata = datacontainer;
			String testtype = testdata[0];
			String status = testdata[1];
			String dateofreceipt = testdata[2];
			String testmonth = testdata[3];
			String testyear = testdata[4];
			String rank = testdata[5];
			String nextclosewindow = testdata[6];
						
			Reporter.log("Input Test Data was retrieved for 'Manage Test Score' Page");
			
			if(!status.equals("")){
				Reporter.log("Verify("+status+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, AS_TestScoreStatus, status);
				verifyElementContainsTextWebdriver(attributeName_xpath, AS_TestScoreStatus, status, status);
			}
			if(!nextclosewindow.equals("")){
				Reporter.log("Click on the Button"+nextclosewindow);
				clickWebdriver(attributeName_xpath, AS_SupportingDocCloseWindow+nextclosewindow+"')]");
			}	
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

