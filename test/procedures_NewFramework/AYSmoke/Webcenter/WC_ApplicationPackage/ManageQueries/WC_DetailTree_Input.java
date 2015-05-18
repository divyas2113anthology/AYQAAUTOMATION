package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ManageQueries;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_DetailTree_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Manage Queries Detail Tree' page")
	public void WC_DetailTree_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage Queries Detail Tree' page");
			String[]  testdata = datacontainer;
			String detailtree = testdata[0];
			
			Reporter.log("Input Test Data was retrieved for 'Manage Queries' page");
			if (!detailtree.equals("")) {
				Reporter.log("Click on ["+detailtree+"]");
				clickWebdriver(attributeName_xpath, MQ_DetailTree+detailtree+"')]");
				waitForPageToLoadWebdriver();
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}