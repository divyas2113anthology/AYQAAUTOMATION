package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_UserLogin_Input extends CommonSeleniumActions implements OR {
	public static String environment;
	@Test(description="This Procedure is to perform some operation in 'Application Login' page")
	public void FC_UserLogin_Input () throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Application Login' page");
		String pin = parameterValuesArray[0];
		String password = parameterValuesArray[1];
		String login = parameterValuesArray[2];
		String forgotpin = parameterValuesArray[3];
		environment = Runtimedataread("Instance");
		System.out.println("Environment"+environment);
		Reporter.log("Input Test Data was retrieved for 'Application Login' page");
		if (environment.equalsIgnoreCase("USQA") && pin.equals("8KSJ2FD9G36")) {
//			if (pin.equals("8KSJ2FD9G36") || pin.equals("N3M6633823N")) {
			System.out.println("sdfsdfsdfs");
			Reporter.log("Step 1 - Proceed to Enter PIN as ("+pin+")");
			//(attributeName_xpath, UL_PinField, "Pin");
			//waitForPageToLoad();
			waitForElementPresentWebdriver(attributeName_xpath, UL_PinField, "PIN");
			//type(UL_PinField, pin);
			System.out.println(pin);
			sendKeys(attributeName_xpath, UL_PinField, pin);
						
		}
		else if (environment.equalsIgnoreCase("UKQA") && pin.equals("8KSJ2FD9G36")) {
//			if (pin.equals("8KSJ2FD9G36") || pin.equals("N3M6633823N")) {
			System.out.println("sdfsdfsdfs");
			Reporter.log("Step 1 - Proceed to Enter PIN as ("+pin+")");
			waitForElementPresentWebdriver(attributeName_xpath, UL_PinField, "Pin");
			//type(UL_PinField, "N3M6633823N");
			sendKeys(attributeName_xpath, UL_PinField, pin);
						
		}
		else if (!pin.equals("")) {
			Reporter.log("Step 1 - Proceed to Read PIN from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generatepin = Runtimedataread(pin);
			Reporter.log("Step 2 - Proceed to Enter PIN as ("+generatepin+")");
			type(UL_PinField, generatepin);			
						
		}
		if (password.equals("Auto123+")) {
			Reporter.log("Step 2 - Proceed to Enter PIN as ("+password+")");		
			type(UL_PswdField, password);
			
		}else if (!password.equals("")) {
			Reporter.log("Step 3 - Proceed to Read Password from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generatepassword = Runtimedataread(password);
			Reporter.log("Step 4 - Proceed to Enter PIN as ("+generatepassword+")");		
			type(UL_PswdField, generatepassword);
			
		}
		if (!login.equals("")) {
			Reporter.log("Step 5 - Click on 'Login' Button");
			if (login.equalsIgnoreCase("login")) {
				click(UL_Login);
				/*waitForElementPresentWebdriver(attributeName_cssselector, DB_PageTitle, "My Applications");	
				waitForPageToLoad();*/
			}			
		}
		if (!forgotpin.equals("")) {
			Reporter.log("Step 6 - Click on 'Forgot your PIN or Password?' Button");
//			if (forgotpin.equalsIgnoreCase("Forgot your PIN or Password?")) {
//				waitForElementPresentWebdriver(attributeName_xpath, UL_ForgotPINPassword, forgotpin);
//				clickWebdriver(attributeName_xpath,UL_ForgotPINPassword);
//				waitForElementPresentWebdriver(attributeName_xpath, FPI_Search, "Forgot Password Search Button");
//				recentPopupSelect("Forgot/Reset Password");
//			}	
			waitForElementPresentWebdriver(attributeName_partiallinktext, forgotpin, forgotpin);
			clickWebdriver(attributeName_partiallinktext,forgotpin);
//			waitForPageToLoadWebdriver();
			waitForElementPresentWebdriverWait(attributeName_id, "ay-forgotSubmit", "Search Button");
		}
	
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
