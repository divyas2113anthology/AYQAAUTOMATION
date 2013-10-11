package processor;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Map;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;

import com.inflectra.spirateam.mylyn.core.internal.services.soap.ArrayOfRemoteTestCase;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.ArrayOfRemoteTestCaseParameter;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.ArrayOfRemoteTestStep;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.ArrayOfRemoteTestStepParameter;
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
import com.inflectra.spirateam.mylyn.core.internal.services.soap.ImportExport;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteAutomatedTestRun;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteDocument;
import com.inflectra.spirateam.mylyn.core.internal.services.soap.RemoteTestCase;

public class TestSetRunner {
	public static void main (String[] args) throws IImportExportConnectionAuthenticateServiceFaultMessageFaultFaultMessage, IImportExportConnectionConnectToProjectServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveByIdServiceFaultMessageFaultFaultMessage, IImportExportSystemGetProductNameServiceFaultMessageFaultFaultMessage, IImportExportProjectRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveStepParametersServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveParametersServiceFaultMessageFaultFaultMessage, IOException, InterruptedException, IImportExportTestCaseAddUpdateAutomationScriptServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveServiceFaultMessageFaultFaultMessage, IImportExportTestRunRecordAutomated1ServiceFaultMessageFaultFaultMessage, IImportExportTestRunRecordAutomated1ValidationFaultMessageFaultFaultMessage, IImportExportDocumentAddFileServiceFaultMessageFaultFaultMessage, IImportExportConnectionDisconnectServiceFaultMessageFaultFaultMessage, IImportExportTestCaseRetrieveByTestSetIdServiceFaultMessageFaultFaultMessage{
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
		for (int i = 0; i < numTests; i++) {
			RemoteTestCase testToRun = tests.getRemoteTestCase().get(i);
			Integer testId = testToRun.getTestCaseId().getValue();
			System.out.println("TestID: "+testId);
			String[] runParams;
			runParams = new String[3];
			runParams[0] = projectIdInput.toString();
			runParams[1] = testSetIdInput.toString();
			runParams[2] = testId.toString();
			processor.DriverScript.main(runParams);
		}
	}
}
