package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class 	MC_AddEditSectionRule_Input extends CommonSeleniumActions implements OR{
	@Test(description="This Procedure is to perform some Operation in 'Add/Edit Section Rule' page")
	public void MC_AddEditSectionRule_Input(){
	try{
		Reporter.log("Proceed to click on package name in quick view screen of Maintenance center");
		String[] testdata = datacontainer;
		String name = testdata[0];
		String description = testdata[1];
		String section = testdata[2];
		String field = testdata[3];
		String operator = testdata[4];
		String value = testdata[5];
		String valueType = testdata[6];
		String button = testdata[7];
		Reporter.log("Check user clicked on application package in Maintenance center");
		if (!name.equals("")) {
			Reporter.log("Step 1 - Enter the Section Name as ["+name+"]");
			waitForElementPresentWebdriver(attributeName_xpath, ESR_Name, name);
			sendKeys(attributeName_xpath, ESR_Name, name);
		}
		if (!description.equals("")) {
			Reporter.log("Step 2 - Enter the Section Description as ["+description+"]");
			sendKeys(attributeName_xpath, ESR_Description, description);
		}
		if (!section.equals("")) {
			Reporter.log("Step 3 - Select the Section as ["+section+"]");
			/*waitForElementPresentWebdriver(attributeName_xpath, ESR_Section, section);
			selectByVisibleTextWebdriver(attributeName_xpath, ESR_Section, section);*/
			//select(ESR_Section, "regexp:"+section);
			waitForElementPresentWebdriver(attributeName_xpath, "//input[@name='SectionInput']",section);
			clickWebdriver(attributeName_xpath, "//input[@name='SectionInput']");
			Reporter.log("Step 2 - Perform the operation to click the Package as ["+section+"]");
//			waitForElementPresentWebdriver(attributeName_xpath, "//div[@id='divTree']", "Package Page");
			String [] SplitPackage = section.split(";");
			System.out.println("Length : "+SplitPackage.length);
			System.out.println("Package1"+SplitPackage[0]);
			System.out.println("Package1"+SplitPackage[1]);
			for (int i = 0; i < SplitPackage.length; i++) {
				writeConsole("Tree Package"+i+":"+SplitPackage[i]);
				if (i== SplitPackage.length-1) {
					waitForPageToLoadWebdriver();
					Thread.sleep(5000);
					//waitForElementPresentWebdriver(attributeName_xpath, "//a[text()='"+SplitPackage[i]+"']", SplitPackage[i]);
					clickWebdriver(attributeName_xpath, "//a[text()='"+SplitPackage[i]+"']");
					waitForPageToLoadWebdriver();

				}else{
					System.out.println(SplitPackage[i]);
					//PackageSelection(SplitPackage[i], "1");
					waitForPageToLoadWebdriver();
					//waitForElementPresentWebdriver(attributeName_xpath, "//a[text()='"+SplitPackage[i]+"']", SplitPackage[i]);
					clickWebdriver(attributeName_xpath, "//span[text()='"+SplitPackage[i]+"']");
					waitForPageToLoadWebdriver();

				}
			}
			//ClosePackageSelection();
		}
		//switchToDefaultContentWebdriver();
		//waitForElementPresentWebdriverWait(attributeName_xpath, "//select[option[contains(text(),'Personal Data')]]", "Personal Data");
		waitForPageToLoadWebdriver();
		if (!field.equals("")) {
			Reporter.log("Step 4 - Select the field as ["+field+"]");
			waitForPageToLoadWebdriver();
			//waitForElementPresentWebdriver(attributeName_xpath, ESR_Field, field);
//			WebElement select = driver.findElement(By.xpath("//select[contains(@name,'txtField')]"));
//			List<WebElement> options = select.findElements(By.tagName("option"));
////			writeConsole("List Option : "+options);
//			for (WebElement option : options) {
//				String Opt = option.getText().trim();
//				writeConsole("List Option One : "+Opt);
//			    if(field.equals(option.getText().trim()))
//			        option.click();   
//			}
//			selectByIndexWebdriver(attributeName_xpath, ESR_Field, Integer.parseInt(field));
			//select(ESR_Field, "regexp:"+field);
			//selectByValueWebdriver(attributeName_xpath,ESR_Field, field);
			//selectByVisibleTextWithTrimSpaceWebdriver(attributeName_xpath, ESR_Field, field);
			//selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, ESR_Field, field);
			//--start--Rahul Mehta
			clickWebdriver(attributeName_xpath,"//button[contains(@title,'Please Select')]");
			sendKeys(attributeName_xpath,"//input[@placeholder='Search']",field);
			clickWebdriver(attributeName_xpath,"//label[contains(text(),'"+field+"')]");



			//--end--Rahul Mehta

//			selectByVisibleTextWebdriver(attributeName_xpath, "//select[contains(@name,'txtField')][option]", field);
		}
		if (!operator.equals("")) {
			Reporter.log("Step 5  - Select the operator as ["+operator+"]");
			//clickWebdriver(attributeName_xpath,"//select[@class='FormFields FormFieldsWide']");
			//clickWebdriver(attributeName_xpath,"//*[@id=\"G1-row1\"]/td[3]/select/option[9]"+field+"')]");
			//selectByVisibleTextWebdriver(attributeName_xpath, ESR_Operator, operator);
			//selectByVisibleTextWithSpaceWebdriver(attributeName_xpath,ESR_Operator1,operator);
			if(isElementPresentWebdriver(attributeName_xpath,ET_Operator1)) //Modified by Saran kumar 9_Nov_2022
			{
				selectByVisibleTextWebdriver(attributeName_xpath, ET_Operator1, operator);

			}else{
				selectByVisibleTextWebdriver(attributeName_xpath, ET_Operator, operator);
			}
		}
		if (!value.equals("")) { //MC_SR_SelectMenu
			Reporter.log("Step 6 - Select the value as ["+value+"]");
			if (value.equalsIgnoreCase("")){
				waitForElementPresentWebdriver(attributeName_xpath, ESR_ValueSelect, field);
				//if(booleanElementPresentWebdriver(attributeName_xpath, ESR_ValueSelect, value));
				waitForPageToLoadWebdriver();
				clickWebdriver(attributeName_xpath, "//button[contains(@class,'ui-multiselect')]");
				//selectByValueWebdriver(attributeName_xpath, ESR_ValueSelect, value);
				clickWebdriver(attributeName_xpath, "//div[contains(@class,'multiselect-menu') and contains(@style, 'display: block')]//span[text()='"+value+"']/preceding-sibling::input");
				clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
				//sendKeys(attributeName_xpath, ESR_ValueText, value);
			} else if (value.equalsIgnoreCase("123-123-1234")) {
				Reporter.log("Step 6 - Select the value as [" + value + "]");
				waitForElementPresentWebdriver(attributeName_xpath, ESR_ValueSelect, field);
				//if(booleanElementPresentWebdriver(attributeName_xpath, ESR_ValueSelect, value));
				waitForPageToLoadWebdriver();
				clickWebdriver(attributeName_xpath, ESR_ValueSelect);
				//selectByValueWebdriver(attributeName_xpath, ESR_ValueSelect, value)
				// ;
				sendKeys(attributeName_xpath,ESR_ValueSelect,value);
				//clickWebdriver(attributeName_xpath, "//div[contains(@class,'multiselect-menu') and contains(@style, 'display: block')]//span[text()='" + value + "']/preceding-sibling::input");
				//clickWebdriver(attributeName_xpath, MQ_MulitSelectClose);
			}
		}


		/*else{
				clickWebdriver(attributeName_xpath, MC_SR_SelectMenu);
				waitForPageToLoadWebdriver();
				clickWebdriver(attributeName_xpath, MC_SR_Values+value+"')]");
			}*/

		if (!valueType.equals("")) {
			Reporter.log("Step 7 - Enter the value  as ["+valueType+"]");
			sendKeys(attributeName_xpath, ESR_ValueText, valueType);
			sleep(1); //Added by Rahul Mehta
		}

		if (!button.equals("")) {
			Reporter.log("Step 8 - Click the name of the button as ["+button+"]");
			if (button.equalsIgnoreCase("Save")) {
				waitForElementPresentWebdriver(attributeName_xpath, ESR_Save, button);
				clickWebdriver(attributeName_xpath, ESR_Save);
				waitForPageToLoadWebdriver();
				sleep(2); //Added by rahul mehta
			}else if (button.equalsIgnoreCase("Cancel")) {
				clickWebdriver(attributeName_xpath, ESR_Cancel);
				waitForPageToLoadWebdriver();
			}
		}
		
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}

