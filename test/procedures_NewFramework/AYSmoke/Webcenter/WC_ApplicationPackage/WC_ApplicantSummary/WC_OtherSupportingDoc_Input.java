package procedures_NewFramework.AYSmoke.Webcenter.WC_ApplicationPackage.WC_ApplicantSummary;

import com.thoughtworks.selenium.webdriven.WebDriverBackedSeleniumServlet.*;
import or.OR;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.util.Set;

public class WC_OtherSupportingDoc_Input extends CommonSeleniumActions implements OR {

    @Test(description = "This Procedure is used to perform some input operation in 'Supporting Documents' page")
    public void WC_OtherSupportingDoc_Input() {
        try {
            writeDetails();
            Reporter.log("Proceed to retrieve Input Test Data for 'Supporting Documents' Page");
            String[] testdata = datacontainer;
            String supdocumentname = testdata[0];
            String status = testdata[1];
            String receiveddate = testdata[2];
            String comments = testdata[3];
            String saveclosewindow = testdata[4];
            String delete = testdata[5];//Added by Rahul Mehta on 25th March,2019

            recentPopupSelect_without_window_nameWebdriver();

            Reporter.log("Input Test Data was retrieved for 'Supporting Documents' Page");
            if (!supdocumentname.equals("")) {
                Reporter.log("Verify(" + supdocumentname + ")is present");
                waitForElementPresentWebdriver(attributeName_xpath, AS_SupportingDocumentName, supdocumentname);
                selectByVisibleTextWebdriver(attributeName_xpath, AS_SupportingDocumentName, supdocumentname);
                //verifyElementContainsTextWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, status, status);
            }
            if (!status.equals("")) {
                String Status;
                try {
                    Status = Runtimedataread(status);  //Modified by Rahul Mehta on 13th March, 2019
                    //Added by Rahul Mehta on 14th March 2019
                } catch (Exception e) {
                    Status = status;
                }
                Reporter.log("Verify(" + status + ")is present");
                clickWebdriver(attributeName_xpath, AS_SupportingDocumentStatus);
                waitForPageToLoadWebdriver();
                waitForElementPresentWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, Status);
                selectByVisibleTextWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, Status);
                //selectByVisibleTextWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, Status);
                //verifyElementContainsTextWebdriver(attributeName_xpath, AS_SupportingDocumentStatus, status, status);
            }
            if (!saveclosewindow.equals("")) {

                if (saveclosewindow.equalsIgnoreCase("SaveDefult")) {
                    Reporter.log("Click on the Button" + saveclosewindow);
                    clickWebdriver(attributeName_xpath, "//img[contains(@src,'save')]");
                    waitForPageToLoadWebdriver();
                    switchToDefaultContentWebdriver();

                } else if (saveclosewindow.equalsIgnoreCase("save")) {
                    Reporter.log("Click on the Button" + saveclosewindow);
                    clickWebdriver(attributeName_xpath, AS_SupportingDocCloseWindow + saveclosewindow + "')]");
                    waitForPageToLoadWebdriver();
                    //recentPopupCloseWebdriver();
                    switchToOldWindow();

                    //recentPopupCloseWebdriver();
                    driver.switchTo().window(AppSummaryWindowName);
                }
            }
            if (!delete.equals(""))//Added by Rahul Mehta on 25th March,2019
            {
                if (delete.equalsIgnoreCase("Switchdelete")) {


                    clickWebdriver(attributeName_xpath, "//img[contains(@src,'delete')]");
                    sleep(1);
                    alertAccept();
                    sleep(2);
                    Switchtomainwindow();
//




                } else if (delete.equalsIgnoreCase("")) {

                    clickWebdriver(attributeName_xpath, "//img[contains(@src,'delete')]");
                    sleep(1);
                    alertAccept();
                    sleep(2);
                    driver.switchTo().window(AppSummaryWindowName);
                }
            }

            //switchToDefaultContentWebdriver();
        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }

    }

}
