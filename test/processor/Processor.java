package processor;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.server.SeleniumServer;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.*;
import java.net.URL;
import java.text.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static processor.CommonSeleniumActions.*;

public class Processor {
    public static SeleniumServer jettyProxy;
    public static RemoteWebDriver driver;
    public static WebDriverBackedSelenium selenium;
    protected boolean jettyProxyWasStartedByATest = false;
    protected final static String SELENIUM_SERVER_HOST = "localhost";
    protected final static int SELENIUM_SERVER_PORT = 4444;
    public static final String STANDARD_PAGE_LOAD_WAIT_TIME = "120000"; //milliseconds
    public static final int STANDARD_PAGE_LOAD_WAIT_TIME_WEBDRIVER = 500; //second
    public static int golbalProcedureOrder = 0;
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
    public static String globalFailureNotification = "";

    public enum testbrowser {
        internetexplorer, firefox, safari, googlechrome

    }

    public static String globalCurrentDateAndTime = "";

    @BeforeSuite(alwaysRun = true)
    public void startseleniumserver(ITestContext context) throws Exception {
        Reporter.log("Proceed to Get Browser Name from Excel Sheet(C:/SeleniumScripts/AYQAAutomation/lib/InputTestdata.xls)");
        System.out.println("Start of the 'startseleniumserver' function");
        browser = Runtimedataread("Browser").toLowerCase().trim();
        String outlocation = context.getOutputDirectory();
        String[] outfilename = outlocation.split("\\\\");
        String testName = outfilename[outfilename.length - 2];

        //Added by Rahul Mehta 5th Jan,2023
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("ddMMHHmmss");
        globalCurrentDateAndTime = dateFormat.format(date);
        //Rahul Mehta

        switch (browser) {
            case "internetexplorer":
                File file = new File("C:\\SeleniumScripts\\AYQAAutomation\\lib\\IEDriverServer.exe");
                System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
                driver = new InternetExplorerDriver();
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
                break;
            case "firefox":
                String marionetteDriverLocation = "C:\\SeleniumScripts\\AYQAAutomation\\lib\\geckodriver.exe";
                System.setProperty("webdriver.gecko.driver", marionetteDriverLocation);
                //WebDriver driver = new MarionetteDriver();
                DesiredCapabilities capabilitiesff = DesiredCapabilities.firefox();
                capabilitiesff.setCapability("marionette", true);
                capabilitiesff.setCapability("javascriptEnabled", true);
                driver = new FirefoxDriver(capabilitiesff);
                break;
            case "googlechrome":
                System.setProperty("webdriver.chrome.driver", "C:\\SeleniumScripts\\AYQAAutomation\\lib\\chromedriver.exe");
                ChromeOptions options = new ChromeOptions();
                options.addArguments("test-type");
                options.addArguments("disable-popup-blocking");
                options.addArguments("--disable-extensions");
                //options.addArguments("--disable-features=VizDisplayCompositor");
              driver = new ChromeDriver(options);
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            case "saucelabsios":
                String sauceUserName = "AdvisingQA";
                String sauceAccessKey = "e499675e-5a42-4498-96ec-ca5dc696f709";
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability("platformVersion", "9.1");
                capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Safari");
                capabilities.setCapability("deviceName", "iPhone Simulator");
                capabilities.setCapability("appiumVersion", "1.5.2");
                driver = null;
                try {
                    driver = new IOSDriver(new URL(MessageFormat.format("http://{0}:{1}@ondemand.saucelabs.com:80/wd/hub", sauceUserName, sauceAccessKey)),
                            capabilities);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            case "saucelabsandroid":
                String andrSauceUserName = "AdvisingQA";
                String andrSauceAccessKey = "e499675e-5a42-4498-96ec-ca5dc696f709";
                DesiredCapabilities caps = DesiredCapabilities.android();
                caps.setCapability("appiumVersion", "1.5.2");
                caps.setCapability("deviceName", "Android Emulator");
                caps.setCapability("deviceType", "phone");
                caps.setCapability("deviceOrientation", "portrait");
                caps.setCapability("browserName", "Browser");
                caps.setCapability("platformVersion", "5.1");
                caps.setCapability("platformName", "Android");
                driver = null;
                try {
                    driver = new AndroidDriver(new URL(MessageFormat.format("http://{0}:{1}@ondemand.saucelabs.com:80/wd/hub", andrSauceUserName, andrSauceAccessKey)),
                            caps);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            default:
                writeFailure("Invalid Browser Name(" + browser + ")");
        }
       driver.get("http://www.google.com");
        driver.manage().window().maximize();
        String outlocadrive = outlocation.substring(0, outlocation.lastIndexOf("\\"));
        String outlocarepo = outlocation.substring(0, outlocadrive.lastIndexOf("\\"));
        String autoframework = outlocation.substring(0, outlocarepo.lastIndexOf("\\"));
        testData = readCSVFile(autoframework + "\\csv\\" + testName + ".csv");
System.out.println("End of the 'startseleniumserver' function");
    }


    public static synchronized ArrayList readCSVFile(String sFileName) throws IOException, InterruptedException {
        ArrayList<String[]> mdData = new ArrayList();
        String sCurLine;

        //A FileInputStream obtains input bytes from a file in a file system
        FileInputStream fFileStream = new FileInputStream(sFileName);
        FileReader fr;
        fr = new FileReader(new File(sFileName));
        BufferedReader br = new BufferedReader(fr);
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

            String[] splitData = sCurLine.split(",", -1);

            for (int i = 0; i < splitData.length; i++) {
                if (splitData[i].contains("commaspace")) {
                    splitData[i] = splitData[i].replace("commaspace", ", ");
                }
                if (splitData[i].contains("commasemicolon")) {
                    splitData[i] = splitData[i].replace("commasemicolon", ",;");
                }
            }
            mdData.add(splitData);
        } //End of while loop
        return mdData;
    }


    @BeforeMethod(alwaysRun = true)
    public void datagenerator() throws IOException, InterruptedException {
        String[] data = (String[]) testData.get(golbalProcedureOrder);
        golbalProcedureOrder++;
        ArrayList<String> datacollector = new ArrayList<String>();
        for (int i = 2; i < data.length; i = i + 2) {
            datacollector.add(data[i]);
        }
        ArrayList<String> parameternamecollector = new ArrayList<String>();
        for (int k = 1; k < data.length; k = k + 2) {
            parameternamecollector.add(data[k]);
        }
        procedurename = data[0];
        datacontainer = new String[datacollector.size()]; // this Array is used to collect Test Data From CSV
        datacollector.toArray(datacontainer);
        parameternames = new String[parameternamecollector.size()]; // this Array is ued to collect Parameter Name From CSV
        parameternamecollector.toArray(parameternames);
    }


    @AfterMethod(alwaysRun = true)
    public void failurescreenshot(ITestResult result, ITestContext context) throws Exception {
        String status = "Pass";
        String classname = result.getTestClass().getName();
        String procedurename = result.getMethod().getMethodName();
        int exeprocedurestatus = result.getStatus();
        if (exeprocedurestatus == 2) {
            status = "Fail";
        } else if (exeprocedurestatus == 3) {
            status = "Skip";
        }

        procedureclass.add(classname);
        executeprocedurename.add(procedurename);
        procedureorder.add(String.valueOf(golbalProcedureOrder));
        procedurestatus.add(status);

        if (status == "Fail") {
            //if (!result.isSuccess()) {
            Reporter.setCurrentTestResult(result);
            String output = context.getOutputDirectory();
            String outputfolder = output.substring(0, output.lastIndexOf("\\")) + "\\Failurescreenshot\\";
            Reporter.log("Failure Screenshot saved at " + outputfolder + result.getName() + "_" + golbalProcedureOrder + ".PNG");
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshot, new File(outputfolder + result.getName() + "_" + golbalProcedureOrder + ".PNG"));
            Reporter.log("<a href='file:///" + outputfolder + result.getName() + "_" + golbalProcedureOrder + ".PNG'><img src='file:///" + outputfolder + result.getName() + "_" + golbalProcedureOrder + ".PNG' height='200' width='200'></a>");
            Reporter.setCurrentTestResult(null);
            throw new SkipException("Skipping Test: ");
        }
        backtodetails();
    }


