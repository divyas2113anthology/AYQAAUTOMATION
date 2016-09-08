package processor;

import java.io.BufferedReader;
//import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import org.apache.commons.io.FileUtils;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.collections.Lists;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import processor.GenerateCsv;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.*;

public class DriverScript {
	public static void main (String[] args) throws IImportExportConnectionAuthenticateServiceFaultMessageFaultFaultMessage, IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveByIdServiceFaultMessageFaultFaultMessage, IImportExportSystemGetProductNameServiceFaultMessageFaultFaultMessage, IImportExportProjectRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveStepParametersServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveParametersServiceFaultMessageFaultFaultMessage, IOException, InterruptedException, IImportExportTestCaseAddUpdateAutomationScriptServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestRunRecordAutomated1ServiceFaultMessageFaultFaultMessage, IImportExportTestRunRecordAutomated1ValidationFaultMessageFaultFaultMessage, IImportExportDocumentAddFileServiceFaultMessageFaultFaultMessage, IImportExportConnectionDisconnectServiceFaultMessageFaultFaultMessage, IImportExportTestSetRetrieveByIdServiceFaultMessageFaultFaultMessage{
		Date startDate = new Date();
		String testDir = "C:\\SeleniumScripts\\AYQAAutomation";   //location of Local Repo
		Integer projectIdInput = null;
		Integer testIdInput = null;
		Integer testSetIdInput = null;
		if (args.length > 0) {  //get Spira Project Id, Test Set Id, and Test Id from command line params
			try {
				projectIdInput = Integer.parseInt(args[0]);
				testSetIdInput =  Integer.parseInt(args[1]);
				testIdInput =  Integer.parseInt(args[2]);

			} catch (NumberFormatException e) {
				System.err.println("Argument" + " must be an integer");
				System.exit(1);
			}
		}

		System.out.println("ProjectID: "+projectIdInput);
		System.out.println("TestSetID: "+testSetIdInput);
		System.out.println("TestID: "+testIdInput);

		//Connect to Spira
		IImportExport soap = ConnectSpira(projectIdInput);  
		//Retrieve test name and generate csv file for test data
		String testNameInput = GetTestInfo(projectIdInput,testIdInput,soap,testDir);  
		System.out.println("Running "+testNameInput+"...");
		//Default test status to Blocked
		String testStatus = "Blocked";

		//Run test as process
		Runtime rt = Runtime.getRuntime();
		//ByteArrayOutputStream testOutput = new ByteArrayOutputStream();
		String line;
		String testTextOut = "";
		//Start testNG test with command line call
		String resultsLocation = testDir+"\\Results\\"+testIdInput+"_"+testNameInput;
		File resultsFile = new File(resultsLocation);
		FileUtils.deleteDirectory(resultsFile);//delete prior run results folder if present

		//Process pr = rt.exec("cmd.exe /C start java -classpath C:\\SeleniumScripts\\ARQAAutomation\\bin;C:\\Selenium\\*; org.testng.TestNG C:\\SeleniumScripts\\ARQAAutomation\\Suite\\DriverSuite.xml -d C:\\SeleniumScripts\\ARQAAutomation\\Results\\"+testIdInput+"_"+testNameInput);
		//Process pr = rt.exec("java.exe -classpath C:\\SeleniumScripts\\ARQAAutomation\\bin;C:\\SeleniumScripts\\ARQAAutomation\\bin\\procedure\\LaunchBrowser;C:\\SeleniumScripts\\ARQAAutomation\\lib\\*; org.testng.TestNG C:\\SeleniumScripts\\ARQAAutomation\\Suite\\DriverSuite.xml -d C:\\SeleniumScripts\\ARQAAutomation\\Results\\"+testIdInput+"_"+testNameInput);
		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		List<String> suites = Lists.newArrayList();
		suites.add("C:\\SeleniumScripts\\AYQAAutomation\\Suite\\DriverSuite.xml");
		testng.setTestSuites(suites);
		testng.setOutputDirectory("C:\\SeleniumScripts\\AYQAAutomation\\Results\\"+testIdInput+"_"+testNameInput);
		testng.addListener(tla);
		testng.setPreserveOrder(true);
		testng.run();
		testStatus = "Blocked";
		System.out.println("Skipped tests: "+tla.getSkippedTests().size());
		System.out.println("Failed tests: "+tla.getFailedTests().size());
		System.out.println("Passed tests: "+tla.getPassedTests().size());
		if ((tla.getSkippedTests().size()>0) || (tla.getSkippedTests().size()>0)) {
			testStatus = "Failed";
		}
		else if (tla.getPassedTests().size()>0) {
			testStatus = "Passed";
		}

		System.out.println("Executed Process::::::::::");


		System.out.println("Test Run Complete: "+testStatus);
		System.out.println("Logging Results...");
		LogAutomatedRun(projectIdInput,testSetIdInput,testIdInput,testNameInput,testStatus,soap,testDir,testTextOut,startDate);
		soap.connectionDisconnect();
		System.out.println("**************Test Complete***************");
		Runtime.getRuntime().exec("taskkill /F /IM java.exe");

	}

