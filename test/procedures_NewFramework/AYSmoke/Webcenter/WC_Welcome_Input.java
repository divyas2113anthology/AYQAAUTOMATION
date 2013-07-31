package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Welcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Welcome' page")
	public void WC_Welcome_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Welcome' Page");
			String[] testdata = datacontainer;
			String weltopupdatelogout = testdata[0];
			String welpackage = testdata[1];
			String welmenulinks = testdata[2];
			String wellinks = testdata[3];
			
			Reporter.log("Input Test Data was retrieved for 'Welcome' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!weltopupdatelogout.equals("")) {
				Reporter.log("Step 1 - Click the link as ["+weltopupdatelogout+"]");
				clickWebdriver(attributeName_partiallinktext, weltopupdatelogout);
				waitForPageToLoadWebdriver();
			}
			if (!welpackage.equals("")) {
				Reporter.log("Step 2 - Select the Name of the Package as ["+welpackage+"]");
				String [] splitPackage = welpackage.split(";");
				for (int i = 0; i < splitPackage.length; i++) {
					if (i == splitPackage.length-1) {
						waitForElementPresentWebdriver(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']", "Page Name");
						clickWebdriver(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']");
						waitForPageToLoad();
					}else {
						mouseOver("//*[text()='"+splitPackage[i]+"']");		
					}
				}
			}			
			if (!welmenulinks.equals("")) {
				Reporter.log("Step 3 - Click the Name of the Menu Link as ["+welmenulinks+"]");
				if (welmenulinks.equalsIgnoreCase("Training")) {
					waitForElementPresentWebdriver(attributeName_partiallinktext, "Training", welmenulinks);
					clickWebdriver(attributeName_partiallinktext, "Training");
					waitForPageToLoad();
				}
			}	
			if (!wellinks.equals("")) {
				Reporter.log("Step 4 - Click the Name of the Link as ["+wellinks+"]");
				if (wellinks.equalsIgnoreCase("logout")) {
					clickWebdriver(attributeName_xpath,WebcenteLogout);
					waitForPageToLoad();
				}else if (wellinks.equalsIgnoreCase("online support top")) {
					clickWebdriver(attributeName_xpath, WebcenteOnlineSupportTop);
					recentPopupSelectWebdriver("Online Support");
				}else if (wellinks.equalsIgnoreCase("online support bottom")) {
					clickWebdriver(attributeName_xpath, WebcenteOnlineSupportBottom);
					recentPopupSelectWebdriver("Online Support");
				}else if (wellinks.equalsIgnoreCase("Product Suggestions")) {
					clickWebdriver(attributeName_xpath, WebcenteProdSug);
					recentPopupSelectWebdriver("Product Suggestions");
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
