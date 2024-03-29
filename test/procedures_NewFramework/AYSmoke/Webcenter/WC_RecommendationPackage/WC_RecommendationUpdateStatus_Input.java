package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class WC_RecommendationUpdateStatus_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Recommendation Update Status' page")
	
	public void WC_RecommendationUpdateStatus_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation Update Status'Page");
			String[] testdata = datacontainer;
			String status = testdata[0];
			String date = testdata[1];
			String hour = testdata[2];
			String minutes = testdata[3];
			String saveclosewindow = testdata[4];
			String verifystatus = testdata[5];
			
			recentPopupSelect_without_window_nameWebdriver();
			
			if(!verifystatus.equals("")){
				Reporter.log("Verify("+verifystatus+")is present");
				waitForElementPresentWebdriver(attributeName_xpath, RUS_Status, verifystatus);
				verifyElementContainsTextWebdriver(attributeName_xpath, RUS_Status, status, verifystatus);
			}
			if(!status.equals("")){
				try{
				Reporter.log("Select the Status("+status+")");
				waitForElementPresentWebdriver(attributeName_xpath, RUS_Status, status);
				selectByVisibleTextWebdriver(attributeName_xpath, RUS_Status, status);
			}catch(Exception e){
					Reporter.log("Select the Status("+status+")");
					String Status = Runtimedataread(status);
					waitForElementPresentWebdriver(attributeName_xpath, RUS_Status, Status);
					selectByVisibleTextWebdriver(attributeName_xpath, RUS_Status, Status);
				}
			}

			
			if(!saveclosewindow.equals("")){
				Reporter.log("Click on the Button"+saveclosewindow);
				clickWebdriver(attributeName_xpath, RUS_CloseWindow+saveclosewindow+"')]");
				Thread.sleep(5000);
				System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
				switchToOldWindow();
               // switchToSecondPopupWindow();
				System.out.println("BBBBBBBBBBBBBBBBBBBBB");
				Thread.sleep(5000);
			}
			
			//driver.switchTo().window(RecommendationDTwindow);
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
			
			
}


