package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class ForgotPassword_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Forgot Password' page")
	public void ForgotPassword_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ForgotPassword_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Test Data in forgot password input");
			String[]  fpdatarepo = datacontainer;
			String fppin = fpdatarepo[0];
			String fpemaiaddress = fpdatarepo[1];
			String fpsearch = fpdatarepo[2];
			waitForPageToLoadWebdriver();
			Reporter.log("Enter Data in PIN if it is not empty");
			if (!fppin.equals("")) {
				waitForPageToLoadWebdriver();
				Reporter.log("Step 1 - Enter PIN as ("+fppin+")");
				waitForElementPresentWebdriverWait(attributeName_xpath, FRP_Pin, fppin);
				waitForPageToLoadWebdriver();
				//recentPopupSelectWebdriver("Forgot Password");
				sendKeys(attributeName_xpath, FRP_Pin,fppin);


			}
			if (!fpemaiaddress.equals("")) {
				waitForPageToLoadWebdriver();
				Reporter.log("Step 2 - Enter Email Address as ("+fpemaiaddress+")");
				waitForElementPresentWebdriver(attributeName_xpath, FRP_EmailAddre,"Email");
				//type(FRP_EmailAddre,fpemaiaddress);
				sendKeys(attributeName_xpath, FRP_EmailAddre,fpemaiaddress);
			}
			if (!fpsearch.equals("")) {
				waitForPageToLoadWebdriver();
				Reporter.log("Step 3 - Click on ("+fpsearch+") Button");
				if (fpsearch.equalsIgnoreCase("search")) {
					waitForPageToLoadWebdriver();
					waitForElementPresentWebdriver(attributeName_xpath,FRP_Search, "Submit Button Present");
					clickWebdriver(attributeName_xpath,FRP_Search);

					Thread.sleep(8000);
					waitForPageToLoadWebdriver();
				}else if(fpsearch.equalsIgnoreCase("back")) {
					waitForPageToLoadWebdriver();
					waitForElementPresentWebdriver(attributeName_xpath,CI_BackBtn, fpsearch);
					clickWebdriver(attributeName_xpath,CI_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (fpsearch.equalsIgnoreCase("close window")) {
					clickWebdriver(attributeName_xpath,upaclosebtn);
//					selectMainWindow();
					selectMainWindowWebdriver();
				}else if (fpsearch.equalsIgnoreCase("Continue")) {
//					environment = Runtimedataread("Instance");
//					if (environment.equals("USQA")) {
						clickWebdriver(attributeName_xpath,countinuebtn);
						waitForElementPresentWebdriver(attributeName_linktext, "Logout", "Login Page");
//					}else if (environment.equals("USPR")) {
//						clickWebdriver(attributeName_xpath,countinuebtn);
//						selectMainWindowWebdriver();
//					}	
//					waitForElementPresentWebdriver(attributeName_xpath, Login, "Login Page");
//					waitForPageToLoadWebdriver();
//					selectMainWindow();
//					selectMainWindowWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
