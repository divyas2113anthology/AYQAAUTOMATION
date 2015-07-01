package procedures_NewFramework.AYSmoke.MaintenanceCenter;


import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class MC_SchedulePDFDelivery_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Schedule PDF Delivery' page")
	public void MC_SchedulePDFDelivery_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Schedule PDF Delivery' Page");
			String[] testdata = datacontainer;
			String addpdf = testdata[0];
			
			Reporter.log("Input Test Data was retrieved for 'Schedule PDF Delivery' Page");

			if (!addpdf.equals("")) {
				Reporter.log("Step 1 - Perform the operation to click the  Button as ["+addpdf+"]");
				waitForElementPresentWebdriver(attributeName_xpath, SPDF_AddPdf, addpdf);
				clickWebdriver(attributeName_xpath,SPDF_AddPdf);
			}			
			
//			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}	
	}
