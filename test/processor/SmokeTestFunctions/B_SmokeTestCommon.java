package processor.SmokeTestFunctions;

import com.opencsv.CSVWriter;
import or.OR;

import org.testng.Reporter;
import processor.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class B_SmokeTestCommon extends CommonSeleniumActions implements OR{


    public void aYWebcenterLogin(String strAYWebCenterUrl,String arSchoolId,String ayAdminUsername,String ayAdminPassword) throws Exception {
        writeMessageInBold("Function Name - 'loginAdmin'.  Parameters - Admin URL - '" + strAYWebCenterUrl + "', Username - '" + ayAdminUsername + "' and Password - '" + ayAdminPassword + "'");

        get(strAYWebCenterUrl);
        waitForPageToLoadWebdriver();


        Reporter.log("Waiting till either the 'Login' page or the 'Home' page gets loaded");
        int counter = 0;
        String result = "";
        do {
            waitTimeImplicit(5);
            counter = counter + 1;
            if (isElementPresentWebdriver(attributeName_cssselector,WCL_ClientID)) {
                Reporter.log("'Login' page displayed");
                result = "loginPageDisplayed";
            }else if (isElementPresentWebdriver(attributeName_cssselector,WCL_Logout)) {
                Reporter.log("'Welcome' page displayed");
                result = "homePageDisplayed";
            }else {
                // if neither the 'Login' page nor the 'Home' page is present, we are checking if the 'wait time' (represented by the 'counter' variable
                // had got past the 'paramWaitSeconds' seconds)
                if (counter > 10) {
                    writeFailure("Neither the 'Login' page nor the 'Home' page was displayed even after '" + counter + "' seconds");
                    result = "TimeElapsed";
                }
            }
        } while (result.equals(""));

        if (result.equalsIgnoreCase("loginPageDisplayed")) {
            Reporter.log("result = 'loginPageDisplayed'");

            Reporter.log("'Login username is displayed");
            sendKeys(attributeName_cssselector,WCL_ClientID, arSchoolId);
            sendKeys(attributeName_cssselector,WCL_UserID,ayAdminUsername );
            sendKeys(attributeName_cssselector,WCL_Password, ayAdminPassword);
            Reporter.log("About to click login button ");
            sleep(10);
            clickWebdriver(attributeName_xpath,WCL_Go);
            waitForPageToLoadWebdriver();

//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_mnuSelMod\"]");
//
//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_mnuAdm\"]");
//
//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_oMenu4\"]");

//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_mnuAddApp\"]");
//
//            clickWebdriverWithCoordinates(attributeName_xpath,"//*[@id=\"oMenu_oMenu3\"]");




            waitForElementPresentWebdriverWait(attributeName_cssselector,WCL_Logout,"Welcome");
            // At this point, the 'Home' page should be displayed
            if (isElementPresentWebdriver(attributeName_cssselector,WCL_Logout)) {
                Reporter.log("'Welcome' page display");
            }else {
                writeFailure("'Home' tab not present.  There might be an error after login");
            }
        }




        Reporter.log("End of the 'loginAdmin' function");
    }

    public void generateCsvFile(String FirstName,String filename) throws IOException {
        Reporter.log("Creating a DataImport.txt file  ");
        File file = new File(filename);
        file.delete();

        FileWriter outputfile = new FileWriter(filename);

        CSVWriter writer = new CSVWriter(outputfile, ',',
                CSVWriter.NO_QUOTE_CHARACTER,
                CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                CSVWriter.DEFAULT_LINE_END);

        // create a List which contains String array
        List<String[]> data = new ArrayList<String[]>();

        data.add(new String[] {"SMOKE",FirstName });

        writer.writeAll(data);
        writer.flush();
        writer.close();

        Reporter.log("DataImport.txt file is created ");
    }


    public void logoutAYWebCenter() throws Exception {
        writeMessageInBold("Function Name - 'logoutAdmin'.  Parameters - None");
        if (isElementPresentWebdriver(attributeName_cssselector,WCL_Logout)) {


            clickWebdriver(attributeName_cssselector,WCL_Logout);
            waitForPageToLoadWebdriver();
            waitForElementPresentWebdriver(attributeName_cssselector,WCL_UserID,"Login");

            waitTimeImplicit(5); // a '2-second' wait for a safer side



            if (isElementPresentWebdriver(attributeName_cssselector,WCL_UserID)) {
                Reporter.log("'Login' page displayed on clicking 'Logout'");
            }else {

                writeFailure("Login page was not displayed on clicking 'Logout'");
            }
        }else {
            writeFailure("Function Name - 'logoutAdmin'.  The 'Logout' link not present");
        }

        Reporter.log("End of the 'logoutAdmin' function");

    }

    public void verifyBuildNumber(String paramBuildNumber) throws Exception {
        Reporter.log("Function Name - 'verifyBuildNumber'.  Parameters - Build Number - '" + paramBuildNumber + "'");

        // Since the 'Build Number' would be displayed with a few leading spaces,
        // had verified its value via. the 'verifyTrimmedText' function, which
        // would trim the displayed value before comparing
        String elementLocator = "//div[@class='bottomText']";
        String elementName = "Build Number";
        String expectedText = paramBuildNumber;
        verifyElementPresent(elementLocator,elementName);
        elementLocator.substring(1,11);
        verifyElementTextWebdriver(attributeName_xpath,elementLocator,expectedText,elementName);

    }

   

}

