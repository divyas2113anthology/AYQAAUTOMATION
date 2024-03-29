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
			String batchprintdate = testdata[0];
			String buttons = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'Batch Printing' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!batchprintdate.equals("")) {
				Reporter.log("Step 1 - Enter the Batch Print Date as ["+batchprintdate+"]");
				String EnrollmentDeadlineDate = requiredDateAndFormat("MM/dd/yyyy", batchprintdate);
				System.out.println(EnrollmentDeadlineDate);
				sendKeys(attributeName_name, "txtDateFrom", EnrollmentDeadlineDate);
			}
			if (!buttons.equals("")) {
				Reporter.log("Step 2 - Click the Name of the button as ["+buttons+"]");
				if (buttons.equalsIgnoreCase("Application Batches")) {
					waitForElementPresentWebdriver(attributeName_xpath, BP_ApplicationBatchs, buttons);
					clickWebdriver(attributeName_xpath, BP_ApplicationBatchs);
					waitForPageToLoadWebdriver();
				}else if (buttons.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, CI_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (buttons.equalsIgnoreCase("Delete")) {
					clickWebdriver(attributeName_xpath, SIE_DeleteBtn);
					waitForPageToLoadWebdriver();
				}else if (buttons.equalsIgnoreCase("Refresh")) {
					for (int i = 0; i <= 20; i++) {
						writeConsole("Refresh Ideration Started"+i);
						clickWebdriver(attributeName_xpath, BP_RefreshBtn);
						waitForPageToLoadWebdriver();
						if (isElementPresentWebdriver(attributeName_xpath, BP_ViewBtn)) {
							writeConsole("Refresh Ideration Ended"+i);
							waitForPageToLoadWebdriver();
							break;
						}
						waitForPageToLoadWebdriver();
					}
//					waitForElementPresentWebdriver(attributeName_xpath,BP_ViewBtn, buttons);
				}else if (buttons.equalsIgnoreCase("View")) {
					waitForElementPresentWebdriver(attributeName_xpath,BP_ViewBtn, buttons);
					clickWebdriver(attributeName_xpath, CL_ViewBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

