package or;

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
public static final String	PinField = "//input[@name='UserID']";
public static final String	PasswordField = "//input[@name='Password']";
//public static final String Login = "//input[@value='login']";
public static final String Login = "//input[@id='ay-loginSubmit']";
public static final String	ForgotPINPassword ="//a[text()='Forgot your PIN or Password?']";
public static final String ForgotUserNamePassword = "//a[contains(text(),'User Name')]";
public static final String UserName = "//b[contains(text(),'";
public static final String CreateAccount = "//img[@alt='create account']";
public static final String ContactUs = "//font[text()='Contact Us']";
public static final String freqa = "//font[text()='Frequently Asked Questions']"; 
public static final String TechnicalSupport = "//font[text()='Technical Support']";
public static final String SecurityInformation = "//font[text()='Security Information']";
public static final String CreateAcctLogin = "//img[@alt='login']";
public static final String Message = "//td[contains(.,'"; //Testing for Post Message"')]";
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
//#Account Profile Page Manual Add
//#**********************************************************#
public static final String	FName_Manual = "//input[@name='AppFName']";
public static final String	LName_Manual = "//input[@name='AppLName']";
public static final String Email_Manual = "//input[@name='AppEmail']";
public static final String ConfirmEmail_Manual = "//input[@name='AppVerificationEmail']";
public static final String Birth_Manual = "//input[@name='AppBirthdt']";
public static final String Postal_Manual = "//input[@name='AppZip']";
public static final String CreateAccount_Manual= "//img[@alt='create account']";
public static final String Close_Window_Manual = "//font[contains(text(),'Close Window')]";


//#**********************************************************#
//#Applicant Account Pin Page
//#**********************************************************#
public static final String PinNumber = "//*[contains(text(),'PIN:')]";
//public static final String FC_PinNumber = "xpath=(//*[contains(text(),'PIN:')])[2]";
public static final String FC_PinNumber = "//form[@name='frmConfirmAppAcct']//*[contains(text(),'PIN:')]";
public static final String FC_UserName = "//form[@name='frmConfirmAppAcct']//*[contains(text(),'User Name:')]";

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
public static final String Section ="//font[contains(text(),'";
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
public static final String upaupdatebtn1 = "//img[@alt='update']";
public static final String upaupdatebtn = "//input[@id='ay-createSubmit']";
public static final String upaclosebtnClassic = "//img[@alt='close window']";
public static final String upaclosebtn = "//button[@class='close']";
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
public static final String BR_RuleName = "//a[contains(text(),'";
public static final String BR_Name = "//input[@name='RuleName']";
public static final String BR_Desc = "//textarea[@name='RuleDesc']";
public static final String BR_Folder = "//select[@id='Select1']";
//public static final String BR_UserType = "//select[@name='UserTypeId']";
public static final String BR_UserType = "UserTypeId";
//public static final String BR_Action = "//select[@name='ActionId']";
public static final String BR_Action = "ActionId";
//public static final String BR_AppliesToSection = "//select[@name='SectionId']";
public static final String BR_AppliesToSection = "SectionId";
//public static final String BR_AppliesToQuestion = "//select[@name='QuestionId']";
public static final String BR_AppliesToQuestion = "QuestionId";
//public static final String BR_EventType = "//select[@name='EventTypeId']";
public static final String BR_EventType = "EventTypeId";
//public static final String BR_TargetDocument = "//select[@name='SuppDocID']";
public static final String BR_TargetDocument = "SuppDocID";
public static final String BR_TargetStatus = "//select[@name='DocStatusID']";
//public static final String BR_TargetTestScore = "//select[@name='TestScoreID']";
public static final String BR_TargetTestScore = "TestScoreID";
public static final String BR_TargetGroup = "//select[@name='GroupId']";
public static final String BR_TargetTrack = "//select[@name='TargetTrackId']";
//public static final String BR_TargetForm = "//select[@name='TargetFormId']";
public static final String BR_TargetForm = "TargetFormId";
//public static final String BR_TargetSection = "//select[@name='TargetSectionId']";
public static final String BR_TargetSection = "TargetSectionId";
//public static final String BR_TargetQuestion = "//select[@name='TargetQuestionId']";
public static final String BR_TargetQuestion = "TargetQuestionId";
public static final String BR_TargetValue = "//select[@name='TargetValue']";
public static final String BR_TargetUrl = "//input[@name='TargetURL']";
//public static final String BR_TargetEmail = "//select[@name='EmailId']";
public static final String BR_TargetEmail = "EmailId";
public static final String BR_Save = "//img[@name='imageAdd1']";
public static final String BR_Add = "//img[@name='imageAdd1']";
public static final String BR_Buttons = "//img[contains(@src,'";
public static final String BR_Cancel = "//img[contains(@src,'cancel_small')]";
public static final String BR_PlusFilter = "//img[contains(@src,'plusfilter')]";
public static final String BR_StatusGrey = "//select[@id='DocStatusID' and contains(@style,'Grey')]";
public static final String BR_VerifyStatus = "//select[@id='DocStatusID']/option[contains(text(),'";  //Waived')]";
public static final String BR_FilterName = "//a[contains(text(),'";    //TestFilter')]";
//public static final String BR_VerifyStatus = "//option[contains(@style,'Grey') and [not(contains(text(),'"; 
//#**********************************************************#
//# Personal Information Page - PI
//#**********************************************************#
//public static final String PI_Suffix = "//select[@id='s27099']";
public static final String PI_Suffix = "//input[@id='q24494']";
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
public static final String PI_AddressLine1_wait = "//input[@id='q24503_hq' and @value!='']";
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

//#**********************************************************#//input[@alt='login']
//# Address Lookup Page - AL
//#**********************************************************#
public static final String AL_Line1 = "//input[@id='txtLine1']";
public static final String AL_Line2 = "//input[@id='txtLine2']";
public static final String AL_Line3 = "//input[@id='txtLine3']";
public static final String AL_Town = "//input[@id='txtCityTown']";
//public static final String AL_Province = "//select[@id='ddlStateProvince']";
public static final String AL_Province = "ddlStateProvince";
public static final String AL_PostalCode = "//input[@id='txtZip']";
public static final String AL_Country = "//select[@id='ddlQasCountryCode']";
public static final String AL_Submit = "//input[@id='btnValidate']";
public static final String AL_AddressLink = "//ul[@id='lstPickListItems']/li[1]/a[1]";
public static final String HC_BodyFrame = "iframe";
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
public static final String AS_VerifyApplicationFee = "//li[contains(text(),'TestingApplicationFee')]";
public static final String AS_VerifyTranscripts = "//ul//li[contains(text(),'TranscriptStatus')]";
//#**********************************************************#
//# Application Fee Payment Page - AF
//#*********************************************************#
public static final String AF_Domestic = "//input[@id='AppFeeAmount1']";
public static final String AF_International = "//input[@id='AppFeeAmount2']";
public static final String AF_Check = "//input[@id='ptCheck1']";
public static final String AF_FeeWaiver = "//input[@id='ptWaiver1']";
public static final String AF_CreditCard = "//input[@id='ptCreditCard']";
public static final String AF_PayContinue = "//img[@alt='pay and continue']";
public static final String AF_PaymentStatus = "//select[@name='pmtstatus']";
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
//public static final String EA_EssaywithAttachment_UploadDocument = "xpath=(//img[@alt='Upload Attachment'][1])";
public static final String EA_EssaywithAttachment_UploadDocument = "//img[@alt='Upload Attachment'][1]";
//public static final String EA_EssaywithAttachment_ViewDocument = "xpath=(//a[@alt='View Document'])[1]";
public static final String EA_EssaywithAttachment_ViewDocument = "//a[@alt='View Document'][1]";
//public static final String EA_EssaywithAttachment_ViewDocument = "xpath=(//img[@alt='View Document'][1])";
public static final String EA_EssaywithAttachment_DeleteDocument = "xpath=(//a[@alt='Delete Attachment'])[1]";
//public static final String EA_EssaywithAttachment_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'][1])";
public static final String EA_AttachmentOnly_UploadDocument = "xpath=(//img[@alt='Upload Attachment'])[2]";
public static final String EA_AttachmentOnly_ViewDocument = "xpath=(//a[@alt='View Document'])[2]";
//public static final String EA_AttachmentOnly_ViewDocument = "xpath=(//img[@alt='View Document'])[2]";
public static final String EA_AttachmentOnly_DeleteDocument = "xpath=(//a[@alt='Delete Attachment'])[2]";
//public static final String EA_AttachmentOnly_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'])[2]";
//public static final String EA_MediaAttachment_UploadFile = "xpath=(//img[@alt='Upload Attachment'])[3]";
public static final String EA_MediaAttachment_UploadFile = "xpath=(//a[@alt='Upload Attachment'])[3]";
public static final String EA_MediaAttachment_Viewfile = "xpath=(//a[@alt='View Document'])[3]";
//public static final String EA_MediaAttachment_Viewfile = "xpath=(//img[@alt='View Document'])[3]";
//public static final String EA_MediaAttachment_Deletefile = "xpath=(//a[@alt='Delete Attachment'])[3]";
public static final String EA_MediaAttachment_Deletefile = "xpath=(//a[@alt='Delete Attachment'])[3]";
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
//public static final String FRP_Pin = "//input[@id='UserID']";
public static final String FRP_Pin = "//input[contains(@id,'User')]";
public static final String FRP_EmailAddre = "//input[@id='Email']";
public static final String FRP_Search = "//input[@alt='search']";
//#**********************************************************#
//# Personal Data Page - PD
//#**********************************************************#
public static final String PD_Suffix = "//select[@id='s24304']";
public static final String PD_FirstGivenName = "//input[@id='q24297']";
public static final String PD_Middlename = "//input[@id='q24298']";
public static final String PD_Lastname = "//input[@id='q24299']";
public static final String PD_Dateofbirth = "//input[@id='q35023']";
public static final String PD_SSN = "//input[@id='q24301']";
public static final String PD_ParentSSN = "//input[@id='q24302']"; 
public static final String PD_Gender = "//select[@id='s35026']";
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
public static final String PD_SportsInterest = "//select[@id='s35038']";
public static final String PD_Testscore = "//input[@id='q24316']";
public static final String PD_AcademicInterest = "//select[@id='s24317']";
public static final String PD_SchoolCode = "//input[@id='q24318']";
public static final String PD_Emailaddress = "//input[@id='q24319']";
public static final String PD_PullQuestion = "//input[@id='q26168']";
public static final String PD_PushQuestion = "//input[@id='q26169']";
public static final String PD_Aptnumber = "//input[@id='q24395']";
public static final String PD_EmailRecommended = "//input[@id='q24433']";
public static final String PD_Save = "//tr[8]//img[@alt='Save']";
public static final String PD_SaveContinue = "//img[@alt='Save and Continue']";
public static final String PD_Reset = "//img[@alt='Reset']";
//#**********************************************************#
//# Recommendations Page - RC
//#*********************************************************#
public static final String RC_RecProviderlist = "//input[contains(@value,'Recommendation Provider List')]";
//public static final String RC_RecProviderlist = "//a[contains(text(),'Recommendation Provider List')]";
public static final String RC_Resend = "//a[contains(text(),'resend')]";
public static final String RC_RecProvidername ="";
public static final String RC_RecProvidercheck ="";
public static final String RC_Add = "//a[contains(text(),'add a provider')]";
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
public static final String RC_Save = "//div[@align='right']//input[@value='Add Provider' and @type='submit']";
//#**********************************************************#
//#Webcenter Login - WCL
//#*********************************************************#
public static final String WCL_ClientID = "css=input[name='ClientID']";
public static final String WCL_UserID = "css=input[name='UserID']";
public static final String WCL_Password = "css=input[name='Password']";
//public static final String WCL_Go = "css=input[alt='Login']";login
public static final String WCL_Go = "//input[@alt='Login']";
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
public static final String WCL_status = "Status";
public static final String WCL_locked = "locked";
public static final String WCL_rolesassigned = "";
public static final String WCL_rolesnotassigned = "css=input[name='cbRoleID1']";
public static final String WCL_privilagesassigned = "";
public static final String WCL_privilagesnotassigned = "";
public static final String WCL_statusreportschedule = "";
public static final String WCL_raaccountassigned = "";
public static final String WCL_Savebutton = "//img[contains(@src,'admin_save_small')]";
public static final String WCL_Cancelbutton = "//img[@alt,'cancel']";
//public static final String WCL_userid = "";
//public static final String WCL_userid = "";
//public static final String WCL_userid = "";//input[@id='Image1']

