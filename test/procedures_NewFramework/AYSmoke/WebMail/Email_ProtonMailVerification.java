package procedures_NewFramework.AYSmoke.WebMail;

import or.OR;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// created by saran kumar may 2023
public class Email_ProtonMailVerification extends CommonSeleniumActions implements OR {

    @Test(description = "This Procedure is used to Perform operation and Verification in Received Email in User Account Hobsons")
    public void Email_ProtonMailVerification() {
        try {
            writeDetails();
            Reporter.log("Proceed to retrieve Input and Verify Test Data for 'Protonmail Verification' in Hobsons Account");
            String[] EmailVerify = datacontainer;
            String url = EmailVerify[0];
            String username = EmailVerify[1];

            String password = EmailVerify[2];
            String login = EmailVerify[3];
            String emailsubject = EmailVerify[4];
            String verifycontents = EmailVerify[5];
            String logout = EmailVerify[6];
            String deletemail = EmailVerify[7];
//            String emailsubjectcontains = EmailVerify[6];
//            String personallabel = EmailVerify[7];
//            String passwordlabel = EmailVerify[8];
//            String firstnamelabel= EmailVerify[9];
//            String lastnamelabel = EmailVerify[10];
//            String urlcontainslink = EmailVerify[11];
//            String clicklinkcontains = EmailVerify[12];
//            String logout = EmailVerify[13];

            Reporter.log("Input and Verify  Test Data was retrieved for 'Protonmail Verification'  in Hobsons Account");
            if (!url.equals("")) {
                Reporter.log("Step 1 - Opening the Proton Window");
                get("https://account.proton.me/login");
                sleep(10);
                waitForPageToLoadWebdriver();
            }
            if (!username.equals("")) {
                Reporter.log("Step 2 - Enter UserName");
                waitForElementPresentWebdriver(attributeName_xpath, "//input[@id='username']", "username");
                sendKeys(attributeName_xpath, "//input[@id='username']", username);
                waitForPageToLoadWebdriver();

            }
            if (!password.equals("")) {
                Reporter.log("Step 3 - Enter Password");

                waitForElementPresentWebdriver(attributeName_xpath, "//input[@id='password']", "password");
                sendKeys(attributeName_xpath, "//input[@id='password']", password);

                waitForPageToLoadWebdriver();
            }
            if (!login.equals("")) {
                Reporter.log("Step 4 - Click Log-In Button");
                waitForElementPresentWebdriver(attributeName_xpath, "//button[@type='submit']", "login");
                waitForPageToLoad();
                waitForPageToLoad();
                sleep(20);
                clickWebdriver(attributeName_xpath, "//button[@type='submit']");
                waitForPageToLoadWebdriver();
                sleep(50);

            }
            if (!emailsubject.equals("")) {


                if (emailsubject.equalsIgnoreCase("Rec")) {
                    Reporter.log("Step 5 - rec");
                    waitForPageToLoad();
                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'Reco')])[1]");
                    //*[@id="proton-root"]/div/div/a/b
                    waitForPageToLoad();
                    waitForPageToLoad();
                    sleep(5);
                    scrollDown(driver, 450);

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");
                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(115, 1210);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }
                } else if (emailsubject.equalsIgnoreCase("Welcome to Anthology")) {
                    Reporter.log("Step 5 - rec");
                    waitForPageToLoad();
                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'Welcome to Anthology')])[1]");
                    sleep(5);
                    scrollDown(driver, 450);

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");
                    WebElement element1 = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");


                } else if (emailsubject.equalsIgnoreCase("TestingMailTemplate")) {
                    waitForPageToLoad();
                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'TestingMailTemplate')])[1]");
                    sleep(5);
                    scrollDown(driver, 450);

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");

                } else if (emailsubject.equalsIgnoreCase("account has been")) {
                    waitForPageToLoad();
                    sleep(10);
                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'" + emailsubject + "')])[1]");

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");

                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(250, 850);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "'([^']*)'";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }


                } else if (emailsubject.equalsIgnoreCase("Reminder")) {
                    waitForPageToLoad();
                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'Reco')])[1]");

                    waitForPageToLoad();
                    waitForPageToLoad();
                    sleep(5);
                    scrollDown(driver, 450);

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");
                    waitForPageToLoad();
                    Reporter.log("           ");
                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    waitForPageToLoad();
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(550, 1100);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }

                } else if (emailsubject.equalsIgnoreCase("Applicant First Name")) {
                    waitForPageToLoad();
                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'Reco')])[1]");

                    waitForPageToLoad();
                    waitForPageToLoad();
                    sleep(5);
                    scrollDown(driver, 450);

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");
                    waitForPageToLoad();
                    Reporter.log("           ");
                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    waitForPageToLoad();
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(400, 1100);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }


                } else if (emailsubject.equalsIgnoreCase("Test Smoke")) {
                    waitForPageToLoad();

                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'" + emailsubject + "')])[1]");

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");
                    Reporter.log("           ");
                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    waitForPageToLoad();
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(500, 900);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }





                }


                else if  (emailsubject.equalsIgnoreCase("Event Invitation Email") || emailsubject.equalsIgnoreCase("Thanks for registering"))  {
                    waitForPageToLoad();

                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'" + emailsubject + "')])[1]");

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");
                    Reporter.log("           ");
                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    waitForPageToLoad();
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(100,292);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "'([^']*)'";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }


                }else if (emailsubject.equalsIgnoreCase(emailsubject)){
                    waitForPageToLoad();

                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'" + emailsubject + "')])[1]");

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");
                    Reporter.log("           ");
                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    waitForPageToLoad();
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(200,1100);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "'([^']*)'";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }
                }




            }


            if (!verifycontents.equals("")) {
                if (verifycontents.equalsIgnoreCase("It is important for all new users to attend training in order to learn how to use the system effectively")) {
                    WebElement element1 = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    Reporter.log("About to verify Contents");
                    String text1 = element1.getText();
                    String verifymsg = text1.substring(915, 1023);
                    System.out.println(verifymsg);

                    //    verifyText(verifymsg, "It is important for all new users to attend training in order to learn how to use the system effectively", verifymsg);
                    verifyTextContains(verifymsg, "important", verifymsg);

                } else if (verifycontents.equalsIgnoreCase("Dear")) {
                    Reporter.log("Step 5 - Verify ");
                    waitForPageToLoad();
                    WebElement element1 = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    Reporter.log("About to verify Contents");
                    String text1 = element1.getText();
                    String verifymsg = text1.substring(0, 4);
                    System.out.println(verifymsg);

                    //    verifyText(verifymsg, "It is important for all new users to attend training in order to learn how to use the system effectively", verifymsg);
                    verifyTextContains(verifymsg, "Dear", verifymsg);

                } else if (verifycontents.equalsIgnoreCase("click here")) {
                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(100, 236);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }


                } else if (verifycontents.equalsIgnoreCase("Click Here to Update")) {
                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(220, 390);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }
                } else if (verifycontents.equalsIgnoreCase("Decline")) {
                    clickWebdriver(attributeName_xpath, "(//div[contains(@class,'unread')]//span[contains(text(),'Event Invitation Email')])[1]");

                    clickWebdriver(attributeName_xpath, "//button[@data-testid='message-header-expanded:more-dropdown']");
                    sleep(1);
                    clickWebdriver(attributeName_xpath, "//*[@role='dialog']/div[2]/ul/li[11]/button/span[text()='View HTML']");


                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(100, 236);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }
                } else if (verifycontents.equalsIgnoreCase("click here to access your recommendations")) {

                    WebElement element = driver.findElementByXPath("//div[@data-testid='message-content:body']/pre");
                    Reporter.log("           ");
                    String text = element.getText();
                    String recommendationurl = text.substring(715, 1100);
                    System.out.println("url:" + recommendationurl);
                    String strPattern = "\"([^\"]*)\"";
                    Pattern pattern = Pattern.compile(strPattern);
                    Matcher matcher = pattern.matcher(recommendationurl);
                    while (matcher.find()) {
                        System.out.println(matcher);
                        System.out.println(matcher.group(1));
                        driver.get(matcher.group(1));
                    }

                } else if (verifycontents.equalsIgnoreCase(verifycontents)) {

verifyTextContains(verifycontents,verifycontents,"(//div[contains(@class,'unread')]//span[contains(text(),'" + verifycontents + "')])[1]");
                }


            }


            if (!logout.equals("")) {
                if (logout.equalsIgnoreCase("logout")) {
                    clickWebdriver(attributeName_xpath, "//span[@class='m-auto']");
                    clickWebdriver(attributeName_xpath, "//*[@id='dropdown-36']/div[2]/ul/li[8]/div/button");
                }

            }
            if (!deletemail.equals("")) {
                if (deletemail.equalsIgnoreCase("account has been")) {
                    clickWebdriver(attributeName_xpath, "//input[@data-testid='item-checkbox']");
                    clickWebdriver(attributeName_xpath, "//button[@data-testid='toolbar:movetotrash']");

                }

            }


        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());

        }
    }
}
