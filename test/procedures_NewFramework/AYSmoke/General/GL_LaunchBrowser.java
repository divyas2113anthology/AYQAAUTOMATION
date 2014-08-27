package procedures_NewFramework.AYSmoke.General;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class GL_LaunchBrowser extends CommonSeleniumActions implements OR {
	public static String environment;
	@Test(description="This procedure is to Navigate URL")
	public void GL_LaunchBrowser() throws Exception{
		try {
			writeDetails();
			String[]  instancedatarepo = datacontainer;
			Reporter.log("Proceed to retrieve Test Data for URL");		
			String url = instancedatarepo[0];
			String openurl = instancedatarepo[1];
			Reporter.log("Test Data was retrieved for URL");
			Reporter.log("Proceed to retrieve Environment From Excel Sheet(C:/Selenium/InputTestdata.xls)");
			environment = Runtimedataread("Instance");
			String envirurl = null;
			if ((url.contains("app")) && (url.contains("ayauto&facelift"))) {			
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "https://uatapp.applyyourself.com/?id=ayauto&facelift=true";
					envirurl = "https://qaapp.applyyourself.com/?id=ayauto&facelift=true";
					//envirurl = "http://IAD1PW001:8089/?id=ayauto&facelift=true";
					//envirurl = "http://iad1pw001app.emt.hobsons.local/AYApplicantLogin/fl_ApplicantLogin.asp?id=ayauto";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					envirurl = "https://uatapp.hobsons.co.uk/?id=ayauto&facelift=true";
					//envirurl = "https://qaapp.hobsons.co.uk/?id=ayauto&facelift=true";
					//envirurl = "http://lhr1pw003app.emt.hobsons.local/?id=ayauto&facelift=true";
				}else if (environment.equalsIgnoreCase("USPR")) { 
					envirurl = "https://app.applyyourself.com/?id=ayauto&facelift=true";
					//envirurl = "https://app.applyyourself.com/?id=ayauto&facelift=true";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "https://app.hobsons.co.uk/?id=ayauto&facelift=true";
				}else if (environment.equalsIgnoreCase("IAD1PW081")) {
					envirurl = "http://iad1pw081app.emt.hobsons.local/?id=ayauto&facelift=true";
				}else if (environment.equalsIgnoreCase("IAD1PW082")) {
					envirurl = "http://iad1pw082app.emt.hobsons.local/?id=ayauto&facelift=true";
				}else if (environment.equalsIgnoreCase("IAD1PW083")) {
					envirurl = "http://iad1pw083app.emt.hobsons.local/?id=ayauto&facelift=true";
				}else if (environment.equalsIgnoreCase("IAD1PW084")) {
					envirurl = "http://iad1pw084app.emt.hobsons.local/?id=ayauto&facelift=true";
				}else if (environment.equalsIgnoreCase("IAD1PW085")) {
					envirurl = "http://iad1pw085app.emt.hobsons.local/?id=ayauto&facelift=true";
				}
			}else if ((url.contains("app")) && (url.contains("aybusqa&facelift"))) {			
					if (environment.equalsIgnoreCase("USQA")) {
						//envirurl = "https://uatapp.applyyourself.com/?id=ayauto&facelift=true";
						envirurl = "https://qaapp.applyyourself.com/?id=aybusqa&facelift=true";
						//envirurl = "http://IAD1PW001:8089/?id=ayauto&facelift=true";
						//envirurl = "http://iad1pw001app.emt.hobsons.local/AYApplicantLogin/fl_ApplicantLogin.asp?id=ayauto";
					}
				}else if ((url.contains("app")) && (url.endsWith("id=ayauto"))) {	
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "https://uatapp.applyyourself.com/?id=ayauto";
					envirurl = "https://qaapp.applyyourself.com/?id=ayauto";
					//envirurl = "http://IAD1PW001:8089/?id=ayauto";
					//envirurl = "http://iad1pw001app.emt.hobsons.local/?id=ayauto";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					envirurl = "https://uatapp.hobsons.co.uk/?id=ayauto";
					//envirurl = "https://qaapp.hobsons.co.uk/?id=ayauto";
					//envirurl = "http://lhr1pw003app.emt.hobsons.local/?id=ayauto";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "https://app.applyyourself.com/?id=ayauto";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "https://app.hobsons.co.uk/?id=ayauto";
				}else if (environment.equalsIgnoreCase("IAD1PW081")) {
					envirurl = "http://iad1pw081app.emt.hobsons.local/?id=ayauto";
				}else if (environment.equalsIgnoreCase("IAD1PW082")) {
					envirurl = "http://iad1pw082app.emt.hobsons.local/?id=ayauto";
				}else if (environment.equalsIgnoreCase("IAD1PW083")) {
					envirurl = "http://iad1pw083app.emt.hobsons.local/?id=ayauto";
				}else if (environment.equalsIgnoreCase("IAD1PW084")) {
					envirurl = "http://iad1pw084app.emt.hobsons.local/?id=ayauto";
				}else if (environment.equalsIgnoreCase("IAD1PW085")) {
					envirurl = "http://iad1pw085app.emt.hobsons.local/?id=ayauto";
				}
			}else if (url.contains("webcenter")) {
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "https://uatwebcenter.applyyourself.com/";
					envirurl = "https://qawebcenter.applyyourself.com/";
					//envirurl = "http://IAD1PW001:8088";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					envirurl = "https://uatwebcenter.hobsons.co.uk";
					//envirurl = "https://qawebcenter.hobsons.co.uk";
					//envirurl = "http://LHR1PW003:8088";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "https://webcenter.applyyourself.com/";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "https://webcenter.hobsons.co.uk";
				}else if (environment.equalsIgnoreCase("IAD1PW081")) {
					envirurl = "http://iad1pw081:8088/";
				}else if (environment.equalsIgnoreCase("IAD1PW082")) {
					envirurl = "http://iad1pw082:8088/";
				}else if (environment.equalsIgnoreCase("IAD1PW083")) {
					envirurl = "http://iad1pw083:8088/";
				}else if (environment.equalsIgnoreCase("IAD1PW084")) {
					envirurl = "http://iad1pw084:8088/";
				}else if (environment.equalsIgnoreCase("IAD1PW085")) {
					envirurl = "http://iad1pw085:8088/";
				}
			}else if (url.contains("manage")) {
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "http://uatmanage.applyyourself.com";
					envirurl = "http://qamanage.applyyourself.com";
					//envirurl = "http://IAD1PW001:8092";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					envirurl = "http://uatmanage.hobsons.co.uk";
					//envirurl = "http://qamanage.hobsons.co.uk";
					//envirurl = "http://LHR1PW003:8092";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "http://manage.applyyourself.com";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "http://manage.hobsons.co.uk";
				}
			}else if (url.contains("rec")) {
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "https://uatrec.applyyourself.com";
					envirurl = "https://qarec.applyyourself.com";
					//envirurl = "http://IAD1PW001:8091";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					envirurl = "https://uatrec.hobsons.co.uk";
					//envirurl = "https://qarec.hobsons.co.uk";
					//envirurl = "http://LHR1PW003:8091";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "https://rec.applyyourself.com";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "https://rec.hobsons.co.uk";
				}else if (environment.equalsIgnoreCase("IAD1PW081")) {
					envirurl = "http://iad1pw081:8091/";
				}else if (environment.equalsIgnoreCase("IAD1PW082")) {
					envirurl = "http://iad1pw082:8091/";
				}else if (environment.equalsIgnoreCase("IAD1PW083")) {
					envirurl = "http://iad1pw083:8091/";
				}else if (environment.equalsIgnoreCase("IAD1PW084")) {
					envirurl = "http://iad1pw084:8091/";
				}else if (environment.equalsIgnoreCase("IAD1PW085")) {
					envirurl = "http://iad1pw085:8091/";
				}
			}else if (url.contains("inq")) {
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "https://uatinq.applyyourself.com/?id=ayauto&pid=447";
					envirurl = "https://qainq.applyyourself.com/?id=ayauto&pid=447";
					//envirurl = "http://IAD1PW001:8090/?id=ayauto&pid=3788";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					envirurl = "https://uatinq.hobsons.co.uk/?id=ayauto&pid=447";
					//envirurl = "http://LHR1PW003:8090";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "https://inq.applyyourself.com/?id=ayauto&pid=447";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "https://inq.hobsons.co.uk/?id=ayauto&pid=447";
				}
			}else if (url.contains("register")) {
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "https://uatregister.applyyourself.com";
					envirurl = "https://qaregister.applyyourself.com";
					//envirurl = "http://IAD1PW001:8094";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					//envirurl = "https://uatregister.hobsons.co.uk";
					envirurl = "http://LHR1PW003:8094";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "";
				}
			}else if (url.contains("Bridge")) {
				if (environment.equalsIgnoreCase("USQA")) {
					envirurl = "http://10.56.148.8:8051/Map/BridgeList.aspx";
					//envirurl = "http://IAD1PW001:8051";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					//envirurl = "http://LHR1PW003:8051";
					envirurl = "";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "";
				}
			}else if (url.contains("ApplicantConnectLogin") && url.endsWith("aybusqa")||url.endsWith("icu")) {
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "https://uatapp.applyyourself.com/AYApplicantLogin/ApplicantConnectLogin.asp?id=aybusqa";
					envirurl = "https://qaapp.applyyourself.com/AYApplicantLogin/ApplicantConnectLogin.asp?id=aybusqa";
					//envirurl = "http://iad1pw001app.emt.hobsons.local/AYApplicantLogin/ApplicantConnectLogin.asp?id=icu";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					//envirurl = "http://lhr1pw003app.emt.hobsons.local/AYApplicantLogin/ApplicantConnectLogin.asp?id=bkc&facelift=true";
					envirurl = "https://uatapp.hobsons.co.uk/AYApplicantLogin/ApplicantConnectLogin.asp?id=bkc&facelift=true";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "https://app.applyyourself.com/AYApplicantLogin/ApplicantConnectLogin.asp?id=aybusqa";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "";
				}
			}
			else if (url.contains("ApplicantConnectLogin") && url.contains("aybusqa&facelift")||url.endsWith("icu&facelift=true")) {
				if (environment.equalsIgnoreCase("USQA")) {
					//envirurl = "https://uatapp.applyyourself.com/AYApplicantLogin/ApplicantConnectLogin.asp?id=aybusqa&facelift=true";
					envirurl = "https://qaapp.applyyourself.com/AYApplicantLogin/ApplicantConnectLogin.asp?id=aybusqa&facelift=true";
					//envirurl = "http://iad1pw001app.emt.hobsons.local/AYApplicantLogin/ApplicantConnectLogin.asp?id=icu&facelift=true";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					envirurl = "http://lhr1pw003app.emt.hobsons.local/AYApplicantLogin/ApplicantConnectLogin.asp?id=bkc&facelift=true";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "https://app.applyyourself.com/AYApplicantLogin/ApplicantConnectLogin.asp?id=aybusqa&facelift=true";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "";
				}
			}else if (url.contains("Admin")) {
				if (environment.equalsIgnoreCase("USQA")) {
					envirurl = "https://aybus.hobsonsemt.net/admin/Admin/login.aspx";
					//envirurl = "http://IAD1PW001:8078";
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
					//envirurl = "https://smalhotra.askadmissions.net/sso/Sso/Login?ReturnUrl=%2fsso%2fsso";
				}else if (environment.equalsIgnoreCase("UKQA")) {
					envirurl = "";
				}else if (environment.equalsIgnoreCase("USPR")) {
					envirurl = "https://aybus.hobsonsemt.net/sso/Sso/Login";
				}else if (environment.equalsIgnoreCase("UKPR")) {
					envirurl = "";
				}
			}else if (!openurl.equals("")) {
				
			}
			Reporter.log("Step 1 - Proceed to Open URL("+envirurl+")");
			writeConsole("Entering URL : "+envirurl);
			get(envirurl);
			waitForPageToLoadWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
}
