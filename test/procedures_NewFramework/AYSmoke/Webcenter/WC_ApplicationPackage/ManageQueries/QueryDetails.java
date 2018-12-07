package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ManageQueries;


import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;


public class QueryDetails extends CommonSeleniumActions implements OR {

	
	@Test(description="This Procedure is to perform some Operation in 'Query Details' page")
	public void WC_ManageQueries_Input () throws Exception{
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Query Details' page");
			String[]  applicantwelidatarepo = datacontainer;
			String queryname =applicantwelidatarepo[0];
			String description =applicantwelidatarepo[1];
			String folder=applicantwelidatarepo[2];
			String lock=applicantwelidatarepo[3];
			String buttontoclick=applicantwelidatarepo[4];
			
			if (!queryname.equals("")) {
				Reporter.log("query name as ["+queryname+"]");
				sendKeys(attributeName_xpath,DetailQuery_queryname_input,queryname);
			}
			if (!description.equals("")) {
				Reporter.log("description as ["+description+"]");
				sendKeys(attributeName_xpath,DetailQuery_Description_input,description);
			}
			if (!folder.equals("")) {
				Reporter.log("folder as ["+folder+"]");
				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,DetailQuery_Folder,folder);
			}
			if (!lock.equals("")) {
				Reporter.log("lock  ["+lock+"]");
				clickWebdriver(attributeName_xpath,DetailQuery_Lock_input);
			}
			if (!buttontoclick.equals("")) {
				Reporter.log("button to click  ["+buttontoclick+"]");
				clickWebdriver(attributeName_xpath,DetailQuery_run_button);
			}
	} catch (Exception e) {
		writeFailure(e.getLocalizedMessage());
	}
	}
}
