package procedures_NewFramework.AYSmoke.Webcenter;

import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class WC_Welcome_Input extends CommonSeleniumActions implements OR {
	
	@Test(description="This Procedure is used to perform some operation in 'Welcome' page")
	public void WC_Welcome_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Welcome' Page");
			String[] testdata = datacontainer;
			String weltopupdatelogout = testdata[0];
			String welpackage = testdata[1];
			String welmenulinks = testdata[2];
			String link_to_click = testdata[3];

			Reporter.log("Input Test Data was retrieved for 'Welcome' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
			if (!weltopupdatelogout.equals("")) {
				Reporter.log("Step 1 - Click the link as ["+weltopupdatelogout+"]");
				waitForElementPresentWebdriverWait(attributeName_partiallinktext, weltopupdatelogout, weltopupdatelogout);
				clickWebdriver(attributeName_partiallinktext, weltopupdatelogout);
				driver.manage().deleteAllCookies();
				System.out.println("Cookies cleared");
				waitForPageToLoadWebdriver();
			}
			if (!welpackage.equals("")) {
				Reporter.log("Step 2 - Select the Name of the Package as ["+welpackage+"]");
				String [] splitPackage = welpackage.split(";");
				for (int i = 0; i < splitPackage.length; i++) {
					if (i == splitPackage.length-1) {
						waitForElementPresentWebdriverWait(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']", "Page Name");
						if (splitPackage[i].equals("Add a QuickAdd Application")) {
							waitForElementPresentWebdriverWait(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']", "welpackage");
							clickWebdriver(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']");
							recentPopupSelectWebdriver("Quick Add");
						}else {
							waitForElementPresentWebdriverWait(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']", "welpackage");   
						clickWebdriver(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']");
						waitForPageToLoadWebdriver();
						}
					}else {
						waitForElementPresentWebdriverWait(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']", "welpackage");
						waitForPageToLoadWebdriver();
						mouseOverWebdriver(attributeName_xpath,"//*[text()='"+splitPackage[i]+"']");
						/*Actions actions = new Actions(driver);
						WebElement element = driver.findElement(By.xpath(".//div[contains(text(),'Select a System')]"));
						actions.moveToElement(element).build().perform();
						WebElement element1 = driver.findElement(By.xpath(".//div[contains(text(),'Application System')]"));
						actions.moveToElement(element1).build().perform();
						driver.findElement(By.linkText("Application for QA Automation")).click();*/

					}
				}
			}			
			if (!welmenulinks.equals("")) {
				Reporter.log("Step 3 - Click the Name of the Menu Link as ["+welmenulinks+"]");
				if (welmenulinks.equalsIgnoreCase("Training")) {
					waitForElementPresentWebdriver(attributeName_partiallinktext, "Training", welmenulinks);
					clickWebdriver(attributeName_partiallinktext, "Training");
					waitForPageToLoadWebdriver();
				}else if (welmenulinks.equalsIgnoreCase("CRM")) 
				{
				clickWebdriver(attributeName_linktext, welmenulinks);
				waitForPageToLoadWebdriver();
				}	
			}	
			if (!link_to_click.equals("")) {
				Reporter.log("Step 4 - Click the Name of the Link as ["+link_to_click+"]");				
				if (link_to_click.equalsIgnoreCase("logout")) 
				{
					if(link_to_click.equalsIgnoreCase("logouttree"))
					{
						driver.switchTo().frame("frmTreeMenu");
					    clickWebdriver(attributeName_xpath, WClogoutLink);
					}
					else
					{
						clickWebdriver(attributeName_partiallinktext, link_to_click);
					}
				}else if(link_to_click.equalsIgnoreCase("online support top"))
					{
					clickWebdriver(attributeName_xpath, WebcenteOnlineSupportTop);
					recentPopupSelectWebdriver("Online Support");
					}
				else if (link_to_click.equalsIgnoreCase("online support bottom"))
					{
					clickWebdriver(attributeName_xpath, WebcenteOnlineSupportBottom);
					recentPopupSelectWebdriver("Online Support");
					}
				else if (link_to_click.equalsIgnoreCase("Product Suggestions")) 
					{
					clickWebdriver(attributeName_xpath, WebcenteProdSug);
					recentPopupSelectWebdriver("Product Suggestions");
					}	
			}
		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}
		
	}

}
