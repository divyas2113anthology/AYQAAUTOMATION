package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.DynamicText;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;


import processor.CommonSeleniumActions;


public class WC_ConfigureDynamicText_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'Configure Dynamic Text' page")
	public void WC_ConfigureDynamicText_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configure Dynamic Text' page");
			String[]  applicantwelidatarepo = datacontainer;
			String editcreatetext = applicantwelidatarepo[0];
			String instructionscreen = applicantwelidatarepo[1];
			String adddelete = applicantwelidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Configure Dynamic Text' page");
			
			if (!editcreatetext.equals("")) {
				Reporter.log("Step 1 - Perform the operation to click["+editcreatetext+"]");
				clickWebdriver(attributeName_xpath, CDT_CreateEditText+editcreatetext+"')]/following-sibling::td/a[contains(text(),'Text')]");
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}


