package procedures_NewFramework.AYSmoke.General;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class GL_PDF_Close_MainWindow extends CommonSeleniumActions implements	OR {
	
	@Test(description="This Procedure is used to Close the PDF Window and select Application Main Window")	
	public void GL_PDF_Close_MainWindow(){
		try {
			writeDetails();			
			Reporter.log("Close the Application PDF Window Using AutoIT");
			Runtime.getRuntime().exec("T:/WebProducts/QA/SeleniumScripts/AY/AutoIT/PdfClose/PdfClose.exe");
			//Removed wait time
			selectMainWindowWebdriver();
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}


}