	public static IImportExport ConnectSpira(Integer projectIdInput) throws IImportExportConnectionAuthenticateServiceFaultMessageFaultFaultMessage, IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage, MalformedURLException{
		final String WEB_SERVICE_SUFFIX = "/Services/v4_0/ImportExport.svc"; //$NON-NLS-1$ 
		final String WEB_SERVICE_NAMESPACE = "{http://www.inflectra.com/SpiraTest/Services/v4.0/}ImportExport"; //$NON-NLS-1$ 
		//final String WEB_SERVICE_NAMESPACE_DATA_OBJECTS = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects"; //$NON-NLS-1$ 
		String baseUrl = "https://hobsons.spiraservice.net";
		URL serviceUrl = new URL(baseUrl + WEB_SERVICE_SUFFIX); 
		System.out.println("Connecting to Spira...");
		ImportExport service = new ImportExport(serviceUrl, QName.valueOf(WEB_SERVICE_NAMESPACE)); 
		IImportExport soap = service.getBasicHttpBindingIImportExport();

		//Make sure that session is maintained 
		Map<String, Object> requestContext = ((BindingProvider)soap).getRequestContext(); 
		requestContext.put(BindingProvider.SESSION_MAINTAIN_PROPERTY,true);

		//Authenticate and connect to project

		//boolean success = soap.connectionAuthenticate(this.userName, this.password);
		boolean success1 = soap.connectionAuthenticate("automation", "H0bsons1");
		System.out.println("Connected to Spira: "+success1);
		//Integer projectID = 6;
		boolean success2 = soap.connectionConnectToProject(projectIdInput.intValue());
		System.out.println("Connected to project "+projectIdInput+": "+success2);
		return soap;

	}