//#**********************************************************#
//#Maintenance center Login - MCL
//#*********************************************************#
public static final String MCL_UserID = "css=input[name='UserID']";
public static final String MCL_Password = "css=input[name='Password']";
public static final String MCL_Loginbutton = "//input[contains(@src,'admin_login_small')]";

//#Logout and click menu in MC
public static final String MCL_Logoutbutton = "logout";
public static final String MCL_ManageClientMenu = "//div[@id='oMenu_oMenu2']";

//# Manage client
public static final String MCL_Searchfor = "css=input[name='srchString']";
public static final String MCL_SearchIn = "";
public static final String MCL_Searchbutton = "//img[contains(@src,'admin_search_small')]";

//# click on page icon in search results screen
public static final String MCL_pageicon = "//img[contains(@src,'quickview_icon')]";
public static final String MCL_ClientName = "link=ayauto";
public static final String MCL_NewSearchbutton = "//img[contains(@src,'new_search_large')]";
public static final String MCL_MoveToFolderBtn = "//img[contains(@src,'move_to_folder')]";

//# click on application package
//public static final String MCL_ClientName = "";
public static final String MCL_ModuleName = "link=Admissions ( 157 )";
public static final String MCL_PackageName = "link=Application for QA Automation ( 419 )";
//public static final String 

public static final String MCL_SaveModbutton = "//img[contains(@src,'admin_save_small')]";

//# Manage RA Accounts
public static final String MCL_ClickRAName = "//a[contains(text(),'";    //TestRAaccount')]";
public static final String MCL_addprintdelete = "//img[contains(@src,'";    //add')]";
public static final String MCL_VerifyValue = "//span[contains(text(),'";   //TestingRA')]";
public static final String MCL_CheckValue = "//input[@title='";    //TestingRA']";

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
public static final String CA_Password = "//input[@id='aycreatePassword']";
public static final String CA_ConfirmPassword = "//input[@id='aycreateConfirmPassword']";
public static final String CA_CreateAccountBtn = "ay-createSubmit";
public static final String CA_LoginBtn = "//input[@id='ay-create-login']";
public static final String CA_UserName = "aycreateUserName";
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
public static final String DB_MsgBtn = "css=#message";
public static final String DB_DbBtn = "//a[contains(@class,'inverse')]";
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
public static final String DB_App2StartEditButton = "//div[@class='appListSubHeader' and h3[text()='Application2']]/a[contains(text()[2],'Edit Application') or contains(text(),'Edit Application') or contains(text()[2],'Start Application') or contains(text(),'Start Application')]";
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
//public static final String AW_SubAppBtn = "css=input.ay-Submit"; //div/div[2]/div[1]/input[@class='ay-Submit']
public static final String AW_SubAppBtn = "//div/div[2]/div[1]/input[@class='ay-Submit']";
public static final String AW_personalDataLnk = "//font[contains(text(),'Personal Data')]";
public static final String AW_FamilyBtn = "//font[contains(text(),'Family')]";
public static final String AW_BussRulesBtn = "//font[contains(text(),'Business Rules')]";
public static final String AW_PaymentProBtn = "//font[text()='Payment Processing']";
public static final String AW_PerInfoBtn = "//font[contains(text(),'Personal Information')]";
public static final String AW_EssayAttBtn = "//font[contains(text(),'Essay and Attachment')]";
public static final String AW_EduBackBtn = "//font[contains(text(),'Education Background')]";
public static final String AW_EduBackSubBtn ="//font[text()='Education']";
public static final String AW_RecommendationBtn = "//font[contains(text(),'Recommendations')]";
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
public static final String PSD_TestDemo = "//input[@id='q36515']";
public static final String PSD_Extracurricularactivities = "//textarea[@id='q24308']";
//public static final String PSD_Country = "//select[@id='s24309']";
public static final String PSD_Country = "//select[@id='s35032']";
public static final String PSD_Stateprovince = "//select[@id='s24310']";
//public static final String PSD_GradeLevel = "//input[@id='rc24311_1']";
public static final String PSD_GradeLevel = "//input[@value='";
public static final String PSD_Essaywithoutattachment = "//textarea[@id='q24312']";
public static final String PSD_uploaddocument = "//img[@alt='Upload Attachment']";
public static final String PSD_Collegehousing = "//select[@id='s24314']";
public static final String PSD_SportsInterest = "//select[@id='s24315']";
//public static final String PSD_SportsInterest = "//select[@id='s35038']";
public static final String PSD_Testscore = "//input[@id='q24316']";
public static final String PSD_AcademicInterest = "//select[@id='s24317']";
public static final String PSD_SchoolCode = "//input[@id='q24318']";
public static final String PSD_Emailaddress = "//input[@id='q24319']";
public static final String PSD_Aptnumber = "//input[@id='q24395']";
public static final String PSD_EmailRecommended = "//input[@id='q24433']";
//public static final String PSD_Save = "//img[@alt='Save']";
public static final String PSD_Save = "//table/tbody/tr[8]/td/a[1]/img[@alt='Save']";
public static final String PSD_SaveBottom = "xpath=(//img[@alt='Save'])[2]";
public static final String PSD_SaveContinue = "//img[@alt='Save and Continue']";
public static final String PSD_Reset = "//img[@alt='Reset']";

//#**********************************************************#
//# Facelift Personal Data Verify
//#**********************************************************#
public static final String PSD_SuccessMsg = "//div[@class='span9']//tr/td/b";
public static final String PSD_PageName = "//font[contains(text(),'";
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
public static final String PII_Suffix = ".//*[@id='s24494']/option[2]";
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
//public static final String UL_PinField = "css=#ay-login";
public static final String UL_PinField = "//input[@id='ay-login']";
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
//public static final String FPI_Pin = "css=#UserID";
public static final String FPI_Pin = "//input[@id='UserName' or @id='UserID']";
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
//public static final String EAI_EssaywithAttachment_ViewDocument = "xpath=(//img[@alt='View Document'])[1]";
public static final String EAI_EssaywithAttachment_ViewDocument = "xpath=(//a[@alt='View Document'])";
public static final String EAI_EssaywithAttachment_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'])[1]";
public static final String EAI_AttachmentOnly_UploadDocument = "xpath=(//img[@alt='Upload Attachment'])[2]";
public static final String EAI_AttachmentOnly_ViewDocument = "xpath=(//a[@alt='View Document'])[2]";
public static final String EAI_AttachmentOnly_DeleteDocument = "xpath=(//img[@alt='Delete Attachment'])[2]";
public static final String EAI_MediaAttachment_UploadFile = "xpath=(//img[@alt='Upload Attachment'])[3]";
public static final String EAI_MediaAttachment_Viewfile = "xpath=(//a[@alt='View Document'])[3]";
public static final String EAI_MediaAttachment_Deletefile = "xpath=(//a[@alt='Delete Attachment'])[3]";
public static final String EAI_Save = "//img[@alt='Save']";
public static final String EAI_SaveandContinue = "//img[@alt='Save and Continue']";
public static final String EAI_Reset = "//img[@alt='Reset']";
//public static final String EAI_UploadBrowser = "//input[@id='fileUpload']";
public static final String EAI_UploadBrowser = "//input[@id='Upload']";
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
//public static final String HC_UserName = "//input[@name='user_name']";
public static final String HC_UserName = "//input[@name='login']";	
//public static final String HC_Password = "//input[@name='password']";
public static final String HC_Password = "//input[@name='passwd']";
//public static final String HC_Login = "//input[@value='Log-In']";    
public static final String HC_Login = "//button[contains(text(),'Sign in')]";
//public static final String HC_Inbox = "//div[@id='MailFolderPane.FavoritesFolders']//span[@title='Inbox']";
public static final String HC_Inbox = "//div[@role='group' and @aria-label='EMT QA Account']//span[text()='Inbox']";
//public static final String HC_Inbox = "//div[@role='tree' and @aria-labelledby='MailFolderPane.FavoritesHeader']//span[text()='Inbox']";
//public static final String HC_Home = "//button[@aria-label='EMT QA Account']";//span[text()='EMT QA Account']
//public static final String HC_Home = "//span[text()='EMT QA Account']";
//public static final String HC_Home = "//button[@aria-label='EMT QA Account - Available menu with submenu']"; 
public static final String HC_Home = "//button[contains(@aria-label,'EMT QA Account')]";
//button[@aria-label='EMT QA Account - Available menu with submenu']
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
   // public static final String HC_EmailSubjectContains ="xpath=(//div[@tabindex='0']//div[@aria-label='Mail list']//div//div[2]//div[2]//div[2]//span[contains(text(),'Connect')])";
