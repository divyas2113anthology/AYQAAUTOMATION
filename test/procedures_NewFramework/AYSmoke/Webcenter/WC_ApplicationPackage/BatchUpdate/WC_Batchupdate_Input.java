package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.BatchUpdate;

import java.sql.Date;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_Batchupdate_Input extends CommonSeleniumActions implements OR
{
	@Test(description="This Procedure is to perform some Verification in 'Batch Update' page")
	public void WC_Batchupdate_Input() throws Exception{
	try {
		writeDetails();
		Reporter.log("Proceed to retrieve Verify Test Data 'Batch Update' page");
		String[]  fpvdatarepo = datacontainer;
		String APP_SYS = fpvdatarepo[0];
		String Average_GPA = fpvdatarepo[1];
		String Cell_Phone = fpvdatarepo[2];
		String Dateofbirth = fpvdatarepo[3];
		String Grade_Level = fpvdatarepo[4];
		String Middlename = fpvdatarepo[5];
		String PMT_TYPE = fpvdatarepo[6];
		String SchoolGPA = fpvdatarepo[7];
		String SportsInterest = fpvdatarepo[8];
		String SSN = fpvdatarepo[9];
		String Suffix = fpvdatarepo[10];
		String TOFEL = fpvdatarepo[11];
		String UID = fpvdatarepo[12];
		String Removeanswers = fpvdatarepo[13];
		String Submit = fpvdatarepo[14];
		String Back = fpvdatarepo[15];
		Reporter.log("Verify Test Data was retrieved for 'Batch Update' page");
		if (!APP_SYS.equals("")) {
			Reporter.log("Step 1 - Verify Message("+APP_SYS+") was displayed correctly");
			
			
		}
		if (!Average_GPA.equals("")) {
			Reporter.log("Step 2 - Verify its navigate to ("+Average_GPA+") page");
			
		}
		if (!Cell_Phone.equals("")) {
			Reporter.log("Step 3 - Verify its navigate to ("+Cell_Phone+") page");
			
		}
		if (!Dateofbirth.equals("")) {
			Reporter.log("Step 4 - Verify its navigate to ("+Dateofbirth+") page");
			
		}
		if (!Grade_Level.equals("")) {
			Reporter.log("Step 5 - Verify its navigate to ("+Grade_Level+") page");
			
		}
		if (!Middlename.equals("")) {
			Reporter.log("Step 6 - Verify its navigate to ("+Middlename+") page");
			
		}
		if (!PMT_TYPE.equals("")) {
			Reporter.log("Step 7 - Verify its navigate to ("+PMT_TYPE+") page");
			
		}
		if (!SchoolGPA.equals("")) {
			Reporter.log("Step 8 - Verify its navigate to ("+SchoolGPA+") page");
			
		}
		if (!SportsInterest.equals("")) {
			Reporter.log("Step 9 - Verify its navigate to ("+SportsInterest+") page");
			//String Sportsintrestpd = getAttributeWebdriver(attributeName_xpath, BU_SportsInterest, "Sports Interest");
			// String Sportsintrestpd = getElementIDbyLabel("Sports Interest", BU_SportsInterest);
//			System.out.println(Sportsintrestpd);
//			writeConsole(Sportsintrestpd);
			select(BU_SportsInterest,SportsInterest);	
		}
		if (!SSN.equals("")) {
			Reporter.log("Step 10 - Verify its navigate to ("+SSN+") page");
					
		}
		if (!Suffix.equals("")) {
			Reporter.log("Step 11 - Verify its navigate to ("+Suffix+") page");
			
		}
		if (!TOFEL.equals("")) {
			Reporter.log("Step 12 - Verify its navigate to ("+TOFEL+") page");
			
		}
		if (!UID.equals("")) {
			Reporter.log("Step 13 - Verify its navigate to ("+UID+") page");
			
		}
		if (!Removeanswers.equals("")) {
			Reporter.log("Step 14 - Verify its navigate to ("+Removeanswers+") page");
			
		}
		if (!Submit.equals("")) {
			Reporter.log("Step 15 - Verify its navigate to ("+Submit+") page");
			if(Submit.equalsIgnoreCase("Submit")){
				click(BU_Submit);
				waitForPageToLoad();
			}
			
		}
		if (!Back.equals("")) {
			Reporter.log("Step 16 - Verify its navigate to ("+Back+") page");
			
		}
		
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	//endExecutionOrder(j);
//	Reporter.log("##########End of Execution Order ["+j+"]##########");
	}
}



