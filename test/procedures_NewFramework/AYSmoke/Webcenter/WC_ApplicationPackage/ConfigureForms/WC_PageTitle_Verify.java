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
		
				
		switchToFrameNameIdWebdriver("frmContent");
		if (!pagetitle.equals(""))
		{
			waitForElementPresentWebdriver(attributeName_xpath, PT_PageName+pagetitle+"Rules']//font", pagetitle);
			verifyElementContainsTextWebdriver(attributeName_xpath, PT_PageName+pagetitle+"Rules']//font", pagetitle, pagetitle);
			
		}
		
		
		if(!showhide.equals(""))
		{
			if(showhide.equalsIgnoreCase("show"))
			{
				waitForElementPresentWebdriver(attributeName_xpath, PT_ShowHide+showhide+"')]", showhide);
				clickWebdriver(attributeName_xpath, PT_ShowHide+showhide+"')]");
				
			}
			
			else if(showhide.equalsIgnoreCase("hide"))
			{
				waitForElementPresentWebdriver(attributeName_xpath, PT_ShowHide+showhide+"')]", showhide);
				clickWebdriver(attributeName_xpath, PT_ShowHide+showhide+"')]");
				
			}
				
			
		}
		
		if(!verifyui.equals(""))
		{
			waitForElementPresentWebdriver(attributeName_xpath, PT_Instructions,  verifyui);
			verifyElementContainsTextWebdriver(attributeName_xpath, PT_Instructions, verifyui, verifyui);
		}
		
		switchToDefaultContentWebdriver();
		
		
				
	}
	
	
	


}
