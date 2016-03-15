package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_ManualAdd_Input extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Operation in 'Account Profile' page")
	public void WC_ManualAdd_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  testdata = datacontainer;
		String FName = testdata[0];
		String LName = testdata[1];
		String Email = testdata[2];
		String ConfirmEmail = testdata[3];
		String Birth = testdata[4];
		String Postal = testdata[5];
		String CreateAccount = testdata[6];
		String Close = testdata[7];
		
		String winHandleBefore = driver.getWindowHandle();
		 for(String winHandle : driver.getWindowHandles()){
		 //Switch to chile window
		 driver.switchTo().window(winHandle);
		 }
	     writeConsole("I am Here");
		Date date = new Date();  
		DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
		String firstname = FName+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();				
		if (!FName.equals("")) {
			Reporter.log("Step 1 - Enter 'First/Given Name' as ("+firstname+")");
			type(FName_Manual, firstname);	
			/*String Fnamepd = getElementIDbyLabel("First/Given Name",FName_Manual);	
			String PDFirstName = FName+Calendar.getInstance().getTimeInMillis();
			sendKeys(attributeName_xpath,Fnamepd,PDFirstName);
			Runtimedatawrite(PDFirstName, Fnamepd);*/
		
		} 
		String lastname = LName+Calendar.getInstance().getTimeInMillis();
		if (!LName.equals("")) {
			Reporter.log("Step 2 - Enter 'Last Name' as ("+lastname+")");
			sendKeys(attributeName_xpath, LName_Manual, lastname);
			//type(LName_Manual, lastname);		
		
		} 
		
		if (!Email.equals("")) {
			Reporter.log("Step 3 - Enter 'Email Address' as ("+Email+")");
			sendKeys(attributeName_xpath, Email_Manual, Email);
			//type(Email_Manual, Email);
		}
		
		if (!ConfirmEmail.equals("")) {			
			Reporter.log("Step 4 - Enter 'Confirm Email Address' as ("+ConfirmEmail+")");	
			sendKeys(attributeName_xpath, ConfirmEmail_Manual, ConfirmEmail);
			//type(ConfirmEmail_Manual, ConfirmEmail);
		}	
		
		if (!Birth.equals("")) {
			Reporter.log("Step 5 - Enter 'Birth date' as ("+Birth+")");	
			sendKeys(attributeName_xpath, Birth_Manual, Birth);
			//type(Birth_Manual, Birth);
		}
		
		if (!Postal.equals("")) {
			Reporter.log("Step 6 - Enter 'Zip/Postal Code' as ("+Postal+")");
			sendKeys(attributeName_xpath, Postal_Manual, Postal);
			//type(Postal_Manual, Postal);
		}
		if (!CreateAccount.equals("")) {
			Reporter.log("Step 7 - Click on 'Create Account'");			
			clickWebdriver(attributeName_xpath, CreateAccount_Manual);
		}
		//driver.switchTo().window(winHandleBefore);
		if (!Close.equals("")) {
			Reporter.log("Step 8 - Click on 'Close Window'");
			/*clickWebdriver(attributeName_xpath, Close_Window);
			driver.switchTo().window(winHandleBefore);
			driver.switchTo().activeElement();*/
			recentPopupCloseWebdriver();
			selectMainWindowWebdriver();
		}
		}catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
