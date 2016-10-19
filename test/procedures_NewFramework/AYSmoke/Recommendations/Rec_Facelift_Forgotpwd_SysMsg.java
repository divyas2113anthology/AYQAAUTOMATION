package procedures_NewFramework.AYSmoke.Recommendations;

import or.OR;

import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class Rec_Facelift_Forgotpwd_SysMsg extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some operation in 'Recommendation Login' page")
	public void Rec_Facelift_Forgotpwd_SysMsg() throws Exception{
		try {
		
		writeDetails();
		String[] testdata = datacontainer;
		String Forgot_SysMsg = testdata[0];
		
		//waitForText(Forgot_SysMsg, "Forgot your Personal Access Code or Password?");
			waitForPageToLoadWebdriver();
		waitForElementPresentVerifyContainsTextWebdriver(attributeName_xpath,RF_Forgot_Pwd,Forgot_SysMsg,Forgot_SysMsg);
		
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}

}
