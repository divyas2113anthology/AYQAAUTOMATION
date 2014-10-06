package processor;

import java.io.IOException;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.ArrayOfRemoteTestCase;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExport;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportConnectionAuthenticateServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportConnectionDisconnectServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportDocumentAddFileServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportProjectRetrieveServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportSystemGetProductNameServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestCaseAddUpdateAutomationScriptServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestCaseRetrieveByIdServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestCaseRetrieveByTestSetIdServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestCaseRetrieveParametersServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestCaseRetrieveServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestCaseRetrieveStepParametersServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestRunRecordAutomated1ServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestRunRecordAutomated1ValidationFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.IImportExportTestSetRetrieveByIdServiceFaultMessageFaultFaultMessage;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteTestCase;

public class TestSetRunner {
	public static void main (String[] args) throws IImportExportConnectionAuthenticateServiceFaultMessageFaultFaultMessage, IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveByIdServiceFaultMessageFaultFaultMessage, IImportExportSystemGetProductNameServiceFaultMessageFaultFaultMessage, IImportExportProjectRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveStepParametersServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveParametersServiceFaultMessageFaultFaultMessage, IOException, InterruptedException, IImportExportTestCaseAddUpdateAutomationScriptServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestRunRecordAutomated1ServiceFaultMessageFaultFaultMessage, IImportExportTestRunRecordAutomated1ValidationFaultMessageFaultFaultMessage, IImportExportDocumentAddFileServiceFaultMessageFaultFaultMessage, IImportExportConnectionDisconnectServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveByTestSetIdServiceFaultMessageFaultFaultMessage, IImportExportTestSetRetrieveByIdServiceFaultMessageFaultFaultMessage{
		Integer projectIdInput = null;
		Integer testSetIdInput = null;
		if (args.length > 0) {  //get Spira Project Id, Test Set Id, and Test Id from command line params
			try {
				projectIdInput = Integer.parseInt(args[0]);
				testSetIdInput =  Integer.parseInt(args[1]);
				
			} catch (NumberFormatException e) {
		        System.err.println("Argument" + " must be an integer");
		        System.exit(1);
				}
		}

		IImportExport soap = processor.DriverScript.ConnectSpira(projectIdInput);
		ArrayOfRemoteTestCase tests = soap.testCaseRetrieveByTestSetId(testSetIdInput);
		Integer numTests = tests.getRemoteTestCase().size(); 
		System.out.println("Number of tests in test set: "+numTests);
		Integer runStatus = 0;
		String[] resultArray;
		resultArray = new String[numTests];
		for (int i = 0; i < numTests; i++) {
			RemoteTestCase testToRun = tests.getRemoteTestCase().get(i);
			Integer testId = testToRun.getTestCaseId().getValue();
			String testName = testToRun.getName().getValue();
			System.out.println("TestID: "+testId);
			String[] runParams;
			runParams = new String[3];
			runParams[0] = projectIdInput.toString();
			runParams[1] = testSetIdInput.toString();
			runParams[2] = testId.toString();
			processor.DriverScript.main(runParams);
			//System.out.println("*************test "+testId+"status: "+testToRun.getExecutionStatusId().getValue());
		}
		Thread.sleep(5000);
		for (int i = 0; i < numTests; i++) {
			RemoteTestCase testToRun = tests.getRemoteTestCase().get(i);
			testToRun = tests.getRemoteTestCase().get(i);
			Integer testId = testToRun.getTestCaseId().getValue();
			String testName = testToRun.getName().getValue();
			Integer testStatus = testToRun.getExecutionStatusId().getValue();
			String strTestStatus = "Failed";
			if(testStatus.equals(2)){
				strTestStatus = "Passed";
			}
			resultArray[i] = "Test: "+testName+" "+testId+" status: "+strTestStatus;
			System.out.println(resultArray[i]);
			if(!(testToRun.getExecutionStatusId().getValue().equals(2))){
				runStatus = 1;
			}

		}

	if(runStatus.equals(1)){
		System.out.println("*******************");
		System.out.println("Failure in test set");
		System.out.println("*******************");
		System.exit(1);
	}else{
		System.out.println("*******************");
		System.out.println("Test set passed");
		System.out.println("*******************");
		System.exit(0);
	}
	}
}
