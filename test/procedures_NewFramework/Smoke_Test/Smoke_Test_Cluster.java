package procedures_NewFramework.Smoke_Test;

import processor.SmokeTestFunctions.*;
import or.OR;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class Smoke_Test_Cluster extends CommonSeleniumActions implements OR {


    protected A_SmokeTestPreliminaryFunctions smokeTestPreliminaryFunctions;
    protected B_SmokeTestCommon smokeTestCommon;

    protected C_Urls_Verfiy Urls_Verfiy;
    protected D_CreateNew_account CreateNew_account;

    protected E_CreateNew_account_Classic_version CreateNew_account_Classic_version;


    String shouldScriptBeFailed = "";

    String shouldScriptBeContinuedFurtherOnInstance = "";


    @Test
    public void Smoke_Test_Cluster() {
        try {
            writeDetails(); // Details of the procedure - name, its parameters etc. - are being written to the output

            //

            Reporter.log("Inside the procedure Smoke_Test_Cluster'");

            String[] data = datacontainer;
            String _SmokeTestParameters_Cluster = data[0];


            String strExceptionMessage;
            // String strAddExtInputFile;
            String strInputExcelFile;
            String strSheetName;
            Integer intNumberOfRows = 0;
            String[][] strInputValuesArray = null;
            String strEnvironment;
            String strClientId = null;
            String ayAdminUsername;
            String runWithAY = "Yes";
            String ayAdminPassword;
            String ayApplicationPackage;
            String BR_Triggering;
            String strAYWebCenterUrl = null;
            Integer intInputValuesArrayIndex;
            String strARAdminUrl = null;
            String urlverify;
            String Ay_app_creation;
            String strVerifyBuildNumber;
            String urlImport = null;
            String urlExport = null;
            String urlIClassService = null;
            String ay_applictionurl = null;
            String AY_App_creation_Classic;
            String ay_application_classicurl = null;
            String Dynamic_section;


            String concludingTextPrintedInResults;

            String newContentDocName = ""; // This would be used both in a 'Content' function as well in the 'Manual Verification Email' at the end.  That is why it is initialized here

            intInputValuesArrayIndex = 0;

            smokeTestPreliminaryFunctions = new A_SmokeTestPreliminaryFunctions();
            smokeTestCommon = new B_SmokeTestCommon();
            Urls_Verfiy = new C_Urls_Verfiy();
            CreateNew_account = new D_CreateNew_account();
            CreateNew_account_Classic_version = new E_CreateNew_account_Classic_version();


            strInputExcelFile = "C:/SeleniumScripts/AYQAAutomation/lib/Smoke_Test/_Smoke Test Parameters_Cluster.xls";

            strSheetName = "Sheet1";

            Reporter.log("About to read the number of rows of the 'input' excel");
            intNumberOfRows = A_SmokeTestPreliminaryFunctions.getRowsOfExcel(strInputExcelFile, strSheetName) - 1; //-1 is for the header
            writeMessageInBold("Number of rows of input excel - '" + intNumberOfRows + "'");

            Reporter.log("About to read the entire contents of the 'input' excel");
            strInputValuesArray = A_SmokeTestPreliminaryFunctions.readAllRowsOfExcel(strInputExcelFile, strSheetName);

            Reporter.log("About to loop through the rows of the 'input' excel");
            for (int intInputExcelRowCounter = 1; intInputExcelRowCounter <= intNumberOfRows; intInputExcelRowCounter++, intInputValuesArrayIndex++) {
                // This is for giving some empty line spaces in the report
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");

                //writeMessageInRedBold("Row Number - '" + intInputExcelRowCounter + "'");

                strEnvironment = strInputValuesArray[intInputValuesArrayIndex][0].toLowerCase();
                Reporter.log("Environment - '" + strEnvironment + "'");

                strClientId = strInputValuesArray[intInputValuesArrayIndex][1].toLowerCase();
                Reporter.log("WC ClientId - '" + strClientId + "'");

                ayAdminUsername = strInputValuesArray[intInputValuesArrayIndex][2];
                Reporter.log("ayAdminUsername - '" + ayAdminUsername + "'");

                ayAdminPassword = strInputValuesArray[intInputValuesArrayIndex][3];
                Reporter.log("ayAdminPassword - '" + ayAdminPassword + "'");


//
                //   runWithAY = strInputValuesArray[intInputValuesArrayIndex][5];
                // Reporter.log("Execute Smoke test with AY integration - '" + runWithAY + "'");

                urlverify = strInputValuesArray[intInputValuesArrayIndex][4];
                Reporter.log("verifying accessible of urls - '" + urlverify + "'");

                Ay_app_creation = strInputValuesArray[intInputValuesArrayIndex][5];
                Reporter.log("verifying accessible of urls - '" + Ay_app_creation + "'");

                strVerifyBuildNumber = strInputValuesArray[intInputValuesArrayIndex][6];
                Reporter.log("Verify Build Number - '" + strVerifyBuildNumber + "'");

                AY_App_creation_Classic = strInputValuesArray[intInputValuesArrayIndex][7];
                Reporter.log("AY_App_creation_Classic - '" + AY_App_creation_Classic + "'");

                Dynamic_section = strInputValuesArray[intInputValuesArrayIndex][8];
                Reporter.log("ayDynamic_section - '" + Dynamic_section + "'");

                BR_Triggering = strInputValuesArray[intInputValuesArrayIndex][9];
                Reporter.log("ay_BR_Triggering - '" + BR_Triggering + "'");


                //Ay_app_creation

                String strRun = "YES";
                if (strRun.equalsIgnoreCase("Yes")) {
                    Reporter.log("About to operate on the row as 'Run' = 'Yes'");

                    if (strEnvironment.equalsIgnoreCase("sjc") || strEnvironment.equalsIgnoreCase("US Prod")) {
                        Reporter.log("Environment is 'sjc'");
                        strARAdminUrl = "https://ar.applyyourself.com/admin";
                        strAYWebCenterUrl = "https://webcenter.applyyourself.com";
                        sleep(100);

                    } else if (strEnvironment.equalsIgnoreCase("lhr")) {
                        Reporter.log("Environment is 'lhr'");
                        strARAdminUrl = "https://ar.askadmissions.co.uk/Admin";
                        strAYWebCenterUrl = "https://webcentre.askadmissions.co.uk/";

                    } else if (strEnvironment.equalsIgnoreCase("sjcqa")) {
                        Reporter.log("Environment is 'sjcqa'");
                        strARAdminUrl = "https://arqa.applyyourself.com/admin";

                        strAYWebCenterUrl = "https://qawebcenter.applyyourself.com/";

                        urlImport = "https://qaimport.applyyourself.com/aydatatransferws.asmx";
                        urlExport = "https://qaexport.applyyourself.com/aydatatransferws.asmx";
                        urlIClassService = "https://qaayws.applyyourself.com/IClassService.svc";
                        ay_applictionurl = "https://qaapp.applyyourself.com/?id=ayauto";
                        ay_application_classicurl = "https://qaapp.applyyourself.com/?id=ayauto&facelift=false";

                    } else if (strEnvironment.equals("iadqa")) {
                        Reporter.log("Environment is 'iadqa'");
                    } else if (strEnvironment.equals("devqa")) {
                        Reporter.log("Environment is 'devqa'");
                    } else if (strEnvironment.equals("lhrqa")) {
                        Reporter.log("Environment is 'lhrqa'");
                        strARAdminUrl = "https://arqa.askadmissionsqa.co.uk/admin";
                        strAYWebCenterUrl = "https://uatwebcenter.askadmissionsqa.co.uk/";


                    } else if (strEnvironment.equals("stable")) {
                        Reporter.log("Environment is 'stable'");

                    } else {
                        Reporter.log("Environment, which is '" + strEnvironment + "', did not match any of the 'environments' put in 'if' conditions");
                        strARAdminUrl = "https://ar.applyyourself.com/admin";
                        strAYWebCenterUrl = "https://webcenter.applyyourself.com";


                    }


                    Reporter.log("ARAdminUrl - " + strARAdminUrl);

                    Reporter.log("AYWebCenterUrl - " + strAYWebCenterUrl);
                    Reporter.log("ay_application_classicurl - " + ay_application_classicurl);


                    String ApplicationPck = "Select a System;Application System;" + Dynamic_section;
                    String Imports = "Imports;Run Import";
                    String file = "C:/SeleniumScripts/ARQAAutomation/Input/SmokeTest/Data/ImportData.txt";
                    String template = "SmokeTestTemplate";
                    String ApplicatFirstName = "";
                    ApplicatFirstName = "Aut" + globalCurrentDateAndTime;
                    Reporter.log("Contact First Name - '" + ApplicatFirstName + "'");
                    String nameToClick = ApplicatFirstName + ", SMOKE";

                    try {
                        writeMessageInBold("About to navigate to 'Admin' and log in");
                        //smokeTestCommon.aRSchooLogin(arSchoolId,strARSchoolUrl, strSchoolUserName, strSchoolPassword);
                        //  smokeTestCommon.aRAdminLogin(strAYESId,strARAdminUrl,arAdminUsername,arAdminPassword);

                    } catch (Exception e) {
                        // After 'login', the application attempts to handle the 'Change Password'
                        // page.  There might be an exception in that page also [the exception
                        // need not come from the 'Login' page alone but if the exception comes
                        // from the 'Login' page, there may not be a point in proceeding further]
                        strExceptionMessage = e.getLocalizedMessage();
                        writeFailure(strExceptionMessage);
                    } finally {
                        // Every mismatch in the function would be recorded in the report via. the
                        // 'writeFailure' function.  In the 'writeFailure' function, each of the
                        // mismatches would be appended to the 'global variable',
                        // 'globalFailureNotification'.  The consolidated list of failure(s),
                        // which would be present in 'globalFailureNotification', would be written
                        // as a table in 'Red' color.  After writing the failure(s), the
                        // 'globalFailureNotification' variable would again be set to "empty" to
                        // facilitate collection of failure(s) in other functions
                        if (globalFailureNotification.equals("")) {
                            Reporter.log("'globalFailureNotification' is empty");
                        } else {
                            Reporter.log("'globalFailureNotification' is not empty");
                            writeConsolidatedFailuresAsTable(globalFailureNotification);
                            // After writing the failures in a table, the
                            // 'globalFailureNotification' variable is set to "empty"
                            globalFailureNotification = "";
                            // We are also updating the value of the variable 'shouldScriptBeFailed'
                            // to 'Yes' to allow the script decide at the end whether or not to
                            // fail the procedure [Even a single error present in the entire
                            // script would cause the procedure to be failed]
                            shouldScriptBeFailed = "Yes";

                            // At times, the 'login' page of an instance
                            // itself might not be working
                            // In that case, as there may not be a point in continuing with the other functions in that
                            // instance, we would stop the script from proceeding further on that instance using
                            // the below variable
                            Reporter.log("About to update 'shouldScriptBeContinuedFurtherOnInstance' as 'No'");
                            shouldScriptBeContinuedFurtherOnInstance = "No";
                        }
                    }


                    //accessing url


                    //end

                    // 'Five' blank lines after each function in an attempt to facilitate
                    // better readability


                    // At times, the 'login' page of an instance [For example, 'https://iad05.askadmissions.net/admin']
                    // itself might not be working
                    // In that case, the variable 'shouldScriptBeContinuedFurtherOnInstance' would have been updated as 'No'
                    // in the 'login' portion
                    if (shouldScriptBeContinuedFurtherOnInstance.equals("No")) {
                        //writeMessageInRedBold("Instance was not proceeded further as 'shouldScriptBeContinuedFurtherOnInstance' was set as 'No'");
                        shouldScriptBeContinuedFurtherOnInstance = ""; // is being re-initialized to 'blank'
                    } else {
                        Reporter.log("'shouldScriptBeContinuedFurtherOnInstance' is blank and hence continuing further");

                        //run with external system as AY


                        //verify url accessible
                        if (urlverify.equalsIgnoreCase("Yes")) {
                            try {
                                // This is for giving some empty line spaces in the report
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");

                                writeMessageInBold("About to verify URLS'");

                                Urls_Verfiy.AY_urls_verify(urlImport, urlExport, urlIClassService);

                            } catch (Exception e) {
                                strExceptionMessage = e.getLocalizedMessage();
                                writeFailure(strExceptionMessage);
                            } finally {
                                // Every mismatch in the function would be recorded in the report via. the
                                // 'writeFailure' function.  In the 'writeFailure' function, each of the
                                // mismatches would be appended to the 'global variable',
                                // 'globalFailureNotification'.  The consolidated list of failure(s),
                                // which would be present in 'globalFailureNotification', would be written
                                // as a table in 'Red' color.  After writing the failure(s), the
                                // 'globalFailureNotification' variable would again be set to "empty" to
                                // facilitate collection of failure(s) in other functions
                                if (globalFailureNotification.equals("")) {
                                    Reporter.log("'globalFailureNotification' is empty");
                                } else {
                                    Reporter.log("'globalFailureNotification' is not empty");
                                    writeConsolidatedFailuresAsTable(globalFailureNotification);
                                    // After writing the failures in a table, the 'globalFailureNotification' variable is set to "empty"
                                    globalFailureNotification = "";
                                    // We are also updating the value of the variable 'shouldScriptBeFailed'
                                    // to 'Yes' to allow the script decide at the end whether or not to
                                    // fail the procedure [Even a single error present in the entire
                                    // script would cause the procedure to be failed]
                                    shouldScriptBeFailed = "Yes";
                                }
                            }
                        } else {
                            // This is for giving some empty line spaces in the report
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");

                            writeMessageInBold("Skipped 'Verify' = '" + urlverify + "'");
                            Reporter.log("");
                            Reporter.log("");
                        }

                        //ay_app_creation facelift
                        if (Ay_app_creation.equalsIgnoreCase("Yes")) {

                            writeMessageInBold("About to create Account in application'");
                            try {
                                // This is for giving some empty line spaces in the report
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");


                                CreateNew_account.AY_App_creation(ay_applictionurl);

                            } catch (Exception e) {
                                strExceptionMessage = e.getLocalizedMessage();
                                writeFailure(strExceptionMessage);
                            } finally {
                                // Every mismatch in the function would be recorded in the report via. the
                                // 'writeFailure' function.  In the 'writeFailure' function, each of the
                                // mismatches would be appended to the 'global variable',
                                // 'globalFailureNotification'.  The consolidated list of failure(s),
                                // which would be present in 'globalFailureNotification', would be written
                                // as a table in 'Red' color.  After writing the failure(s), the
                                // 'globalFailureNotification' variable would again be set to "empty" to
                                // facilitate collection of failure(s) in other functions
                                if (globalFailureNotification.equals("")) {
                                    Reporter.log("'globalFailureNotification' is empty");
                                } else {
                                    Reporter.log("'globalFailureNotification' is not empty");
                                    writeConsolidatedFailuresAsTable(globalFailureNotification);
                                    // After writing the failures in a table, the 'globalFailureNotification' variable is set to "empty"
                                    globalFailureNotification = "";
                                    // We are also updating the value of the variable 'shouldScriptBeFailed'
                                    // to 'Yes' to allow the script decide at the end whether or not to
                                    // fail the procedure [Even a single error present in the entire
                                    // script would cause the procedure to be failed]
                                    shouldScriptBeFailed = "Yes";
                                }
                            }
                        } else {
                            // This is for giving some empty line spaces in the report
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");

                            writeMessageInBold("Skipped 'Import' as 'PerformImport' = '" + Ay_app_creation + "'");
                        }

                        // Verify Build Number
                        // The 'Build Number' need not be verified in the 'Daily' run
                        if (strVerifyBuildNumber.equalsIgnoreCase("No")) {
                            Reporter.log("'strVerifyBuildNumber' is 'No' and hence not verifying build number");
                        } else {
                            Reporter.log("'strVerifyBuildNumber' is not 'No' and hence about to verify build number");
                            try {
                                // This is for giving some empty line spaces in the report
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");

                                writeMessageInBold("About to verify the 'Build Number' of the application");
                                smokeTestCommon.verifyBuildNumber(strVerifyBuildNumber);
                            } catch (Exception e) {
                                strExceptionMessage = e.getLocalizedMessage();
                                writeFailure(strExceptionMessage);
                            } finally {
                                // Every mismatch in the function would be recorded in the report via. the
                                // 'writeFailure' function.  In the 'writeFailure' function, each of the
                                // mismatches would be appended to the 'global variable',
                                // 'globalFailureNotification'.  The consolidated list of failure(s),
                                // which would be present in 'globalFailureNotification', would be written
                                // as a table in 'Red' color.  After writing the failure(s), the
                                // 'globalFailureNotification' variable would again be set to "empty" to
                                // facilitate collection of failure(s) in other functions
                                if (globalFailureNotification.equals("")) {
                                    Reporter.log("'globalFailureNotification' is empty");
                                } else {
                                    Reporter.log("'globalFailureNotification' is not empty");
                                    writeConsolidatedFailuresAsTable(globalFailureNotification);
                                    // After writing the failures in a table, the 'globalFailureNotification' variable is set to "empty"
                                    globalFailureNotification = "";
                                    // We are also updating the value of the variable 'shouldScriptBeFailed'
                                    // to 'Yes' to allow the script decide at the end whether or not to
                                    // fail the procedure [Even a single error present in the entire
                                    // script would cause the procedure to be failed]
                                    shouldScriptBeFailed = "Yes";
                                }
                            }
                        }
                        //ay-app-creation classic version
                        if (AY_App_creation_Classic.equalsIgnoreCase("Yes")) {

                            writeMessageInBold("About to create Account in application'");
                            try {
                                // This is for giving some empty line spaces in the report
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");


                                CreateNew_account_Classic_version.AY_App_creation_Classic(ay_application_classicurl);

                            } catch (Exception e) {
                                strExceptionMessage = e.getLocalizedMessage();
                                writeFailure(strExceptionMessage);
                            } finally {
                                // Every mismatch in the function would be recorded in the report via. the
                                // 'writeFailure' function.  In the 'writeFailure' function, each of the
                                // mismatches would be appended to the 'global variable',
                                // 'globalFailureNotification'.  The consolidated list of failure(s),
                                // which would be present in 'globalFailureNotification', would be written
                                // as a table in 'Red' color.  After writing the failure(s), the
                                // 'globalFailureNotification' variable would again be set to "empty" to
                                // facilitate collection of failure(s) in other functions
                                if (globalFailureNotification.equals("")) {
                                    Reporter.log("'globalFailureNotification' is empty");
                                } else {
                                    Reporter.log("'globalFailureNotification' is not empty");
                                    writeConsolidatedFailuresAsTable(globalFailureNotification);
                                    // After writing the failures in a table, the 'globalFailureNotification' variable is set to "empty"
                                    globalFailureNotification = "";
                                    // We are also updating the value of the variable 'shouldScriptBeFailed'
                                    // to 'Yes' to allow the script decide at the end whether or not to
                                    // fail the procedure [Even a single error present in the entire
                                    // script would cause the procedure to be failed]
                                    shouldScriptBeFailed = "Yes";
                                }
                            }
                        } else {
                            // This is for giving some empty line spaces in the report
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");

                            writeMessageInBold("Skipped 'Import' as 'PerformImport' = '" + AY_App_creation_Classic + "'");
                        }


                        if (Dynamic_section.equalsIgnoreCase("No")) {
                            Reporter.log("'Dynamic_section' is 'No' and hence not running");
                        } else {
                            Reporter.log("'Dynamic_section' is not 'No' and hence about to run");
                            try {
                                // This is for giving some empty line spaces in the report
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");

                                writeMessageInBold("About to create Dynamic_section Webcenter");
                                //smokeTestCommon.aRAdminLogin(strAYESId,strARAdminUrl,arAdminUsername,arAdminPassword);
                                //smokeTestCommon.logoutARAdmin();
                                smokeTestCommon.aYWebcenterLogin(strAYWebCenterUrl, strClientId, ayAdminUsername, ayAdminPassword);
                                smokeTestCommon.Dynamic_section();
                                smokeTestCommon.logoutAYWebCenter();
                                smokeTestCommon.ayapplication_login(ay_applictionurl);
                                smokeTestCommon.verify_Dynamic_section_application();
                                smokeTestCommon.AY_Application_logout();
                                smokeTestCommon.aYWebcenterLogin(strAYWebCenterUrl, strClientId, ayAdminUsername, ayAdminPassword);
                                smokeTestCommon.Dynamic_section_delete();
                                smokeTestCommon.logoutAYWebCenter();


                                smokeTestCommon.generateCsvFile(ApplicatFirstName, file);


                            } catch (Exception e) {
                                strExceptionMessage = e.getLocalizedMessage();
                                writeFailure(strExceptionMessage);
                            } finally {
                                // Every mismatch in the function would be recorded in the report via. the
                                // 'writeFailure' function.  In the 'writeFailure' function, each of the
                                // mismatches would be appended to the 'global variable',
                                // 'globalFailureNotification'.  The consolidated list of failure(s),
                                // which would be present in 'globalFailureNotification', would be written
                                // as a table in 'Red' color.  After writing the failure(s), the
                                // 'globalFailureNotification' variable would again be set to "empty" to
                                // facilitate collection of failure(s) in other functions
                                if (globalFailureNotification.equals("")) {
                                    Reporter.log("'globalFailureNotification' is empty");
                                } else {
                                    Reporter.log("'globalFailureNotification' is not empty");
                                    writeConsolidatedFailuresAsTable(globalFailureNotification);
                                    // After writing the failures in a table, the 'globalFailureNotification' variable is set to "empty"
                                    globalFailureNotification = "";
                                    // We are also updating the value of the variable 'shouldScriptBeFailed'
                                    // to 'Yes' to allow the script decide at the end whether or not to
                                    // fail the procedure [Even a single error present in the entire
                                    // script would cause the procedure to be failed]
                                    shouldScriptBeFailed = "Yes";
                                }
                            }
                        }
                           //about verify Business rules

                        if (BR_Triggering.equalsIgnoreCase("Yes")) {
                            try {
                                // This is for giving some empty line spaces in the report
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");
                                Reporter.log("");

                                writeMessageInBold("About to verify BR_Triggering'");

                                smokeTestCommon.aYWebcenterLogin(strAYWebCenterUrl, strClientId, ayAdminUsername, ayAdminPassword);
                                smokeTestCommon.BR_Triggering();
                                smokeTestCommon.logoutAYWebCenter();
                                smokeTestCommon.ayapplication_login(ay_applictionurl);
                                smokeTestCommon.Verify_BR_Triggering_application();
                                smokeTestCommon.AY_Application_logout();
                                smokeTestCommon.aYWebcenterLogin(strAYWebCenterUrl, strClientId, ayAdminUsername, ayAdminPassword);
                                smokeTestCommon.Wc_Delete_BR_Triggering();
                                smokeTestCommon.logoutAYWebCenter();





                            } catch (Exception e) {
                                strExceptionMessage = e.getLocalizedMessage();
                                writeFailure(strExceptionMessage);
                            } finally {
                                // Every mismatch in the function would be recorded in the report via. the
                                // 'writeFailure' function.  In the 'writeFailure' function, each of the
                                // mismatches would be appended to the 'global variable',
                                // 'globalFailureNotification'.  The consolidated list of failure(s),
                                // which would be present in 'globalFailureNotification', would be written
                                // as a table in 'Red' color.  After writing the failure(s), the
                                // 'globalFailureNotification' variable would again be set to "empty" to
                                // facilitate collection of failure(s) in other functions
                                if (globalFailureNotification.equals("")) {
                                    Reporter.log("'globalFailureNotification' is empty");
                                } else {
                                    Reporter.log("'globalFailureNotification' is not empty");
                                    writeConsolidatedFailuresAsTable(globalFailureNotification);
                                    // After writing the failures in a table, the 'globalFailureNotification' variable is set to "empty"
                                    globalFailureNotification = "";
                                    // We are also updating the value of the variable 'shouldScriptBeFailed'
                                    // to 'Yes' to allow the script decide at the end whether or not to
                                    // fail the procedure [Even a single error present in the entire
                                    // script would cause the procedure to be failed]
                                    shouldScriptBeFailed = "Yes";
                                }
                            }
                        } else {
                            // This is for giving some empty line spaces in the report
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");

                            writeMessageInBold("Skipped 'Verify' = '" + urlverify + "'");
                            Reporter.log("");
                            Reporter.log("");
                        }

                        //Concluding function

                        try {
                            // This is for giving some empty line spaces in the report
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");
                            Reporter.log("");


                        } catch (Exception e) {
                            strExceptionMessage = e.getLocalizedMessage();
                            writeFailure(strExceptionMessage);
                        } finally {
                            // Every mismatch in the function would be recorded in the report via. the
                            // 'writeFailure' function.  In the 'writeFailure' function, each of the
                            // mismatches would be appended to the 'global variable',
                            // 'globalFailureNotification'.  The consolidated list of failure(s),
                            // which would be present in 'globalFailureNotification', would be written
                            // as a table in 'Red' color.  After writing the failure(s), the
                            // 'globalFailureNotification' variable would again be set to "empty" to
                            // facilitate collection of failure(s) in other functions
                            if (globalFailureNotification.equals("")) {
                                Reporter.log("'globalFailureNotification' is empty");
                            } else {
                                Reporter.log("'globalFailureNotification' is not empty");
                                writeConsolidatedFailuresAsTable(globalFailureNotification);
                                // After writing the failures in a table, the 'globalFailureNotification' variable is set to "empty"
                                globalFailureNotification = "";
                                // We are also updating the value of the variable 'shouldScriptBeFailed'
                                // to 'Yes' to allow the script decide at the end whether or not to
                                // fail the procedure [Even a single error present in the entire
                                // script would cause the procedure to be failed]
                                shouldScriptBeFailed = "Yes";
                            }
                        }
                    }

                    //THIS CLASS END
                } else {
                    // This is for giving some empty line spaces in the report
                    Reporter.log("");
                    Reporter.log("");
                    Reporter.log("");
                    Reporter.log("");
                    Reporter.log("");

                    writeMessageInBold("Skipped row as 'Run' = '" + strRun + "'");
                }
            }
        } catch (Exception e) {
            //Reporter.log("shouldScriptBeFailed in exception = '" + shouldScriptBeFailed + "'");

            String failureMessage = e.getLocalizedMessage();
            writeFailure(failureMessage);
            shouldScriptBeFailed = "Yes";
        } finally {
            //Reporter.log("shouldScriptBeFailed in finally = '" + shouldScriptBeFailed + "'");

            // An 'Assert.fail' statement would cause the script to fail but it would also stop the
            // script from executing further.  Instead of failing a script (with the 'Assert.fail'
            // statement) even for a single mismatch, we are failing it once at its end.  Even a
            // single failure in any of the functions would cause the variable
            // 'shouldScriptBeFailed' to be updated to 'Yes'
            // We are failing the entire script if 'shouldScriptBeFailed' is equal to 'Yes'
            if (shouldScriptBeFailed.equals("Yes")) {
                // This is for giving some empty line spaces in the report
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");
                Reporter.log("");

                Reporter.log("One or more failures present in the 'Smoke Test' script as 'shouldScriptBeFailed' is 'Yes'");
                Assert.fail("One or more failure(s) present in the 'Smoke Test' script");
            } else {
                Reporter.log("No failures present in the 'Smoke Test' script as 'shouldScriptBeFailed' is not 'Yes'");
            }
        }
    }

}

