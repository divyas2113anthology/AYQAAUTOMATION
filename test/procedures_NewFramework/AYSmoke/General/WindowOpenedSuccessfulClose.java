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
					waitForElementPresentWebdriver(attributeName_xpath, "//div[@class='narrowSearch']/h2", contents);
					verifyElementPresentWebdriver(attributeName_xpath, "//div[@class='narrowSearch']/h2", contents);
				}else if (contents.equalsIgnoreCase("Navigation Overview") || contents.equalsIgnoreCase("Technical Tips") || contents.equalsIgnoreCase("Terms of Use")) {
					waitForPageToLoadWebdriver();
					writeConsole(contents);
				}else if (contents.equalsIgnoreCase("My Events/Interviews")) {
					waitForPageToLoadWebdriver();
					writeConsole(contents);
				}else{
					waitForPageToLoadWebdriver();
					writeConsole(contents);
				}
			}
			if (!closewindow.equals("")) {
				Reporter.log("Proceed to Close the Popup Window");	
				if (closewindow.equalsIgnoreCase("Close Window")) {
					clickWebdriver(attributeName_xpath, AS_CloseWindow);
					deselectPopUp();	
				}else if (closewindow.equalsIgnoreCase("Close")) {
					Iterator<String> windowsname = driver.getWindowHandles().iterator();
					String parentWindow =windowsname.next();
					recentOpenedPopupSelectWebdriver(parentWindow);
					driver.close();
					//selectMainWindowWebdriver();
				}else if (closewindow.equalsIgnoreCase("CloseWindow")) {
					clickWebdriver(attributeName_xpath, ApplicantCloseWindow);
					recentOpenedPopupSelectWebdriver("Select Previous Window");
//					selectMainWindowWebdriver();
				}else if(closewindow.equalsIgnoreCase("CloseAll")){
					//clickWebdriver(attributeName_xpath, AS_CloseWindow);
					Iterator<String> windowsname = driver.getWindowHandles().iterator();
					String parentWindow = windowsname.next();
					while (windowsname.hasNext()) {
						if(!parentWindow.equals(windowsname.hasNext())){
							driver.switchTo().window(windowsname.next());
							driver.close();
						}
					}
					driver.switchTo().window(parentWindow);
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

