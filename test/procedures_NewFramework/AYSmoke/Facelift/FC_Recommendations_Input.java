package procedures_NewFramework.AYSmoke.Facelift;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_Recommendations_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to add a 'recommendation' page")
	public void FC_Recommendations_Input() throws Exception{
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
			String rcaddproviderbtn = rcdatarepo[21];
			String submitapplication = rcdatarepo[22];
			Reporter.log("Retrieved Test Data in Recommendations input");
			if (!rcrecommenderproviderlist .equals("")) {
				Reporter.log("Step 1 - Click button("+rcrecommenderproviderlist +")");
				waitForElementPresentWebdriverWait(attributeName_xpath, RC_RecProBtn,rcrecommenderproviderlist);
				clickWebdriver(attributeName_xpath, RC_RecProBtn);
				waitForPageToLoadWebdriver();
			}
			if (!rcrecommendername .equals("")) {
				Reporter.log("Step 2 - Click recommender name ("+rcrecommendername+")");
				clickWebdriver(attributeName_xpath,RC_RecProvidername);
			}
			if (!rcrecommendercheck .equals("")) {
				Reporter.log("Step 3 - Check recommender as ("+rcrecommendercheck+")");
				String Recommendercheckrc = getElementIDbyLabel("recommenderchk",RC_RecProvidercheck);
				checkWebdriver(attributeName_xpath,Recommendercheckrc);
			}
			if (!rcaddbutton.equals("")) {
				Reporter.log("Step 4 - Click ("+rcaddbutton+")");
				waitForElementPresentWebdriver(attributeName_xpath,RC_AddProBtn, "Add A Provider Button");
				clickWebdriver(attributeName_xpath, RC_AddProBtn);
				waitForPageToLoadWebdriver();
			}
			if (!rcfirstname.equals("")) {
				Reporter.log("Step 5 - Enter First name as ("+rcfirstname +")");
				sendKeys(attributeName_cssselector,RI_FirstName, rcfirstname );
			}
			if (!rclastname.equals("")) {
				Reporter.log("Step 6 - Enter Last Name as ("+rclastname+")");
				sendKeys(attributeName_cssselector,RI_LastName,rclastname);
			}
			if (!rcstreetaddressline1.equals("")) {
				Reporter.log("Step 7 - Enter Street Address (Lane 1) as ("+rcstreetaddressline1+")");
				sendKeys(attributeName_cssselector,RI_StreeNdAddress1,rcstreetaddressline1);
			}
			if (!rcstreetaddressline2.equals("")) {
				Reporter.log("Step 8 - Enter Street Address (Lane 2) as ("+rcstreetaddressline2+")");
				sendKeys(attributeName_cssselector,RI_StreedAddress2,rcstreetaddressline2);
			}
			if (!rccity.equals("")) {
				Reporter.log("Step 9 - Enter City as ("+rccity+")");
				sendKeys(attributeName_cssselector,RI_City, rccity);
			}
			if (!rcstate.equals("")) {
				Reporter.log("Step 10 - Select State as ("+rcstate+")");
				selectByVisibleTextWithSpaceWebdriver(attributeName_cssselector,RI_State, rcstate);
			}
			if (!rcpostalcode.equals("")) {
				Reporter.log("Step 11 - Select Postal Code as ("+rcpostalcode+")");
				sendKeys(attributeName_cssselector,RI_Zip,rcpostalcode);
			}
			if (!rccountry.equals("")) {
				Reporter.log("Step 12 - Select Country as ("+rccountry+")");
				selectByVisibleTextWithSpaceWebdriver(attributeName_cssselector,RI_Country,rccountry);
			}
			if (!rcphone.equals("")) {
				Reporter.log("Step 13 - Enter Phone  as ("+rcphone+")");
				sendKeys(attributeName_cssselector,RI_Phone,rcphone);
			}
			if (!rcemailaddress.equals("")) {
				Reporter.log("Step 14 - Enter Email Address as ("+rcemailaddress+")");
				sendKeys(attributeName_cssselector,RI_Email,rcemailaddress);
			}
			if (!rctitle.equals("")) {
				Reporter.log("Step 15 - Enter Title as ("+rctitle+")");
				sendKeys(attributeName_cssselector,RI_Title, rctitle);
			}
			if (!rcemployer.equals("")) {
				Reporter.log("Step 16 - Enter Employer as ("+rcemployer+")");
				sendKeys(attributeName_cssselector,RI_Employer,rcemployer);
			}
			if (!rcrelationshiptoyou.equals("")) {
				Reporter.log("Step 17 - Enter Relationship to you ("+rcrelationshiptoyou+")");
				sendKeys(attributeName_cssselector,RI_Relationship, rcrelationshiptoyou);
			}
			if (!rcrectype.equals("")) {
				Reporter.log("Step 18 - Select Recommendation type as ("+rcrectype+")");
				selectByVisibleTextWithSpaceWebdriver(attributeName_cssselector,RI_Recommendationtype,rcrectype);
				
			}
			if (!rcwaiverighttoexamineletter.equals("")) {
				Reporter.log("Step 19 - Check Waiver right examine letter as ("+rcwaiverighttoexamineletter+")");
				if (rcwaiverighttoexamineletter.equalsIgnoreCase("Yes")){
					clickWebdriver(attributeName_xpath,RI_WaeveRecY);
				}else if  (rcwaiverighttoexamineletter.equalsIgnoreCase("No")){
					clickWebdriver(attributeName_xpath,RI_WaeveRecN);
				}			
			}
			if (!rcproviderecommendationonline.equals("")) {
				Reporter.log("Step 20 - Check Full Time Student as ("+rcproviderecommendationonline+")");
				if (rcproviderecommendationonline.equalsIgnoreCase("Yes")){
					clickWebdriver(attributeName_xpath,RI_ProviderRecY);
				}else if  (rcproviderecommendationonline.equalsIgnoreCase("No")){
					clickWebdriver(attributeName_xpath,RI_ProviderRecN);
				}			
			}
			if (!rcpersonalnote.equals("")) {
				Reporter.log("Step 21 - Enter Relationship to you ("+rcpersonalnote+")");
				sendKeys(attributeName_cssselector,RI_MessageToRec, rcpersonalnote);
			}
			if (!rcaddproviderbtn.equals("")) {
				Reporter.log("Step 22 - Click on ("+rcaddproviderbtn+") Button");
//				click(RI_AddProvBtn);
				clickWebdriverWithCoordinates(attributeName_xpath, RI_AddProvBtnBottom);
//				clickWebdriverWithCoordinates(attributeName_xpath, "//input[@value='Add Provider']");
				alertAccept();
				waitForPageToLoadWebdriver();
				try{
					alertAccept();
				}catch(Exception e){
					System.out.println("no laer");
				}
				
			}
			if (!submitapplication.equals("")) {
				Reporter.log("Step 23 - Click on ("+submitapplication+") Button");
				waitForElementPresentWebdriver(attributeName_xpath,AW_SubAppBtn, submitapplication);
				clickWebdriver(attributeName_xpath,AW_SubAppBtn);
				waitForPageToLoadWebdriver();
				try{
					alertAccept();
				}catch(Exception e){
					System.out.println("no laer");
				}
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}



}
