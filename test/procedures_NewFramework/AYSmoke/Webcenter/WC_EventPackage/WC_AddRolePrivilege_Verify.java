package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_AddRolePrivilege_Verify extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Export Webcenter User' page")
	public void WC_AddRolePrivilege_Verify(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Export Webcenter User' Page");
			String[] testdata = datacontainer;
			String Roles = testdata[0];
			String AppPrivilge = testdata[1];
			String EnrollPrivilge = testdata[2];
			String ProspectPrivilge = testdata[3];
			String EventPrivilge = testdata[4];
			
			//FileInputStream file = new FileInputStream(new File("C:\\Users\\emtqaaccount\\Downloads\\ExportClientUsers.xls"));
            
			if(!Roles.equals("")){
				System.out.println("Role");
				RuntimedatareadforRole(Roles);
			}
			if(!AppPrivilge.equals("")){
				System.out.println("AppPrivilge");
				RuntimedatareadforRole(AppPrivilge);
			}
			if(!EnrollPrivilge.equals("")){
				System.out.println("EnrollPrivilge");
				RuntimedatareadforRole(EnrollPrivilge);
			}
			if(!ProspectPrivilge.equals("")){
				System.out.println("ProspectPrivilge");
				RuntimedatareadforRole(ProspectPrivilge);
			}
			if(!EventPrivilge.equals("")){
				System.out.println("EventPrivilge");
				RuntimedatareadforRole(EventPrivilge);
			}
			Runtime.getRuntime().exec("C:\\SeleniumScripts\\AYQAAutomation\\AutoIT\\DownloadFileIEandFF\\DeleteExportFile.exe");
				//C:\SeleniumScripts\DownloadedFileLocation
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}