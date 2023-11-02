package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import static procedures_NewFramework.AYSmoke.General.GL_LaunchBrowser.environment;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSeleniumServlet.*;
import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class MC_ManageUsers_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some input operation in 'Manage User' page")
	public void MC_ManageUsers_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage User' Page");
			String[] testdata = datacontainer;
			String showhideinstruction = testdata[0];
			String viewbystatus = testdata[1];
			String sort = testdata[2];
			String addgo = testdata[3];
			String checklastname = testdata[4];
			String clicklastname = testdata[5];
			String selectdeselect = testdata[6];
			String selectanaction = testdata[7];
			String apply = testdata[8];
			
						
			Reporter.log("Input Test Data was retrieved for 'Manage User' Page");
			
			if(!addgo.equals("")){
				Reporter.log("Click on the Button"+addgo);
				clickWebdriver(attributeName_xpath, MS_addgo+addgo+"')]");
			}	
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}


