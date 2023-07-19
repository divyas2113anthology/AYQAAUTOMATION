package procedures_NewFramework.AYSmoke.Webcenter.WC_EnrollmentPackage.WC_EnrollmentDetails;

import org.testng.Reporter;
import org.testng.annotations.Test;

import or.OR;
import processor.CommonSeleniumActions;

public class WC_EnrollmentDetails_Input extends CommonSeleniumActions implements OR {

    @Test(description = "This Procedure is used to perform some operation in 'Enrollment Details' page")
    public void WC_EnrollmentDetails_Input() {
        try {
            writeDetails();
            Reporter.log("Proceed to retrieve Input Test Data for 'Enrollment Details' Page");
            String[] testdata = datacontainer;
            String subscriptionstatus = testdata[0];
            String attend = testdata[1];
            String firstname = testdata[2];
            String lastname = testdata[3];
            String sayno = testdata[4];
            String livein = testdata[5];
            String mychoice = testdata[6];
            String buttons = testdata[7];
            String closeproceed = testdata[8];
            Reporter.log("Input Test Data was retrieved for 'Enrollment Details' Page");
//			writeFailure("Given Test Data["+yesno+"] either Incorrect or has not be Scripted ");
            if (!subscriptionstatus.equals("")) {
                Reporter.log("Step 1 - Click the Subscription Status as [" + subscriptionstatus + "]");
                clickWebdriver(attributeName_xpath, "//a[text()='" + subscriptionstatus + "']");
            }
            if (!attend.equals("")) {
                Reporter.log("Step 2 - Select the attend as [" + attend + "]");
                if (attend.equalsIgnoreCase("Yes")) {
                    clickWebdriver(attributeName_xpath, "//input[@value='Y']");
                }
                if (attend.equalsIgnoreCase("No")) {
                    clickWebdriver(attributeName_xpath, "//input[@value='N']");
                }
            }
            if (!firstname.equals("")) {
                Reporter.log("Step 3 - Enter the First Name as [" + firstname + "]");
                String FirstName = getElementIDbyLabel("First name", "//input[@id='q24474']");
                sendKeys(attributeName_xpath, FirstName, firstname);
            }
            if (!lastname.equals("")) {
                Reporter.log("Step 4 - Enter the Last Name as [" + lastname + "]");
                String LastName = getElementIDbyLabel("Last Name", "//input[@id='q24475']");
                sendKeys(attributeName_xpath, LastName, lastname);

            }
            if (!sayno.equals("")) {
                Reporter.log("Step 5 - Enter the details as [" + sayno + "]");
                String SayNo = getElementIDbyLabel("Why did you say NO?", "//input[@id='q24476']");
                sendKeys(attributeName_xpath, SayNo, sayno);
            }
            if (!livein.equals("")) {
                Reporter.log("Step 6 - Select the LiveIn as [" + livein + "]");
                String SayNo = getElementIDbyLabel("Why did you say NO?", "//input[@id='q24476']");
                sendKeys(attributeName_xpath, SayNo, sayno);
            }

            if (!mychoice.equals("")) {

            }

            if (!buttons.equals("")) {
                if (buttons.equalsIgnoreCase("Enrollments-DT fee")) {
                    Reporter.log("Click the button as [" + buttons + "]");
                    waitForElementPresentWebdriver(attributeName_xpath, "//span[text()='Enrollments-DT fee']", buttons);
                    clickWebdriverWithCoordinates(attributeName_xpath, "//span[text()='Enrollments-DT fee']");
                    recentPopupSelectWebdriver("Enrollment-DT Fee Status");
                } else {
                    Reporter.log("Click the button as [" + buttons + "]");
                   waitForElementPresentWebdriver(attributeName_xpath, SR_button + buttons + "')]", buttons);
                    clickWebdriverWithCoordinates(attributeName_xpath, SR_button + buttons + "')]");

                     try {
                        alertAccept();
                    } catch (Exception e) {
                        System.out.println("No alert");
                    }
                }

                waitForPageToLoadWebdriver();
            }
            if (!closeproceed.equals("")) {
                Reporter.log("Click the button as [" + closeproceed + "]");
                if (closeproceed.equalsIgnoreCase("proceed to submission")) {
//					clickWebdriver(attributeName_xpath, EPI_ProToSubBtn);
                    waitForElementPresentWebdriver(attributeName_xpath, EPI_ProToSubBtn, "Proceed Submission");
                    clickWebdriverWithCoordinates(attributeName_xpath, EPI_ProToSubBtn);
                    waitForElementPresentWebdriver(attributeName_xpath, QAE_Message, "Success message");
//					waitForPageToLoadWebdriver();
                } else if (closeproceed.equalsIgnoreCase("Close Window")) {
                    recentPopupCloseWebdriver();
                    //	selectMainWindowWebdriver();
                    //clickWebdriver(attributeName_xpath, "//img[contains(@src,'close_window_large')]");
                    //System.out.println("CLicked on Close button");
                    //recentPopupCloseWebdriver();
                    //selectMainWindowWebdriver();
                }
            }
        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }
    }
}
