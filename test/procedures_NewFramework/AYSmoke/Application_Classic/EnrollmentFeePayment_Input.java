package procedures_NewFramework.AYSmoke.Application_Classic;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.io.IOException;


public class EnrollmentFeePayment_Input extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Operation in 'Enrollment Fee Payment' page")
	public void EnrollmentFeePayment_Input() throws IOException, RowsExceededException, BiffException, WriteException{
		try {		
				writeDetails();
				String[]  accprofileidatarepo = datacontainer;
				Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment Fee Payment page");
				String paymentmethod = accprofileidatarepo[0];
				String returnpaycontinue = accprofileidatarepo[1];
				Reporter.log("Input Test Data was retrieved for 'Enrollment Fee Payment page");
				
				if (!paymentmethod.equals("")) {
					Reporter.log("Step 1 - Select the Payment Method as ("+paymentmethod+")");
					waitForPageToLoadWebdriver();
					//waitForElementPresentWebdriver(attributeName_xpath, "//td[font/label[contains(text(),'"+paymentmethod+"')]]/preceding-sibling::td/font/input[@type='radio']", paymentmethod);
					//clickWebdriver(attributeName_xpath, "//td[font/label[contains(text(),'"+paymentmethod+"')]]/preceding-sibling::td/font/input[@type='radio']");
					waitForElementPresentWebdriver(attributeName_xpath, "//label[contains(text(),'"+paymentmethod+"')]", paymentmethod);
					clickWebdriver(attributeName_xpath, "//label[contains(text(),'"+paymentmethod+"')]");
				}
				if (!returnpaycontinue.equals("")) {
					Reporter.log("Step 2 - Click on '"+returnpaycontinue+"' button");
					if (returnpaycontinue.equalsIgnoreCase("return to enrollment form")) {
						clickWebdriver(attributeName_xpath, EFP_ReturnEnrollBtn);
						waitForPageToLoadWebdriver();
					}else if (returnpaycontinue.equalsIgnoreCase("pay & continue")) {
						clickWebdriver(attributeName_xpath, EFP_PayAndContinue);
						alertAccept();
						waitForPageToLoadWebdriver();
					}
				}
				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}

