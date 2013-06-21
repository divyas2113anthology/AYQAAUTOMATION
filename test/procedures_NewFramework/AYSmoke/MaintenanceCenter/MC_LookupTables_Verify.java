package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_LookupTables_Verify extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Maintanence Center' page")
	public void MC_LookupTables_Verify()throws Exception{
		try{
			Reporter.log("Proceed to verify sucessfully login to Maintenance center");
			String[] testdata = datacontainer;
			String message = testdata[0];
			String pagecontent = testdata[1];
			Reporter.log("Check login to Maintenance center");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify message is ["+message+"]");
				verifyTextPresent(message);				
			}
			if (!pagecontent.equals("")) {
				Reporter.log("Step 2 - Verify page Content in the LookUp page");
				if (pagecontent.contains("SELECT 'AY_EpaymentVendor")) {
					waitForElementPresentWebdriver(attributeName_xpath, "//span[@id='lblSQL']", "SQL Message");
					String replacepage = pagecontent.replace(";", ",");
					verifyElementContainsTextWebdriver(attributeName_xpath, "//span[@id='lblSQL']", replacepage, "Payment Vendar Details");
				}else if (pagecontent.contains("ePaymentVendorID")) {
					verifyElementContainsTextWebdriver(attributeName_xpath, "//table[@id='dgLookupTable']/tbody/tr", pagecontent, "Modified Page Header");
				}			
			}
		
		}catch(Exception e){
			writeFailure(e.getLocalizedMessage());
		}
	}

}

