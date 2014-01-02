package procedures_NewFramework.AYSmoke.MaintenanceCenter;

import java.util.List;

import or.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import processor.CommonSeleniumActions;

public class MC_AddEditSectionRule_Input extends CommonSeleniumActions implements OR{
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
		String button = testdata[6];
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
			waitForElementPresentWebdriver(attributeName_xpath, ESR_Section, section);
//			selectByVisibleTextWebdriver(attributeName_xpath, ESR_Section, section);
			select(ESR_Section, "regexp:"+section);
		}
		if (!field.equals("")) {
			Reporter.log("Step 4 - Select the field as ["+field+"]");
			waitForElementPresentWebdriver(attributeName_xpath, ESR_Field, field);
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
			select(ESR_Field, "regexp:"+field);
//			selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, ESR_Field, field);
			Thread.sleep(3000);
//			selectByVisibleTextWebdriver(attributeName_xpath, "//select[contains(@name,'txtField')][option]", field);
		}
		if (!operator.equals("")) {
			Reporter.log("Step 5  - Select the operator as ["+operator+"]");
			selectByVisibleTextWebdriver(attributeName_xpath, ESR_Operator, operator);
		}
		if (!value.equals("")) {
			Reporter.log("Step 6 - Select the value as ["+value+"]");
			waitForElementPresentWebdriver(attributeName_xpath, ESR_ValueSelect, field);
			selectByValueWebdriver(attributeName_xpath, ESR_ValueSelect, value);
		}
		if (!button.equals("")) {
			Reporter.log("Step 7 - Click the name of the button as ["+button+"]");
			if (button.equalsIgnoreCase("Save")) {
				waitForElementPresentWebdriver(attributeName_xpath, ESR_Save, button);
				clickWebdriver(attributeName_xpath, ESR_Save);
				waitForPageToLoadWebdriver();
			}else if (button.equalsIgnoreCase("Cancel")) {
				clickWebdriver(attributeName_xpath, ESR_Cancel);
				waitForPageToLoadWebdriver();
			}
		}
		
	}catch(Exception e){
		writeFailure(e.getLocalizedMessage());}
	}
}