public static final String HC_Content_LinkContians = "css=a:contains('";
//public static final String HC_Content_Link = "css=a[innerHTML=']";
//public static final String HC_CloseButton = "//button[text()='Close']";
public static final String HC_Content_Link = "css=a[innerHTML='";
public static final String HC_CloseButton = "//button[text()='Close'";
//public static final String WebMail_Body = "//div[@class='PlainText' or @class='bdy']";
//public static final String WebMail_Body = "//div[@id='Item.MessageUniqueBody']/div/div";		//font/span[text()[contains(.,'SmokeTest')]]";
//public static final String WebMail_Body = "//div[@class='conductorContent']//div[contains(.,'";
public static final String WebMail_Body = "//div[@aria-label='Reading Pane']";
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
//#Batchupdate  - Web center
//#*********************************************************#


//public static final String BU_SportsInterest = "//select[@name='q35038']";
public static final String BU_SportsInterest = "q35038";
public static final String BU_Submit = "//img[contains(@src,'admin_submit_small')]";
public static final String BU_PD_AD_SportsInterest = "//select[@id='s35038']";
public static final String BU_PD_State = "//select[@id='s35033']//option[@value='";
public static final String BU_PD_BRules = "//td[@class='Color1']//font[contains(text(),'Business Rules')]";
public static final String BU_PD_DOB = "//input[@id='q35023']";
public static final String BU_BR_Submit = "//font[contains(text(),'Congratulations')]";
public static final String BU_MiddleName = "//input[contains(@name,'q35021')]";


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
//public static final String EA_MediaAttach_Viewfile = "xpath=(//a[@alt='View Document'])[3]";
public static final String EA_MediaAttach_Viewfile = "xpath=(//a[@alt='View Document'])[3]";
//public static final String EA_MediaAttach_Deletefile = "xpath=(//a[@alt='Delete Attachment'])[3]";
public static final String EA_MediaAttach_Deletefile = "xpath=(//a[@alt='Delete Attachment'])[3]";
public static final String EA_PageTitle = "//div[@class='span9']//font";
public static final String RC_RecProBtn = "//a[contains(text(),'Recommendation Provider List')]";
public static final String RC_AddProBtn = "//a[contains(text(),'add a provider')]";
public static final String RC_Question = "//p[contains(text(),'";
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
//public static final String RI_Recommendationtype = "css=#recommendationtype";
//public static final String RI_Recommendationtype = "css=#recommendationtype";
public static final String RI_Recommendationtype = "css=#field1";
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
public static final String PD_ErrorMsg = "//div[@id='divAyMsg']//font";
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
public static final String WClogoutLink = "//a[contains(@href,'logout')]";
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
public static final String SAI_CreationDate = "//td[@class='FormFields' and @valign='bottom']//select[@name='Days']";
//public static final String SAI_SubmissionDate = "//select[@name='SubmitDays']";
public static final String SAI_SubmissionDate = "//select[@name='Days']";
public static final String SAI_SpecificPeriod = "//select[@name='Days']";
public static final String SAI_DateRangeFrom = "//input[@name='dateRangeFrom']";
public static final String SAI_DateRangeTo = "//input[@name='dateRangeTo']";
public static final String SAI_FirstName = "//input[@name='FirstName']";
public static final String SAI_LastName = "//input[@name='LastName']";
public static final String SAI_BirthDate = "//input[@name='BirthDate']";
public static final String SAI_EmailAddress = "//input[@name='Email']";
public static final String SAI_Zip = "//input[@name='ZipCode']";
public static final String SAI_Pin = "//input[@name='Pin']";
public static final String SAI_ApplicantID = "//input[@name='ApplyyourSelfID']";
public static final String SAI_SysQuries = "SysQuery";
//public static final String SAI_UserQuries = "//select[@name='QueryID']";//input[@id='QueryID']
public static final String SAI_UserQuries = "//input[@name='QueryID']";
//public static final String SAI_UserQuries = "//select[@name='QueryID']/option[contains(text(),'";
 public static final String SAI_EnrollAppID = "//input[@name='ApplyYourSelfID']";
 public static final String SAI_Action = "//select[@name='ActionID']";
 public static final String VerifySystemQueryLabel = "//font[contains(text(),'Queries')]";

public static final String SAI_SearchGroupSelect = "GroupID";
public static final String SAI_SearchbyActionSelect = "ActionID";

public static final String SAI_SubmitBtnBottom = "//input[contains(@src,'submit')]";
public static final String SAI_SearchByIndividualsSubmit = "xpath=(//input[contains(@src,'admin_submit_small')])[3]";
//public static final String SAI_SearchByIndividualsSubmit = "//td[font[contains(text(),'Individual')]]/following-sibling::td/input[contains(@src,'admin_submit_small')]";
public static final String SAI_SearchByDateSubmit = "//td[font[contains(text(),'Search by Date')]]/following-sibling::td/input[contains(@src,'admin_submit_small')]";
//public static final String SAI_SearchByIndividualsRadio = "//td[font[contains(text(),'Individual')]]/preceding-sibling::td/input[@type='radio']";
public static final String SAI_SearchByIndividualsRadio = "//input[@value='individual']";
public static final String SAI_SearchUsingQueryRadio = "//input[@value='query']";
public static final String SAI_SearchProspectID = "//font[text()='Prospect ID:']/following::input[@name='ApplyyourSelfID']     ";
public static final String SAI_SearchUsingQuerySubmit = "//td[font[contains(text(),'Using Query')]]/following-sibling::td/input[contains(@src,'admin_submit_small')]";
public static final String SFR_DisplayOffline = "//input[@value='offline']";
public static final String SFR_DisplayBoth = "//input[@value='both']";
public static final String SFR_RecSubmitted	= "//font[contains(text(),'Record Options ')]/following::input[1]";
public static final String SFR_RecNotSubmitted = "//font[contains(text(),'Record Options ')]/following::input[2]";
public static final String SFR_RecAppSubmitted =  "//font[contains(text(),'Record Options ')]/following::input[3]";
public static final String SFR_RecNotPrinted = "//font[contains(text(),'Record Options ')]/following::input[4]";
public static final String SFR_RecNotExported = "//font[contains(text(),'Record Options ')]/following::input[5]";
public static final String SFR_RecFirstName = "//input[@name='recFirstName']";
public static final String SFR_RecLastName = "//input[@name='recLastName']";
public static final String SFR_RecEmail = "//input[@name='recEmail']";
public static final String SFR_RecPAC = "//input[@name='recPin']";
public static final String SFR_AppFirstName = "//input[@name='appFirstName']";
public static final String SFR_AppLastName = "//input[@name='appLastName']";
public static final String SFR_AppEmail = "//input[@name='appEmail']";
public static final String SFR_AppPin = "//input[@name='appPin']";
public static final String SFR_AppID = "//input[@name='appAYID']";
public static final String SFR_SubmittedFrom = "//input[@name='SubmittedFrom']";
public static final String SFR_SubmittedTo = "//input[@name='SubmittedTo']";
public static final String SFR_PrintedFrom = "//input[@name='PrintedFrom']";
public static final String SFR_PrintedTo = "//input[@name='PrintedTo']";
public static final String SFR_ExportedFrom = "//input[@name='ExportedFrom']";
public static final String SFR_ExportedTo = "//input[@name='ExportedTo']";



//#**********************************************************#
//# Webcenter Search For Applicant Verify - SAV
//#**********************************************************#

public static final String SAV_FormHeading = "//td[@class='FormHeading']";
public static final String SAV_FormMsg = "//td[@class='FormText']";
public static final String SAV_FormLabel = "//table/tbody/tr/td[text()='";
public static final String SAV_PageName = "//font";
public static final String PageName = "//div[@id='AYInstructions']/following-sibling::font";
public static final String APP_Status = "//table/tbody/tr/td[contains(text(),'";

//#**********************************************************#
//# Webcenter Manage Queries - MQ
//#**********************************************************#

