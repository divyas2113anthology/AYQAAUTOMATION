package procedures_NewFramework.Connect_AY;

import or.OR;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Connect_ResetPassword_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Reset Password' page")
	public void Connect_ResetPassword_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Test Data in Reset password input");
			String[]  fpdatarepo = datacontainer;
			String password = fpdatarepo[0];
			String confirmpassword = fpdatarepo[1];
			String okcancel = fpdatarepo[2];
			Reporter.log("Enter the Password and Confirm Password");
			
			if (!password.equals("")) {
				Reporter.log("Step 1 - Enter Password as ("+password+")");
				
				sendKeys(attributeName_xpath,"//tbody/tr/td/input[@id='clearTextPwd']",password);
			}
			if (!confirmpassword.equals("")) {
				Reporter.log("Step 2 - Enter Confirm Password ("+confirmpassword+")");
				sendKeys(attributeName_xpath,"//tbody/tr/td/input[@id='confirm']",confirmpassword);
			}
			if (!okcancel.equals("")) {
				Reporter.log("Step 3 - Click on ("+okcancel+") Button");
//				if (okcancel.equalsIgnoreCase("OK")) {
//					click(RPI_submit);
					clickWebdriver(attributeName_name, "okButton");
					try{
					if(isDisplayedWebdriver(attributeName_id, "messagePanel")) {
						String error = getTextWebdriver(attributeName_id, "messagePanel");
						if (okcancel.equalsIgnoreCase(error)) {
							sendKeys(attributeName_xpath, RP_password, "Aaaa111!");
							sendKeys(attributeName_xpath, RP_ResetPwd, "Aaaa111!");
							clickWebdriver(attributeName_name, "okButton");
							//waitForElementPresentWebdriver(attributeName_xpath, "//p", "Reset Password Page");
						}
					}
					}catch(Exception e){
						System.out.println("==========Not display");
					}
//				}
			}
			} catch (Exception e) {
				writeFailure(e.getLocalizedMessage());
			}
		}
	
}