    @AfterSuite(alwaysRun = true)
    public void shutdownseleniumserver(ITestContext result) throws Exception {
       // System.out.println("comes to after suite");
        Set<String> set = driver.getWindowHandles();
        Iterator<String> itr = set.iterator();

        //System.out.println("Closing " + set.size() + " window(s)");
        int closeCount = set.size();
        driver.close();
        while (itr.hasNext()) {
            String childWindow = itr.next();
            driver.switchTo().window(childWindow);
            driver.close();
        }

        driver.quit();// Close all opened 	browser by webdriver.


        String Status = null;
        String Resultoutput = result.getOutputDirectory();
        String ReportLocation = Resultoutput.substring(0, Resultoutput.lastIndexOf("\\")) + "\\customized-report.html";
        String Testname = result.getName();
        Summarydetails.add(Testname); // adding to array to use customize report
        Summarydetails.add(String.valueOf(result.getPassedTests().size() + result.getFailedTests().size() + result.getSkippedTests().size())); // adding to array to use customize report
        int Pass = result.getPassedTests().size();
        Summarydetails.add(String.valueOf(Pass)); // adding to array to use customize report
        int Fail = result.getFailedTests().size();
        Summarydetails.add(String.valueOf(Fail)); // adding to array to use customize report
        int Skip = result.getSkippedTests().size();
        Summarydetails.add(String.valueOf(Skip)); // adding to array to use customize report
        int Failconfig = result.getFailedConfigurations().size();
        int Skipconfig = result.getSkippedConfigurations().size();

        if (Fail == 0 && Skip == 0 && Failconfig == 0 && Skipconfig == 0) {
            Status = "Pass";
            System.out.println("Test Passed");
        } else {
            Status = "Failed";
            System.out.println("Test Failed");
        }
        String[] outfilename = Resultoutput.split("\\\\");
        String csvfile = outfilename[outfilename.length - 2];
        System.out.println("CSV File Name Write :" + csvfile);
//				=======================  Below code is used take total Time for Execution to be used customize report

        long time_start = Long.MAX_VALUE;
        long time_end = Long.MIN_VALUE;
        NumberFormat formatter = new DecimalFormat("#,##0.0");
        time_start = Math.min(result.getStartDate().getTime(), time_start);
        time_end = Math.max(result.getEndDate().getTime(), time_end);
        String total = formatter.format((result.getEndDate().getTime() - result.getStartDate().getTime()) / 1000.) + " seconds";
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

            String outlocadrive = Resultoutput.substring(0, Resultoutput.lastIndexOf("\\"));
            String outlocarepo = Resultoutput.substring(0, outlocadrive.lastIndexOf("\\"));
            String autoframework = Resultoutput.substring(0, outlocarepo.lastIndexOf("\\"));
            BufferedWriter reportWrite = new BufferedWriter(new FileWriter(autoframework + "\\csv\\" + csvfile + ".csv", true));
            reportWrite.newLine();
            reportWrite.write("RUN_STATUS");
            reportWrite.write(",");
            reportWrite.write(Status + "\n");
            reportWrite.write("RUN_REPORT");
            reportWrite.write(",");
            reportWrite.write(ReportLocation);
            reportWrite.close();
        } catch (Exception e) {
            System.out.println("Writing CSV Write Exeception :" + e.getMessage());
        }
    }
    //--------------------BELOW CODE IS TO KILL THE TASK-----------------------------------------------
    private static final String TASKLIST = "tasklist";
    private static final String KILL = "taskkill /F /IM ";

    public static boolean isProcessRunging(String serviceName) throws Exception {

        Process p = Runtime.getRuntime().exec(TASKLIST);
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                p.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {

            System.out.println(line);
            if (line.contains(serviceName)) {
                return true;
            }
        }

        return false;

    }

    public static void killProcess(String serviceName) throws Exception {

        Runtime.getRuntime().exec(KILL + serviceName);

    }

}
