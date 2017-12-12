package procedures_NewFramework.AYSmoke.Application_Classic;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class Signature_Input extends CommonSeleniumActions implements OR {
	

	@Test(description="This Procedure is to perform some Operation in 'Signature Page'")
	public void Signature_Input() throws Exception{
		try {
			writeDetails();
//			headerStatement("Signature_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'Signature Page' ");
			String[]  signatureidatarepo = datacontainer;
			String sigfullname = signatureidatarepo[0];
			String sigdate = signatureidatarepo[1];
			String sigsubmit = signatureidatarepo[2];
			Reporter.log("Input Test Data was retrieved for 'Signature Page' ");
			if (!sigfullname.equals("")) {
				Reporter.log("Step 1 - Enter Full Name as ("+sigfullname+")");
				sendKeys(attributeName_xpath,SP_FullName,sigfullname);
			}
			if (!sigdate.equals("")) {
				Reporter.log("Step 2 - Enter Date as ("+sigfullname+")");
				sendKeys(attributeName_xpath,SP_Date,sigdate);
			}
			if (!sigsubmit.equals("")) {
				Reporter.log("Step 3 - Click on ("+sigsubmit+") Button");
				if (sigsubmit.equalsIgnoreCase("submit")) {
					clickWebdriver(attributeName_xpath, SP_Submit);
					Thread.sleep(8000);
					
				}
			}
		
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
