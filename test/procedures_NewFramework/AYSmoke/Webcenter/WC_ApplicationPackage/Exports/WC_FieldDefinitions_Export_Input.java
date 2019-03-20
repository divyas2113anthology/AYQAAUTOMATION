package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.Exports;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_FieldDefinitions_Export_Input extends CommonSeleniumActions implements OR {

	@Test(description="This Procedure is used to perform some operation in 'Field Definition Export' page")
	public void WC_FieldDefinitions_Export_Input(){
		try {
			writeDetails();
			Reporter.log("Proceed to retrieve Input Test Data for 'Field Definition Export' Page");
			String[] testdata = datacontainer;
			String fieldquestion = testdata[0];
			String fieldname = testdata[1];
			String itemaction = testdata[2];
			String fieldnameposition = testdata[3];
			String fieldnamelabel = testdata[4];
			String saveback = testdata[5];
			Reporter.log("Input Test Data was retrieved for 'Field Definition Export' Page");
			waitForElementPresentWebdriver(attributeName_name, FD_SaveBtn, saveback);
			switchToFrameNameIdWebdriver("frameQuestionsTree");
			if (!fieldquestion.equals("")) {
				Reporter.log("Select the field question as ["+fieldquestion+"]");
				System.out.println(fieldquestion);
				String [] SplitPackage = fieldquestion.split(";");
//				for (int i = 0; i < SplitPackage.length; i++) {
//					writeConsole("Tree Package : "+SplitPackage[i]);
//					if (i== SplitPackage.length-1) {
//						System.out.println("Verification");
//						clickWebdriver(attributeName_linktext, SplitPackage[i]);
//						waitForPageToLoadWebdriver();
//					}else{
//						PackageSelectionFieldDefinition(SplitPackage[i], "1");
//					}
//				}
				/*WebElement SeconclickName1 = driver.findElement(By.xpath("//b[font[text()='" + SplitPackage[0] + "']]/preceding-sibling::a[@onclick][1]"));
				String seconclickName1 = SeconclickName1.getAttribute("onclick");
				writeConsole("Onclick Value for Section " + seconclickName1);
				String[] secNamespl1 = seconclickName1.split("\\(");
				String[] secnodespl1 = secNamespl1[1].split("\\)");
				String secnode1 = secnodespl1[0];
				writeConsole("Node Value for Section " + secnode1);
				//String nodePlus = selenium.getAttribute("//a[contains(@onclick,'toggle("+secnode+")')]/@onmouseover");
				WebElement NodePlus1 = driver.findElement(By.xpath("//a[contains(@onclick,'toggle(" + secnode1 + ")')]"));
				String nodePlus1 = NodePlus1.getAttribute("onmouseover");
				writeConsole("Plus OuterHTML Value " + nodePlus1);
				if (nodePlus1.contains("Click to expand")) {
					//clickWebdriver(attributeName_xpath, "//a[contains(@onclick,'toggle("+secnode+")')]");
					clickWebdriver(attributeName_xpath, "//b[font[text()='" + SplitPackage[0] + "']]/preceding-sibling::a[img[contains(@src,'plus')]][1]");
				}*/
				//waitForElementPresentWebdriverWait(attributeName_xpath, "//b[font[text()='" + SplitPackage[0] + "']]/preceding-sibling::a[img[contains(@src,'plus')]][1]", SplitPackage[0]);
				//	clickWebdriver(attributeName_xpath, "//b[font[text()='" + SplitPackage[0] + "']]/preceding-sibling::a[img[contains(@src,'plus')]][1]");
				for (int i=0; i < SplitPackage.length; i++) {
					writeConsole("Tree Package : "+SplitPackage[i]);
					/*if(i==0){
						WebElement SeconclickName1 = driver.findElement(By.xpath("//b[font[text()='" + SplitPackage[0] + "']]/preceding-sibling::a[@onclick][1]"));
						String seconclickName1 = SeconclickName1.getAttribute("onclick");
						writeConsole("Onclick Value for Section " + seconclickName1);
						String[] secNamespl1 = seconclickName1.split("\\(");
						String[] secnodespl1 = secNamespl1[1].split("\\)");
						String secnode1 = secnodespl1[0];
						writeConsole("Node Value for Section " + secnode1);
						//String nodePlus = selenium.getAttribute("//a[contains(@onclick,'toggle("+secnode+")')]/@onmouseover");
						WebElement NodePlus1 = driver.findElement(By.xpath("//a[contains(@onclick,'toggle(" + secnode1 + ")')]"));
						String nodePlus1 = NodePlus1.getAttribute("onmouseover");
						writeConsole("Plus OuterHTML Value " + nodePlus1);
						if (nodePlus1.contains("Click to expand")) {
							//clickWebdriver(attributeName_xpath, "//a[contains(@onclick,'toggle("+secnode+")')]");
							clickWebdriver(attributeName_xpath, "//b[font[text()='" + SplitPackage[0] + "']]/preceding-sibling::a[img[contains(@src,'plus')]][1]");
							waitForPageToLoadWebdriver();
						}else{
 							System.out.println("Already Expand");
						}
					}*/
					 if(i==0){
						Reporter.log("Proceed to Click on Plus Buton With its respective Package Name");   //b[a[font[text()='Applicant Detail']]]
						//selenium.waitForCondition("selenium.isElementPresent(\"xpath=(//b[a[font[text()='"+SplitPackage[i]+"']]]/preceding-sibling::a[img[contains(@src,'plus')]][1])\")", "60000");
						//waitForElementPresentWebdriver(attributeName_xpath,"//b[font[text()='"+SplitPackage[i]+"']]/preceding-sibling::a[img[contains(@src,'plus')]][1]","Wait For Package ");
						//b[font[text()='ApplyYourself System fields']]/preceding-sibling::a[img[contains(@src,'plus')]][1]
						//String seconclickName = selenium.getAttribute("xpath=(//b[a[font[text()='"+SplitPackage[i]+"']]]/preceding-sibling::a[img[contains(@src,'plus')]][1])/@onclick");
						WebElement plusMinus = driver.findElement(By.xpath("//b[font[text()='" + SplitPackage[i] + "']]/preceding-sibling::a[1]"));
						String status = plusMinus.getAttribute("onmouseover");
						if(status.contains("Click to expand")) {
							waitForPageToLoadWebdriver();
							WebElement SeconclickName = driver.findElement(By.xpath("//b[font[text()='" + SplitPackage[i] + "']]/preceding-sibling::a[img[contains(@src,'plus')]][1]"));
							//WebElement SeconclickName = driver.findElement(By.xpath("//font[text()='"+SplitPackage[i]+"']/../../preceding-sibling::a[@onclick][1]"));
							String seconclickName = SeconclickName.getAttribute("onclick");
							writeConsole("Onclick Value for Section " + seconclickName);
							String[] secNamespl = seconclickName.split("\\(");
							String[] secnodespl = secNamespl[1].split("\\)");
							String secnode = secnodespl[0];
							writeConsole("Node Value for Section " + secnode);
							//String nodePlus = selenium.getAttribute("//a[contains(@onclick,'toggle("+secnode+")')]/@onmouseover");
							WebElement NodePlus = driver.findElement(By.xpath("//a[contains(@onclick,'toggle(" + secnode + ")')]"));
							String nodePlus = NodePlus.getAttribute("onmouseover");
							writeConsole("Plus OuterHTML Value " + nodePlus);
							if (nodePlus.contains("Click to expand")) {
								clickWebdriver(attributeName_xpath, "//a[contains(@onclick,'toggle(" + secnode + ")')]");
							}
						}else{
							System.out.println("Aleardy Expanded");
						}
					}
					else if (i== SplitPackage.length-1) {
							System.out.println("Verification");
							clickWebdriver(attributeName_linktext, SplitPackage[i]);
							switchToDefaultContentWebdriver();
							switchToFrameNameIdWebdriver("frameActions");
							clickWebdriver(attributeName_xpath, FD_AddItem);
							switchToDefaultContentWebdriver();

							//waitForPageToLoadWebdriver();
						}else{
							PackageSelectionFieldDefinition(SplitPackage[i], "1");
						}
					}sleep(1);
				}
			//ClosePackageSelection();
			switchToDefaultContentWebdriver();
			switchToFrameNameIdWebdriver("frameIntfFieldDef");
			if (!fieldname.equals("")) {
				Reporter.log("Select the field Name as ["+fieldname+"]");
				String[] FieldName = fieldname.split(";");
				if (fieldname.contains("Check")) {
					checkWebdriver(attributeName_xpath, "//font[text()='"+FieldName[0]+"']/preceding-sibling::input[@type='checkbox']");
				}else if (fieldname.contains("Uncheck")) {
					checkWebdriver(attributeName_xpath, "//font[text()='"+FieldName[0]+"']/preceding-sibling::input[@type='checkbox']");
				}
			}
			switchToDefaultContentWebdriver();
			switchToFrameNameIdWebdriver("frameActions");
			if (!itemaction.equals("")) {

				Reporter.log("Click the item action as ["+itemaction+"]");
				if (itemaction.equalsIgnoreCase("Add Item")) {
					waitForElementPresentWebdriver(attributeName_xpath, FD_AddItem, itemaction);
					clickWebdriverWithCoordinates(attributeName_xpath, FD_AddItem);
				}else if (itemaction.equalsIgnoreCase("Insert Item")) {
					clickWebdriver(attributeName_name, FD_InsertItem);
				}else if (itemaction.equalsIgnoreCase("Remove Item")) {
					clickWebdriver(attributeName_name, FD_RemoveItem);
				}

			}
			if (!fieldnameposition.equals("")) {
				Reporter.log("Click the field name position as ["+fieldnameposition+"]");
				if (fieldnameposition.equalsIgnoreCase("Move Down")) {
					clickWebdriver(attributeName_name, FD_MoveDown);
				}else if (fieldnameposition.equalsIgnoreCase("Move Up")) {
					clickWebdriver(attributeName_name, FD_MoveUp);
				}else if (fieldnameposition.equalsIgnoreCase("Remove All")) {
					clickWebdriver(attributeName_xpath, AIT_RemoveAll);
				}else if (fieldnameposition.equalsIgnoreCase("Show Code")) {
					clickWebdriver(attributeName_name, FD_ShowCode);
				}

			}
			switchToDefaultContentWebdriver();
			if (!fieldnamelabel.equals("")) {

			}

			if (!saveback.equals("")) {
				Reporter.log("Click the button as ["+saveback+"]");
				//Modified by Rahul Mehta on 20th March,2019
				if (saveback.equalsIgnoreCase("Save")) {
					sleep(2);
					if(isElementPresent(attributeName_xpath,ImportExport_FD_SaveBtn))
					{
						javaScriptClick(attributeName_xpath,ImportExport_FD_SaveBtn);
					}
					else {
						clickWebdriver(attributeName_name, FD_SaveBtn);
					}
					sleep(1);
					waitForPageToLoadWebdriver();
				}else if (saveback.equalsIgnoreCase("Back")) {
					clickWebdriver(attributeName_name, FD_BackBtn);
					waitForPageToLoadWebdriver();
				}
			}

		} catch (Exception e) {
			writeFailure(e.getLocalizedMessage());
		}

	}

}
