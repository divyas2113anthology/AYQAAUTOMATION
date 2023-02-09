package processor.SmokeTestFunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import or.OR;
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import processor.CommonSeleniumActions;

public class SmokeTest extends CommonSeleniumActions implements OR {
    @Test(description = "This Procedure is to perform some Operation in 'Account Profile' page")
    public static void main(String[] args) {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://qaapp.applyyourself.com/common/fl_ApplicantLogout.asp?CID=111&ID=ayauto&d=12%2F7%2F2022+4%3A09%3A06+AM&AYID=77D1AD6-A059-49BB-A34C-638BF5873BB");

            driver.manage().window().maximize();
            driver.findElement(By.xpath("//*[@id=\"ay-login\"]")).sendKeys("35W7T26L3SK3");
            driver.findElement(By.xpath("//*[@id=\"ay-password\"]")).sendKeys("Auto123+");
            driver.findElement(By.xpath("//*[@id=\"ay-loginSubmit\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"Profile\"]/li")).click();

            WebElement element =driver.findElement(By.xpath(upaupdatebtn1));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click()",element);




        } catch (Exception e) {
            writeFailure(e.getLocalizedMessage());
        }
    }


}