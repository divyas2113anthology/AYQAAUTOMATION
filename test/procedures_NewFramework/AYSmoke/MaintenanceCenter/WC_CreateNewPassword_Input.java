package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSeleniumServlet.*;
import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class WC_CreateNewPassword_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Create New Password' page")
	public void WC_CreateNewPassword_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Create New Password' Page");
			String[] testdata = datacontainer;
			String newpassword = testdata[0];
			String confirmpassword = testdata[1];
			String submit = testdata[2];
						
						
			Reporter.log("Input Test Data was retrieved for 'Create New Password' Page");
			
			if (!newpassword.equals("")) {
				Reporter.log("Enter the New Password as ["+newpassword+"]");
				sendKeys(attributeName_xpath, MS_NewPassword, newpassword);
			}
			if (!confirmpassword.equals("")) {
				Reporter.log("Enter the Confirm Password as ["+confirmpassword+"]");
				sendKeys(attributeName_xpath, MS_ConfirmPassword, confirmpassword);
			}
			if(!submit.equals("")){
				Reporter.log("Click on the Button"+submit);
				clickWebdriver(attributeName_xpath, MS_Submit);
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
}

