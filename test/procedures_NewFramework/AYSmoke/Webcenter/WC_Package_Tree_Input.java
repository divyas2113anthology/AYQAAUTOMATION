package procedures_NewFramework.AYSmoke.Webcenter;

import com.thoughtworks.selenium.webdriven.commands.SelectFrame;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Package_Tree_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Configure Data Dictionary' page")
	public void WC_Package_Tree_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configure Data Dictionary' Page");
			String[] testdata = datacontainer;
			String logoutmain = testdata[0];
			String treepackage = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'Configure Data Dictionary' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
//			selenium.selectFrame("relative=up");
//			selenium.selectFrame("frmTreeMenu");
//			driver.switchTo().frame("relative=up");
//			driver.switchTo().frame("frmTreeMenu");\
//			switchToFrameNameIdWebdriver("relative=up");
			switchToFrameNameIdWebdriver("frmTreeMenu");
			if (!logoutmain.equals("")) {
				Reporter.log("Step 1 - Perform the operation to click the link as ["+logoutmain+"]");
				clickWebdriver(attributeName_linktext, logoutmain);
			}
			if (!treepackage.equals("")) {
				Reporter.log("Step 2 - Perform the operation to click the Package as ["+treepackage+"]");
//				waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='divTree']", "Package Page");
				String [] SplitPackage = treepackage.split(";");
				for (int i = 0; i < SplitPackage.length; i++) {
					writeConsole("Tree Package : "+SplitPackage[i]);
					if (i== SplitPackage.length-1) {
						clickWebdriver(attributeName_linktext, SplitPackage[i]);
						waitForPageToLoad();
					}else{
						System.out.println(SplitPackage[i]);
						PackageSelection(SplitPackage[i], "1");
						
					}
				}
				ClosePackageSelection();
			}
			switchToDefaultContentWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}



