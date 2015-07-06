package procedures_NewFramework.AYSmoke.Webcenter.WC_RecommendationPackage;


import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_RecommendationProviderInformation extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Recommendation Provider Information' window")
	public void WC_RecommendationProviderInformation(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Recommendation Provider Information' window");
			String[] testdata = datacontainer;
			String Email = testdata[0];
			String renotify = testdata[1];
			String recommendationsystemurl = testdata[2];
			String online = testdata[3];
			String recommendationstartdate = testdata[4];
			String closewindow = testdata[5];
			
			Reporter.log("Input Test Data was retrieved for 'Recommendation Provider Information' window");

			if (!recommendationstartdate.equals("")) {
				Reporter.log("Verify the Recommendation Start Date as ["+recommendationstartdate+"]");
				waitForElementPresentWebdriver(attributeName_xpath, RD_RecStartDate, recommendationstartdate);
				verifyElementContainsTextWebdriver(attributeName_xpath, RD_RecStartDate,recommendationstartdate,recommendationstartdate);
			}
			if (!closewindow.equals("")) {
				Reporter.log("Perform the operation to click the  Button as ["+closewindow+"]");
				clickWebdriver(attributeName_xpath,RD_CloseWindow);
				selectMainWindowWebdriver();
			}			
			
			
//			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}	
	}
