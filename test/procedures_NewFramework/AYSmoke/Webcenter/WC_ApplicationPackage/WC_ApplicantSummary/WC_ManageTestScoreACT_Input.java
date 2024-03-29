package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
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
			String close = testdata[6];
						
			Reporter.log("Input Test Data was retrieved for 'Manage Test Score ACT' Page");
			waitForPageToLoadWebdriver();
			recentPopupSelectWebdriver("Parent");
			//recentPopupSelect_without_window_nameWebdriver();
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
				Thread.sleep(5000);
			}

							
			if(!savecancelclose.equals("")) {

				if (savecancelclose.equalsIgnoreCase("save")) {
					Reporter.log("Click on the button");
					clickWebdriver(attributeName_xpath, AS_TestScoreSave);

//				if(!close.equals("close")) { // Removed for this 70522 tc by saran kumar
//					Reporter.log("Click on the button");
//
//					clickWebdriver(attributeName_xpath, AS_CloseWindow);
//				} // Removed for this 70522 tc by saran kumar

					//recentPopupCloseWebdriver();
					//switchToSecondPopupWindow();
					//waitForPageToLoadWebdriver();
					//driver.switchTo().window(AppSummaryWindowName); // Removed for this 70522 tc by saran kumar
				} else if (savecancelclose.equalsIgnoreCase("Save+")) {
					Reporter.log("Click on the button");
					clickWebdriver(attributeName_xpath, AS_TestScoreSave);
					driver.close();
					switchToSecondPopupWindow();
				} else {
					Reporter.log("Click on the button");
					clickWebdriver(attributeName_xpath, AS_TestScoreSave);
					driver.close();
					driver.switchTo().window(AppSummaryWindowName);

				}
				//switchToDefaultContentWebdriver();

			}
			
		} catch (Exception e) {

			writeFailure(e.getLocalizedMessage());

		}


		
	}

}
