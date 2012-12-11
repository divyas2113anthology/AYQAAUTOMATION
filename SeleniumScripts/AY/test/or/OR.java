package or;

public interface OR {	
//*************************************************************************************
//	
//	  App Name      : Apply Yourself
//	  Created by    : Hariharan
//	  Created On    : 
//	  Last Modified :
//	 
//*************************************************************************************
//#**********************************************************#
//#Login Page
//#**********************************************************#	
public static final String	PinField = "//input[@id='UserID']";
public static final String	PasswordField = "//input[@id='Password']";
public static final String  Login = "//img[@alt='login']";
public static final String	ForgotPINPassword="//a[text()='Forgot your PIN or Password?']";
public static final String CreateAccount = "//img[@alt='create account']";
public static final String ContactUs = "//font[text()='Contact Us']";
public static final String freqa = "//font[text()='Frequently Asked Questions']"; 
public static final String TechnicalSupport = "//font[text()='Technical Support']";
public static final String SecurityInformation = "//font[text()='Security Information']";
//#**********************************************************#
//#Account Profile Page
//#**********************************************************#
public static final String	FirstName = "//input[@id='AppFName']";
public static final String	LastName = "//input[@id='AppLName']";
public static final String	EmailAddress = "//input[@id='AppEmail']";
public static final String ConfirmEmailAddress = "//input[@id='AppConfirmationEmail']";
public static final String BirthDate = "//input[@id='AppBirthdt']";
public static final String ZipCode = "//input[@id='AppZip']";
public static final String Password = "//input[@id='AppPassword']";
public static final String ConfirmPassword = "//input[@id='AppConPassword']";

//#**********************************************************#
//#Applicant Account Pin Page
//#**********************************************************#
public static final String PinNumber = "//*[contains(text(),'PIN:')]";

//#**********************************************************#
//#ELUA Page
//#**********************************************************#
public static final String Iagree = "//input[@id='chkAcceptEULA']";
public static final String PrivacyPolicy_Yes = "//input[@name='AppAllowViewPreSubmit' and @value='True']";
public static final String PrivacyPolicy_No = "//input[@name='AppAllowViewPreSubmit' and @value='False']";
public static final String Continue = "//img[@alt='Continue']";
//#**********************************************************#
//#**********************************************************#
//#Applicant Welcome Page
//#**********************************************************#
public static final String Logoutmain ="//font[text()='";
public static final String Updatetech ="//img[@alt='";
public static final String Section  ="//font[text()='";
public static final String helphint  ="//font[text()='";
public static final String PrintBtn = "//img[@alt='";
public static final String updatelink = "//a[text()='";
//#**********************************************************#
//#Update Profile Page
//#**********************************************************#
public static final String	upaFirstName = "//input[@id='AppFName']";
public static final String	upaLastName = "//input[@id='AppLName']";
public static final String	upaEmailAddress = "//input[@id='AppEmail']";
public static final String upaBirthDate = "//input[@id='AppBirthdt']";
public static final String upaZipCode = "//input[@id='AppZip']";
public static final String upaPassword = "//input[@id='AppPassword']";
public static final String upaConfirmPassword = "//input[@id='AppConPassword']";
public static final String upaappsubmission_Yes = "//input[@name='AppAllowViewPreSubmit' and @value='True']";
public static final String upaappsubmission_No = "//input[@name='AppAllowViewPreSubmit' and @value='False']";
public static final String upaupdatebtn = "//img[@alt='update']";
public static final String upaclosebtn = "//img[@alt='close window']";
//#**********************************************************#
//#Applicant Main Page
//#**********************************************************#
public static final String Applpackage = "//a[text()='";
public static final String eventpackage = "//a[text()='";
public static final String enrollpackage = "//b[text()='";
//#**********************************************************#
//# Personal Information Page - PI
//#**********************************************************#
public static final String PI_Suffix = "//select[@id='s24494']";
public static final String PI_FirstName = "//input[@id='q24495']";
public static final String PI_LastName = "//input[@id='q24496']";
public static final String PI_FullTimeStudent_Yes = "//input[@value='Y']";
public static final String PI_FullTimeStudent_No = "//input[@id='N']";
public static final String PI_EthniValue = "//input[@id='rc58372_4']";
public static final String PI_SSN = "//input[@id='q24499']";
public static final String PI_DOB = "//input[@id='q24500']";
public static final String PI_Sports = "//select[@id='s24501']";
public static final String PI_Luckyno = "//input[@id='rc24502_2']";
public static final String PI_AddressLine1_Inactive = "//input[@id='q24503_hq']";
public static final String PI_AddressLine1 = "//input[@id='q24503']";
public static final String PI_AddressLine1_wait = "//input[@id='q24503' and @value!='']";
public static final String PI_AddressLine2 = "//input[@id='q24504']";
public static final String PI_AddressLine3 = "//input[@id='q24505']";
public static final String PI_City = "//input[@id='q24506']";
public static final String PI_State = "//input[@id='q24507']";
public static final String PI_Zip = "//input[@id='q24508']";
public static final String PI_Country = "//input[@id='q24509']";
public static final String PI_AddressLookupBtn = "//input[@value='Address Lookup']";
public static final String PI_SaveContinue = "//img[@alt='Save and Continue']";
public static final String PI_Save = "//img[@alt='Save']";
public static final String PI_Reset = "//img[@alt='Reset']";

//#**********************************************************#
//# Address Lookup Page - AL
//#**********************************************************#
public static final String AL_Line1 = "//input[@id='txtLine1']";
public static final String AL_Line2 = "//input[@id='txtLine2']";
public static final String AL_Line3 = "//input[@id='txtLine3']";
public static final String AL_Town = "//input[@id='txtCityTown']";
public static final String AL_Province = "//select[@id='ddlStateProvince']";
public static final String AL_PostalCode = "//input[@id='txtZip']";
public static final String AL_Country = "//select[@id='ddlQasCountryCode']";
public static final String AL_Submit = "//input[@id='btnValidate']";
//#**********************************************************#
//# Education Background Page - EB
//#**********************************************************#
public static final String EB_HighSchoolName = "//input[@id='q24552']";
public static final String EB_HighSchoolName_wait = "//input[@id='q24552' and @value!='']";
public static final String EB_HighSchoolType = "//select[@id='s24553']";
public static final String EB_CounselorName = "//input[@id='q24554']";
public static final String EB_StreetAddress = "//input[@id='q24555']";
public static final String EB_City = "//input[@id='q24556']";
public static final String EB_State = "//input[@id='q24557']";
public static final String EB_Country = "//input[@id='q24558']";
public static final String EB_PostalCode = "//input[@id='q24559']";
public static final String EB_CollegeBoardNumber = "//input[@id='q24560']";
public static final String EB_DateofEntry = "//input[@id='q24561']";
public static final String EB_DateofGraduation = "//input[@id='q24562']";
public static final String EB_GPA = "//input[@id='q24563']";
public static final String EB_Save = "//img[@alt='Save']";
public static final String EB_SaveContinue = "//img[@alt='Save and Continue']";
public static final String EB_Reset = "//img[@alt='Reset']";
public static final String EB_Lookup = "//input[contains(@value,'Look up')]";
//#**********************************************************#
//#  Education Background Lookup Page - EL
//#**********************************************************#
public static final String EL_Name = "//input[@id='Prompt1Field']";
public static final String EL_AddressLine1 = "//input[@id='Prompt2Field']";
public static final String EL_City = "//input[@id='Prompt3Field']";
public static final String EL_State = "//input[@id='Prompt4Field']";
public static final String EL_Country = "//input[@id='Prompt5Field']";
public static final String EL_searchclose = "//img[@alt='";
public static final String EL_hslink = "//a[contains(text(),'";
//#**********************************************************#

//#  Application Status Page - AS
//#**********************************************************#
public static final String AS_PreviewApp = "//font[text()='Preview Application in PDF Format']";
public static final String AS_Submissioncomplete = "//input[@id='checkbox']";
public static final String AS_Continue = "//img[@alt='continue']";
//#**********************************************************#
//# Application Fee Payment Page - AF
//#*********************************************************#
public static final String AF_Domestic = "//input[@id='AppFeeAmount1']";
public static final String AF_International = "//input[@id='AppFeeAmount2']";
public static final String AF_Check = "//input[@id='ptCheck1']";
public static final String AF_FeeWaiver = "//input[@id='ptWaiver1']";
public static final String AF_CreditCard = "//input[@id='ptCreditCard']";
public static final String AF_PayContinue = "//img[@alt='pay and continue']";
//#**********************************************************#
//# Signature Page - SP
//#*********************************************************#
public static final String SP_FullName = "//input[@id='eSignName']";
public static final String SP_Date = "//input[@id='esignDate']";
public static final String SP_Submit =  "//img[@alt='submit application']";
//#**********************************************************#
//# Essay and Attachment Page - EA
//#**********************************************************#
public static final String EA_ShortEssay = "//textarea[@id='q24515']";
public static final String EA_EssaywithAttachment = "//textarea[@id='q24516']";
public static final String EA_EssaywithoutAttachment = "//textarea[@id='q24517']";
public static final String EA_EssaywithAttachment_UploadDocument = "xpath=(//img[@alt='Upload Attachment'])[1]";
public static final String EA_EssaywithAttachment_ViewDocument =  "xpath=(//img[@alt='View Document'])[1]";
public static final String EA_EssaywithAttachment_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'])[1]";
public static final String EA_AttachmentOnly_UploadDocument = "xpath=(//img[@alt='Upload Attachment'])[2]";
public static final String EA_AttachmentOnly_ViewDocument =  "xpath=(//img[@alt='View Document'])[2]";
public static final String EA_AttachmentOnly_DeleteDocument =  "xpath=(//img[@alt='Delete Attachment'])[2]";
public static final String EA_MediaAttachment_UploadFile = "xpath=(//img[@alt='Upload Attachment'])[3]";
public static final String EA_MediaAttachment_Viewfile = "xpath=(//img[@alt='View Document'])[3]";
public static final String EA_MediaAttachment_Deletefile = "xpath=(//img[@alt='Delete Attachment'])[3]";
public static final String EA_Save = "//img[@alt='Save']";
public static final String EA_SaveandContinue = "//img[@alt='Save and Continue']";
public static final String EA_Reset = "//img[@alt='Reset']";
public static final String EA_UploadBrowser = "//input[@id='fileUpload']";
public static final String EA_UploadDoc = "//input[@alt='Upload Document']";
public static final String EA_CloseButton = "//img[@alt='close window']";

//*************************************************************************************
//
//  App Name      : Apply Yourself
//  Created by    : Shiva
//  Created On    : 
//  Last Modified :
// 
//*************************************************************************************
//#**********************************************************#
//#  Forgot password
//#**********************************************************#
public static final String FRP_Pin = "//input[@id='UserID']";
public static final String FRP_EmailAddre = "//input[@id='Email']";
public static final String FRP_Search = "//input[@alt='search']";
//#**********************************************************#
//#  Personal Data Page - PD
//#**********************************************************#
public static final String PD_Suffix = "//select[@id='s24304']";
public static final String PD_FirstGivenName = "//input[@id='q24297']";
public static final String PD_Middlename = "//input[@id='q24298']";
public static final String PD_Lastname = "//input[@id='q24299']";
public static final String PD_Dateofbirth = "//input[@id='q24300']";
public static final String PD_SSN = "//input[@id='q24301']";
public static final String PD_ParentSSN = "//input[@id='q24302']"; 
public static final String PD_Gender = "//select[@id='s24303']";
public static final String PD_HomePhone = "//input[@id='q24305']";
public static final String PD_CellPhone = "//input[@id='q24306']";
public static final String PD_Fulltimestudent_Yes = "//input[@value='Y']";
public static final String PD_Fulltimestudent_No = "//input[@value='N']";//
public static final String PD_Extracurricularactivities = "//textarea[@id='q24308']"; 
public static final String PD_Country = "//select[@id='s24309']";
public static final String PD_Stateprovince = "//select[@id='s24310']";
public static final String PD_GradeLevel = "//input[@id='rc24311_1']";
public static final String PD_Essaywithoutattachment = "//textarea[@id='q24312']";
public static final String PD_uploaddocument = "//img[@alt='Upload Attachment']";
public static final String PD_Collegehousing = "//select[@id='s24314']";
public static final String PD_SportsInterest = "//select[@id='s24315']"; 
public static final String PD_Testscore  = "//input[@id='q24316']";
public static final String PD_AcademicInterest = "//select[@id='s24317']";
public static final String PD_SchoolCode = "//input[@id='q24318']";
public static final String PD_Emailaddress = "//input[@id='q24319']";
public static final String PD_Aptnumber = "//input[@id='q24395']";
public static final String PD_EmailRecommended = "//input[@id='q24433']";
public static final String PD_Save = "//img[@alt='Save']";
public static final String PD_SaveContinue = "//img[@alt='Save and Continue']";
public static final String PD_Reset = "//img[@alt='Reset']";
//#**********************************************************#
//# Recommendations  Page - RC
//#*********************************************************#
public static final String RC_RecProviderlist = "//input[@value='Recommendation Provider List']";
public static final String RC_RecProvidername ="";
public static final String RC_RecProvidercheck ="";
public static final String RC_Add = "//img[@alt='add']";
public static final String RC_fName = "//input[@id='firstname']";
public static final String RC_lName = "//input[@id='lastname']";
public static final String RC_Address1 = "//input[@id='address1']";
public static final String RC_Address2 = "//input[@id='address2']";
public static final String RC_City = "//input[@id='city']";
public static final String RC_State = "//select[@id='state']";
public static final String RC_PostalCode = "//input[@id='zip']";
public static final String RC_Country = "//select[@id='country']";
public static final String RC_Phone = "//input[@id='phone']";
public static final String RC_EmailAddress = "//input[@id='email']";
public static final String RC_Title = "//input[@id='title']";
public static final String RC_Employer = "//input[@id='employer']";
public static final String RC_Relationyou = "//input[@id='relationship']";
public static final String RC_Recommendationtype ="//select[@id='recommendationtype']";
public static final String RC_waiveright = "//input[@name='waveexamine' and @value='Yes']";
public static final String RC_waiveright_No = "//input[@name='waveexamine' and @value='No']";
public static final String RC_submitletterrecommend = "//input[@name='online' and @value='Yes']"; 
public static final String RC_submitletterrecommend_No = "//input[@name='online' and @value='No']"; 
//#public static final String RC_waiveright= "//input[@id='rbY1']";
//#public static final String RC_submitletterrecommend = "//input[@id='rbY2']"; 
public static final String RC_Notificationemail= "//textarea[@id='Textarea1']";
public static final String RC_Save = "//img[@alt='save']";







}
