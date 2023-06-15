package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.ConfigureForms;


import cucumber.api.java.lu.a;
import org.testng.Reporter;
import org.testng.annotations.Test;
import or.OR;
import processor.CommonSeleniumActions;

public class WC_SubsectionRules_Input extends CommonSeleniumActions implements OR {

    @Test(description = "Verify inputs fields subsection rules page in webcenter config forms")
    public void WC_SubsectionRules_Input() throws Exception {
        String[] testData = datacontainer;

        String linkText = testData[0];
        String checkbox = testData[1];
        String name = testData[2];
        String description = testData[3];
        String subsection = testData[4];
        String field = testData[5];
        String operator = testData[6];
        String value = testData[7];
        String plusMinus = testData[8];
        String button = testData[9];

        //switchToFrameNameIdWebdriver("frmContent");


        if (!name.equalsIgnoreCase(""))
        //switchToDefaultContentWebdriver();
        {
            Reporter.log("Enter Subsection name");
            waitForPageToLoadWebdriver();
           // switchToFrameNameIdWebdriver("frmContent"); //removing for this 72143 testcase

            waitForElementPresentWebdriverWait(attributeName_xpath, SR_name, name);
            sendKeys(attributeName_xpath, SR_name, name);

        }

        if (!description.equalsIgnoreCase("")) {
            Reporter.log("Enter description");
            waitForElementPresentWebdriverWait(attributeName_xpath, SR_description, description);
            sendKeys(attributeName_xpath, SR_description, description);

        }

        if (!subsection.equalsIgnoreCase("")) {
            Reporter.log("Select subsection" + subsection);
            //clickWebdriver(attributeName_xpath, SR_subsection);
            //sendKeys(attributeName_xpath, SR_subsection, subsection);
            if (isElementPresentWebdriver(attributeName_xpath, "//input[@name='SectionInput']")) {
                waitForElementPresentWebdriver(attributeName_xpath,"//input[@name='SectionInput']",subsection);
                clickWebdriver(attributeName_xpath, "//input[@name='SectionInput']");
            } else  {
                waitForElementPresentWebdriver(attributeName_xpath,"//input[@name='SubSectionInput']",subsection);
                clickWebdriver(attributeName_xpath, "//input[@name='SubSectionInput']");
            }
            // have removed "sub"
            String word[]= subsection.split(";");
            String clickfolder = word[0];
            String clickform=word[1];


            if (isElementPresentWebdriver(attributeName_xpath, "//*[@id='browser']/li[@class='expandable']/span[contains(text(),'" + clickfolder + "')]")) {
                clickWebdriver(attributeName_xpath, "//*[@id='browser']/li[@class='expandable']/span[contains(text(),'" + clickfolder + "')]");
                waitForElementPresentWebdriver(attributeName_xpath, "//a[text()='" + clickform + "']", clickform);
                mouseOverWebdriver(attributeName_xpath, "//a[text()='" + clickform + "']");
                clickWebdriver(attributeName_xpath, "//a[text()='" + clickform + "']");
                sleep(2);
                Thread.sleep(5000);
            } else  {
                waitForElementPresentWebdriver(attributeName_xpath, "//a[text()='" + clickform + "']", clickform);
                mouseOverWebdriver(attributeName_xpath, "//a[text()='" + clickform + "']");
                clickWebdriver(attributeName_xpath, "//a[text()='" + clickform + "']");
                sleep(2);
                Thread.sleep(5000);}
//

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
            Reporter.log("Select field " + field);
            waitForPageToLoadWebdriver();
            //--start--Rahul Mehta
            clickWebdriver(attributeName_xpath, "//button[contains(@title,'Please Select')]");
            sendKeys(attributeName_xpath, "//input[@placeholder='Search']", field);
            sleep(1);
            clickWebdriver(attributeName_xpath, "//label[contains(text(),'" + field + "')]");

            //--end--Rahul Mehta
        }

        if (!operator.equalsIgnoreCase("")) {
            Reporter.log("Select operator as" + operator);
            waitForElementPresentWebdriverWait(attributeName_xpath, SR_operator, operator);
            if (isElementPresentWebdriver(attributeName_xpath, SR_operator)) //Modified by Saran kumar 30 Nov 2022
            {
                clickWebdriver(attributeName_xpath,SR_operator);
                clickWebdriver(attributeName_xpath,"(//select[@name='G1-row1_txtOperator1']/option[contains(text(),'"+operator+"')])[1]");
            } else {
                selectByVisibleTextWebdriver(attributeName_xpath, SR_operator1, operator);
            }


        }

        if (!value.equalsIgnoreCase("")) {
            Reporter.log("Select value as" + value);

            if (value.equalsIgnoreCase("Yes")) {
             //   switchToFrameNameIdWebdriver("frmContent");
                waitForElementPresentWebdriverWait(attributeName_xpath, SR_value_Yes, value);
                clickWebdriver(attributeName_xpath, SR_value_Yes);

            } else if (value.equalsIgnoreCase("No")) {
                waitForElementPresentWebdriverWait(attributeName_xpath, SR_value_No, value);
                clickWebdriver(attributeName_xpath, SR_value_No);
            } else {
                waitForElementPresentWebdriverWait(attributeName_xpath, MQ_Value, value);
                sendKeys(attributeName_xpath, MQ_Value, value);
            }
        }

        if (!linkText.equalsIgnoreCase("")) {
            Reporter.log("Click on Rule Name");

            waitForElementPresentWebdriverWait(attributeName_xpath, SR_RuleName + linkText + "')])[1]", linkText);
            clickWebdriver(attributeName_xpath, SR_RuleName + linkText + "')])[1]");

        }

        if (!checkbox.equalsIgnoreCase("")) {
            Reporter.log("Select Check Box next to Rule");

            switchToFrameNameIdWebdriver("frmContent");
            waitForElementPresentWebdriverWait(attributeName_xpath, SR_RuleName + checkbox + SR_CheckBox, checkbox);
            clickWebdriver(attributeName_xpath, SR_RuleName + checkbox + SR_CheckBox);

        }


        if (!button.equalsIgnoreCase("")) {

            //switchToFrameNameIdWebdriver("frmContent");//Modified by Rahul mehta

            if (button.equalsIgnoreCase("add")) {
                switchToFrameNameIdWebdriver("frmContent");
                Reporter.log("Verify ADD");

                waitForElementPresentWebdriver(attributeName_xpath, SR_button + button + "')])[1]", button);
                clickWebdriver(attributeName_xpath, SR_button + button + "')])[1]");


            } else if (button.equalsIgnoreCase("delete")) {
                Reporter.log("Verify DELETE");
                waitForElementPresentWebdriverWait(attributeName_xpath, SR_button + button + "')])[1]", button);
                clickWebdriver(attributeName_xpath, SR_button + button + "')])[1]");
                alertAccept();

            } else if (button.equalsIgnoreCase("print")) {
                Reporter.log("Verify PRINT Button");
                switchToFrameNameIdWebdriver("frmContent");
                clickWebdriver(attributeName_xpath, SR_button + button + "')])[1]");
            } else if (button.equalsIgnoreCase("save")) {
                Reporter.log("Verify SAVE Button");
             //   switchToFrameNameIdWebdriver("frmContent"); // Removed for this test case 72143 by saran kumar

                clickWebdriver(attributeName_xpath, SR_button + button + "')])[1]");
                sleep(2);  //Added by Rahul Mehta

            } else if (button.equalsIgnoreCase("cancel")) {
                Reporter.log("Verify Cancel Button");
                switchToFrameNameIdWebdriver("frmContent");// add for this 72215 testcase by saran kumar
                waitForElementPresentWebdriverWait(attributeName_xpath, SR_button + button + "')])[1]", button);
                clickWebdriver(attributeName_xpath, SR_button + button + "')])[1]");

            }
        }
        //switchToDefaultContentWebdriver();
    }


}


