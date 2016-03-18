package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_EventList_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Event List' page")
	public void WC_EventList_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Event List' page");
			String[]  fpvdatarepo = datacontainer;
			String eventregister = fpvdatarepo[0];
			Reporter.log("Proceed to Test Data was retrieved for 'Event List' page");
			if (!eventregister.equals("")) {
				String EventRegister = Runtimedataread(eventregister);
				Reporter.log("Step 1 - Click the Register button based on Group Name as ("+EventRegister+")");
				waitForElementPresentWebdriverWait(attributeName_xpath, "//td[contains(text()[2],'"+EventRegister+"')]/a/img[@alt='Click here to register']", "Register Button");
				clickWebdriver(attributeName_xpath, "//td[contains(text()[2],'"+EventRegister+"')]/a/img[@alt='Click here to register']");
				waitForPageToLoadWebdriver();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}


