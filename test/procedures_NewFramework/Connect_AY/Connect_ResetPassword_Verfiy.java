package procedures_NewFramework.Connect_AY;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_ResetPassword_Verfiy extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to Verify the some Operation in 'Reset Password' page")
	public void Connect_ResetPassword_Verfiy() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to verify Test Data in Reset password verify");
			String[]  fpdatarepo = datacontainer;
			String message = fpdatarepo[0];
			String verifyui = fpdatarepo[1];
			Reporter.log("Verify Test Data was retrieved for 'Reset Password' page");
			String myWindowHandle = driver.getWindowHandle();
//			Reporter.log("aaaa"+myWindowHandle);
//			driver.switchTo().window(myWindowHandle);
			if (!message.equals("")) {
				Reporter.log("Proceed to Verify the '"+message+"' 'Reset Password' page");
//				verifyTextPresent(message);
				//waitForElementPresentWebdriver(attributeName_xpath, "//p[contains(text(),'"+message+"')]", message);
				waitForElementPresentWebdriver(attributeName_xpath, "//p[contains(text(),'Enter a new password in both fields below.')]",message);
				verifyElementContainsTextWebdriver(attributeName_xpath, "//p[contains(text(),'"+message+"')]", message, "Success Message");
			}
			if (!verifyui.equals("")) {
				Reporter.log("Proceed to Verify the '"+message+"' 'Reset Password' page");
//				verifyTextPresent(message);
				//waitForElementPresentWebdriver(attributeName_xpath, "//p[contains(text(),'"+message+"')]", message);
				waitForElementPresentWebdriverWait(attributeName_xpath, "//div[contains(text(),'"+verifyui+"')]", verifyui);
				verifyElementContainsTextWebdriver(attributeName_xpath, "//div[contains(text(),'"+verifyui+"')]", verifyui, "Success Message");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}


}
