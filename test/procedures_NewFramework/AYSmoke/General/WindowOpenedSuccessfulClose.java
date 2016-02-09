package procedures_NewFramework.AYSmoke.General;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;

import java.util.Iterator;
import java.util.Set;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WindowOpenedSuccessfulClose extends CommonSeleniumActions implements	OR {
	
	@Test(description="This Procedure is used to Close the Window and select Application Main Window")	
	public void WindowOpenedSuccessfulClose(){
		Set<String> set = driver.getWindowHandles();
		Iterator<String> it = set.iterator();
		String parent = it.next();
		String child = it.next();
		try {
			writeDetails();			
			Reporter.log("Close the Application window");
			String[]  fpvdatarepo = datacontainer;
			String contents = fpvdatarepo[0];
			String closewindow = fpvdatarepo[1];
			Reporter.log("Close the Popup Window and navigate to main window");
			if (!contents.equals("")) {
				if (contents.equalsIgnoreCase("Support Center")) {
//					environment = Runtimedataread("Instance");
//					if (contents.contains("Center")) {
//						if (environment.equalsIgnoreCase("UKQA") || environment.equalsIgnoreCase("UKPR")) {
//							contents = contents.replace("Center", "Centre");
//						}
//					}
					waitForElementPresentWebdriver(attributeName_xpath, "//div[@class='narrowSearch']/h2", contents);
					verifyElementPresentWebdriver(attributeName_xpath, "//div[@class='narrowSearch']/h2", contents);
				}else if (contents.equalsIgnoreCase("Navigation Overview") || contents.equalsIgnoreCase("Technical Tips") || contents.equalsIgnoreCase("Terms of Use")) {
					waitForText(contents, "Text not present");
					verifyTextPresent(contents);
				}else if (contents.equalsIgnoreCase("My Events/Interviews")) {
					waitForText(contents, "Text not present");
					verifyTextPresent(contents);
				}else{
					waitForText(contents, contents);
					verifyTextPresent(contents);
				}
//				waitForElementPresentWebdriver(attributeName_xpath, MoreDetails, contents);
//				verifyElementPresentWebdriver(attributeName_xpath, MoreDetails, contents);
//				verifyElementVisibleContainsText(attributeName_xpath, MoreDetails, contents);
			}
			if (!closewindow.equals("")) {
				Reporter.log("Proceed to Close the Popup Window");	
				if (closewindow.equalsIgnoreCase("Close Window")) {
					clickWebdriver(attributeName_xpath, CloseWindow);
					recentOpenedPopupSelectWebdriver("Select Previous Window");
//					selectMainWindowWebdriver();
				}else if (closewindow.equalsIgnoreCase("Close")) {
					closeWindowWebdriver();
					/*waitForElementPresentWebdriver(attributeName_xpath, CloseWindow,closewindow);
					clickWebdriver(attributeName_xpath, CloseWindow);*/
					recentOpenedPopupSelectWebdriver("Select Previous Window");
					//selectMainWindowWebdriver(); 08/02
//					recentOpenedPopupSelectWebdriver("Select Previous Window");
//					selectMainWindowWebdriver();
				}else if (closewindow.equalsIgnoreCase("CloseWindow")) {
					clickWebdriver(attributeName_xpath, ApplicantCloseWindow);
					recentOpenedPopupSelectWebdriver("Select Previous Window");
//					selectMainWindowWebdriver();
				}
			}	
//			selectMainWindowWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		try{
			driver.switchTo().window(parent);
		}catch(Exception e)
		{
			driver.switchTo().window(child);
		}
		
	}


}

