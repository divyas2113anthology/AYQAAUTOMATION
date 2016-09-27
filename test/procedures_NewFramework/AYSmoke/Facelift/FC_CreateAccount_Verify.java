package procedures_NewFramework.AYSmoke.Facelift;

import javax.swing.plaf.SplitPaneUI;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.base.Splitter;

import or.OR;
import processor.CommonSeleniumActions;

public class FC_CreateAccount_Verify extends CommonSeleniumActions implements	OR {
	

	@Test(description="This Procedure is to perform some Verification in 'Application Status: Ready for Submission' page")
	public void FC_CreateAccount_Verify() throws Exception{
		try {
			writeDetails();
			String[]  appstatusvdatarepo = datacontainer;
			String confirmed_fstname = appstatusvdatarepo[0];
			Reporter.log("Verify Test Data was retrieved for 'Application Status: Ready for Submission' page");
			if (!confirmed_fstname.equals("")) {
				Reporter.log("Step 1 - Verify Confirmation Applicant Name ");
				String GetFstName = getTextWebdriver(attributeName_name,"CA_ConfirmedFstname");
//				System.out.println("Veiryf Text:" +GetFstName);
				String[] SplitedFstName = GetFstName.split(",");
//				System.out.println("Veiryf Text:" +SplitedFstName);
				if (confirmed_fstname.equals(SplitedFstName)) {
					verifyElementContainsTextWebdriver(attributeName_cssselector,CA_ConfirmedFstname, "Applicant First Name", confirmed_fstname+",");
				}
			}
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
	}
	

}
