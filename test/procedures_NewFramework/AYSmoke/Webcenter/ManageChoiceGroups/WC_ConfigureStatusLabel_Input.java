package procedures_NewFramework.AYSmoke.Webcenter.ManageChoiceGroups;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

import java.util.concurrent.TimeUnit;

public class WC_ConfigureStatusLabel_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Manage Choice Groups' page")
	
	public void WC_ConfigureStatusLabel_Input(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Choice Groups'Page");
			
			String[] testdata = datacontainer;
			String showhideinstructions = testdata[0];
			String checkdelete = testdata[1];
			String linktoclick = testdata[2];
			String checkchoicegroup = testdata[3];
			String configurestatuslabellink =testdata[4];
			String adddeleteexportdynamiclist =testdata[5];
			String specialchoicegroups = testdata[6];
			String configuredynamicchoicegroups = testdata[7];
			String labels = testdata[8];

			implicitWait();

			try {
				switchToFrameNameIdWebdriver("frmContent");
			}catch(Exception e){
				System.out.println("Already in the frame");
			}
			if(!configurestatuslabellink.equals("")){
				Reporter.log("Click on the Link"+configurestatuslabellink);
				waitForElementPresentWebdriver(attributeName_xpath,MCG_ConfigureStatusLabel+configurestatuslabellink+"')]", configurestatuslabellink);
				clickWebdriver(attributeName_xpath, MCG_ConfigureStatusLabel+configurestatuslabellink+"')]");
			}
			if(!linktoclick.equals("")){
				Reporter.log("Click on the Link"+linktoclick);
				waitForPageToLoadWebdriver();
				clickWebdriver(attributeName_xpath, ER_linktoclick+linktoclick+"')]");
			}
			switchToDefaultContentWebdriver();	
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
	}	
}