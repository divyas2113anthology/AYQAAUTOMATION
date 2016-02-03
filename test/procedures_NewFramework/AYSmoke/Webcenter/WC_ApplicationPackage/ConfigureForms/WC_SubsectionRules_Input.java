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
			
			String linkText=testData[0];
			String checkbox=testData[1];
			String name=testData[2];
			String description=testData[3];
			String subsection=testData[4];
			String field=testData[5];
			String operator=testData[6];
			String value=testData[7];
			String plusMinuse=testData[8];
			String button=testData[9];
						
			switchToFrameNameIdWebdriver("frmContent");
											
			if(!button.equalsIgnoreCase(""))
			{
			   
			   waitForElementPresentWebdriver(attributeName_xpath, SR_button+button+"')]", button);
			   if (button.equalsIgnoreCase("add")) {
				   Reporter.log("Verify ADD");
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");
					switchToFrameNameIdWebdriver("frmContent");
					//selenium.keyPressNative("10");
					
				}else if (button.equalsIgnoreCase("delete")) {
					Reporter.log("Verify DELETE");
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");
					waitForPageToLoadWebdriver();
					alertAccept();
					
				}
				else if (button.equalsIgnoreCase("print")) {
					Reporter.log("Verify PRINT Button");
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");
					waitForPageToLoadWebdriver();
				}
				else if (button.equalsIgnoreCase("save")) {
					 Reporter.log("Verify SAVE Button");						
				     clickWebdriver(attributeName_xpath, SR_button+button+"')]");
					waitForPageToLoadWebdriver();
					
				
			    }
				else if (button.equalsIgnoreCase("cancel")) {
					Reporter.log("Verify Cancel Button");
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");
					waitForPageToLoadWebdriver();						
			
		        }
			}
			if(!name.equalsIgnoreCase(""))
				
			{
				Reporter.log("Enter Subsection name");
				sendKeys(attributeName_xpath, SR_name, name);
								
			}
			
             if(!description.equalsIgnoreCase(""))
				
			{
				Reporter.log("Enter description");
				sendKeys(attributeName_xpath, SR_description, description);
				
			}
             
             if (!subsection.equalsIgnoreCase("")) {
 				Reporter.log("Select subsection" + subsection );
 				clickWebdriver(attributeName_xpath, SR_subsection);
 				clickWebdriver(attributeName_linktext, subsection);
 					
 				
             }	
             if (!field.equalsIgnoreCase("")) {
  				Reporter.log("Select field " + field );
  				selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, SR_field, field);
  					
              }	
             if (!operator.equalsIgnoreCase("")) {
  				Reporter.log("Select operator as" + operator );
  				sendKeys(attributeName_name, SR_operator, operator);
  				              }	
             if (!value.equalsIgnoreCase("")) {
            	 Reporter.log("Select value as" + value );
            	  if(value.equalsIgnoreCase("Yes"))
            		 {
            		  clickWebdriver(attributeName_xpath, SR_value_Yes);
            		  
            		 }
            	  if(value.equalsIgnoreCase("NO"))
            	  {
            		  clickWebdriver(attributeName_xpath, SR_value_No);  
            	  }
            	 }
   				
   				  					
               	
              
             
			if(!linkText.equalsIgnoreCase(""))
			{
			    Reporter.log("Click on Rule Name");
			    waitForElementPresentWebdriverWait(attributeName_xpath,SR_RuleName+linkText+"')]]",linkText);
			    clickWebdriver(attributeName_xpath,SR_RuleName+linkText+"')]]");
			    
			}
			
			if(!checkbox.equalsIgnoreCase(""))
			{
			    Reporter.log("Select Check Box next to Rule");
			    waitForElementPresentWebdriverWait(attributeName_xpath,SR_RuleName+checkbox+"')]]"+SR_CheckBox,checkbox);
			    clickWebdriver(attributeName_xpath,SR_RuleName+checkbox+"')]]"+SR_CheckBox);
			   
			    
			}
			
			
			switchToDefaultContentWebdriver();
			
		}
			
			
			
		
	}


