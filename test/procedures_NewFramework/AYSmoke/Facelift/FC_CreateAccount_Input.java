package procedures_NewFramework.AYSmoke.Facelift;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

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
				String confirmemaillabel = createAccArray[5];
				String birthdate = createAccArray[6];
				String zippostalcode = createAccArray[7];
				String password = createAccArray[8];
				String confirmpassword = createAccArray[9];
				String confirmyes = createAccArray[10];
				String pin = createAccArray[11];
				String username = createAccArray[12];
				String usernamelabel = createAccArray[13];
				String button_to_click = createAccArray[14];
				Reporter.log("Input Test Data was retrieved for 'Create Account Profile' page");
				Date date = new Date();  
				DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String firstname = firstgivenname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();				
				if (!firstgivenname.equals("")) {
					Reporter.log("Step 1 - Enter 'First/Given Name' as ("+firstname+")");
//					type(CA_FirstName, firstname);	
					sendKeys(attributeName_cssselector, CA_FirstName, firstname);
					if (!firstname_lable.equals("")) {
						Reporter.log("Step 2 - Proceed to Write First Name as ("+firstname+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(firstname, firstname_lable);
					}

				}	
				String lastname = lastorfamilyname+Calendar.getInstance().getTimeInMillis();		
				if (!lastorfamilyname.equals("")) {
					Reporter.log("Step 3 - Enter 'Last or Family Name' as ("+lastname+")");		
//					type(CA_LastName, lastname);
					sendKeys(attributeName_cssselector, CA_LastName, lastname);
				}	
				String Email = emailaddress+Calendar.getInstance().getTimeInMillis()+"@connect.com";
				if (!emailaddress.equals("")) {
					Reporter.log("Step 4 - Enter 'Email Address' as ("+Email+")");
					if (emailaddress.contains("bridge")) {
						sendKeys(attributeName_cssselector, CA_EmailAddress, Email);
					} else {
						sendKeys(attributeName_cssselector, CA_EmailAddress, emailaddress);
					}
				}
				//String ConfirmEmail = emailaddress+Calendar.getInstance().getTimeInMillis()+"@connect.com";
				if (!confirmemailaddress.equals("")) {
					Reporter.log("Step 4 - Enter 'Email Address'");
					if (confirmemailaddress.contains("bridge")) {
						sendKeys(attributeName_cssselector, CA_ConfirmEmailAddress, Email);
					} else {
						sendKeys(attributeName_cssselector, CA_ConfirmEmailAddress, confirmemailaddress);
					}
				}
				Runtimedatawrite(Email, confirmemaillabel);
				/*String ConfirmEmail = confirmemailaddress+Calendar.getInstance().getTimeInMillis()+"@connect.com";
				if (!confirmemailaddress.equals("")) {			
					Reporter.log("Step 5 - Enter 'Confirm Email Address' as ("+ConfirmEmail+")");	
//					type(CA_ConfirmEmailAddress, confirmemailaddress);
					if (!confirmemailaddress.contains("@")) {
						sendKeys(attributeName_cssselector, CA_ConfirmEmailAddress, ConfirmEmail);
						if (!confirmemaillabel.equalsIgnoreCase("")) {
							Reporter.log("Step 6 - Proceed to Write Confirm Password as ("+confirmemaillabel+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
							Runtimedatawrite(Email,confirmemaillabel);			
						}
					} else {
						sendKeys(attributeName_cssselector, CA_ConfirmEmailAddress, confirmemailaddress);
					}
				}	*/
				
				if (!birthdate.equals("")) {
					Reporter.log("Step 7 - Enter 'Birth date' as ("+birthdate+")");		
//					type(CA_BirthDate, birthdate);
					sendKeys(attributeName_cssselector, CA_BirthDate, birthdate);
				}
				
				if (!zippostalcode.equals("")) {
					Reporter.log("Step 8 - Enter 'Zip/Postal Code' as ("+zippostalcode+")");			
//					type(CA_ZipCode, zippostalcode);
					sendKeys(attributeName_cssselector, CA_ZipCode, zippostalcode);
				}
				
				if (!password.equals("")) {
					Reporter.log("Step 9 - Enter 'Password' as ("+password+")");
					if(!password.equals("Auto123+")){
						String Password = Runtimedataread(password);
//						type(CA_Password, Password);
						waitForElementPresentWebdriver(attributeName_xpath, CA_Password, Password);
						sendKeys(attributeName_xpath, CA_Password, Password);
					}else{
						waitForElementPresentWebdriver(attributeName_xpath, CA_Password, password);
						sendKeys(attributeName_xpath, CA_Password, password);
					}
				}
				
				if (!confirmpassword.equals("")) {
					Reporter.log("Step 10 - Enter 'Confirm Password' as ("+confirmpassword+")");
					if(confirmpassword.equals("Auto123+")){
						String ConfirmPassword = Runtimedataread(confirmpassword);
//						type(CA_ConfirmPassword, ConfirmPassword);
						sendKeys(attributeName_xpath, CA_ConfirmPassword, ConfirmPassword);
					}else{
						sendKeys(attributeName_xpath, CA_ConfirmPassword, confirmpassword);
					}
//					type(CA_ConfirmPassword, ConfirmPassword);

//					if (!confirmyes.equalsIgnoreCase("")) {
//						Reporter.log("Proceed to Write Confirm Password as ("+confirmpassword+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
//						Runtimedatawrite(confirmpassword,confirmyes);			
//					}
				}	
				if (!pin.equals("")) {
					Reporter.log("Step 11  - Proceed to Get 'PIN' number");
					waitForElementPresentWebdriver(attributeName_xpath, CA_LoginBtn, "Login");
					if (pin.contains("Pin")) {
						String Pin = getTextWebdriver(attributeName_xpath,FC_PinNumber);
						System.out.println("Pin : "+Pin);
						String[] PinSplit = Pin.split("  ");			
			//			System.out.println("Length"+PinSplit.length);
			//			for (int i = 0; i < PinSplit.length; i++) {
			//				System.out.println("Value"+PinSplit[i]);
			//			}
			//			System.out.println("2");
						String PinNumber = PinSplit[1];
			//			System.out.println("3");
						Reporter.log("Step 12 - Proceed to Write PIN Number as ("+PinNumber+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
			//			System.out.println("4");
						Runtimedatawrite(PinNumber,pin);
			//			System.out.println("5");
					}else if (pin.contains("User")) {
						String Name = getTextWebdriver(attributeName_xpath,FC_UserName);
						System.out.println("User Name : "+Name);
						String[] UserNameSplit = Name.split("  ");	
						String UserName = UserNameSplit[1];
						Reporter.log("Step 13 - Proceed to Write PIN Number as ("+UserName+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(UserName,pin);
					}
				}
				String UserName = username+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();	
				if (!username.equals("")) {
					Reporter.log("Step 14  - Proceed to enter the user name as ("+UserName+") ");
					if (username.contains("Br")) {
						sendKeys(attributeName_id, CA_UserName, UserName);
						Runtimedatawrite(UserName, usernamelabel);
					}
					else
						sendKeys(attributeName_id, CA_UserName, username);
					
				}
				/*if (!username.equals("")) {
					Reporter.log("Step 14  - Proceed to enter the user name as ("+UserName+") ");
					sendKeys(attributeName_id, CA_UserName, UserName);
					if (!usernamelabel.equals("")) {
						Reporter.log("Step 15 - Proceed to Write User Name as ("+UserName+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(UserName, usernamelabel);
					}
				}*/
				
				if (!button_to_click.equals("")) {
					if (button_to_click.equalsIgnoreCase("create account")) {
						Reporter.log("Step 16 - Click on 'Create Account' button");
						clickWebdriver(attributeName_id, CA_CreateAccountBtn);	
						waitForElementPresentWebdriver(attributeName_xpath,CA_LoginBtn, "Login button");
//						waitForPageToLoadWebdriver();
					} else if (button_to_click.equalsIgnoreCase("Login")) {
						Reporter.log("Step 17 - Click on 'Login' button if found");
						waitForElementPresentWebdriver(attributeName_xpath,CA_LoginBtn, "Login button");
						clickWebdriver(attributeName_xpath, CA_LoginBtn);
						waitForElementPresentWebdriver(attributeName_xpath,TOU_pageTitle, "Terms Of Use");
					}
				}

				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
