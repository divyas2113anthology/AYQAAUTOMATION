package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class WC_Package_AddEdit_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Configure Forms-Package' page")
	public void WC_Package_AddEdit_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configure Forms-Package' Page");
			String[] testdata = datacontainer;
			String publishprodevcancel = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'Configure Forms-Package' Page");
			switchToFrameNameIdWebdriver("frmContent");
			if(!publishprodevcancel.equals("")){
				Reporter.log("Click on the Button"+publishprodevcancel);
				clickWebdriver(attributeName_xpath, MCG_Package+publishprodevcancel+"')]");
				alertAccept();
				Thread.sleep(20000);

			}	
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}



