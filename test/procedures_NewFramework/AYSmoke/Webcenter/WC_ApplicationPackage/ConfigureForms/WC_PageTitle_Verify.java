package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;


import org.testng.annotations.Test;

import processor.CommonSeleniumActions;
import or.OR;

public class WC_PageTitle_Verify extends CommonSeleniumActions implements OR{
	@Test(description="Verify Show hide instructions in section and subsection rules")
		
	public void WC_PageTitle_Verify() throws Exception
	{
		String [] testdata=datacontainer;
		String pagetitle=testdata[0];
		String showhide=testdata[1];
		String verifyui=testdata[2];
		
				

		if (!pagetitle.equals(""))
		{
			if(pagetitle.equalsIgnoreCase("")){
				waitForElementPresentWebdriver(attributeName_xpath, SR_PageName+pagetitle+"Rules']//font", pagetitle);
				verifyElementContainsTextWebdriver(attributeName_xpath, SR_PageName+pagetitle+"Rules']//font", pagetitle, pagetitle);

			}else if (pagetitle.equalsIgnoreCase("")) {
			waitForElementPresentWebdriver(attributeName_xpath, "//font[contains(text(),'"+pagetitle+"')]", pagetitle);
			verifyElementContainsTextWebdriver(attributeName_xpath, "//font[contains(text(),'"+pagetitle+"')]", pagetitle, pagetitle);

		}
		}
		
		
		if(!showhide.equals(""))
		{
			if(showhide.equalsIgnoreCase("show"))
			{
				switchToFrameNameIdWebdriver("frmContent");
				waitForElementPresentWebdriver(attributeName_xpath, SR_ShowHide+showhide+"')]", showhide);
				clickWebdriver(attributeName_xpath, SR_ShowHide+showhide+"')]");
				
			}
			
			else if(showhide.equalsIgnoreCase("hide"))
			{

				waitForElementPresentWebdriver(attributeName_xpath, SR_ShowHide+showhide+"')]", showhide);
				clickWebdriver(attributeName_xpath, SR_ShowHide+showhide+"')]");
				
			}
				
			
		}
		
		if(!verifyui.equals(""))
		{
			waitForElementPresentWebdriver(attributeName_xpath, SR_Instructions,  verifyui);
			verifyElementContainsTextWebdriver(attributeName_xpath, SR_Instructions, verifyui, verifyui);
		}
		
		//switchToDefaultContentWebdriver();// removing this code for this  72145 tc
		
		
				
	}
	
	
	


}
