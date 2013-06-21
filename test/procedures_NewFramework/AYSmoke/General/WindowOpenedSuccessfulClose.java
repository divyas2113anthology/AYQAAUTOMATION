package procedures_NewFramework.AYSmoke.General;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WindowOpenedSuccessfulClose extends CommonSeleniumActions implements	OR {
	
	@Test(description="This Procedure is used to Close the Window and select Application Main Window")	
	public void WindowOpenedSuccessfulClose(){
		try {
			writeDetails();			
			Reporter.log("Close the Application window");
			String[]  fpvdatarepo = datacontainer;
			String contents = fpvdatarepo[0];
			String closewindow = fpvdatarepo[1];
			Reporter.log("Close the Popup Window and navigate to main window");
			if (!contents.equals("")) {
				waitForElementPresentWebdriver(attributeName_xpath, MoreDetails, contents);
				verifyElementPresentWebdriver(attributeName_xpath, MoreDetails, contents);
//				verifyElementVisibleContainsText(attributeName_xpath, MoreDetails, contents);
			}
			if (!closewindow.equals("")) {
				Reporter.log("Proceed to Close the Popup Window");	
				if (closewindow.equalsIgnoreCase("Close Window")) {
					clickWebdriver(attributeName_xpath, CloseWindow);
					selectMainWindowWebdriver();
				}else if (closewindow.equalsIgnoreCase("Close")) {
					closeWindowWebdriver();
					selectMainWindowWebdriver();
				}else if (closewindow.equalsIgnoreCase("CloseWindow")) {
					clickWebdriver(attributeName_xpath, ApplicantCloseWindow);
					selectMainWindowWebdriver();
				}
			}	
//			selectMainWindowWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}


}

