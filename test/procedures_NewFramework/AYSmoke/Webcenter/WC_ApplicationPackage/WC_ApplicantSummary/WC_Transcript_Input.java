package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
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
			
			recentPopupSelect_without_window_nameWebdriver();	
			Reporter.log("Input Test Data was retrieved for 'Transcript' Page");
			if (!universityname.equals("")) {
				Reporter.log("Enter the First Name");
				sendKeys(attributeName_xpath, AS_TestScoreSchoolName, universityname);
			}
			if(!status.equals("")){
				Reporter.log("Verify("+status+")is present");
				try{
					String Status = Runtimedataread(status);
					waitForElementPresentWebdriver(attributeName_xpath, AS_TranscriptStatus, Status);
					selectByVisibleTextWebdriver(attributeName_xpath, AS_TranscriptStatus, Status);
				}catch(Exception e){
					waitForElementPresentWebdriver(attributeName_xpath, AS_TranscriptStatus, status);
					selectByVisibleTextWebdriver(attributeName_xpath, AS_TranscriptStatus, status);
				}
				//verifyElementContainsTextWebdriver(attributeName_xpath, AS_TranscriptStatus, status, status);
			}
			if(!saveclosewindow.equals("")){
				Reporter.log("Click on the Button"+saveclosewindow);
				if(saveclosewindow.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AS_SupportingDocCloseWindow + saveclosewindow + "')]");
					//recentPopupSelectWebdriver("TestScoreACT");
					clickWebdriver(attributeName_xpath, AS_CloseWindow);
					switchToSecondPopupWindow();
					waitForPageToLoadWebdriver();
				}
				//recentPopupCloseWebdriver();
				else if(saveclosewindow.equalsIgnoreCase("closeWindow")){
					Reporter.log("Click on the button");
					waitForPageToLoadWebdriver();
					clickWebdriver(attributeName_xpath,CloseWindow);
					driver.switchTo().window(AppSummaryWindowName);
				}else {
					Reporter.log("Click on the Button" + saveclosewindow);
					clickWebdriver(attributeName_xpath,"//img[contains(@src,'save')]");
					waitForPageToLoadWebdriver();
					clickWebdriver(attributeName_xpath,CloseWindow); //add for 70493 tc saran 27nov 2023
					driver.switchTo().window(AppSummaryWindowName);
					//recentPopupCloseWebdriver();
				}
			}
			//switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}



