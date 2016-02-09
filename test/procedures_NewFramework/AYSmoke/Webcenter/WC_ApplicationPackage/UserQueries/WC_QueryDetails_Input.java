package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.UserQueries;

import or.OR;

import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class WC_QueryDetails_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Manage Queries' page")
	public void WC_QueryDetails_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Manage User Queries'Page");
			String[] testdata = datacontainer;
			String queryname = testdata[0];
			String description = testdata[1];
			String folder = testdata[2];
			String save = testdata[3];
			/*if(queryname.equalsIgnoreCase("QueriesTest")){
				
				clickWebdriver(attributeName_xpath, MQ_QuerySave);
			}
			*/
			if(!queryname.equals("")){
				Reporter.log("Enter the Query Name");
				sendKeys(attributeName_xpath, MQ_QueryName, queryname);
				
				
			if(!description.equals("")){
				Reporter.log("Enter the Description");
				sendKeys(attributeName_xpath, MQ_QueryDescription, description);
				
			}			
			if (!save.equals("")) {
				Reporter.log("Click on Save");
				if(save.equals("Save")){					
				waitForElementPresentWebdriverWait(attributeName_xpath, MQ_QuerySave1 , save);   
				clickWebdriver(attributeName_xpath, MQ_QuerySave1);
				}
				else
				{
					waitForElementPresentWebdriverWait(attributeName_xpath, MQ_QuerySave , save);   
					clickWebdriver(attributeName_xpath, MQ_QuerySave);
				}
				
			}
			}
			
			
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
