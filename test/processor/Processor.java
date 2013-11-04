package processor;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverLogLevel;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;
import org.openqa.selenium.server.browserlaunchers.GoogleChromeLauncher;
import org.testng.Assert;
import org.testng.IMethodInstance;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;

import com.sun.corba.se.spi.ior.WriteContents;
import com.thoughtworks.selenium.BrowserConfigurationOptions;
import com.thoughtworks.selenium.DefaultSelenium;
import static processor.CommonSeleniumActions.Runtimedataread;
import static processor.CommonSeleniumActions.backtodetails;
import static processor.CommonSeleniumActions.writeFailure;

public class Processor {
 //	    protected SeleniumServer jettyProxy;
	 	public static SeleniumServer jettyProxy;
	 	public static WebDriver driver;
	 	public static WebDriverBackedSelenium selenium;
	    protected boolean jettyProxyWasStartedByATest = false;
	    protected final static String SELENIUM_SERVER_HOST = "localhost";
	    protected final static int SELENIUM_SERVER_PORT = 4444;
	    public static final String STANDARD_PAGE_LOAD_WAIT_TIME = "120000"; //milliseconds
//	    public static DefaultSelenium selenium;
	    public static final int STANDARD_PAGE_LOAD_WAIT_TIME_WEBDRIVER = 60; //second
	    public static int golbalProcedureOrder=0;
	    public static ArrayList testData;
		public static String[] datacontainer; 
	    public static String[] parameternames;
	    public static String procedurename;// colecting all procedure
	    public static ArrayList<String> procedureclass = new ArrayList<String>();
    	public static ArrayList<String> executeprocedurename = new ArrayList<String>();
    	public static ArrayList<String> procedureorder = new ArrayList<String>();
    	public static ArrayList<String> procedurestatus = new ArrayList<String>();
	    public static String[] classcontainer;
	    public static String[] procedurecontainer;
	    public static String[] ordercontainer;
	    public static String[] statuscontainer;
	    public static ArrayList<String> Summarydetails = new ArrayList<String>();
	    public static String browser;

		
////		@Parameters({"csvfile"})
//	    @BeforeSuite(alwaysRun = true)
////	    public void makeSureWeHaveAJettyProxyRunning(String testName,ITestContext context) throws Exception {
//	   	public void startseleniumserver(ITestContext context) throws Exception {
////	    public void makeSureWeHaveAJettyProxyRunning() throws Exception {
//
//	        Socket socket = null;
//	        try {
//	        	System.out.println("----- SELENIUM SERVER STARTED -------");
//	            socket = new Socket(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT);
//	           
//	        } catch(Exception e) {
//	            startJettyProxy();
//	            jettyProxyWasStartedByATest = true;    
////		    	BrowserConfigurationOptions browserconfig = new BrowserConfigurationOptions();
////		    	String BrowName = CommonReuseable4Testing.TestBrowser();
////		    	if (BrowName.equalsIgnoreCase("Googlechrome")||BrowName.equalsIgnoreCase("Safari")) {
////		    		selenium.start(browserconfig.setCommandLineFlags("--disable-web-security"));
////				} else {
////			    	selenium.start();
////				}
////		    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, "*iexplore", "https://uatapp.applyyourself.com/?id=ayauto");
////		    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, "*iexploreproxy", "https://uatapp.applyyourself.com/?id=ayauto");
////		    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, getbrowser(), getenvironment());
//	            selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, getbrowser(), "https://arqa.applyyourself.com/");		    	
//		    	selenium.start();
//		    	selenium.windowMaximize();
////		    	selenium.setSpeed("1000");
//		        selenium.setTimeout(STANDARD_PAGE_LOAD_WAIT_TIME);
////		        selenium.windowFocus();
////		        System.out.println("File Name "+testName);	
//		        String outlocation =  context.getOutputDirectory();
//				String[] outfilename = outlocation.split("\\\\");
////				Reporter.log("Output driretory"+outfilename);
//				String testName = outfilename[outfilename.length-2];
////				String testName = "AccountCreation";		       
////				System.out.println("File Name "+testName);
////				testData = readCSVFile("csv/"+testName+".csv");
////				testData = readCSVFile("\\\\Intranet\\Teams\\WebProducts\\QA\\AutomationFramework\\csv\\"+testName+".csv");						
//				String outlocadrive = outlocation.substring(0,outlocation.lastIndexOf("\\"));
//				String outlocarepo = outlocation.substring(0,outlocadrive.lastIndexOf("\\"));
//				String autoframework = outlocation.substring(0,outlocarepo.lastIndexOf("\\"));				
////				System.out.println("Project Folder name File Name "+autoframework);
//				testData = readCSVFile(autoframework+"\\csv\\"+testName+".csv");				
//	        }
//	        finally {
//	            if (socket != null) {
//	                socket.close();
//	            }
//	        }
//	    }
//	    
	    
//	    @BeforeSuite
//	   	public void startseleniumserver(ITestContext context) throws Exception {
////		    public void makeSureWeHaveAJettyProxyRunning() throws Exception {
//
////		        
//		        try {
//		        	jettyProxy = new SeleniumServer();
//		        	jettyProxy.start();
////		            startJettyProxy();
////		            jettyProxyWasStartedByATest = true;    
////			    	BrowserConfigurationOptions browserconfig = new BrowserConfigurationOptions();
////			    	String BrowName = CommonReuseable4Testing.TestBrowser();
////			    	if (BrowName.equalsIgnoreCase("Googlechrome")||BrowName.equalsIgnoreCase("Safari")) {
////			    		selenium.start(browserconfig.setCommandLineFlags("--disable-web-security"));
////					} else {
////				    	selenium.start();
////					}
////			    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, "*iexplore", "https://uatapp.applyyourself.com/?id=ayauto");
////			    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, "*iexploreproxy", "https://uatapp.applyyourself.com/?id=ayauto");
////			    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, getbrowser(), getenvironment());
//		            selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, getbrowser(), "https://arqa.applyyourself.com/");		    	
//			    	selenium.start();
//			    	selenium.windowMaximize();
////			    	selenium.setSpeed("1000");
//			        selenium.setTimeout(STANDARD_PAGE_LOAD_WAIT_TIME);
//			        System.out.println("classpath=" + System.getProperty("java.class.path")); 
////			        selenium.windowFocus();
////			        System.out.println("File Name "+testName);	
//			        String outlocation =  context.getOutputDirectory();
//					String[] outfilename = outlocation.split("\\\\");
////					Reporter.log("Output driretory"+outfilename);
//					String testName = outfilename[outfilename.length-2];
////					String testName = "AccountCreation";		       
////					System.out.println("File Name "+testName);
////					testData = readCSVFile("csv/"+testName+".csv");
////					testData = readCSVFile("\\\\Intranet\\Teams\\WebProducts\\QA\\AutomationFramework\\csv\\"+testName+".csv");						
//					String outlocadrive = outlocation.substring(0,outlocation.lastIndexOf("\\"));
//					String outlocarepo = outlocation.substring(0,outlocadrive.lastIndexOf("\\"));
//					String autoframework = outlocation.substring(0,outlocarepo.lastIndexOf("\\"));				
////					System.out.println("Project Folder name File Name "+autoframework);
//					testData = readCSVFile(autoframework+"\\csv\\"+testName+".csv");
//		           
//		        } catch(Exception e) {
//			
//		        }
//		        
//		    }
	    
