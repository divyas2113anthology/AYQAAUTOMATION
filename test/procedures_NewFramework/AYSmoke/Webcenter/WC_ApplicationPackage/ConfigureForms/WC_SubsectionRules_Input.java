package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;


import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class WC_SubsectionRules_Input extends CommonSeleniumActions implements OR{

		@Test(description="Verify inputs fields subsection rules page in webcenter config forms")
	public void WC_SubsectionRules_Input() throws Exception
		{
			String[] testData=datacontainer;
			String button=testData[0];
			String linkText=testData[1];
			String checkbox=testData[2];
			String subsectionname=testData[3];
			String description=testData[4];
			String subsection=testData[5];
			String field=testData[6];
			String operator=testData[7];
			String value=testData[8];
						
			switchToFrameNameIdWebdriver("frmContent");
			if(!button.equalsIgnoreCase(""))
			{
			   
			   waitForElementPresentWebdriver(attributeName_xpath, SR_buton+button+"')]", button);
			   if (button.equalsIgnoreCase("add")) {
				   Reporter.log("Verify ADD");
					clickWebdriver(attributeName_xpath, SR_buton+button+"')]");
					//selenium.keyPressNative("10");
					
				}else if (button.equalsIgnoreCase("delete")) {
					Reporter.log("Verify DELETE");
					clickWebdriver(attributeName_xpath, SR_buton+button+"')]");
					waitForPageToLoadWebdriver();
				}
				else if (button.equalsIgnoreCase("print")) {
					Reporter.log("Verify PRINT Button");
					clickWebdriver(attributeName_xpath, SR_buton+button+"')]");
					waitForPageToLoadWebdriver();
				}
				else if (button.equalsIgnoreCase("save")) {
					 Reporter.log("Verify SAVE Button");						
				     clickWebdriver(attributeName_xpath, SR_buton+button+"')]");
					waitForPageToLoadWebdriver();						
				
			    }
				else if (button.equalsIgnoreCase("cancel")) {
					Reporter.log("Verify Cancel Button");
					clickWebdriver(attributeName_xpath, SR_buton+button+"')]");
					waitForPageToLoadWebdriver();						
			
		        }
			}
					
			
			
			if(!linkText.equalsIgnoreCase(""))
			{
			    Reporter.log("Verify confirmation/Error message");
			    
			}
			
			if(!checkbox.equalsIgnoreCase(""))
			{
			    Reporter.log("Verify List of Subsection Rules");
			    
			    
			}
			switchToDefaultContentWebdriver();
			
		}
			
			
			
		
	}


