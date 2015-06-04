package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;


import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.thoughtworks.selenium.webdriven.commands.WindowMaximize;
import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class WC_Package_AddEdit_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Configure Forms-Package' page")
	public void WC_Package_AddEdit_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Configure Forms-Package' Page");
			String[] testdata = datacontainer;
			String publishprodevcancel = testdata[0];
								
			Reporter.log("Input Test Data was retrieved for 'Configure Forms-Package' Page");
			
			if(!publishprodevcancel.equals("")){
				Reporter.log("Click on the Button"+publishprodevcancel);
				clickWebdriver(attributeName_xpath, MCG_Package+publishprodevcancel+"')]");
				
			}	
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}



