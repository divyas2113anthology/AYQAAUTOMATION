package procedures_NewFramework.AYSmoke.StudentFacingProcedures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class Login_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Verification in 'Application Login' page")
	public void Login_Verify(){
		try {		
			writeDetails();
//			headerStatement("Login_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Application Login' page");
			String[]  loginverifydata = datacontainer;
			String message = loginverifydata[0];
			String pagename = loginverifydata[1];
			String ui = loginverifydata[2];
			Reporter.log("Verify Test Data was retrieved for 'Application Login' page");
			if (!message.equals("")) {
				Reporter.log("Step 1 - Verify Message("+message+") was displayed correctly");
				String Message = driver.findElement(By.xpath("//font/u[contains(text(),'Welcome')]")).getText();
				if (Message.equals(message)) {
					Reporter.log("Message("+message+") was displayed correctly");
				}else {
					writeFailure("Message("+message+") was not displayed correctly");
				}			
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				if (selenium.isTextPresent(pagename)) {
					Reporter.log("Its navigate to 'Login' page");
				} else {
					writeFailure("Its not navigate to 'Login' page");
				}			
			}
			if (!ui.equals("")) {
				
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
