package procedures_NewFramework.AYSmoke.Webcenter.WC_EventPackage.EventModuleEventSearchActions;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class    WC_EventSearchResults_Input extends CommonSeleniumActions implements OR {

    @Test(description = "This Procedure is used to perform some operation in 'Event search results' page")
    public void WC_EventSearchResults_Input() {
        try {
            writeDetails();
            Reporter.log("Proceed to retrieve Input Test Data for 'Event search results' Page");
            String[] testdata = datacontainer;
            String performOperation = testdata[0];
            String eventtitlecheck = testdata[1];
            String eventtitleclick = testdata[2];
            String selectanaction = testdata[3];
            String apply = testdata[4];
            String searchbackgo = testdata[5];
            Reporter.log("Input Test Data was retrieved for 'Event search results' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
            if (!performOperation.equals("") && !eventtitlecheck.equals("")) {
                Reporter.log("Step 1 - Perform the operation to check the checkbox as [" + eventtitlecheck + "]");
                String[] splitevent = eventtitlecheck.split(";");
                if (eventtitlecheck.equals("Event Title")) {
                    String EventTitleName = Runtimedataread(eventtitlecheck);
                    waitForElementPresentWebdriver(attributeName_xpath, "//td/label/a[text()='"+EventTitleName+"']//ancestor::td//preceding-sibling::td/input[@type='checkbox']", eventtitlecheck);
                    clickWebdriver(attributeName_xpath, "//td/label/a[text()='"+EventTitleName+"']//ancestor::td//preceding-sibling::td/input[@type='checkbox']");
                } else {
                    for (int i = 0; i < splitevent.length; i++) {
                        if (performOperation.equalsIgnoreCase("check")) {
                            waitForElementPresentWebdriver(attributeName_xpath, "//td/label/a[text()='"+splitevent[i]+"']//ancestor::td//preceding-sibling::td/input[@type='checkbox']", eventtitlecheck);
                            clickWebdriver(attributeName_xpath," //td/label/a[text()='"+splitevent[i]+"']//ancestor::td//preceding-sibling::td/input[@type='checkbox']");
                        } else if (performOperation.equalsIgnoreCase("uncheck")) {
                            waitForElementPresentWebdriver(attributeName_xpath, "//td[a[text()='" + splitevent[i] + ASR_CheckBox, eventtitlecheck);
                            uncheckWebdriverCheckbox(attributeName_xpath, "//td[a[text()='" + splitevent[i] + ASR_CheckBox);
                        }
                    }

                }
            }
            if (!eventtitleclick.equals("")) {
                Reporter.log("Step 2 - Click the Name of the Record as [" + eventtitleclick + "]");
                if (eventtitleclick.equals("Event Title") || eventtitleclick.equals("BridgeAppFirstName")) {
                    String Eventtitleclick = Runtimedataread(eventtitleclick);
					/*waitForElementPresentWebdriver(attributeName_partiallinktext, Eventtitleclick, Eventtitleclick);
					clickWebdriver(attributeName_partiallinktext, Eventtitleclick);*/
                    //  waitForElementPresentWebdriver(attributeName_xpath, "//td[a[contains(text(),'" + Eventtitleclick + "')]]", eventtitlecheck);
                    //clickWebdriver(attributeName_xpath, "//td[a[contains(text(),'" + Eventtitleclick + "')]]");
                    waitForElementPresentWebdriver(attributeName_xpath, "//td/label/a[contains(text(),'" + Eventtitleclick + "')]", eventtitleclick);
                    clickWebdriver(attributeName_xpath, "//td/label/a[contains(text(),'" + Eventtitleclick + "')]");
                    sleep(2);

                    recentPopupSelectWebdriver("EventRecurrence");
                } else if (eventtitleclick.equalsIgnoreCase("")) {
                   waitForElementPresentWebdriver(attributeName_partiallinktext, eventtitleclick, eventtitleclick);
                    clickWebdriver(attributeName_partiallinktext, eventtitleclick);
                    recentPopupSelectWebdriver("EventRecurrence");

                }

            }
            if (!selectanaction.equals("")) {
                Reporter.log("Step 4 - Select an action as [" + selectanaction + "]");
                selectByVisibleTextWithSpaceWebdriver(attributeName_xpath, EVR_SelectAnAction, selectanaction);
            }
            if (!apply.equals("")) {
                Reporter.log("Step 5 - Select the Radio button as [" + apply + "]");
                if (apply.equalsIgnoreCase("Apply to Selected")) {
                    clickWebdriver(attributeName_xpath, ASR_ApplySelected);
                } else if (apply.equalsIgnoreCase("Apply to All")) {
                    clickWebdriver(attributeName_xpath, ASR_ApplyAll);
                }
            }
            if (!searchbackgo.equals("")) {
                Reporter.log("Step 7 - Click button as [" + searchbackgo + "]");
                if (searchbackgo.equalsIgnoreCase("New Search")) {
                    clickWebdriver(attributeName_xpath, ASR_NewSearchbtn);
                } else if (searchbackgo.equalsIgnoreCase("Back")) {
                    clickWebdriver(attributeName_xpath, ASR_BackBtn);
                } else if (searchbackgo.equalsIgnoreCase("Go")) {
                    clickWebdriver(attributeName_xpath, ASR_GoBtn);
                    waitForPageToLoad();

                } else if (searchbackgo.equalsIgnoreCase("GO_OLIVE")) {
                    clickWebdriver(attributeName_xpath, ASR_GoBtn);
                    waitForPageToLoad();
                    sleep(10);
                    clickWebdriver(attributeName_xpath,"//td/label/a[contains(text(),'OLIVE')]");

                }
            }
        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }

    }

}


