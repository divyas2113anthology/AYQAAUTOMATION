package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_HomePage_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This procedure is used to click on Main menu list item, Navigation menu list item")
	public void Connect_HomePage_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Connect Main menu list item");
			String[] testdata = datacontainer;
			String mainmenulist = testdata[0];
			String navigationlink = testdata[1];
			
			Reporter.log("Input Test Data was retrieved for 'Connect Main Menu' Page");
			if (!mainmenulist.equals("")) {
				Reporter.log("Step 1 - Click the link as ["+mainmenulist+"]");
				clickWebdriver(attributeName_partiallinktext, mainmenulist);
				waitForPageToLoadWebdriver();
			}

			if (!navigationlink.equals("")) {
				Reporter.log("Step 2 - Click the link as ["+navigationlink+"]");
				clickWebdriver(attributeName_xpath, "//div[text()='jyothsna reddy1']");
				Thread.sleep(5000);
				mouseOverWebdriver(attributeName_xpath, "//a[text()='Update Profile']");
				Thread.sleep(5000);
				clickWebdriver(attributeName_xpath, "//a[text()='Update Profile']");
				waitForPageToLoadWebdriver();
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