public static final String MQ_Queryselect = "//a[contains(text(),'";  //TestforUserQueries')]"
public static final String MQ_QueryName = "//input[@name='txtQueryName']";
public static final String MQ_QueryDescription = "//textarea[@name='txtDescription']";


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
//public static final String MN_BaseTableFont = "//td[@class='BaseTableFont']";
public static final String MN_BaseTableFont = "//a[@class='btn btn-primary appListButton']";
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
public static final String ESA_RegNumber = "//input[@name='regno']";
public static final String ESA_StatusInvited = "//input[@value=1]";
public static final String ESA_StatusRegistered = "//input[@value=2]";
public static final String ESA_StatusDeclined = "//input[@value=3]";
public static final String ESA_StatusWaitlisted= "//input[@value=4]";
public static final String ESA_StatusAttended= "//input[@value=5]";
public static final String ESA_StatusDidnotattend= "//input[@value=6]";
public static final String ESA_ApplicantID = "//input[@name='matchToApplicantID']";
public static final String ESA_ProspectID = "//input[@name='matchToProspectID']";
public static final String ESA_Findallrecordsnotmatchedtoapplicants = "//input[@name='findNotMatchedToApplicants']";
public static final String ESA_Findallrecordsmatchedtoapplicants = "//input[@name='findMatchedToApplicants']";
public static final String ESA_Findallrecordsnotmatchedtoprospects = "//input[@name='findNotMatchedToProspects']";
public static final String ESA_Findallrecordsmatchedtoprospects = "//input[@name='findMatchedToProspects']";
public static final String ESA_SpecificDate = "//input[@name='registrationon']";
public static final String ESA_DateRangeFrom = "//input[@name='registrationFromDt']";
public static final String ESA_DateRangeTo = "//input[@name='registrationToDt']";

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
public static final String ASR_SearchColumn = "//div[@id='example_wrapper']//table[contains(@class,'dataTable')]";
public static final String ASR_CheckBox = "']]/preceding-sibling::td/input[@type='checkbox']";
public static final String ASR_Group = "//td[font[contains(text(),'Group')]]/preceding-sibling::td/input[@name='SearchTypes']";
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
public static final String PA_PageName = "//tr[@class='FormText']/td/font";  //successfully Updated
public static final String PA_UsageQuestion = "//form[@id='Form1']//b";
//public static final String PA_PrintBtn = "//img[@alt='print']";
public static final String PA_PrintBtn = "//span[@class='DynamicImage']";
public static final String PA_Success = "//td[@id='contentCol']/table//td[contains(text(),'";
//#**********************************************************#
//# Webcenter Code Lookup - CL
//#**********************************************************#
public static final String CL_LookupTName = "//input[@name='lookupgroupid']";
public static final String CL_AddEdit = "//img[contains(@src,'"; //edit')]"
public static final String CL_Code = "//input[@name='prompt1field']";
public static final String CL_Name = "//input[@name='prompt2field']";
public static final String CL_Address1 = "//input[@name='prompt3field']";
public static final String CL_City = "//input[@name='prompt4field']";
public static final String CL_State = "//input[@name='prompt5field']";
public static final String CL_Country = "//input[@name='prompt6field']";
public static final String CL_BackSearch = "//img[contains(@src,'";
public static final String CL_AddressList = "//table[@id='Table1']/tbody/tr[11]/td/a";
public static final String CL_EnableAppreview = "//input[@name='chkReviewEnabled']";
public static final String CL_Appreivew_Condition = "//form[@id='frmModifyPackage']//tr/td/font[contains(text(),'Application Review')]";
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
public static final String AS_AppFee = "//a[contains(@href,'ApplicantionFee')]";
public static final String AS_Transcripts = "//input[@name='chkTranscripts']";
public static final String AS_SaveBtn = "//img[contains(@src,'admin_save_small')]";
public static final String AS_PrintApplicationBtn = "//img[contains(@src,'print')]";
public static final String AS_View = "//span[contains(text(),'";
public static final String AS_CloseWindow = "//img[contains(@src,'admin_close_window')]";
public static final String AS_ViewApplication = "";
public static final String AS_ViewRecommendation = "";
public static final String AS_ViewComments = "//font[contains(text(),'Comments')]";
public static final String AS_ViewCommentCheck = "//td[a[contains(text(),'";
public static final String AS_ViewCommentCheck1 = "')]]/preceding-sibling::td[input[@name='CommentID']]";
public static final String AS_ViewAddComment = "//textarea[@name='Comment']";
public static final String AS_ViewHistory = "//font[contains(text(),'History')]";
public static final String AS_ViewGroups = "//font[contains(text(),'Groups')]";
public static final String AS_ViewEvents = "//font[contains(text(),'Event')]";
public static final String AS_AppReviewStatus = "//font[contains(text(),'";
public static final String AS_StatusSubmit = "//a[contains(@href,'Submit')]";
public static final String AS_StatusBack = "//a[contains(@href,'SubmitSearch')]";
//#**********************************************************#
//# Webcenter Batch Printing - BP
//#**********************************************************#
public static final String BP_PageName = "//div[@id='AYInstructions']/following-sibling::font";
public static final String BP_BackBtn = "//img[contains(@src,'admin_back_small')]";
//public static final String BP_ApplicationBatchs = "//img[contains(@src,'application_batches')]";
public static final String BP_ConformationMsg = "//td[@class='FormHeading']/b";
//public static final String CloseWindow = "//img[@alt='close window']";
public static final String CloseWindow = "//img[contains(@src,'close_window')]";
public static final String ApplicantCloseWindow = "//img[contains(@src,'admin_close_window_large')]";
public static final String BP_ApplicationBatchs = "//img[@alt='Application Batches']";
public static final String BP_RefreshBtn = "//img[@alt='Refresh Search']";
public static final String BP_ViewBtn =  "//img[contains(@src,'admin_view')]";
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
public static final String QAE_UsageButton = "//img[contains(@src,'admin_usage_small')]";
public static final String QAE_SaveButton = "//img[contains(@src,'admin_save_small')]";
public static final String QAE_CancelButton = "//img[contains(@src,'cancel_small')]";
public static final String QAE_FieldLength = "//input[@name='txtResponseLength']";
public static final String QAE_FieldFormat = "//select[@name='txtFormat']";
public static final String QAE_QuestionBefor = "//select[@name='selorderquestion']";
public static final String QAE_PageName = "//div[@id='AYInstructions']/following-sibling::font";
public static final String QAE_Message = "//div[@id='divAyConfirmation']/font";
public static final String QAE_PaymentType = "//select[@name='ChangePaymentType']";
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
public static final String ESR_Field = "//select[contains(@name,'txtField')]";
public static final String ESR_Operator = "//select[@name='txtOperator0']";
//public static final String ESR_ValueSelect = "//select[@name='txtValue0']";
public static final String ESR_ValueSelect = "//select[contains(@name,'txtValue')]";

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
public static final String PS_HobsonsAuthMessage = "//div[@class='ay_section']";
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
//public static final String AEE_WaitlistEmail = "//select[@name='selWaitListEmail']";
public static final String AEE_WaitlistEmail = "selWaitListEmail";
public static final String AEE_RecurrenceType = "//select[@name='selRecurrenceType']";
//public static final String AEE_RegDeclineEmail = "//select[@name='selRegOrDecEmail']";
public static final String AEE_RegDeclineEmail = "selRegOrDecEmail";
public static final String AEE_RemainderEmail = "//select[@name='selReminderEmail']";
public static final String AEE_NonRespondEmail = "//select[@name='selNonRespondantEmail']";
public static final String AEE_ThankYouEmail = "//select[@name='selThankYouEmail']";
public static final String AEE_DidNotAttenEmail = "//select[@name='selNotAttendEmail']";
//public static final String AEE_Group = "//select[@name='selGroup']";
public static final String AEE_Group = "selGroup";
public static final String AEE_Save = "//input[contains(@src,'admin_save_small')]";
public static final String AEE_PubToProd = "//img[contains(@src,'publish_prod_large')]";
public static final String AEE_CloseWindow = "//img[contains(@src,'admin_close_window_large')]";
public static final String AEE_Classfication = "//input[@value='";
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
public static final String SFE_SpecificDate = "//input[@name='evWhenOn']";
public static final String SFE_DateRangeFrom = "//input[@name='evWhenFrom']";
public static final String SFE_DateRangeTo	= "//input[@name='evWhenTo']";
public static final String SFE_Clear = "//input[@name='clearRadios']";
public static final String SFE_CalYear = "//select[contains(@name,'intYearSelector')]";
public static final String SFE_CalMonth = "//select[contains(@name,'intMonthSelector')]";
//public static final String SFE_CalDay = "//a[@class='calthismonth']";
public static final String SFE_CalDay = "//a[text()='";
//#**********************************************************#
//# Webcenter Event Search Results Page - EVR
//#**********************************************************#
public static final String EVR_SelectAnAction = "//select[@name='EventActionTypeID']";
public static final String AEV_SuccessMsg = "//div[@id='divAyConfirmation']";
public static final String MU_SelectAnAction = "//select[@name='ActionTypeID']";
public static final String SR_Page = "//font[contains(text(),'";
//#**********************************************************#
//# Recommendation Login Page
//#**********************************************************#
public static final String RL_PerAccessCode = "//input[@id='Pin']";
public static final String RL_Password = "//input[@name='Password']";
public static final String RL_ConfirmPass = "//input[@id='ConPassword']";
public static final String RL_LoginBtn = "//input[@value='Login' or @alt='Login']";
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
//# Recommendation Facelift Page
//#**********************************************************#

public static final String RF_Password = "//input[@id='rec-password']";
public static final String RF_Cnf_Password = "//input[@id='ConPassword']";
public static final String RF_Submit = "//input[@id='rec-loginSubmit']";
public static final String RF_Welcome = "//div[@id='home']/h2[contains(text(),'";
public static final String RF_Start_Rec = "//a[contains(text(),'Recommendations')]";
public static final String RF_PAC = "//input[@id='rec-login']";
public static final String RF_Rec_Password = "//input[@name='Password']";
public static final String RF_Rec_Submit = "//input[@id='rec-loginSubmit']";
public static final String RF_Forgot_Pwd = "//a[@id='forgotPass']";
public static final String RF_Forgot_PAC = "//input[@id='recforgotPAC']";
public static final String RF_Forgot_Email = "//input[@id='recforgotEmail']";
public static final String RF_Forgot_Lname = "//input[@id='recforgotAppLN']";
public static final String RF_Forgot_Search = "//input[@id='rec-forgotSubmit']";

//#**********************************************************#
//#	 WebMail Login Page - Hotmail
//#**********************************************************#
public static final String HM_WLogin = "//input[@id='i0116']";
public static final String HM_WPassword = "//input[@id='i0118']";
public static final String HM_WSignIn = "//input[@id='idSIButton9']";
//public static final String HM_Inbox = "Inbox";
public static final String HM_Inbox = "link=Inbox";   
//public static final String HM_Inbox = "//li[contains(@class,'leftnavitem')]//span[text()='Inbox']";
//public static final String HM_InboxSide ="//span[contains(@class,'FolderLabel') and contains(text(),'Inbox')]";
//public static final String HM_InboxSide ="//span[contains(@class,'editableLabel readonly') and text()='Inbox']";
//public static final String HM_InboxSide ="//li[contains(@class,'leftnavitem')]//span[text()='Inbox']"; //div[@role='treeitem']//span[text()='Inbox']
public static final String HM_InboxSide = "//div[@role='treeitem']//span[text()='Inbox']";

//#**********************************************************#
//#	 WebMail Login Page - Gmail
//#**********************************************************#
public static final String GM_WLogin = "//input[@id='Email']";
public static final String GM_WPassword = "//input[@id='Passwd']";
public static final String GM_WSignIn = "//input[@id='signIn']";
//public static final String HM_Inbox = "Inbox";
public static final String GM_Inbox = "link=Inbox";   
//public static final String HM_Inbox = "//li[contains(@class,'leftnavitem')]//span[text()='Inbox']";
//public static final String HM_InboxSide ="//span[contains(@class,'FolderLabel') and contains(text(),'Inbox')]";
//public static final String HM_InboxSide ="//span[contains(@class,'editableLabel readonly') and text()='Inbox']";
public static final String GM_InboxSide ="//div[@class='aim ain']//a[contains(text(),'Inbox')]";

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
public static final String CI_BackBtnFL = "//input[@id='ay-ForgotPassword']";
public static final String CI_PageName = "//td[@class='Color1']/font";
public static final String CI_SectionMenu = "//table[@class='rightBorder']";
public static final String MoreDetails = "//font[@class='HelpBoxesFont']/b";

