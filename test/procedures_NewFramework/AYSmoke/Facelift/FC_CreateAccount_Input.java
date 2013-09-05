package procedures_NewFramework.AYSmoke.Facelift;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_CreateAccount_Input extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This Procedure is to perform some Operation in 'Create Account Profile' page")
	public void FC_CreateAccount_Input () {
		try {		
				writeDetails();
				String[]  createAccArray = datacontainer;
				Reporter.log("Proceed to retrieve Input Test Data for 'Create Account Profile' page");
				String firstgivenname = createAccArray[0];
				String firstname_lable = createAccArray[1];
				String lastorfamilyname = createAccArray[2];
				String emailaddress = createAccArray[3];
				String confirmemailaddress = createAccArray[4];
				String birthdate = createAccArray[5];
				String zippostalcode = createAccArray[6];
				String password = createAccArray[7];
				String confirmpassword = createAccArray[8];
				String confirmyes = createAccArray[9];
				String pin = createAccArray[10];
				String button_to_click = createAccArray[11];
				Reporter.log("Input Test Data was retrieved for 'Create Account Profile' page");
				
				Date date = new Date();  
				DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String firstname = firstgivenname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();				
				if (!firstgivenname.equals("")) {
					Reporter.log("Step 1 - Enter 'First/Given Name' as ("+firstname+")");
//					type(CA_FirstName, firstname);	
					sendKeys(attributeName_cssselector, CA_FirstName, firstname);
					if (! firstname_lable.equals("")) {
						Reporter.log("Proceed to Write First Name as ("+firstname+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(firstname, firstname_lable);
					}
				}	
				String lastname = lastorfamilyname+Calendar.getInstance().getTimeInMillis();		
				if (!lastorfamilyname.equals("")) {
					Reporter.log("Step 2 - Enter 'Last or Family Name' as ("+lastname+")");		
//					type(CA_LastName, lastname);
					sendKeys(attributeName_cssselector, CA_LastName, lastname);
				}	
				
				if (!emailaddress.equals("")) {
					Reporter.log("Step 3 - Enter 'Email Address' as ("+emailaddress+")");		
//					type(CA_EmailAddress, emailaddress);
					sendKeys(attributeName_cssselector, CA_EmailAddress, emailaddress);
				}
				
				if (!confirmemailaddress.equals("")) {			
					Reporter.log("Step 4 - Enter 'Confirm Email Address' as ("+confirmemailaddress+")");	
//					type(CA_ConfirmEmailAddress, confirmemailaddress);
					sendKeys(attributeName_cssselector, CA_ConfirmEmailAddress, confirmemailaddress);
				}	
				
				if (!birthdate.equals("")) {
					Reporter.log("Step 5 - Enter 'Birth date' as ("+birthdate+")");		
//					type(CA_BirthDate, birthdate);
					sendKeys(attributeName_cssselector, CA_BirthDate, birthdate);
				}
				
				if (!zippostalcode.equals("")) {
					Reporter.log("Step 6 - Enter 'Zip/Postal Code' as ("+zippostalcode+")");			
//					type(CA_ZipCode, zippostalcode);
					sendKeys(attributeName_cssselector, CA_ZipCode, zippostalcode);
				}
				
				if (!password.equals("")) {			
					Reporter.log("Step 7 - Enter 'Password' as ("+password+")");	
					String Password = Runtimedataread(password);
//					type(CA_Password, Password);
					sendKeys(attributeName_cssselector, CA_Password, Password);
				}		
				
				if (!confirmpassword.equals("")) {
					Reporter.log("Step 8 - Enter 'Confirm Password' as ("+confirmpassword+")");	
					String ConfirmPassword = Runtimedataread(confirmpassword);
//					type(CA_ConfirmPassword, ConfirmPassword);	
					sendKeys(attributeName_cssselector, CA_ConfirmPassword, ConfirmPassword);
//					if (!confirmyes.equalsIgnoreCase("")) {
//						Reporter.log("Proceed to Write Confirm Password as ("+confirmpassword+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
//						Runtimedatawrite(confirmpassword,confirmyes);			
//					}
				}	
				if (!pin.equals("")) {
					Reporter.log("Step 9  - Proceed to Get 'PIN' number");
					waitForElementPresentWebdriver(attributeName_xpath, CA_LoginBtn, "Login");
					String Pin = getText(FC_PinNumber);
					System.out.println("Pin : "+Pin);
					String[] PinSplit = Pin.split("  ");			
		//			System.out.println("Length"+PinSplit.length);
		//			for (int i = 0; i < PinSplit.length; i++) {
		//				System.out.println("Value"+PinSplit[i]);
		//			}
		//			System.out.println("2");
					String PinNumber = PinSplit[1];
		//			System.out.println("3");
					Reporter.log("Proceed to Write PIN Number as ("+PinNumber+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
		//			System.out.println("4");
					Runtimedatawrite(PinNumber,pin);
		//			System.out.println("5");
				}
				
				if (!button_to_click.equals("")) {
					if (button_to_click.equalsIgnoreCase("create account")) {
						Reporter.log("Step 10 - Click on 'Create Account' button");
						clickWebdriver(attributeName_id, CA_CreateAccountBtn);	
						waitForElementPresent(CA_LoginBtn, "Login button");
//						waitForPageToLoad();	
					} else if (button_to_click.equalsIgnoreCase("Login")) {
						Reporter.log("Step 10 - Click on 'Login' button if found");
						waitForElementPresent(CA_LoginBtn, "Login button");
						clickWebdriver(attributeName_xpath, CA_LoginBtn);
						waitForElementPresent(TOU_pageTitle, "Terms Of Use");			
					}
				}

				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	


}
