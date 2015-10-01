package procedures_NewFramework.AYSmoke.General;

import java.io.File;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class DownloadedFile_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some Operation and Verification of Downloaded file")
	public void DownloadedFile_Verify(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Test Data for 'Download file'");
			String[] testdata = datacontainer;
			String downloadlocation = testdata[0];
			String filepresentlocation = testdata[1];
			Reporter.log("Test Data was retrieved for 'Download file' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!downloadlocation.equals("")) {
				Reporter.log("Proceed to Download and Save a file in the Location["+downloadlocation+"] using AUTOIT");
//				Runtime.getRuntime().exec("T:/WebProducts/QA/SeleniumScripts/AY/AutoIT/Firefox/Application/DownloadDocFirefox.exe "+downloadlocation+"");	
				Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/DownloadFileIEandFF/SampleFileDownload.exe");
				//Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/DownloadFileIEandFF/SampleFileDownload.au3");
				//Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/DownloadFile/DownloadFileFirefox.au3");
				//Runtime.getRuntime().exec("C:/SeleniumScripts/AYQAAutomation/AutoIT/DownloadFile/DownloadFileFirefox.exe");
			}
			if (!filepresentlocation.equals("")) {
				String ReadExportFile = Runtimedataread(filepresentlocation);
				Reporter.log("Proceed to verify file in the Location["+ReadExportFile+"]");
				writeConsole("Export File Name : "+ReadExportFile);
//				waitForFile("T:\\WebProducts\\QA\\SeleniumScripts\\AY\\SourceFile\\Webcenter\\Export\\"+ReadExportFile); // this will hold the script to complete the File Download
//				verifyFile("T:\\WebProducts\\QA\\SeleniumScripts\\AY\\SourceFile\\Webcenter\\Export\\"+ReadExportFile);
				//waitForFile("C:\\SeleniumScripts\\DownloadedFileLocation\\"+ReadExportFile); // this will hold the script to complete the File Download
				//verifyFile("C:\\SeleniumScripts\\DownloadedFileLocation\\"+ReadExportFile);
				//waitForFile("C:\\SeleniumScripts\\AYQAAutomation\\SourceFile\\Webcenter\\Export\\"+ReadExportFile);
				//verifyFile("C:\\SeleniumScripts\\AYQAAutomation\\SourceFile\\Webcenter\\Export\\"+ReadExportFile);
				waitForFile("C:\\Users\\emtqaaccount\\AppData\\Local\\Temp\\"+ReadExportFile);
				verifyFile("C:\\Users\\emtqaaccount\\AppData\\Local\\Temp\\"+ReadExportFile);
				recentPopupClose();
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
