package procedures_NewFramework.AYSmoke.Webcenter.ManageChoiceGroups;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ConfigureForms_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Enrollment' page")
	
	public void WC_ConfigureForms_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment'Page");
			
			String[] testdata = datacontainer;
			String linktoclick = testdata[0];
			String printdatatree = testdata[1];
			String menulink = testdata[2];
			switchToFrameNameIdWebdriver("frmTreeMenu");
			
			if(!linktoclick.equals("")){
				Reporter.log("Click on the Link"+linktoclick);
				clickWebdriver(attributeName_xpath, ER_linktoclick+linktoclick+"')]");
						
			}
			if (!menulink.equals("")) {
				Reporter.log("Perform the operation to click the Package as ["+menulink+"]");
				String [] SplitPackage = menulink.split(";");
				for (int i = 0; i < SplitPackage.length; i++) {
					
					//waitForElementPresentWebdriver(attributeName_xpath,"//*[text()='"+SplitPackage[i]+"']", "Page Name");
					if (i<= SplitPackage.length-1) {
						clickWebdriver(attributeName_xpath, MCG_PackageTree+SplitPackage[i]+"')]");
						waitForPageToLoadWebdriver();
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