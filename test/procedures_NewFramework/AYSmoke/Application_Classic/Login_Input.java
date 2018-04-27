package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class Login_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Application Login' page")
	public void Login_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Application Login' page");
		String pin = parameterValuesArray[0];
		String password = parameterValuesArray[1];
		String login = parameterValuesArray[2];
		String forgotpin = parameterValuesArray[3];
		String createaccount = parameterValuesArray[4];
		String contactus = parameterValuesArray[5];
		String fqa = parameterValuesArray[6];
		String technicalsupport = parameterValuesArray[7];
		String securityinformation = parameterValuesArray[8];
		String viewsource = parameterValuesArray[9];
		Reporter.log("Input Test Data was retrieved for 'Application Login' page");
		
		if (!pin.equals("")) {
			Reporter.log("Step 1 - Proceed to Read PIN from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			   
			if (pin.equals("Pin Number")||pin.equals("FaceliftPinNumber")) {
				String generatepin = Runtimedataread(pin);
				Reporter.log("Proceed to Enter PIN as ("+generatepin+")");
				sendKeys(attributeName_xpath,PinField, generatepin);
			}
			else
			{
				Reporter.log("Proceed to Enter PIN as ("+pin+")");
				sendKeys(attributeName_xpath,PinField, pin);
			}
						
		}
		
		if (!password.equals("")) {
			Reporter.log("Step 2 - Proceed to Read Password from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			if (password.equals("Password") || password.equals("ApplicationPassword") || password.equals("Applicant Password") || password.equals("WebcenterPassword")) {
				String generatepassword = Runtimedataread(password);
				Reporter.log("Proceed to Enter password as (" + generatepassword + ")");
				sendKeys(attributeName_xpath, PasswordField, generatepassword);
			} else {
				Reporter.log("Proceed to Enter password as (" + password + ")");
				sendKeys(attributeName_xpath, PasswordField, password);
			}
			/*try {
				Reporter.log("Step 2 - Proceed to Read Password from Excel Sheet(C:/Selenium/InputTestdata.xls)");
				String generatepassword = Runtimedataread(password);
				Reporter.log("Proceed to Enter PIN as (" + generatepassword + ")");
				sendKeys(attributeName_xpath, PasswordField, generatepassword);
			}catch(Exception e){
				Reporter.log("Proceed to Enter PIN as ("+ password +")");
				sendKeys(attributeName_xpath, PasswordField, password);
			}*/

		}
		if (!login.equals("")) {
			Reporter.log("Step 3 - Click on 'Login' Button");
			if (login.equalsIgnoreCase("login")) {
				clickWebdriver(attributeName_xpath, Login);
//				waitForElementPresentWebdriver(attributeName_xpath, MN_BaseTableFont, "Base Table Font");
				waitForPageToLoadWebdriver();
			}			
		}
		if (!forgotpin.equals("")) {
			Reporter.log("Step 4 - Click on 'Forgot your PIN or Password?' Button");
//			environment = Runtimedataread("Instance");
//			if (forgotpin.equalsIgnoreCase("Forgot your PIN or Password?")) {
//				if (environment.equals("USQA")) {
			if(forgotpin.equals("User Name")){
				waitForElementPresentWebdriver(attributeName_xpath, ForgotUserNamePassword, forgotpin);
				clickWebdriver(attributeName_xpath,ForgotUserNamePassword);
				waitForPageToLoadWebdriver();
			}else{
					clickWebdriver(attributeName_xpath,ForgotPINPassword);
     				//After clicking forgot password link ,the popup loading time is inonsistent.
			    	Thread.sleep(10000);
					waitForElementPresentWebdriver(attributeName_xpath,"//p[@id='PMobInfo']","Forgot Password Wait For Popup");
					waitForPageToLoadWebdriver();
			} 
//				}else if (environment.equals("USPR")) {
//					clickWebdriver(attributeName_xpath,ForgotPINPassword);
//					recentPopupSelectWebdriver("Forgot/Reset Password");
//				}
//			}			
		}
		if (!createaccount.equals("")) {
			Reporter.log("Step 5 - Click on 'Create Account' button");
			if (createaccount.equalsIgnoreCase("create account")) {
				clickWebdriver(attributeName_xpath,CreateAccount);
				waitForPageToLoadWebdriver();
			}		
		}
		if (!contactus.equals("")) {
			Reporter.log("Step 6 - Click on 'Contact Us' button");
			if (contactus.equalsIgnoreCase("Contact Us")) {
				clickWebdriver(attributeName_xpath,ContactUs);
			}			
		}
		if (!fqa.equals("")) {
			Reporter.log("Step 7 - Click on 'Frequently Asked Questions' button");
			if (fqa.equalsIgnoreCase("Frequently Asked Questions")) {
				clickWebdriver(attributeName_xpath,freqa);
				recentPopupSelect("Frequently Asked Questions");
			}			
		}
		if (!technicalsupport.equals("")) {
			Reporter.log("Step 8 - Click on 'Technical Support' button");
			if (technicalsupport.equalsIgnoreCase("Technical Support")) {
				clickWebdriver(attributeName_xpath,TechnicalSupport);
				recentPopupSelect("Technical Support");
			}			
		}
		if (!securityinformation.equals("")) {
			Reporter.log("Step 9 - Click on 'Security Information' button");
			if (securityinformation.equalsIgnoreCase("Security Information")) {
				clickWebdriver(attributeName_xpath,SecurityInformation);
				recentPopupSelect("Security/Privacy Information");				
			}			
		}
		if(!viewsource.equals("")){
			String pagesource = driver.getPageSource();
			if(pagesource.contains(viewsource))
				System.out.println("String Present");
			else 
				writeFailure("Given Test Data["+viewsource+"] has not be available");
		}
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