//#**********************************************************#
//#	 Recommendation - Remind Recommender action 
//#**********************************************************#
public static final String RR_SelectTemplate = "//font[contains(text(),'Send a Reminder to Recommender')]";
public static final String RR_ActionLabel = "//input[@name='ActionLabel']";
public static final String RR_Comment = "//textarea[@id='CommentText']";
public static final String RR_Subject = "//input[contains(@name,'EmailSubject')]";
public static final String RR_MailNow = "//input[@name='MailNow']";
public static final String RR_SendBack = "//img[contains(@src,'";   //send_small')]"
public static final String RR_Preview = "//input[@name='btnHtmlEditor']";
public static final String RR_PreviewEmailTemplate = "//b[contains(text(),'Preview Email Template')]";
public static final String RR_Comments = "//td[contains(.,'Remind to Reminder')]";
public static final String RR_Close = "//img[contains(@src,'close_small')]";

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
public static final String PAS_PrevRecPdf = "//a[contains(text(),'Preview Recommendation')]";
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
public static final String RPT_CheckBox = "//input[@class='FormFields' and contains(@name,'";  //chkMakeExcelFile')]
//#**********************************************************#
//#	 Maintanance - AppReviewfilter - Page
//#**********************************************************#
public static final String MC_ARF_Filtername = "//td[text()='Filter Name*:']/following::input[@name='txtName'] ";
public static final String MC_ARF_Description = "//td[text()='Description*:']/following::textarea[@name='txtDescription']";
public static final String MC_ARF_Field1 = "//td[contains(text(),"; //3
public static final String MC_ARF_Field2 = ")]/following-sibling::td/select[contains(@name,'txtField')]";
public static final String MC_ARF_Operator2 = ")]/following-sibling::td[2]/select[contains(@name,'txtOperator')]";
public static final String MC_ARF_Operator1="//td[contains(text(),";
public static final String MC_ARF_Value1 = "//td[contains(text(),";
public static final String MC_ARF_Value2=")]/following-sibling::td[3]//button[contains(@class,'multiselect')]";
public static final String MC_ARF_SelectByValue1 = "//span[text(),";
public static final String MC_ARF_SelectByValue2=")]/preceding-sibling::input";



//#	 Maintanance - Schedule Import/Export - Page
//#**********************************************************#
public static final String SIE_AddImpSched = "//img[contains(@src,'add_import')]";
public static final String SIE_AddExpSched = "//img[contains(@src,'add_export')]";
public static final String SIE_DeleteBtn = "//img[contains(@src,'admin_delete_small')]";
public static final String SIE_Publickey = "//td[contains(@id,'colSFTP')]//input[@name='rdoLoginType']";
//#**********************************************************#
//#	 Maintanance - Schedule PDF Delivery - Page
//#**********************************************************#
public static final String SPDF_AddPdf = "//img[contains(@src,'addPdfDelivery')]";
public static final String SPDF_ScheduleBatch = "//select[@name='PrintScheduled']";
public static final String SPDF_ServerName = "//input[@name='txtFTPServer']";
public static final String SPDF_ZipPdf = "//input[@name='chkZip']";
public static final String SPDF_SendDelivery = "//input[@name='chkConfirmEmail']";
public static final String SPDF_Authentication = "//td[contains(.,'";
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

//Enrollment - Search or Students
public static final String ES_ApplicantClick = "//a[contains(text(),'";    //LastName, TestDemo')]"'

//#**********************************************************#
//#	 Enrollment - Enrollment Fee Payment - Page
//#**********************************************************#
public static final String EFP_ReturnEnrollBtn = "//img[@alt='return to enrollment form']";
//public static final String EFP_PayAndContinue = "//img[@alt='pay and continue']";
public static final String EFP_PayAndContinue = "//*[@alt='pay and continue' or @name='PayButton']";
//public static final String EFP_SubmitEnrollmentBtn = "//img[@alt='submit enrollment']";
public static final String EFP_SubmitEnrollmentBtn = "//*[@alt='submit enrollment' or @id='ay-recSubmit']";
public static final String EFP_PrintBtn = "//img[@alt='print this paget']";
public static final String EFP_CloseWindowBtn = "//img[@alt='close window']";
//#**********************************************************#
//#	 Webcenter - Add Import Template - Page
//#**********************************************************#
public static final String AIT_CRLF = "//input[@value='crLf']";
public static final String AIT_LF = "//input[@value='Lf']";
public static final String FS_SubmitApp = "//a[contains(@href,'ApplicationSubmit')]";
public static final String AIT_RemoveAll = "//img[@name='BtnRemoveAll']";
//#**********************************************************#
//#	 Webcenter - Invite Event - Page
//#**********************************************************#
public static final String IE_EventLookup = "//input[@value='Event Lookup']";
public static final String IE_TemplateSelect = "TemplateList";
public static final String IE_InviteBtn = "//img[contains(@src,'admin_invite_small')]";
public static final String IE_BackBtn = "//img[contains(@src,'admin_back_small')]";
public static final String IE_FilterLookup = "//input[@value='Filter Lookup']";
//public static final String IE_SelectTemplate = "//select[@name='TemplateList']";
public static final String IE_SelectTemplate = "TemplateList";
public static final String IE_Subject = "EmailSubject";
//#**********************************************************#
//#	 Webcenter - Event Lookup - Page
//#**********************************************************#
public static final String EL_InternalName = "InternalName";
public static final String EL_Title = "Title";
public static final String EL_Where = "Where";
public static final String EL_When = "When";
public static final String EL_EventCatagory = "EventCategory";
public static final String EL_Host = "EventHost";
public static final String EL_EventType = "EventType";
public static final String EL_EventGroups = "GroupID";
public static final String EL_SearchBtn = "//img[contains(@src,'search_small')]";
public static final String EL_CloseWindowBtn = "//img[contains(@src,'close_window_large')]";
public static final String EL_LinkToClick = "//a[contains(@href,'javascript:populateValues')]";
//#**********************************************************#
//#	 Webcenter - Add/Edit Registration Event  - Page
//#**********************************************************#
public static final String AER_FirstName = "//input[@id='q33686']";
public static final String AER_LastName = "//input[@id='q38494']";
public static final String AER_Birthdate = "//input[@id='q33688']";
public static final String AER_Email = "//input[@id='q33689']";
public static final String AER_Scode = "//input[@id='q33690']";
public static final String AER_NotAttened = "//img[contains(@src,'will_not_attend')]";
public static final String AER_Register = "//img[contains(@src,'register_large')]";
public static final String AER_UpdateMyInformation = "//img[contains(@src,'";
public static final String AER_RegisterOrNotAttened = "//img[contains(@src,'register_large') or contains(@src,'register_large') or contains(@src,'update_my_information')]";
//#**********************************************************#
//#	 Webcenter - Add/Edit Group  - Page
//#**********************************************************#
public static final String AEG_GroupName = "GroupName";
public static final String AEG_Description = "Description";
public static final String AEG_Folder = "Group";
public static final String CL_PrintBtn = "//img[contains(@src,'admin_print_small')]";
public static final String CL_CreateBtn = "//img[contains(@src,'create_small')]";
//public static final String CL_ViewBtn = "//img[contains(@src,'admin_view')]";
public static final String CL_ViewBtn = "//img[contains(@src,'admin_view')]";
public static final String WC_ViewBtn = "//img[contains(@src,'view')]";
public static final String WC_AddDelMoveToFolder = "//img[contains(@src,'";
public static final String WC_ErrorMsg = "//div[contains(text(),'";
public static final String WC_ManageInfo = "//p[contains(text(),'";
//#**********************************************************#
//#	 Application - Application Welcome Input  - Page
//#**********************************************************#
public static final String AW_TecSupp = "//li[@class='footerTopLi']//a[contains(@href,'TechSupport')]";
public static final String AW_Home =  "//a[contains(@href,'goHome')]";
public static final String AW_Profile = "//a[contains(@href,'goUpdateProfile')]";
//public static final String AW_Submit = "//input[contains(@onclick,'doApplicationSubmit')]";
public static final String AW_Submit = "//tr[@valign='top']//a[contains(@href,'doApplicationSubmit')]";
//#**********************************************************#
//#	 Application - Application Manage Email Template  - Page
//#**********************************************************#
public static final String AMET_TemplateName = "//input[contains(@name,'TempName')]";
public static final String AMET_Description = "//textarea[contains(@name,'TempDesc')]";
public static final String AMET_EmailSender = "//input[@name='EmailSender']";
public static final String AMET_EmailFrom = "//input[@name='From']";
public static final String AMET_Subject = "//input[@name='Subject']";
public static final String AMET_Message = "//textarea[contains(@name,'Message')]";
public static final String AMET_MailMergeSection = "//select[@name='SectionId']";
public static final String AMET_MailMergeTag = "//select[@name='QuestionId']";
public static final String AMET_QueryTag = "//textarea[@name='MailMerge']";
public static final String AMET_CheckboxTemplate = "//td[a[text()='";
public static final String AMET_FieldDefinition = "//a[@name='FieldDef']";
public static final String AMET_Decision = "//select[@name= 'TempDecisionValue']";
//#**********************************************************#
//#	 Bridge - Cofigured Clients Input  - Page
//#**********************************************************#
public static final String BR_PageTitle = "//span[@id='ctl00_LabelPageTitle']";
public static final String BR_AuthSchemeSelect = "ctl00_ContentPlaceHolder1_DropDownListAuthAndMatchSchme";
public static final String BR_BackBtn = "ClickBack";
public static final String BRSM_SaveBtn = "ctl00$ContentPlaceHolder1$Button1";
public static final String BR_CommType = "//select[contains(@id,'ddlType')]";
public static final String BR_Manage = "//input[contains(@id,'btnManageTypes')]";
public static final String BR_CommName = "//input[contains(@id,'txtName')]";
public static final String BR_CommDesc = "//input[contains(@id,'txtDescription')]";
public static final String BR_CommContent = "//textarea[contains(@id,'notesTextBox')]";
public static final String BR_SaveCancel = "//input[contains(@id,'";
//#**********************************************************#
//#	 Connect - Login  - Page
//#**********************************************************#
public static final String CNT_Username = "userName";
public static final String CNT_Password = "clearTextPwd";
public static final String CNT_LoginBtn = "loginBtn";
public static final String CNT_WelPageTitle = "//div[@id='maincontent']/h1";
public static final String CNT_SearchFrstName = "firstname";
public static final String CNT_SearchTopBtn = "searchTop";
//#**********************************************************#
//#	 Regestrant Details - Page
//#**********************************************************#
public static final String RD_FirstName = "//input[@id='q34474']";
public static final String RD_LastName = "//input[@id='q34475']";
public static final String RD_Gender = "//input[@value='";
public static final String RD_Ethincity = "//select[@id='s34477']";
public static final String RD_EmailAddress = "//input[@id='q34478']";
public static final String RD_GuestYesOrNo = "//input[contains(@value,'";
//public static finalString RD_GuestNo = "//input[contains@name,'N34479']";
public static final String RD_Phone1 = "//input[@id='q34480']";
public static final String RD_Phone2 = "//input[@id='q34481']";
public static final String RD_Phone3 = "//input[@id='q34482']";
public static final String RD_Phone4 = "//input[@id='q34483']";
public static final String RD_Phone5 = "//input[@id='q34484']";
public static final String RD_TextFF = "//input[@id='q34485']";
public static final String RD_TextFFUpperCase = "//input[@id='q34486']";
//#**********************************************************#
//#	 Webcenter - Import Results - Page
//#**********************************************************#
public static final String IR_PageTitle = "//tr[@class='FormHeading']/td";
public static final String IR_MessageContent = "//font[@class='FormHeading']";
//#**********************************************************#
//#	 Webcenter - Field Definitions for Export - Page
//#**********************************************************#
public static final String FD_AddItem = "//img[@name='BtnAddField']";
public static final String FD_InsertItem = "BtnInsertField";
public static final String FD_RemoveItem = "BtnRemoveField";
public static final String FD_MoveUp = "BtnMoveUpField";
public static final String FD_MoveDown = "BtnMoveDownField";
public static final String FD_RemoveAll = "BtnRemoveAll";
public static final String FD_ShowCode = "BtnShowSample";
public static final String FD_SaveBtn = "imgSubmitBtnBotm";
public static final String FD_BackBtn = "imgBackBtnBotm";
//#**********************************************************#
//#	 Webcenter - Add Export for Export - Page
//#**********************************************************#
public static final String AE_ExportSaveBtn = "imgSubmitBtnTop";
public static final String AE_ExportCancelBtn = "//img[contains(@src,'cancel_small')]";
public static final String AE_FieldDefBtn = "//img[contains(@src,'field_definitions_large')]";
//#**********************************************************#
//#	 Webcenter - Adhoc Analysis - Page
//#**********************************************************#
public static final String Ad_ActivatedBy = "ActivityList";
public static final String Ad_ConvAnalysis = "ConversionList";
public static final String Ad_CrossTab = "CrosstabList";
public static final String Ad_Customlist = "CustomList";
public static final String Ad_QuestionList = "QuestionList";
public static final String Ad_CombinedResp = "CombinedResp";
public static final String Ad_SysQueryList = "SysQueryList";
public static final String Ad_QueryList = "QueryList";
public static final String Ad_ChartType = "ChartType";
public static final String Ad_DateFrom = "DateFrom";
public static final String Ad_DateTo = "DateTo";
public static final String Ad_HTML = "//input[@value='HTML']";
public static final String Ad_Excel = "//input[@value='XLS']";
public static final String Ad_RunAnalysis = "//img[contains(@src,'run_analysis')]";
public static final String Ad_FormHeading = "//font[@class='FormHeading']";
public static final String Ad_PageHeading = "//tr[@class='FormText']/td/font";
public static final String Ad_PageName = "//td[div[@id='AYInstructions']]/font";
public static final String Ad_MessageHeading = "//div[@id='divAyConfirmation']/font";  
public static final String En_PageName = "//table[@id='ResultsTable']/tbody/tr/td/font";
public static final String Rec_PageName = "//td[@id='contentCol']//table/tbody/tr/td/font";
public static final String Ad_CustomReport = "//table[@id='TABLE1' and contains(.,'";
//#**********************************************************#
//#	 Webcenter - Configure Search Column - Page
//#**********************************************************#

