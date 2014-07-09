package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_ApplicationFee_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Application Fee' page")
	public void WC_ApplicationFee_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Application Fee' Page");
			String[] testdata = datacontainer;
			String payment_type = testdata[0];
			String payment_amount = testdata[1];
			String payment_status = testdata[2];
			String payment_amount_received = testdata[3];
			String payment_received_date = testdata[4];
			String button_to_click = testdata[5];
			Reporter.log("Input Test Data was retrieved for 'Application Fee' Page");
			if (!payment_type.equals("")) {
				Reporter.log("Select the payment type as ["+payment_type+"]");
				selectByVisibleTextWebdriver(attributeName_name, "ChangePaymentType", payment_type);
			}
			if (!payment_amount.equals("")) {
				Reporter.log("Enter the first name as ["+payment_amount+"]");
				sendKeys(attributeName_name, "pmtAmount", payment_amount);
			}
			if (!payment_status.equals("")) {
				Reporter.log("Select the payment status as ["+payment_status+"]");
				selectByVisibleTextWebdriver(attributeName_name, "pmtstatus", payment_status);
			}
			if (!payment_amount_received.equals("")) {
				Reporter.log("Enter the first name as ["+payment_amount_received+"]");
				sendKeys(attributeName_name, "pmtAmount", payment_amount_received);
			}
			if (!payment_received_date.equals("")) {
				Reporter.log("Enter the first name as ["+payment_received_date+"]");
				sendKeys(attributeName_name, "pmtdt", payment_received_date);
			}
			if (!button_to_click.equals("")) {
				Reporter.log("Click the button as ["+button_to_click+"]");
				if (button_to_click.equalsIgnoreCase("save")) {
					waitForElementPresentWebdriver(attributeName_xpath, WCL_Savebutton, button_to_click);
					clickWebdriver(attributeName_xpath, WCL_Savebutton);
					waitForPageToLoadWebdriver();
				}else if (button_to_click.equalsIgnoreCase("cancel")) {
					clickWebdriver(attributeName_xpath, WCL_Cancelbutton);	
					waitForPageToLoadWebdriver();
				}else if (button_to_click.equalsIgnoreCase("close window")) {
					clickWebdriver(attributeName_xpath, AS_CloseWindow);	
					selectMainWindowWebdriver();
				}else if (button_to_click.equalsIgnoreCase("add")) {
					clickWebdriver(attributeName_xpath, MSR_AddBtn);
					waitForPageToLoadWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}