package procedures_NewFramework.AYSmoke.General;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.util.Iterator;
import java.util.Set;

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
					//waitForText(contents, "Text not present");
					waitForPageToLoadWebdriver();
					writeConsole(contents);
				}else if (contents.equalsIgnoreCase("My Events/Interviews")) {
					//waitForText(contents, "Text not present");
					waitForPageToLoadWebdriver();
					writeConsole(contents);
				}else{
					//waitForText(contents, contents);
					waitForPageToLoadWebdriver();
					writeConsole(contents);
				}
//				waitForElementPresentWebdriver(attributeName_xpath, MoreDetails, contents);
//				verifyElementPresentWebdriver(attributeName_xpath, MoreDetails, contents);
//				verifyElementVisibleContainsText(attributeName_xpath, MoreDetails, contents);
			}
			if (!closewindow.equals("")) {
				Reporter.log("Proceed to Close the Popup Window");	
				if (closewindow.equalsIgnoreCase("Close Window")) {
					/*clickWebdriver(attributeName_xpath, Close_Window_Manual);
					recentOpenedPopupSelectWebdriver("Select Previous Window");*/
//					selectMainWindowWebdriver();
					clickWebdriver(attributeName_xpath, AS_CloseWindow);
					deselectPopUp();	
				}else if (closewindow.equalsIgnoreCase("Close")) {
					//recentPopupCloseWebdriver();
					//closeAllOtherWindows();
					Thread.sleep(9000);
					String winHandleBefore = driver.getWindowHandle();
                    //Switch to new window opened
					for (String winHandle : driver.getWindowHandles()) {
						driver.switchTo().window(winHandle);
					}
                    // Perform the actions on new window
					//driver.close(); //this will close new opened window
					Thread.sleep(9000);
                      //switch back to main window using this code
					driver.switchTo().window(winHandleBefore);
					//driver.findElementByXPath("//h3[text()='Update Profile']//preceding-sibling::button[@class='close']").click();
					waitForPageToLoadWebdriver();
					Thread.sleep(9000);
					//selectMainWindowWebdriver();
				}else if (closewindow.equalsIgnoreCase("CloseWindow")) {
					clickWebdriver(attributeName_xpath, ApplicantCloseWindow);
					recentOpenedPopupSelectWebdriver("Select Previous Window");
//					selectMainWindowWebdriver();
				}else if(closewindow.equalsIgnoreCase("CloseAll")){
					clickWebdriver(attributeName_xpath, AS_CloseWindow);
					deselectPopUp();
					System.out.println("1st popup closed");
					recentPopupSelect("Applicant Summary");
					clickWebdriver(attributeName_xpath, AS_CloseWindow);
					deselectPopUp();	
					System.out.println("2nd popup closed");
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

