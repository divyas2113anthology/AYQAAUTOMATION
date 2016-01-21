package procedures_NewFramework.AYSmoke.StudentFacingProcedures.Application;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class Recommendations_Input extends CommonSeleniumActions implements OR {
	

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
				waitForElementPresentWebdriver(attributeName_xpath, RC_RecProviderlist, rcrecommenderproviderlist);
					click(RC_RecProviderlist);
			}
			if (!rcrecommendername .equals("")) {
				Reporter.log("Step 2 - Click recommender name ("+rcrecommendername+")");
				click(RC_RecProvidername);
			}
			if (!rcrecommendercheck .equals("")) {
				Reporter.log("Step 3 - Check recommender as ("+rcrecommendercheck+")");
				String Recommendercheckrc = getElementIDbyLabelContainsusingXpathWebdirver("recommenderchk",RC_RecProvidercheck);
				check(Recommendercheckrc);
			}
			if (!rcaddbutton.equals("")) {
				Reporter.log("Step 4 - Click ("+rcaddbutton+")");
				click(RC_Add);
			}
			if (!rcfirstname.equals("")) {
				Reporter.log("Step 5 - Enter First name as ("+rcfirstname +")");
				waitForElementPresentWebdriverWait(attributeName_xpath, RC_fName, rcfirstname);
				String Fnamerc = getElementIDbyLabelContainsusingXpathWebdirver("First Name",RC_fName);				
				type(Fnamerc,rcfirstname );
			}
			if (!rclastname.equals("")) {
				Reporter.log("Step 6 - Enter Last Name as ("+rclastname+")");
				String Lnamerc = getElementIDbyLabelContainsusingXpathWebdirver("Last Name",RC_lName);				
				type(Lnamerc,rclastname);
			}
			if (!rcstreetaddressline1.equals("")) {
				Reporter.log("Step 7 - Enter Street Address (Lane 1) as ("+rcstreetaddressline1+")");
				String Saddress1rc = getElementIDbyLabelContainsusingXpathWebdirver("Street Address (Line 1)",RC_Address1);				
				type(Saddress1rc,rcstreetaddressline1);
			}
			if (!rcstreetaddressline2.equals("")) {
				Reporter.log("Step 8 - Enter Street Address (Lane 2) as ("+rcstreetaddressline2+")");
				String Saddress2rc = getElementIDbyLabelContainsusingXpathWebdirver("Street Address (Line 2)",RC_Address2);				
				type(Saddress2rc,rcstreetaddressline2);
			}
			if (!rccity.equals("")) {
				Reporter.log("Step 9 - Enter City as ("+rccity+")");
				String Cityrc = getElementIDbyLabelContainsusingXpathWebdirver("City",RC_City);				
				type(Cityrc, rccity);
			}
			if (!rcstate.equals("")) {
				Reporter.log("Step 10 - Select State as ("+rcstate+")");
				String Staterc = getElementIDbyLabelContainsusingXpathWebdirver("State",RC_State);				
				select(Staterc, rcstate);
			}
			if (!rcpostalcode.equals("")) {
				Reporter.log("Step 11 - Select Postal Code as ("+rcpostalcode+")");
				String  Postalcoderc= getElementIDbyLabelContainsusingXpathWebdirver("Postal Code",RC_PostalCode);				
				type(Postalcoderc,rcpostalcode);
			}
			if (!rccountry.equals("")) {
				Reporter.log("Step 12 - Select Country as ("+rccountry+")");
				String Countrypd = getElementIDbyLabelContainsusingXpathWebdirver("Country",PD_Country);				
				select(Countrypd,rccountry);
			}
			if (!rcphone.equals("")) {
				Reporter.log("Step 13 - Enter Phone  as ("+rcphone+")");
				String Phonerc = getElementIDbyLabelContainsusingXpathWebdirver("Phone",RC_Phone);				
				type(Phonerc,rcphone);
			}
			if (!rcemailaddress.equals("")) {
				Reporter.log("Step 14 - Enter Email Address as ("+rcemailaddress+")");
				String Emailaddressrc = getElementIDbyLabelContainsusingXpathWebdirver("Email Address",RC_EmailAddress);				
				type(Emailaddressrc,rcemailaddress);
			}
			if (!rctitle.equals("")) {
				Reporter.log("Step 15 - Enter Title as ("+rctitle+")");
				String Titlerc = getElementIDbyLabelContainsusingXpathWebdirver("Title",RC_Title);				
				type(Titlerc, rctitle);
			}
			if (!rcemployer.equals("")) {
				Reporter.log("Step 16 - Enter Employer as ("+rcemployer+")");
				String Employerrc = getElementIDbyLabelContainsusingXpathWebdirver("Employer",RC_Employer);				
				type(Employerrc,rcemployer);
			}
			if (!rcrelationshiptoyou.equals("")) {
				Reporter.log("Step 17 - Enter Relationship to you ("+rcrelationshiptoyou+")");
				String Relationshiptoyourc = getElementIDbyLabelContainsusingXpathWebdirver("Relationship to you", RC_Relationyou);
				type(Relationshiptoyourc, rcrelationshiptoyou);
			}
			if (!rcrectype.equals("")) {
				Reporter.log("Step 18 - Select Recommendation type as ("+rcrectype+")");
				String Rectyperc = getElementIDbyLabelContainsusingXpathWebdirver("Recommendation type", RC_Recommendationtype);
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
				String Personalnoterc = getElementIDbyLabelContainsusingXpathWebdirver("If you would like to include a personal note in the notification email that is delivered, please use the space below", RC_Notificationemail);
				type(Personalnoterc, rcpersonalnote);
			}
			if (!rcsave.equals("")) {
				Reporter.log("Step 20 - Click on ("+rcsave+")Button");
				click(RC_Save);
				waitForPageToLoad();
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}



}