public static final String CSC_FormHeading = "//font[contains(text(),'"; //+Application Module')]"
public static final String CSC_ConfigField = "//select[@name='Question']";
public static final String CSC_Field = "//td[contains(@class,'FormFields') and text()="; //3]/following::select";
public static final String CSC_Field1 = "]/following::select";
public static final String CSC_Field2 = "]/following-sibling::td/input[@name='txtOrder']";
public static final String CSC_Label = "//input[@name='txtLabel']";
public static final String CSC_Order = "//input[@name='txtOrder']";
public static final String CSC_ShowAfterDefault = "//input[@name='chkShowAfter']";
public static final String CSC_Delete1 = "//td/input[contains(@value,'";
public static final String CSC_Delete2 = "')]//following::td/input[@name='chkDelete']";
public static final String CSC_AddRow = "//img[contains(@src,'addrow')]";
public static final String CSC_Save = "//img[contains(@src,'admin_save')]";
public static final String CSC_Select="//select[@name='Question']";

//#**********************************************************#
//#	 Webcenter - Send Email - Page
//#**********************************************************#
public static final String SE_SendBtn = "//img[contains(@src,'send_small')]";
public static final String SE_BackBtn = "//img[contains(@src,'admin_back_small')]";
public static final String SE_Template = "TemplateList";
public static final String SE_From = "FromAddress";
public static final String SE_EmailTo = "EmailTo";
public static final String SE_ApplicantProfile = "//input[@value='student']";
public static final String SE_OtherEmail = "//input[@value='others']";
public static final String SE_OtherEmailText = "TextEmailTo";
public static final String SE_MailBatchName = "BatchName";
public static final String SE_TemplateName = "//font[contains(text(),'Select')]";
//#**********************************************************#
//#	 Webcenter - Run Report - Page
//#**********************************************************#
public static final String RR_PdfFormate = "//img[contains(@src,'icon_pdf')]/preceding-sibling::input";
public static final String RR_ExcelFormate = "//img[contains(@src,'MSExcel')]/preceding-sibling::input";
public static final String RR_WordFormate = "//img[contains(@src,'MSWord')]/preceding-sibling::input";
public static final String RR_HtmlFormate = "//img[contains(@src,'MSHTML')]/preceding-sibling::input";
public static final String RR_ClearBtn = "//img[contains(@src,'admin_clear')]";
public static final String RR_Rules = "//input[@name='execBusRules' and @value='";   //2']";

//#**********************************************************#
//#	 Webcenter - Post Message - Page
//#**********************************************************#
public static final String PM_Submit = "//a[contains(@href,'ValidateAndSubmit')]";
public static final String PM_Back = "//a[contains(@href,'SubmitSearch')]";
public static final String PM_Subject = "//input[@name='MsgSubject']";
public static final String PM_DispUntil = "//input[@name='MsgDisplayUntilDate']";
public static final String PM_Message = "//textarea[@name='MsgToApplicant']";
//#**********************************************************#
//#	 Webcenter - Prospect Match - Page
//#**********************************************************#
public static final String PM_LastName = "chkMatchOnLastName";
public static final String PM_FirstName = "chkMatchOnFirstName";
public static final String PM_PostalCode = "chkMatchOnZip";
public static final String PM_Email = "chkMatchOnEmail";
public static final String PM_BirthDate = "chkMatchOnBirthDate";
public static final String PM_MatchToOriginal = "//input[@value='original']";
public static final String PM_MatchToMostRecent = "//input[@value='most']";
public static final String PM_SubmitApplicants = "//input[@value='yes']";
public static final String PM_AllApplicants = "//input[@value='no']";
//#**********************************************************#
//#	 Webcenter - Quick Add - Page
//#**********************************************************#
public static final String QA_Domestic = "//font[contains(text(),'Domestic')]/input[@type='radio']";
public static final String QA_International = "//font[contains(text(),'Domestic')]/input[@type='radio']";
public static final String QA_SubmitBtn = "//img[@alt='Submit']";
public static final String QA_ResetBtn = "//img[@alt='Reset']";
public static final String QA_PaymentStatus = "//select[@name='paymentstatus']";
//#**********************************************************#
//#	 Webcenter - Manage Queries - Page
//#**********************************************************#
public static final String MQ_AppQueryName = "//select[@name='selQuery']";
public static final String MQ_FieldName = "//select[@name='txtField0']";   
public static final String MQ_AppSubmit = "//input[@name='SubmittedApps' and @value='Yes']";
public static final String MQ_AppInProgress = "//input[@name='SubmittedApps' and @value='No']";
//public static final String MQ_QuerySave = "//tr[@class='FormHeading']//td/input[@name='topsavebutton']";
public static final String MQ_QuerySave = "//tr[@class='FormHeading']//img[contains(@name,'topsave')]";
public static final String MQ_QuerySave1 = "//tr[@class='FormHeading']//input[contains(@name,'topsave')]";
public static final String MQ_Operator = "//select[@name='txtOperator0']";
public static final String MQ_Value = "//input[contains(@name,'txtValue')]";
public static final String MQ_SaveAndRun = "topsaverunbutton";
public static final String MQ_ValuesDropdown = "//ul[@class='ui-multiselect-checkboxes ui-helper-reset']/li";
public static final String MQ_ValueButton = "//button[@class='ui-multiselect ui-widget ui-state-default ui-corner-all']";
public static final String MQ_AddRow = "//img[contains(@src,'plus')]";
public static final String MQ_DeleteRow = "//img[contains(@src,'minus')]";
public static final String MQ_MultiSelectOpen = "//button[contains(@class,'ui-multiselect')]";
public static final String MQ_MulitSelectClose = "//span[contains(@class,'circle-close')]";
public static final String MQ_MultiSelectOption = "//input[@value='Accepted']"; //Rugby']";
//public static final String MQ_QueryCheck = "//td[a[contains(text(),'QueriesTest')]]/preceding-sibling::td[input[@name='MyLinkschk']]";
public static final String MQ_QueryCheck = "//td[a[contains(text(),'";
public static final String MQ_QueryCheckbox = "')]]/preceding-sibling::td[input[@name='MyLinkschk']]";
public static final String MQ_Add = "//img[@name='imageField']";
public static final String MQ_Delete = "//img[@name='imageField2']";
public static final String MQ_DetailTree = "//a[contains(text(),'";    //Applicant Detail')]";
//public static final String MQ_MultiSelectPaymentStatus = "//input[@title='ManageQueries']";
public static final String MQ_MultiSelectPaymentStatus = "//span[text()='TestApplicationPayment']";


