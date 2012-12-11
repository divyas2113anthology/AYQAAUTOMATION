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
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.hamcrest.text.pattern.Parse;
import org.openqa.selenium.server.RemoteControlConfiguration;
import org.openqa.selenium.server.SeleniumServer;
import org.testng.Assert;
import org.testng.IMethodInstance;
import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.*;
import com.thoughtworks.selenium.BrowserConfigurationOptions;
import com.thoughtworks.selenium.DefaultSelenium;
import static processor.CommonSeleniumActions.Runtimedataread;
import static processor.CommonSeleniumActions.backtodetails;
import static processor.CommonSeleniumActions.writeFailure;;

public class Processor {
 //	    protected SeleniumServer jettyProxy;
	 	public static SeleniumServer jettyProxy;
	    protected boolean jettyProxyWasStartedByATest = false;
	    protected final static String SELENIUM_SERVER_HOST = "localhost";
	    protected final static int SELENIUM_SERVER_PORT = 4444;
	    public static final String STANDARD_PAGE_LOAD_WAIT_TIME = "120000"; //milliseconds
	    public static DefaultSelenium selenium;
	    public static int golbalProcedureOrder=0;	    // Counter of Order and data Provider
	    public static ArrayList testData;
	    public static String[] datacontainer; // Contains all Parameter Value
	    public static String[] parameternames; // Contains all Parameter Name
	    public static String procedurename;// colecting all procedure 
	    public static ArrayList<String> procedureclass = new ArrayList<String>(); // adding Class in each Procedure Execution
    	public static ArrayList<String> executeprocedurename = new ArrayList<String>();// adding Procedure in each Procedure Execution
    	public static ArrayList<String> procedureorder = new ArrayList<String>(); // adding Order in each Procedure Execution
    	public static ArrayList<String> procedurestatus = new ArrayList<String>(); // adding Status in each Procedure Execution
	    public static String[] classcontainer; // Contains all class
	    public static String[] procedurecontainer; // Contains all Procedure Name
	    public static String[] ordercontainer; // Contains all Procedure Order
	    public static String[] statuscontainer; // Contains all Procedure Status
	    public static ArrayList<String> Summarydetails = new ArrayList<String>();	  // Contains Test Name,Total TC,Pass Count,Fail Count,Skip Count and Total Execution Time 

		
//		@Parameters({"csvfile"})
	    @BeforeSuite(alwaysRun = true)
//	    public void makeSureWeHaveAJettyProxyRunning(String testName,ITestContext context) throws Exception {
	   	public void startseleniumserver(ITestContext context) throws Exception {
//	    public void makeSureWeHaveAJettyProxyRunning() throws Exception {
	        Socket socket = null;
	        try {
	        	System.out.println("----- SELENIUM SERVER STARTED -------");
	            socket = new Socket(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT);
	           
	        } catch(Exception e) {
	            startJettyProxy();
	            jettyProxyWasStartedByATest = true;    
//		    	BrowserConfigurationOptions browserconfig = new BrowserConfigurationOptions();
//		    	String BrowName = CommonReuseable4Testing.TestBrowser();
//		    	if (BrowName.equalsIgnoreCase("Googlechrome")||BrowName.equalsIgnoreCase("Safari")) {
//		    		selenium.start(browserconfig.setCommandLineFlags("--disable-web-security"));
//				} else {
//			    	selenium.start();
//				}
//		    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, "*iexplore", "https://uatapp.applyyourself.com/?id=ayauto");
//		    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, "*iexploreproxy", "https://uatapp.applyyourself.com/?id=ayauto");
		    	selenium = new DefaultSelenium(SELENIUM_SERVER_HOST, SELENIUM_SERVER_PORT, getbrowser(), getenvironment());		    	
		    	selenium.start();
		    	selenium.windowMaximize();
//		    	selenium.setSpeed("1000");
		        selenium.setTimeout(STANDARD_PAGE_LOAD_WAIT_TIME);
//		        selenium.windowFocus();
//		        System.out.println("File Name "+testName);	
		        String outlocation =  context.getOutputDirectory();
				String[] outfilename = outlocation.split("\\\\");
//				Reporter.log("Output driretory"+outfilename);
				String testName = outfilename[outfilename.length-2];
//				String testName = "AccountCreation";		       
//				System.out.println("File Name "+testName);
//				testData = readCSVFile("csv/"+testName+".csv");
//				testData = readCSVFile("\\\\Intranet\\Teams\\WebProducts\\QA\\AutomationFramework\\csv\\"+testName+".csv");						
				String outlocadrive = outlocation.substring(0,outlocation.lastIndexOf("\\"));
				String outlocarepo = outlocation.substring(0,outlocadrive.lastIndexOf("\\"));
				String autoframework = outlocation.substring(0,outlocarepo.lastIndexOf("\\"));				
//				System.out.println("Project Folder name File Name "+autoframework);
				testData = readCSVFile(autoframework+"\\csv\\"+testName+".csv");				
	        }
	        finally {
	            if (socket != null) {
	                socket.close();
	            }
	        }
	    }

