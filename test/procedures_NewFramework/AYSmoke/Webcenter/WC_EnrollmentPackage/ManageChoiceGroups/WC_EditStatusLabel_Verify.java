package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.ManageChoiceGroups;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_EditStatusLabel_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some verify operation in 'Edit Status Label' page")
	
	public void WC_EditStatusLabel_Verify(){
		
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Edit Status Label'Page");
			
			String[] testdata = datacontainer;
			String verifyui = testdata[0];
			String label_value = testdata[1];

			switchToFrameNameIdWebdriver("frmContent");
			//switchToFrameIndexWebdriver(1);

			if(!verifyui.equals("")){
				Reporter.log("Verify its navigate to ("+verifyui+") page");
				waitForElementPresentWebdriver(attributeName_xpath, verifyUI, verifyui);
				//verifyElementPresentWebdriver(attributeName_xpath, "//font[contains(text(),'Edit')]", verifyui);
			}

			if(!label_value.equals("")){
				String Status = Runtimedataread(label_value);
				verifyElementPresentWebdriver(attributeName_xpath, labelValue+Status+"']",label_value );
			}
			//switchToDefaultContentWebdriver();
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
		}
}