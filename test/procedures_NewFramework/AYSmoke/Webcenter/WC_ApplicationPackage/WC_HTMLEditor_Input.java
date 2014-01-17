package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

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
			if (!textarea.equals("")) {
				Reporter.log("Step 2 - Enter the Dynamic Text  Area as ["+textarea+"]");
				Thread.sleep(10000);
				 WebElement frame = driver.findElement(By.tagName("iframe"));
//				 WebElement frame = driver.findElement(By.xpath("//p/b/font/u"));
				 driver.switchTo().frame(frame);
				 
				 clickWebdriver(attributeName_xpath, "//a[@title='HTML']");
				 Thread.sleep(10000);
				 
				 GetHTML = getAttributeWebdriver(attributeName_xpath, "//body/textarea", "innerHTML");
				 writeConsole("Get HTML : "+GetHTML);
				 
//				 GetHTML = getTextWebdriver(attributeName_xpath, "");
//				 WebElement elem = driver.findElement(By.tagName("body"));
//				 WebElement elem = driver.findElement(By.xpath("//body//p"));
//		            elem.click();
//		            elem.sendKeys("HELLO!!!!");
//		        //    driver.SwitchTo().Window(currentWindowHandle);
	//			switchToFrameNameIdWebdriver("ctlRAD_contentIframe");
	//			sendKeys(attributeName_xpath, "//body", textarea);
//				clickWebdriver(attributeName_xpath, attributevalue);
//				String GetMessage = getTextWebdriver(attributeName_xpath, "//b/font");
//				sendKeys(attributeName_name, CDT_TextArea, textarea);
//				sendKeyStroke(attributename, attributevalue, keystroke.);
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
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}

	}

}



