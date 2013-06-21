package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.InviteEvent;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;
public class WC_EventSummary_Input  extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some Operation on 'Event Summary' Page")
	public void WC_EventSummary_Input(){
		try {
			writeDetails();
			Reporter.log("This procedure is used to input in Event Summary");
			String[] testdata = datacontainer;
			String linkcontains = testdata[0];
			String returntoeventhome = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'Event Summary' Page");
			if (!linkcontains.equals("")) {
				Reporter.log("Step 1 - Click the URL link as ["+linkcontains+"]");
				clickWebdriver(attributeName_xpath, ES_UrlLink+"')]");
			}
			if (!returntoeventhome.equals("")) {
				Reporter.log("Step 2 - Click the link as ["+returntoeventhome+"]");
				clickWebdriver(attributeName_xpath, ES_ReturnHome);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}