//#**********************************************************#
//#	 Webcenter - Configure Downloadable Forms - Page
//#**********************************************************#
public static final String CDF_FormName = "FormName";
public static final String CDF_Description = "Description";
public static final String CDF_FormOrder = "FormOrder";
public static final String CDF_UrlToFormFile = "URL";
public static final String CDF_FormFileToUpload = "Location";
public static final String CDF_PrintPdf = "printPDF";
//#**********************************************************#
//#	 Webcenter - Configure Dynamic Text - Page
//#**********************************************************#
public static final String CDT_TextRadio = "Radio1";
public static final String CDT_HtmlRadio = "Radio2";
public static final String CDT_HtmlEditorBtn = "btnHtmlEditor";
public static final String CDT_TextArea = "DynamicText";
public static final String CDT_PreviewBtn = "//img[contains(@src,'preview_small')]";
public static final String CDT_UndoBtn = "//img[contains(@src,'undo_small')]";
public static final String CDT_CreateEditText ="//td[contains(text(),'";//Application Post Submission Home')]/following-sibling::td/a[contains(text(),'Text')]";
public static final String CDT_Filter = "//img[contains(@src,'";    //plusfilter')]";
public static final String CDT_FilterName = "//a[contains(text(),'";   //TestFilter')]";
//#**********************************************************#
//#	 Prospect - Information Request - Page
//#**********************************************************#
public static final String IR_PI_FirstName = "//input[@id='q24518']";
public static final String IR_PI_LastName = "//input[@id='q24519']";
public static final String IR_PI_Email = "//input[@id='q24520']";
public static final String IR_PI_Dob = "//input[@id='q24521']";
public static final String IR_PI_Ethincity = "//select[@id='s24523']";
public static final String IR_PI_Ssn = "//input[@id='q24524']";
public static final String IR_AI_Address = "//input[@id='q24528']";
public static final String IR_AI_SuiteNumber = "//input[@id='q24532']";
public static final String IR_AI_City = "//input[@id='q24529']";
public static final String IR_AI_State = "//input[@id='q24530']";
public static final String IR_AI_ZipCode = "//input[@id='q24531']";
public static final String IR_AI_Country = "//input[@id='q24533']";
public static final String IR_OI_SchoolInterest = "//select[@id='s24534']";
public static final String IR_OI_TermInterest = "//select[@id='s24535']";
public static final String IR_OI_Major = "//select[@id='s24536']";
public static final String IR_LookupBtn = "cdelkpbutton";
public static final String IR_SubmitBtn = "//img[contains(@src,'submit_small')]";
//#**********************************************************#
//#	 Prospect - Look Up - Page
//#**********************************************************#
public static final String IR_LU_FirstName = "//input[@id='q24518']";
public static final String HS_Name = "//input[@id='q24542']";
public static final String HS_City = "//input[@id='q24543']";
public static final String HS_State = "//input[@id='q24544']";
public static final String HS_Country = "//input[@id='q24545']";
public static final String HS_Zip = "//input[@id='q24546']";
//#**********************************************************#
//#	 Maintananace - Upload Images - Page Name
//#**********************************************************#
public static final String UI_ClassicRadio = "//input[@value='classic']";
public static final String UI_FaceliftRadio = "//input[@value='facelift']";
public static final String UI_CornerImage = "chkCornerPackage";
public static final String UI_Package = "selPackages";
public static final String UI_UploadBtn = "//img[contains(@src,'upload')]";
//#**********************************************************#
//#	 Maintananace - Add/Edit Package 
//#**********************************************************#
public static final String IncludeOffline = "//td[contains(text(),'Include Offline Recommendation')]";
public static final String IncludeOfflineCheck = "//input[@name='chkPrintOfflineRcmd']";
public static final String RecIncludeOffline = "//font[contains(text(),'Include Offline Recommendation')]";


			//Created by  : Malik

//#**********************************************************#
//#	 Connect - Connect User Login Page - CULP 
//#**********************************************************#

public static final String CULP_UserName = "//input[@id='userName']";
public static final String CULP_PassWord = "//input[@id='clearTextPwd']";
public static final String CULP_Login = "//input[@id='loginBtn']";
public static final String CULP_Reset_Pwd = "//*[contains(text(),'Reset password')]";


//#**********************************************************#
//#	 Connect - WC_Manage My Profile - WMMP 
//#**********************************************************#

public static final String WMMP_LastName = "//input[@id='txtLastName']";
public static final String WMMP_Save = "//img[@alt='save']";
public static final String WMMP_Cancel = "//img[@alt='cancel']";
public static final String WMMP_CRM = "//a[contains(text(),'CRM')]";

//#**********************************************************#
//#	 Connect - Edit User Profile - CEUP 
//#**********************************************************#

public static final String CEUPI_Lastname = "//input[contains(@id,'TextBox_LastName')]";
public static final String CEUPV_Lastname = "//input[contains(@id,'TextBox_LastName') and @value='";	//reddy']";
public static final String CEUP_Save = "//input[@value='Save']";
public static final String CEUP_Cancel = "//input[@value='Cancel']";
public static final String CEUP_Application = "//*[contains(text(),'Application')]";

//#**********************************************************#
//#	 Connect - Reset Password - RP 
//#**********************************************************#

public static final String RP_EmailId = "//input[@id='EMAIL']";
public static final String RP_Ok = "//input[@id='okButton']";
public static final String RP_Cancel = "//input[@id='cancelButton']";
public static final String RP_Ok_Confirm = "//input[@id='okButton']";
public static final String RP_Lock_Msg = "//div[@class='simplemessage-error']";
public static final String RP_password = "//input[@id='clearTextPwd']";
public static final String RP_ResetPwd = "//input[@id='confirm']";

//#**********************************************************#
//#	 Connect - MainMenu list - MML 
//#**********************************************************#

public static final String MML_ManageUsers = "//div[contains(text(),'Manage Users')]";
public static final String MML_Add = "//a[contains(@href,'add()')]";
public static final String MML_userid = "//input[@id='txtUserID']";
public static final String MML_FirstName = "//input[@id='txtFirstName']";
public static final String MML_LastName = "//input[@id='txtLastName']";
public static final String MML_Email = "//input[@id='txtEmail']";
public static final String MML_Save = "//a[contains(@href,'ValidateAndSubmit')]";
public static final String MML_Cancel =	"//a[contains(@href,'Cancel')]";
public static final String MML_TotalUsers = "//a[@id='ctl00_ContentPlaceHolder1_HyperLink_TotalUsers']";
public static final String MML_UName = "//input[@id='Username']";
public static final String MML_Search = "//input[@id='userSearchButton']";
public static final String MML_UNameVerify = "//table[@id='userSearchResultsTable']/tbody/tr[1]/td[2]";

//#*************************************************************#
//#   WC-Recommendation pachage-configureforms-Applicant Info Display
//#**************************************************************#

public static final String AID_Display_Check= "//td[font[contains(text(),'";
public static final String AID_label_text="//td[font[contains(text(),'Last name')]]/following-sibling::td/font/input[contains(@id,'DISPLABEL')]";
public static final String AID_save_button="//img[contains(@src,'save_small')]";
public static final String AID_pagename="//table[@id='Table1']/tbody/tr/td/font"; //[contains(text(),'Application')]";
public static final String AID_message="//div[@id='divAyConfirmation']/font[contains(text(),'";
public static final String AID_RecPlus = "//img[contains(@src,'plus')]";
public static final String AID_RecAppInfoDisp = "//a[text()='Applicant Info Display']";
public static final String REC_Display_lname = "//dl[@class='dl-horizontal']/dt[contains(text(),'Acad`~!@#$%^*+-/()_-+={}[]|\')]";
public static final String REC_Display_dob = "//div[@id='rec-AppInfoBox']/dl/dt[contains(text(),'BirthDate')]";




//#**********************************************************#
//# NGU - Quick Add
//#**********************************************************#

public static final String NGU_Prefix = "//select[option[@value='Mr.']]";
public static final String NGU__MiddleName = "//input[@id='q674']";
public static final String NGU_FirstName = "//input[@id='q13649']";
public static final String NGU_LastName	= "//input[@id='q675']";
public static final String NGU_Gender = "//input[@value='Male']";
public static final String NGU_DescYourself = "//input[@type='checkbox' and @value='Chinese']";
public static final String NGU_DOB = "//input[@id='q682']";
public static final String NGU_CityOfBirth = "//input[@id='q683']";
public static final String NGU_CountryofBirth = "//select[option[@value='US']]";
public static final String NGU_FinancialAid = "//font[label[contains(text(),'Yes')]]/preceding-sibling::input[@value='Y']";
public static final String NGU_StreetAddress1 = "//input[@id='q700']";
public static final String NGU_City = "//input[@id='q701']";
public static final String NGU_State = "//select[option[@value='Virginia']]";
public static final String NGU_Country = "//select[@id='s703' and option[@value='US']]";
public static final String NGU_PostalCode = "//input[@id='q704']";
public static final String NGU_Email = "//input[@id='q711']";
public static final String NGU_ReviewAppFee = "//input[@id='appfee']";
public static final String NGU_PaymentMethod = "//input[@id='paymentmethod']";
public static final String NGU_Submit = "//img[@alt='Submit']";
public static final String NGU_Reset = "//img[@alt='Reset']";
//#**********************************************************#
//# AppReview - AR
//#**********************************************************#

public static final String AR_School = "//input[@id='SchoolLoginId']";
public static final String AR_Username = "//input[@id='UserName']";
public static final String AR_Password = "//input[@id='Password']";
public static final String AR_Login = "//button[@class='btn btn-primary']";
public static final String AR_ForgotUsername = "//a[contains(@href,'Username')]";
public static final String AR_ForgotPassword = "//a[contains(@href,'Password')]";
//public static final String AR_SuperuserLogin = "//a[contains(@class,'dropdown-toggle') and contains(text(),'ARSuperuser')]";
public static final String AR_SuperuserLogin = "//ul[contains(@class,'pull-right')]//li/a[contains(text(),'Welcome')]";
public static final String AR_Logoff = "//a[contains(@href,'logoff')]";
public static final String AR_MainSubmenu = "//a[contains(text(),'";
public static final String AR_AppSearchBox = "//input[@id='searchPhraseField']";
//public static final String AR_AppSearchButton  = "//button[@data-original-title='Click here to search']";
public static final String AR_AppSearchButton = "//div[@id='simpleSearch']/button";
public static final String AR_SearchAppLName = "//tr[@class='unread']/td[@class='sorted']/a[contains(text(),'";
public static final String AR_ReviewPool = "//select[@id='reviewPoolToggler']";
public static final String AR_AssignReadyforReviewStatusSubmit = "//img[@alt='print']";
public static final String AR_AssignReadyforReviewStatusBack = "//img[contains(@src,'back')]";
public static final String AR_SearhResult = "//div[contains(@class,'alert-info')]";

