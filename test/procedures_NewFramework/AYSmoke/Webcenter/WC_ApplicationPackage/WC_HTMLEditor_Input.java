package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

//import com.thoughtworks.selenium.webdriven.commands.waitForPageToLoadWebdriver;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_HTMLEditor_Input extends CommonSeleniumActions implements OR {
	public static String GetHTML;


	@Test(description="This Procedure is used to perform some operation in 'HTML Editor' page")
	public void WC_HTMLEditor_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'HTML Editor' Page");
			String[] testdata = datacontainer;
			String textarea = testdata[0];
			String button = testdata[1];
			Reporter.log("Input Test Data was retrieved for 'HTML Editor' Page");
//			waitForElementPresentWebdriver(attributeName_name, CDT_HtmlEditorBtn, "HTML Edit Button");
			String lastname = textarea+Calendar.getInstance().getTimeInMillis();
			if (!textarea.equals("")) {
				Reporter.log("Step 1 - Enter the Dynamic Text  Area as ["+textarea+"]");
				//waitForPageToLoadWebdriver();
				/* WebElement frame = driver.findElement(By.tagName("iframe"));
				 driver.switchTo().frame(frame);*/
				//recentOpenedPopupSelectWebdriver("HTML");
				 WebElement elem = driver.findElement(By.xpath("//body/h2"));
		         elem.click();
		         Thread.sleep(10000L);
		         elem.sendKeys(lastname);
		         Runtimedatawrite(lastname, textarea);
	            //switchToDefaultContentWebdriver();
			}
			if (!button.equals("")) {
				if (button.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_xpath, ASR_BackBtn);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Edit with HTML Editor")) {
					clickWebdriver(attributeName_xpath, CDT_HtmlEditorBtn);
					recentPopupSelectWebdriver("HTML Editor");
				}else if (button.equalsIgnoreCase("Save")) {
					clickWebdriver(attributeName_xpath, AS_SaveBtn);
					waitForPageToLoadWebdriver();
				}else if (button.equalsIgnoreCase("Undo")) {
					clickWebdriver(attributeName_xpath, CDT_UndoBtn);
				}else if (button.equalsIgnoreCase("Preview")) {
					clickWebdriver(attributeName_xpath, CDT_PreviewBtn);
					recentPopupSelectWebdriver("Dynamic Text/Instruction Preview");
				}else if (button.equalsIgnoreCase("Update")) {
					clickWebdriver(attributeName_id, "btnSubmit");
//					waitForPageToLoadWebdriver();
					selectMainWindowWebdriver();
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}

	}

}