		public enum testbrowser{
			internetexplorer,firefox,safari,googlechrome	
			
		}
	    
	    @BeforeSuite
	   	public void startseleniumserver(ITestContext context) throws Exception {
	    	System.out.println("Start: ");
			Reporter.log("Proceed to Get Browser Name from Excel Sheet(C:/Selenium/InputTestdata.xls)");
//			try {
//				jettyProxy = new SeleniumServer();
//				jettyProxy.start();
//			} catch (Exception e) {
//				System.out.println("Selenium Server is Running and need to Stop"+e.getLocalizedMessage());
//			}
			try {
				
			
			browser = Runtimedataread("Browser").toLowerCase().trim();
//			String browsername = null;
			switch(browser){
			case "internetexplorer":
				File file = new File("C:/Selenium/IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				
//				InternetExplorerDriverService.Builder ies = new InternetExplorerDriverService.Builder();
//				ies.usingAnyFreePort().withLogFile(new File("somefile.log")).withLogLevel(InternetExplorerDriverLogLevel.INFO);
//				InternetExplorerDriverService service = ies.build();
//				driver = new InternetExplorerDriver(service);	
				//DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer(); 
			    //ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				//driver = new InternetExplorerDriver(ieCapabilities);
				driver = new InternetExplorerDriver();
				break;
			case "firefox":		
//				File file = new File("C:\\FF");
//				FirefoxProfile profile = new FirefoxProfile(file);
//				driver= new FirefoxDriver(profile);
				File profileDir = new File("C:\\FF");
				FirefoxProfile profile = new FirefoxProfile(profileDir);
				driver = new FirefoxDriver(profile);
				break;
			case "googlechrome":
				System.setProperty("webdriver.chrome.driver", "C:/Selenium/chromedriver.exe");
				driver = new ChromeDriver();
				break;
			case "safari":
				driver = new SafariDriver();
				break;
			default:
				writeFailure("Invalid Browser Name("+browser+")");				
			}
			selenium  = new WebDriverBackedSelenium(driver, "https://uatwebcenter.applyyourself.com/");
			driver.manage().window().maximize();
//			System.out.println("classpath=" + System.getProperty("java.class.path")); 
//	        selenium.windowFocus();
//	        System.out.println("File Name "+testName);	
	        String outlocation =  context.getOutputDirectory();
			String[] outfilename = outlocation.split("\\\\");
//			Reporter.log("Output driretory"+outfilename);
			String testName = outfilename[outfilename.length-2];
//			String testName = "AccountCreation";		       
//			System.out.println("File Name "+testName);
//			testData = readCSVFile("csv/"+testName+".csv");
//			testData = readCSVFile("\\\\Intranet\\Teams\\WebProducts\\QA\\AutomationFramework\\csv\\"+testName+".csv");						
			String outlocadrive = outlocation.substring(0,outlocation.lastIndexOf("\\"));
			String outlocarepo = outlocation.substring(0,outlocadrive.lastIndexOf("\\"));
			String autoframework = outlocation.substring(0,outlocarepo.lastIndexOf("\\"));				
//			System.out.println("Project Folder name File Name "+autoframework);
			testData = readCSVFile(autoframework+"\\csv\\"+testName+".csv");	
			} catch (Exception e) {
			System.out.println("Error Message - Start: "+e.getLocalizedMessage());
			}
	    }


		public String getbrowser() throws Exception{
			Reporter.log("Proceed to Get Browser Name from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String browser = Runtimedataread("Browser");
			String browsername = null;
			switch(testbrowser.valueOf(browser.toLowerCase().trim())){			
			case internetexplorer:
//				browsername ="*iexploreproxy";
				browsername ="*iexplore";
				break;
			case firefox:				
				browsername ="*firefox";
				break;
			case googlechrome:
				browsername ="*googlechrome";
				break;
			case safari:
				browsername ="*safariproxy";
				break;
			default:
				writeFailure("Invalid Browser Name("+browser+")");				
			}
			Reporter.log("Launch the Browser as :"+browsername);
			System.out.println("Launch the Browser as :"+browsername);
			return browsername;
		}
		
//		public String getenvironment() throws Exception{
////			Reporter.log("Proceed to Get Environment or Instance  from Excel Sheet(C:/Selenium/InputTestdata.xls)");
//			String env = Runtimedataread("Instance");
//			String envname = null;
//			if (env.contains("US")) {
//				envname = "https://arqa.applyyourself.com/";
////				envname = "https://login.live.com/login.srf?wa=wsignin1.0&rpsnv=11&ct=1312790651&rver=6.1.6206.0&wp=MBI&wreply=http:%2F%2Fmail.live.com%2Fdefault.aspx&lc=1033&id=64855&mkt=en-us&cbcxt=mai&snsc=1";
//			} else if (env.contains("UK")) {
//				envname = "https://arqa.applyyourself.co.uk/";
//			} 			
//			return envname;
//			
//		}
		
		
	    
	    protected void startJettyProxy() throws Exception {  
////	        String BrowserValue = CommonReuseable4Testing.TestBrowser();
//	    	RemoteControlConfiguration remoteconfig = new RemoteControlConfiguration(); 
////			remoteconfig.setPort(SELENIUM_SERVER_PORT); 
////	    	remoteconfig.setEnsureCleanSession(true); 
////	    	remoteconfig.setTrustAllSSLCertificates(false);
////	    	remoteconfig.trustAllSSLCertificates();
////	    	remoteconfig.getSslCertificateGenerator();
//	        if ((BrowserValue.equalsIgnoreCase("Firefox"))) { 
////	        File ffprofile = new File("C:/AY/FirefoxProfile");	
//	        	remoteconfig.setFirefoxProfileTemplate(new File("C:\\AY\\Firefoxprofile")); 
//			}      
//	        if ((BrowserValue.equalsIgnoreCase("Googlechrome"))) { 
//
//	        }if ((BrowserValue.equalsIgnoreCase("Safari"))) { 
//	        	remoteconfig.setTrustAllSSLCertificates(true);
//	  		}   
//	        jettyProxy = new SeleniumServer(false,remoteconfig); 	
//			File file = new File("C:/IEDriver/IEDriverServer.exe");
//			System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	    	
	    	jettyProxy = new SeleniumServer();
	    	jettyProxy.start();  
				

	    }

//	    @AfterSuite(alwaysRun = true)
//	    public void stopJettyProxy() {
//	        if(jettyProxyWasStartedByATest) {
//	 		   selenium.close();
//			   selenium.stop();    
//	           jettyProxy.stop();
//	        }
//	    }
	    
	  // original  
//		public static synchronized ArrayList readCSVFile(String sFileName) throws IOException, InterruptedException {
////			public ArrayList readCSVFile() throws IOException, InterruptedException {
//			 ArrayList<String[]> mdData = new ArrayList();
//				String sCurLine;
//
//				//A FileInputStream obtains input bytes from a file in a file system
//				FileInputStream fFileStream = new FileInputStream(sFileName);
//				FileReader fr;
//			      fr = new FileReader (new File(sFileName));
//			      BufferedReader br = new BufferedReader (fr);
//			while ((sCurLine = br.readLine()) != null) {
//				String[] splitData = sCurLine.split(",",-1);
////				String[] splitData = sCurLine.split(",");
//				mdData.add(splitData);
//			} //End of while loop
//			return mdData;
//			}
		
		public static synchronized ArrayList readCSVFile(String sFileName) throws IOException, InterruptedException {
//			public ArrayList readCSVFile() throws IOException, InterruptedException {
			 ArrayList<String[]> mdData = new ArrayList();
				String sCurLine;

				//A FileInputStream obtains input bytes from a file in a file system
				FileInputStream fFileStream = new FileInputStream(sFileName);
				FileReader fr;
			      fr = new FileReader (new File(sFileName));
			      BufferedReader br = new BufferedReader (fr);
			      System.out.println("");
			while ((sCurLine = br.readLine()) != null) {
				
				// Below logic is used, if  QC Test data has comma space', ' and comma next line ',;' will be replaced with string(commaspace & commasemicolon) then split the test data.
//				After splitting again test data with string(commaspace & commasemicolon) has been replaced back to comma space', ' and comma next line ',;'
				
				if (sCurLine.contains(", ")) {
					sCurLine = sCurLine.replace(", ", "commaspace");
				}
				if (sCurLine.contains(",;")) {
					sCurLine = sCurLine.replace(",;", "commasemicolon");
				}
				/*if (sCurLine.contains(".ServerHostName + ' ','")) {
					// Let us consider that the 'CSV line' is as follows:
			    	  // Text =Merge Values ("Assoc Deg,Bach Deg")Phone=null
					  // In order to mask the 'Comma' between 'Assoc Deg' and 'Bach Deg', we are 
		    		  // doing the following:
			    	  // 1. Splitting the line by '=Merge Values (", which would cause the second array element to 
			    	  //    be as follows:
			    	  //    "Assoc Deg,Bach Deg")Phone=null
			    	  // 2. Splitting the above part by ')', which would cause the first array element to
			    	  //    be as follows:
			    	  //    "Assoc Deg,Bach Deg"
			    	  // 3. Replacing each 'Comma' in the above line by the phrase 'Comma::Not::Followed::By::Space'
			    	  String [] currentLineArray = sCurLine.split("SELECT 'AY_EpaymentVendor'"); // '\\' is used as escape character
			    	  System.out.println("First Line:" +currentLineArray[0]);
			    	  System.out.println("Second Line:" +currentLineArray[1]);
			    	  // currentLineArray[0] = Text 
			    	  // currentLineArray[1] = "Assoc Deg,Bach Deg")Phone=null
			    	  String portionContainingCommaInValue = currentLineArray[1];
			    	  System.out.println("Third Line:" +portionContainingCommaInValue);
			    	  // portionContainingCommaInValue = "Assoc Deg,Bach Deg")Phone=null
			    	  String [] commaInValueArray = portionContainingCommaInValue.split("\\) Is Null\\)\\)");
			    	  System.out.println("Forth Line:" +commaInValueArray[0]);
//			    	  System.out.println("Fifth Line:" +commaInValueArray[1]);
			    	  // commaInValueArray[0] = "Assoc Deg,Bach Deg"
			    	  // commaInValueArray[1] = Phone=null
			    	  String sqlQueryText = commaInValueArray[0]; //
			    	  System.out.println("Sixth Line:" +sqlQueryText);
			    	  // sqlQueryText = "Assoc Deg,Bach Deg"
					  String sqlQueryText1 = sqlQueryText.replace(",","Comma::Not::Followed::By::Space");
					  System.out.println("Seventh Line:" +sqlQueryText1);
					  // sqlQueryText =  "Assoc DegComma::Not::Followed::By::SpaceBach Deg"
					  sCurLine = currentLineArray[0] + "SELECT 'AY_EpaymentVendor'" + sqlQueryText1 + "\\) Is Null\\)\\)" + commaInValueArray[0];
					  System.out.println("Egith Line:" +sCurLine);
					  // currentLineArray[0] = Text 
					  // sqlQueryText =  "Assoc DegComma::Not::Followed::By::SpaceBach Deg"
					  // commaInValueArray[1] = Phone=null
					  // sCurLine = Text =Merge Values (Assoc DegComma::Not::Followed::By::SpaceBach Deg")Phone=null
		    	  }*/
//				}
				String[] splitData = sCurLine.split(",",-1);
				
				for (int i = 0; i < splitData.length; i++) {					
					if (splitData[i].contains("commaspace")) {
						splitData[i] = splitData[i].replace("commaspace",", ");
					}
					if (splitData[i].contains("commasemicolon")) {
						splitData[i] = splitData[i].replace("commasemicolon",",;");
					}
					/*if (splitData[i].contains("Comma::Not::Followed::By::Space")) {
						splitData[i] = splitData[i].replace("Comma::Not::Followed::By::Space",",");
					}*/
				}			
//				String[] splitData = sCurLine.split(",");
				mdData.add(splitData);
			} //End of while loop
			return mdData;
			}

	    
	    
		@BeforeMethod(alwaysRun=true)
		public void datagenerator() throws IOException, InterruptedException {
			String[] data = (String[]) testData.get(golbalProcedureOrder);
//			for (int i = 0; i < data.length; i++) {
//				System.out.println(""+data[i]);
//			}			
			golbalProcedureOrder++;	
		  ArrayList <String> datacollector = new ArrayList<String>();
			for (int i = 2; i < data.length; i=i+2) {
				datacollector.add(data[i]);				
			}
			ArrayList <String> parameternamecollector = new ArrayList<String>();
			for (int k = 1; k < data.length; k=k+2) {
				parameternamecollector.add(data[k]);
			}
			procedurename = data[0];
			datacontainer = new String[datacollector.size()]; // this Array is ued to collect Test Data From CSV
			datacollector.toArray(datacontainer);
			parameternames = new String[parameternamecollector.size()]; // this Array is ued to collect Parameter Name From CSV
			parameternamecollector.toArray(parameternames);	
//			System.out.println("Array lenth"+datacontainer.length);
			
//			return datacontainer;	
		}
	    

	    @AfterMethod(alwaysRun=true)
	    public void failurescreenshot(ITestResult result,ITestContext context) throws Exception {
	    	String status = "Pass";
	    	String classname = result.getTestClass().getName();
	    	String procedurename = result.getMethod().getMethodName();
	    	int exeprocedurestatus = result.getStatus();
	    	if (exeprocedurestatus == 2) {
				status ="Fail";
			}else if (exeprocedurestatus == 3) {
				status ="Skip";
			} 
	    	
	    	procedureclass.add(classname);
	    	executeprocedurename.add(procedurename);
	    	procedureorder.add(String.valueOf(golbalProcedureOrder));
	    	procedurestatus.add(status); 
	    	
	    	
	    	if (!result.isSuccess()) {
	    		Reporter.setCurrentTestResult(result);	
	    		String output = context.getOutputDirectory();
//				String outputfolder = file.getAbsolutePath()+outfilename[outfilename.length-3]+"/"+outfilename[outfilename.length-2];
				String outputfolder = output.substring(0,output.lastIndexOf("\\"))+"\\Failurescreenshot\\";					
	    		Reporter.log("Failure Screenshot saved at "+outputfolder+result.getName()+"_"+golbalProcedureOrder+".PNG");    		
////	    		selenium.windowFocus();
//	    		selenium.captureScreenshot(outputfolder+result.getName()+"_"+golbalProcedureOrder+".PNG");
////	    		selenium.captureEntirePageScreenshot(outputfolder+result.getName()+".PNG","background=#CCFFDD");	
////	    		Thread.sleep(1000);
//	    		try {
//	    			selenium.captureEntirePageScreenshot(outputfolder+result.getName()+"_"+golbalProcedureOrder+".PNG","background=#CCFFDD");	
//				} catch (Exception e) {
//					
//				}	 
//	    		WebDriver augmentedDriver = new Augmenter().augment(driver);
//		    	File screenshot = ((TakesScreenshot)augmentedDriver).getScreenshotAs(OutputType.FILE);	    		
//				FileUtils.copyFile(screenshot, new File(outputfolder+result.getName()+"_"+golbalProcedureOrder+".PNG"));
	    		
	    		File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	    		
				FileUtils.copyFile(screenshot, new File(outputfolder+result.getName()+"_"+golbalProcedureOrder+".PNG"));
	    		
	            Reporter.log("<a href='file:///"+outputfolder+result.getName()+"_"+golbalProcedureOrder+".PNG'><img src='file:///"+outputfolder+result.getName()+"_"+golbalProcedureOrder+".PNG' height='200' width='200'></a>");
	    		Reporter.setCurrentTestResult(null);
	    	}
	    	backtodetails();
	    }
	    
	    
	    
	    

	    @AfterSuite(alwaysRun=true)
	    public void shutdownseleniumserver(ITestContext result) throws Exception {
	    	driver.close();
	    	selenium.stop(); 
	    	driver.quit();
//	    	jettyProxy.stop();
	    	
//		        if(jettyProxyWasStartedByATest) {
//				   selenium.close();
//				   selenium.stop();    
//				   jettyProxy.stop();			   
//			    }
		        
	    	    String Status = null;
	    	    String Resultoutput =  result.getOutputDirectory();
	    	    String ReportLocation = Resultoutput.substring(0,Resultoutput.lastIndexOf("\\"))+"\\customized-report.html";
//	    	    String ReportLocation = Resultoutput+"\\reporter-output.html";
	    	    String Testname = result.getName();
	    	    Summarydetails.add(Testname); // adding to array to use customize report
	    	    Summarydetails.add(String.valueOf(result.getPassedTests().size()+result.getFailedTests().size()+result.getSkippedTests().size())); // adding to array to use customize report
	    	    int Pass = result.getPassedTests().size();
//	    	    String aa = String.valueOf(i)
	    	    Summarydetails.add(String.valueOf(Pass)); // adding to array to use customize report
	    	    int Fail = result.getFailedTests().size();
	    	    Summarydetails.add(String.valueOf(Fail)); // adding to array to use customize report
	    		int Skip = result.getSkippedTests().size();
	    		  Summarydetails.add(String.valueOf(Skip)); // adding to array to use customize report
//	    		int totalprocedure = Pass+Fail+Skip;
//	    		  Summarydetails.add(Testname); // adding to array to use customize report
	    		int Failconfig =  result.getFailedConfigurations().size();
	    		int Skipconfig =  result.getSkippedConfigurations().size();
//	    		System.out.println("Fail Testcase"+fail);
//	    		System.out.println("Skip Testcase"+Skip);
//	    		System.out.println("Pass Testcase"+Pass);
//	    		if (fail ==0 && Skip == 0 && Pass ==0) {
//					Status = "Failed";
//					System.out.println("Fail");	
//				}else if (fail ==0 && Skip == 0) {
//	    			Status = "Pass";
//	    			System.out.println("Pass");	    			
//				}else if (fail!= 0 || Skip != 0) {
//					Status = "Failed";
//					System.out.println("Fail");					
//				}
	    		
	    		if (Fail ==0 && Skip == 0 && Failconfig == 0 && Skipconfig == 0 ) {
	    			Status = "Pass";
	    			System.out.println("Test Passed");	    	
				} else {
					Status = "Failed";
					System.out.println("Test Failed");	
				}
	    		String[] outfilename = Resultoutput.split("\\\\");
				String csvfile = outfilename[outfilename.length-2];	  
				System.out.println("CSV File Name Write :"+csvfile);
//				String csvfile = "AccountCreation";	
				
				
//				=======================  Below code is used take total Time for Execution to be used customize report
				
				long time_start = Long.MAX_VALUE;
				long time_end = Long.MIN_VALUE;
				NumberFormat formatter = new DecimalFormat("#,##0.0");
		        time_start = Math.min(result.getStartDate().getTime(), time_start);
		        time_end = Math.max(result.getEndDate().getTime(), time_end);
		        String total = formatter.format((result.getEndDate().getTime() - result.getStartDate().getTime()) / 1000.)+ " seconds";
		        Summarydetails.add(String.valueOf(total)); // adding to array to use customize report
		
				
//				=======================  Below is used store 'Procedure Class','Procedure Name','Execution Oder','Procedure Status'
				classcontainer = new String[procedureclass.size()];
				procedureclass.toArray(classcontainer);
				procedurecontainer = new String[executeprocedurename.size()];
				executeprocedurename.toArray(procedurecontainer);
				ordercontainer = new String[procedureorder.size()];
				procedureorder.toArray(ordercontainer);
				statuscontainer = new String[procedurestatus.size()];
				procedurestatus.toArray(statuscontainer);				
				
				try {
//		    		BufferedWriter reportWrite  = new BufferedWriter(new FileWriter("csv/"+csvfile+".csv", true));
				
					String outlocadrive = Resultoutput.substring(0,Resultoutput.lastIndexOf("\\"));
					String outlocarepo = Resultoutput.substring(0,outlocadrive.lastIndexOf("\\"));
					String autoframework = Resultoutput.substring(0,outlocarepo.lastIndexOf("\\"));	
					BufferedWriter reportWrite  = new BufferedWriter(new FileWriter(autoframework+"\\csv\\"+csvfile+".csv", true));
					reportWrite.newLine();
		    		reportWrite.write("RUN_STATUS");
		    		reportWrite.write(",");
		    		reportWrite.write(Status+"\n");
		    		reportWrite.write("RUN_REPORT");
		    		reportWrite.write(",");
		    		reportWrite.write(ReportLocation);
		    		reportWrite.close();
				} catch (Exception e) {
					System.out.println("Writing CSV Write Exeception :"+ e.getMessage());
				}
	    }
}
