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
			String plusMinus=testData[8];
			String button=testData[9];
						
			//switchToFrameNameIdWebdriver("frmContent");
											

			if(!name.equalsIgnoreCase(""))
				
			{
				//switchToFrameNameIdWebdriver("frmContent");
				Reporter.log("Enter Subsection name");
				waitForPageToLoadWebdriver();
				waitForElementPresentWebdriverWait(attributeName_xpath, SR_name, name);
				sendKeys(attributeName_xpath, SR_name, name);
											
			}
			
             if(!description.equalsIgnoreCase(""))
				
			{
				Reporter.log("Enter description");
				waitForElementPresentWebdriverWait(attributeName_xpath, SR_description, description);
				sendKeys(attributeName_xpath, SR_description, description);
				
			}
             
             if (!subsection.equalsIgnoreCase("")) {
 				 Reporter.log("Select subsection" + subsection );
 				 //clickWebdriver(attributeName_xpath, SR_subsection);
 				//sendKeys(attributeName_xpath, SR_subsection, subsection);
				 clickWebdriver(attributeName_xpath, "//input[@name='SubSectionInput']");
				 waitForElementPresentWebdriver(attributeName_xpath, "//a[text()='"+subsection+"']",subsection);
				 mouseOverWebdriver(attributeName_xpath,"//a[text()='"+subsection+"']");
				 clickWebdriver(attributeName_xpath,"//a[text()='"+subsection+"']");
				 sleep(2);
				 Thread.sleep(5000);
 				//clickWebdriver(attributeName_linktext, subsection);

				 /*waitForElementPresentWebdriver(attributeName_xpath, "//input[@name='SubSectionInput']",subsection);
				 clickWebdriver(attributeName_xpath, "//input[@name='SubSectionInput']");
				 Reporter.log("Step 2 - Perform the operation to click the Package as ["+subsection+"]");
       //		 waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='divTree']", "Package Page");
				 String [] SplitPackage = subsection.split(";");
				 System.out.println("Length : "+SplitPackage.length);
				 System.out.println("Package1"+SplitPackage[0]);
				 System.out.println("Package1"+SplitPackage[1]);
				 System.out.println("Package1"+SplitPackage[2]);
				 for (int i = 0; i < SplitPackage.length; i++) {
					 writeConsole("Tree Package"+i+":"+SplitPackage[i]);
					 if (i== SplitPackage.length-1) {
						 waitForPageToLoadWebdriver();
						 Thread.sleep(5000);
						 //waitForElementPresentWebdriver(attributeName_xpath, "//a[text()='"+SplitPackage[i]+"']", SplitPackage[i]);
						 clickWebdriver(attributeName_xpath, "//a[text()='"+SplitPackage[i]+"']");

					 }else{
						 System.out.println(SplitPackage[i]);
						 //PackageSelection(SplitPackage[i], "1");
						 waitForPageToLoadWebdriver();
						 Thread.sleep(5000);
						 //waitForElementPresentWebdriver(attributeName_xpath, "//a[text()='"+SplitPackage[i]+"']", SplitPackage[i]);
						 clickWebdriver(attributeName_xpath, "//span[text()='"+SplitPackage[i]+"']");

					 }
				 }
				 //ClosePackageSelection();
*/
             }	
             if (!field.equalsIgnoreCase("")) {
  				Reporter.log("Select field " + field );
  				waitForPageToLoadWebdriver();
				 //--start--Rahul Mehta
				 clickWebdriver(attributeName_xpath,"//button[contains(@title,'Please Select')]");
				 sendKeys(attributeName_xpath,"//input[@placeholder='Search']",field);
				 clickWebdriver(attributeName_xpath,"//label[contains(text(),'"+field+"')]");
				 //--end--Rahul Mehta
              }	
             
             if (!operator.equalsIgnoreCase(""))
             {
  				Reporter.log("Select operator as" + operator );
  				waitForElementPresentWebdriverWait(attributeName_xpath, SR_operator, operator);
  				selectByVisibleTextWebdriver(attributeName_xpath, SR_operator, operator);
  				
  			  }
             
             if (!value.equalsIgnoreCase(""))
             {
            	 Reporter.log("Select value as" + value );
            	 if(value.equalsIgnoreCase("Yes"))
            	  {
            		 waitForElementPresentWebdriverWait(attributeName_xpath, SR_value_Yes,value);   
            		 clickWebdriver(attributeName_xpath, SR_value_Yes);
            		  
            		 }
            	  else if(value.equalsIgnoreCase("No"))
            	  {
            		  waitForElementPresentWebdriverWait(attributeName_xpath, SR_value_No,value);
            		  clickWebdriver(attributeName_xpath, SR_value_No);  
            	  }	else
            	  {
            		  waitForElementPresentWebdriverWait(attributeName_xpath, MQ_Value, value);
            	 	  sendKeys(attributeName_xpath, MQ_Value, value);
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

				switchToFrameNameIdWebdriver("frmContent");
			    waitForElementPresentWebdriverWait(attributeName_xpath,SR_RuleName+checkbox+"')]]"+SR_CheckBox,checkbox);
			    clickWebdriver(attributeName_xpath,SR_RuleName+checkbox+"')]]"+SR_CheckBox);
			  			    
			}
						

			if(!button.equalsIgnoreCase(""))
			{
				//switchToFrameNameIdWebdriver("frmContent");//Modified by Rahul mehta
				waitForElementPresentWebdriver(attributeName_xpath, SR_button+button+"')]", button);
				if (button.equalsIgnoreCase("add_small")) {
					Reporter.log("Verify ADD");
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");


				}else if (button.equalsIgnoreCase("delete")) {
					Reporter.log("Verify DELETE");
					waitForElementPresentWebdriverWait(attributeName_xpath, SR_button+button+"')]",button);
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");
					alertAccept();

				}
				else if (button.equalsIgnoreCase("print")) {
					Reporter.log("Verify PRINT Button");
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");
				}
				else if (button.equalsIgnoreCase("save")) {
					Reporter.log("Verify SAVE Button");
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");
					sleep(2);  //Added by Rahul Mehta

				}
				else if (button.equalsIgnoreCase("cancel")) {
					Reporter.log("Verify Cancel Button");
					waitForElementPresentWebdriverWait(attributeName_xpath, SR_button+button+"')]",button);
					clickWebdriver(attributeName_xpath, SR_button+button+"')]");

				}
			}
			//switchToDefaultContentWebdriver();
		}

				
		
	}


