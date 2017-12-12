package procedures_NewFramework.AYSmoke.Application_Classic;

import jxl.read.biff.BiffException;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.io.IOException;

public class PIN_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is to perform some Operation in 'PIN' page")
	public void PIN_Input() throws RowsExceededException, BiffException, WriteException, IOException{
		try {
			
			writeDetails();
//			headerStatement("PIN_Input");
//			startExecutionOrder(j);
//			writeParametersTable();
			Reporter.log("Proceed to retrieve Input Test Data for 'PIN' page");
			String[]  pinidatarepo = datacontainer;
			String pin = pinidatarepo[0];
			String loginbutton = pinidatarepo[1];
			Reporter.log("Input Test Data was retrieved for 'PIN' page");
			if (!pin.equals("")) {
				Reporter.log("Proceed to Get 'PIN' number");
				String Pin = getTextWebdriver(attributeName_xpath,PinNumber);
				System.out.println("PIN IS  "+Pin);
	//			System.out.println("1");
				String[] PinSplit = Pin.split("  ");
	//			System.out.println("Length"+PinSplit.length);
	//			for (int i = 0; i < PinSplit.length; i++) {
	//				System.out.println("Value"+PinSplit[i]);
	//			}
	//			System.out.println("2");
				String PinNumber = PinSplit[1];
	//			System.out.println("3");
				Reporter.log("Proceed to Write PIN Number as ("+PinNumber+") in the Excel Sheet(C:/Selenium/InputTestdata.xls)");

	//			System.out.println("4");
				Runtimedatawrite(PinNumber,pin);
	//			System.out.println("5");
			}
			if (!loginbutton.equals("")) {
				Reporter.log("Proceed to Click on ("+loginbutton+")");
				if (loginbutton.equalsIgnoreCase("login")) {
					clickWebdriver(attributeName_xpath,CreateAcctLogin);
					waitForPageToLoadWebdriver();
				}			
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}

}
