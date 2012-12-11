package procedure;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import org.testng.annotations.*;
import or.OR;
import org.testng.Assert;
import org.testng.Reporter;
import processor.CommonSeleniumActions;



public class Application extends CommonSeleniumActions implements OR {
	
//*************************************************************************************
//	
//	  App Name      : Apply Yourself
//	  Created by    : Hariharan
//	  Created On    : 
//	  Last Modified :
//	 
//*************************************************************************************
	
	@Test(description="This Procedure is to perform some operation in 'Application Login' page")
	public void Login_Input() throws Exception{
		try {
		
		writeDetails();
		String[]  parameterValuesArray = datacontainer;
		Reporter.log("Proceed to retrieve Input Test Data for 'Application Login' page");
		String pin = parameterValuesArray[0];
		String password = parameterValuesArray[1];
		String login = parameterValuesArray[2];
		String forgotpin = parameterValuesArray[3];
		String createaccount = parameterValuesArray[4];
		String contactus = parameterValuesArray[5];
		String fqa = parameterValuesArray[6];
		String technicalsupport = parameterValuesArray[7];
		String securityinformation = parameterValuesArray[8];
		Reporter.log("Input Test Data was retrieved for 'Application Login' page");
		
		if (!pin.equals("")) {
			Reporter.log("Step 1 - Proceed to Read PIN from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generatepin = Runtimedataread(pin);
			Reporter.log("Proceed to Enter PIN as ("+generatepin+")");
			type(PinField, generatepin);			
						
		}
		if (!password.equals("")) {
			Reporter.log("Step 2 - Proceed to Read Password from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String generatepassword = Runtimedataread(password);
			Reporter.log("Proceed to Enter PIN as ("+generatepassword+")");		
			type(PasswordField, generatepassword);
			
		}
		if (!login.equals("")) {
			Reporter.log("Step 3 - Click on 'Login' Button");
			if (login.equalsIgnoreCase("login")) {
				click(Login);
				waitForPageToLoad();
			}			
		}
		if (!forgotpin.equals("")) {
			Reporter.log("Step 4 - Click on 'Forgot your PIN or Password?' Button");
			if (forgotpin.equalsIgnoreCase("Forgot your PIN or Password?")) {
				click(ForgotPINPassword);	
				recentPopupSelect("Forgot/Reset Password");
			}			
		}
		if (!createaccount.equals("")) {
			Reporter.log("Step 5 - Click on 'Create Account' button");
			if (createaccount.equalsIgnoreCase("create account")) {
				click(CreateAccount);
				waitForPageToLoad();
			}		
		}
		if (!contactus.equals("")) {
			Reporter.log("Step 6 - Click on 'Contact Us' button");
			if (contactus.equalsIgnoreCase("Contact Us")) {
				click(ContactUs);				
			}			
		}
		if (!fqa.equals("")) {
			Reporter.log("Step 7 - Click on 'Frequently Asked Questions' button");
			if (fqa.equalsIgnoreCase("Frequently Asked Questions")) {
				click(freqa);
				recentPopupSelect("Frequently Asked Questions");
			}			
		}
		if (!technicalsupport.equals("")) {
			Reporter.log("Step 8 - Click on 'Technical Support' button");
			if (technicalsupport.equalsIgnoreCase("Technical Support")) {
				click(TechnicalSupport);
				recentPopupSelect("Technical Support");
			}			
		}
		if (!securityinformation.equals("")) {
			Reporter.log("Step 9 - Click on 'Security Information' button");
			if (securityinformation.equalsIgnoreCase("Security Information")) {
				click(SecurityInformation);
				recentPopupSelect("Security/Privacy Information");				
			}			
		}
		
		} catch (Exception e) {			
			writeFailure(e.getLocalizedMessage());
		}
	}
	
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
				if (selenium.isTextPresent(message)) {
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
	
	@Test(description="This Procedure is to perform some Operation in 'Account Profile' page")
	public void AccountProfile_Input() throws IOException, RowsExceededException, BiffException, WriteException{
		try {		
				writeDetails();
//				headerStatement("AccountProfile_Input");
//				startExecutionOrder(j);
//				writeParametersTable();
				String[]  accprofileidatarepo = datacontainer;
				Reporter.log("Proceed to retrieve Input Test Data for 'Account Profile' page");
				String firstgivenname = accprofileidatarepo[0];
				String firstnameyes = accprofileidatarepo[1];
				String lastorfamilyname = accprofileidatarepo[2];
				String emailaddress = accprofileidatarepo[3];
				String confirmemailaddress = accprofileidatarepo[4];
				String birthdate = accprofileidatarepo[5];
				String zippostalcode = accprofileidatarepo[6];
				String username = accprofileidatarepo[7];
				String password = accprofileidatarepo[8];
				String confirmpassword = accprofileidatarepo[9];
				String confirmyes = accprofileidatarepo[10];
				String createaccount = accprofileidatarepo[11];
				Reporter.log("Input Test Data was retrieved for 'Account Profile' page");
				Date date = new Date();  
				DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
				String firstname = firstgivenname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();				
				if (!firstgivenname.equals("")) {
					Reporter.log("Step 1 - Enter 'First/Given Name' as ("+firstname+")");
					type(FirstName, firstname);		
					if (!firstnameyes.equals("")) {
						Reporter.log("Proceed to Write First Name as ("+firstname+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(firstname,firstnameyes);
					}
				}	
		
				
				String lastname = lastorfamilyname+Calendar.getInstance().getTimeInMillis();		
				if (!lastorfamilyname.equals("")) {
					Reporter.log("Step 2 - Enter 'Last or Family Name' as ("+lastname+")");		
					type(LastName, lastname);
				}	
				
				if (!emailaddress.equals("")) {
					Reporter.log("Step 3 - Enter 'Email Address' as ("+emailaddress+")");		
					type(EmailAddress, emailaddress);
				}
				
				if (!confirmemailaddress.equals("")) {			
					Reporter.log("Step 4 - Enter 'Confirm Email Address' as ("+confirmemailaddress+")");	
					type(ConfirmEmailAddress, confirmemailaddress);
				}	
				
				if (!birthdate.equals("")) {
					Reporter.log("Step 5 - Enter 'Birth date' as ("+birthdate+")");		
					type(BirthDate, birthdate);
				}
				
				if (!zippostalcode.equals("")) {
					Reporter.log("Step 6 - Enter 'Zip/Postal Code' as ("+zippostalcode+")");			
					type(ZipCode, zippostalcode);
				}
				
				if (!username.equals("")) {
					Reporter.log("Step 7 - Enter 'UserName' as ("+username+")");	
				}	
				
				if (!password.equals("")) {			
					Reporter.log("Step 8 - Enter 'Password' as ("+password+")");	
					type(Password, password);
				}		
				if (!confirmpassword.equals("")) {
					Reporter.log("Step 9 - Enter 'Confirm Password' as ("+confirmpassword+")");	
					type(ConfirmPassword, confirmpassword);			
					if (!confirmyes.equalsIgnoreCase("")) {
						Reporter.log("Proceed to Write Confirm Password as ("+confirmpassword+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");
						Runtimedatawrite(confirmpassword,confirmyes);			
					}
				}	
				
				if (!createaccount.equals("")) {
					Reporter.log("Step 10 - Click on 'Create Account' button");
					if (createaccount.equalsIgnoreCase("create account")) {
						click(CreateAccount);
						waitForPageToLoad();	
					}
				}
				
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
	
	@Test(description="This Procedure is to perform some Operation in 'PIN' page")
	public void PIN_Input() throws RowsExceededException, BiffException, WriteException, IOException{
		try {
			
			writeDetails();
//			headerStatement("PIN_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'PIN' page");
			String[]  pinidatarepo = datacontainer;
			String pin = pinidatarepo[0];
			String loginbutton = pinidatarepo[1];
			Reporter.log("Input Test Data was retrieved for 'PIN' page");
			if (!pin.equals("")) {
				Reporter.log("Proceed to Get 'PIN' number");
				String Pin = getText(PinNumber);
	//			System.out.println("1");
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
			if (!loginbutton.equals("")) {
				Reporter.log("Proceed to Click on ("+loginbutton+")");
				if (loginbutton.equalsIgnoreCase("login")) {
					click(Login);
					waitForPageToLoad();				
				}			
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
	@Test(description="This Procedure is to perform some Operation in 'EULA' page")
	public void EULA_Input(){
		try {
			writeDetails();
//			headerStatement("EULA_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'EULA' page");
			String[]  eulaidatarepo = datacontainer;
			String iagree = eulaidatarepo[0];
			String privacypolicy = eulaidatarepo[1];
			String continuecreate = eulaidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'EULA' page");
			if (!iagree.equals("")) {
				Reporter.log("Proceed to  ("+iagree+") in the 'I agree' Checkbox");
				if (iagree.equalsIgnoreCase("Check")) {
					check(Iagree);
				}else if (iagree.equalsIgnoreCase("Uncheck")) {
					uncheck(Iagree);
				}			
			}
			if (!privacypolicy.equals("")) {
				Reporter.log("Proceed to check ("+privacypolicy+") in the 'Privacy Policy' Radio");
				if (privacypolicy.equalsIgnoreCase("Yes")) {
					check(PrivacyPolicy_Yes);
				}else if (privacypolicy.equalsIgnoreCase("No")) {
					uncheck(PrivacyPolicy_No);
				}			
			}
			if (!continuecreate.equals("")) {
				Reporter.log("Proceed to Click on ("+continuecreate+") button");
				if (continuecreate.equalsIgnoreCase("continue & create new account")) {
					click(Continue);
					waitForPageToLoad();
				}			
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
		
	
	@Test(description="This Procedure is to perform some Operation in 'Applicant Welcome' page")
	public void ApplicantWelcome_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicantWelcome_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Welcome' page");
			String[]  applicantwelidatarepo = datacontainer;
			String logout = applicantwelidatarepo[0];
			String updatetechsupport = applicantwelidatarepo[1];
			String applicantsection = applicantwelidatarepo[2];
			String helpfulhints = applicantwelidatarepo[3];
			String print = applicantwelidatarepo[4];
			String applicationhome = applicantwelidatarepo[5];
			Reporter.log("Input Test Data was retrieved for 'Applicant Welcome' page");
	//		selectMainWindow();
			if (!logout.equals("")) {
				Reporter.log("Step 1 - Proceed to Click on ("+logout+") Link");
				click(Logoutmain+logout+"']");
				waitForPageToLoad();
			}
			if (!updatetechsupport.equals("")) {
				Reporter.log("Step 2 - Proceed to Click on ("+updatetechsupport+") Button");
				if (updatetechsupport.equalsIgnoreCase("Home")) {
					click(Updatetech+updatetechsupport+"']");
					waitForPageToLoad();
				}else if (updatetechsupport.equalsIgnoreCase("Technical Support")) {
					click(Updatetech+updatetechsupport+"']");
					recentPopupSelect("Technical Support");
				}else if (updatetechsupport.equalsIgnoreCase("Update your Profile")) {
					click(Updatetech+updatetechsupport+"']");
					recentPopupSelect("Update Profile");
				}else if (updatetechsupport.equalsIgnoreCase("Submit")) {
					click(Updatetech+updatetechsupport+"']");
					waitForPageToLoad();
				}			
			}
			if (!applicantsection.equals("")) {
				Reporter.log("Step 3 - Proceed to Click on Applicant Section ("+applicantsection+") Link");
				click(Section+applicantsection+"']");
				waitForPageToLoad();			
			}
			if (!helpfulhints.equals("")) {
				Reporter.log("Step 4 - Proceed to Click on ("+helpfulhints+") in the 'Helpful Hints' Section");
				click(helphint+helpfulhints+"']");
				recentPopupSelect(helpfulhints);
			}
			if (!print.equals("")) {
				Reporter.log("Step 5 - Proceed to Click on ("+print+") Button");
				if (print.equalsIgnoreCase("print")) {
					click(PrintBtn+print+"']");
					recentPopupSelect("Print");
				}			
			}
			if (!applicationhome.equals("")) {
				Reporter.log("Step 6 - Proceed to Click on ("+applicationhome+") Link");
				if (applicationhome.equalsIgnoreCase("Application Home")) {
					click(updatelink+applicationhome+"']");
					waitForPageToLoad();
				}else if (applicationhome.equalsIgnoreCase("Technical Support")) {
					click(updatelink+applicationhome+"']");
					recentPopupSelect("Technical Support");
				}else if (applicationhome.equalsIgnoreCase("Update Profile")) {
					click(updatelink+applicationhome+"']");
					recentPopupSelect("Update Profile");
				}else if (applicationhome.equalsIgnoreCase("Logout")) {
					click(updatelink+applicationhome+"']");
					waitForPageToLoad();
				}
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
	
	@Test(description="This Procedure is to perform some Operation in 'Update Profile' page")
	public void UpdateProfile_Input() throws Exception{
		try {
			writeDetails();			
//			headerStatement("UpdateProfile_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Update Profile' page");
			String[]  updateproidatarepo = datacontainer;
			String firstgivenname = updateproidatarepo[0];
			String lastfamilyname = updateproidatarepo[1];
			String emailaddress = updateproidatarepo[2];
			String birthdate = updateproidatarepo[3];
			String zippostalcode = updateproidatarepo[4];
			String password = updateproidatarepo[5];
			String confirmpassword = updateproidatarepo[6];
			String beforeapplicationsubmission = updateproidatarepo[7];
			String updateclose = updateproidatarepo[8];
			Reporter.log("Input Test Data was retrieved for 'Update Profile' page");
			Date date = new Date();  
			DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
			String firstname = firstgivenname+dateFormat.format(date)+Calendar.getInstance().getTimeInMillis();
			if (!firstgivenname.equals("")) {
				Reporter.log("Step 1 - Enter 'First/Given Name' as ("+firstname+")");
				type(upaFirstName, firstname);				
			}
			String lastname = lastfamilyname+Calendar.getInstance().getTimeInMillis();
			if (!lastfamilyname.equals("")) {
				Reporter.log("Step 2 - Enter 'Last or Family Name' as ("+lastname+")");		
				type(upaLastName, lastname);
			}
			if (!emailaddress.equals("")) {
				Reporter.log("Step 3 - Enter 'Email Address' as ("+emailaddress+")");		
				type(upaEmailAddress, emailaddress);
			}
			if (!birthdate.equals("")) {
				Reporter.log("Step 4 - Enter 'Birth date' as ("+birthdate+")");		
				type(upaBirthDate, birthdate);
			}
			if (!zippostalcode.equals("")) {
				Reporter.log("Step 5 - Enter 'Zip/Postal Code' as ("+zippostalcode+")");			
				type(upaZipCode, zippostalcode);
			}
			if (!password.equals("")) {
				Reporter.log("Step 6 - Enter 'Password' as ("+password+")");	
				type(upaPassword, password);
			}
			if (!confirmpassword.equals("")) {
				Reporter.log("Step 7 - Enter 'Confirm Password' as ("+confirmpassword+")");	
				type(upaConfirmPassword, confirmpassword);
			}
			if (!beforeapplicationsubmission.equals("")) {
				Reporter.log("Step 8 - Check("+beforeapplicationsubmission+") in the 'Application Submission' Radio");
				if (beforeapplicationsubmission.equalsIgnoreCase("Yes")) {
					check(upaappsubmission_Yes);
				}else if(beforeapplicationsubmission.equalsIgnoreCase("No")) {
					check(upaappsubmission_No);
				}
			}
			if (!updateclose.equals("")) {
				Reporter.log("Step 9 - Click on ("+updateclose+") Button");
				if (updateclose.equalsIgnoreCase("update")) {
					click(upaupdatebtn);
					waitForPageToLoad();
				}else if (updateclose.equalsIgnoreCase("close window")) {
					click(upaclosebtn);
//					writeFailure("Its Not Naviagted to Main Page");
					selectMainWindow();			
	//				writeFailure("Its Not Naviagted to Main Page");
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
	@Test(description="This Procedure is to perform some Verification in 'Update Profile' page")
	public void UpdateProfile_Verify() throws Exception{
		try {
		writeDetails();
//		headerStatement("UpdateProfile_Verify");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Verify Test Data 'Update Profile' page");
		String[]  updateprovdatarepo = datacontainer;
		String successmessage = updateprovdatarepo[0];
		String pagename = updateprovdatarepo[1];
		String verifyui = updateprovdatarepo[2];
		Reporter.log("Verify Test Data was retrieved for 'Update Profile' page");
		if (!successmessage.equals("")) {
			Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
			if (selenium.isTextPresent(successmessage)) {
				Reporter.log("Message("+successmessage+") was displayed correctly");
			} else {
				writeFailure("Message("+successmessage+") was not displayed correctly");
			}
		}
		if (!pagename.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
			if (selenium.isTextPresent(pagename)) {
				Reporter.log("Its navigate to 'Update Profile' page");
			} else {
				writeFailure("Its not navigate to 'Update Profile' page");
			}			
		}
		if (!verifyui.equals("")) {
			
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

	
	@Test(description="This Procedure is to perform some Operation in 'Applicant Main' page")
	public void Mainpage_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("Mainpage_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Applicant Main' page");
			String[]  mainidatarepo = datacontainer;
			String packagename = mainidatarepo[0];
			String eventpackagename = mainidatarepo[1];	
			String enrollment = mainidatarepo[2];	
			Reporter.log("Input Test Data was retrieved for 'Applicant Main' page");
			if (!packagename.equals("")) {
				Reporter.log("Click on ("+packagename+") Package");
				click(Applpackage+packagename+"']");
				waitForPageToLoad();			
			}
			if (!eventpackagename.equals("")) {
				Reporter.log("Click on ("+eventpackagename+") Event Package");
				if (eventpackagename.equalsIgnoreCase("Search")) {
					click(eventpackage+eventpackagename+"']");
					waitForPageToLoad();
				}else if (eventpackagename.equalsIgnoreCase("List All")) {
					click(eventpackage+eventpackagename+"']");
					waitForPageToLoad();
				}else if (eventpackagename.equalsIgnoreCase("View mine")) {
					click(eventpackage+eventpackagename+"']");
					recentPopupSelect("View mine");				
				}
			}
			if (!enrollment.equals("")) {
				Reporter.log("Click on ("+enrollment+") Link");
				click(enrollpackage+packagename+"']");
				recentPopupSelect("Enrollment");			
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
	
	@Test(description="This Procedure is to perform some Operation in 'Personal Information' page")	
	public void PersonalInformationForm_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalInformationForm_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Personal Information' page");
			String[]  personalinfoidatarepo = datacontainer;
			String pisuffix = personalinfoidatarepo[0];
			String pifirstgivenname = personalinfoidatarepo[1];
			String pilastname = personalinfoidatarepo[2];
			String pifulltimestudent = personalinfoidatarepo[3];
			String piethnicity = personalinfoidatarepo[4];
			String pissn = personalinfoidatarepo[5];
			String piDateofBirth = personalinfoidatarepo[6];
			String pisportsinterest = personalinfoidatarepo[7];
			String piluckyno = personalinfoidatarepo[8];
			String pisavebutton = personalinfoidatarepo[9];
			Reporter.log("Input Test Data was retrieved for 'Personal Information' page");
			if (!pisuffix.equals("")) {
				Reporter.log("Step 1 - Select Suffix as ("+pisuffix+")");
				String SufID = getElementIDbyLabel("Suffix",PI_Suffix);				
				select(SufID, pisuffix);
			}
			if (!pifirstgivenname.equals("")) {
				Reporter.log("Step 2 - Enter First Name as ("+pifirstgivenname+")");
				String fNameID = getElementIDbyLabel("First Name",PI_FirstName);				
				type(fNameID, pifirstgivenname+Calendar.getInstance().getTimeInMillis());
			}
			if (!pilastname.equals("")) {
				Reporter.log("Step 3 - Enter Last Name as ("+pilastname+")");
				String LNameID = getElementIDbyLabel("Last Name",PI_LastName);				
				type(LNameID, pilastname);
			}
			if (!pifulltimestudent.equals("")) {
				Reporter.log("Step 4 - Check Full Time Student as ("+pifulltimestudent+")");
				if (pifulltimestudent.equalsIgnoreCase("Yes")){
					click(PI_FullTimeStudent_Yes);		
				}else if  (pifulltimestudent.equalsIgnoreCase("No")){
					click(PI_FullTimeStudent_No);
				}			
			}
			if (!piethnicity.equals("")) {
				Reporter.log("Step 5 - Check Ethnicity as ("+piethnicity+")");
				String ethiID = getElementIDbyLabel(piethnicity,PI_EthniValue);
				check(ethiID);
			}
			if (!pissn.equals("")) {
				Reporter.log("Step 6 - Enter Social Security Number as ("+pissn+")");
				String ssnID = getElementIDbyLabel("Social Security Number", PI_SSN);
				type(ssnID, pissn);
			}
			if (!piDateofBirth.equals("")) {
				Reporter.log("Step 7 - Enter Date of Birth as ("+piDateofBirth+")");
				String dobID = getElementIDbyLabel("Date of Birth", PI_DOB);
				type(dobID, piDateofBirth);
			}
			if (!pisportsinterest.equals("")) {
				Reporter.log("Step 8 - Enter Favourite Sports as ("+pisportsinterest+")");
				String sportID = getElementIDbyLabel("Favourite Sports", PI_Sports);
				select(sportID,pisportsinterest);			
			}
			if (!piluckyno.equals("")) {
				Reporter.log("Step 9 - Check Lucky Number as ("+piluckyno+")");
				String LuckyID = getElementIDbyLabel(piluckyno,PI_Luckyno);
				check(LuckyID);
			}
			if (!pisavebutton.equals("")) {
				Reporter.log("Step 10 - Click on ("+pisavebutton+")Button");
				if (pisavebutton.equalsIgnoreCase("Address Lookup")) {
					click(PI_AddressLookupBtn);
					recentPopupSelect("Address Lookup");				
				} else if(pisavebutton.equalsIgnoreCase("Save")){
					click(PI_Save);
					waitForPageToLoad();
				}else if (pisavebutton.equalsIgnoreCase("Save & Continue")) {
					click(PI_SaveContinue);
					waitForPageToLoad();
				}else if (pisavebutton.equalsIgnoreCase("Reset")) {
					click(PI_Reset);
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
	
	@Test(description="This Procedure is to perform some Verification in 'Personal Information' page")
	public void PersonalInformationForm_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalInformationForm_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Personal Information' page");
			String[]  personalinfovdatarepo = datacontainer;
			String pivsuccessmessage = personalinfovdatarepo[0];
			String pivpagename = personalinfovdatarepo[1];
			String pivverifyui = personalinfovdatarepo[2];
			String pivaddressline1 = personalinfovdatarepo[3];
			String pivaddressline2 = personalinfovdatarepo[4];
			String pivaddressline3 = personalinfovdatarepo[5];
			String pivcity = personalinfovdatarepo[6];
			String pivstate = personalinfovdatarepo[7];
			String pivzip = personalinfovdatarepo[8];
			String pivcountry = personalinfovdatarepo[9];
			Reporter.log("Verify Test Data was retrieved for 'Personal Information' page");
			if (!pivsuccessmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+pivsuccessmessage+") was displayed correctly");
				if (selenium.isTextPresent(pivsuccessmessage)) {
					Reporter.log("Message("+pivsuccessmessage+") was displayed correctly");
				} else {
					writeFailure("Message("+pivsuccessmessage+") was not displayed correctly");
				}
			}
			if (!pivpagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pivpagename+") page");
				if (selenium.isTextPresent(pivpagename)) {
					Reporter.log("Its navigate to ("+pivpagename+") page");
				} else {
					writeFailure("Its not navigate to ("+pivpagename+") page");
				}
			}
			if (!pivverifyui.equals("")) {
				Reporter.log("Step 3 - Verify its navigate to ("+pivpagename+") page");
			}
			if (!pivaddressline1.equals("")) {
				Reporter.log("Step 4 - Verify data("+pivaddressline1+") was displayed correctly in the 'Address Line1' Field");
				String addrwaitID = getElementIDbyLabel("Address Line1", PI_AddressLine1_wait);
				waitForConditionisElementPresent(addrwaitID, "60000");
				String addrID1 = getElementIDbyLabel("Address Line1", PI_AddressLine1);			
				String line1 = getValue(addrID1);
				if (line1.equals(pivaddressline1)) {
					Reporter.log("Data("+line1+") was displayed correctly in the [Address Line1] Field");				
				} else {
					writeFailure("Data("+line1+") was not displayed correctly in the [Address Line1] Field");
				}
			}
			if (!pivaddressline2.equals("")) {
				Reporter.log("Step 5 - Verify data("+pivaddressline2+") was displayed correctly in the 'Address Line2' Field");
				String addrID2 = getElementIDbyLabel("Address Line2", PI_AddressLine2);
				String line2 = getValue(addrID2);
				if (line2.equals(pivaddressline2)) {
					Reporter.log("Data("+line2+") was displayed correctly in the [Address Line2] Field");				
				} else {
					writeFailure("Data("+line2+") was not displayed correctly in the [Address Line2] Field");
				}
			}
			if (!pivaddressline3.equals("")) {
				Reporter.log("Step 6 - Verify data("+pivaddressline3+") was displayed correctly in the 'Address Line3' Field");
				String addrID3 = getElementIDbyLabel("Address Line3", PI_AddressLine3);
				String line3 = getValue(addrID3);
				if (line3.equals(pivaddressline3)) {
					Reporter.log("Data("+line3+") was displayed correctly in the [Address Line3] Field");				
				} else {
					writeFailure("Data("+line3+") was not displayed correctly in the [Address Line3] Field");
				}
			}
			if (!pivcity.equals("")) {
				Reporter.log("Step 7 - Verify data("+pivcity+") was displayed correctly in the 'City' Field");
				String cityID = getElementIDbyLabel("City", PI_City);
				String city = getValue(cityID);
				if (city.equals(pivcity)) {
					Reporter.log("Data("+city+") was displayed correctly in the [City] Field");				
				} else {
					writeFailure("Data("+city+") was not displayed correctly in the [City] Field");
				}
			}
			if (!pivstate.equals("")) {
				Reporter.log("Step 8 - Verify data("+pivstate+") was displayed correctly in the 'State' Field");
				String stateID = getElementIDbyLabel("State", PI_State);
				String state = getValue(stateID);
				if (state.equals(pivstate)) {
					Reporter.log("Data("+state+") was displayed correctly in the [State] Field");				
				} else {
					writeFailure("Data("+state+") was not displayed correctly in the [State] Field");
				}
			}
			if (!pivzip.equals("")) {
				Reporter.log("Step 9 - Verify data("+pivzip+") was displayed correctly in the 'Zip' Field");
				String zipID = getElementIDbyLabel("Zip", PI_Zip);
				String zip = getValue(zipID);
				if (zip.equals(pivzip)) {
					Reporter.log("Data("+zip+") was displayed correctly in the [Zip] Field");				
				} else {
					writeFailure("Data("+zip+") was not displayed correctly in the [Zip] Field");
				}
			}
			if (!pivcountry.equals("")) {
				Reporter.log("Step 10 - Verify data("+pivcountry+") was displayed correctly in the 'Country' Field");
				String countryID = getElementIDbyLabel("Country", PI_Country);
				String country = getValue(countryID);
				if (country.equals(pivcountry)) {
					Reporter.log("Data("+country+") was displayed correctly in the [Country] Field");				
				} else {
					writeFailure("Data("+country+") was not displayed correctly in the [Country] Field");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

	
	@Test(description="This Procedure is to perform some Operation in 'Address Lookup' page")
	public void AddressLookup_Input() throws Exception{
		try {
		writeDetails();		
//		headerStatement("AddressLookup_Input");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Input Test Data for 'Address Lookup' page");
		String[]  addressidatarepo = datacontainer;
		String addrline1 = addressidatarepo[0];
		String addrline2 = addressidatarepo[1];
		String addrline3 = addressidatarepo[2];
		String addrcitytown = addressidatarepo[3];
		String addrstateprovince = addressidatarepo[4];
		String addrpostalcodezip = addressidatarepo[5];
		String addrcountry = addressidatarepo[6];
		String addrsubmit = addressidatarepo[7];
		Reporter.log("Input Test Data was retrieved for 'Address Lookup' page");
		if (!addrline1.equals("")) {
			Reporter.log("Step 1 - Enter Line 1 as ("+addrline1+")");
			type(AL_Line1,addrline1);
		}
		if (!addrline2.equals("")) {
			Reporter.log("Step 2 - Enter Line 2 as ("+addrline2+")");
			type(AL_Line2,addrline2);
		}
		if (!addrline3.equals("")) {
			Reporter.log("Step 3 - Enter Line 3 as ("+addrline3+")");
			type(AL_Line3,addrline3);
		}
		if (!addrcitytown.equals("")) {
			Reporter.log("Step 4 - Enter City/Town as ("+addrcitytown+")");
			type(AL_Town, addrcitytown);			
		}
		if (!addrstateprovince.equals("")) {
			Reporter.log("Step 5 - Select State/Province as ("+addrstateprovince+")");
			select(AL_Province, addrstateprovince);
		}
		if (!addrpostalcodezip.equals("")) {
			Reporter.log("Step 6 - Enter Postal Code/Zip as ("+addrpostalcodezip+")");
			type(AL_PostalCode, addrpostalcodezip);
		}
		if (!addrcountry.equals("")) {
			Reporter.log("Step 7 - Enter Country as ("+addrcountry+")");
			select(AL_Country, addrcountry);
		}
		if (!addrsubmit.equals("")) {
			Reporter.log("Step 8 - Click on ("+addrsubmit+") Button");
			if (addrsubmit.equalsIgnoreCase("Submit")) {
				click(AL_Submit);
				waitForPageToLoad();
				click("//ul[@id='lstPickListItems']/li[1]/a[1]");
//				Thread.sleep(2000);
				selectMainWindow();				
			}
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

	@Test(description="This Procedure is to perform some Operation in 'Education Background' page")
	public void EducationBackgroundForm_Input() throws Exception{
		try {
		writeDetails();
//		headerStatement("EducationBackgroundForm_Input");
//		startExecutionOrder(j);
//		writeParametersTable();
		Reporter.log("Proceed to retrieve Input Test Data for 'Education Background' page");
		String[]  educationidatarepo = datacontainer;
		String highschoolname = educationidatarepo[0];
		String highschooltype = educationidatarepo[1];
		String counselorname = educationidatarepo[2];
		String streetaddress = educationidatarepo[3];
		String city = educationidatarepo[4];
		String state = educationidatarepo[5];
		String country = educationidatarepo[6];
		String postalcode = educationidatarepo[7];
		String lookupbutton = educationidatarepo[8];
		String dateofentry = educationidatarepo[9];
		String dateofgraduation = educationidatarepo[10];
		String gpa = educationidatarepo[11];
		String savebutton = educationidatarepo[12];
		Reporter.log("Input Test Data was retrieved for 'Education Background' page");
		if (!highschoolname.equals("")) {
			Reporter.log("Step 1 - Enter High School Name as ("+highschoolname+")");
			String hsnameID = getElementIDbyLabel("High School Name",EB_HighSchoolName);				
			type(hsnameID, highschoolname);
		}
		if (!highschooltype.equals("")) {
			Reporter.log("Step 2 - Select High School Type as ("+highschooltype+")");
			String hstypeID = getElementIDbyLabel("High School Type",EB_HighSchoolType);				
			type(hstypeID, highschooltype);
		}
		if (!counselorname.equals("")) {
			Reporter.log("Step 3 - Enter Counselor Name as ("+counselorname+")");
			String counselorID = getElementIDbyLabel("Counselor Name",EB_CounselorName);				
			type(counselorID, counselorname);
		}
		if (!streetaddress.equals("")) {
			Reporter.log("Step 4 - Enter Street Address as ("+streetaddress+")");
			String streetID = getElementIDbyLabel("Street Address",EB_StreetAddress);				
			type(streetID, streetaddress);
		}
		if (!city.equals("")) {
			Reporter.log("Step 5 - Enter City as ("+city+")");
			String cityID = getElementIDbyLabel("City",EB_City);				
			type(cityID, city);
		}
		if (!state.equals("")) {
			Reporter.log("Step 6 - Enter State as ("+state+")");
			String stateID = getElementIDbyLabel("State",EB_State);				
			type(stateID, state);
		}
		if (!country.equals("")) {
			Reporter.log("Step 7 - Enter Country as ("+country+")");
			String countryID = getElementIDbyLabel("Country",EB_Country);				
			type(countryID, country);
		}
		if (!postalcode.equals("")) {
			Reporter.log("Step 8 - Enter Postal Code as ("+postalcode+")");
			String postalID = getElementIDbyLabel("Postal Code",EB_PostalCode);				
			type(postalID, postalcode);
		}
		if (!lookupbutton.equals("")) {
			Reporter.log("Step 9 - Click on ("+lookupbutton+") Button");
			click(EB_Lookup);
			recentPopupSelect("");
		}
		if (!dateofentry.equals("")) {
			Reporter.log("Step 10 - Enter Date of Entry as ("+dateofentry+")");
			String doentryID = getElementIDbyLabel("Date of Entry",EB_DateofEntry);				
			type(doentryID, dateofentry);
		}
		if (!dateofgraduation.equals("")) {
			Reporter.log("Step 11 - Enter Date of Graduation as ("+dateofgraduation+")");
			String dogradID = getElementIDbyLabel("Date of Graduation",EB_DateofGraduation);				
			type(dogradID, dateofgraduation);
		}
		if (!gpa.equals("")) {
			Reporter.log("Step 12 - Enter GPA as ("+gpa+")");
			String gpaID = getElementIDbyLabel("GPA",EB_GPA);				
			type(gpaID, gpa);
		}
		if (!savebutton.equals("")) {
			Reporter.log("Step 13 - Click on ("+savebutton+") Button");
			if (savebutton.equalsIgnoreCase("Save")) {
				click(EB_Save);
				waitForPageToLoad();
			}else if (savebutton.equalsIgnoreCase("Save & Continue")) {
				click(EB_SaveContinue);
				waitForPageToLoad();
			}else if (savebutton.equalsIgnoreCase("Reset")) {
				click(EB_Reset);				
			}
		}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}	
	
	@Test(description="This Procedure is to perform some Verification in 'Education Background' page")
	public void EducationBackgroundForm_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("EducationBackgroundForm_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Education Background' page");
			String[]  educationvdatarepo = datacontainer;
			String edusuccessmessage = educationvdatarepo[0];
			String edupagename = educationvdatarepo[1];
			String eduverifyui = educationvdatarepo[2];
			String eduhighschoolname = educationvdatarepo[3];
			String eduhighschooltype = educationvdatarepo[4];
			String educounselorname = educationvdatarepo[5];
			String edustreetaddress = educationvdatarepo[6];
			String educity = educationvdatarepo[7];
			String edustate = educationvdatarepo[8];
			String educountry = educationvdatarepo[9];
			String edupostalcode = educationvdatarepo[10];
			String educollegeboardnumber = educationvdatarepo[11];
			String edudateofentry = educationvdatarepo[12];
			String edudateofgraduation = educationvdatarepo[13];
			String edugpa = educationvdatarepo[14];
			Reporter.log("Verify Test Data was retrieved for 'Education Background' page");
			if (!edusuccessmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+edusuccessmessage+") was displayed correctly");
				if (selenium.isTextPresent(edusuccessmessage)) {
					Reporter.log("Message("+edusuccessmessage+") was displayed correctly");
				} else {
					writeFailure("Message("+edusuccessmessage+") was not displayed correctly");
				}
			}
			if (!edupagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+edupagename+") page");
				if (selenium.isTextPresent(edupagename)) {
					Reporter.log("Its navigate to ["+edupagename+"]age");
				} else {
					writeFailure("Its not navigate to ["+edupagename+"] page");
				}
			}
			if (!eduverifyui.equals("")) {
				Reporter.log("Step 3 - Verify UI");
			}
			if (!eduhighschoolname.equals("")) {
				Reporter.log("Step 4 - Verify data("+eduhighschoolname+") was displayed correctly in the 'High School Name' Field");
				String hsnamewaitID = getElementIDbyLabel("High School Name", EB_HighSchoolName_wait);
				waitForConditionisElementPresent(hsnamewaitID, "60000");
	//			selenium.waitForCondition("selenium.isElementPresent(\"//input[@id='q24552' and @value!='']\")", "60000");
				String hsnameID = getElementIDbyLabel("High School Name", EB_HighSchoolName);
				String vhsname = getValue(hsnameID);
				if (vhsname.equals(eduhighschoolname)) {
					Reporter.log("Data("+vhsname+") was displayed correctly in the [High School Name] Field");				
				} else {
					writeFailure("Data("+vhsname+") was not displayed correctly in the [High School Name] Field");
				}
			}
			if (!eduhighschooltype.equals("")) {
				Reporter.log("Step 5 - Verify data("+eduhighschooltype+") was displayed correctly in the 'High School Type' Field");
				String hstypeID = getElementIDbyLabel("High School Type", EB_HighSchoolType);
				String vhstype = getValue(hstypeID);
				if (vhstype.equals(eduhighschooltype)) {
					Reporter.log("Data("+vhstype+") was displayed correctly in the [High School Type] Field");				
				} else {
					writeFailure("Data("+vhstype+") was not displayed correctly in the [High School Type] Field");
				}
			}
			if (!educounselorname.equals("")) {
				Reporter.log("Step 6 - Verify data("+educounselorname+") was displayed correctly in the 'Counselor Name' Field");
				String counselorID = getElementIDbyLabel("Counselor Name", EB_CounselorName);
				String vcounselor = getValue(counselorID);
				if (vcounselor.equals(educounselorname)) {
					Reporter.log("Data("+vcounselor+") was displayed correctly in the [Counselor Name] Field");				
				} else {
					writeFailure("Data("+vcounselor+") was not displayed correctly in the [Counselor Name] Field");
				}
			}
			if (!edustreetaddress.equals("")) {
				Reporter.log("Step 7 - Verify data("+edustreetaddress+") was displayed correctly in the 'Street Address' Field");
				String streetID = getElementIDbyLabel("Street Address", EB_StreetAddress);
				String vstreet = getValue(streetID);
				if (vstreet.equals(edustreetaddress)) {
					Reporter.log("Data("+vstreet+") was displayed correctly in the [Street Address] Field");				
				} else {
					writeFailure("Data("+vstreet+") was not displayed correctly in the [Street Address] Field");
				}
			}
			if (!educity.equals("")) {
				Reporter.log("Step 8 - Verify data("+educity+") was displayed correctly in the 'City' Field");
				String cityID = getElementIDbyLabel("City", EB_City);
				String vcity = getValue(cityID);
				if (vcity.equals(educity)) {
					Reporter.log("Data("+vcity+") was displayed correctly in the [City] Field");				
				} else {
					writeFailure("Data("+vcity+") was not displayed correctly in the [City] Field");
				}
			}
			if (!edustate.equals("")) {
				Reporter.log("Step 9 - Verify data("+edustate+") was displayed correctly in the 'State' Field");
				String stateID = getElementIDbyLabel("State", EB_State);
				String vstate = getValue(stateID);
				if (vstate.equals(edustate)) {
					Reporter.log("Data("+vstate+") was displayed correctly in the [State] Field");				
				} else {
					writeFailure("Data("+vstate+") was not displayed correctly in the [State] Field");
				}
			}
			if (!educountry.equals("")) {
				Reporter.log("Step 10 - Verify data("+educountry+") was displayed correctly in the 'Country' Field");
				String countryID = getElementIDbyLabel("Country", EB_Country);
				String vcountry = getValue(countryID);
				if (vcountry.equals(educountry)) {
					Reporter.log("Data("+vcountry+") was displayed correctly in the [Country] Field");				
				} else {
					writeFailure("Data("+vcountry+") was not displayed correctly in the [Country] Field");
				}
			}
			if (!edupostalcode.equals("")) {
				Reporter.log("Step 11 - Verify data("+edupostalcode+") was displayed correctly in the 'Postal Code' Field");
				String postalID = getElementIDbyLabel("Postal Code", EB_PostalCode);
				String vpostal = getValue(postalID);
				if (vpostal.equals(edupostalcode)) {
					Reporter.log("Data("+vpostal+") was displayed correctly in the [Postal Code] Field");				
				} else {
					writeFailure("Data("+vpostal+") was not displayed correctly in the [Postal Code] Field");
				}
			}
			if (!educollegeboardnumber.equals("")) {
				Reporter.log("Step 12 - Verify data("+educollegeboardnumber+") was displayed correctly in the 'College Board Number (CEEB)' Field");
				String ceebID = getElementIDbyLabel("College Board Number (CEEB)", EB_CollegeBoardNumber);
				String vceeb = getValue(ceebID);
				if (vceeb.equals(educollegeboardnumber)) {
					Reporter.log("Data("+vceeb+") was displayed correctly in the [College Board Number (CEEB)] Field");				
				} else {
					writeFailure("Data("+vceeb+") was not displayed correctly in the [College Board Number (CEEB)] Field");
				}
			}
			if (!edudateofentry.equals("")) {
				Reporter.log("Step 13 - Verify data("+edudateofentry+") was displayed correctly in the 'Date of Entry' Field");
				String doeID = getElementIDbyLabel("Date of Entry", EB_DateofEntry);
				String vdoe = getValue(doeID);
				if (vdoe.equals(edudateofentry)) {
					Reporter.log("Data("+vdoe+") was displayed correctly in the [Date of Entry] Field");				
				} else {
					writeFailure("Data("+vdoe+") was not displayed correctly in the [Date of Entry] Field");
				}
			}
			if (!edudateofgraduation.equals("")) {
				Reporter.log("Step 14 - Verify data("+edudateofgraduation+") was displayed correctly in the 'Date of Graduation' Field");
				String dgID = getElementIDbyLabel("Date of Graduation", EB_DateofGraduation);
				String vdg = getValue(dgID);
				if (vdg.equals(edudateofgraduation)) {
					Reporter.log("Data("+vdg+") was displayed correctly in the [Date of Graduation] Field");				
				} else {
					writeFailure("Data("+vdg+") was not displayed correctly in the [Date of Graduation] Field");
				}
			}
			if (!edugpa.equals("")) {
				Reporter.log("Step 15 - Verify data("+edugpa+") was displayed correctly in the 'GPA' Field");
				String gpaID = getElementIDbyLabel("GPA", EB_GPA);
				String vgpa = getValue(gpaID);
				if (vgpa.equals(edugpa)) {
					Reporter.log("Data("+vgpa+") was displayed correctly in the [GPA] Field");				
				} else {
					writeFailure("Data("+vgpa+") was not displayed correctly in the [GPA] Field");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
		
	
	
	@Test(description="This Procedure is to perform some Operation in 'LookUp' page")
	public void AVSLookUp_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("AVSLookUp_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'LookUp' page");
			String[]  lookupidatarepo = datacontainer;
			String avsname = lookupidatarepo[0];
			String avsaddressline1 = lookupidatarepo[1];
			String avscity = lookupidatarepo[2];
			String avsstate = lookupidatarepo[3];
			String avscountry = lookupidatarepo[4];
			String avssearch = lookupidatarepo[5];
			Reporter.log("Input Test Data was retrieved for 'LookUp' page");
			if (!avsname.equals("")) {
				Reporter.log("Step 1 - Enter Name as ("+avsname+")");
				String nameID = getElementIDbyLabel("Name:",EL_Name);				
				type(nameID, avsname);
			}
			if (!avsaddressline1.equals("")) {
				Reporter.log("Step 2 - Enter Address Line 1 as ("+avsaddressline1+")");
				String addrlineID = getElementIDbyLabel("Address Line 1:",EL_AddressLine1);				
				type(addrlineID, avsaddressline1);
			}
			if (!avscity.equals("")) {
				Reporter.log("Step 3 - Enter City as ("+avscity+")");
				String cityID = getElementIDbyLabel("City:",EL_City);				
				type(cityID, avscity);
			}
			if (!avsstate.equals("")) {
				Reporter.log("Step 4 - Enter State as ("+avsstate+")");
				String stateID = getElementIDbyLabel("State:",EL_State);				
				type(stateID, avsstate);
			}
			if (!avscountry.equals("")) {
				Reporter.log("Step 5 - Enter Country as ("+avscountry+")");
				String countryID = getElementIDbyLabel("Country:",EL_Country);				
				type(countryID, avscountry);
			}
			if (!avssearch.equals("")) {
				Reporter.log("Step 6 - Click on ("+avssearch+") Button");
				if (avssearch.equalsIgnoreCase("search")) {
					click(EL_searchclose+avssearch+"']");
					waitForPageToLoad();
					Reporter.log(" Click on ("+avsname+") Link");
					click(EL_hslink+avsname+"')]");
					selectMainWindow();
				}else if (avssearch.equalsIgnoreCase("close window")) {
					click(EL_searchclose+avssearch+"']");
					selectMainWindow();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
//	 Script started on  '21/05/2012'
	
	@Test(description="This Procedure is to perform some Operation in 'Application Status: Ready for Submission' page")
	public void ApplicationStatus_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Application Status: Ready for Submission' page");
			String[]  appstatusidatarepo = datacontainer;
			String stapriviewappl = appstatusidatarepo[0];
			String stasubmissioncomplete = appstatusidatarepo[1];
			String stacontinue = appstatusidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Application Status: Ready for Submission' page");
			if (!stapriviewappl.equals("")) {
				Reporter.log("Step 1 - Click on ("+stapriviewappl+") Link");
				click(AS_PreviewApp);
			}		
			if (!stasubmissioncomplete.equals("")) {
				Reporter.log("Step 2 - Proceed to ("+stasubmissioncomplete+") Submission Complete! Checkbox");
				if (stasubmissioncomplete.equalsIgnoreCase("Check")) {
					check(AS_Submissioncomplete);
				}else if (stasubmissioncomplete.equalsIgnoreCase("Uncheck")) {
					uncheck(AS_Submissioncomplete);
				}
			}		
			if (!stacontinue.equals("")) {
				Reporter.log("Step 3 - Click on ("+stacontinue+") Button ");
				click(AS_Continue);
				waitForPageToLoad();
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

	@Test(description="This Procedure is to perform some Verification in 'Application Status: Ready for Submission' page")
	public void ApplicationStatus_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationStatus_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Application Status: Ready for Submission' page");
			String[]  appstatusvdatarepo = datacontainer;
			String stapagename = appstatusvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Application Status: Ready for Submission' page");
			if (!stapagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+stapagename+") page");
				if (selenium.isTextPresent(stapagename)) {
					Reporter.log("Its navigate to ["+stapagename+"]age");
				} else {
					writeFailure("Its not navigate to ["+stapagename+"] page");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
	@Test(description="This Procedure is to perform some Operation in 'Application Fee Payment' page")
	public void ApplicationFeePayment_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("ApplicationFeePayment_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Application Fee Payment' page");
			String[]  appfeeidatarepo = datacontainer;
			String feereviewappfee = appfeeidatarepo[0];
			String feepaymentmethod = appfeeidatarepo[1];
			String feepaycontinue = appfeeidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Application Fee Payment' page");
			if (!feereviewappfee.equals("")) {
				Reporter.log("Step 1 - Proceed to Check ("+feereviewappfee+") Review Application Fee Radio");
				if (feereviewappfee.equalsIgnoreCase("Domestic")) {
					check(AF_Domestic);				
				}else if (feereviewappfee.equalsIgnoreCase("International")) {
					check(AF_International);
				}
			}
			if (!feepaymentmethod.equals("")) {
				Reporter.log("Step 2 - Proceed to Check ("+feepaymentmethod+") Select Payment Method Radio");
				if (feepaymentmethod.equalsIgnoreCase("Check")) {
					check(AF_Check);
				}else if (feepaymentmethod.equalsIgnoreCase("Fee Waiver")) {
					check(AF_FeeWaiver);				
				}else if (feepaymentmethod.equalsIgnoreCase("Credit Card")) {
					check(AF_CreditCard);
				}			
			}
			if (!feepaycontinue.equals("")) {
				Reporter.log("Step 3 - Click on ("+feepaycontinue+") Button");
				if (feepaycontinue.equalsIgnoreCase("pay & continue")) {
					clickchooseokgetconfirmationpagepload(AF_PayContinue);
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

	@Test(description="This Procedure is to perform some Operation in 'Signature Page'")
	public void Signature_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("Signature_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Signature Page' ");
			String[]  signatureidatarepo = datacontainer;
			String sigfullname = signatureidatarepo[0];
			String sigdate = signatureidatarepo[1];
			String sigsubmit = signatureidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Signature Page' ");
			if (!sigfullname.equals("")) {
				Reporter.log("Step 1 - Enter Full Name as ("+sigfullname+")");
				type(SP_FullName,sigfullname);
			}
			if (!sigdate.equals("")) {
				Reporter.log("Step 2 - Enter Date as ("+sigfullname+")");
				type(SP_Date,sigdate);
			}
			if (!sigsubmit.equals("")) {
				Reporter.log("Step 3 - Click on ("+sigsubmit+") Button");
				if (sigsubmit.equalsIgnoreCase("submit")) {
					click(SP_Submit);
					waitForPageToLoad();
				}
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
	
	@Test(description="This Procedure is to perform some Verification in 'Submission Complete!' page")
	public void SubmissionComplete_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("SubmissionComplete_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data for 'Submission Complete!' page");
			String[]  subcompletevdatarepo = datacontainer;
			String subpagename = subcompletevdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Submission Complete!' page");
			if (!subpagename.equals("")) {
				Reporter.log("Step 1 - Verify its navigate to ("+subpagename+") page");
				if (selenium.isTextPresent(subpagename)) {
					Reporter.log("Its navigate to ["+subpagename+"]age");
				} else {
					writeFailure("Its not navigate to ["+subpagename+"] page");
				}
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	
//	EssayandAttachmentForm_Input
	
	@Test(description="This Procedure is used to perform some operation in 'Essay and Attachment' page")
	public void EssayandAttachmentForm_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Essay and Attachment' page");
			String[] essayattachidatarepo = datacontainer;
			String shortessay = essayattachidatarepo[0];
			String essaywithattachment = essayattachidatarepo[1];
			String essaywithattachmentuploaddocument = essayattachidatarepo[2];
			String essaywithoutattachment = essayattachidatarepo[3];
			String uploadattachmentonlydocument = essayattachidatarepo[4];
			String uploadmediafile = essayattachidatarepo[5];
			String save = essayattachidatarepo[6];		
			Reporter.log("Input Test Data was retrieved for 'Essay and Attachment' page");
			
			if (!shortessay.equals("")) {
				String shortessayID = getElementIDbyLabel("Short Essay", EA_ShortEssay);
				type(shortessayID,shortessay);	
			}
			if (!essaywithattachment.equals("")) { 
				String essaywithattachmentID = getElementIDbyLabel("Essay with Attachment", EA_EssaywithAttachment);
				type(essaywithattachmentID,essaywithattachment);	
			}
			if (!essaywithattachmentuploaddocument.equals("")) {
				if (essaywithattachmentuploaddocument.equals("upload document")) {
					click(EA_EssaywithAttachment_UploadDocument);
					recentPopupSelect("File Upload");
				}else if (essaywithattachmentuploaddocument.equals("view document")) {
					click(EA_EssaywithAttachment_ViewDocument);
				}else if (essaywithattachmentuploaddocument.equals("delete")) {
					chooseOkOnNextConfirmation();
					click(EA_EssaywithAttachment_DeleteDocument);
					getConfirmation();
				}
			}
			if (!essaywithoutattachment.equals("")) {
				String essaywithoutattachmentID = getElementIDbyLabel("Essay without Attachment", EA_EssaywithoutAttachment);
				type(essaywithoutattachmentID,essaywithoutattachment);	
			}
			if (!uploadattachmentonlydocument.equals("")) {
				if (uploadattachmentonlydocument.equals("upload document")) {
					click(EA_AttachmentOnly_UploadDocument);
					recentPopupSelect("File Upload");
				}else if (uploadattachmentonlydocument.equals("view document")) {
					click(EA_AttachmentOnly_ViewDocument);
				}else if (uploadattachmentonlydocument.equals("delete")) {
					chooseOkOnNextConfirmation();
					click(EA_AttachmentOnly_DeleteDocument);
					getConfirmation();
				}
			}

			if (!uploadmediafile.equals("")) {
				if (uploadmediafile.equals("Upload File")) {
					click(EA_MediaAttachment_UploadFile);
					recentPopupSelect("File Upload");
				}else if (uploadmediafile.equals("View File")) {
					click(EA_MediaAttachment_Viewfile);
				}else if (uploadmediafile.equals("delete")) {
					chooseOkOnNextConfirmation();
					click(EA_MediaAttachment_Deletefile);
					getConfirmation();
				}

			}
			if (!save.equals("")) {
				if (save.equals("Save")) {
					click(EA_Save);
					waitForPageToLoad();
				} else if (save.equals("Save & Continue")) {
					click(EA_SaveandContinue);
					waitForPageToLoad();
				}else if (save.equals("Reset")) {
					click(EA_Reset);
				}else if (save.equals("close window")) {
					click(EA_CloseButton);
					selectMainWindow();	
				}
			}			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	



//	Hariharan**************************************************************************	
	
	
//*************************************************************************************
//	
//		  App Name      : Apply Yourself
//		  Created by    : Shiva
//		  Created On    : 
//		  Last Modified :
//		 
//*************************************************************************************
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
				Reporter.log("Step 7 - Click on ("+fpsearch+") Button");
				if (fpsearch.equalsIgnoreCase("search")) {
					click(FRP_Search);
					waitForPageToLoad();
			}else if (fpsearch.equalsIgnoreCase("close window")) {
					click(upaclosebtn);
					selectMainWindow();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	@Test(description="This Procedure is to perform some Verification in 'Forgot Password Verification'  page")
		public void ForgotPassword_Verify(){
		try {
			writeDetails();
//			headerStatement("ForgotPassword_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Test Data in forgot password verify");
			String[]  fpverifydata = datacontainer;
			String fpmessage = fpverifydata[0];
			String fppagename = fpverifydata[1];
	//		String ui = fpverifydata[2];
			Reporter.log("Email is sent to your account");
			if (!fpmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+fpmessage+") was displayed correctly");
				if (selenium.isTextPresent(fpmessage)) {
					Reporter.log("Message("+fpmessage+") was displayed correctly");
				}else {
					writeFailure("Message("+fpmessage+") was not displayed correctly");
				}			
			}
			if (!fppagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+fppagename+") page");
				if (selenium.isTextPresent(fppagename)) {
					Reporter.log("Its navigate to 'PIN Lookup' page");
				} else {
					writeFailure("Its not navigate to 'PIN Lookup' page");
				}	
		
		
//		if (!ui.equals("")) {
//			
//		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
		}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}
		@Test(description="This Procedure is to perform some Operation in 'Personal Data' page")
		public void PersonalData_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Input");
//			startExecutionOrder(j);
//			writeParametersTable();	
			Reporter.log("Proceed to retrieve Test Data in Personal Data input");
			String[]  fpdatarepo = datacontainer;
			String pdsufix = fpdatarepo[0];
			String pdfirstname = fpdatarepo[1];
			String pdmiddlename = fpdatarepo[3];
			String pdlastname = fpdatarepo[4];
			String pddateofbirth = fpdatarepo[5];
			String pdssn = fpdatarepo[6];
			String pdparentssn = fpdatarepo[7];
			String pdgender = fpdatarepo[8];
			String pdhomephone = fpdatarepo[9];
			String pdcellphone = fpdatarepo[10];
			String pdfulltimestudent = fpdatarepo[11];
			String pdextracircularactivities = fpdatarepo[12];
			String pdcountry = fpdatarepo[13];
			String pdstate = fpdatarepo[14];
			String pdgradelevel = fpdatarepo[15];
			String pdessay = fpdatarepo[16];
			String pdupload = fpdatarepo[17];
			String pdcollegehousing = fpdatarepo[18];
			String pdsportsintrest = fpdatarepo[19];
			String pdtestscore = fpdatarepo[20];
			String pdacademicintrest = fpdatarepo[21];
			String pdschoolcode = fpdatarepo[22];
			String pdemailaddress= fpdatarepo[23];
			String pdaptnumber = fpdatarepo[24];
			String pdemailrecommended = fpdatarepo[25];
			String pdsave = fpdatarepo[26];
			Reporter.log("Retrieved Test Data in Personal Data input");
			if (!pdsufix.equals("")) {
				Reporter.log("Step 1 - Select Suffix as ("+pdsufix+")");
				String Sufixpd = getElementIDbyLabel("Suffix",PD_Suffix);				
				select(Sufixpd,pdsufix);
			}
			if (!pdfirstname.equals("")) {
				Reporter.log("Step 2 - Enter First Name as ("+pdfirstname+")");
				String Fnamepd = getElementIDbyLabel("First Given Name",PD_FirstGivenName);				
				type(Fnamepd,pdfirstname+Calendar.getInstance().getTimeInMillis());
			}
			if (!pdmiddlename.equals("")) {
				Reporter.log("Step 3 - Enter Middle Name as ("+pdmiddlename+")");
				String MNamepd = getElementIDbyLabel("Middle Name",PD_Middlename);				
				type(MNamepd,pdmiddlename);
			}
			if (!pdlastname.equals("")) {
				Reporter.log("Step 4 - Enter Last Name as ("+pdlastname+")");
				String LNamepd = getElementIDbyLabel("Last Name",PD_Lastname);				
				type(LNamepd,pdlastname);
			}
			if (!pddateofbirth.equals("")) {
				Reporter.log("Step 5 - Enter Date of birth as ("+pddateofbirth+")");
				String Dateofbirthpd = getElementIDbyLabel("Date of birth",PD_Dateofbirth);				
				type(Dateofbirthpd,pddateofbirth);
			}
			if (!pdssn.equals("")) {
				Reporter.log("Step 6 - Enter SSN as ("+pdssn+")");
				String SSNpd = getElementIDbyLabel("SSN",PD_SSN);				
				type(SSNpd,pdssn);
			}
			if (!pdparentssn.equals("")) {
				Reporter.log("Step 7 - Enter Parent SSN as ("+pdparentssn+")");
				String Pssnpd = getElementIDbyLabel("Parent SSN",PD_ParentSSN);				
				type(Pssnpd,pdparentssn);
			}
			if (!pdgender.equals("")) {
				Reporter.log("Step 8 - Select Gender as ("+pdgender+")");
				String Genderpd = getElementIDbyLabel("Gender",PD_Gender);				
				select(Genderpd,pdgender);
			}
			if (!pdhomephone.equals("")) {
				Reporter.log("Step 9 - Enter Home phone as ("+pdhomephone+")");
				String Homephonepd = getElementIDbyLabel("Home Phone",PD_HomePhone);				
				type(Homephonepd, pdhomephone);
			}
			if (!pdcellphone.equals("")) {
				Reporter.log("Step 10 - Enter Cell Phone as ("+pdcellphone+")");
				String Cellphonepd = getElementIDbyLabel("Cell Phone",PD_CellPhone);				
				type(Cellphonepd, pdcellphone);
			}
			if (!pdfulltimestudent.equals("")) {
				Reporter.log("Step 11 - Check Full Time Student as ("+pdfulltimestudent+")");
				if (pdfulltimestudent.equalsIgnoreCase("Yes")){
					click(PD_Fulltimestudent_Yes);		
				}else if  (pdfulltimestudent.equalsIgnoreCase("No")){
					click(PD_Fulltimestudent_No);
				}			
			}
			if (!pdextracircularactivities.equals("")) {
				Reporter.log("Step 12 - Enter Extracurricular activities as ("+pdcellphone+")");
				String Extracircularpd = getElementIDbyLabel("Extracurricular activities",PD_Extracurricularactivities);				
				type(Extracircularpd,pdextracircularactivities);
			}
			if (!pdcountry.equals("")) {
				Reporter.log("Step 13 - Select Country as ("+pdcountry+")");
				String Countrypd = getElementIDbyLabel("Country",PD_Country);				
				select(Countrypd,pdcountry);
			}
			if (!pdstate.equals("")) {
				Reporter.log("Step 14 - Select State / province as ("+pdstate+")");
				String Statepd = getElementIDbyLabel("State / province",PD_Stateprovince);				
				select(Statepd,pdstate);
			}
			if (!pdgradelevel.equals("")) {
				Reporter.log("Step 15 - Check Grade Level as ("+pdgradelevel+")");
				String Gradelevelpd = getElementIDbyLabel("Grade Level",PD_GradeLevel);
				check(Gradelevelpd);
			}
			if (!pdessay.equals("")) {
				Reporter.log("Step 16 - Select Essay without attachment as ("+pdessay+")");
				String Essaypd = getElementIDbyLabel("Essay without attachment",PD_Essaywithoutattachment);				
				select(Essaypd,pdessay);
			}
			if (!pdupload.equals("")) {
				Reporter.log("Step 17 - Upload document ("+pdupload+")");
				String Uploaddocumentpd = getElementIDbyLabel("upload document", PD_uploaddocument);
				type(Uploaddocumentpd, pdupload);
			}
			if (!pdcollegehousing.equals("")) {
				Reporter.log("Step 18 - Select Do you intend to live in college housing as ("+pdcollegehousing+")");
				String Collegehousingpd = getElementIDbyLabel("Do you intend to live in college housing", PD_Collegehousing);
				type(Collegehousingpd,pdcollegehousing);
			}
			if (!pdsportsintrest.equals("")) {
				Reporter.log("Step 19 - Select Sports Interest as ("+pdsportsintrest+")");
				String Sportsintrestpd = getElementIDbyLabel("Favourite Sports", PD_SportsInterest);
				select(Sportsintrestpd,pdsportsintrest);			
			}
			if (!pdtestscore.equals("")) {
				Reporter.log("Step 20 - Enter Test score as ("+pdtestscore+")");
				String Testscorepd = getElementIDbyLabel("Test score",PD_Testscore);
				type(Testscorepd,pdtestscore);
			}
			if (!pdacademicintrest.equals("")) {
				Reporter.log("Step 21 - Enter Academic Interest as ("+pdacademicintrest+")");
				String Academicinterestpd = getElementIDbyLabel("Academic Interest",PD_AcademicInterest);
				type(Academicinterestpd,pdacademicintrest);
			}
			if (!pdschoolcode.equals("")) {
				Reporter.log("Step 23 - Enter School code as ("+pdschoolcode+")");
				String Schoolcodepd = getElementIDbyLabel("School code",PD_SchoolCode);
				type(Schoolcodepd,pdschoolcode);
			}
			if (!pdemailaddress.equals("")) {
				Reporter.log("Step 24 - Enter Email address as ("+pdemailaddress+")");
				String Emailaddresspd = getElementIDbyLabel("Email address",PD_Emailaddress);
				type(Emailaddresspd,pdemailaddress);
			}
			if (!pdaptnumber.equals("")) {
				Reporter.log("Step 25 - Enter Apt number as ("+pdaptnumber+")");
				String Aptnumberpd = getElementIDbyLabel("Apt number",PD_Aptnumber);
				type(Aptnumberpd,pdaptnumber);
			}
			if (!pdemailrecommended.equals("")) {
				Reporter.log("Step 26 - Enter EmailRecommended as ("+pdemailrecommended+")");
				String Emailrecommendedpd = getElementIDbyLabel("EmailRecommended",PD_EmailRecommended);
				type(Emailrecommendedpd,pdemailrecommended);
			}
	
			if (!pdsave.equals("")) {
				Reporter.log("Step 27 - Click on ("+pdsave+")Button");
				if(pdsave.equalsIgnoreCase("Save")){
					click(PD_Save);
					waitForPageToLoad();
				}else if (pdsave.equalsIgnoreCase("Save & Continue")) {
					click(PD_SaveContinue);
					waitForPageToLoad();
				}else if (pdsave.equalsIgnoreCase("Reset")) {
					click(PD_Reset);
				}
			}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	@Test(description="This Procedure is to perform some Verification in 'Personal Data' page")
		public void PersonalData_Verify() throws Exception{
		try {
			writeDetails();
//			headerStatement("PersonalData_Verify");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Verify Test Data 'Personal Data' page");
			String[]  fpvdatarepo = datacontainer;
			String successmessage = fpvdatarepo[0];
			String pagename = fpvdatarepo[1];
			String verifyui = fpvdatarepo[2];
			Reporter.log("Verify Test Data was retrieved for 'Personal Data' page");
			if (!successmessage.equals("")) {
				Reporter.log("Step 1 - Verify Message("+successmessage+") was displayed correctly");
				if (selenium.isTextPresent(successmessage)) {
					Reporter.log("Message("+successmessage+") was displayed correctly");
				} else {
					writeFailure("Message("+successmessage+") was not displayed correctly");
				}
			}
			if (!pagename.equals("")) {
				Reporter.log("Step 2 - Verify its navigate to ("+pagename+") page");
				if (selenium.isTextPresent(pagename)) {
					Reporter.log("Its navigate to 'Update Profile' page");
				} else {
					writeFailure("Its not navigate to 'Update Profile' page");
				}			
			}
			if (!verifyui.equals("")) {
			
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		//endExecutionOrder(j);
//		Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
	@Test(description="This Procedure is to add a 'recommendation' page")
	public void Recommendations_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("AccountProfile_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Test Data in Recommendations input");
			String[]  rcdatarepo = datacontainer;
			String rcrecommenderproviderlist = rcdatarepo[0];
			String rcrecommendername = rcdatarepo[1];
			String rcrecommendercheck = rcdatarepo[2];
			String rcaddbutton = rcdatarepo[3];
			String rcfirstname = rcdatarepo[4];
			String rclastname = rcdatarepo[5];
			String rcstreetaddressline1 = rcdatarepo[6];
			String rcstreetaddressline2 = rcdatarepo[7];
			String rccity = rcdatarepo[8];
			String rcstate = rcdatarepo[9];
			String rcpostalcode = rcdatarepo[10];
			String rccountry = rcdatarepo[11];
			String rcphone = rcdatarepo[12];
			String rcemailaddress = rcdatarepo[13];
			String rctitle = rcdatarepo[14];
			String rcemployer = rcdatarepo[15];
			String rcrelationshiptoyou = rcdatarepo[16];
			String rcrectype = rcdatarepo[17];
			String rcwaiverighttoexamineletter = rcdatarepo[18];
			String rcproviderecommendationonline = rcdatarepo[19];
			String rcpersonalnote = rcdatarepo[20];
			String rcsave = rcdatarepo[21];
			Reporter.log("Retrieved Test Data in Recommendations input");
			if (!rcrecommenderproviderlist .equals("")) {
				Reporter.log("Step 1 - Click button("+rcrecommenderproviderlist +")");
					click(RC_RecProviderlist);
			}
			if (!rcrecommendername .equals("")) {
				Reporter.log("Step 2 - Click recommender name ("+rcrecommendername+")");
				click(RC_RecProvidername);
			}
			if (!rcrecommendercheck .equals("")) {
				Reporter.log("Step 3 - Check recommender as ("+rcrecommendercheck+")");
				String Recommendercheckrc = getElementIDbyLabel("recommenderchk",RC_RecProvidercheck);
				check(Recommendercheckrc);
			}
			if (!rcaddbutton.equals("")) {
				Reporter.log("Step 4 - Click ("+rcaddbutton+")");
				click(RC_Add);
			}
			if (!rcfirstname.equals("")) {
				Reporter.log("Step 5 - Enter First name as ("+rcfirstname +")");
				String Fnamerc = getElementIDbyLabel("First Name",RC_fName);				
				type(Fnamerc,rcfirstname );
			}
			if (!rclastname.equals("")) {
				Reporter.log("Step 6 - Enter Last Name as ("+rclastname+")");
				String Lnamerc = getElementIDbyLabel("Last Name",RC_lName);				
				type(Lnamerc,rclastname);
			}
			if (!rcstreetaddressline1.equals("")) {
				Reporter.log("Step 7 - Enter Street Address (Lane 1) as ("+rcstreetaddressline1+")");
				String Saddress1rc = getElementIDbyLabel("Street Address (Lane 1)",RC_Address1);				
				type(Saddress1rc,Saddress1rc);
			}
			if (!rcstreetaddressline2.equals("")) {
				Reporter.log("Step 8 - Enter Street Address (Lane 2) as ("+rcstreetaddressline2+")");
				String Saddress2rc = getElementIDbyLabel("Street Address (Lane 2)",RC_Address2);				
				type(Saddress2rc,rcstreetaddressline2);
			}
			if (!rccity.equals("")) {
				Reporter.log("Step 9 - Enter City as ("+rccity+")");
				String Cityrc = getElementIDbyLabel("City",RC_City);				
				type(Cityrc, rccity);
			}
			if (!rcstate.equals("")) {
				Reporter.log("Step 10 - Select State as ("+rcstate+")");
				String Staterc = getElementIDbyLabel("State",RC_State);				
				select(Staterc, rcstate);
			}
			if (!rcpostalcode.equals("")) {
				Reporter.log("Step 11 - Select Postal Code as ("+rcpostalcode+")");
				String  Postalcoderc= getElementIDbyLabel("Postal Code",RC_PostalCode);				
				type(Postalcoderc,rcpostalcode);
			}
			if (!rccountry.equals("")) {
				Reporter.log("Step 12 - Select Country as ("+rccountry+")");
				String Countrypd = getElementIDbyLabel("Country",PD_Country);				
				select(Countrypd,rccountry);
			}
			if (!rcphone.equals("")) {
				Reporter.log("Step 13 - Enter Phone  as ("+rcphone+")");
				String Phonerc = getElementIDbyLabel("Phone",RC_Phone);				
				type(Phonerc,rcphone);
			}
			if (!rcemailaddress.equals("")) {
				Reporter.log("Step 14 - Enter Email Address as ("+rcemailaddress+")");
				String Emailaddressrc = getElementIDbyLabel("Email Address",RC_EmailAddress);				
				type(Emailaddressrc,rcemailaddress);
			}
			if (!rctitle.equals("")) {
				Reporter.log("Step 15 - Enter Title as ("+rctitle+")");
				String Titlerc = getElementIDbyLabel("Title",RC_Title);				
				type(Titlerc, rctitle);
			}
			if (!rcemployer.equals("")) {
				Reporter.log("Step 16 - Enter Employer as ("+rcemployer+")");
				String Employerrc = getElementIDbyLabel("Employer",RC_Employer);				
				select(Employerrc,rcemployer);
			}
			if (!rcrelationshiptoyou.equals("")) {
				Reporter.log("Step 17 - Enter Relationship to you ("+rcrelationshiptoyou+")");
				String Relationshiptoyourc = getElementIDbyLabel("Relationship to you", RC_Relationyou);
				type(Relationshiptoyourc, rcrelationshiptoyou);
			}
			if (!rcrectype.equals("")) {
				Reporter.log("Step 18 - Select Recommendation type as ("+rcrectype+")");
				String Rectyperc = getElementIDbyLabel("Recommendation type", RC_Recommendationtype);
				select(Rectyperc,rcrectype);
			}
			if (!rcwaiverighttoexamineletter.equals("")) {
				Reporter.log("Step 18 - Check Waiver right examine letter as ("+rcwaiverighttoexamineletter+")");
				if (rcwaiverighttoexamineletter.equalsIgnoreCase("Yes")){
					click(RC_waiveright);		
				}else if  (rcwaiverighttoexamineletter.equalsIgnoreCase("No")){
					click(RC_waiveright_No);
				}			
			}
			if (!rcproviderecommendationonline.equals("")) {
				Reporter.log("Step 19 - Check Full Time Student as ("+rcproviderecommendationonline+")");
				if (rcproviderecommendationonline.equalsIgnoreCase("Yes")){
					click(RC_submitletterrecommend);		
				}else if  (rcproviderecommendationonline.equalsIgnoreCase("No")){
					click(RC_submitletterrecommend_No);
				}			
			}
			if (!rcpersonalnote.equals("")) {
				Reporter.log("Step 20 - Enter Relationship to you ("+rcpersonalnote+")");
				String Personalnoterc = getElementIDbyLabel("If you would like to include a personal note in the notification email that is delivered, please use the space below", RC_Notificationemail);
				type(Personalnoterc, rcpersonalnote);
			}
			if (!rcsave.equals("")) {
				Reporter.log("Step 20 - Click on ("+rcsave+")Button");
				click(RC_Save);
				waitForPageToLoad();
			}
			//endExecutionOrder(j);
	//		Reporter.log("##########Start of Execution Order ["+j+"]##########");
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

		
}	
	
	
