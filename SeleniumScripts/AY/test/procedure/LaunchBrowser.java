package procedure;
import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class LaunchBrowser extends CommonSeleniumActions implements OR {
	
	
	@Test(description="This procedure is to Navigate URL")
	public void GL_LaunchBrowser() throws Exception{
		try {
		writeDetails();
//		headerStatement("GL_LaunchBrowser");
//		startExecutionOrder(j);
//		writeParametersTable();
		String[]  instancedatarepo = datacontainer;
		Reporter.log("Proceed to retrieve Test Data for URL");		
		String url = instancedatarepo[0];
		Reporter.log("Test Data was retrieved for URL");
		Reporter.log("Proceed to retrieve Environment From Excel Sheet(C:/Selenium/InputTestdata.xls)");
		String environment = Runtimedataread("Instance");
		String envirurl = null;
		if (url.contains("app")) {			
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://uatapp.applyyourself.com/?id=ayauto";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "https://uatapp.hobsons.co.uk/?id=ayauto";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "https://app.applyyourself.com/?id=ayauto";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "https://app.hobsons.co.uk/?id=ayauto";
			}
		}else if (url.contains("webcenter")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://uatwebcenter.applyyourself.com/";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "https://uatwebcenter.hobsons.co.uk/";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "https://webcenter.applyyourself.com/";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "https://webcenter.hobsons.co.uk/";
			}
		}else if (url.contains("manage")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://uatmanage.applyyourself.com";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "https://uatmanage.hobsons.co.uk";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "http://manage.applyyourself.com";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "http://manage.hobsons.co.uk";
			}
		}else if (url.contains("rec")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://uatrec.applyyourself.com";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "https://uatrec.hobsons.co.uk";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "https://rec.applyyourself.com";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "https://rec.hobsons.co.uk";
			}
		}else if (url.contains("inq")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://uatinq.applyyourself.com";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "https://inq.applyyourself.com";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "";
			}
		}else if (url.contains("register")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://uatregister.applyyourself.com";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "https://uatregister.hobsons.co.uk";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "";
			}
		}else if (url.contains("Bridge")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "http://10.56.148.8:8051/Map/BridgeList.aspx";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "";
			}
		}else if (url.contains("ApplicantConnectLogin")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://uatapp.applyyourself.com/AYApplicantLogin/ApplicantConnectLogin.asp?id=aybusqa";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "";
			}
		}else if (url.contains("Admin")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://aybus.hobsonsemt.net/admin/Admin/login.aspx";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "";
			}
		}else if (url.contains("sso")) {
			if (environment.equalsIgnoreCase("USQA")) {
				envirurl = "https://aybus.hobsonsemt.net/sso/Sso/Login";
			}else if (environment.equalsIgnoreCase("UKQA")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("USPR")) {
				envirurl = "";
			}else if (environment.equalsIgnoreCase("UKPR")) {
				envirurl = "";
			}
		}
		Reporter.log("Step 1 - Proceed to Open URL("+envirurl+")");
		System.out.println("Entering URL");
		selenium.open(envirurl);
		waitForPageToLoad();
		//endExecutionOrder(j);
//		Reporter.log("##########Start of Execution Order ["+j+"]##########");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
