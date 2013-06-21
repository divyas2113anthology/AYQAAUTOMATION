package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_UserLogin_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Verification in 'Application Login' page")
	public void FC_UserLogin_Verify(){
		try {		
			writeDetails();
//			headerStatement("Login_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Application Login' page");
			String[]  loginverifydata = datacontainer;
			String ui = loginverifydata[0];
			String pin = loginverifydata[1];
			String pinerror = loginverifydata[2];
			String password = loginverifydata[3];
			String passworderror = loginverifydata[4];
			Reporter.log("Verify Test Data was retrieved for 'Application Login' page");
			if (!ui.equals("")) {
				if (ui.equals("Yes")) {
					verifyElementPresent(UL_ForgotPINPassword, "Forgot your PIN or password?");
					verifyElementPresent(UL_Login, "Login Button");
				}
			}

	} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}