	public static String GetTestInfo(Integer projectID,Integer testID,IImportExport soap,String testDir) throws MalformedURLException, IImportExportConnectionAuthenticateServiceFaultMessageFaultFaultMessage, IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveByIdServiceFaultMessageFaultFaultMessage, IImportExportSystemGetProductNameServiceFaultMessageFaultFaultMessage, IImportExportProjectRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveStepParametersServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveParametersServiceFaultMessageFaultFaultMessage, IImportExportTestSetRetrieveByIdServiceFaultMessageFaultFaultMessage {
		//Setting up the proxy classes

		//Get test by id then find name
		//Integer testID = 2204;
		testDir = testDir + "\\csv\\";
		System.out.println(testDir);
		Integer stepNum = 0;
		String csvContents = "";
		RemoteTestCase test = soap.testCaseRetrieveById(testID);
		String testname = test.getName().getValue();
		

		//Get test steps
		JAXBElement<ArrayOfRemoteTestStep> teststeps = test.getTestSteps();
		Integer numOfSteps = teststeps.getValue().getRemoteTestStep().size();
		System.out.println("Test id = "+testID);
		System.out.println("Test Name = "+testname);
		System.out.println("Number of steps = "+numOfSteps);

		//Loop through steps
		System.out.println("Getting test data...");
		while(stepNum < numOfSteps)
		{
			//Get test step id
			Integer stepID = teststeps.getValue().getRemoteTestStep().get(stepNum).getTestStepId().getValue();
			//Get linked test case(procedure)
			if (!(teststeps.getValue().getRemoteTestStep().get(stepNum).getLinkedTestCaseId().isNil()))
			{//if step is a procedure(has linked test)
				Integer linkedTestId = teststeps.getValue().getRemoteTestStep().get(stepNum).getLinkedTestCaseId().getValue();
				//System.out.println("Linked test id: "+linkedTestId);
				RemoteTestCase linkedTest = soap.testCaseRetrieveById(linkedTestId);
				//Get procedure name
				String linkedProcedureName = linkedTest.getName().getValue();
				//Get procedure params
				ArrayOfRemoteTestStepParameter stepParams = soap.testCaseRetrieveStepParameters(testID, stepID);
				Integer numParams = stepParams.getRemoteTestStepParameter().size();
				ArrayOfRemoteTestCaseParameter linkedFullParams = soap.testCaseRetrieveParameters(linkedTestId);
				Integer linkedFullParamsNum = linkedFullParams.getRemoteTestCaseParameter().size();
				//System.out.println("full number of linked params"+linkedFullParamsNum);
				Integer linkedFullParamCounter = 0;
				csvContents = csvContents+ linkedProcedureName;

				while (linkedFullParamCounter < linkedFullParamsNum)
				{
					String fullParamName = linkedFullParams.getRemoteTestCaseParameter().get(linkedFullParamCounter).getName().getValue();
					//add param name and value to csv
					csvContents=csvContents+","+fullParamName;
					//csvContents=csvContents+","+"";
					Integer paramNum = 0;
					//Add procedure name to csv
					//Loop through params
					Boolean paramFound = false;
					//System.out.println("Param number = "+linkedFullParamCounter);
					//System.out.println("Param name = "+fullParamName);

					while((paramNum < numParams) && (!paramFound))
					{
						String paramValue = stepParams.getRemoteTestStepParameter().get(paramNum).getValue().getValue();
						String paramName = stepParams.getRemoteTestStepParameter().get(paramNum).getName().getValue();
						//add param name and value to csv
						//csvContents=csvContents+","+paramName;
						if (paramName.equals(fullParamName)) {
							csvContents=csvContents+","+paramValue;
							//System.out.println("Param Value = "+paramValue);
							paramFound = true;
						}

						//System.out.println("Param number = "+paramNum);
						//System.out.println("Param name = "+paramName);
						//System.out.println("Param Value = "+paramValue);
						paramNum++;
					}//end of param iteration
					if (!paramFound){
						csvContents=csvContents+","+"";
						//System.out.println("Param Value = empty");
					}


					linkedFullParamCounter++;				
				}

				//System.out.println("Step Number = "+stepNum);
				//System.out.println("Linked Procedure = "+linkedProcedureName);
				//System.out.println("Number of params = "+numParams);

				//add new line between procedures
				csvContents=csvContents+"\n";	
			} //end if step is procedure
			stepNum++;

		}//end of step iteration
		//System.out.println(csvContents);
		String testFile = testDir+testID+"_"+testname+".csv";
		//generate csv file
		GenerateCsv.main(testFile,csvContents);
		System.out.println("csv file written to: "+testFile);
		return testname;
	}//end of GetTestInfo


