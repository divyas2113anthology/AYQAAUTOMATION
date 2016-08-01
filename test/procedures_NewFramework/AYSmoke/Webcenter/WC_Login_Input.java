package procedures_NewFramework.AYSmoke.Webcenter;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_Login_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Webcenter Login' page")
	public void WC_Login_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Webcenter Login' Page");
			String[] testdata = datacontainer;
			String clientid = testdata[0];
			String userid = testdata[1];
			String password = testdata[2];
			String needpasswordgo = testdata[3];
			String viewsource = testdata[4];
			Reporter.log("Input Test Data was retrieved for 'Webcenter Login' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!clientid.equals("")) {
				if (clientid.equals("WebcenterClientID")) {
					String ClientID = Runtimedataread(clientid);
					Reporter.log("Step 1 - Enter Clients as ["+ClientID+"]");
					sendKeys(attributeName_cssselector, WCL_ClientID, ClientID);
				} else {
					Reporter.log("Step 1 - Enter Clients as ["+clientid+"]");
					sendKeys(attributeName_cssselector, WCL_ClientID, clientid);
				}
			}			
			if (!userid.equals("")) {
				if (userid.equals("WebcenterUserID")) {
					String UserID = Runtimedataread(userid);
					Reporter.log("Step 2 - Enter User ID as ["+UserID+"]");
					sendKeys(attributeName_cssselector, WCL_UserID, UserID);
				} else {
					Reporter.log("Step 2 - Enter User ID as ["+userid+"]");
					sendKeys(attributeName_cssselector, WCL_UserID, userid);
				}
			}			
			if (!password.equals("")) {
				if (password.equals("WebcenterPassword")) {
					String Password = Runtimedataread(password);
					Reporter.log("Step 3 - Enter Password as ["+Password+"]");
					sendKeys(attributeName_cssselector,WCL_Password, Password);
				} else {
					Reporter.log("Step 3 - Enter Password as ["+password+"]");
					sendKeys(attributeName_cssselector,WCL_Password, password);
				}
			}			
			if (!needpasswordgo.equals("")) {
				Reporter.log("Step 4 - Click on ["+needpasswordgo+"] button or Link");
				if (needpasswordgo.equalsIgnoreCase("Need Password or Login Help?")) {
					click(WCL_NeedPasswordLogin);
					recentPopupSelect("Forgot Password Search");
				}else if (needpasswordgo.equalsIgnoreCase("GO")) {
					clickWebdriver(attributeName_xpath, WCL_Go);
					waitForPageToLoadWebdriver();
				}else {
					writeFailure("Given Test Data["+needpasswordgo+"] either Incorrect or has not be Scripted ");
				}

			}
			if(!viewsource.equals("")){
				waitForPageToLoad();
				String pagesource = driver.getPageSource();
				System.out.println(pagesource);
				if(pagesource.contains(viewsource))
					System.out.println("String Present");
				else 
					writeFailure("Given Test Data["+viewsource+"] has not be available");
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