//#**********************************************************#
//# Webcenter - Manage Choice Groups - MCG
//#**********************************************************#
public static final String MCG_Package = "//img[contains(@src,'";   //publish_prod_large')]"
public static final String MCG_ConfigureStatusLabel = "//a[contains(text(),'";   //'Enrollment-DT')]";
public static final String MCG_groupdescription = "//textarea[@name='txtSplChoiceGroupDescription']";
public static final String MCG_StatusCategory= "//select[@name='StatusCategory' and contains(@onchange,'";
public static final String MCG_label = "//input[@name='txtLabel' and @value='']";
public static final String MCG_AddRow = "//img[contains(@src,'addrow')]";
public static final String MCG_RowValue = "//td[input[@name='txtLabel' and @value='']]/preceding-sibling::td[@class='FormFields']";
//public static final String MCG_MainLogout = "//a[contains(text(),'";      //Main Menu')]"; 
public static final String MCG_MainLogout = "//a[contains(text(),'logout') or contains(text(),'Logout') or contains(@href,'";
public static final String MCG_Active = "//td[input[@value='";  //TestingSupport']]/following-sibling::td[input[@type='checkbox']]";
public static final String MCG_DeleteCheck = "//td[input[@value='";  //TestingSupport']]/following-sibling::td[input[@name='chkDelete']]";
public static final String MCG_PackageTree = "//a[contains(@onclick,'setSelectedNode') and contains(text(),'";   //Enrollment')]";

//#**********************************************************#
//# Webcenter - Enrollment - ER
//#**********************************************************#
public static final String ER_linktoclick = "//a[contains(text(),'"; //Enrollment-DT Module Home')]";
public static final String AY_ConfigureStatusConfirmationText = "//div[@id='divAyConfirmation']/font[contains(text(),'";

//#**********************************************************#
//# Webcenter - Enrollment DT Fee - ER
//#**********************************************************#
public static final String EDT_Page = "//font[contains(text(),'Search Results')]";
public static final String EDT_PaymentStatus = "//select[@name='syspmtStatus']";
public static final String EDT_VerifyPaymentStatus = "//select[@id='pmtstatus']//option[contains(text(),'";   //ManageQueries')]";
public static final String EDT_ButtontoClick = "//img[contains(@src,'"; //close_window')]";
public static final String EDT_PageName = "//td/font";


//#**********************************************************#
//# Webcenter - Enrollment Detail Page- ED
//#**********************************************************#
public static final String ED_Buttons = "//span[contains(text(),'Enrollments-DT fee')]";
//#**********************************************************#
//# Webcenter - Recommendation Details Page - RD
//#**********************************************************#
public static final String RD_RecStartDate = "//td[contains(text(),'";    //This Recommender  has not started the Recommendations')]";
public static final String RD_Pagename = "//font[contains(text(),'Recommendations')]";
//#**********************************************************#
//# Webcenter Search For Recommendation Verify - SRV
//#**********************************************************#

//public static final String SRV_PageName = "//div[@id='AYInstructions']/following-sibling::font";
    public static final String SRV_PageName = "//td//font";
//#**********************************************************#
//# Webcenter - Recommendation Update Status - RUS
//#**********************************************************#
public static final String RUS_Pagename = "//td[@class='FormHeading']/font";
//#**********************************************************#
//# Webcenter - Recommendation System Field Batch Update - RSFBU
//#**********************************************************#

public static final String RSFBU_Pagename = "//table[@id='Table1']//font";  
public static final String RSFBU_Status = "//select[@id='sysStatus']";
public static final String RSFBU_SubmitBack = "//img[contains(@src,'";
public static final String RSFBU_StatusGrey = "//select[@id='StatusVal'][option[contains(@style,'Grey')]]";
//#**********************************************************#
//# Webcenter - Recommendation Search Result - RSR
//#**********************************************************#
public static final String RSR_ApplicantClick = "//a[contains(text(),'";   //'TestHaja, TestMalik')]
//#**********************************************************#
//# Webcenter - Recommendation Update Status - RUS
//#**********************************************************#
public static final String RUS_Status = "//select[@id='StatusVal']";
public static final String RUS_CloseWindow = "//img[contains(@src,'";     //close_window')]";

//#**********************************************************#
//# Webcenter - Recommendation - Recommendation Summary RS
//#**********************************************************#
public static final String RS_Status = "//a[contains(@onclick,'Status')]";
//#**********************************************************#
//# Webcenter - Application - Applicant Summary AS
//#**********************************************************#
public static final String AS_pagename = "//font[contains(text(),'Transcripts')]";
public static final String AS_TestScoreStatus = "//select[@name='TestStatus']";
public static final String AS_TestType = "//select[@name='PackageTestId']";
public static final String AS_SupportingDocCloseWindow = "//img[contains(@src,'"; 
public static final String AS_TestScorepagename = "//font[contains(text(),'Manage Test Scores')]";
public static final String AS_TestScoreEnglish = "//input[@name='Composite']";
public static final String AS_TestScoreSave = "//img[contains(@src,'save')]";
public static final String AS_TestScoreReading = "//input[@name='Reading']";
public static final String AS_TestScoreMath = "//input[@name='Math']";
public static final String AS_TestScoreScience = "//input[@name='Science']";
public static final String AS_TestScoreComposite = "//input[@name='Composite']";
public static final String AS_TestScoreSchoolName = "//input[@name='schoolname']";
public static final String AS_TranscriptStatus = "//select[@id='Select1']";
public static final String AS_SupportingDocumentStatus = "//select[@id='Status']";
public static final String AS_SupportingDocumentName = "//select[@name='SuppDocID']";
public static final String AS_ApplicantDecision="//font[@class='BasePageFont' and contains(text(),'";     //Received')]";
public static final String AS_PrintCloseWindow = "//img[contains(@src,'";    //print')]";
//#**********************************************************#
//# Maintenance center - Manage User - MS
//#**********************************************************#
public static final String MS_addgo = "//img[contains(@src,'";      //'add')]";
public static final String MS_userid = "//input[@id='txtUserID']";
public static final String MS_firstname = "//input[@id='txtFirstName']";
public static final String MS_lastname = "//input[@id='txtLastName']";
public static final String MS_title = "//input[@id='txtTitle']";
public static final String MS_Email = "//input[@id='txtEmail']";
public static final String MS_savecancel = "//img[contains(@src,'";    //'save')]
public static final String MS_CheckPrivilege = "//table[@id='tblPrivsNOTAssigned']//td//font/text()[normalize-space(.) ='";  //Maintain Users']//preceding-sibling::input[@type='checkbox']";
public static final String MS_ConfirmationText = "//div[@class='AYConfirmationText']";
public static final String MS_NewPassword = "//input[@name='Password']";
public static final String MS_ConfirmPassword = "//input[@name='ConPassword']";
public static final String MS_Submit = "//input[contains(@src,'submit')]";
public static final String MC_SR_SelectMenu = "//button[contains(@class,'ui-multiselect')]"; 
public static final String MC_SR_Values = "//div[contains(@class,'ui-multiselect-menu')]//span[contains(text(),'";
//#**********************************************************#
//# Webcenter - Add Recommendation - AR
//#**********************************************************#
public static final String AR_FirstName = "//input[@id='firstname']";
public static final String AR_LastName = "//input[@id='lastname']";
public static final String AR_Address1 = "//input[@id='address1']";
public static final String AR_Address2 = "//input[@id='address2']";
public static final String AR_City = "//input[@id='city']";
public static final String AR_State = "//select[@id='state']";
public static final String AR_PostalCode = "//input[@id='zip']";
public static final String AR_Country = "//select[@id='country']";
public static final String AR_Phone = "//input[@id='phone']";
public static final String AR_EmailAddress = "//input[@id='email']";
public static final String AR_Title = "//input[@id='title']";
public static final String AR_Employer = "//input[@id='employer']";
public static final String AR_RelationShip = "//input[@id='employer']";
public static final String AR_RecommendationType = "//select[@id='field1']";
public static final String AR_Save = "//img[contains(@src,'save_small')]";
//#**********************************************************#
//# Webcenter - Recommendation DT Page- RD
//#**********************************************************#
public static final String RD_VerifyStatus = "//a[contains(text(),'";  //Not Received')]";
public static final String RD_Online = "//a[contains(text(),'No')]";

public static final String RD_CloseWindow = "//img[contains(@src,'close_window')]";
//#**********************************************************#
//# Webcenter - Application -Email Template -Add Filter - ET
//#**********************************************************#
public static final String ET_FilterName = "//input[@name='txtName']";
public static final String ET_Description = "//textarea[@class='FormFields']";
public static final String ET_FieldName = "//select[@name='txtField0']";
public static final String ET_Operator = "//select[@name='txtOperator0']";
public static final String ET_Value = "//button[contains(@class,'ui-multiselect')]";
public static final String ET_SaveCancel = "//img[contains(@src,'";   //save_small')]";

//#********************************************************************#
//# Webcenter - Application - Configure Forms- Section/Subsection rules

//#********************************************************************#

public static final String SR_PageName="//form[@name='frm";
public static final String SR_ShowHide="//a[contains(@href,'AYInstructions')]/font[contains(text(),'";
public static final String SR_Instructions="//div[@id='AYInstructions']";
public static final String SR_LinkToClick = "//a[contains(@href,'javascript:EditRule()')]";
public static final String SR_button="//img[contains(@src,'";
public static final String SR_name="//input[@name='txtName']";
public static final String SR_description="//textarea[@name='txtDescription']";
public static final String SR_subsection="//input[contains(@id,'SectionInput')]";
public static final String SR_field="//select[contains(@name,'txtField')]";
public static final String SR_operator="//select[@name='txtOperator0']";
public static final String SR_value_No="//input[@value='N']";
public static final String SR_value_Yes="//input[@value='Y']";
public static final String SR_RuleName="//td[a[contains(text(),'";
public static final String SR_CheckBox="/preceding-sibling::td[input[@name='Chk_RuleID']]";



}





