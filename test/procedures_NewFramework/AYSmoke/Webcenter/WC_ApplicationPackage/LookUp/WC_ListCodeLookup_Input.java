package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.LookUp;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ListCodeLookup_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some input in 'List Code Lookup' page")
		public void WC_ListCodeLookup_Input() throws Exception{
		try {
			writeDetails();

			Reporter.log("Proceed to retrieve input Test Data 'List Code Lookup' page");
			String[]  fpvdatarepo = datacontainer;
			String Lookupname = fpvdatarepo[0];
			String addedit = fpvdatarepo[1];
			
			Reporter.log("Verify Test Data was retrieved for 'List Code Lookup' page");
			if (!Lookupname.equals("")) {
				Reporter.log("Step 1 - Verify Code Lookup name was displayed correctly");
				clickWebdriver(attributeName_xpath, CL_LookupTName);
			}
			if (!addedit.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+addedit+") page");
				clickWebdriver(attributeName_xpath, CL_AddEdit+addedit+"')]");
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}

}
