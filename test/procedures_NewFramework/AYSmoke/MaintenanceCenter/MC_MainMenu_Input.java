package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_MainMenu_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Main Menu' page")
	public void MC_MainMenu_Input(){
		try{
			Reporter.log("Proceed to click main menu link in Maintenance center");
			String[] testdata = datacontainer;
			String logout = testdata[0];
			String menu = testdata[1];
			Reporter.log("Check user click on Manage client link in Maintenance center");
			if (!logout.equals("")) {
				if (logout.equalsIgnoreCase("logout")) {
					click(MCL_Logoutbutton);
					waitForPageToLoad();
				}
			}
			if (!menu.equals("")) {
				Reporter.log("Step 2 - Click on Menu  ["+menu+"]");
				String [] splitPackage = menu.split(";");
				for (int i = 0; i < splitPackage.length; i++) {
					if (i == splitPackage.length-1) {
						waitForElementPresentWebdriverWait(attributeName_xpath,"//div[text()='"+splitPackage[i]+"']", splitPackage[i]);
						clickWebdriver(attributeName_xpath,"//div[text()='"+splitPackage[i]+"']");
						waitForPageToLoad();
					}else {
						mouseOver("//div[text()='"+splitPackage[i]+"']");		
					}
				}
//				clickWebdriver(attributeName_xpath, "//div[contains(text(),'"+menu+"')]");
//				waitForPageToLoad();
			}
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}
