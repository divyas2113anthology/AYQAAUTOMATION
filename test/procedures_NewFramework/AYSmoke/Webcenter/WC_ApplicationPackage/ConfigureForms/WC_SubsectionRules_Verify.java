package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_SubsectionRules_Verify extends CommonSeleniumActions implements OR{

	@Test(description="Verify subsection rule page UI in webcenter config forms")
	public void WC_SubsectionRules_Verify() throws Exception
	{
	
		String[] testData=datacontainer;
		String pageTitle=testData[0];
		String message=testData[1];
		String verifyUI=testData[2];
		switchToDefaultContentWebdriver();
		//switchToFrameNameIdWebdriver("frmContent");  //Added by Rahul Mehta on 08 feb,2019
		
		if(!pageTitle.equalsIgnoreCase(""))

		{
			switchToFrameNameIdWebdriver("frmContent");
		  Reporter.log("Verify page title"+ pageTitle);


		 waitForElementPresentWebdriverWait(attributeName_xpath, configur_page_title+pageTitle+"')]", pageTitle);

			verifyElementPresentWebdriver(attributeName_xpath, configur_page_title+pageTitle+"')]",pageTitle);



		}
				
		if(!message.equalsIgnoreCase(""))
		{
		    Reporter.log("Verify confirmation/Error message");
			switchToFrameNameIdWebdriver("frmContent");
		    waitForElementPresentWebdriverWait(attributeName_xpath, CSC_FormHeading+message+"')]", message);
		    verifyElementPresentWebdriver(attributeName_xpath, CSC_FormHeading+message+"')]", message);
			
		}
		
		if(!verifyUI.equalsIgnoreCase(""))
		{
		    Reporter.log("Verify List of Subsection Rules");
		    waitForElementPresentWebdriverWait(attributeName_xpath, SR_LinkToClick,verifyUI);
		    verifyElementPresentWebdriver(attributeName_xpath, SR_LinkToClick,verifyUI);
		   		    
		}
		 
		switchToDefaultContentWebdriver();
	}
	
}
