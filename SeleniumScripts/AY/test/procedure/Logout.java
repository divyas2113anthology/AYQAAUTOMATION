package procedure;
import or.OR;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class Logout extends CommonSeleniumActions implements OR{
	
	
//	@Test
//	public void ApplicationLogout(){
//		Reporter.log("Step 1 - Click on 'Logout' link");
//		click(Logout);
//		waitForPageToLoad();
//		Reporter.log("Proceed to Verify it navigate to 'Successful Logout!' page");
//		if (selenium.isTextPresent("Successful Logout!")) {
//			Reporter.log("	Successful Logout");			
//		} else {
//			Assert.fail("	Not Successful Logout!");
//		}
////		Assert.fail("	Not Successful Logout!");
//	}

//	@Test(description="AP_001|Create Account")
//	public void WC_AddEvent() throws Exception {	
//		System.out.println("Method 1");
//		Reporter.log("Procced to Verify the Create Account");
//		selenium.open("https://uatapp.applyyourself.com/?id=ayauto");
//		selenium.waitForPageToLoad("90000");
//		click(CreateAccount);
//		
////		click(CreateAccount);
//		selenium.waitForPageToLoad("90000");
//		
////		selenium.isTextPresent("hariharan vasudevan");
//	
//	}
//	
//	
//	
//	@Test(description="Create Button")
//	public void ClickOnCreateButton() throws Exception {
//		Reporter.log("Procced to Retrieve Data");
////		String[] datarepo = readCSVFile("ClickOnCreateButton",datacsv);
//		String[]  datarepo = datacontainer;
//		Reporter.log("Procced to click on Create Account button");		
//		click(CreateAccount);
//		waitForPageToLoad();
////		Assert.fail("It is not Navigated to 'Univeristy of AYAUTO' Page ");
//	}
//	
//
//	@Test(description="Log Out and Verifcation")
//	public void ClickOnLogOut() throws Exception {
//		Reporter.log("Procced to Retrieve Data");
//		String[]  datarepo = datacontainer;
////		String[] datarepo = readCSVFile("ClickOnLogOut",datacsv);
//		Reporter.log("Proceed to Click on LogOut");
//		click(Logout);
//		waitForPageToLoad();
//		if (selenium.isTextPresent("Successful Logout!")) {
//			Reporter.log("Successful Logout");			
//		} else {
//			Assert.fail("Not Successful Logout!");
//		}
//	}
}