		public enum testbrowser{
			internetexplorer,firefox,safari,googlechrome			
		}
		public String getbrowser() throws Exception{
			Reporter.log("Proceed to Get Browser Name from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String browser = Runtimedataread("Browser");
			String browsername = null;
			switch(testbrowser.valueOf(browser.toLowerCase().trim())){			
			case internetexplorer:
				browsername ="*iexploreproxy";
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
			return browsername;
			
		}
		public String getenvironment() throws Exception{
//			Reporter.log("Proceed to Get Environment or Instance  from Excel Sheet(C:/Selenium/InputTestdata.xls)");
			String env = Runtimedataread("Instance");
			String envname = null;
			if (env.contains("US")) {
				envname = "https://uatapp.applyyourself.com/?id=ayauto";
			} else if (env.contains("UK")) {
				envname = "https://uatapp.hobsons.co.uk/?id=ayauto";
			} 			
			return envname;
			
		}
		
		
	    
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
	    
	    
		public static synchronized ArrayList readCSVFile(String sFileName) throws IOException, InterruptedException {
//			public ArrayList readCSVFile() throws IOException, InterruptedException {
			 ArrayList<String[]> mdData = new ArrayList();
				String sCurLine;

				//A FileInputStream obtains input bytes from a file in a file system
				FileInputStream fFileStream = new FileInputStream(sFileName);
				FileReader fr;
			      fr = new FileReader (new File(sFileName));
			      BufferedReader br = new BufferedReader (fr);
			while ((sCurLine = br.readLine()) != null) {
				String[] splitData = sCurLine.split(",",-1);
//				String[] splitData = sCurLine.split(",");
				mdData.add(splitData);
			} //End of while loop
			return mdData;
			}

	    
	    
//		@BeforeMethod(alwaysRun=true)
//		public String[] datagenerator() throws IOException, InterruptedException {
//			String[] data = (String[]) testData.get(j);
////			for (int i = 0; i < data.length; i++) {
////				System.out.println(""+data[i]);
////			}			
//			j++;	
//		  ArrayList <String> datacollector = new ArrayList<String>();
//			for (int i = 2; i < data.length; i=i+2) {
//				datacollector.add(data[i]);				
//			}
//			datacontainer = new String[datacollector.size()];
//			datacollector.toArray(datacontainer);
////			System.out.println("Array lenth"+datacontainer.length);
//			return datacontainer;	
//		}
		
		@BeforeMethod(alwaysRun=true)
//		public String[] datagenerator() throws IOException, InterruptedException {
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
			
//			ArrayList <String> Procedurecollector = new ArrayList<String>();
//			Procedurecollector.add(data[0]);
			procedurename = data[0];
		
			datacontainer = new String[datacollector.size()];
			datacollector.toArray(datacontainer);
//			System.out.println("Array lenth"+datacontainer.length);			
			parameternames = new String[parameternamecollector.size()];
			parameternamecollector.toArray(parameternames);	
//			allprocedurename = new String[Procedurecollector.size()];
//			Procedurecollector.toArray(allprocedurename);	
	
		}
	    
	    

//	    @AfterMethod(alwaysRun=true)
//	    public void failurescreenshot(ITestResult result,ITestContext context) throws Exception {    	
//	    	
//	    	
//	    	if (!result.isSuccess()) {
//	    		Reporter.setCurrentTestResult(result);	
//	    		String output = context.getOutputDirectory();
////				String outputfolder = file.getAbsolutePath()+outfilename[outfilename.length-3]+"/"+outfilename[outfilename.length-2];
//				String outputfolder = output.substring(0,output.lastIndexOf("\\"))+"\\Failurescreenshot\\";					
//	    		Reporter.log("Failure Screenshot saved at - "+outputfolder+result.getName()+".PNG");    		
////	    		selenium.windowFocus();
//	    		selenium.captureScreenshot(outputfolder+result.getName()+".PNG");
////	    		selenium.captureEntirePageScreenshot(outputfolder+result.getName()+".PNG","background=#CCFFDD");	
////	    		Thread.sleep(1000);
//	    		try {
//	    			selenium.captureEntirePageScreenshot(outputfolder+result.getName()+".PNG","background=#CCFFDD");	
//				} catch (Exception e) {
//					
//				}
////	    		Reporter.log("<a href='file:///"+outputfolder+result.getName()+".PNG'>");
//	            Reporter.log("<a href='file:///"+outputfolder+result.getName()+".PNG'><img src='file:///"+outputfolder+result.getName()+".PNG' height='200' width='200'></a>");
//	    		Reporter.setCurrentTestResult(null);
////	    		Reporter.log("##########End of Execution Order ["+j+"]##########");
//	    	}
//	    	
//	    }
	    
	    
	    @AfterMethod(alwaysRun=true)
	    public void failurescreenshot(ITestResult result,ITestContext context) throws Exception {
//	    	ArrayList<String> procedureclass = new ArrayList<String>();
//	    	ArrayList<String> executeprocedurename = new ArrayList<String>();
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
	    		Reporter.log("Failure Screenshot saved at - "+outputfolder+result.getName()+".PNG");    		
//	    		selenium.windowFocus();
	    		selenium.captureScreenshot(outputfolder+result.getName()+".PNG");
//	    		selenium.captureEntirePageScreenshot(outputfolder+result.getName()+".PNG","background=#CCFFDD");	
//	    		Thread.sleep(1000);
	    		try {
	    			selenium.captureEntirePageScreenshot(outputfolder+result.getName()+".PNG","background=#CCFFDD");	
				} catch (Exception e) {
					
				}
//	    		Reporter.log("<a href='file:///"+outputfolder+result.getName()+".PNG'>");
	            Reporter.log("<a href='file:///"+outputfolder+result.getName()+".PNG'><img src='file:///"+outputfolder+result.getName()+".PNG' height='200' width='200'></a>");
	    		Reporter.setCurrentTestResult(null);
//	    		Reporter.log("##########End of Execution Order ["+j+"]##########");
	    	}
	    	backtodetails();
	    	
	    }
	    
	    
	    

//	    @AfterSuite(alwaysRun=true)
//	    public void shutdownseleniumserver(ITestContext result) throws Exception {
//		        if(jettyProxyWasStartedByATest) {
//				   selenium.close();
//				   selenium.stop();    
//				   jettyProxy.stop();			   
//			    }
//		        
//	    	    String Status = null;
//	    	    String Resultoutput =  result.getOutputDirectory();
////	    		String ReportLocation = Resultoutput.substring(0,Resultoutput.lastIndexOf("\\"))+"\\customized-report.html";
////	    	    String ReportLocation = Resultoutput.substring(0,Resultoutput.lastIndexOf("\\"))+"\\emailable-report.html";
//	    	    String ReportLocation = Resultoutput+"\\reporter-output.html";
//	    	    int Pass = result.getPassedTests().size();
//	    	    int Fail = result.getFailedTests().size();
//	    		int Skip = result.getSkippedTests().size();
//	    		int Failconfig =  result.getFailedConfigurations().size();
//	    		int Skipconfig =  result.getSkippedConfigurations().size();
////	    		System.out.println("Fail Testcase"+fail);
////	    		System.out.println("Skip Testcase"+Skip);
////	    		System.out.println("Pass Testcase"+Pass);
////	    		if (fail ==0 && Skip == 0 && Pass ==0) {
////					Status = "Failed";
////					System.out.println("Fail");	
////				}else if (fail ==0 && Skip == 0) {
////	    			Status = "Pass";
////	    			System.out.println("Pass");	    			
////				}else if (fail!= 0 || Skip != 0) {
////					Status = "Failed";
////					System.out.println("Fail");					
////				}
//	    		
//	    		if (Fail ==0 && Skip == 0 && Failconfig == 0 && Skipconfig == 0 ) {
//	    			Status = "Pass";
//	    			System.out.println("Pass");	    	
//				} else {
//					Status = "Failed";
//					System.out.println("Fail");	
//				}
//	    		String[] outfilename = Resultoutput.split("\\\\");
//				String csvfile = outfilename[outfilename.length-2];	  
//				System.out.println("CSV File Name Write :"+csvfile);
////				String csvfile = "AccountCreation";	
//				try {
////		    		BufferedWriter reportWrite  = new BufferedWriter(new FileWriter("csv/"+csvfile+".csv", true));
//				
//					String outlocadrive = Resultoutput.substring(0,Resultoutput.lastIndexOf("\\"));
//					String outlocarepo = Resultoutput.substring(0,outlocadrive.lastIndexOf("\\"));
//					String autoframework = Resultoutput.substring(0,outlocarepo.lastIndexOf("\\"));	
//					BufferedWriter reportWrite  = new BufferedWriter(new FileWriter(autoframework+"\\csv\\"+csvfile+".csv", true));
//					reportWrite.newLine();
//		    		reportWrite.write("RUN_STATUS");
//		    		reportWrite.write(",");
//		    		reportWrite.write(Status+"\n");
//		    		reportWrite.write("RUN_REPORT");
//		    		reportWrite.write(",");
//		    		reportWrite.write(ReportLocation);
//		    		reportWrite.close();
//				} catch (Exception e) {
//					System.out.println("Writing CSV Write Exeception :"+ e.getMessage());
//				}
//  		
//
//	    }
	    @AfterSuite(alwaysRun=true)
	    public void shutdownseleniumserver(ITestContext result) throws Exception {
		        if(jettyProxyWasStartedByATest) {
				   selenium.close();
				   selenium.stop();    
				   jettyProxy.stop();			   
			    }
		        
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
	    		if (Fail ==0 && Skip == 0 && Failconfig == 0 && Skipconfig == 0 ) {
	    			Status = "Pass";
//	    			System.out.println("Pass");	    	
				} else {
					Status = "Failed";
//					System.out.println("Fail");	
				}
	    		String[] outfilename = Resultoutput.split("\\\\");
				String csvfile = outfilename[outfilename.length-2];	  
//				System.out.println("CSV File Name Write :"+csvfile);
				
				
//			==========================
//				int resultname1 = resultname.getStatus();
				
//				ITestNGMethod[] totaltestmathod = result.getAllTestMethods();
//				
//				
//				for (int i = 0; i < totaltestmathod.length; i++) {
////					resultname.get
//					Reporter.log("Method Order :"+totaltestmathod[i].getMethodName());
//				}
				
//				======================= Genarting Summary Rport
				
				long time_start = Long.MAX_VALUE;
				long time_end = Long.MIN_VALUE;
				NumberFormat formatter = new DecimalFormat("#,##0.0");
		        time_start = Math.min(result.getStartDate().getTime(), time_start);
		        time_end = Math.max(result.getEndDate().getTime(), time_end);
		        String total = formatter.format((result.getEndDate().getTime() - result.getStartDate().getTime()) / 1000.)+ " seconds";
		        Summarydetails.add(String.valueOf(total)); // adding to array to use customize report
//		        Reporter.log("<tr><td><b><font size='6' color='Brown'>Summary Report</font></b></td>");
//				Reporter.log("<table border=\"4\"cellspacing=\"0\"");				
//				Reporter.log("<tr><td><b><font size='4' color='Black'>Test</font></b></td><td><b><font size='4' color='Black'>Total Procedure</font></b></td><td><b><font size='4' color='Black'>Procedure Passed</font></b></td><td><b><font size='4' color='Black'>Procedure Failed</font></b></td><td><b><font size='4' color='Black'>Procedure Skipped</font></b></td><td><b><font size='4' color='Black'>Total Time</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
//				Reporter.log("<tr><td><b><font size='4' color='Black'>"+Testname+"</font></b></td><td><b><font size='4' color='Black'>"+totalprocedure+"</font></b></td><td bgcolor=\"Green\"><b><font size='4' color='Black'>"+Pass+"</font></b></td><td  bgcolor=\"Red\"><b><font size='4' color='Black'>"+Fail+"</font></b></td><td><b><font size='4' color='Black'>"+Skip+"</font></b></td><td><b><font size='4' color='Black'>"+total+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
//				Reporter.log("</table>");
				
				
//				======================= Genarting Detailed Rport
				classcontainer = new String[procedureclass.size()];
				procedureclass.toArray(classcontainer);
				procedurecontainer = new String[executeprocedurename.size()];
				executeprocedurename.toArray(procedurecontainer);
				ordercontainer = new String[procedureorder.size()];
				procedureorder.toArray(ordercontainer);
				statuscontainer = new String[procedurestatus.size()];
				procedurestatus.toArray(statuscontainer);				
//				Reporter.log("<tr><td><b><font size='6' color='Brown'>Detailed Report</font></b></td></tr>");
//				Reporter.log("<a id=\"Detail\">");
//				Reporter.log("<table border=\"4\" cellspacing=\"0\"");	
//				Reporter.log("<tr bgcolor=\"Green\"><td><b><font size='4' color='Black'>Procedure Class</font></b></td><td><b><font size='4' color='Black'>Procedure Name</font></b></td><td><b><font size='4' color='Black'>Procedure Order</font></b></td><td><b><font size='4' color='Black'>Procedure Status</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
//				for (int i = 0; i < procedurecontainer.length; i++) {					
//					if (statuscontainer[i].equals("Pass")) {
//						Reporter.log("<tr cellspacing=\"0\" bgcolor=\"Green\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'	
//					}else if (statuscontainer[i].equals("Fail")) {
//						Reporter.log("<tr bgcolor=\"Red\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
//					}else if (statuscontainer[i].equals("Skip")) {
//						Reporter.log("<tr bgcolor=\"Yellow\"><td><b><font size='4' color='Black'>"+classcontainer[i]+"</font></b></td><td><b><font size='4' color='Black'><a href=\"#m"+ordercontainer[i]+"\">"+procedurecontainer[i]+"</a></font></b></td><td><b><font size='4' color='Black'>"+ordercontainer[i]+"</font></b></td><td><b><font size='4' color='Black'>"+statuscontainer[i]+"</font></b></td></tr>"); //writing the heading 'Parameter Name' in the first 'td'
//					}
//					
//				}
//				Reporter.log("</table>");
//				Reporter.log("</a>");
				
//				=======================
				
//				=======================
				
//			    List<String> output = Reporter.getOutput();
//			    for (int i = 0; i < output.size(); i++) {
//			    	 Reporter.log("Value"+output.get(i));
//				}			   
//			    for (String line : output) {
//			      Reporter.log("<tr><td>"+line+"</td></tr>\n");
//			    }
//				
//				String csvfile = "AccountCreation";	
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
