package procedures_NewFramework.AYSmoke.Facelift;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_ForgotPassword_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Forgot Password' page")
	public void FC_ForgotPassword_Input() throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Test Data in forgot password input");
			String[]  fpdatarepo = datacontainer;
			String pin = fpdatarepo[0];
			String emailaddress = fpdatarepo[1];
			String fpsearch = fpdatarepo[2];
			Reporter.log("Enter Data in PIN if it is not empty");
			if (!pin.equals("")) {
				Reporter.log("Step 1 - Enter PIN as ("+pin+")");
				waitForElementPresentWebdriverWait(attributeName_xpath, FPI_Pin, pin);
//				type(FPI_Pin,pin);
				String pinnumber = Runtimedataread(pin);
				sendKeys(attributeName_xpath, FPI_Pin, pinnumber);
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Step 2 - Enter Email Address as ("+emailaddress+")");
				waitForElementPresentWebdriver(attributeName_cssselector, FPI_EmailAddr, emailaddress);
//				type(FPI_EmailAddr, emailaddress);
				sendKeys(attributeName_cssselector, FPI_EmailAddr, emailaddress);
			}
			if (!fpsearch.equals("")) {
				Reporter.log("Step 3 - Click on ("+fpsearch+") Button");
				if (fpsearch.equalsIgnoreCase("search")) {
					/*waitForElementPresentWebdriver(attributeName_xpath, FPI_Search, fpsearch);
					clickWebdriver(attributeName_xpath,FPI_Search);*/
					//removed
					Thread.sleep(10000);
					waitForElementPresentWebdriverWait(attributeName_id, "ay-forgotSubmit", fpsearch);
					clickWebdriver(attributeName_id, "ay-forgotSubmit");
					//waitForPageToLoadWebdriver();
										
				}else if (fpsearch.equalsIgnoreCase("close window")) {
					clickWebdriver(attributeName_cssselector,FPI_upaclosebtn);
				}else if(fpsearch.equalsIgnoreCase("back"))
				{
					waitForElementPresentWebdriverWait(attributeName_xpath,CI_BackBtnFL, fpsearch);
					//waitForElementPresentWebdriver(attributeName_xpath,CI_BackBtnFL, fpsearch);
					clickWebdriver(attributeName_xpath,CI_BackBtnFL);
					waitForPageToLoadWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
