package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;


import or.OR;

import org.openqa.selenium.Alert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_RecommendationSearchResult_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation Search Result' page")
	
	public void WC_RecommendationSearchResult_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation Search Result'Page");
			String[] testdata = datacontainer;
			String operationtoperform = testdata[0];
			String applicantcheck = testdata[1];
			String applicantclick = testdata[2];
			String pdf = testdata[3];
			String selectaction = testdata[4];
			String apply = testdata[5];
			String buttons = testdata[6];
			
			if (!applicantcheck.equals("")) {
				Reporter.log("Perform the operation to check the checkbox as ["+applicantcheck+"]");
				try {
					applicantcheck = Runtimedataread(applicantcheck);
				}catch (Exception e){
					applicantcheck = applicantcheck;
				}

				waitForElementPresentWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+applicantcheck+"')]]/preceding-sibling::td/input[@type='checkbox']", applicantcheck);
				checkWebdriver(attributeName_xpath, "//td[a[contains(text(),'"+applicantcheck+"')]]/preceding-sibling::td/input[@type='checkbox']");
			}	
			if (!applicantclick.equals("")) {
				Reporter.log("Click on Rule name ["+applicantclick+"]");
				try {
					applicantclick = Runtimedataread(applicantclick);
				}catch (Exception e){
					applicantclick = applicantclick;
				}
				waitForElementPresentWebdriver(attributeName_xpath, ES_ApplicantClick+applicantclick+"')]", applicantclick);
				clickWebdriver(attributeName_xpath,ES_ApplicantClick+applicantclick+"')]" );
				recentPopupSelectWebdriver("Recommendation");
			}
			if (!selectaction.equals("")) {
				Reporter.log("Select an action as ["+selectaction+"]");
				selectByVisibleTextWebdriver(attributeName_xpath, ASR_SelectanAction, selectaction);
			}	
			if (!apply.equals("")) {
				Reporter.log("Select the Radio button as ["+apply+"]");
				if (apply.equalsIgnoreCase("Apply to Selected")) {
					clickWebdriver(attributeName_xpath, ASR_ApplySelected);
				}else if (apply.equalsIgnoreCase("Apply to All")) {
					clickWebdriver(attributeName_xpath, ASR_ApplyAll);
				}else if (apply.equalsIgnoreCase("Ascending")) {
					clickWebdriver(attributeName_xpath, ASR_Ascending);
				}else if (apply.equalsIgnoreCase("Descending")) {
					clickWebdriver(attributeName_xpath, ASR_Descending);
				}
			}
			if (!buttons.equals("")) {
				Reporter.log("Click button as ["+buttons+"]");
				
				if (buttons.equalsIgnoreCase("New Search")) {
					waitForElementPresentWebdriver(attributeName_xpath, ASR_NewSearchbtn,"NewSearch");
					clickWebdriver(attributeName_xpath, ASR_NewSearchbtn);
					System.out.println("aaaa");
				}else if (buttons.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
				}else if (buttons.equalsIgnoreCase("Go")) {
					clickWebdriver(attributeName_xpath, ASR_GoBtn);
//					Actions action = new Actions(driver);
//					action.sendKeys(Keys.RETURN);
//					action.perform();
					waitForPageToLoadWebdriver();
					try {
				        Alert alert = driver.switchTo().alert();
				        String AlertText = alert.getText();
				        System.out.println(AlertText);
				        alert.accept();
				    } catch (Exception e) {
				        System.out.println("no alert");
				    }
					waitForPageToLoadWebdriver();
					//driver.switchTo().alert().accept();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}
