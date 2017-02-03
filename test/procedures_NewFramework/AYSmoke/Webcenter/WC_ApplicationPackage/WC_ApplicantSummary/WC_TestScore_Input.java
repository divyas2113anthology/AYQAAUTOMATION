package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class WC_TestScore_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Test Score' page")
	public void WC_TestScore_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Test Score' Page");
			String[] testdata = datacontainer;
			String testtype = testdata[0];
			String status = testdata[1];
			String dateofreceipt = testdata[2];
			String testmonth = testdata[3];
			String testyear = testdata[4];
			String rank = testdata[5];
			String nextclosewindow = testdata[6];
			String verifystatus = testdata[7];		
			
			Reporter.log("Input Test Data was retrieved for 'Manage Test Score' Page");
			recentPopupSelectWebdriver("TestScore");
			//recentPopupSelect_without_window_nameWebdriver();
			if(!testtype.equals("")){
				Reporter.log("Select the Status("+testtype+")");
				waitForElementPresentWebdriver(attributeName_xpath, AS_TestType, testtype);
				selectByVisibleTextWebdriver(attributeName_xpath, AS_TestType, testtype);

			}	
			if(!status.equals("")){
				Reporter.log("Select the Status("+status+")");
				waitForElementPresentWebdriver(attributeName_xpath, AS_TestScoreStatus, status);
				selectByVisibleTextWebdriver(attributeName_xpath, AS_TestScoreStatus, status);

			}
			if(!verifystatus.equals("")){
				Reporter.log("Verify("+verifystatus+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, AS_TestScoreStatus, verifystatus);
				verifyElementContainsTextWebdriver(attributeName_xpath, AS_TestScoreStatus, verifystatus, verifystatus);
			}
			if(!nextclosewindow.equals("")){
				Reporter.log("Click on the Button"+nextclosewindow);
				clickWebdriver(attributeName_xpath, AS_SupportingDocCloseWindow+nextclosewindow+"')]");
				//recentPopupSelectWebdriver("TestScoreACT");
				waitForPageToLoadWebdriver();
			}	
			//switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


