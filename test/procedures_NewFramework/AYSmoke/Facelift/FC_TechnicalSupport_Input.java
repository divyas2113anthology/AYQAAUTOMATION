package procedures_NewFramework.AYSmoke.Facelift;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSeleniumServlet.*;
import org.openqa.selenium.remote.server.handler.CloseWindow;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_TechnicalSupport_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Technical Support' page")
	public void FC_TechnicalSupport_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("AVSLookUp_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Technical Support' page");
			String[]  lookupidatarepo = datacontainer;
			String closewindow = lookupidatarepo[0];
			Reporter.log("Input Test Data was retrieved for 'Technical Support' page");
			if (!closewindow.equals("")) {
				Reporter.log("Step 6 - Click on ("+closewindow+") Button");
				if (closewindow.equalsIgnoreCase("close window")) {
//					selectWindow("name=TechSupport");
					closeWindowWebdriver();
					selectMainWindowWebdriver();
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
