package or;

import org.testng.Reporter;

public interface OR {	
//*************************************************************************************
//	
//	 App Name   : Apply Yourself
//	 Created by  : Hariharan
//	 Created On  : 
//	 Last Modified :
//	 
//*************************************************************************************
//	====================================Webdriver Default Attribute ==============================================================
public static final String attributeName_classname = "classname";
public static final String attributeName_cssselector = "cssselector";
public static final String attributeName_id = "id";
public static final String attributeName_linktext = "linktext";
public static final String attributeName_name = "name";
public static final String attributeName_partiallinktext = "partiallinktext";
public static final String attributeName_tagname = "tagname";
public static final String attributeName_xpath = "xpath";
//	==================================================================================================
//====================================Browser Name ==============================================================
public static final String Browser_IE= "internetexplorer";
public static final String Browser_FF = "firefox";
public static final String Browser_Chrome = "googlechrome";
public static final String Browser_Safari = "safari";
//==================================================================================================
//#**********************************************************#
//#Login Page
//#**********************************************************#	
public static final String	PinField = "//input[@id='UserID']";
public static final String	PasswordField = "//input[@id='Password']";
public static final String Login = "//input[@alt='login']";
public static final String	ForgotPINPassword ="//a[text()='Forgot your PIN or Password?']";
public static final String CreateAccount = "//img[@alt='create account']";
public static final String ContactUs = "//font[text()='Contact Us']";
public static final String freqa = "//font[text()='Frequently Asked Questions']"; 
public static final String TechnicalSupport = "//font[text()='Technical Support']";
public static final String SecurityInformation = "//font[text()='Security Information']";
public static final String CreateAcctLogin = "//img[@alt='login']";
//#**********************************************************#
//#Account Profile Page
//#**********************************************************#
public static final String	FirstName = "//input[@id='AppFName']";
public static final String	LastName = "//input[@id='AppLName']";
public static final String EmailAddress = "//input[@id='AppEmail']";
public static final String ConfirmEmailAddress = "//input[@id='AppConfirmationEmail']";
public static final String BirthDate = "//input[@id='AppBirthdt']";
public static final String ZipCode = "//input[@id='AppZip']";
public static final String Password = "//input[@id='AppPassword']";
public static final String ConfirmPassword = "//input[@id='AppConPassword']";
//#**********************************************************#
//#Applicant Account Pin Page
//#**********************************************************#
public static final String PinNumber = "//*[contains(text(),'PIN:')]";
//public static final String FC_PinNumber = "xpath=(//*[contains(text(),'PIN:')])[2]";
public static final String FC_PinNumber = "//form[@name='frmConfirmAppAcct']//*[contains(text(),'PIN:')]";

//#**********************************************************#
//#ELUA Page
//#**********************************************************#
public static final String Iagree = "//input[@id='chkAcceptEULA']";
public static final String PrivacyPolicy_Yes = "//input[@name='AppAllowViewPreSubmit' and @value='True']";
public static final String PrivacyPolicy_No = "//input[@name='AppAllowViewPreSubmit' and @value='False']";
public static final String PrivacyPolicy = "css=#AllowViewPreSubmit";
public static final String Continue = "//img[@alt='Continue']";
//#**********************************************************#
//#**********************************************************#
//#Applicant Welcome Page
//#**********************************************************#
public static final String Logoutmain ="//font[text()='";
public static final String Updatetech ="//img[@alt='";
public static final String UpdateProfileBtn ="//img[@alt='Update your Profile']";
public static final String Section ="//font[text()='";
public static final String helphint ="//font[text()='";
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
public static final String countinuebtn = "//img[contains(@src,'continue_small')]";
//#**********************************************************#
//#Applicant Main Page
//#**********************************************************#
public static final String Applpackage = "//a[contains(text(),'";
public static final String eventpackage = "//a[text()='";
public static final String enrollpackage = "//b[text()='";
//#**********************************************************#
//# NetPay Page - NP
//#*********************************************************#
public static final String NP_Cancel = "//input[@id='PageTemplate_ctl00_GWContentPlaceHolder_CancelButton']";
//#**********************************************************#
//# Business Rules Page - BR
//#**********************************************************#
public static final String BR_StudentStatus = "//select[@id='s24419']";
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
public static final String PI_Country = "//select[@id='s24509']";
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
public static final String AL_AddressLink = "//ul[@id='lstPickListItems']/li[1]/a[1]";
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
public static final String EB_SaveBottom = "xpath=(//img[@alt='Save'])[2]";
public static final String EB_SaveContinue = "//img[@alt='Save and Continue']";
public static final String EB_Reset = "//img[@alt='Reset']";
public static final String EB_Lookup = "//input[contains(@value,'Look up')]";
//#**********************************************************#
//# Education Background Lookup Page - EL
//#**********************************************************#
public static final String EL_Name = "//input[@id='Prompt1Field']";
public static final String EL_AddressLine1 = "//input[@id='Prompt2Field']";
public static final String EL_City = "//input[@id='Prompt3Field']";
public static final String EL_State = "//input[@id='Prompt4Field']";
public static final String EL_Country = "//input[@id='Prompt5Field']";
public static final String EL_searchclose = "//img[@alt='";
public static final String EL_hslink = "//a[contains(text(),'";
//#**********************************************************#

//# Application Status Page - AS
//#**********************************************************#
public static final String AS_PreviewApp = "//font[contains(text(),'Preview Application')]";
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
public static final String SP_Submit = "//img[@alt='submit application']";
//#**********************************************************#
//# Essay and Attachment Page - EA
//#**********************************************************#
public static final String EA_SuccessMessage = "css=b[innerHTML='";
public static final String EA_SectionName = "css=font[class='Section']";
public static final String EA_ShortEssay = "//textarea[@id='q24515']";
public static final String EA_EssaywithAttachment = "//textarea[@id='q24516']";
public static final String EA_EssaywithoutAttachment = "//textarea[@id='q24517']";
public static final String EA_EssaywithAttachment_UploadDocument = "xpath=(//img[@alt='Upload Attachment'])[1]";
public static final String EA_EssaywithAttachment_ViewDocument = "xpath=(//img[@alt='View Document'])[1]";
public static final String EA_EssaywithAttachment_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'])[1]";
public static final String EA_AttachmentOnly_UploadDocument = "xpath=(//img[@alt='Upload Attachment'])[2]";
public static final String EA_AttachmentOnly_ViewDocument = "xpath=(//img[@alt='View Document'])[2]";
public static final String EA_AttachmentOnly_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'])[2]";
public static final String EA_MediaAttachment_UploadFile = "xpath=(//img[@alt='Upload Attachment'])[3]";
public static final String EA_MediaAttachment_Viewfile = "xpath=(//img[@alt='View Document'])[3]";
public static final String EA_MediaAttachment_Deletefile = "xpath=(//img[@alt='Delete Attachment'])[3]";
public static final String EA_Save = "//img[@alt='Save']";
public static final String EA_SaveandContinue = "//img[@alt='Save and Continue']";
public static final String EA_Reset = "//img[@alt='Reset']";
public static final String EA_UploadBrowser = "//input[@id='fileUpload']";
public static final String EA_UploadDoc = "//input[@alt='Upload Document']";
public static final String EA_CloseButton = "//img[@alt='close window']";
public static final String EA_CloseWindow = "//img[contains(@src,'admin_close_window_large')]";
public static final String EA_MoveToFolder = "//img[contains(@src,'move_to_folder')]";
public static final String EA_UploadMedia = "//input[@alt='Upload Media']";

//*************************************************************************************
//
// App Name   : Apply Yourself
// Created by  : Shiva
// Created On  : 
// Last Modified :
// 
//*************************************************************************************
//#**********************************************************#
//# Forgot password
//#**********************************************************#
public static final String FRP_Pin = "//input[@id='UserID']";
public static final String FRP_EmailAddre = "//input[@id='Email']";
public static final String FRP_Search = "//input[@alt='search']";
//#**********************************************************#
//# Personal Data Page - PD
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
public static final String PD_Testscore = "//input[@id='q24316']";
public static final String PD_AcademicInterest = "//select[@id='s24317']";
public static final String PD_SchoolCode = "//input[@id='q24318']";
public static final String PD_Emailaddress = "//input[@id='q24319']";
public static final String PD_Aptnumber = "//input[@id='q24395']";
public static final String PD_EmailRecommended = "//input[@id='q24433']";
public static final String PD_Save = "//img[@alt='Save']";
public static final String PD_SaveContinue = "//img[@alt='Save and Continue']";
public static final String PD_Reset = "//img[@alt='Reset']";
//#**********************************************************#
//# Recommendations Page - RC
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
//#**********************************************************#
//#Webcenter Login - WCL
//#*********************************************************#
public static final String WCL_ClientID = "css=input[name='ClientID']";
public static final String WCL_UserID = "css=input[name='UserID']";
public static final String WCL_Password = "css=input[name='Password']";
public static final String WCL_Go = "css=input[alt='Login']";
public static final String WCL_NeedPasswordLogin = "css=a[innerHTML='Need Password or Login Help']";

public static final String WCL_userid = "css=input[name='txtUserID']";
public static final String WCL_firstname = "css=input[name='txtFirstName']";
public static final String WCL_lastname = "css=input[name='txtLastName']";
public static final String WCL_title = "css=input[name='txtTitle']";
public static final String WCL_emailaddress = "css=input[name='txtEmail']";
public static final String WCL_password = "css=input[name='txtNewPassword']";
public static final String WCL_confrmpassword = "css=input[name='txtConfirmNewPassword']";
public static final String WCL_changepassword = "";
public static final String WCL_excludepasswordfromnewaccountemail = "";
public static final String WCL_status = "";
public static final String WCL_locked = "";
public static final String WCL_rolesassigned = "";
public static final String WCL_rolesnotassigned = "css=input[name='cbRoleID1']";
public static final String WCL_privilagesassigned = "";
public static final String WCL_privilagesnotassigned = "";
public static final String WCL_statusreportschedule = "";
public static final String WCL_raaccountassigned = "";
public static final String WCL_button = "//img[contains(@src,'admin_save_small_n')]";
//public static final String WCL_userid = "";
//public static final String WCL_userid = "";
//public static final String WCL_userid = "";

//#**********************************************************#
//#Maintenance center Login - MCL
//#*********************************************************#
public static final String MCL_UserID = "css=input[name='UserID']";
public static final String MCL_Password = "css=input[name='Password']";
public static final String MCL_Loginbutton = "//input[contains(@src,'admin_login_small')]";

//#Logout and click nemu in MC
public static final String MCL_Logoutbutton = "link=logout";
public static final String MCL_ManageClientMenu = "//div[@id='oMenu_oMenu2']";

//# Manage client
public static final String MCL_Searchfor = "css=input[name='srchString']";
public static final String MCL_SearchIn = "";
public static final String MCL_Searchbutton = "//img[contains(@src,'admin_search_small')]";

//# click on page icon in search results screen
public static final String MCL_pageicon = "//img[contains(@src,'quickview_icon')]";
public static final String MCL_ClientName = "link=ayauto";
public static final String MCL_NewSearchbutton = "//img[contains(@src,'new_search_large')]";

//# click on application package
//public static final String MCL_ClientName = "";
public static final String MCL_ModuleName = "link=Admissions ( 157 )";
public static final String MCL_PackageName = "link=Application for QA Automation ( 419 )";
//public static final String 

public static final String MCL_SaveModbutton = "//img[contains(@src,'admin_save_small')]";

//#**********************************************************#
//*************************************************************************************
//
//App Name   : Apply Yourself
//Created by  : Sathish
//Created On  : 
//Last Modified :
//
//*************************************************************************************
//#**********************************************************#
//# Facelift Login Input
//#**********************************************************#
public static final String LI_CreateAccountSelect = "css=#CreateAccountLink";
public static final String LI_UserLoginSelect = "css=#UserLoginLink";
public static final String LI_contactUs = "css=li.footerTopLi > a";
public static final String LI_frAskedQst = "css=#faq";
public static final String LI_technicalSupport = "css=#PreFTTechsupport";
public static final String LI_securityInfo = "css=#PreFTSecurityInfo";
public static final String LI_systemRequirements = "link=System Requirements";
//#**********************************************************#
//# Facelift Login Verify
//#**********************************************************#
public static final String LV_LogoutMsg = "css=#ay-login-text.dynamicText h2";

//#**********************************************************#
//# Facelift Create Account Input
//#**********************************************************#
public static final String CA_FirstName = "css=#aycreateFN";
public static final String CA_LastName = "css=#aycreateLN";
public static final String CA_EmailAddress = "css=#aycreateEMail.emails";
public static final String CA_ConfirmEmailAddress = "css=#aycreateConfirmEMail.emails";
public static final String CA_BirthDate = "css=#aycreateDOB";
public static final String CA_ZipCode = "css=#aycreatePC";
public static final String CA_Password = "css=#aycreatePassword";
public static final String CA_ConfirmPassword = "css=#aycreateConfirmPassword";
public static final String CA_CreateAccountBtn = "css=#ay-createSubmit";
public static final String CA_LoginBtn = "//input[@id='ay-create-login']";
//#**********************************************************#
//# Facelift Create Account Input
//#**********************************************************#
public static final String CA_ConfirmedFstname = "css=div>form>p";
//#**********************************************************#
//# Facelift Term of Use Input
//#**********************************************************#
public static final String TOU_Iagree = "css=#chkAcceptEULA";
public static final String TOU_PrivacPolicy_Yes = "css=#Radio3";
public static final String TOU_PrivacPolicy_No = "css=#Radio4";
public static final String TOU_ContinuAndCreate = "//input[@id='ay-externalSubmit']";
public static final String TOU_PrivacPolicy = "css=#AllowViewPreSubmit";
//#**********************************************************#
//# Facelift Term of Use Verify
//#**********************************************************#
public static final String TOU_pageTitle = "//strong[text()='Terms Of Use']";
//#**********************************************************#
//# Facelift Dashboard Input
//#**********************************************************#
public static final String DB_DbBtn = "//div[@id='header']//a[contains(text(),'Dashboard')]";
public static final String DB_MsgBtn = "css=#message";
public static final String DB_ProfBtn = "css=#Profile";
public static final String DB_TecSupportBtn = "#Techsupport.btn";
public static final String DB_LogoutBtn = "//a[contains(text(),'Log Out')]";
//public static final String DB_QaAutomationStartButton = "//div[@class='appListSubHeader' and h3[text()='Application for QA Automation']]/a[contains(text(),'Start Application')]";
public static final String DB_QaAutomationStartButton = "//div[@class='appListSubHeader' and h3[text()='Application for QA Automation']]/a[contains(text()[2],'Start Application') or contains(text(),'Start Application')]";
//public static final String DB_QaAutomationEditButton = "//div[@class='appListSubHeader' and h3[text()='Application for QA Automation']]/a[contains(text(),'Edit Application')]";
public static final String DB_QaAutomationEditButton = "//div[@class='appListSubHeader' and h3[text()='Application for QA Automation']]/a[contains(text()[2],'Edit Application') or contains(text(),'Edit Application')]";
//public static final String DB_App2StartButton = "//div[@class='appListSubHeader' and h3[text()='Application2']]/a[contains(text(),'Start Application')]";
public static final String DB_App2StartButton = "//div[@class='appListSubHeader' and h3[text()='Application2']]/a[contains(text()[2],'Start Application') or contains(text(),'Start Application')]";
public static final String DB_App2EditButton = "//div[@class='appListSubHeader' and h3[text()='Application for QA Automation']]/a[contains(text()[2],'Edit Application') or contains(text(),'Edit Application')]";
public static final String DB_SubmittedMsg = "//div[@class='span8']//h4";
public static final String DB_ApplicationButton = "//ul[@id='appList']/li[2]/div/a";
public static final String DB_TestButton = "//ul[@id='appList']/li[3]/div/a";
//#**********************************************************#
//# Facelift Dashboard Input
//#**********************************************************#
//public static final String DB_PageTitle = "css=h1.appTitle";
//public static final String DB_PageTitle = "css=#header.container h1.appTitle";
public static final String DB_PageTitle = "css=#appListHeader";
//#**********************************************************#
//# Facelift Applicant Welcome Input
//#**********************************************************#
public static final String AW_StartAppBtn = "css=#StartApp";
public static final String AW_AppInstBtn = "//a[contains(text(),'Application Instructions')]";
public static final String AW_SubAppBtn = "css=input.ay-Submit";
public static final String AW_personalDataLnk = "//font[text()='Personal Data']";
public static final String AW_FamilyBtn = "//font[text()='Family']";
public static final String AW_BussRulesBtn = "//font[text()='Business Rules']";
public static final String AW_PaymentProBtn = "//font[text()='Payment Processing']";
public static final String AW_PerInfoBtn = "//font[text()='Personal Information']";
public static final String AW_EssayAttBtn = "//font[text()='Essay and Attachment']";
public static final String AW_EduBackBtn = "//font[text()='Education Background']";
public static final String AW_RecommendationBtn = "//font[text()='Recommendations']";
public static final String AW_DownFormBtn = "//font[text()='Downloadable Forms']";
public static final String AW_CheckAppBtn = "//font[text()='Check Your Application']";
public static final String AW_AppInstructionBtn = "//font[text()='Application Instructions']";
public static final String AW_ConformationCheck = "css=#checkbox";
public static final String AW_ContinueBtn = "css=#ay-recSubmit";
public static final String AW_DomesticRadio = "css=#AppFeeAmount1";
public static final String AW_InternationalRadio = "css=#AppFeeAmount2";
public static final String AW_CheckRadio = "//input[@id='ptCheck1']";
public static final String AW_FeeWaiverRadio = "css=#ptWaiver1";
public static final String AW_CreditCardRadio = "css=#ptCreditCard";
public static final String AW_PayContinueBtn = "//input[@name='PayButton']";
public static final String FS_FullName = "css=#eSignName";
public static final String FS_Date = "css=#esignDate";
public static final String AW_SubmitAppBtn = "css=#ay-recSubmit";
public static final String AW_PrintPreviewBtn = "//a[contains(text(),'Preview Application in PDF Format')]";
public static final String AW_PrintPreviewPdfBtn = "//*[contains(@href,'windowOpen()')]";
//#**********************************************************#
//# Facelift Personal Data Input
//#**********************************************************#
public static final String PSD_Suffix = "//select[@id='s24304']";
public static final String PSD_FirstGivenName = "//input[@id='q24297']";
public static final String PSD_Middlename = "//input[@id='q24298']";
public static final String PSD_Lastname = "//input[@id='q24299']";
public static final String PSD_Dateofbirth = "//input[@id='q24300']";
public static final String PSD_SSN = "//input[@id='q24301']";
public static final String PSD_ParentSSN = "//input[@id='q24302']";
public static final String PSD_Gender = "//select[@id='s24303']";
public static final String PSD_HomePhone = "//input[@id='q24305']";
public static final String PSD_CellPhone = "//input[@id='q24306']";
public static final String PSD_Fulltimestudent_Yes = "//input[@type='radio' and @value='Y']";
public static final String PSD_Fulltimestudent_No = "//input[@type='radio' and @value='N']";
public static final String PSD_Extracurricularactivities = "//textarea[@id='q24308']";
public static final String PSD_Country = "//select[@id='s24309']";
public static final String PSD_Stateprovince = "//select[@id='s24310']";
//public static final String PSD_GradeLevel = "//input[@id='rc24311_1']";
public static final String PSD_GradeLevel = "//input[@value='";
public static final String PSD_Essaywithoutattachment = "//textarea[@id='q24312']";
public static final String PSD_uploaddocument = "//img[@alt='Upload Attachment']";
public static final String PSD_Collegehousing = "//select[@id='s24314']";
public static final String PSD_SportsInterest = "//select[@id='s24315']";
public static final String PSD_Testscore = "//input[@id='q24316']";
public static final String PSD_AcademicInterest = "//select[@id='s24317']";
public static final String PSD_SchoolCode = "//input[@id='q24318']";
public static final String PSD_Emailaddress = "//input[@id='q24319']";
public static final String PSD_Aptnumber = "//input[@id='q24395']";
public static final String PSD_EmailRecommended = "//input[@id='q24433']";
public static final String PSD_Save = "//img[@alt='Save']";
public static final String PSD_SaveBottom = "xpath=(//img[@alt='Save'])[2]";
public static final String PSD_SaveContinue = "//img[@alt='Save and Continue']";
public static final String PSD_Reset = "//img[@alt='Reset']";

//#**********************************************************#
//# Facelift Personal Data Verify
//#**********************************************************#
public static final String PSD_SuccessMsg = "//div[@class='span9']//tr/td/b";
public static final String PSD_PageName = "//div[@class='span9']//tr/td/font";
public static final String PSD_PageName1 = "//div[@class='span9']//font";
public static final String PSD_ErrorMsg = "//div[@class='span9']/div[@id='divErrors']";
//#**********************************************************#
//# Facelift Personal Information Input - PSI
//#**********************************************************#
public static final String PSI_Suffix = "//select[@id='s24494']";
public static final String PSI_FirstName = "//input[@id='q24495']";
public static final String PSI_LastName = "//input[@id='q24496']";
public static final String PSI_FullTimeStudent_Yes = "//input[@value='Y']";
public static final String PSI_FullTimeStudent_No = "//input[@id='N']";
public static final String PSI_EthniValue = "//input[@id='rc58372_4']";
public static final String PSI_SSN = "//input[@id='q24499']";
public static final String PSI_DOB = "//input[@id='q24500']";
public static final String PSI_Sports = "//select[@id='s24501']";
public static final String PSI_Luckyno = "//input[@id='rc24502_2']";
public static final String PSI_AddressLine1_Inactive = "//input[@id='q24503_hq']";
public static final String PSI_AddressLine1 = "//input[@id='q24503']";
public static final String PSI_AddressLine1_wait = "//input[@id='q24503' and @value!='']";
public static final String PSI_AddressLine2 = "//input[@id='q24504']";
public static final String PSI_AddressLine3 = "//input[@id='q24505']";
public static final String PSI_City = "//input[@id='q24506']";
public static final String PSI_State = "//input[@id='q24507']";
public static final String PSI_Zip = "//input[@id='q24508']";
public static final String PSI_Country = "//input[@id='q24509']";
public static final String PSI_AddressLookupBtn = "//input[@value='Address Lookup']";
public static final String PSI_SaveContinue = "//img[@alt='Save and Continue']";
public static final String PSI_Save = "//img[@alt='Save']";
public static final String PSI_Reset = "//img[@alt='Reset']";
//#**********************************************************#
//# Facelift Personal Information Input - PII
//#**********************************************************#
public static final String PII_Suffix = "//select[@id='s24494']";
public static final String PII_FirstName = "//input[@id='q24495']";
public static final String PII_LastName = "//input[@id='q24496']";
public static final String PII_FullTimeStudent_Yes = "//input[@value='Y']";
public static final String PII_FullTimeStudent_No = "//input[@id='N']";
public static final String PII_EthniValue = "//input[@id='rc58372_4']";
public static final String PII_SSN = "//input[@id='q24499']";
public static final String PII_DOB = "//input[@id='q24500']";
public static final String PII_Sports = "//select[@id='s24501']";
public static final String PII_Luckyno = "//input[@id='rc24502_2']";
public static final String PII_AddressLine1_Inactive = "//input[@id='q24503_hq']";
public static final String PII_AddressLine1 = "//input[@id='q24503']";
public static final String PII_AddressLine1_wait = "//input[@id='q24503' and @value='']";
public static final String PII_AddressLine2 = "//input[@id='q24504']";
public static final String PII_AddressLine3 = "//input[@id='q24505']";
public static final String PII_City = "//input[@id='q24506']";
public static final String PII_State = "//select[@id='s24507']";
public static final String PII_Zip = "//input[@id='q24508']";
public static final String PII_Country = "//select[@id='q24509']";
public static final String PII_AddressLookupBtn = "//input[@value='Address Lookup']";
public static final String PII_SaveContinue = "//img[@alt='Save and Continue']";
public static final String PII_Save = "//img[@alt='Save']";
public static final String PII_SaveBottom = "xpath=(//img[@alt='Save'])[2]";
public static final String PII_Reset = "//img[@alt='Reset']";
//#**********************************************************#
//# Facelift User Login Input - UI
//#**********************************************************#
public static final String UL_PinField = "css=#ay-login";
public static final String UL_PswdField = "css=#ay-password";
public static final String UL_Login = "css=#ay-loginSubmit";
//public static final String UL_ForgotPINPassword = "css=#forgotPIN";
public static final String UL_ForgotPINPassword = "//a[@id='forgotPIN']";
//#**********************************************************#
//# Facelift Forgot Password Verify - FPV
//#**********************************************************#
//public static final String FPV_PageName = "//div[@id='dialog']/div[@class='modal-header']/h3";
public static final String FPV_PageName = "//h3[@id='modalheader']";
public static final String FPV_SuccessMsg = "//div[@id='modalbody']/form/font";
public static final String FPV_ErrorMsg = "//div[@id='divErrMsg']";
//#**********************************************************#
//# Facelift Forgot Password Input - FPV
//#**********************************************************#
public static final String FPI_Pin = "css=#UserID";
public static final String FPI_EmailAddr = "css=#Email";
//public static final String FPI_Search = "css=#ay-forgotSubmit";
public static final String FPI_Search = "//input[@id='ay-forgotSubmit']";
public static final String FPI_upaclosebtn = "css=#modalClose";
//#**********************************************************#
//# Facelift Essay and Attachment Input - EAI
//#**********************************************************#
public static final String EAI_SuccessMessage = "css=b[innerHTML='";
public static final String EAI_SectionName = "css=font[class='Section']";
public static final String EAI_ShortEssay = "//textarea[@id='q24515']";
public static final String EAI_EssaywithAttachment = "//textarea[@id='q24516']";
public static final String EAI_EssaywithoutAttachment = "//textarea[@id='q24517']";
public static final String EAI_EssaywithAttachment_UploadDocument = "xpath=(//img[@alt='Upload Attachment'])[1]";
public static final String EAI_EssaywithAttachment_ViewDocument = "xpath=(//img[@alt='View Document'])[1]";
public static final String EAI_EssaywithAttachment_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'])[1]";
public static final String EAI_AttachmentOnly_UploadDocument = "xpath=(//img[@alt='Upload Attachment'])[2]";
public static final String EAI_AttachmentOnly_ViewDocument = "xpath=(//img[@alt='View Document'])[2]";
public static final String EAI_AttachmentOnly_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'])[2]";
public static final String EAI_MediaAttachment_UploadFile = "xpath=(//img[@alt='Upload Attachment'])[3]";
public static final String EAI_MediaAttachment_Viewfile = "xpath=(//img[@alt='View Document'])[3]";
public static final String EAI_MediaAttachment_Deletefile = "xpath=(//img[@alt='Delete Attachment'])[3]";
public static final String EAI_Save = "//img[@alt='Save']";
public static final String EAI_SaveandContinue = "//img[@alt='Save and Continue']";
public static final String EAI_Reset = "//img[@alt='Reset']";
public static final String EAI_UploadBrowser = "//input[@id='fileUpload']";
public static final String EAI_UploadDoc = "//input[@alt='Upload Document']";
public static final String EAI_CloseButton = "//img[@alt='close window']";
//#**********************************************************#
//# Facelift Email Verifications - Webmail
//#**********************************************************#
//public static final String HC_From = "//tr[td[text()='From:']]/td/b[text()='"; //system@hobsons.com']
//public static final String HC_To = "//tr[td[contains(text(),'To:')]]/td[text()='"; //hobsonscoordinator@hotmail.com']
//public static final String HC_Subject = "//li/h2[contains(text(),'"; //AppReview new user account set up')]
//public static final String HC_Body = "//div[@id='mpf0_MsgContainer']";
//public static final String HC_LinkContians = "//a[contains (text(),'";
public static final String HC_UserName = "//input[@name='user_name']";
public static final String HC_Password = "//input[@name='password']";
public static final String HC_Login = "//input[@value='Log-In']";
public static final String HC_MailBody = "//iframe[@id='ifBdy']";
//public static final String HC_MailBody_Content = "//iframe[@id='ifBdy']/html/body[ocsi='1']";
public static final String HC_MailBody_Content = "css=html>body[ocsi='1']";
public static final String HC_LogOff = "//span[text()='Log Off']";
public static final String HC_From = "//span[@id='spnFrom']";
public static final String HC_To = "//span[@id='spnR']";
public static final String HC_Subject = "//div[@id='divSubj']/pre"; 
//public static final String HC_Body = "//div[@dir='ltr']";
//public static final String HC_Body = "//body[@class='hmmessage']";
public static final String HC_Body = "//html/body";
public static final String HC_LinkContians = "//a[contains (text(),'"; 
public static final String HC_EmailSubject = "xpath=(//table[@id='tblIL'])[2]/tbody/tr[td[img[@alt='Message: Unread']]]/td[text()='";
public static final String HC_EmailSubjectContains = "xpath=(//table[@id='tblIL'])[2]/tbody/tr[td[img[@alt='Message: Unread']]]/td[contains(text(),'";
public static final String HC_Content_LinkContians = "css=a:contains('";
//public static final String HC_Content_Link = "css=a[innerHTML=']";
//public static final String HC_CloseButton = "//button[text()='Close']";
public static final String HC_Content_Link = "css=a[innerHTML='";
public static final String HC_CloseButton = "//button[text()='Close'";
//#**********************************************************#
//# Facelift Forgot Password Verify - FPV
//#**********************************************************#
//public static final String RPI_password = "css=#Password";
//public static final String RPI_confirmpass = "css=#ConPassword";
public static final String RPI_password = "Password";
public static final String RPI_confirmpass = "ConPassword";
public static final String RPI_submit = "//input[contains(@src,'submit_small')]";
//public static final String RPI_closewindow = "//div[@id='divErrMsg']";
//#**********************************************************#
//# Facelift Application Welcome Verify - AW
//#**********************************************************#
public static final String AW_PageTitle = "//div[@id='ay-landing-text']/b";

//#**********************************************************#
//# Facelift Application Welcome Input - AW
//#**********************************************************#
public static final String AW_App2Lnk = "//div[@id='menu']//a[contains(text(),'Application2')]";
public static final String AW_VirginiaLnk = "//div[@id='menu']//font[contains(text(),'Virginia')]";
public static final String AW_DoYouLiveYes = "//input[@value='Y']";
public static final String AW_DoYouLiveNo = "//input[@value='N']";
public static final String AW_Fa1rfaxLnk = "//div[@id='menu']//font[text()='Fa1rfax']";
public static final String TS_PageName = "//div[@id='mainnav']//a[contains(text(),'Support Center')]";
public static final String EA_MediaAttach_UploadMedia = "xpath=(//img[@alt='Upload Attachment'])[3]";
public static final String EA_MediaAttach_Viewfile = "xpath=(//img[@alt='View Document'])[3]";
public static final String EA_MediaAttach_Deletefile = "xpath=(//img[@alt='Delete Attachment'])[3]";
public static final String EA_PageTitle = "//div[@class='span9']//font";
public static final String RC_RecProBtn = "//a[contains(text(),'Recommendation Provider List')]";
public static final String RC_AddProBtn = "//a[contains(text(),'add a provider')]";

//#**********************************************************#
//# Facelift Recommendation Input - RI
//#**********************************************************#
public static final String RI_FirstName = "css=#firstname";
public static final String RI_LastName = "css=#lastname";
public static final String RI_StreedAddress1 = "css=#address1";
public static final String RI_StreedAddress2 = "css=#address2";
public static final String RI_City = "css=#city";
public static final String RI_State = "css=#state";
public static final String RI_Zip = "css=#zip";
public static final String RI_Country = "css=#country";
public static final String RI_Phone = "css=#phone";
public static final String RI_Email = "css=#email";
public static final String RI_Title = "css=#title";
public static final String RI_Employer = "css=#employer";
public static final String RI_Relationship = "css=#relationship";
public static final String RI_Recommendationtype = "css=#recommendationtype";
public static final String RI_WaeveRecY = "//input[@id='rbY1' and @value='Yes']";
public static final String RI_WaeveRecN = "//input[@id='rbN1' and @value='No']";
public static final String RI_ProviderRecY = "//input[@id='rbY2' and @value='Yes']";
public static final String RI_ProviderRecN = "//input[@id='rbN2' and @value='No']";
public static final String RI_MessageToRec = "css=#MessageToRcmd";
public static final String RI_AddProvBtn = "css=input#ay-recSubmit1";
public static final String RI_AddProvBtnBottom = "xpath=(//input[@value='Add Provider'])[2]";
//#**********************************************************#
//# Facelift CEEB Lookup - CB
//#**********************************************************#
public static final String CB_Name = "css=#Prompt1Field";
public static final String CB_AddLine1 = "css=#Prompt2Field";
public static final String CB_City = "css=#Prompt3Field";
public static final String CB_State = "css=#Prompt4Field";
public static final String CB_Country = "css=#Prompt5Field";
public static final String CB_Search = "//input[@value='search']";
//#**********************************************************#
//# Facelift Business Rules Input
//#**********************************************************#
public static final String BR_StudentStatusApp = "//select[@id='s24419']";
public static final String AW_SportsLnk = "//span[@class='menuImage']//font[text()='Sports']";
//#**********************************************************#
//# Section Rules Input
//#**********************************************************#
public static final String SRI_PageTitle = "//td/font[text()='Virginia']";
public static final String SRI_Fa1rfaxLnk = "//a/font[text()='Fa1rfax']";
public static final String SRI_SportsLnk = "//a/font[text()='Sports']";
//public static final String PD_ErrorMsg = "//div[@id='divAyMsg']//td[@class='BasePageFont']";
public static final String PD_ErrorMsg = "//td[@class='BasePageFont']";
public static final String ALI_FirstLnk = "//div[@id='pnlPickList']/ul/li[1]";
public static final String DF_FormName = "//font[@class='BasePageFont' ]/a[contains(text(),'";
//#**********************************************************#
//# Webcenter Input
//#**********************************************************#
public static final String WebcenterHomePageLable = "//div[@class='ay_pageTitle']";
public static final String WebcenterSelectSys = "//div[@id='oMenu_mnuSelMod']";
public static final String WebcenterApplicationSys = "//div[@id='oMenu_mnuAdm']";
public static final String WebcenterEventSys = "//div[@id='oMenu_mnuEvent']";
public static final String WebcenterAppForQaAuto = "//div[text()='Application for QA Automation']";
public static final String WebcenterEventPackage = "//div[text()='Event Package']";
public static final String WebcenterAddAnApplicant = "//div[@id='oMenu_mnuAddApp']";
public static final String WebcenterQuickAddApplicant = "//div[text()='Add a QuickAdd Application']";
public static final String WebcenteSearchForApplicants = "//div[text()='Search for Applicants']";
public static final String WebcenteLogout = "//a[contains(text(),'logout')]";
public static final String WebcenteOnlineSupportTop = "//tr[@valign='top']//a[contains(text(),'online support')]";
public static final String WebcenteOnlineSupportBottom = "//div[@class='footerLinks']/a[contains(text(),'Online Support')]";
public static final String WebcenteProdSug = "//div[@class='footerLinks']/a[contains(text(),'Product Suggestions')]";
//#**********************************************************#
//# Webcenter Search For Applicant Input - SAI
//#**********************************************************#
public static final String SAI_NoOFRecords = "//select[@name='PageSize']";
public static final String SAI_SubmitRadioBtn = "//input[@type='radio' and @value='yes']";
public static final String SAI_NotSubmitRadioBtn = "//input[@type='radio' and @value='no']";
public static final String SAI_BothtRadioBtn = "//input[@type='radio' and @value='both']";
public static final String SAI_ViewRecords = "//input[@name='chkAgree']";
public static final String SAI_CreationDateRadio = "//input[@name='SearchTypes' and @value='creationDate']";
public static final String SAI_SubmissionDateRadio = "//input[@name='SearchTypes' and @value='submissionDate']";
public static final String SAI_CreationDate = "//select[@name='Days']";
public static final String SAI_SubmissionDate = "//select[@name='SubmitDays']";
public static final String SAI_FirstName = "//input[@name='FirstName']";
public static final String SAI_LastName = "//input[@name='LastName']";
public static final String SAI_BirthDate = "//input[@name='BirthDate']";
public static final String SAI_EmailAddress = "//input[@name='Email']";
public static final String SAI_Zip = "//input[@name='ZipCode']";
public static final String SAI_Pin = "//input[@name='Pin']";
public static final String SAI_ApplicantID = "//input[@name='ApplyyourSelfID']";
public static final String SAI_SysQuries = "//select[@name='SysQuery']";
public static final String SAI_UserQuries = "//select[@name='QueryID']";
public static final String SAI_SearchGroupSelect = "//input[@value='group']";
public static final String SAI_SearchbyActionSelect = "//input[@value='action']";
public static final String SAI_SubmitBtnBottom = "//input[@name='imageField2']";
public static final String SAI_SearchByIndividualsSubmit = "//td[font[contains(text(),'Individual')]]/following-sibling::td/input[contains(@src,'admin_submit_small')]";
public static final String SAI_SearchByDateSubmit = "//td[font[contains(text(),'Search by Date')]]/following-sibling::td/input[contains(@src,'admin_submit_small')]";
public static final String SAI_SearchByIndividualsRadio = "//td[font[contains(text(),'Individual')]]/preceding-sibling::td/input[@type='radio']";
//#**********************************************************#
//# Webcenter Search For Applicant Verify - SAV
//#**********************************************************#

public static final String SAV_FormHeading = "//td[@class='FormHeading']";
public static final String SAV_FormMsg = "//td[@class='FormText']";
public static final String SAV_FormLabel = "//table/tbody/tr/td[text()='";
public static final String SAV_PageName = "//div[@id='AYInstructions']/following-sibling::font";
public static final String PageName = "//div[@id='AYInstructions']/following-sibling::font";

//#**********************************************************#
//# Account Profile Page - AP
//#**********************************************************#
public static final String AP_PageTitle = "//font[@class='Section']";
//#**********************************************************#
//# EULA Page - EL
//#**********************************************************#
public static final String EL_PageTitle = "css=td.BasePageFont b:contains('Terms of Use')";
//#**********************************************************#
//# Main Page - MN
//#**********************************************************#
public static final String MN_PageTitle = "//*[contains(text(),'Univeristy of AYAUTO')]";
public static final String MN_BaseTableFont = "//td[@class='BaseTableFont']";
//#**********************************************************#
//# Event Search All Page - ESA
//#**********************************************************#
public static final String ESA_LocationOfEvent = "//select[@id='evWhere']";
public static final String ESA_FromDate = "//input[@id='evWhenFrom']";
public static final String ESA_ToDate = "//input[@id='evWhenTo']";
public static final String ESA_EventType = "//select[@id='evCategory']";
public static final String ESA_PastAndFuture = "//input[@value='All']";
public static final String ESA_Future = "//input[@value='Future']";
public static final String ESA_FutureWithSpace = "//input[@id='FutureOpen']";
public static final String ESA_SearchByEvent = "//a[contains(@href,'ValidateAndSubmitEventInfo')]";
public static final String ESA_Message = "//td[@class='BaseTableFont']";
public static final String ESA_NoEventsMessage = "//td[@class='BaseTableFont']/b";
//#**********************************************************#
//# Webcenter Applicant Search Results - ASR
//#**********************************************************#
public static final String ASR_SelectanAction = "//select[@name='ActionTypeID']";
public static final String ASR_ApplySelected = "//input[@type='radio' and @value='selected']";
public static final String ASR_ApplyAll = "//input[@type='radio' and @value='all']";
public static final String ASR_Ascending = "//input[@type='radio' and contains(@value,'ASC')]";
public static final String ASR_Descending = "//input[@type='radio' and contains(@value,'DESC')]";
public static final String ASR_NewSearchbtn = "//img[contains(@src,'new_search_large')]";
public static final String ASR_BackBtn = "//img[contains(@src,'admin_back_small')]";
public static final String ASR_GoBtn = "//img[contains(@src,'go_small')]";
public static final String ASR_Pagename = "//table[@id='ResultsTable']//td/font";
public static final String ASR_CheckBox = "']]/preceding-sibling::td/input[@type='checkbox']";
//#**********************************************************#
//# Webcenter Print Application - PA
//#**********************************************************#
public static final String PA_ActionHistory = "//input[@name='RecordAction']";
public static final String PA_Description = "css=input[name='Description']";
public static final String PA_PrintDate = "//input[@name='RecordPrintDt']";
public static final String PA_DuplexPrinting = "//input[@name='DuplexPrinting']";
public static final String PA_PrintBookmarkers = "//input[@name='PrintBookmarks']";
public static final String PA_PdfFile = "//select[@name='PDFFile']";
public static final String PA_ExecutePDFRules = "//input[@name='ExecutePDFRules']";
public static final String PA_UncheckExclude = "//input[@name='PrintEssays']";
public static final String PA_IncludeRecomendation = "//input[@name='IncludeRecs']";
//public static final String PA_PrintBtn = "//img[contains(@src,'admin_print_small')]";
public static final String PA_BackBtn = "//img[contains(@src,'admin_back_small')]";
public static final String PA_PageName = "//tr[@class='FormText']/td/font";
public static final String PA_PrintBtn = "//img[@alt='print']";
//#**********************************************************#
//# Webcenter Applicant Summary - AS
//#**********************************************************#
public static final String AS_Submitted = "//td[@class='FormText']/a[2]";
public static final String AS_InprocessStatus = "//select[@name='InProcessStatus']";
public static final String AS_InprocessStatusDate = "//input[@name='InProcPubDate']";
public static final String AS_StatusPublishDate = "//input[@name='CompPubDate']";
public static final String AS_Decision = "//select[@name='Decision']";
public static final String AS_DecisionReason = "//select[@name='DecisionReason']";
public static final String AS_DecisionDate = "//input[@name='DecDate']";
public static final String AS_DecisionPublishDate = "//input[@name='DecPubDate']";
public static final String AS_EnrolmentDeadLineDate = "//input[@name='EnrollDeadlineDate']";
public static final String AS_ApplicationFee = "//input[@name='chkAppFee']";
public static final String AS_Transcripts = "//input[@name='chkTranscripts']";
public static final String AS_SaveBtn = "//img[contains(@src,'admin_save_small')]";
public static final String AS_PrintApplicationBtn = "//span[contains(text(),'print application')]";
public static final String AS_CloseWindow = "//img[contains(@src,'admin_close_window')]";
//#**********************************************************#
//# Webcenter Batch Printing - BP
//#**********************************************************#
public static final String BP_PageName = "//div[@id='AYInstructions']/following-sibling::font";
public static final String BP_BackBtn = "//img[contains(@src,'admin_back_small')]";
//public static final String BP_ApplicationBatchs = "//img[contains(@src,'application_batches')]";
public static final String BP_ConformationMsg = "//td[@class='FormHeading']/b";
public static final String CloseWindow = "//img[@alt='close window']";
public static final String ApplicantCloseWindow = "//img[contains(@src,'admin_close_window_large')]";
public static final String BP_ApplicationBatchs = "//img[@alt='Application Batches']";
public static final String BP_RefreshBtn = "//img[@alt='Refresh Search']";
//#**********************************************************#
//# Webcenter Question Add/Edit Page - QAE
//#**********************************************************#
public static final String QAE_Name = "//input[@name='txtDispName']";
public static final String QAE_Description = "//textarea[@name='txtDescription']";
public static final String QAE_Label = "//textarea[@name='txtLabel']";
public static final String QAE_CaptionPossitionTop = "//input[@name='chkCaptionPos' and @value='1']";
public static final String QAE_CaptionPossitionBottom = "//input[@name='chkCaptionPos' and @value='0']";
public static final String QAE_Caption = "//input[@name='txtCaption']";
public static final String QAE_FieldType = "//select[@name='txtResponseTypeID']";
public static final String QAE_QuestionGroup = "//select[@name='txtChoiceGroupID']";
public static final String QAE_Required = "//input[@name='chkRequired']";
public static final String QAE_TestRequired = "//input[@name='chktestRequired']";
public static final String QAE_DefaultValue = "//input[@name='txtDefaultValue']";
public static final String QAE_Internal = "//input[@name='chkInternal']";
public static final String QAE_AllowBatchUpdate = "//input[@name='chkAllowBatchUpdate']";
public static final String QAE_Transfer = "//input[@name='chkTransfer']";
public static final String QAE_Displaythisquestionbefore = "//select[@name='selorderquestion']";
public static final String QAE_Order = "//input[@name='txtOrderSeq']";
public static final String QAE_QuickView = "//input[@name='chkQuickView']";
public static final String QAE_QuestionCategory = "//select[@name='txtQuestionCategoryID']";
public static final String QAE_QuickAdd = "//input[@name='chkQuickAdd']";
public static final String QAE_DisplayOnly = "//input[@name='chkdisplayonly']";
public static final String QAE_Script = "//textarea[@name='javascriptEvent']";
public static final String QAE_SaveButton = "//img[contains(@src,'admin_save_small')]";
public static final String QAE_CancelButton = "//img[contains(@src,'cancel_small')]";
public static final String QAE_FieldLength = "//input[@name='txtResponseLength']";
public static final String QAE_FieldFormat = "//select[@name='txtFormat']";
public static final String QAE_QuestionBefor = "//select[@name='selorderquestion']";
public static final String QAE_PageName = "//div[@id='AYInstructions']/following-sibling::font";
public static final String QAE_Message = "//div[@id='divAyConfirmation']/font";
//#**********************************************************#
//# Webcenter Section Add/Edit Page - SAE
//#**********************************************************#
public static final String SAE_PageName = "//div[@id='AYInstructions']/following-sibling::font";
public static final String SAE_Name = "//input[@name='txtDispName']";
public static final String SAE_Description = "//textarea[@name='txtDescription']";
public static final String SAE_TextBlock = "//textarea[@name='txtTextBlock']";
public static final String SAE_Label = "//textarea[@name='txtLabel']";
public static final String SAE_Internal = "//textarea[@name='txtLabel']";
public static final String SAE_Order = "//input[@name='txtOrderSeq']";
public static final String SAE_AfterSubmission = "//input[@name='chkUpdatePostSubmit']";
public static final String SAE_InterviewSection = "//input[@name='chkInterviewSection']";
public static final String SAE_Script = "//textarea[@name='javascriptEvent']";
public static final String SAE_ScriptSelect = "//select[@name='xmltag']";
public static final String SAE_SaveButton = "//img[contains(@src,'admin_save_small')]";
public static final String SAE_DeleteButton = "//img[contains(@src,'admin_delete_small')]";
public static final String SAE_EditButton = "//img[contains(@src,'edit_small')]";
public static final String SAE_CancelButton = "//img[contains(@src,'cancel_small')]";
//#**********************************************************#
//# Webcenter Edit HTML Page - HTML
//#**********************************************************#
public static final String HTML_Properties = "//img[contains(@src,'properties_small')]";
public static final String HTML_Save = "//img[contains(@src,'admin_save_small')]";
public static final String HTML_PreviewWebcenter = "//img[contains(@src,'admin_preview_webcenter')]";
public static final String HTML_Preview = "//img[contains(@src,'preview_small')]";
public static final String HTML_Build = "//img[contains(@src,'build_small')]";
public static final String HTML_PublishToProd = "//img[contains(@src,'publish_prod_large')]";
public static final String HTML_PublishToDev = "//img[contains(@src,'publish_dev_large')]";
public static final String QA_Question = "//input[@id='q31501']";
//#**********************************************************#
//# Webcenter Edit Section Rule Page - ESR
//#**********************************************************#
public static final String ESR_Name = "//input[@name='txtName']";
public static final String ESR_Description = "//textarea[@name='txtDescription']";
public static final String ESR_Section = "//select[@name='selSection']";
public static final String ESR_Field = "//select[@name='txtField0']";
public static final String ESR_Operator = "//select[@name='txtOperator0']";
public static final String ESR_ValueSelect = "//select[@name='txtValue0']";
public static final String ESR_ValueText = "//input[@name='txtValue0']";
public static final String ESR_RadioYes = "//input[@value='Y']";
public static final String ESR_RadioNo = "//input[@value='N']";
public static final String ESR_Save = "//img[contains(@src,'admin_save_small')]";
public static final String ESR_Cancel = "//img[contains(@src,'cancel_small')]";
//#**********************************************************#
//# Webcenter Manage Section Rule Page - MSR
//#**********************************************************#
public static final String MSR_AddBtn = "//img[contains(@src,'admin_add_small')]";
public static final String MSR_DeleteBtn = "//img[contains(@src,'admin_delete_small')]";
public static final String MSR_BackBtn = "//img[contains(@src,'admin_back_small')]";
public static final String PS_HobsonsLogo = "//div[@id='masthead']";
//#**********************************************************#
//# Webcenter Add/Edit Event Page - AEE
//#**********************************************************#
public static final String AEE_ClasEvent = "//input[@value='Event']";
public static final String AEE_ClasInterview = "//input[@value='Interview']";
public static final String AEE_IntName = "//input[@name='txtInternalName']";
public static final String AEE_Title = "//input[@name='txtTitle']";
public static final String AEE_Description = "//textarea[@name='txtDescription']";
public static final String AEE_EventType = "//select[@name='selEventType']";
public static final String AEE_Category = "//select[@name='selCategory']";
public static final String AEE_DisplayPIN = "//input[@name='displayPIN']";
public static final String AEE_Where = "//select[@name='selWhere']";
public static final String AEE_Location = "//textarea[@name='txtLocation']";
public static final String AEE_Directions = "//textarea[@name='txtDirections']";
public static final String AEE_StartDate = "//input[@name='txtStartDay']";
public static final String AEE_StartHour = "//select[@name='selHourStart']";
public static final String AEE_StartMinute = "//select[@name='selMinutesStart']";
public static final String AEE_EndDate = "//input[@id='Text1']";
public static final String AEE_EndHour = "//select[@name='selHourEnd']";
public static final String AEE_EndMinute = "//select[@name='selMinutesEnd']";
public static final String AEE_StartAccDate = "//input[@name='txtAcceptDay']";
public static final String AEE_StartAccHour = "//select[@name='selHourStartAccept']";
public static final String AEE_StartAccMinute = "//select[@name='selMinutesStartAccept']";
public static final String AEE_RSVPDate = "//input[@name='txtRSVPDay']";
public static final String AEE_RSVPHour = "//select[@name='selHourRSVP']";
public static final String AEE_RSVPMinute = "//select[@name='selMinutesRSVP']";
public static final String AEE_DeclineDate = "//input[@name='txtDeclineDt']";
public static final String AEE_DeclineHour = "//select[@name='selHourDecline']";
public static final String AEE_DeclineMinute = "//select[@name='selMinutesDecline']";
public static final String AEE_CloseEventText = "//input[@name='txtCloseText']";
public static final String AEE_MaxNoOfReg = "//input[@name='txtMaxRegistrants']";
public static final String AEE_IncGuestReg = "//input[@name='chkIncludeGuests']";
public static final String AEE_WaitlistEmail = "//select[@name='selWaitListEmail']";
public static final String AEE_RecurrenceType = "//select[@name='selRecurrenceType']";
public static final String AEE_RegDeclineEmail = "//select[@name='selRegOrDecEmail']";
public static final String AEE_RemainderEmail = "//select[@name='selReminderEmail']";
public static final String AEE_NonRespondEmail = "//select[@name='selNonRespondantEmail']";
public static final String AEE_ThankYouEmail = "//select[@name='selThankYouEmail']";
public static final String AEE_DidNotAttenEmail = "//select[@name='selNotAttendEmail']";
public static final String AEE_Group = "//select[@name='selGroup']";
public static final String AEE_Save = "//img[contains(@src,'admin_save_small')]";
public static final String AEE_PubToProd = "//img[contains(@src,'publish_prod_large')]";
public static final String AEE_CloseWindow = "//img[contains(@src,'admin_close_window_large')]";
//#**********************************************************#
//# Webcenter Event Summary Page - ES
//#**********************************************************#
public static final String ES_UrlLink = "//a[contains(@href,'";
public static final String ES_ReturnHome = "//a[contains(text(),'Return to Event Home')]";
//#**********************************************************#
//# Webcenter Search For Event Page - SFE
//#**********************************************************#
public static final String SFE_EventType = "//select[@name='evType']";
public static final String SFE_Status = "']/preceding-sibling::input[count(input)+1]";
public static final String SFE_Host = "//select[@name='evHost']";
public static final String SFE_EventCategory = "//select[@name='evCategory']";
public static final String SFE_Where = "//select[@name='evWhere']";
public static final String SFE_Title = "//input[@name='evTitle']";
public static final String SFE_InternalName = "//input[@name='evIName']";
public static final String SFE_SearchByRadio = "']]/preceding-sibling::td/input[@type='radio']";
public static final String SFE_SearchBySubmit = "']]/following-sibling::td/input[contains(@src,'admin_submit_small')]";
//#**********************************************************#
//# Webcenter Event Search Results Page - EVR
//#**********************************************************#
public static final String EVR_SelectAnAction = "//select[@name='EventActionTypeID']";
public static final String AEV_SuccessMsg = "//div[@id='divAyConfirmation']";
//#**********************************************************#
//# Recommendation Login Page
//#**********************************************************#
public static final String RL_PerAccessCode = "//input[@id='Pin']";
public static final String RL_Password = "//input[@id='Password']";
public static final String RL_ConfirmPass = "//input[@id='ConPassword']";
public static final String RL_LoginBtn = "//input[@alt='Login']";
public static final String RL_SubmitBtn = "//input[@alt='submit' or @alt='Login']";
public static final String TOU_CheckUncheck = "//input[@id='chkAcceptEULA']";
public static final String TOU_Continue = "//img[@alt='Continue']";
public static final String GS_NextBtn = "//img[@alt='next']";
public static final String CP_Goback = "//img[@alt='Bo Back']";
public static final String CP_Update = "//input[@alt='update']";
public static final String CP_Continue = "//img[@alt='Continue']";
public static final String CP_Message = "//table[not(@id)]//td[@class='BasePageFont']";
public static final String CP_CurrentPass = "//input[@id='oldPassword']";
public static final String CP_NewPass = "//input[@id='newPassword']";
public static final String CP_ConfirmPass = "//input[@id='conNewPassword']";
//#**********************************************************#
//#	 WebMail Login Page - Hotmail
//#**********************************************************#
public static final String HM_WLogin = "//input[@id='i0116']";
public static final String HM_WPassword = "//input[@id='i0118']";
public static final String HM_WSignIn = "//input[@id='idSIButton9']";
public static final String HM_Inbox = "Inbox";
public static final String HM_InboxSide ="//span[contains(@class,'FolderLabel') and contains(text(),'Inbox')]";
//#**********************************************************#
//#	 Recommendation - Contact Information Page - CI
//#**********************************************************#
public static final String CI_LstName = "//input[@id='q24564']";
public static final String CIV_LstName = "//input[@id='q24564";
public static final String CI_FstName = "//input[@id='q24565']";
public static final String CI_Prefix = "//select[@id='s24566']";
public static final String CI_PositionOrTitle = "//input[@id='q24567']";
public static final String CI_Organization = "//input[@id='q24568']";
public static final String CI_UploadDocBtn = "//img[@alt='Upload Attachment']";
public static final String CI_Email = "//input[@id='q24569']";
public static final String CI_StreetAdd = "//input[@id='q24570']";
public static final String CI_City = "//input[@id='q24571']"; 
public static final String CI_State = "//select[@id='s24572']";
public static final String CI_PostalCode = "//input[@id='q24573']";
public static final String CI_Country = "//select[@id='s24574']";
public static final String CI_NextBtn = "//img[@alt='next']";
public static final String CI_SaveBtn = "//img[@alt='save']";
public static final String CI_BackBtn = "//img[@alt='back']";
public static final String CI_PageName = "//td[@class='Color1']/font";
public static final String CI_SectionMenu = "//table[@class='rightBorder']";
public static final String MoreDetails = "//font[@class='HelpBoxesFont']/b";
//#**********************************************************#
//#	 Recommendation - Secondary School Supp Page - SSS
//#**********************************************************#
public static final String SSS_SchoolStudied = "//input[@id='q25336']";
public static final String SSS_FromDate = "//input[@id='q25337']";
public static final String SSS_ToDate = "//input[@id='q25338']";
public static final String SSS_SysMsg = "//td[@class='BasePageFont']";
public static final String SSS_PageName = "//font[@class='Section']";
//#**********************************************************#
//#	 Recommendation - Middle School Supp Page - MSS
//#**********************************************************#
public static final String MSS_Sports = "//input[@id='q25339']";
public static final String MSS_RecStudent = "//input[@id='q25340']";
//#**********************************************************#
//#	 Recommendation - Preview and submit Page - PAS
//#**********************************************************#
public static final String PAS_PrevRecPdf = "//a[text()='Preview Recommendation']";
public static final String PAS_SubmitBtn = "//img[@alt='submit']";
//#**********************************************************#
//#	 Maintanance - Applicant Lookup - AL
//#**********************************************************#
public static final String AL_ClientID = "//input[@name='ClientID']";
public static final String AL_LastName = "//input[@name='LastName']";
public static final String AL_FirstName = "//input[@name='FirstName']";
public static final String AL_EmailAdd = "//input[@name='EmailAddress']";
public static final String AL_DOB = "//input[@name='DOB']";
public static final String AL_ZipCOde = "//input[@name='ZipCode']";
public static final String AL_AppPinRecPAC = "//input[@name='PIN']";
public static final String AL_AppClientID = "//input[@name='ApplicantClientID']";
public static final String AL_LastAccessedModified = "//select[@id='selLastAccess']";
public static final String AL_ProfileCreated = "//select[@id='selProfileCreated']";
public static final String AL_LookupApp = "//input[@value='app']";
public static final String AL_LookupRec = "//input[@value='rec']";
public static final String AL_SubmitBtn = "//img[contains(@src,'admin_submit_small')]";
//#**********************************************************#
//#	 Maintanance - Manage Client Search - AL
//#**********************************************************#
public static final String MCS_ClientID = "//input[@value='srchClientAbbr']";
public static final String MCS_ClientName = "//input[@value='srchClientName']";
public static final String RPT_RunBtn = "//img[contains(@src,'run_small')]";
//#**********************************************************#
//#	 Maintanance - Schedule Import/Export - Page
//#**********************************************************#
public static final String SIE_AddImpSched = "//img[contains(@src,'add_import')]";
public static final String SIE_AddExpSched = "//img[contains(@src,'add_export')]";
public static final String SIE_DeleteBtn = "//img[contains(@src,'admin_delete_small')]";
//#**********************************************************#
//#	 Enrollment - Enrollment Personal Info - Page
//#**********************************************************#
public static final String EPI_AttendYes = "//input[@value='Y']";
public static final String EPI_AttendNo = "//input[@value='N']";
public static final String EPI_FstName = "//input[@id='q24474']";
public static final String EPI_LstName = "//input[@id='q24475']";
public static final String EPI_SayNo = "//input[@id='q24476']";
public static final String EPI_LiveIn = "//select[@id='s29464']";
public static final String EPI_ProToSubBtn = "//img[@alt='proceed to submission']";
public static final String EPI_ResetBtn = "//img[@alt='Reset']";
//#**********************************************************#
//#	 Enrollment - Enrollment Fee Payment - Page
//#**********************************************************#
public static final String EFP_ReturnEnrollBtn = "//img[@alt='return to enrollment form']";
public static final String EFP_PayAndContinue = "//img[@alt='pay and continue']";
public static final String EFP_SubmitEnrollmentBtn = "//img[@alt='submit enrollment']";
public static final String EFP_PrintBtn = "//img[@alt='print this paget']";
public static final String EFP_CloseWindowBtn = "//img[@alt='close window']";
//#**********************************************************#
//#	 Webcenter - Add Import Template - Page
//#**********************************************************#
public static final String AIT_CRLF = "//input[@value='crLf']";
public static final String AIT_LF = "//input[@value='Lf']";
public static final String FS_SubmitApp = "//a[contains(@href,'ApplicationSubmit')]";

}

