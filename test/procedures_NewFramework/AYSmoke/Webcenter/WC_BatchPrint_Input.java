package procedures_NewFramework.AYSmoke.Webcenter;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_BatchPrint_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Batch Printing' page")
	public void WC_BatchPrint_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Batch Printing' Page");
			String[] testdata = datacontainer;
			String buttons = testdata[0];
			Reporter.log("Input Test Data was retrieved for 'Batch Printing' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!buttons.equals("")) {
				Reporter.log("Step 1 - Click the Name of the button as ["+buttons+"]");
				if (!buttons.equalsIgnoreCase("Application Batches")) {
					clickWebdriver(attributeName_xpath, BP_ApplicationBatchs);
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

