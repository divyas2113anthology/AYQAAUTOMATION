package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
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
			Reporter.log("Enter Data in PIN if it is not empty");
			if (!fppin.equals("")) {
				Reporter.log("Step 1 - Enter PIN as ("+fppin+")");
				type(FRP_Pin,fppin);
			}
			if (!fpemaiaddress.equals("")) {
				Reporter.log("Step 2 - Enter Email Address as ("+fpemaiaddress+")");
				type(FRP_EmailAddre,fpemaiaddress);
			}
			if (!fpsearch.equals("")) {
				Reporter.log("Step 3 - Click on ("+fpsearch+") Button");
				if (fpsearch.equalsIgnoreCase("search")) {
					waitForElementPresentWebdriver(attributeName_xpath,FRP_Search, "Submit Button Present");
					clickWebdriver(attributeName_xpath,FRP_Search);
					waitForPageToLoad();
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
//					waitForPageToLoad();
//					selectMainWindow();
//					selectMainWindowWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