	public static void LogAutomatedRun(Integer projectID,Integer testSetID, Integer testID, String testName, String testStatus,IImportExport soap,String testDir, String testTextOut, Date startDate) throws IImportExportConnectionAuthenticateServiceFaultMessageFaultFaultMessage, IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveByIdServiceFaultMessageFaultFaultMessage, IImportExportSystemGetProductNameServiceFaultMessageFaultFaultMessage, IImportExportProjectRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveStepParametersServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveParametersServiceFaultMessageFaultFaultMessage, IImportExportTestCaseAddUpdateAutomationScriptServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestRunRecordAutomated1ServiceFaultMessageFaultFaultMessage, IImportExportTestRunRecordAutomated1ValidationFaultMessageFaultFaultMessage, IImportExportDocumentAddFileServiceFaultMessageFaultFaultMessage, IOException  {
		//Get test by id then find name
		Date endDate;

		String computername=InetAddress.getLocalHost().getHostName();
		String runnerName = "Selenium";
		String runnerTestName = testName;
		Integer runnerAssertCount = 1;
		String runnerMessage =  "Run on: "+computername;
		String runnerStackTrace = testTextOut;
		RemoteTestSet testSet = null;
		try {
			testSet = soap.testSetRetrieveById(testSetID);
		} catch (IImportExportTestSetRetrieveByIdServiceFaultMessageFaultFaultMessage e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JAXBElement<Integer> testerID = testSet.getOwnerId();
		Integer intTesterID = testerID.getValue();
		String testerName = testSet.getOwnerName().getValue();
		System.out.println("Tester name:"+testerName);
		System.out.println("Tester id:"+intTesterID);
				
		int executionStatusId = 5;
		if (testStatus.equals("Failed")) {
			executionStatusId = 1;
		}
		if (testStatus.equals("Passed")) {
			executionStatusId = 2;
		}
		//if (testStatus.equals("Blocked")) {
		//executionStatusId = 5;
		//}
		//RemoteTestCase test = soap.testCaseRetrieveById(testID);
		RemoteAutomatedTestRun remoteTestRun = new RemoteAutomatedTestRun();
		remoteTestRun.setTestCaseId(testID);
		remoteTestRun.setTestSetId(CreateJAXBInteger("TestSetId", testSetID));
		remoteTestRun.setStartDate(convertDatesJava2Xml(startDate));
		remoteTestRun.setExecutionStatusId(executionStatusId);
		remoteTestRun.setRunnerName(CreateJAXBString("RunnerName", runnerName));
		//remoteTestRun.setTesterId(testerID);
		remoteTestRun.setTesterId(CreateJAXBInteger("TesterId", intTesterID));
		remoteTestRun.setRunnerTestName(CreateJAXBString("RunnerTestName", runnerTestName));
		System.out.println("Retrieved tester id: "+remoteTestRun.getTesterId().getValue());
		remoteTestRun.setRunnerAssertCount(CreateJAXBInteger("RunnerAssertCount", runnerAssertCount));
		remoteTestRun.setRunnerMessage(CreateJAXBString("RunnerMessage", runnerMessage));
		remoteTestRun.setRunnerStackTrace(CreateJAXBString("RunnerStackTrace", runnerStackTrace));
		endDate = new Date();
		System.out.println(startDate);
		System.out.println(endDate);
		Integer actualDuration = (int) Math.abs(endDate.getTime() - startDate.getTime())/1000;
		System.out.println("Duration seconds: "+actualDuration);
		//actualDuration = actualDuration/60;
		//actualDuration = actualDuration/60;
		//System.out.println("Duration minutes: "+actualDuration);
		//remoteTestRun.setActualDuration(CreateJAXBInteger("ActualDuration", actualDuration));
		remoteTestRun.setEndDate(CreateJAXBXMLGregorianCalendar("EndDate", convertDatesJava2Xml(endDate)));
		remoteTestRun = soap.testRunRecordAutomated1(remoteTestRun);

		int testRunId = remoteTestRun.getTestRunId().getValue();
		System.out.println("Test run "+testRunId+" logged successfully");
		String resultsLocation = testDir+"\\Results\\"+testID+"_"+testName;
		int artifactId = testRunId;

		if (testStatus.equals("Failed")) {
			String files;
			String screenDir = resultsLocation+"\\Failurescreenshot\\";
			System.out.println(screenDir);		 
			File folder = new File(screenDir);
			File[] listOfFiles = folder.listFiles(); 

			System.out.println("Uploading attachments to Spira...");
			for (int i = 0; i < listOfFiles.length; i++) 
			{

				if (listOfFiles[i].isFile()) 
				{
					files = listOfFiles[i].getName();
					postAttachment(screenDir,files,artifactId,soap);
				}
			}
		}
		postAttachment(resultsLocation,"customized-report.html",artifactId,soap);

	}//end of main

	public static void postAttachment(String fileLocation, String fileName, int testRunID,IImportExport soap) throws IImportExportDocumentAddFileServiceFaultMessageFaultFaultMessage, IOException{
		File file = new File(fileLocation+"//"+fileName);
		byte [] fileData = new byte[(int)file.length()];
		DataInputStream dis = new DataInputStream((new FileInputStream(file)));
		dis.readFully(fileData);
		dis.close();

		RemoteDocument remoteDocument = new RemoteDocument();
		remoteDocument.setFilenameOrUrl(CreateJAXBString("FilenameOrUrl",fileName));
		//remoteDocument.setDescription(CreateJAXBString("Description",description));
		remoteDocument.setArtifactId(CreateJAXBInteger("ArtifactId",testRunID));
		remoteDocument.setArtifactTypeId(CreateJAXBInteger("ArtifactTypeId",5));
		soap.documentAddFile(remoteDocument, fileData);
		System.out.println(fileName);
	}

	public static XMLGregorianCalendar convertDatesJava2Xml(Date date)
	{
		if (date == null)
		{
			return null;
		}
		try
		{
			GregorianCalendar calendar = new GregorianCalendar();
			calendar.setTime(date);
			TimeZone timeZoneAdj = calendar.getTimeZone();
			int timeZoneAdjustment =  timeZoneAdj.getOffset(0)/3600000;  //get the timezone offset(and convert from milliseconds)
			timeZoneAdjustment = timeZoneAdjustment+(timeZoneAdj.getDSTSavings()/3600000); //apply dst adjustment if necessary(and convert from milliseconds)
			timeZoneAdjustment = timeZoneAdjustment * -1;
			//System.out.println("TimeZone Adjustment: "+timeZoneAdjustment);
			calendar.add(calendar.HOUR,timeZoneAdjustment);
			DatatypeFactory datatypeFactory = DatatypeFactory.newInstance();
			XMLGregorianCalendar xmlCal = datatypeFactory.newXMLGregorianCalendar(calendar);

			return xmlCal;
		}
		catch (DatatypeConfigurationException ex)
		{
			return null;
		}
	}

	/***
	 * Creates a JAXB web service string element from a Java string
	 * @param value
	 * @return
	 */
	public static JAXBElement<String> CreateJAXBString(String fieldName, String value)
	{
		final String WEB_SERVICE_NAMESPACE_DATA_OBJECTS = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects"; //$NON-NLS-1$
		JAXBElement<String> jaxString = new JAXBElement<String>(new QName(WEB_SERVICE_NAMESPACE_DATA_OBJECTS, fieldName), String.class, value);
		if (value == null)
		{
			jaxString.setNil(true);
		}
		return jaxString;
	}

	/***
	 * Creates a JAXB web service integer element from a Java integer
	 * @param value
	 * @return
	 */
	public static JAXBElement<Integer> CreateJAXBInteger(String fieldName, Integer value)
	{
		final String WEB_SERVICE_NAMESPACE_DATA_OBJECTS = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects"; //$NON-NLS-1$
		JAXBElement<Integer> jaxInteger = new JAXBElement<Integer>(new QName(WEB_SERVICE_NAMESPACE_DATA_OBJECTS, fieldName), Integer.class, value);
		if (value == null)
		{
			jaxInteger.setNil(true);
		}
		return jaxInteger;
	}

	/***
	 * Creates a JAXB web service XMLGregorianCalendar element from a Java XMLGregorianCalendar object
	 * @param value
	 * @return
	 */
	public static JAXBElement<XMLGregorianCalendar> CreateJAXBXMLGregorianCalendar(String fieldName, XMLGregorianCalendar value)
	{
		final String WEB_SERVICE_NAMESPACE_DATA_OBJECTS = "http://schemas.datacontract.org/2004/07/Inflectra.SpiraTest.Web.Services.v4_0.DataObjects"; //$NON-NLS-1$
		JAXBElement<XMLGregorianCalendar> jaxXMLGregorianCalendar = new JAXBElement<XMLGregorianCalendar>(new QName(WEB_SERVICE_NAMESPACE_DATA_OBJECTS, 

				fieldName), XMLGregorianCalendar.class, value);
		if (value == null)
		{
			jaxXMLGregorianCalendar.setNil(true);
		}
		return jaxXMLGregorianCalendar;
	}

}
