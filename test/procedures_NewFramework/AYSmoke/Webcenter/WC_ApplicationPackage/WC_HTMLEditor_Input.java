package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage;

import java.util.Calendar;
import java.util.Iterator;

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
			Iterator<String> windows = driver.getWindowHandles().iterator();
			String parent = windows.next();
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
				System.out.println("==="+parent);
				System.out.println("====Main window"+mainwindow);
				recentOpenedPopupSelectWebdriver(parent);
			//	recentOpenedPopupSelectWebdriver(mainwindow);
				//switchToDefaultContentWebdriver();
				clickWebdriver(attributeName_xpath,"//span[text()='HTML']");
				//driver.switchTo().frame("ctlRAD_contentIframe");
				 WebElement elem = driver.findElement(By.xpath("//td/textarea[2]"));
		     //    elem.click();
		         elem.sendKeys("<h3>"+lastname+"</h3>");
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
					selectMainWindowWebdriver(parent);
				}
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}

	}

}



